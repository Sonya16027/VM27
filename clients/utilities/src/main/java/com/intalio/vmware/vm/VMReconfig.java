package com.intalio.vmware.vm;

import com.vmware.apputils.AppUtil;
import com.vmware.apputils.OptionSpec;
import com.vmware.apputils.vim.VMUtils;
import com.vmware.vim.ConfigTarget;
import com.vmware.vim.DatastoreSummary;
import com.vmware.vim.ManagedObjectReference;
import com.vmware.vim.NetworkSummary;
import com.vmware.vim.ResourceAllocationInfo;
import com.vmware.vim.SharesInfo;
import com.vmware.vim.SharesLevel;
import com.vmware.vim.VirtualCdrom;
import com.vmware.vim.VirtualCdromIsoBackingInfo;
import com.vmware.vim.VirtualDevice;
import com.vmware.vim.VirtualDeviceConfigSpec;
import com.vmware.vim.VirtualDeviceConfigSpecFileOperation;
import com.vmware.vim.VirtualDeviceConfigSpecOperation;
import com.vmware.vim.VirtualDisk;
import com.vmware.vim.VirtualDiskFlatVer2BackingInfo;
import com.vmware.vim.VirtualEthernetCard;
import com.vmware.vim.VirtualEthernetCardNetworkBackingInfo;
import com.vmware.vim.VirtualIDEController;
import com.vmware.vim.VirtualMachineConfigInfo;
import com.vmware.vim.VirtualMachineConfigOption;
import com.vmware.vim.VirtualMachineConfigSpec;
import com.vmware.vim.VirtualMachineDatastoreInfo;
import com.vmware.vim.VirtualMachineNetworkInfo;
import com.vmware.vim.VirtualMachineRuntimeInfo;
import com.vmware.vim.VirtualPCNet32;

/**
 *<pre>
 * This sample reconfigures a virtual machine which includes reconfiguring
 * he disk size,disk mode etc.
 * 
 * b&gt;Parameters:&lt;/b&gt;
 * mname     [required]:  Name of the virtual machine
 * evice     [required]:  cpu|memory|disk|cd|nic
 * peration  [optional]:  add|remove
 * alue      [required]:  high|low|normal|numeric value 
 * isksize   [optional]:  Size of virtual disk
 * iskmode   [optional]:  persistent|independent_persistent,independent_nonpersistent
 * 
 * b&gt;Command:&lt;/b&gt; To configure virtual machine. i.e.changing the CPU shares to 100
 * un.bat com.intalio.vmware.vm.VMReconfig --url [webserviceurl] 
 * -username [username] --password [password] --vmname [vmname] --device [device]
 * -operation [operation] --value [value] --disksize [disksize] --diskmode [diskmode]
 * 
 * b&gt;Command:&lt;/b&gt; To configure a virtual machine to add a hard disk with name HardDiskA and 
 * isksize = 100
 * un.bat com.intalio.vmware.vm.VMReconfig --url [webserviceurl] 
 * -username [username] --password [password] --vmname [vmname] --device [disk]
 * -operation [add]  --value [A] --disksize [100]
 * 
 * b&gt;Command:&lt;/b&gt; To configure a virtual machine to delete a NIC
 * un.bat com.intalio.vmware.vm.VMReconfig --url [webserviceurl] 
 * -username [username] --password [password] --vmname [vmname] --device [nic]
 * -operation [add]  --value [name of the network]
 * </pre>
 */

public class VMReconfig {
	protected static VMUtils vmUtils = null;
	private static AppUtil cb = null;

	private static OptionSpec[] constructOptions() {
		OptionSpec[] useroptions = new OptionSpec[6];
		useroptions[0] = new OptionSpec("vmname", "String", 1,
				"Name of the virtual machine", null);
		useroptions[1] = new OptionSpec("device", "String", 1,
				"Type of device {cpu|memory|disk|cd|nic}", null);
		useroptions[2] = new OptionSpec("operation", "String", 0,
				"{add|remove}", null);
		useroptions[3] = new OptionSpec("value", "String", 1,
				"{numeric(For Memory and CPU high|"
						+ "low|normal|numeric value)|deviceId}", null);
		useroptions[4] = new OptionSpec("disksize", "Integer", 0,
				"Size of virtual disk", null);
		useroptions[5] = new OptionSpec("diskmode", "String", 0,
				"{persistent|independent_persistent,"
						+ "independent_nonpersistent}", null);
		return useroptions;
	}

