package com.intalio.vmware.vm;

import java.util.ArrayList;

import org.w3c.dom.Element;

import com.vmware.apputils.AppUtil;
import com.vmware.apputils.OptionSpec;
import com.vmware.apputils.version.ExtendedAppUtil;
import com.vmware.apputils.version.VersionUtil;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VirtualDevice;
import com.vmware.vim25.VirtualDeviceConfigSpec;
import com.vmware.vim25.VirtualDeviceConfigSpecFileOperation;
import com.vmware.vim25.VirtualDeviceConfigSpecOperation;
import com.vmware.vim25.VirtualDeviceFileBackingInfo;
import com.vmware.vim25.VirtualDisk;
import com.vmware.vim25.VirtualDiskFlatVer1BackingInfo;
import com.vmware.vim25.VirtualDiskFlatVer2BackingInfo;
import com.vmware.vim25.VirtualDiskRawDiskMappingVer1BackingInfo;
import com.vmware.vim25.VirtualDiskSparseVer1BackingInfo;
import com.vmware.vim25.VirtualDiskSparseVer2BackingInfo;
import com.vmware.vim25.VirtualHardware;
import com.vmware.vim25.VirtualMachineConfigSpec;

/**
 *<pre>
 * his sample creates a delta disk on top of an existing virtual disk in a VM,
 * and simultaneously removes the original disk using the reconfigure API.
 * 
 * b&gt;To run this samples following parameters are used :&lt;/b&gt;
 * 
 * mname            [required]   : Name of the virtual machine
 * evice            [required]   : Name of the new delta disk
 * iskname          [required]   : Name of the disk
 * 
 * 
 * b&gt;Command:&lt;/b&gt;
 * un.bat com.intalio.vmware.vm.VMDeltaDisk
 * -username [username] --password [password]
 * -vmname [myVM]
 * -device [myDeltaDisk]  -- diskname [dname1]
 *</pre>
 */

public class VMDeltaDisk {
	protected ExtendedAppUtil ecb = null;
	protected static AppUtil cb = null;
	protected static ManagedObjectReference provisionChkr = null;
	protected static VersionUtil versionUtil = null;

	public static OptionSpec[] constructOptions() {
		OptionSpec[] useroptions = new OptionSpec[3];
		useroptions[0] = new OptionSpec("vmname", "String", 1,
				"Name of the virtual machine", null);
		useroptions[1] = new OptionSpec("device", "String", 1,
				"Name of the new delta disk ", null);
		useroptions[2] = new OptionSpec("diskname", "String", 1,
				"Name of the disk", null);
		return useroptions;
	}

	public static void main(String[] args) throws Exception {
		VMDeltaDisk app = new VMDeltaDisk();
		cb = AppUtil.initialize("VMDeltaDisk", VMDeltaDisk.constructOptions(),
				args);
		cb.connect();
		String cookieString = VersionUtil.getCookieString(cb);
		app.createDeltaDisk(args, cookieString);
		cb.disConnect();
	}

