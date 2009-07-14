package com.vmware.samples.general;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

import com.vmware.apputils.AppUtil;
import com.vmware.apputils.OptionSpec;
import com.vmware.vim.HostListSummaryQuickStats;
import com.vmware.vim.HostRuntimeInfo;
import com.vmware.vim.ManagedObjectReference;
import com.vmware.vim.ObjectSpec;
import com.vmware.vim.ObjectUpdate;
import com.vmware.vim.ObjectUpdateKind;
import com.vmware.vim.PropertyChange;
import com.vmware.vim.PropertyChangeOp;
import com.vmware.vim.PropertyFilterSpec;
import com.vmware.vim.PropertyFilterUpdate;
import com.vmware.vim.PropertySpec;
import com.vmware.vim.UpdateSet;
import com.vmware.vim.VirtualMachineQuickStats;
import com.vmware.vim.VirtualMachineRuntimeInfo;

/**
 *<pre>
 * his sample demonstrates how to use the PropertyCollector to monitor
 * ne or more properties of one or more managed objects. In particular
 * his sample monitors all or one Virtual Machine and all or one Host
 * or changes to some basic properties.
 * 
 * b&gt;To run this samples following parameters are used :&lt;/b&gt;
 * 
 * mname    [required]   : name of the virtual machine  
 * 
 * b&gt;Command : /&lt;b&gt;
 * un.bat com.vmware.samples.general.GetUpdates --url [webserviceurl]
 *--username [username] --password [password] --vmname  [vmName]
 * 
 *<pre>
 */

public class GetUpdates {
	private static AppUtil cb = null;

	private void getUpdates() throws Exception {
		ManagedObjectReference vmRef = cb.getServiceUtil().getDecendentMoRef(
				null, "VirtualMachine", cb.getOption("vmname"));
		if (vmRef == null) {
			System.out.println("Virtual Machine " + cb.getOption("vmname")
					+ " Not Found");
			return;
		}
		String[][] typeInfo = { new String[] { "VirtualMachine", "name",
				"summary.quickStats", "runtime" } };
		PropertySpec[] pSpecs = cb.getServiceUtil().buildPropertySpecArray(
				typeInfo);
		ObjectSpec[] oSpecs = null;
		oSpecs = new ObjectSpec[] { new ObjectSpec() };
		boolean oneOnly = vmRef != null;
		oSpecs[0].setObj(oneOnly ? vmRef : cb.getConnection().getRootFolder());
		oSpecs[0].setSkip(new Boolean(!oneOnly));
		if (!oneOnly) {
			oSpecs[0].setSelectSet(cb.getServiceUtil().buildFullTraversal());
		}
		PropertyFilterSpec pSpec = new PropertyFilterSpec(null, null, pSpecs,
				oSpecs);
		ManagedObjectReference propColl = cb.getConnection().getPropCol();

		ManagedObjectReference propFilter = cb.getConnection().getService()
				.createFilter(propColl, pSpec, false);

		BufferedReader console = new BufferedReader(new InputStreamReader(
				System.in));

		String version = "";
		do {
			UpdateSet update = cb.getConnection().getService().checkForUpdates(
					propColl, version);
			if (update != null && update.getFilterSet() != null) {
				handleUpdate(update);
				version = update.getVersion();
			} else {
				System.out.println("No update is present!");
			}
			System.out.println("");
			System.out.println("Press <Enter> to check for updates");
			System.out.println("Enter 'exit' <Enter> to exit the program");
			String line = console.readLine();
			if (line.trim().equalsIgnoreCase("exit")) {
				break;
			}
		} while (true);
		cb.getConnection().getService().destroyPropertyFilter(propFilter);
	}

	void handleUpdate(UpdateSet update) {
		ArrayList vmUpdates = new ArrayList();
		ArrayList hostUpdates = new ArrayList();
		PropertyFilterUpdate[] pfus = update.getFilterSet();
		for (int pfui = 0; pfui < pfus.length; ++pfui) {
			ObjectUpdate[] ous = pfus[pfui].getObjectSet();
			for (int oui = 0; oui < ous.length; ++oui) {
				if (ous[oui].getObj().getType().equals("VirtualMachine")) {
					vmUpdates.add(ous[oui]);
				} else if (ous[oui].getObj().getType().equals("HostSystem")) {
					hostUpdates.add(ous[oui]);
				}
			}
		}
		if (vmUpdates.size() > 0) {
			System.out.println("Virtual Machine updates:");
			for (Iterator vmi = vmUpdates.iterator(); vmi.hasNext();) {
				handleObjectUpdate((ObjectUpdate) vmi.next());
			}
		}
		if (hostUpdates.size() > 0) {
			System.out.println("Host updates:");
			for (Iterator vmi = hostUpdates.iterator(); vmi.hasNext();) {
				handleObjectUpdate((ObjectUpdate) vmi.next());
			}
		}
	}