	public static void main(String[] args) throws Exception {
		VMReconfig obj = new VMReconfig();
		cb = AppUtil.initialize("VMReconfig", VMReconfig.constructOptions(),
				args);
		boolean valid = obj.customValidation();
		if (valid) {
			cb.connect();
			obj.getVmMor(cb.get_option("vmname"));
			if (obj._virtualMachine != null) {
				vmUtils = new VMUtils(cb);
				obj.reConfig();
			} else {
				System.out.println("Virtual Machine " + cb.get_option("vmname")
						+ " Not Found");
			}
			cb.disConnect();
		}
	}

	protected ManagedObjectReference _virtualMachine = null;

	protected boolean customValidation() throws Exception {
		boolean flag = true;
		String device = cb.get_option("device");
		if (device.equalsIgnoreCase("disk")) {
			if ((!cb.option_is_set("operation"))
					|| (!cb.option_is_set("disksize"))
					|| (!cb.option_is_set("diskmode"))) {
				System.out.println("For update disk operation, disksize "
						+ "and diskmode are the Mandatory options");
				flag = false;
			}
		}
		if (device.equalsIgnoreCase("nic")) {
			if ((!cb.option_is_set("operation"))) {
				System.out
						.println("For update nic operation is the Mandatory options");
				flag = false;
			}
		}
		if (device.equalsIgnoreCase("cd")) {
			if ((!cb.option_is_set("operation"))) {
				System.out
						.println("For update cd operation is the Mandatory options");
				flag = false;
			}
		}
		if (device.equalsIgnoreCase("cpu") || device.equalsIgnoreCase("memory")) {
			String val = cb.get_option("value");
			if (!(val.equalsIgnoreCase("high") || val.equalsIgnoreCase("low")
					|| val.equalsIgnoreCase("normal") || Integer.parseInt(val) >= 0)) {
				// if(Integer.parseInt(cb.get_option("value")) <= 0 ) {
				System.out.println("CPU and Memory shares must be a either"
						+ " low|normal|high or greater than zero");
				flag = false;
			}
		}
		if (device.equalsIgnoreCase("disk")) {
			if (Integer.parseInt(cb.get_option("disksize")) <= 0) {
				System.out.println("Disksize must be a greater than zero");
				flag = false;
			}
		}
		if (cb.option_is_set("operation")) {
			if (cb.get_option("operation").equalsIgnoreCase("add")
					|| cb.get_option("operation").equalsIgnoreCase("remove")) {
			} else {
				System.out.println("Operation must be either add or remove");
				flag = false;
			}
		}
		return flag;
	}

	private VirtualDeviceConfigSpec getCDDeviceConfigSpec() throws Exception {
		String ops = cb.get_option("operation");
		VirtualDeviceConfigSpec cdSpec = new VirtualDeviceConfigSpec();
		VirtualMachineConfigInfo vmConfigInfo = (VirtualMachineConfigInfo) cb
				.getServiceUtil().getDynamicProperty(_virtualMachine, "config");

		if (ops.equalsIgnoreCase("Add")) {
			cdSpec.setOperation(VirtualDeviceConfigSpecOperation.add);

			VirtualCdrom cdrom = new VirtualCdrom();

			VirtualCdromIsoBackingInfo cdDeviceBacking = new VirtualCdromIsoBackingInfo();
			DatastoreSummary dsum = getDataStoreSummary();
			cdDeviceBacking.setDatastore(dsum.getDatastore());
			cdDeviceBacking.setFileName("[" + dsum.getName() + "] "
					+ cb.get_option("vmname") + "/" + cb.get_option("value")
					+ ".iso");

			VirtualDevice vd = getIDEController();
			cdrom.setBacking(cdDeviceBacking);
			cdrom.setControllerKey(vd.getKey());
			cdrom.setUnitNumber(vd.getUnitNumber());
			cdrom.setKey(-1);

			cdSpec.setDevice(cdrom);

			return cdSpec;
		} else {
			VirtualCdrom cdRemove = null;
			VirtualDevice[] test = vmConfigInfo.getHardware().getDevice();
			cdSpec.setOperation(VirtualDeviceConfigSpecOperation.remove);
			for (VirtualDevice element : test) {
				if (element.getDeviceInfo().getLabel().equalsIgnoreCase(
						cb.get_option("value"))) {
					cdRemove = (VirtualCdrom) element;
				}
			}
			if (cdRemove != null) {
				cdSpec.setDevice(cdRemove);
			} else {
				System.out.println("No device available "
						+ cb.get_option("value"));
				return null;
			}
		}
		return cdSpec;
	}

