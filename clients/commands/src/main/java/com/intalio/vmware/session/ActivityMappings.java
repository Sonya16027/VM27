package com.intalio.vmware.session;

import java.util.HashMap;

import com.intalio.vmware.alarms.VMPowerStateAlarm;
import com.intalio.vmware.ciminfo.VIWrapper;
import com.intalio.vmware.events.EventFormat;
import com.intalio.vmware.events.EventHistoryCollectorMonitor;
import com.intalio.vmware.events.VMEventHistoryCollectorMonitor;
import com.intalio.vmware.host.AddVirtualNic;
import com.intalio.vmware.host.AddVirtualSwitch;
import com.intalio.vmware.host.AddVirtualSwitchPortGroup;
import com.intalio.vmware.host.RemoveVirtualNic;
import com.intalio.vmware.host.RemoveVirtualSwitch;
import com.intalio.vmware.host.RemoveVirtualSwitchPortGroup;
import com.intalio.vmware.httpfileaccess.ColdMigration;
import com.intalio.vmware.httpfileaccess.GetVMFiles;
import com.intalio.vmware.performance.Basics;
import com.intalio.vmware.performance.History;
import com.intalio.vmware.performance.PrintCounters;
import com.intalio.vmware.performance.Realtime;
import com.intalio.vmware.performance.VITop;
import com.intalio.vmware.performance.VIUsage;
import com.intalio.vmware.scheduling.DeleteOneTimeScheduledTask;
import com.intalio.vmware.scheduling.OneTimeScheduledTask;
import com.intalio.vmware.scheduling.WeeklyRecurrenceScheduledTask;
import com.intalio.vmware.scsilun.SCSILunName;
import com.intalio.vmware.simpleagent.CreateUser;
import com.intalio.vmware.simpleagent.SimpleAgent;
import com.intalio.vmware.sms.ConfigureSyncInterval;
import com.intalio.vmware.sms.QueryDatastoresInDcWithFilter;
import com.intalio.vmware.sms.QueryScsiVolumesInDc;
import com.intalio.vmware.sms.QueryTopology;
import com.intalio.vmware.sms.Sync;
import com.intalio.vmware.sms.UpdateVcDbConnectionInfo;
import com.intalio.vmware.version.displaynewpropertieshost.DisplayNewPropertiesHost;
import com.intalio.vmware.version.displaynewpropertieshost.DisplayNewPropertiesHostV25;
import com.intalio.vmware.version.displaynewpropertiesvm.DisplayNewPropertiesVM;
import com.intalio.vmware.version.displaynewpropertiesvm.DisplayNewPropertiesVMV25;
import com.intalio.vmware.version.getvirtualdiskfiles.GetVirtualDiskFiles;
import com.intalio.vmware.version.getvirtualdiskfiles.GetVirtualDiskFilesV25;
import com.intalio.vmware.version.hostpowerops.HostPowerOps;
import com.intalio.vmware.version.hostpowerops.HostPowerOpsV25;
import com.intalio.vmware.version.installhostpatch.InstallHostPatch;
import com.intalio.vmware.version.installhostpatch.InstallHostPatchV25;
import com.intalio.vmware.version.querymemoryoverhead.QueryMemoryOverhead;
import com.intalio.vmware.version.querymemoryoverhead.QueryMemoryOverheadV25;
import com.intalio.vmware.version.recordsession.RecordSession;
import com.intalio.vmware.version.recordsession.RecordSessionV25;
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
import com.vmware.vim.Action;
import com.vmware.vim.AlarmAction;
import com.vmware.vim.AlarmSpec;
import com.vmware.vim.ManagedObjectReference;
import com.vmware.vim.MethodAction;
import com.vmware.vim.PropertyFilterSpec;
import com.vmware.vim.StateAlarmExpression;
import com.vmware.vim.TaskScheduler;

@SuppressWarnings("unused")
public class ActivityMappings {
	protected static HashMap<String, Object> activityObjects = new HashMap<String, Object>();
	protected static HashMap<String, String> operationNames = new HashMap<String, String>();
	
	static {
		mapAlarmActivities();
		mapCimInfoActivities();
		mapEventsActivities();
		mapGeneralActivities();
		mapHostActivties();
		mapHttpFileAccessActivities();
		mapPerformanceActivities();
		mapWidgetsActivities();
		mapSchedulingActivities();
		mapScsiLunActvities();
		mapSimpleAgentActivities();
		mapSmsActivities();
		mapVersionActivities();
		mapDisplayNewPropertiesHostActivities();
		mapDisplayNewPropertiesVMActivities();
		mapGetVirtualDiskFilesActivities();
		mapHostPowerOpsActivites();
		mapInstallHostPatchActivities();
		mapQueryMemoryOverheadActivities();
		mapRecordSessionActivities();
		mapVMActivities();
	}
	