	void handleObjectUpdate(ObjectUpdate oUpdate) {
		PropertyChange[] pc = oUpdate.getChangeSet();
		if (oUpdate.getKind() == ObjectUpdateKind.enter) {
			System.out.println(" New Data:");
			handleChanges(pc);
		} else if (oUpdate.getKind() == ObjectUpdateKind.leave) {
			System.out.println(" Removed Data:");
			handleChanges(pc);
		} else if (oUpdate.getKind() == ObjectUpdateKind.modify) {
			System.out.println(" Changed Data:");
			handleChanges(pc);
		}

	}

	void handleChanges(PropertyChange[] changes) {
		for (int pci = 0; pci < changes.length; ++pci) {
			String name = changes[pci].getName();
			Object value = changes[pci].getVal();
			PropertyChangeOp op = changes[pci].getOp();
			if (op != PropertyChangeOp.remove) {
				System.out.println("  Property Name: " + name);
				if ("summary.quickStats".equals(name)) {
					if (value instanceof VirtualMachineQuickStats) {
						VirtualMachineQuickStats vmqs = (VirtualMachineQuickStats) value;
						String cpu = vmqs.getOverallCpuUsage() == null ? "unavailable"
								: vmqs.getOverallCpuUsage().toString();
						String memory = vmqs.getHostMemoryUsage() == null ? "unavailable"
								: vmqs.getHostMemoryUsage().toString();
						System.out.println("   Guest Status: "
								+ vmqs.getGuestHeartbeatStatus().toString());
						System.out.println("   CPU Load %: " + cpu);
						System.out.println("   Memory Load %: " + memory);
					} else if (value instanceof HostListSummaryQuickStats) {
						HostListSummaryQuickStats hsqs = (HostListSummaryQuickStats) value;
						String cpu = hsqs.getOverallCpuUsage() == null ? "unavailable"
								: hsqs.getOverallCpuUsage().toString();
						String memory = hsqs.getOverallMemoryUsage() == null ? "unavailable"
								: hsqs.getOverallMemoryUsage().toString();
						System.out.println("   CPU Load %: " + cpu);
						System.out.println("   Memory Load %: " + memory);
					}
				} else if ("runtime".equals(name)) {
					if (value instanceof VirtualMachineRuntimeInfo) {
						VirtualMachineRuntimeInfo vmri = (VirtualMachineRuntimeInfo) value;
						System.out.println("   Power State: "
								+ vmri.getPowerState().toString());
						System.out.println("   Connection State: "
								+ vmri.getConnectionState().toString());
						Calendar bTime = vmri.getBootTime();
						if (bTime != null) {
							System.out.println("   Boot Time: "
									+ bTime.getTime());
						}
						Long mOverhead = vmri.getMemoryOverhead();
						if (mOverhead != null) {
							System.out.println("   Memory Overhead: "
									+ mOverhead);
						}
					} else if (value instanceof HostRuntimeInfo) {
						HostRuntimeInfo hri = (HostRuntimeInfo) value;
						System.out.println("   Connection State: "
								+ hri.getConnectionState().toString());
						Calendar bTime = hri.getBootTime();
						if (bTime != null) {
							System.out.println("   Boot Time: "
									+ bTime.getTime());
						}
					}
				} else if ("name".equals(name)) {
					System.out.println("   " + value);
				} else {
					System.out.println("   " + value.toString());
				}
			} else {
				System.out
						.println("Property Name: " + name + " value removed.");
			}
		}
	}

	private static OptionSpec[] constructOptions() {
		OptionSpec[] useroptions = new OptionSpec[1];
		useroptions[0] = new OptionSpec("vmname", "String", 1,
				"Name of the virtual machine", null);
		return useroptions;
	}

	public static void main(String[] args) throws Exception {
		GetUpdates obj = new GetUpdates();
		cb = AppUtil.initialize("GetUpdates", GetUpdates.constructOptions(),
				args);
		cb.connect();
		obj.getUpdates();
		cb.disConnect();
	}
}