	private String getDataStoreName(int size) throws Exception {
		String dsName = null;
		ManagedObjectReference[] datastores = (ManagedObjectReference[]) cb
				.getServiceUtil().getDynamicProperty(_virtualMachine,
						"datastore");
		for (int i = 0; i < datastores.length; i++) {
			DatastoreSummary ds = (DatastoreSummary) cb.getServiceUtil()
					.getDynamicProperty(datastores[i], "summary");
			if (ds.getFreeSpace() > size) {
				dsName = ds.getName();
				i = datastores.length + 1;
			}
		}
		return dsName;
	}

	private DatastoreSummary getDataStoreSummary() throws Exception {
		DatastoreSummary dsSum = null;
		VirtualMachineRuntimeInfo vmRuntimeInfo = (VirtualMachineRuntimeInfo) cb
				.getServiceUtil()
				.getDynamicProperty(_virtualMachine, "runtime");
		ManagedObjectReference envBrowser = (ManagedObjectReference) cb
				.getServiceUtil().getDynamicProperty(_virtualMachine,
						"environmentBrowser");
		ManagedObjectReference hmor = vmRuntimeInfo.getHost();

		if (hmor != null) {
			ConfigTarget configTarget = cb.getConnection().getService()
					.queryConfigTarget(envBrowser, null);
			if (configTarget.getDatastore() != null) {
				for (int i = 0; i < configTarget.getDatastore().length; i++) {
					VirtualMachineDatastoreInfo vdsInfo = configTarget
							.getDatastore(i);
					DatastoreSummary dsSummary = vdsInfo.getDatastore();
					if (dsSummary.isAccessible()) {
						dsSum = dsSummary;
						break;
					}
				}
			}
			return dsSum;
		} else {
			System.out.println("No Datastore found");
			return null;
		}
	}

	private VirtualDevice[] getDefaultDevices() throws Exception {
		VirtualMachineRuntimeInfo vmRuntimeInfo = (VirtualMachineRuntimeInfo) cb
				.getServiceUtil()
				.getDynamicProperty(_virtualMachine, "runtime");
		ManagedObjectReference envBrowser = (ManagedObjectReference) cb
				.getServiceUtil().getDynamicProperty(_virtualMachine,
						"environmentBrowser");
		ManagedObjectReference hmor = vmRuntimeInfo.getHost();

		VirtualMachineConfigOption cfgOpt = cb.getConnection().getService()
				.queryConfigOption(envBrowser, null, null);
		VirtualDevice[] defaultDevs = null;

		if (cfgOpt == null) {
			throw new Exception(
					"No VirtualHardwareInfo found in ComputeResource");
		} else {
			defaultDevs = cfgOpt.getDefaultDevice();
			if (defaultDevs == null) {
				throw new Exception("No Datastore found in ComputeResource");
			}
		}
		return defaultDevs;
	}

	private VirtualDeviceConfigSpec getDiskDeviceConfigSpec() throws Exception {
		String ops = cb.get_option("operation");
		VirtualDeviceConfigSpec diskSpec = new VirtualDeviceConfigSpec();
		VirtualMachineConfigInfo vmConfigInfo = (VirtualMachineConfigInfo) cb
				.getServiceUtil().getDynamicProperty(_virtualMachine, "config");

		if (ops.equalsIgnoreCase("Add")) {
			VirtualDisk disk = new VirtualDisk();
			VirtualDiskFlatVer2BackingInfo diskfileBacking = new VirtualDiskFlatVer2BackingInfo();
			String dsName = getDataStoreName(Integer.parseInt(cb
					.get_option("disksize")));

			int ckey = 0;
			int unitNumber = 0;

			VirtualDevice[] test = vmConfigInfo.getHardware().getDevice();
			for (VirtualDevice element : test) {
				if (element.getDeviceInfo().getLabel().equalsIgnoreCase(
						"SCSI Controller 0")) {
					ckey = element.getKey();
				}
			}

			unitNumber = test.length + 1;
			String fileName = "[" + dsName + "] " + cb.get_option("vmname")
					+ "/" + cb.get_option("value") + ".vmdk";

			diskfileBacking.setFileName(fileName);
			diskfileBacking.setDiskMode(cb.get_option("diskmode"));

			disk.setControllerKey(ckey);
			disk.setUnitNumber(unitNumber);
			disk.setBacking(diskfileBacking);
			int size = 1024 * (Integer.parseInt(cb.get_option("disksize")));
			disk.setCapacityInKB(size);
			disk.setKey(-1);

			diskSpec.setOperation(VirtualDeviceConfigSpecOperation.add);
			diskSpec
					.setFileOperation(VirtualDeviceConfigSpecFileOperation.create);
			diskSpec.setDevice(disk);
		} else if (ops.equalsIgnoreCase("Remove")) {
			VirtualDisk disk = null;
			VirtualDiskFlatVer2BackingInfo diskfileBacking = new VirtualDiskFlatVer2BackingInfo();

			VirtualDevice[] test = vmConfigInfo.getHardware().getDevice();
			for (VirtualDevice element : test) {
				if (element.getDeviceInfo().getLabel().equalsIgnoreCase(
						cb.get_option("value"))) {
					disk = (VirtualDisk) element;
				}
			}
			if (disk != null) {
				diskSpec.setOperation(VirtualDeviceConfigSpecOperation.remove);
				diskSpec
						.setFileOperation(VirtualDeviceConfigSpecFileOperation.destroy);
				diskSpec.setDevice(disk);
			} else {
				System.out.println("No device found " + cb.get_option("value"));
				return null;
			}
		}
		return diskSpec;
	}

