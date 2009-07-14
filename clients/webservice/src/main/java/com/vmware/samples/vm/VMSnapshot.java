package com.vmware.samples.vm;

import com.vmware.apputils.AppUtil;
import com.vmware.apputils.OptionSpec;
import com.vmware.vim.DynamicProperty;
import com.vmware.vim.ManagedObjectReference;
import com.vmware.vim.ObjectContent;
import com.vmware.vim.VirtualMachineSnapshotInfo;
import com.vmware.vim.VirtualMachineSnapshotTree;

/**
 *<pre>
 * This sample Performs virtual machine snapshot operations
 * 
 * o run this samples following parameters are used:
 * 
 * b&gt;Parameters&lt;/b&gt;
 * mname         [required]:Name of the virtual machine
 * peration      [required]:Type of the operation
 * napshotname   [optional]:Name of the snapshot
 * escription    [optional]:description of the sanpshot
 * emovechild    [optional]:if children needs to be removed and 0 if children
 *               needn't be removed
 * 
 * b&gt;Command Line:To list the name of the snapshot&lt;/b&gt;
 * un.bat com.vmware.samples.vm.VMSnapshot --url [webserviceurl]
 * -username [username] --password  [password] --vmname [vmname]
 * -operation [list]
 * 
 * b&gt;Command Line: To create a snapshot of the virtual machine&lt;/b&gt;
 * un.bat com.vmware.samples.vm.VMSnapshot --url [webserviceurl]
 * -username [username] --password  [password] --vmname [vmname]
 * -operation [create]
 * -description [Description of the snapshot]
 * 
 * b&gt;Command Line: To revert a snapshot of the virtual machine&lt;/b&gt;
 * un.bat com.vmware.samples.vm.VMSnapshot --url [webserviceurl]
 * -username [username] --password  [password] --vmname [vmname]
 * -operation [revert]
 * -description [Description of the snapshot]
 * 
 * b&gt;Command Line: To remove a snapshot of the virtual machine&lt;/b&gt;
 * un.bat com.vmware.samples.vm.VMSnapshot --url [webserviceurl]
 * -username [username] --password  [password] --vmname [vmname]
 *--operation [remove]  --removechild [0]
 */

public class VMSnapshot {
	private static AppUtil cb = null;

	private boolean createSnapshot(ManagedObjectReference vmMor)
			throws Exception {
		String snapshotName = cb.getOption("snapshotname");
		String desc = cb.getOption("description");
		ManagedObjectReference taskMor = cb.getConnection().getService()
				.createSnapshot_Task(vmMor, snapshotName, desc, false, false);
		String res = cb.getServiceUtil().waitForTask(taskMor);
		if (res.equalsIgnoreCase("sucess")) {
			return true;
		}
		return false;
	}

	private boolean listSnapshot(ManagedObjectReference vmMor) throws Exception {
		ObjectContent[] snaps = cb.getServiceUtil().getObjectProperties(null,
				vmMor, new String[] { "snapshot" });
		VirtualMachineSnapshotInfo snapInfo = null;
		if (snaps != null && snaps.length > 0) {
			ObjectContent snapobj = snaps[0];
			DynamicProperty[] snapary = snapobj.getPropSet();
			if (snapary != null && snapary.length > 0) {
				snapInfo = ((VirtualMachineSnapshotInfo) (snapary[0]).getVal());
				VirtualMachineSnapshotTree[] snapTree = snapInfo
						.getRootSnapshotList();
				traverseSnapshotInTree(snapTree, null, true);
			} else {
				System.out.println("No Snapshots found");
			}
		}
		return false;
	}

	private boolean revertSnapshot(ManagedObjectReference vmMor)
			throws Exception {
		String snapshotName = cb.getOption("snapshotname");
		ManagedObjectReference snapmor = getSnapshotReference(vmMor, cb
				.getOption("vmname"), cb.getOption("snapshotname"));
		if (snapmor != null) {
			ManagedObjectReference taskMor = cb.getConnection().getService()
					.revertToSnapshot_Task(snapmor, null);
			String res = cb.getServiceUtil().waitForTask(taskMor);
			if (res.equalsIgnoreCase("sucess")) {
				return true;
			}
		} else {
			System.out.println("Snapshot not found");
		}
		return false;
	}

	private boolean removeAllSnapshot(ManagedObjectReference vmMor)
			throws Exception {
		ManagedObjectReference taskMor = cb.getConnection().getService()
				.removeAllSnapshots_Task(vmMor);
		String res = cb.getServiceUtil().waitForTask(taskMor);
		if (res.equalsIgnoreCase("sucess")) {
			return true;
		}
		return false;
	}

	private boolean removeSnapshot(ManagedObjectReference vmMor)
			throws Exception {
		String snapshotName = cb.getOption("snapshotname");
		int rem = Integer.parseInt(cb.getOption("removechild"));
		boolean flag = true;
		if (rem == 0) {
			flag = false;
		}
		ManagedObjectReference snapmor = getSnapshotReference(vmMor, cb
				.getOption("vmname"), cb.getOption("snapshotname"));
		if (snapmor != null) {
			ManagedObjectReference taskMor = cb.getConnection().getService()
					.removeSnapshot_Task(snapmor, flag);
			String res = cb.getServiceUtil().waitForTask(taskMor);
			if (res.equalsIgnoreCase("sucess")) {
				return true;
			}
		} else {
			System.out.println("Snapshot not found");
		}
		return false;
	}

