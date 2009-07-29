package com.intalio.vmware.performance;

import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.UIManager;

import com.intalio.vmware.performance.widgets.StatsTable;
import com.vmware.apputils.AppUtil;
import com.vmware.apputils.OptionSpec;
import com.vmware.vim.ArrayOfPerfCounterInfo;
import com.vmware.vim.DynamicProperty;
import com.vmware.vim.ManagedObjectReference;
import com.vmware.vim.ObjectContent;
import com.vmware.vim.ObjectSpec;
import com.vmware.vim.PerfCompositeMetric;
import com.vmware.vim.PerfCounterInfo;
import com.vmware.vim.PerfEntityMetric;
import com.vmware.vim.PerfEntityMetricBase;
import com.vmware.vim.PerfMetricId;
import com.vmware.vim.PerfMetricIntSeries;
import com.vmware.vim.PerfQuerySpec;
import com.vmware.vim.PropertyFilterSpec;
import com.vmware.vim.PropertySpec;
import com.vmware.vim.RuntimeFault;
import com.vmware.vim.VimPortType;

/**
 * <p>
 * This sample is an ESX-Top-like application that lets administrators specify
 * the CPU and memory counters by name to obtain metrics for a specified host.
 * </p>
 * <p>
 * <b>Parameters:</b>
 * </p>
 * <ul>
 * <li>host Required. Name of the host</li>
 * <li>cpu Required. Name of an available CPU counter from which to obtain a
 * value. For example, "usage," "ready," "guaranteed," and so on.</li>
 * <li>memory Required. Name of an available memory counter from which to obtain
 * a value. For example, "usage," "granted," and so on.</li>
 * </ul>
 * 
 * <p>
 * <b>Command Line:</b>
 * </p>
 * <p>
 * run.bat com.intalio.vmware.performance.VITop --url [webservice url]
 * --username [user] --password [password] --host [FQDN_host_name] --cpu
 * [cpu_counter_name] --memory [mem_counter_name]
 * </p>
 */

public class VITop {
	protected static AppUtil cb = null;

	protected static OptionSpec[] constructOptions() {
		OptionSpec[] useroptions = new OptionSpec[3];
		useroptions[0] = new OptionSpec("host", "String", 1,
				"Name of the host", null);
		useroptions[1] = new OptionSpec("cpu", "String", 1, "Counters For CPU",
				null);
		useroptions[2] = new OptionSpec("memory", "String", 1,
				"Counter For Memory", null);
		return useroptions;
	}

	protected static String[][] getCounters() throws Exception {
		String cpu = cb.get_option("cpu");
		String mem = cb.get_option("memory");

		String[] cpuCounters = cpu.split(",");
		String[] memCounters = mem.split(",");
		String[][] ret = new String[(cpuCounters.length + memCounters.length)][2];

		for (int i = 0; i < cpuCounters.length; i++) {
			ret[i] = new String[] { "cpu", cpuCounters[i] };
		}

		for (int i = 0; i < memCounters.length; i++) {
			ret[(cpuCounters.length + i)] = new String[] { "mem",
					memCounters[i] };
		}
		return ret;
	}

	public static void main(String args[]) throws Exception {
		VITop obj = new VITop();
		cb = AppUtil.initialize("VITop", VITop.constructOptions(), args);
		cb.connect();
		obj.displayStats();
		// cb.disConnect();
	}

	Timer timer;

	PerfQuerySpec querySpec;

	ManagedObjectReference perfManager;

	StatsTable statsTable;

	protected void createAndShowGUI(String firstColumnName,
			Vector<String> statNames) {
		try {
			String lookAndFeel = UIManager.getSystemLookAndFeelClassName();
			UIManager.setLookAndFeel(lookAndFeel);
			JFrame.setDefaultLookAndFeelDecorated(true);
		} catch (Exception e) {
		}

		JFrame frame = new JFrame("VITop");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		String[] columnNamesArray = new String[statNames.size() + 1];
		columnNamesArray[0] = firstColumnName;
		for (int i = 0; i < statNames.size(); i++) {
			columnNamesArray[i + 1] = statNames.get(i);
		}
		statsTable = new StatsTable(columnNamesArray);
		statsTable.setOpaque(true);
		frame.setContentPane(statsTable);

		frame.pack();
		frame.setVisible(true);
	}