	protected static void mapAlarmActivities() {
		// map activity name to activity class name
		activityObjects.put("vmpowerstatealarm", new VMPowerStateAlarm() {
			public void powerStateAlarmVM(AppUtil cb) throws Exception {
				getVmMor(cb.get_option("vmname"));
				if (_virtualMachine != null) {
					StateAlarmExpression expression = createStateAlarmExpression();
					MethodAction methodAction = createPowerOnAction();
					AlarmAction alarmAction = createAlarmTriggerAction(methodAction);
					AlarmSpec alarmSpec = createAlarmSpec(alarmAction, expression);
					createAlarm(alarmSpec);
				} else {
					System.out.println("Virtual Machine " + cb.get_option("vmname")
							+ " Not Found");
				}
			}
		});
		
		// map activity name to activity operation's method name
		operationNames.put("vmpowerstatealarm", "powerStateAlarmVM");
	}
	
	protected static void mapCimInfoActivities() {
		// map activity name to activity class name
		activityObjects.put("viwrapper", new VIWrapper());
		
		// map activity name to activity operation's method name
		operationNames.put("viwrapper", "doOperation");
	}

	protected static void mapEventsActivities() {
		// map activity name to activity class name
		activityObjects.put("eventformat", new EventFormat());
		activityObjects.put("eventhistorycollectormonitor", new EventHistoryCollectorMonitor() {
			public void monitorEventHistory() throws Exception {
				initialize();
				createEventHistoryCollector();
				PropertyFilterSpec eventFilterSpec = createEventFilterSpec();
				monitorEvents(eventFilterSpec);
			}
		});
		activityObjects.put("vmeventhistorycollectormonitor", new VMEventHistoryCollectorMonitor() {
			public void monitorEventHistoryVM() throws Exception {
				initialize();
				if (findVirtualMachine()) {
					createEventHistoryCollector();
					PropertyFilterSpec eventFilterSpec = createEventFilterSpec();
					monitorEvents(eventFilterSpec);
				} else {
					System.out
							.println("Virtual Machine not found from the vmPath specified");
				}
			}
		});
		
		// map activity name to activity operation's method name
		operationNames.put("eventformat", "formatLatestEvent");
		operationNames.put("eventhistorycollectormonitor", "monitorEventHistory");
		operationNames.put("vmeventhistorycollectormonitor", "monitorEventHistoryVM");
	}

	protected static void mapGeneralActivities() {
		// map activity name to activity class name
//		activityObjects.put("", new ());
		
		// map activity name to activity operation's method name
		operationNames.put("", "");
	}

	protected static void mapHostActivties() {
		// map activity name to activity class name
		activityObjects.put("addvirtualnic", new AddVirtualNic() {
			public void addVirtualNic(AppUtil cb) throws Exception {
				vmUtils = new VMUtils(cb);
				validate();
				doAddVirtualNic();
			}
		});
		activityObjects.put("addvirtualswitch", new AddVirtualSwitch() {
			public void addVirtualSwitch(AppUtil cb) throws Exception {
				vmUtils = new VMUtils(cb);
				validate();
				doAddVirtualSwitch();
			}
			
		});
		activityObjects.put("addvirtualswitchportgroup", new AddVirtualSwitchPortGroup() {
			public void addVirtualSwitchPortGroup(AppUtil cb) throws Exception {
				vmUtils = new VMUtils(cb);
				validate();
				doAddVirtualSwitchPortGroup();
			}
		});
		activityObjects.put("removevirtualnic", new RemoveVirtualNic() {
			public void removeVirtualNic(AppUtil cb) throws Exception {
				vmUtils = new VMUtils(cb);
				validate();
				doRemoveVirtualNic();
			}
		});
		activityObjects.put("removevirtualswitch", new RemoveVirtualSwitch() {
			public void removeVirtualSwitch(AppUtil cb) throws Exception {
				vmUtils = new VMUtils(cb);
				validate();
				doRemoveVirtualSwitch();
			}
		});
		activityObjects.put("removevirtualswitchportgroup", new RemoveVirtualSwitchPortGroup() {
			public void removeVirtualSwitchPortGroup(AppUtil cb) throws Exception {
				vmUtils = new VMUtils(cb);
				validate();
				doRemoveVirtualSwitchPortGroup();
			}
		});
		
		// map activity name to activity operation's method name
		operationNames.put("addvirtualnic", "addVirtualNic");
		operationNames.put("addvirtualswitch", "addVirtualSwitch");
		operationNames.put("addvirtualswitchportgroup", "addVirtualSwitchPortGroup");
		operationNames.put("removevirtualnic", "removeVirtualNic");
		operationNames.put("removevirtualswitch", "removeVirtualSwitch");
		operationNames.put("removevirtualswitchportgroup", "removeVirtualSwitchPortGroup");
	}