	private ManagedObjectReference traverseSnapshotInTree(
			VirtualMachineSnapshotTree[] snapTree, String findName,
			boolean print) {
		ManagedObjectReference snapmor = null;
		if (snapTree == null) {
			return snapmor;
		}
		for (int i = 0; i < snapTree.length && snapmor == null; i++) {
			VirtualMachineSnapshotTree node = snapTree[i];
			if (print) {
				System.out.println("Snapshot Name : " + node.getName());
			}
			if (findName != null && node.getName().equals(findName)) {
				snapmor = node.getSnapshot();
			} else {
				VirtualMachineSnapshotTree[] childTree = node
						.getChildSnapshotList();
				snapmor = traverseSnapshotInTree(childTree, findName, print);
			}
		}

		return snapmor;
	}

	private ManagedObjectReference getSnapshotReference(
			ManagedObjectReference vmmor, String vmName, String snapName)
			throws Exception {
		VirtualMachineSnapshotInfo snapInfo = getSnapshotInfo(vmmor, vmName);
		ManagedObjectReference snapmor = null;
		if (snapInfo != null) {
			VirtualMachineSnapshotTree[] snapTree = snapInfo
					.getRootSnapshotList();
			snapmor = traverseSnapshotInTree(snapTree, snapName, false);
		} else {
			System.out.println("No Snapshot named : " + snapName
					+ " found for VirtualMachine : " + vmName);
		}
		return snapmor;
	}

	private VirtualMachineSnapshotInfo getSnapshotInfo(
			ManagedObjectReference vmmor, String vmName) throws Exception {
		ObjectContent[] snaps = cb.getServiceUtil().getObjectProperties(null,
				vmmor, new String[] { "snapshot" });

		VirtualMachineSnapshotInfo snapInfo = null;
		if (snaps != null && snaps.length > 0) {
			ObjectContent snapobj = snaps[0];
			DynamicProperty[] snapary = snapobj.getPropSet();
			if (snapary != null && snapary.length > 0) {
				snapInfo = ((VirtualMachineSnapshotInfo) (snapary[0]).getVal());
			}
		} else {
			System.out.println("No Snapshots found for VirtualMachine : "
					+ vmName);
		}
		return snapInfo;
	}

	private boolean customValidation() throws Exception {
		boolean flag = true;
		String op = cb.getOption("operation");
		if (op.equalsIgnoreCase("create")) {
			if ((!cb.option_is_set("snapshotname"))
					|| (!cb.option_is_set("description"))) {
				System.out.println("For Create operation SnapshotName"
						+ " and Description are the Mandatory options");
				flag = false;
			}
		}
		if (op.equalsIgnoreCase("remove")) {
			if ((!cb.option_is_set("snapshotname"))
					|| (!cb.option_is_set("removechild"))) {
				System.out.println("For Remove operation Snapshotname"
						+ " and removechild are the Mandatory option");
				flag = false;
			} else {
				int child = Integer.parseInt(cb.getOption("removechild"));
				if (child != 0 && child != 1) {
					System.out.println("Value of removechild parameter"
							+ " must be either 0 or 1");
					flag = false;
				}
			}
		}
		if (op.equalsIgnoreCase("revert")) {
			if ((!cb.option_is_set("snapshotname"))) {
				System.out.println("For Revert operation SnapshotName"
						+ " is the Mandatory option");
				flag = false;
			}
		}
		return flag;
	}

	private static OptionSpec[] constructOptions() {
		OptionSpec[] useroptions = new OptionSpec[5];
		useroptions[0] = new OptionSpec("vmname", "String", 1,
				"Name of the virtual machine", null);
		useroptions[1] = new OptionSpec("operation", "String", 1,
				"Type of the operation [list|"
						+ "create|remove|removeall|revert]", null);
		useroptions[2] = new OptionSpec("snapshotname", "String", 0,
				"Name of Snapshot", null);
		useroptions[3] = new OptionSpec("description", "String", 0,
				"Description of snapshot", null);
		useroptions[4] = new OptionSpec("removechild", "Integer", 0,
				"1 if children needs to be removed"
						+ " and 0 if children needn't be removed", null);
		return useroptions;
	}

	public static void main(String[] args) throws Exception {
		VMSnapshot obj = new VMSnapshot();
		cb = AppUtil.initialize("VMSnapshot", VMSnapshot.constructOptions(),
				args);
		boolean valid = obj.customValidation();
		if (valid) {
			cb.connect();
			String vmName = cb.getOption("vmname");
			ManagedObjectReference vmMor = cb.getServiceUtil()
					.getDecendentMoRef(null, "VirtualMachine", vmName);

			if (vmMor != null) {
				String op = cb.getOption("operation");
				boolean res = false;
				if (op.equalsIgnoreCase("create")) {
					res = obj.createSnapshot(vmMor);
				} else if (op.equalsIgnoreCase("list")) {
					res = obj.listSnapshot(vmMor);
				} else if (op.equalsIgnoreCase("revert")) {
					res = obj.revertSnapshot(vmMor);
				} else if (op.equalsIgnoreCase("removeall")) {
					res = obj.removeAllSnapshot(vmMor);
				} else if (op.equalsIgnoreCase("remove")) {
					res = obj.removeSnapshot(vmMor);
				} else {
					System.out.println("Invalid operation [create|list|"
							+ "revert|remoeveall|remove]");
					System.exit(1);
				}
				if (res) {
					System.out.println("Operation " + op
							+ " completed sucessfully");
				}
			} else {
				System.out.println("No VM " + vmName + " found");
			}
			cb.disConnect();
		}
	}
}