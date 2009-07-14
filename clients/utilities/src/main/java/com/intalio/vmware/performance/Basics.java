package com.intalio.vmware.performance;

import java.rmi.RemoteException;
import java.util.Calendar;

import com.vmware.apputils.AppUtil;
import com.vmware.apputils.OptionSpec;
import com.vmware.vim.ArrayOfPerfCounterInfo;
import com.vmware.vim.ArrayOfPerfInterval;
import com.vmware.vim.DynamicProperty;
import com.vmware.vim.ElementDescription;
import com.vmware.vim.ManagedObjectReference;
import com.vmware.vim.ObjectContent;
import com.vmware.vim.ObjectSpec;
import com.vmware.vim.PerfCounterInfo;
import com.vmware.vim.PerfInterval;
import com.vmware.vim.PerfMetricId;
import com.vmware.vim.PerfProviderSummary;
import com.vmware.vim.PerfSummaryType;
import com.vmware.vim.PropertyFilterSpec;
import com.vmware.vim.PropertySpec;
import com.vmware.vim.RuntimeFault;
import com.vmware.vim.ServiceContent;
import com.vmware.vim.VimPortType;

/**
 * This sample displays available performance counters or other metadata for an
 * ESX system as specified at the command line. Output is in this general report
 * style:</li>
 * <ul>
 * Perfomance Interval:
 * <li>Interval Name</li>
 * <li>Interval Period</li>
 * <li>Interval Length</li>
 * </ul>
 * <ul>
 * Performance counters:
 * </ul>
 * <ul>
 * Host perf capabilities:
 * <li>Summary supported</li>
 * <li>Current supported</li>
 * <li>Current refresh rate</li>
 * </ul>
 * 
 * <p>
 * <b>Parameters:</b>
 * </p>
 * <ul>
 * <li>info Required. Specify one of [interval|counter|host]
 * <li>hostname Optional. Required when 'info' specified is 'host.' Name of the
 * host system</li>
 * </ul>
 * 
 * <p>
 * <b>To display the names and description of all the performance counters on a
 * VirtualCenter Server:</b>
 * </p>
 * <p>
 * run.bat com.intalio.vmware.performance Basics --url [webserviceurl]
 * --username [username] --password [password] --info[interval | counter | host]
 * --hostname [name of the host server]
 * 
 * <p>
 * <b>To display counter names, sampling period, and length of all intervals
 * </b>
 * </p>
 * :
 * <p>
 * run.bat com.intalio.vmware.performance Basics --url [webserviceurl]
 * --username [username] --password [password] --info[interval] --hostname [name
 * of the host server]
 * </p>
 * 
 * <p>
 * <b>To display the names and description of all the performance counters on
 * the ESX host</b>
 * </p>
 * run.bat com.intalio.vmware.performance Basics --url [webserviceurl]
 * --username [username] --password [password] --info[counter] --hostname [name
 * of the host server]</p>
 * 
 * <p>
 * <b>To display the names and description of all the performance counters on
 * this host . Also all the metrices available on this host should also be
 * displayed</b>
 * <p>
 * run.bat com.intalio.vmware.performance Basics --url [webserviceurl]
 * --username [username] --password [password] --info[host] --hostname [name of
 * the host server]
 * </p>
 * 
 */

public class Basics {
	private static AppUtil cb = null;

	private static OptionSpec[] constructOptions() {
		OptionSpec[] useroptions = new OptionSpec[2];
		useroptions[0] = new OptionSpec("info", "String", 1,
				"[interval|counter|host]", null);
		useroptions[1] = new OptionSpec("hostname", "String", 0,
				"Name of the host system", null);
		return useroptions;
	}

	public static void main(String[] args) throws Exception {
		Basics obj = new Basics();
		cb = AppUtil.initialize("Basics", Basics.constructOptions(), args);
		boolean valid = obj.customvalidation();
		if (valid) {
			cb.connect();
			obj.displayBasics();
			cb.disConnect();
		}
	}

	VimPortType service;

	ServiceContent sic;

	ManagedObjectReference perfMgr;

	private boolean customvalidation() throws Exception {
		boolean valid = true;
		if (cb.get_option("info").equalsIgnoreCase("host")) {
			if ((!cb.option_is_set("hostname"))) {
				System.out.println("Must specify the --hostname"
						+ " parameter when --info is host");
				valid = false;
			}
		}
		return valid;
	}