	public void createDeltaDisk(String[] args, String cookieString)
			throws Exception {
		ArrayList apiVersions = VersionUtil.getSupportedVersions(cb
				.get_option("url"));
		if (!VersionUtil.isApiVersionSupported(apiVersions, "4.0")) {
			System.out
					.println("Feature for creating the delta disks is for K/L only and not "
							+ "supported by the old VI SDK 2.0 API");
			return;
		}
		ecb = ExtendedAppUtil.initialize("VMDeltaDisk", VMDeltaDisk
				.constructOptions(), args);
		ecb.connect(cookieString);
		ManagedObjectReference vmMOR = getMOR(ecb.get_option("vmname"),
				"VirtualMachine", null);

		if (vmMOR != null) {
			VirtualDisk vDisk = findVirtualDisk(vmMOR, ecb
					.get_option("diskname"));
			if (vDisk != null) {
				VirtualMachineConfigSpec configSpec = new VirtualMachineConfigSpec();
				VirtualDeviceConfigSpec deviceSpec = new VirtualDeviceConfigSpec();

				deviceSpec.setOperation(VirtualDeviceConfigSpecOperation.add);
				deviceSpec
						.setFileOperation(VirtualDeviceConfigSpecFileOperation.create);

				VirtualDisk newDisk = new VirtualDisk();

				newDisk.setCapacityInKB(vDisk.getCapacityInKB());
				if (vDisk.getShares() != null) {
					newDisk.setShares(vDisk.getShares());
				}

				if (vDisk.getConnectable() != null) {
					newDisk.setConnectable(vDisk.getConnectable());
				}

				if (vDisk.getControllerKey() != null) {
					newDisk.setControllerKey(vDisk.getControllerKey());
				}

				VirtualHardware hw = (VirtualHardware) ecb.getServiceUtil3()
						.getDynamicProperty(vmMOR, "config.hardware");
				VirtualDevice[] deviceArray = hw.getDevice();

				int virtualDiskCount = 0;
				for (VirtualDevice element : deviceArray) {
					if (element.getClass().getCanonicalName().indexOf(
							"VirtualDisk") != -1) {
						virtualDiskCount = virtualDiskCount + 1;
					}
				}

				VirtualDeviceFileBackingInfo fBacking = (VirtualDeviceFileBackingInfo) vDisk
						.getBacking();

				String dsName = (String) ecb.getServiceUtil3()
						.getDynamicProperty(fBacking.getDatastore(),
								"summary.name");

				newDisk.setUnitNumber(vDisk.getUnitNumber());
				newDisk.setKey(vDisk.getKey());

				if (vDisk.getBacking().getClass().getCanonicalName().indexOf(
						"VirtualDiskFlatVer1BackingInfo") != -1) {
					VirtualDiskFlatVer1BackingInfo temp = new VirtualDiskFlatVer1BackingInfo();
					temp.setDiskMode(((VirtualDiskFlatVer1BackingInfo) vDisk
							.getBacking()).getDiskMode());
					temp.setFileName("[" + dsName + "] "
							+ ecb.get_option("vmname") + "/"
							+ ecb.get_option("device") + ".vmdk");
					temp.setParent((VirtualDiskFlatVer1BackingInfo) vDisk
							.getBacking());
					newDisk.setBacking(temp);
				} else if (vDisk.getBacking().getClass().getCanonicalName()
						.indexOf("VirtualDiskFlatVer2BackingInfo") != -1) {
					VirtualDiskFlatVer2BackingInfo temp = new VirtualDiskFlatVer2BackingInfo();
					temp.setDiskMode(((VirtualDiskFlatVer2BackingInfo) vDisk
							.getBacking()).getDiskMode());
					temp.setFileName("[" + dsName + "] "
							+ ecb.get_option("vmname") + "/"
							+ ecb.get_option("device") + ".vmdk");
					temp.setParent((VirtualDiskFlatVer2BackingInfo) vDisk
							.getBacking());
					newDisk.setBacking(temp);
				} else if (vDisk.getBacking().getClass().getCanonicalName()
						.indexOf("VirtualDiskRawDiskMappingVer1BackingInfo") != -1) {
					VirtualDiskRawDiskMappingVer1BackingInfo temp = new VirtualDiskRawDiskMappingVer1BackingInfo();
					temp
							.setDiskMode(((VirtualDiskRawDiskMappingVer1BackingInfo) vDisk
									.getBacking()).getDiskMode());
					temp.setFileName("[" + dsName + "] "
							+ ecb.get_option("vmname") + "/"
							+ ecb.get_option("device") + ".vmdk");
					temp
							.setParent((VirtualDiskRawDiskMappingVer1BackingInfo) vDisk
									.getBacking());
					newDisk.setBacking(temp);
				} else if (vDisk.getBacking().getClass().getCanonicalName()
						.indexOf("VirtualDiskSparseVer1BackingInfo") != -1) {
					VirtualDiskSparseVer1BackingInfo temp = new VirtualDiskSparseVer1BackingInfo();
					temp.setDiskMode(((VirtualDiskSparseVer1BackingInfo) vDisk
							.getBacking()).getDiskMode());
					temp.setFileName("[" + dsName + "] "
							+ ecb.get_option("vmname") + "/"
							+ ecb.get_option("device") + ".vmdk");
					temp.setParent((VirtualDiskSparseVer1BackingInfo) vDisk
							.getBacking());
					newDisk.setBacking(temp);
				} else if (vDisk.getBacking().getClass().getCanonicalName()
						.indexOf("VirtualDiskSparseVer2BackingInfo") != -1) {
					VirtualDiskSparseVer2BackingInfo temp = new VirtualDiskSparseVer2BackingInfo();
					temp.setDiskMode(((VirtualDiskSparseVer2BackingInfo) vDisk
							.getBacking()).getDiskMode());
					temp.setFileName("[" + dsName + "] "
							+ ecb.get_option("vmname") + "/"
							+ ecb.get_option("device") + ".vmdk");
					temp.setParent((VirtualDiskSparseVer2BackingInfo) vDisk
							.getBacking());
					newDisk.setBacking(temp);
				}

				deviceSpec.setDevice(newDisk);

				VirtualDeviceConfigSpec removeDeviceSpec = new VirtualDeviceConfigSpec();
				removeDeviceSpec
						.setOperation(VirtualDeviceConfigSpecOperation.remove);
				removeDeviceSpec.setDevice(vDisk);

				VirtualDeviceConfigSpec[] arr = { removeDeviceSpec, deviceSpec };

				configSpec.setDeviceChange(arr);
				try {
					ManagedObjectReference taskMOR = ecb
							.getServiceConnection3().getService()
							.reconfigVM_Task(vmMOR, configSpec);
					String status = ecb.getServiceUtil3().waitForTask(taskMOR);
					if (status.equalsIgnoreCase("failure")) {
						System.out.println("Failure -: Delta Disk "
								+ "cannot be created");
					}
					if (status.equalsIgnoreCase("sucess")) {
						System.out.println("Delta Disk Created successfully.");
					}
				} catch (Exception e) {
					if (e instanceof org.apache.axis.AxisFault) {
						org.apache.axis.AxisFault fault = (org.apache.axis.AxisFault) e;
						org.w3c.dom.Element[] errors = fault.getFaultDetails();
						for (Element error : errors) {
							System.out.println(error.toString());
						}
					} else {
						throw e;
					}
				}
			} else {
				System.out.println("Virtual Disk " + ecb.get_option("diskname")
						+ " not found");
			}
		} else {
			System.out.println("Virtual Machine " + ecb.get_option("vmname")
					+ " doesn't exist");
		}
	}

	protected VirtualDisk findVirtualDisk(ManagedObjectReference vmMOR,
			String diskName) throws Exception {
		VirtualDisk ret = null;
		VirtualHardware hw = (VirtualHardware) ecb.getServiceUtil3()
				.getDynamicProperty(vmMOR, "config.hardware");
		VirtualDevice[] deviceArray = hw.getDevice();
		for (VirtualDevice element : deviceArray) {
			if (element.getClass().getCanonicalName().indexOf("VirtualDisk") != -1) {
				VirtualDisk vDisk = (VirtualDisk) element;
				if (diskName.equalsIgnoreCase(vDisk.getDeviceInfo().getLabel())) {
					ret = vDisk;
					break;
				}
			}
		}
		return ret;
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

}
