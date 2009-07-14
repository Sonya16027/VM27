package com.intalio.vmware.performance;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.vmware.apputils.AppUtil;
import com.vmware.apputils.OptionSpec;
import com.vmware.vim.ManagedObjectReference;
import com.vmware.vim.PerfCounterInfo;
import com.vmware.vim.PerfEntityMetric;
import com.vmware.vim.PerfEntityMetricBase;
import com.vmware.vim.PerfInterval;
import com.vmware.vim.PerfMetricId;
import com.vmware.vim.PerfMetricIntSeries;
import com.vmware.vim.PerfMetricSeries;
import com.vmware.vim.PerfQuerySpec;
import com.vmware.vim.PerfSampleInfo;
import com.vmware.vim.PerfStatsType;
import com.vmware.vim.PerfSummaryType;

/**
 *<pre>
 * his sample reads performance measurements from the current time.
 * 
 * b&gt;Parameters:&lt;/b&gt;
 * rl            [required]: url of the web service.
 * sername       [required]: username for the authentication
 * assword       [required]: password for the authentication
 * ostname       [required]: name of the host
 * nterval       [required]: sampling interval
 * tarttime:     [optional]: In minutes, to specfiy what's start time from which samples needs to be collected
 * uration       [optional]: Duration for which samples needs to be  taken
 * roupname      [required]: cpu, mem 
 * ountername     [required]: Usage (for cpu and mem), Overhead (for mem)
 * 
 * b&gt;Command Line: to display performance measurements of extra CPU usage&lt;/b&gt;
 * un.bat com.intalio.vmware.performance.History --url [webserviceurl]
 * -username [username]  --password [password] --hostname [name of the 
 * istory server]  --groupname cpu --countername usage
 * 
 * b&gt;Command Line: to display performance measurements from the past 
 * hould be displayed as per the counter and the group specified.&lt;/b&gt;
 * un.bat com.intalio.vmware.performance.History --url [webserviceurl]
 * -username [username]  --password [password] --hostname [name of the 
 * istory server]  --groupname mem --countername overhead
 *</pre>
 */

public class History {
	private static AppUtil cb = null;

	private static OptionSpec[] constructOptions() {
		OptionSpec[] useroptions = new OptionSpec[6];
		useroptions[0] = new OptionSpec("hostname", "String", 1,
				"Name of the host system", null);
		useroptions[1] = new OptionSpec("interval", "String", 1,
				"Sampling Interval", null);
		useroptions[2] = new OptionSpec("starttime", "String", 0,
				"In minutes, to specfiy what's start time "
						+ "from which samples needs to be collected", "20");
		useroptions[3] = new OptionSpec("duration", "String", 0,
				"Duration for which samples needs to be taken", "20");
		useroptions[4] = new OptionSpec("groupname", "String", 1, "cpu, mem",
				null);

		useroptions[5] = new OptionSpec("countername", "String", 1,
				"usage, overhead", null);
		return useroptions;
	}

	public static void main(String[] args) throws Exception {
		History obj = new History();
		cb = AppUtil.initialize("History", History.constructOptions(), args);
		boolean valid = obj.customValidation();
		if (valid) {
			cb.connect();
			obj.displayHistory();
			cb.disConnect();
		}
	}

	Map _pci = new HashMap();

	Calendar sTime;

	Calendar eTime;

	private boolean checkInterval(PerfInterval[] intervals, Integer interval)
			throws Exception {
		boolean flag = false;
		for (int i = 0; i < intervals.length; ++i) {
			PerfInterval pi = intervals[i];
			if (pi.getSamplingPeriod() == interval) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("Available summary collection intervals");
			System.out.println("Period\tLength\tName");
			for (int i = 0; i < intervals.length; ++i) {
				PerfInterval pi = intervals[i];
				System.out.println(pi.getSamplingPeriod() + "\t"
						+ pi.getLength() + "\t" + pi.getName());
			}
			System.out.println();
		}
		return flag;
	}

	private void CounterInfo(ManagedObjectReference pmRef) throws Exception {
		PerfCounterInfo[] cInfos = (PerfCounterInfo[]) cb.getServiceUtil()
				.getDynamicProperty(pmRef, "perfCounter");
		for (int i = 0; i < cInfos.length; ++i) {
			PerfCounterInfo cInfo = cInfos[i];
			String group = cInfo.getGroupInfo().getKey();
			Map nameMap = null;
			if (!_pci.containsKey(group)) {
				nameMap = new HashMap();
				_pci.put(group, nameMap);
			} else {
				nameMap = (Map) _pci.get(group);
			}
			String name = cInfo.getNameInfo().getKey();
			ArrayList counters = null;
			if (!nameMap.containsKey(name)) {
				counters = new ArrayList();
				nameMap.put(name, counters);
			} else {
				counters = (ArrayList) nameMap.get(name);
			}
			counters.add(cInfo);
		}
	}

	private boolean customValidation() throws Exception {
		int duration = Integer.parseInt(cb.get_option("duration"));
		int starttime = Integer.parseInt(cb.get_option("starttime"));
		if (duration > starttime) {
			System.out.println("Duration must be less than startime");
			return false;
		} else {
			return true;
		}
	}