	protected void displayStats() throws Exception {
		String[][] statsList = getCounters();
		ManagedObjectReference hostmor = cb.getServiceUtil().getDecendentMoRef(
				null, "HostSystem", cb.get_option("host"));
		if (hostmor == null) {
			System.out.println("Host Not Found");
			return;
		}
		perfManager = cb.getConnection().getServiceContent().getPerfManager();
		Object property = getProperty(cb.getConnection().getService(),
				perfManager, "perfCounter");
		ArrayOfPerfCounterInfo arrayCounter = (ArrayOfPerfCounterInfo) property;
		PerfCounterInfo[] counterInfoList = arrayCounter.getPerfCounterInfo();

		Vector<PerfMetricId> midVector = new Vector<PerfMetricId>();
		Vector<String> statNames = new Vector<String>();
		for (String[] element : statsList) {
			PerfCounterInfo counterInfo = GetCounterInfo(counterInfoList,
					element[0], element[1]);
			if (counterInfo == null) {
				System.out.println("Warning: Unable to find stat " + element[0]
						+ " " + element[1]);
				continue;
			}
			String counterName = counterInfo.getNameInfo().getLabel();
			statNames.add(counterName);
			midVector
					.add(new PerfMetricId(null, null, counterInfo.getKey(), ""));
		}

		PerfMetricId[] midList = new PerfMetricId[midVector.size()];
		for (int i = 0; i < midVector.size(); i++) {
			midList[i] = midVector.get(i);
		}
		PerfQuerySpec spec = new PerfQuerySpec();
		spec.setEntity(hostmor);

		GregorianCalendar startTime = new GregorianCalendar();
		startTime.add(Calendar.SECOND, -60);

		spec.setStartTime(startTime);
		spec.setMetricId(midList);
		spec.setIntervalId(new Integer(20));
		querySpec = spec;

		final Vector<String> statNames2 = statNames;
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI("VM Name", statNames2);
			}
		});

		Timer timer = new Timer(true);
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				RefreshStats();
			}
		}, 1000, 21000);
	}

	protected Calendar displayStats(PerfMetricId[] midList,
			PerfCompositeMetric compMetric) throws RuntimeException,
			RemoteException {
		if (compMetric == null || (compMetric.getEntity() == null)) {
			return null;
		}

		Vector<Object[]> data = new Vector<Object[]>();
		PerfEntityMetric entityMetric = (PerfEntityMetric) compMetric
				.getEntity();
		PerfMetricIntSeries intSeries = (PerfMetricIntSeries) entityMetric
				.getValue(0);
		int numSamples = entityMetric.getSampleInfo().length;

		Calendar timeStamp = entityMetric.getSampleInfo(numSamples - 1)
				.getTimestamp();
		SimpleDateFormat sdf = new SimpleDateFormat("h:mm:ss a");
		long overallUsage = intSeries.getValue(numSamples - 1);
		System.out.println("Info Updated");
		int numColumns = midList.length + 1;
		PerfEntityMetricBase[] childEntityMetric = compMetric.getChildEntity();
		for (PerfEntityMetricBase element : childEntityMetric) {
			PerfEntityMetric childStats = (PerfEntityMetric) element;
			String childName = getEntityName(childStats.getEntity());
			int numChildSamples = childStats.getSampleInfo().length;
			Object[] tableData = new Object[numColumns];
			tableData[0] = childName;

			for (int i = 0; i < childStats.getValue().length; i++) {
				PerfMetricIntSeries childSeries = (PerfMetricIntSeries) childStats
						.getValue(i);
				int col = FindStatsIndex(midList, childSeries.getId());
				if (col >= 0) {
					long statsVal = childSeries.getValue(numChildSamples - 1);
					tableData[col + 1] = new Long(statsVal);
				}
			}
			data.add(tableData);
		}

		if (statsTable != null) {
			statsTable.setData(timeStamp, overallUsage, "Mhz", data);
		}
		return timeStamp;
	}

	protected int FindStatsIndex(PerfMetricId[] midList, PerfMetricId mid) {
		for (int i = 0; i < midList.length; i++) {
			if ((midList[i].getCounterId() == mid.getCounterId())
					&& (midList[i].getInstance().equals(mid.getInstance()))) {
				return i;
			}
		}
		return -1;
	}

	protected PerfCounterInfo GetCounterInfo(PerfCounterInfo[] counterInfo,
			String groupName, String counterName) {
		for (PerfCounterInfo info : counterInfo) {
			if (info.getGroupInfo().getKey().equals(groupName)
					&& info.getNameInfo().getKey().equals(counterName)) {
				return info;
			}
		}
		return null;
	}

	protected String getEntityName(ManagedObjectReference moRef)
			throws RuntimeFault, RemoteException {
		Object property = getProperty(cb.getConnection().getService(), moRef,
				"name");
		if (property != null) {
			return (String) property;
		} else {
			return "<Unknown Entity>";
		}
	}

	protected Object[] getProperties(VimPortType service,
			ManagedObjectReference moRef, String[] properties)
			throws RuntimeFault, RemoteException {
		PropertySpec pSpec = new PropertySpec();
		pSpec.setType(moRef.getType());
		pSpec.setPathSet(properties);
		ObjectSpec oSpec = new ObjectSpec();
		oSpec.setObj(moRef);
		PropertyFilterSpec pfSpec = new PropertyFilterSpec();
		pfSpec.setPropSet(new PropertySpec[] { pSpec });
		pfSpec.setObjectSet(new ObjectSpec[] { oSpec });
		ObjectContent[] ocs = service.retrieveProperties(cb.getConnection()
				.getServiceContent().getPropertyCollector(),
				new PropertyFilterSpec[] { pfSpec });
		Object[] ret = new Object[properties.length];
		if (ocs != null) {
			for (int i = 0; i < ocs.length; ++i) {
				ObjectContent oc = ocs[i];
				DynamicProperty[] dps = oc.getPropSet();
				if (dps != null) {
					for (int j = 0; j < dps.length; ++j) {
						DynamicProperty dp = dps[j];
						for (int p = 0; p < ret.length; ++p) {
							if (properties[p].equals(dp.getName())) {
								ret[p] = dp.getVal();
							}
						}
					}
				}
			}
		}
		return ret;
	}

	protected Object getProperty(VimPortType service,
			ManagedObjectReference moRef, String prop) throws RuntimeFault,
			RemoteException {
		Object[] props = getProperties(service, moRef, new String[] { prop });
		if (props.length > 0) {
			return props[0];
		} else {
			return null;
		}
	}

	protected void RefreshStats() {
		try {
			PerfCompositeMetric metric = cb.getConnection().getService()
					.queryPerfComposite(perfManager, querySpec);
			Calendar latestTs = displayStats(querySpec.getMetricId(), metric);
			if (latestTs != null) {
				querySpec.setStartTime(latestTs);
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
