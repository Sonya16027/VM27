package com.intalio.vmware.performance;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

import com.vmware.apputils.AppUtil;
import com.vmware.apputils.OptionSpec;
import com.vmware.vim.ElementDescription;
import com.vmware.vim.ManagedObjectReference;
import com.vmware.vim.PerfCounterInfo;
import com.vmware.vim.PerfMetricId;

/**
 * 
 * <p>
 * This sample writes the available counters of a managed entity into the
 * specified file at the specified location. The managed entity here can be a
 * host system or a virtual machine or a Resource pool.
 * </p>
 * 
 * <p>
 * <b>Parameters:</b>
 * </p>
 * <ul>
 * <li>entitytype Required. Managed entity
 * [HostSystem|VirtualMachine|ResourcePool]</li>
 * <li>entityname Required. Name of the host system
 * <li>filename Required. Name of the file, including path if other than current
 * directory.</li>
 * </ul>
 * 
 * <p>
 * <b>To obtain listing of counters available for a host named "myHost.com" and
 * save to a file named "myHostCounters:"</b>
 * </p>
 * 
 * <p>
 * run.bat com.intalio.vmware.performance.PrintCounters --url
 * https://myHost.com/sdk --username root --password ******* --entitytype
 * HostSystem --entityname myHost.com --filename myHostCounters
 * </p>
 * 
 */

public class PrintCounters {
	private static AppUtil cb = null;

	private static OptionSpec[] constructOptions() {
		OptionSpec[] useroptions = new OptionSpec[3];
		useroptions[0] = new OptionSpec("entitytype", "String", 1,
				"Type of the Entity "
						+ "[HostSystem|VirtualMachine|ResourcePool]", null);
		useroptions[1] = new OptionSpec("entityname", "String", 1,
				"Name of the Managed Entity", null);
		useroptions[2] = new OptionSpec("filename", "String", 1,
				"Name of the file", null);
		return useroptions;
	}

	public static void main(String args[]) throws Exception {
		PrintCounters obj = new PrintCounters();
		cb = AppUtil.initialize("PrintCounters", PrintCounters
				.constructOptions(), args);
		cb.connect();
		obj.printCounters();
		cb.disConnect();
	}

	private ManagedObjectReference getManagedObjectReference(String entityType)
			throws Exception {
		ManagedObjectReference obj = cb.getServiceUtil().getDecendentMoRef(
				null, entityType, cb.get_option("entityname"));
		return obj;
	}

	private Set getPerfIdsAvailable(ManagedObjectReference perfMoRef,
			ManagedObjectReference entityMoRef) throws Exception {
		Set ret = new HashSet();
		if (entityMoRef != null) {
			PerfMetricId[] ids = cb.getConnection().getService()
					.queryAvailablePerfMetric(perfMoRef, entityMoRef, null,
							null, new Integer(300));
			if (ids != null) {
				for (int i = 0; i < ids.length; ++i) {
					ret.add(new Integer(ids[i].getCounterId()));
				}
			}
		}
		return ret;
	}

	private void printCounters() throws Exception {
		String entityType = cb.get_option("entitytype");

		if (entityType.equalsIgnoreCase("HostSystem")) {
			printEntityCounters("HostSystem");
		} else if (entityType.equalsIgnoreCase("VirtualMachine")) {
			printEntityCounters("VirtualMachine");
		} else if (entityType.equals("ResourcePool")) {
			printEntityCounters("ResourcePool");
		} else {
			System.out.println("Entity Argument must be "
					+ "[HostSystem|VirtualMachine|ResourcePool]");
		}
	}

	private void printElementDescription(PrintWriter out, String name,
			ElementDescription ed) {
		out.print("   <" + name + "-key>");
		out.print(ed.getKey());
		out.println("</" + name + "-key>");

		out.print("   <" + name + "-label>");
		out.print(ed.getLabel());
		out.println("</" + name + "-label>");

		out.print("   <" + name + "-summary>");
		out.print(ed.getSummary());
		out.println("</" + name + "-summary>");
	}

	private void printEntityCounters(String entityType) throws Exception {
		ManagedObjectReference mor = getManagedObjectReference(entityType);
		ManagedObjectReference pmRef = cb.getConnection().getServiceContent()
				.getPerfManager();
		PerfCounterInfo[] cInfo = (PerfCounterInfo[]) cb.getServiceUtil()
				.getDynamicProperty(pmRef, "perfCounter");

		if (mor != null) {
			Set ids = getPerfIdsAvailable(pmRef, mor);
			File file = new File(cb.get_option("filename"));
			PrintWriter out = new PrintWriter(new BufferedWriter(
					new FileWriter(cb.get_option("filename"))));
			if (cInfo != null) {
				out.println("<perf-counters>");
				for (int c = 0; c < cInfo.length; ++c) {
					PerfCounterInfo pci = cInfo[c];
					Integer id = new Integer(pci.getKey());
					if (ids.contains(id)) {
						out.print("  <perf-counter key=\"");
						out.print(id);
						out.print("\" ");

						out.print("rollupType=\"");
						out.print(pci.getRollupType().getValue());
						out.print("\" ");

						out.print("statsType=\"");
						out.print(pci.getStatsType().getValue());
						out.println("\">");
						printElementDescription(out, "groupInfo", pci
								.getGroupInfo());
						printElementDescription(out, "nameInfo", pci
								.getNameInfo());
						printElementDescription(out, "unitInfo", pci
								.getUnitInfo());

						out
								.println("    <entity type=\"" + entityType
										+ "\"/>");
						int[] ac = pci.getAssociatedCounterId();
						if (ac != null) {
							for (int a = 0; a < ac.length; ++a) {
								out.println("    <associatedCounter>" + ac[a]
										+ "</associatedCounter>");
							}
						}
						out.println("  </perf-counter>");
					}
				}
				out.println("</perf-counters>");
				out.flush();
				out.close();
			}
			System.out.println("Check " + cb.get_option("filename")
					+ " for Print Counters");
		} else {
			System.out.println(entityType + " " + cb.get_option("entityname")
					+ " not found.");
		}
	}
}