	protected static void mapHttpFileAccessActivities() {
		// map activity name to activity class name
		activityObjects.put("coldmigration", new ColdMigration());
		activityObjects.put("getvmfiles", new GetVMFiles());
		
		// map activity name to activity operation's method name
		operationNames.put("coldmigration", "coldMigration");
		operationNames.put("getvmfiles", "getVM");
	}

	protected static void mapPerformanceActivities() {
		// map activity name to activity class name
		activityObjects.put("basics", new Basics() {
			public void doBasicDisplay() throws Exception {
				boolean valid = customvalidation();
				if (valid) {
					displayBasics();
				}
			}
		});
		activityObjects.put("history", new History() {
			public void doHistoryDisplay() throws Exception {
				boolean valid = customValidation();
				if (valid) {
					displayHistory();
				}
			}
		});
		activityObjects.put("printcounters", new PrintCounters());
		activityObjects.put("realtime", new Realtime());
		activityObjects.put("vitop", new VITop());
		activityObjects.put("viusage", new VIUsage());
		
		// map activity name to activity operation's method name
		operationNames.put("basics", "doBasicDisplay");
		operationNames.put("history", "doHistoryDisplay");
		operationNames.put("printcounters", "printCounters");
		operationNames.put("realtime", "doRealTime");
		operationNames.put("vitop", "displayStats");
		operationNames.put("viusage", "displayUsage");
	}

	protected static void mapWidgetsActivities() {
		// map activity name to activity class name
		activityObjects.put("linechart", null);
		activityObjects.put("statstable", null);
		
		// map activity name to activity operation's method name
		operationNames.put("linechart", "");
		operationNames.put("statstable", "");
	}

	protected static void mapSchedulingActivities() {
		// map activity name to activity class name
		activityObjects.put("deleteonetimescheduledtask", new DeleteOneTimeScheduledTask() {
			public void deleteOneTimeScheduledTask() throws Exception {
				initialize();

				// create a Property Filter Spec to get names
				// of all scheduled tasks
				PropertyFilterSpec taskFilterSpec = createTaskPropertyFilterSpec();

				// Retrieve names of all ScheduledTasks and find
				// the named one time Scheduled Task
				ManagedObjectReference oneTimeTask = findOneTimeScheduledTask(taskFilterSpec);

				// Delete the one time scheduled task
				if (oneTimeTask != null) {
					deleteScheduledTask(oneTimeTask);
				}
			}
		});
		activityObjects.put("onetimescheduledtask", new OneTimeScheduledTask() {
			public void oneTimeScheduledTask() throws Exception {
				initialize();

				// find VM by inventory path to create a scheduled task for
				findVirtualMachine();

				// create the power Off action to be scheduled
				com.vmware.vim.Action taskAction = createTaskAction();

				// create a One time scheduler to run
				TaskScheduler taskScheduler = createTaskScheduler();

				// Create Scheduled Task
				createScheduledTask(taskAction, taskScheduler);
			}
		});
		activityObjects.put("weeklyrecurrencescheduledtask", new WeeklyRecurrenceScheduledTask() {
			public void weeklyRecurrenceScheduledTask() throws Exception {
				initialize();

				// find the VM by dns name to create a scheduled task for
				findVirtualMachine();

				// create the power Off action to be scheduled
				Action taskAction = createTaskAction();

				// create a One time scheduler to run
				TaskScheduler taskScheduler = createTaskScheduler();

				// Create Scheduled Task
				createScheduledTask(taskAction, taskScheduler);
			}
		});
		
		// map activity name to activity operation's method name
		operationNames.put("deleteonetimescheduledtask", "deleteOneTimeScheduledTask");
		operationNames.put("onetimescheduledtask", "oneTimeScheduledTask");
		operationNames.put("weeklyrecurrencescheduledtask", "weeklyRecurrenceScheduledTask");
	}

	protected static void mapScsiLunActvities() {
		// map activity name to activity class name
		activityObjects.put("scsilunname", new SCSILunName());
		
		// map activity name to activity operation's method name
		operationNames.put("scsilunname", "displayScsiLuns");
	}

	protected static void mapSimpleAgentActivities() {
		// map activity name to activity class name
		activityObjects.put("createuser", new CreateUser());
		activityObjects.put("simpleagent", new SimpleAgent() {
			public void simpleAgent(String[] args) throws Exception {
				String serverName = args[0];
				connectAndLogin(serverName);
			}
		});
		
		// map activity name to activity operation's method name
		operationNames.put("createuser", "createUser");
		operationNames.put("simpleagent", "simpleAgent");
	}

