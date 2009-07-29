package com.intalio.vmware.performance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.vmware.apputils.AppUtil;
import com.vmware.apputils.OptionSpec;
import com.vmware.vim.ManagedObjectReference;
import com.vmware.vim.PerfCounterInfo;
import com.vmware.vim.PerfEntityMetric;
import com.vmware.vim.PerfEntityMetricBase;
import com.vmware.vim.PerfMetricId;
import com.vmware.vim.PerfMetricIntSeries;
import com.vmware.vim.PerfMetricSeries;
import com.vmware.vim.PerfQuerySpec;
import com.vmware.vim.PerfSampleInfo;

/**
 * This sample displays performance measurements from the current time at the
 * console.
 * 
 * <p>
 * <b>Parameters:</b>
 * </p>
 * <ul>
 * <li>
 * vmname Required. Name of the virtual machine</li>
 * </ul>
 * 
 * <p>
 * <b>Command Line:</b>
 * </p>
 * <p>
 * run.bat com.intalio.vmware.performance.Realtime --url [webserviceurl]
 * --username [username] --password [password] --vmname [vmname]
 * </p>
 */

public class Realtime {
	protected static AppUtil cb = null;

	protected static OptionSpec[] constructOptions() {
		OptionSpec[] useroptions = new OptionSpec[1];
		useroptions[0] = new OptionSpec("vmname", "String", 1,
				"Name of the virtual machine", null);
		return useroptions;
	}

	public static void main(String[] args) throws Exception {
		Realtime obj = new Realtime();
		cb = AppUtil.initialize("RealTime", Realtime.constructOptions(), args);
		cb.connect();
		obj.doRealTime();
		cb.disConnect();
	}

	void displayValues(PerfEntityMetricBase[] values, Map counters) {

		for (int i = 0; i < values.length; ++i) {
			PerfMetricSeries[] vals = ((PerfEntityMetric) values[i]).getValue();
			PerfSampleInfo[] infos = ((PerfEntityMetric) values[i])
					.getSampleInfo();
			System.out.println("Sample time range: "
					+ infos[0].getTimestamp().getTime().toString()
					+ " - "
					+ infos[infos.length - 1].getTimestamp().getTime()
							.toString());
			for (int vi = 0; vi < vals.length; ++vi) {
				PerfCounterInfo pci = (PerfCounterInfo) counters
						.get(new Integer(vals[vi].getId().getCounterId()));
				if (pci != null) {
					System.out.println(pci.getNameInfo().getSummary());
				}
				if (vals[vi] instanceof PerfMetricIntSeries) {
					PerfMetricIntSeries val = (PerfMetricIntSeries) vals[vi];
					long[] longs = val.getValue();
					for (int k = 0; k < longs.length; ++k) {
						System.out.print(longs[k] + " ");
					}
					System.out.println();
				}
			}
		}
	}

	protected void doRealTime() throws Exception {
		ManagedObjectReference vmmor = cb.getServiceUtil().getDecendentMoRef(
				null, "VirtualMachine", cb.get_option("vmname"));
		if (vmmor != null) {
			ManagedObjectReference pmRef = cb.getConnection()
					.getServiceContent().getPerfManager();
			PerfCounterInfo[] cInfo = (PerfCounterInfo[]) cb.getServiceUtil()
					.getDynamicProperty(pmRef, "perfCounter");
			List vmCpuCounters = new ArrayList();
			for (int i = 0; i < cInfo.length; ++i) {
				if ("cpu".equalsIgnoreCase(cInfo[i].getGroupInfo().getKey())) {
					vmCpuCounters.add(cInfo[i]);
				}
			}
			Map counters = new HashMap();
			while (true) {
				int index = 0;
				for (Iterator it = vmCpuCounters.iterator(); it.hasNext();) {
					PerfCounterInfo pcInfo = (PerfCounterInfo) it.next();
					System.out.println(++index + " - "
							+ pcInfo.getNameInfo().getSummary());
				}
				index = cb.getUtil().getIntInput(
						"Please select a counter from" + " the above list"
								+ "\nEnter 0 to end: ", 1);
				if (index > vmCpuCounters.size()) {
					System.out.println("*** Value out of range!");
				} else {
					--index;
					if (index < 0) {
						return;
					}
					PerfCounterInfo pcInfo = (PerfCounterInfo) vmCpuCounters
							.get(index);
					counters.put(new Integer(pcInfo.getKey()), pcInfo);
					break;
				}
			}
			PerfMetricId[] aMetrics = cb.getConnection().getService()
					.queryAvailablePerfMetric(pmRef, vmmor, null, null,
							new Integer(20));
			ArrayList mMetrics = new ArrayList();
			if (aMetrics != null) {
				for (int index = 0; index < aMetrics.length; ++index) {
					if (counters.containsKey(new Integer(aMetrics[index]
							.getCounterId()))) {
						mMetrics.add(aMetrics[index]);
					}
				}
			}
			monitorPerformance(pmRef, vmmor, mMetrics, counters);
		} else {
			System.out.println("Virtual Machine " + cb.get_option("vmname")
					+ " not found");
		}
	}

	void monitorPerformance(ManagedObjectReference pmRef,
			ManagedObjectReference vmRef, ArrayList mMetrics, Map counters)
			throws Exception {
		PerfMetricId[] metricIds = (PerfMetricId[]) mMetrics
				.toArray(new PerfMetricId[0]);
		PerfQuerySpec qSpec = new PerfQuerySpec();
		qSpec.setEntity(vmRef);
		qSpec.setMaxSample(new Integer(10));
		qSpec.setMetricId(metricIds);
		qSpec.setIntervalId(new Integer(20));

		PerfQuerySpec[] qSpecs = new PerfQuerySpec[] { qSpec };
		while (true) {
			PerfEntityMetricBase[] pValues = cb.getConnection().getService()
					.queryPerf(pmRef, qSpecs);
			if (pValues != null) {
				displayValues(pValues, counters);
			}
			System.out.println("Sleeping 10 seconds...");
			Thread.sleep(10 * 1000);
		}
	}
}