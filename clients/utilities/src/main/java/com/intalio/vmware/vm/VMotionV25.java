package com.intalio.vmware.vm;

import com.vmware.apputils.version.ExtendedAppUtil;
import com.vmware.apputils.version.VersionUtil;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.TaskInfo;
import com.vmware.vim25.TaskInfoState;
import com.vmware.vim25.VirtualMachineRelocateSpec;

public class VMotionV25 {
	ExtendedAppUtil ecb = null;
	private static ManagedObjectReference provisionChkr = null;
	public VMotion vmotionObj = null;
	private static VersionUtil versionUtil = null;

	private ManagedObjectReference browseDSMOR(ManagedObjectReference[] dsMOR,
			String dsName) {
		ManagedObjectReference dataMOR = null;
		try {
			if (dsMOR != null && dsMOR.length > 0) {
				for (ManagedObjectReference element : dsMOR) {
					String dsname = (String) ecb.getServiceUtil3()
							.getDynamicProperty(element, "summary.name");
					if (dsname.equalsIgnoreCase(dsName)) {
						dataMOR = element;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dataMOR;
	}

	/*
	 * In this method we check three scenarios for VmotionMigration Capability
	 * Relocation CapabilityQuery Vmotion Compatibility
	 */

	/*
	 * This function is used for checking the migration feasibility
	 * 
	 * @param Virtual Machine MOR
	 * 
	 * @param TargetHost MOR
	 * 
	 * @param ResourcePool MOR
	 * 
	 * @return boolean yes for feasible false for not feasible
	 */
	private boolean checkMigrate(ManagedObjectReference vmMOR,
			ManagedObjectReference hostMOR, ManagedObjectReference poolMOR)
			throws Exception {
		boolean migrate = false;

		try {
			ManagedObjectReference taskMOR = ecb.getServiceConnection3()
					.getService().checkMigrate_Task(provisionChkr, vmMOR,
							hostMOR, poolMOR, null, null);
			String res = monitorTask(taskMOR);
			if (res.equalsIgnoreCase("sucess")) {
				migrate = true;
			} else {
				migrate = false;

			}
		} catch (Exception e) {
			migrate = false;
		}
		return migrate;
	}

	/*
	 * This function is used for checking the relocation feasibility
	 * 
	 * @param Virtual Machine MOR
	 * 
	 * @param TargetHost MOR
	 * 
	 * @param ResourcePool MOR
	 * 
	 * @param TargetDatastore MOR
	 * 
	 * @return boolean yes for feasible false for not feasible
	 */

	private boolean checkRelocation(ManagedObjectReference vmMOR,
			ManagedObjectReference hostMOR, ManagedObjectReference poolMOR,
			ManagedObjectReference dsMOR) throws Exception {
		boolean relocate = false;

		try {
			VirtualMachineRelocateSpec relSpec = new VirtualMachineRelocateSpec();
			relSpec.setDatastore(dsMOR);
			relSpec.setHost(hostMOR);
			relSpec.setPool(poolMOR);
			ManagedObjectReference taskMOR = ecb.getServiceConnection3()
					.getService().checkRelocate_Task(provisionChkr, vmMOR,
							relSpec, null);
			String res = monitorTask(taskMOR);
			if (res.equalsIgnoreCase("sucess")) {
				relocate = true;
			} else {
				relocate = false;

			}
		} catch (Exception e) {
			relocate = false;
		}
		return relocate;
	}

	private void checkVMotionCompatibility() throws Exception {

		String vmname = ecb.get_option("vmname");
		String sourcehost = ecb.get_option("sourcehost");
		String targethost = ecb.get_option("targethost");
		String targetpool = ecb.get_option("targetpool");
		String dataname = ecb.get_option("targetdatastore");

		ManagedObjectReference hostMOR = getMOR(sourcehost, "HostSystem", null);
		ManagedObjectReference vmMOR = getMOR(vmname, "VirtualMachine", hostMOR);
		ManagedObjectReference targethostMOR = getMOR(targethost, "HostSystem",
				null);
		ManagedObjectReference poolMOR = getMOR(targetpool, "ResourcePool",
				null);
		ManagedObjectReference[] dsTarget = (ManagedObjectReference[]) ecb
				.getServiceUtil3().getDynamicProperty(targethostMOR,
						"datastore");
		ManagedObjectReference dsMOR = browseDSMOR(dsTarget, dataname);
		if (dsMOR == null) {
			System.out.println("Datastore " + dataname + " not found");
		}
		if (vmMOR == null || hostMOR == null || targethostMOR == null
				|| dsMOR == null || poolMOR == null) {
			return;
		}
		boolean query = queryVMotionCompatibility(vmMOR, hostMOR, targethostMOR);
		boolean migrate = checkMigrate(vmMOR, targethostMOR, poolMOR);
		boolean relocation = checkRelocation(vmMOR, targethostMOR, poolMOR,
				dsMOR);

		if ((query) && (migrate) && (relocation)) {
			System.out.println("VMotion is feasible on VM " + vmname
					+ " from host " + sourcehost + " to " + targethost);
		} else {
			System.out.println("VMotion is not feasible on VM " + vmname
					+ " from host " + sourcehost + " to " + targethost);
		}

	}

	/*
	 * This function is used for querying the VMotionCompatibility
	 * 
	 * @param Virtual Machine MOR
	 * 
	 * @param TargetHost MOR
	 * 
	 * @param SourceHost MOR
	 * 
	 * @return boolean yes for feasible false for not feasible
	 */

	private ManagedObjectReference getMOR(String name, String type,
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

	public String monitorTask(ManagedObjectReference taskmor) throws Exception {
		Object[] result = ecb.getServiceUtil3().waitForValues(
				taskmor,
				new String[] { "info.state", "info.error" },
				new String[] { "state" },
				new Object[][] { new Object[] { TaskInfoState.success,
						TaskInfoState.error } });
		if (result[0].equals(TaskInfoState.success)) {
			return "sucess";
		} else {
			TaskInfo tinfo = (TaskInfo) ecb.getServiceUtil3()
					.getDynamicProperty(taskmor, "info");
			LocalizedMethodFault fault = tinfo.getError();
			String error = "Error Occured";
			if (fault != null) {
				error = fault.getFault().getFaultReason();
			}
			return error;
		}
	}

	private boolean queryVMotionCompatibility(ManagedObjectReference vmMOR,
			ManagedObjectReference hostMOR, ManagedObjectReference targethostMOR)
			throws Exception {
		boolean result = false;

		try {
			ManagedObjectReference[] vmMORs = new ManagedObjectReference[] { vmMOR };
			ManagedObjectReference[] hostMORs = new ManagedObjectReference[] {
					hostMOR, targethostMOR };
			String[] test = null;
			ManagedObjectReference taskMOR = ecb.getServiceConnection3()
					.getService().queryVMotionCompatibilityEx_Task(
							provisionChkr, vmMORs, hostMORs);
			String res = monitorTask(taskMOR);
			if (res.equalsIgnoreCase("sucess")) {
				result = true;
			} else {
				result = false;
			}
		} catch (Exception e) {
			result = false;
		}
		return result;
	}

	public void useVMotion25(String[] args, String cookieString, VMotion obj)
			throws Exception {

		ecb = ExtendedAppUtil.initialize("VmotionV25", VMotion
				.constructOptions(), args);

		vmotionObj = obj;
		ecb.connect(cookieString);
		provisionChkr = ecb.getServiceConnection3().getServiceContent()
				.getVmProvisioningChecker();

		if (ecb.option_is_set("validate")) {
			System.out
					.println("Investing the VMotion capability of VM in a Host");
			checkVMotionCompatibility();

		} else {
			vmotionObj.migrate_or_relocate_VM();
			// do migration
		}
	}

}