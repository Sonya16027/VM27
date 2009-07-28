package com.intalio.vmware.session;

import java.util.HashMap;

import com.intalio.vmware.vm.VMClone;
import com.intalio.vmware.vm.VMCreate;
import com.intalio.vmware.vm.VMDeltaDisk;
import com.intalio.vmware.vm.VMLinkedClone;
import com.intalio.vmware.vm.VMPromoteDisks;
import com.intalio.vmware.vm.VMReconfig;
import com.intalio.vmware.vm.VMRelocate;
import com.intalio.vmware.vm.VMSnapshot;
import com.intalio.vmware.vm.VMotion;
import com.intalio.vmware.vm.VMotionV25;
import com.intalio.vmware.vm.VMpowerOps;
import com.vmware.apputils.AppUtil;
import com.vmware.apputils.version.VersionUtil;
import com.vmware.apputils.vim.VMUtils;
import com.vmware.vim.ManagedObjectReference;

@SuppressWarnings("unused")
public class ActivityMappings {
	private static HashMap<String, Object> activityObjects = new HashMap<String, Object>();
	private static HashMap<String, String> operationNames = new HashMap<String, String>();
	
	static {
		// map activity name to activity class name
		activityObjects.put("vmclone", new VMClone());
		activityObjects.put("vmcreate", new VMCreate() {
			public void createVMWithUtils(AppUtil cb) throws Exception {
				vmUtils = new VMUtils(cb);
				createVM();
			}
		});
		activityObjects.put("vmdeltadisk", new VMDeltaDisk() {
			public void createDeltaDiskWithCookie(AppUtil cb, String[] args) throws Exception {
				String cookieString = VersionUtil.getCookieString(cb);
				createDeltaDisk(args, cookieString);
			}
		});
		activityObjects.put("vmlinkedclone", new VMLinkedClone() {
			public void createLinkedCloneWithCookie(AppUtil cb, String[] args) throws Exception {
				String cookieString = VersionUtil.getCookieString(cb);
				createLinkedClone(args, cookieString);
			}
		});
		activityObjects.put("vmotion", new VMotion() {
			public void getVersionWithValidation(String[] args) throws Exception {
				boolean valid = customValidation();
				if (valid) {
					getVersion(args, this);
				}				
			}
		});
		activityObjects.put("vmotionv25", new VMotionV25());
		activityObjects.put("vmpowerops", new VMpowerOps() {
			public void powerOpsVM(AppUtil cb) throws Exception {
				validate();
				vmUtils = new VMUtils(cb);
				runOperation();
			}
		});
		activityObjects.put("vmpromotedisks", new VMPromoteDisks() {
			public void promoteDisksVM(AppUtil cb, String[] args) throws Exception {
				boolean valid = customValidation();
				if (valid) {
					String cookieString = VersionUtil.getCookieString(cb);
					promoteDeltaDisk(args, cookieString);
				}
			}
		});
		activityObjects.put("vmreconfig", new VMReconfig() {
			public void reconfigVM(AppUtil cb) throws Exception {
				boolean valid = customValidation();
				if (valid) {
					getVmMor(cb.get_option("vmname"));
					if (_virtualMachine != null) {
						vmUtils = new VMUtils(cb);
						reConfig();
					} else {
						System.out.println("Virtual Machine " + cb.get_option("vmname")
								+ " Not Found");
					}
				}				
			}
		});
		activityObjects.put("vmrelocate", new VMRelocate() {
			public void relocateVM(AppUtil cb, String[] args) throws Exception {
				boolean valid = customValidation();
				if (valid) {
					String cookieString = VersionUtil.getCookieString(cb);
					relocate(args, cookieString);
				}
				
			}
		});
		activityObjects.put("vmsnapshot", new VMSnapshot() {
			public void snapshotVM(AppUtil cb) throws Exception {
				boolean valid = customValidation();
				if (valid) {
					String vmName = cb.get_option("vmname");
					ManagedObjectReference vmMor = cb.getServiceUtil()
							.getDecendentMoRef(null, "VirtualMachine", vmName);

					if (vmMor != null) {
						String op = cb.get_option("operation");
						boolean res = false;
						if (op.equalsIgnoreCase("create")) {
							res = createSnapshot(vmMor);
						} else if (op.equalsIgnoreCase("list")) {
							res = listSnapshot(vmMor);
						} else if (op.equalsIgnoreCase("revert")) {
							res = revertSnapshot(vmMor);
						} else if (op.equalsIgnoreCase("removeall")) {
							res = removeAllSnapshot(vmMor);
						} else if (op.equalsIgnoreCase("remove")) {
							res = removeSnapshot(vmMor);
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
				}
			}
		});
		
		// map activity name to activity operation's method name
		operationNames.put("vmclone", "cloneVM");
		operationNames.put("vmcreate", "createVMWithUtils");
		operationNames.put("vmdeltadisk", "createDeltaDiskWithCookie");
		operationNames.put("vmlinkedclone", "createLinkedCloneWithCookie");
		operationNames.put("vmotion", "getVersionWithValidation");
		operationNames.put("vmotionv25", null);
		operationNames.put("vmpowerops", "powerOpsVM");
		operationNames.put("vmpromotedisks", "promoteDisksVM");
		operationNames.put("vmreconfig", "reconfigVM");
		operationNames.put("vmrelocate", "relocateVM");
		operationNames.put("vmsnapshot", "snapshotVM");
	}
	
	
	public static Object getActivityObject(String activityName) {
		activityName = activityName.toLowerCase().replaceAll("-", "");
		return activityObjects.get(activityName);
		
	}
	
	public static String getActivityOperation(String activityName) {
		return operationNames.get(activityName);
	}
}
