package com.intalio.vmware.vm;

import java.util.ArrayList;

import com.vmware.apputils.AppUtil;
import com.vmware.apputils.ArgumentHandlingException;
import com.vmware.apputils.OptionSpec;
import com.vmware.apputils.vim.VMUtils;
import com.vmware.vim.DynamicProperty;
import com.vmware.vim.InvalidPowerState;
import com.vmware.vim.InvalidState;
import com.vmware.vim.ManagedObjectReference;
import com.vmware.vim.ObjectContent;
import com.vmware.vim.TaskInfo;
import com.vmware.vim.ToolsUnavailable;

/**
 * <pre>
 * This sample Performs powerops operations on the virtual machines
 * 
 * To run this samples following parameters are used:
 * 
 * vmname      [optional] : Name of the virtual machine
 * operation   [optional] : Type of the operation
 * folder      [optional] : Name of the folder
 * datacenter  [optional] : Name of the datacenter
 * pool        [optional] : Name of the resource pool 
 * ipaddress   [optional] : ipaddress of the virtual machine
 * guestid     [optional] : guestid of the virtual machine
 * host        [optional] : Name of the host
 * operation   [optional] : Name of the Operation
 * &lt;b&gt;Command Line:&lt;b&gt;
 * run.bat com.intalio.vmware.vm.VMpowerOps --url &lt;webserviceurl&gt; --username &lt;username&gt; --password  &lt;password&gt; 
 * -operation &lt;operation name reboot|poweron|poweroff|reset|standby|suspend|shutdown&gt; --folder &lt;myfolder&gt; 
 * -guestid &lt;winXPProGuest|any other&gt; --datacenter &lt;mydatacenter&gt;
 *</pre>
 */

public class VMpowerOps {

	private static AppUtil cb = null;
	protected static VMUtils vmUtils = null;

	private static OptionSpec[] constructOptions() {
		OptionSpec[] useroptions = new OptionSpec[8];
		useroptions[0] = new OptionSpec("vmname", "String", 0,
				"Name of the virtual machine", null);
		useroptions[1] = new OptionSpec("host", "String", 0,
				"Name of the host", null);
		useroptions[2] = new OptionSpec("datacenter", "String", 0,
				"Name of the datacenter", null);
		useroptions[3] = new OptionSpec("folder", "String", 0,
				"Name of the folder", null);
		useroptions[4] = new OptionSpec("pool", "String", 0,
				"Name of the resource pool", null);
		useroptions[5] = new OptionSpec("guestid", "String", 0,
				"Id of the guestOS", null);
		useroptions[6] = new OptionSpec("ipaddress", "String", 0,
				"IpAddress of the guestOS", null);
		useroptions[7] = new OptionSpec("operation", "String", 1,
				"operation to be performed", null);
		return useroptions;
	}

	/**
	 * The main entry point for the application.
	 */
	public static void main(String[] args) throws Exception {
		VMpowerOps obj = new VMpowerOps();
		cb = AppUtil.initialize("VMpowerOps", VMpowerOps.constructOptions(),
				args);
		obj.validate();
		cb.connect();
		vmUtils = new VMUtils(cb);
		obj.runOperation();
		cb.disConnect();
	}

	String vmname = null;
	String operation = null;
	String host = null;
	String folder = null;
	String datacenter = null;
	String pool = null;
	String guestid = null;

	String ipaddress = null;

	String[][] filter = null;

	private DynamicProperty[] getDynamicProarray(ManagedObjectReference MOR,
			String pName) throws Exception {

		ObjectContent[] objContent = cb.getServiceUtil().getObjectProperties(
				null, MOR, new String[] { pName });
		ObjectContent contentObj = objContent[0];
		DynamicProperty[] objArr = contentObj.getPropSet();
		return objArr;
	}

	private boolean getTaskInfo(ManagedObjectReference taskmor)
			throws Exception {
		boolean valid = false;
		DynamicProperty[] scsiArry = getDynamicProarray(taskmor, "info");
		TaskInfo tinfo = ((TaskInfo) (scsiArry[0]).getVal());
		String res = cb.getServiceUtil().waitForTask(taskmor);
		if (res.equalsIgnoreCase("sucess")) {
			valid = true;
		} else {
			valid = false;
		}
		/*
		 * if (tinfo.getState().getValue().equalsIgnoreCase("error")) {
		 * System.out.println("Error "+tinfo.getError().getLocalizedMessage());
		 * valid = true; } else{ valid = false; }
		 */
		return valid;
	}

