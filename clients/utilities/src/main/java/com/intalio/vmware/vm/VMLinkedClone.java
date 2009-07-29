package com.intalio.vmware.vm;

import java.util.ArrayList;
import java.util.Iterator;

import org.w3c.dom.Element;

import com.vmware.apputils.AppUtil;
import com.vmware.apputils.OptionSpec;
import com.vmware.apputils.version.ExtendedAppUtil;
import com.vmware.apputils.version.VersionUtil;
import com.vmware.vim25.DynamicProperty;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ObjectContent;
import com.vmware.vim25.VirtualDevice;
import com.vmware.vim25.VirtualDisk;
import com.vmware.vim25.VirtualDiskFlatVer1BackingInfo;
import com.vmware.vim25.VirtualDiskFlatVer2BackingInfo;
import com.vmware.vim25.VirtualDiskRawDiskMappingVer1BackingInfo;
import com.vmware.vim25.VirtualDiskSparseVer1BackingInfo;
import com.vmware.vim25.VirtualDiskSparseVer2BackingInfo;
import com.vmware.vim25.VirtualHardware;
import com.vmware.vim25.VirtualMachineCloneSpec;
import com.vmware.vim25.VirtualMachineRelocateDiskMoveOptions;
import com.vmware.vim25.VirtualMachineRelocateSpec;
import com.vmware.vim25.VirtualMachineRelocateSpecDiskLocator;
import com.vmware.vim25.VirtualMachineSnapshotInfo;
import com.vmware.vim25.VirtualMachineSnapshotTree;

/**
 *<pre>
 * his sample is used to create a linked clone from an existing snapshot.
 * ach independent disk needs a DiskLocator with diskMoveType as moveAllDiskBackingsAndDisallowSharing.
 * 
 * b&gt;To run this samples following parameters are used :&lt;/b&gt;
 * 
 * mname            [required]   : Name of the virtual machine
 * napshotname      [required]   : Name of the snaphot
 * lonename         [required]   : Name of the clonename
 * 
 * b&gt;Command:&lt;/b&gt;
 * b&gt;Create a linked clone &lt;/b&gt;
 * un.bat com.intalio.vmware.vm.vmlinkedclone
 * -username [username] --password [password]  --vmname [myVM]
 * -snapshotname [sname]  -- clonename [cname]
 *</pre>
 */

public class VMLinkedClone {
	public static OptionSpec[] constructOptions() {
		OptionSpec[] useroptions = new OptionSpec[3];
		useroptions[0] = new OptionSpec("vmname", "String", 1,
				"Name of the virtual machine", null);
		useroptions[1] = new OptionSpec("snapshotname", "String", 1,
				"Name of the snapshot", null);
		useroptions[2] = new OptionSpec("clonename", "String", 1,
				"Name of the linked clone", null);
		return useroptions;
	}

	public static void main(String[] args) throws Exception {
		VMLinkedClone app = new VMLinkedClone();
		cb = AppUtil.initialize("VMLinkedClone", VMLinkedClone
				.constructOptions(), args);
		cb.connect();
		String cookieString = VersionUtil.getCookieString(cb);
		app.createLinkedClone(args, cookieString);
		cb.disConnect();
	}

	protected ExtendedAppUtil ecb = null;
	protected static AppUtil cb = null;

	protected static ManagedObjectReference provisionChkr = null;

	protected static VersionUtil versionUtil = null;