	private VirtualDevice getIDEController() throws Exception {
		VirtualDevice ideCtlr = null;
		VirtualDevice[] defaultDevices = getDefaultDevices();
		for (VirtualDevice defaultDevice : defaultDevices) {
			if (defaultDevice instanceof VirtualIDEController) {
				ideCtlr = defaultDevice;
				break;
			}
		}
		return ideCtlr;
	}

	private String getNetworkName() throws Exception {
		String networkName = null;
		VirtualMachineRuntimeInfo vmRuntimeInfo = (VirtualMachineRuntimeInfo) cb
				.getServiceUtil()
				.getDynamicProperty(_virtualMachine, "runtime");
		ManagedObjectReference envBrowser = (ManagedObjectReference) cb
				.getServiceUtil().getDynamicProperty(_virtualMachine,
						"environmentBrowser");
		ManagedObjectReference hmor = vmRuntimeInfo.getHost();

		if (hmor != null) {
			ConfigTarget configTarget = cb.getConnection().getService()
					.queryConfigTarget(envBrowser, null);
			if (configTarget.getNetwork() != null) {
				for (int i = 0; i < configTarget.getNetwork().length; i++) {
					VirtualMachineNetworkInfo netInfo = configTarget
							.getNetwork(i);
					NetworkSummary netSummary = netInfo.getNetwork();
					if (netSummary.isAccessible()) {
						if (netSummary.getName().equalsIgnoreCase(
								cb.get_option("value"))) {
							networkName = netSummary.getName();
							break;
						}
					}
				}
				if (networkName == null) {
					System.out.println("Specify the Correct Network Name");
					return null;
				}
			}
			return networkName;
		} else {
			System.out.println("No Host is responsible to run this VM");
			return null;
		}
	}

	private VirtualDeviceConfigSpec getNICDeviceConfigSpec() throws Exception {
		String ops = cb.get_option("operation");
		VirtualDeviceConfigSpec nicSpec = new VirtualDeviceConfigSpec();
		VirtualMachineConfigInfo vmConfigInfo = (VirtualMachineConfigInfo) cb
				.getServiceUtil().getDynamicProperty(_virtualMachine, "config");

		if (ops.equalsIgnoreCase("Add")) {
			String networkName = getNetworkName();
			if (networkName != null) {
				nicSpec.setOperation(VirtualDeviceConfigSpecOperation.add);
				VirtualEthernetCard nic = new VirtualPCNet32();
				VirtualEthernetCardNetworkBackingInfo nicBacking = new VirtualEthernetCardNetworkBackingInfo();
				nicBacking.setDeviceName(networkName);
				nic.setAddressType("generated");
				nic.setBacking(nicBacking);
				nic.setKey(4);
				nicSpec.setDevice(nic);
			} else {
				return null;
			}
		} else if (ops.equalsIgnoreCase("Remove")) {
			VirtualEthernetCard nic = null;
			VirtualDevice[] test = vmConfigInfo.getHardware().getDevice();
			nicSpec.setOperation(VirtualDeviceConfigSpecOperation.remove);
			for (VirtualDevice element : test) {
				if (element.getDeviceInfo().getLabel().equalsIgnoreCase(
						cb.get_option("value"))) {
					nic = (VirtualEthernetCard) element;
				}
			}
			if (nic != null) {
				nicSpec.setDevice(nic);
			} else {
				System.out.println("No device available "
						+ cb.get_option("value"));
				return null;
			}
		}
		return nicSpec;
	}