	private ArrayList getVms() throws Exception {
		ArrayList vmList = new ArrayList();
		if (cb.option_is_set("host")) {
			host = cb.get_option("host");
		}
		if (cb.option_is_set("folder")) {
			folder = cb.get_option("folder");
		}
		if (cb.option_is_set("datacenter")) {
			datacenter = cb.get_option("datacenter");
		}
		if (cb.option_is_set("vmname")) {
			vmname = cb.get_option("vmname");
		}
		if (cb.option_is_set("pool")) {
			pool = cb.get_option("pool");
		}
		if (cb.option_is_set("ipaddress")) {
			ipaddress = cb.get_option("ipaddress");
		}
		if (cb.option_is_set("guestid")) {
			guestid = cb.get_option("guestid");
		}
		// filter = new String[][] { new String[] { "summary.config.guestId",
		// "winXPProGuest",},};
		filter = new String[][] {
				new String[] { "guest.ipAddress", ipaddress, },
				new String[] { "summary.config.guestId", guestid, } };
		vmList = vmUtils.getVMs("VirtualMachine", datacenter, folder, pool,
				vmname, host, filter);
		return vmList;
	}

	private void powerOffVM(ArrayList vmList) throws Exception {
		for (int i = 0; i < vmList.size(); i++) {
			String vmName = (String) cb.getServiceUtil().getDynamicProperty(
					(ManagedObjectReference) vmList.get(i), "name");
			ManagedObjectReference vmMOR = (ManagedObjectReference) vmList
					.get(i);
			ManagedObjectReference taskmor = null;
			try {
				System.out.println("Powering off virtualmachine '" + vmName
						+ "'");
				taskmor = cb.getConnection().getService()
						.powerOffVM_Task(vmMOR);
				boolean result = getTaskInfo(taskmor);
				if (result) {
					System.out.println("Virtual Machine " + vmName
							+ " powered off successfuly");
				}
			} catch (Exception e) {
				System.out.println("Error");
				e.printStackTrace();
			}
		}
	}

	private void powerOnVM(ArrayList vmList) throws Exception {
		for (int i = 0; i < vmList.size(); i++) {
			String vmName = (String) cb.getServiceUtil().getDynamicProperty(
					(ManagedObjectReference) vmList.get(i), "name");
			ManagedObjectReference vmMOR = (ManagedObjectReference) vmList
					.get(i);
			ManagedObjectReference taskmor = null;
			try {
				System.out.println("Powering on virtualmachine '" + vmName
						+ "'");
				taskmor = cb.getConnection().getService().powerOnVM_Task(vmMOR,
						null);

				boolean result = getTaskInfo(taskmor);
				if (result) {
					System.out.println("" + vmName + " powered on successfuly");
				}

			} catch (InvalidPowerState e) {
				System.out.println("Virtual Machine is already powered on");
			} catch (Exception e) {
				System.out.println("Error");
				e.printStackTrace();
			}
		}
	}

	private void rebootVM(ArrayList vmList) throws Exception {
		for (int i = 0; i < vmList.size(); i++) {
			String vmName = (String) cb.getServiceUtil().getDynamicProperty(
					(ManagedObjectReference) vmList.get(i), "name");
			ManagedObjectReference vmMOR = (ManagedObjectReference) vmList
					.get(i);
			ManagedObjectReference taskmor = null;
			try {
				System.out.println("Rebooting virtualmachine '" + vmName + "'");
				cb.getConnection().getService().rebootGuest(vmMOR);
				System.out.println("Guest os in vm '" + vmName + "' rebooted");
			} catch (InvalidPowerState e) {
				System.out.println("Error : Operation cannot be performed"
						+ " in the current power state");
			} catch (InvalidState e) {
				System.out.println(" Error : Operation cannot be performed"
						+ " because of the virtual machine's current state");
			} catch (ToolsUnavailable e) {
				System.out.println("Error :VMware Tools are not running.");
			} catch (Exception e) {
				System.out.println("Error");
				e.printStackTrace();
			}
		}
	}

	private void resetVM(ArrayList vmList) throws Exception {
		for (int i = 0; i < vmList.size(); i++) {
			String vmName = (String) cb.getServiceUtil().getDynamicProperty(
					(ManagedObjectReference) vmList.get(i), "name");
			ManagedObjectReference vmMOR = (ManagedObjectReference) vmList
					.get(i);
			ManagedObjectReference taskmor = null;
			try {
				System.out.println("Reseting virtualmachine '" + vmName + "'");
				taskmor = cb.getConnection().getService().resetVM_Task(vmMOR);
				boolean result = getTaskInfo(taskmor);
				if (result) {
					System.out.println("Virtual Machine " + vmName
							+ " reset successfuly");
				}
			} catch (Exception e) {
				System.out.println("Error");
				e.printStackTrace();
			}
		}
	}