	private void displayHistory() throws Exception {
		ManagedObjectReference hostmor = cb.getServiceUtil().getDecendentMoRef(
				null, "HostSystem", cb.get_option("hostname"));
		if (hostmor == null) {
			System.out.println("Host " + cb.get_option("hostname")
					+ " not found");
			return;
		}
		ManagedObjectReference pmRef = cb.getConnection().getServiceContent()
				.getPerfManager();
		CounterInfo(pmRef);
		PerfInterval[] intervals = (PerfInterval[]) cb.getServiceUtil()
				.getDynamicProperty(pmRef, "historicalInterval");
		Integer interval = new Integer(Integer.parseInt(cb
				.get_option("interval")));
		boolean valid = checkInterval(intervals, interval);
		if (!valid) {
			System.out.println("Invalid interval, Specify one from above");
			return;
		}

		PerfCounterInfo pci = getCounterInfo(cb.get_option("groupname"), cb
				.get_option("countername"), PerfSummaryType.average, null);
		if (pci == null) {
			System.out
					.println("Incorrect Group Name and Countername specified");
			return;
		}

		PerfQuerySpec qSpec = new PerfQuerySpec();
		qSpec.setEntity(hostmor);
		qSpec.setMaxSample(new Integer(10));
		PerfQuerySpec[] qSpecs = new PerfQuerySpec[] { qSpec };

		Calendar sTime = cb.getConnection().getService().currentTime(
				cb.getConnection().getServiceInstanceRef());
		Calendar eTime = cb.getConnection().getService().currentTime(
				cb.getConnection().getServiceInstanceRef());

		int duration = Integer.parseInt(cb.get_option("duration"));
		int startTime = Integer.parseInt(cb.get_option("starttime"));

		eTime.add(Calendar.MINUTE, (duration - (2 * startTime)));
		sTime.add(Calendar.MINUTE, (duration - ((2 * startTime) + duration)));

		System.out.println("Start Time " + sTime.getTime().toString());
		System.out.println("End Time   " + eTime.getTime().toString());

		System.out.println();

		PerfMetricId[] aMetrics = cb.getConnection().getService()
				.queryAvailablePerfMetric(pmRef, hostmor, sTime, eTime,
						interval);
		PerfMetricId ourCounter = null;

		for (int index = 0; index < aMetrics.length; ++index) {
			if (aMetrics[index].getCounterId() == pci.getKey()) {
				ourCounter = aMetrics[index];
				break;
			}
		}
		if (ourCounter == null) {
			System.out.println("No data on Host to collect. "
					+ "Has it been running for at least "
					+ cb.get_option("duration") + " minutes");
		} else {
			qSpec = new PerfQuerySpec();
			qSpec.setEntity(hostmor);
			qSpec.setStartTime(sTime);
			qSpec.setEndTime(eTime);
			qSpec.setMetricId(new PerfMetricId[] { ourCounter });
			qSpec.setIntervalId(interval);
			qSpecs = new PerfQuerySpec[] { qSpec };

			PerfEntityMetricBase[] samples = cb.getConnection().getService()
					.queryPerf(pmRef, qSpecs);
			if (samples != null) {
				displayValues(samples, pci, ourCounter, interval);
			} else {
				System.out.println("No Samples Found");
			}
		}
	}

	private void displayValues(PerfEntityMetricBase[] values,
			PerfCounterInfo pci, PerfMetricId pmid, Integer interval) {
		for (int i = 0; i < values.length; ++i) {
			PerfMetricSeries[] vals = ((PerfEntityMetric) values[i]).getValue();
			PerfSampleInfo[] infos = ((PerfEntityMetric) values[i])
					.getSampleInfo();
			if (infos == null || infos.length == 0) {
				System.out.println("No Samples available. Continuing.");
				continue;
			}
			System.out.println("Sample time range: "
					+ infos[0].getTimestamp().getTime().toString()
					+ " - "
					+ infos[infos.length - 1].getTimestamp().getTime()
							.toString() + ", read every " + interval
					+ " seconds");
			for (int vi = 0; vi < vals.length; ++vi) {
				if (pci != null) {
					if (pci.getKey() != vals[vi].getId().getCounterId()) {
						continue;
					}
					System.out.println(pci.getNameInfo().getSummary()
							+ " - Instance: " + pmid.getInstance());
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

	private PerfCounterInfo getCounterInfo(String groupName,
			String counterName, PerfSummaryType rollupType,
			PerfStatsType statsType) {
		ArrayList counters = getCounterInfos(groupName, counterName);
		if (counters != null) {
			for (Iterator i = counters.iterator(); i.hasNext();) {
				PerfCounterInfo pci = (PerfCounterInfo) i.next();
				if ((statsType == null || statsType.equals(pci.getStatsType()))
						&& (rollupType == null || rollupType.equals(pci
								.getRollupType()))) {
					return pci;
				}
			}
		}
		return null;
	}

	private ArrayList getCounterInfos(String groupName, String counterName) {
		Map nameMap = (Map) _pci.get(groupName);
		if (nameMap != null) {
			ArrayList ret = (ArrayList) nameMap.get(counterName);
			if (ret != null) {
				return new ArrayList(ret);
			}
		}
		return null;
	}
}