	protected static void mapSmsActivities() {
		// map activity name to activity class name
		activityObjects.put("configuresyncinterval", new ConfigureSyncInterval());
		activityObjects.put("querydatastoresindcwithfilter", new QueryDatastoresInDcWithFilter());
		activityObjects.put("queryscsivolumesindc", new QueryScsiVolumesInDc());
		activityObjects.put("querytopology", new QueryTopology());
		activityObjects.put("sync", new Sync());
		activityObjects.put("updatevcdbconnectioninfo", new UpdateVcDbConnectionInfo());
		
		// map activity name to activity operation's method name
		operationNames.put("configuresyncinterval", "execute");
		operationNames.put("querydatastoresindcwithfilter", "execute");
		operationNames.put("queryscsivolumesindc", "execute");
		operationNames.put("querytopology", "execute");
		operationNames.put("sync", "execute");
		operationNames.put("updatevcdbconnectioninfo", "execute");
	}

	protected static void mapVersionActivities() {
		// map activity name to activity class name
		
		// map activity name to activity operation's method name
	}

	protected static void mapDisplayNewPropertiesHostActivities() {
		// map activity name to activity class name
		activityObjects.put("displaynewpropertieshost", new DisplayNewPropertiesHost() {
			public void displayNewPropertiesHost(String[] args) throws Exception {
				displayProperties(args);
			}
		});
		activityObjects.put("displaynewpropertieshostv25", new DisplayNewPropertiesHostV25());
		
		// map activity name to activity operation's method name
		operationNames.put("displaynewpropertieshost", "displayNewPropertiesHost");
		operationNames.put("displaynewpropertieshostv25", "???");
	}

	protected static void mapDisplayNewPropertiesVMActivities() {
		// map activity name to activity class name
		activityObjects.put("displaynewpropertiesvm", new DisplayNewPropertiesVM() {
			public void  displayNewPropertiesVM(String[] args) throws Exception {
				displayVMProperties(args);				
			}
		});
		activityObjects.put("displaynewpropertiesvmv25", new DisplayNewPropertiesVMV25());
		
		// map activity name to activity operation's method name
		operationNames.put("displaynewpropertiesvm", "displayNewPropertiesVM");
		operationNames.put("displaynewpropertiesvm", "");
	}

	protected static void mapGetVirtualDiskFilesActivities() {
		// map activity name to activity class name
		activityObjects.put("getvirtualdiskfiles", new GetVirtualDiskFiles() {
			public void getVirtualDiskFiles(String[] args) throws Exception {
				displayControllers(args);
			}
		});
		activityObjects.put("getvirtualdiskfilesv25", new GetVirtualDiskFilesV25());
		
		// map activity name to activity operation's method name
		operationNames.put("getvirtualdiskfiles", "getVirtualDiskFiles");
		operationNames.put("getvirtualdiskfilesv25", "???");
	}

	protected static void mapHostPowerOpsActivites() {
		// map activity name to activity class name
		activityObjects.put("hostpowerops", new HostPowerOps() {
			public  void powerOpsHost(String[] args) throws Exception {
				boolean valid = customValidation();
				if (valid) {
					PowerDownHost(args);
				}
			}
		});
		activityObjects.put("hostpoweropsv25", new HostPowerOpsV25());
		
		// map activity name to activity operation's method name
		operationNames.put("hostpowerops", "powerOpsHost");
		operationNames.put("hostpoweropsv25", "???");
	}

	protected static void mapInstallHostPatchActivities() {
		// map activity name to activity class name
		activityObjects.put("installhostpatch", new InstallHostPatch() {
			public void installHostPatch(String[] args) throws Exception {
				if (customValidation()) {
					operation(args);
				}
			}
		});
		activityObjects.put("installhostpatchv25", new InstallHostPatchV25());
		
		// map activity name to activity operation's method name
		operationNames.put("installhostpatch", "installHostPatch");
		operationNames.put("installhostpatchv25", "???");
	}

	protected static void mapQueryMemoryOverheadActivities() {
		// map activity name to activity class name
		activityObjects.put("querymemoryoverhead", new QueryMemoryOverhead() {
			public void queryMemoryOverhead(String[] args) throws Exception {
				boolean valid = customValidation();
				if (valid) {
					queryMemoryOverhead(args);
				}
			}
		});
		activityObjects.put("querymemoryoverheadv25", new QueryMemoryOverheadV25());
		
		// map activity name to activity operation's method name
		operationNames.put("querymemoryoverhead", "queryMemoryOverhead");
		operationNames.put("querymemoryoverheadv25", "???");
	}

	protected static void mapRecordSessionActivities() {
		// map activity name to activity class name
		activityObjects.put("recordsession", new RecordSession() {
			public void sessionRecord(String[] args) throws Exception {
				recordSession(args);
			}
		});
		activityObjects.put("recordsessionv25", new RecordSessionV25());
		
		// map activity name to activity operation's method name
		operationNames.put("recordsession", "sessionRecord");
		operationNames.put("recordsessionv25", "???");
	}

	protected static void  mapVMActivities() {
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