	public void createLinkedClone(String[] args, String cookieString)
			throws Exception {

		ArrayList apiVersions = VersionUtil.getSupportedVersions(cb
				.get_option("url"));
		if (!VersionUtil.isApiVersionSupported(apiVersions, "4.0")) {
			System.out.println("Linked clone feature is for K/L only and not "
					+ "supported by the old VI SDK 2.0 API");
			return;
		}
		ecb = ExtendedAppUtil.initialize("VMLinkedClone", VMLinkedClone
				.constructOptions(), args);
		ecb.connect(cookieString);
		ManagedObjectReference vmMOR = getMOR(ecb.get_option("vmname"),
				"VirtualMachine", null);
		if (vmMOR != null) {
			ManagedObjectReference snapMOR = getSnapshotReference(vmMOR, ecb
					.get_option("snapshotname"));
			if (snapMOR != null) {
				ArrayList independent_virtual_disk_keys = getIndependenetVirtualDiskKeys(vmMOR);

				VirtualMachineRelocateSpec rSpec = new VirtualMachineRelocateSpec();
				if (independent_virtual_disk_keys.size() > 0) {
					ManagedObjectReference[] ds = (ManagedObjectReference[]) ecb
							.getServiceUtil3().getDynamicProperty(vmMOR,
									"datastore");

					VirtualMachineRelocateSpecDiskLocator[] diskLocator = new VirtualMachineRelocateSpecDiskLocator[independent_virtual_disk_keys
							.size()];

					Iterator it = independent_virtual_disk_keys.iterator();
					int count = 0;
					while (it.hasNext()) {
						diskLocator[count] = new VirtualMachineRelocateSpecDiskLocator();
						diskLocator[count].setDatastore(ds[0]);
						diskLocator[count]
								.setDiskMoveType(VirtualMachineRelocateDiskMoveOptions._moveAllDiskBackingsAndDisallowSharing);
						diskLocator[count].setDiskId((Integer) it.next());
						count = count + 1;
					}
					rSpec
							.setDiskMoveType(VirtualMachineRelocateDiskMoveOptions._createNewChildDiskBacking);
					rSpec.setDisk(diskLocator);
				} else {
					rSpec
							.setDiskMoveType(VirtualMachineRelocateDiskMoveOptions._createNewChildDiskBacking);
				}
				VirtualMachineCloneSpec cloneSpec = new VirtualMachineCloneSpec();
				cloneSpec.setPowerOn(false);
				cloneSpec.setTemplate(false);
				cloneSpec.setLocation(rSpec);
				cloneSpec.setSnapshot(snapMOR);

				try {
					ManagedObjectReference parentMOR = (ManagedObjectReference) ecb
							.getServiceUtil3().getDynamicProperty(vmMOR,
									"parent");
					ManagedObjectReference taskMOR = ecb
							.getServiceConnection3().getService().cloneVM_Task(
									vmMOR, parentMOR,
									ecb.get_option("clonename"), cloneSpec);
					String status = ecb.getServiceUtil3().waitForTask(taskMOR);
					if (status.equalsIgnoreCase("failure")) {
						System.out.println("Failure -: Virtual Machine "
								+ "cannot be cloned");
					}
					if (status.equalsIgnoreCase("sucess")) {
						System.out
								.println("Virtual Machine Cloned  successfully.");
					}
				} catch (Exception e) {
					if (e instanceof org.apache.axis.AxisFault) {
						org.apache.axis.AxisFault fault = (org.apache.axis.AxisFault) e;
						org.w3c.dom.Element[] errors = fault.getFaultDetails();
						for (Element error : errors) {
							if (error.toString().indexOf("DuplicateName") != -1) {
								System.out
										.println("Virtual Machine with the same "
												+ "name already exists");
							} else if (error.toString().indexOf(
									"InvalidArgument") != -1) {
								System.out.println("Specification is invalid");
							} else if (error.toString().indexOf("InvalidName") != -1) {
								System.out
										.println("Virtual Machine name is empty or "
												+ "too long");
							} else if (error.toString().indexOf("RuntimeFault") != -1) {
								System.out.println(error.toString());
							} else {
								System.out.println(error.toString());
							}
						}
					} else {
						throw e;
					}
				}
			} else {
				System.out.println("Snapshot " + ecb.get_option("snapshotname")
						+ " doesn't exist");
			}
		} else {
			System.out.println("Virtual Machine " + ecb.get_option("vmname")
					+ " doesn't exist");
		}
	}