	private void displayBasics() throws Exception {
		service = cb.getConnection().getService();
		sic = cb.getConnection().getServiceContent();
		perfMgr = sic.getPerfManager();
		if (cb.get_option("info").equalsIgnoreCase("interval")) {
			getIntervals(perfMgr, service);
		} else if (cb.get_option("info").equalsIgnoreCase("counter")) {
			getCounters(perfMgr, service);
		} else if (cb.get_option("info").equalsIgnoreCase("host")) {
			ManagedObjectReference hostmor = cb.getServiceUtil()
					.getDecendentMoRef(null, "HostSystem",
							cb.get_option("hostname"));
			if (hostmor == null) {
				System.out.println("Host " + cb.get_option("hostname")
						+ " not found");
				return;
			}
			getQuerySummary(perfMgr, hostmor, service);
			getQueryAvailable(perfMgr, hostmor, service);
		} else {
			System.out.println("Invalid info argument [host|counter|interval]");
		}
	}

	private void getCounters(ManagedObjectReference perfMgr, VimPortType service)
			throws RuntimeFault, RemoteException {
		Object property = getProperty(service, perfMgr, "perfCounter");
		ArrayOfPerfCounterInfo arrayCounter = (ArrayOfPerfCounterInfo) property;
		PerfCounterInfo[] counters = arrayCounter.getPerfCounterInfo();
		System.out.println("Performance counters (averages only):");
		System.out.println("-------------------------------------");
		for (PerfCounterInfo counter : counters) {
			if (counter.getRollupType() == PerfSummaryType.average) {
				ElementDescription desc = counter.getNameInfo();
				System.out.println(desc.getLabel() + ": " + desc.getSummary());
			}
		}
		System.out.println();
	}

	private void getIntervals(ManagedObjectReference perfMgr,
			VimPortType service) throws RuntimeFault, RemoteException {
		Object property = getProperty(service, perfMgr, "historicalInterval");
		ArrayOfPerfInterval arrayInterval = (ArrayOfPerfInterval) property;
		PerfInterval[] intervals = arrayInterval.getPerfInterval();
		System.out.println("Performance intervals (" + intervals.length + "):");
		System.out.println("---------------------");
		for (int i = 0; i != intervals.length; ++i) {
			PerfInterval interval = intervals[i];
			System.out.print(i + ": " + interval.getName());
			System.out.print(" -- period = " + interval.getSamplingPeriod());
			System.out.println(", length = " + interval.getLength());
		}
		System.out.println();
	}

	private Object[] getProperties(VimPortType service,
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
		ObjectContent[] ocs = service.retrieveProperties(sic
				.getPropertyCollector(), new PropertyFilterSpec[] { pfSpec });
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

	private Object getProperty(VimPortType service,
			ManagedObjectReference moRef, String prop) throws RuntimeFault,
			RemoteException {
		Object[] props = getProperties(service, moRef, new String[] { prop });
		if (props.length > 0) {
			return props[0];
		} else {
			return null;
		}
	}

	private void getQueryAvailable(ManagedObjectReference perfMgr,
			ManagedObjectReference hostmor, VimPortType service)
			throws RuntimeFault, RemoteException {
		Calendar end = Calendar.getInstance();
		Calendar start = (Calendar) end.clone();
		start.add(Calendar.HOUR, -12);
		PerfMetricId[] metricIds = service.queryAvailablePerfMetric(perfMgr,
				hostmor, start, end, null);
		int[] ids = new int[metricIds.length];
		for (int i = 0; i != metricIds.length; ++i) {
			ids[i] = metricIds[i].getCounterId();
		}
		PerfCounterInfo[] counters = service.queryPerfCounter(perfMgr, ids);
		System.out.println("Available metrics for host (" + metricIds.length
				+ "):");
		System.out.println("--------------------------");
		for (int i = 0; i != metricIds.length; ++i) {
			String label = counters[i].getNameInfo().getLabel();
			String instance = metricIds[i].getInstance();
			System.out.print("   " + label);
			if (instance.length() != 0) {
				System.out.print(" [" + instance + "]");
			}
			System.out.println();
		}
		System.out.println();
	}

	private void getQuerySummary(ManagedObjectReference perfMgr,
			ManagedObjectReference hostmor, VimPortType service)
			throws RuntimeFault, RemoteException {
		PerfProviderSummary summary = service.queryPerfProviderSummary(perfMgr,
				hostmor);
		System.out.println("Host perf capabilities:");
		System.out.println("----------------------");
		System.out.println("  Summary supported: "
				+ summary.isSummarySupported());
		System.out.println("  Current supported: "
				+ summary.isCurrentSupported());
		if (summary.isCurrentSupported()) {
			System.out.println("  Current refresh rate: "
					+ summary.getRefreshRate());
		}
		System.out.println();
	}
}