	protected void runOperation() throws Exception {
		String operation = cb.get_option("operation");
		ArrayList arrList = getVms();
		// System.out.println("in run operation");
		if (arrList == null) {
			// System.out.println("No vm found");
			return;
		} else {
			if (operation.equalsIgnoreCase("poweron")) {
				powerOnVM(arrList);
			} else if (operation.equalsIgnoreCase("poweroff")) {
				powerOffVM(arrList);
			} else if (operation.equalsIgnoreCase("reset")) {
				resetVM(arrList);
			} else if (operation.equalsIgnoreCase("suspend")) {
				suspendVM(arrList);
			} else if (operation.equalsIgnoreCase("reboot")) {
				rebootVM(arrList);
			} else if (operation.equalsIgnoreCase("shutdown")) {
				shutdownVM(arrList);
			} else if (operation.equalsIgnoreCase("standby")) {
				standbyVM(arrList);
			}
		}
	}

	private void shutdownVM(ArrayList vmList) throws Exception {
		for (int i = 0; i < vmList.size(); i++) {
			String vmName = (String) cb.getServiceUtil().getDynamicProperty(
					(ManagedObjectReference) vmList.get(i), "name");
			ManagedObjectReference vmMOR = (ManagedObjectReference) vmList
					.get(i);
			ManagedObjectReference taskmor = null;
			try {
				System.out.println("Shutting down virtualmachine '" + vmName
						+ "'");
				cb.getConnection().getService().shutdownGuest(vmMOR);
				System.out.println("Guest os in vm '" + vmName + "' shutdown");
			} catch (InvalidPowerState e) {
				System.out.println("Error : Operation cannot be performed"
						+ " in the current power state");
			} catch (InvalidState e) {
				System.out.println("Error :  Operation cannot be performed"
						+ " because of the virtual machine's current state");
			} catch (ToolsUnavailable e) {
				System.out.println("Error :  VMware Tools are not running.");
			} catch (Exception e) {
				System.out.println("Error");
				e.printStackTrace();
			}
		}
	}

	private void standbyVM(ArrayList vmList) throws Exception {
		for (int i = 0; i < vmList.size(); i++) {
			String vmName = (String) cb.getServiceUtil().getDynamicProperty(
					(ManagedObjectReference) vmList.get(i), "name");
			ManagedObjectReference vmMOR = (ManagedObjectReference) vmList
					.get(i);
			ManagedObjectReference taskmor = null;
			try {
				System.out.println("Putting the guestOs of vm '" + vmName
						+ "' in standby mode");
				cb.getConnection().getService().standbyGuest(vmMOR);
				System.out.println("GuestOs of vm '" + vmName
						+ "' put in standby mode");

			} catch (InvalidPowerState e) {
				System.out.println("Error :  Operation cannot be "
						+ "performed in the current power state");
			} catch (InvalidState e) {
				System.out.println("Error : Operation cannot be performed"
						+ " because of the virtual machine's current state");
			} catch (ToolsUnavailable e) {
				System.out.println("Error : VMware Tools are not running.");
			} catch (Exception e) {
				System.out.println("Error");
				e.printStackTrace();
			}
		}
	}

	private void suspendVM(ArrayList vmList) throws Exception {
		for (int i = 0; i < vmList.size(); i++) {
			String vmName = (String) cb.getServiceUtil().getDynamicProperty(
					(ManagedObjectReference) vmList.get(i), "name");
			ManagedObjectReference vmMOR = (ManagedObjectReference) vmList
					.get(i);
			ManagedObjectReference taskmor = null;
			try {
				System.out
						.println("Suspending virtualmachine '" + vmName + "'");
				taskmor = cb.getConnection().getService().suspendVM_Task(vmMOR);
				boolean result = getTaskInfo(taskmor);
				if (result) {
					System.out.println("Virtual Machine " + vmName
							+ " suspended successfuly");
				}
			} catch (Exception e) {
				System.out.println("Error");
				e.printStackTrace();
			}
		}
	}

	protected void validate() throws Exception {
		String operation = cb.get_option("operation");
		if (!(operation.equalsIgnoreCase("poweron"))
				&& !(operation.equalsIgnoreCase("poweroff"))
				&& !(operation.equalsIgnoreCase("reset"))
				&& !(operation.equalsIgnoreCase("standby"))
				&& !(operation.equalsIgnoreCase("shutdown"))
				&& !(operation.equalsIgnoreCase("reboot"))
				&& !(operation.equalsIgnoreCase("suspend"))) {

			System.out.println("Invalid Operation name ' " + operation
					+ "' valid operations are poweron, standby,"
					+ " poweroff, standby, reboot, shutdown, suspend");
			cb.displayUsage();
			throw new ArgumentHandlingException("Exception running");
		}
	}
}