	protected ArrayList getIndependenetVirtualDiskKeys(
			ManagedObjectReference vmMOR) throws Exception {
		ArrayList independenetVirtualDiskKeys = new ArrayList();
		VirtualHardware hw = (VirtualHardware) ecb.getServiceUtil3()
				.getDynamicProperty(vmMOR, "config.hardware");

		VirtualDevice[] deviceArray = hw.getDevice();
		for (VirtualDevice element : deviceArray) {
			if (element.getClass().getCanonicalName().indexOf("VirtualDisk") != -1) {
				VirtualDisk vDisk = (VirtualDisk) element;
				String diskMode = "";
				if (vDisk.getBacking().getClass().getCanonicalName().indexOf(
						"VirtualDiskFlatVer1BackingInfo") != -1) {
					diskMode = ((VirtualDiskFlatVer1BackingInfo) vDisk
							.getBacking()).getDiskMode();
				} else if (vDisk.getBacking().getClass().getCanonicalName()
						.indexOf("VirtualDiskFlatVer2BackingInfo") != -1) {
					diskMode = ((VirtualDiskFlatVer2BackingInfo) vDisk
							.getBacking()).getDiskMode();
				} else if (vDisk.getBacking().getClass().getCanonicalName()
						.indexOf("VirtualDiskRawDiskMappingVer1BackingInfo") != -1) {
					diskMode = ((VirtualDiskRawDiskMappingVer1BackingInfo) vDisk
							.getBacking()).getDiskMode();
				} else if (vDisk.getBacking().getClass().getCanonicalName()
						.indexOf("VirtualDiskSparseVer1BackingInfo") != -1) {
					diskMode = ((VirtualDiskSparseVer1BackingInfo) vDisk
							.getBacking()).getDiskMode();
				} else if (vDisk.getBacking().getClass().getCanonicalName()
						.indexOf("VirtualDiskSparseVer2BackingInfo") != -1) {
					diskMode = ((VirtualDiskSparseVer2BackingInfo) vDisk
							.getBacking()).getDiskMode();
				}
				if (diskMode.indexOf("independent") != -1) {
					independenetVirtualDiskKeys.add(vDisk.getKey());
				}
			}
		}
		return independenetVirtualDiskKeys;
	}

	protected ManagedObjectReference getMOR(String name, String type,
			ManagedObjectReference root) throws Exception {
		ManagedObjectReference nameMOR = ecb.getServiceUtil3()
				.getDecendentMoRef(root, type, name);

		if (nameMOR == null) {
			System.out.println("Error:: " + name + " not found");
			return null;
		} else {
			return nameMOR;
		}
	}

	protected VirtualMachineSnapshotInfo getSnapshotInfo(
			ManagedObjectReference vmmor) throws Exception {
		ObjectContent[] snaps = ecb.getServiceUtil3().getObjectProperties(null,
				vmmor, new String[] { "snapshot" });

		VirtualMachineSnapshotInfo snapInfo = null;
		if (snaps != null && snaps.length > 0) {
			ObjectContent snapobj = snaps[0];
			DynamicProperty[] snapary = snapobj.getPropSet();
			if (snapary != null && snapary.length > 0) {
				snapInfo = ((VirtualMachineSnapshotInfo) (snapary[0]).getVal());
			}
		}
		return snapInfo;
	}

	protected ManagedObjectReference getSnapshotReference(
			ManagedObjectReference vmmor, String snapName) throws Exception {
		VirtualMachineSnapshotInfo snapInfo = getSnapshotInfo(vmmor);
		ManagedObjectReference snapmor = null;
		if (snapInfo != null) {
			VirtualMachineSnapshotTree[] snapTree = snapInfo
					.getRootSnapshotList();
			snapmor = traverseSnapshotInTree(snapTree, snapName);
		}
		return snapmor;
	}

	protected ManagedObjectReference traverseSnapshotInTree(
			VirtualMachineSnapshotTree[] snapTree, String findName) {
		ManagedObjectReference snapmor = null;
		if (snapTree == null) {
			return snapmor;
		}
		for (int i = 0; i < snapTree.length && snapmor == null; i++) {
			VirtualMachineSnapshotTree node = snapTree[i];

			if (findName != null && node.getName().equals(findName)) {
				snapmor = node.getSnapshot();
			} else {
				VirtualMachineSnapshotTree[] childTree = node
						.getChildSnapshotList();
				snapmor = traverseSnapshotInTree(childTree, findName);
			}
		}
		return snapmor;
	}
}