	private ResourceAllocationInfo getShares() throws Exception {
		ResourceAllocationInfo raInfo = new ResourceAllocationInfo();
		SharesInfo sharesInfo = new SharesInfo();

		String val = cb.get_option("value");
		if (val.equalsIgnoreCase(SharesLevel._high)) {
			sharesInfo.setLevel(SharesLevel.high);
		} else if (val.equalsIgnoreCase(SharesLevel._normal)) {
			sharesInfo.setLevel(SharesLevel.normal);
		} else if (val.equalsIgnoreCase(SharesLevel._low)) {
			sharesInfo.setLevel(SharesLevel.low);
		} else {
			sharesInfo.setLevel(SharesLevel.custom);
			sharesInfo.setShares(Integer.parseInt(val));
		}
		raInfo.setShares(sharesInfo);
		return raInfo;
	}

	protected void getVmMor(String vmName) throws Exception {
		_virtualMachine = cb.getServiceUtil().getDecendentMoRef(null,
				"VirtualMachine", vmName);
	}

	private void monitorTask(ManagedObjectReference tmor) throws Exception {
		if (tmor != null) {
			String result = cb.getServiceUtil().waitForTask(tmor);
			if (result.equalsIgnoreCase("sucess")) {
				System.out.println("Task Completed Sucessfully");
			} else {
				System.out.println("Failure " + result);
			}
		}
	}

	protected void reConfig() throws Exception {
		String deviceType = cb.get_option("device");
		VirtualMachineConfigSpec vmConfigSpec = new VirtualMachineConfigSpec();

		if (deviceType.equalsIgnoreCase("memory")) {
			System.out
					.println("Reconfiguring The Virtual Machine For Memory Update "
							+ cb.get_option("vmname"));
			try {
				vmConfigSpec.setMemoryAllocation(getShares());
			} catch (java.lang.NumberFormatException nfe) {
				System.out.println("Value of Memory update must "
						+ "be either Custom or Integer");
				return;
			}
		} else if (deviceType.equalsIgnoreCase("cpu")) {
			System.out
					.println("Reconfiguring The Virtual Machine For CPU Update "
							+ cb.get_option("vmname"));
			try {
				vmConfigSpec.setCpuAllocation(getShares());
			} catch (java.lang.NumberFormatException nfe) {
				System.out.println("Value of CPU update must "
						+ "be either Custom or Integer");
				return;
			}
		} else if (deviceType.equalsIgnoreCase("disk")) {
			System.out
					.println("Reconfiguring The Virtual Machine For Disk Update "
							+ cb.get_option("vmname"));
			VirtualDeviceConfigSpec vdiskSpec = getDiskDeviceConfigSpec();
			if (vdiskSpec != null) {
				VirtualDeviceConfigSpec[] vdiskSpecArray = { vdiskSpec };
				vmConfigSpec.setDeviceChange(vdiskSpecArray);
			} else {
				return;
			}
		} else if (deviceType.equalsIgnoreCase("nic")) {
			System.out
					.println("Reconfiguring The Virtual Machine For NIC Update "
							+ cb.get_option("vmname"));
			VirtualDeviceConfigSpec nicSpec = getNICDeviceConfigSpec();
			if (nicSpec != null) {
				VirtualDeviceConfigSpec[] nicSpecArray = { nicSpec };
				vmConfigSpec.setDeviceChange(nicSpecArray);
			} else {
				return;
			}
		} else if (deviceType.equalsIgnoreCase("cd")) {
			System.out
					.println("Reconfiguring The Virtual Machine For CD Update "
							+ cb.get_option("vmname"));
			VirtualDeviceConfigSpec cdSpec = getCDDeviceConfigSpec();
			if (cdSpec != null) {
				VirtualDeviceConfigSpec[] cdSpecArray = { cdSpec };
				vmConfigSpec.setDeviceChange(cdSpecArray);
			} else {
				return;
			}
		} else {
			System.out.println("Invalid device type [memory|cpu|disk|nic|cd]");
			return;
		}

		ManagedObjectReference tmor = cb.getConnection().getService()
				.reconfigVM_Task(_virtualMachine, vmConfigSpec);
		monitorTask(tmor);
	}
}
