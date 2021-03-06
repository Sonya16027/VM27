package com.vmware.samples.scheduling;

import java.util.Calendar;

import com.vmware.apputils.AppUtil;
import com.vmware.apputils.OptionSpec;
import com.vmware.vim.DuplicateName;
import com.vmware.vim.InvalidRequest;
import com.vmware.vim.ManagedObjectReference;
import com.vmware.vim.MethodAction;
import com.vmware.vim.MethodActionArgument;
import com.vmware.vim.OnceTaskScheduler;
import com.vmware.vim.ScheduledTaskSpec;
import com.vmware.vim.ServiceContent;
import com.vmware.vim.TaskScheduler;
import com.vmware.vim.VimPortType;
import com.vmware.vim.VimServiceLocator;

/**
 *<pre>
 * his is a simple standalone client whose purpose is to 
 * emonstrate the creation of a ScheduledTask using the 
 * cheduledTaskManager
 * 
 * b&gt;To run this samples following parameters are used :&lt;/b&gt;
 * 
 * askname   [required]   : name of the task to be scheduled
 * mname     [required]   : name of the virtual machine
 * 
 * b&gt;Command Line:&lt;/b&gt;
 * un.bat com.vmware.samples.vm.OneTimeScheduledTask --url 
 * webserviceurl] --username [username] --password [password]
 *--taskname [myTask]
 * 
 * <pre>
 */

public class OneTimeScheduledTask {
	private static AppUtil cb = null;
	private ManagedObjectReference _svcRef; // Service Instance Reference
	private VimServiceLocator _locator;
	private VimPortType _service; // All webservice methods

	// ServiceContent contains References to commonly used
	// Managed Objects like PropertyCollector, SearchIndex, EventManager, etc.
	private ServiceContent _sic;
	private ManagedObjectReference _searchIndex;
	private ManagedObjectReference _scheduleManager;

	/**
	 * Initialize the necessary Managed Object References needed here
	 */
	private void initialize() {
		_sic = cb.getConnection().getServiceContent();
		_service = cb.getConnection().getService();
		// Get the SearchIndex and ScheduleManager references from
		// ServiceContent
		_searchIndex = _sic.getSearchIndex();
		_scheduleManager = _sic.getScheduledTaskManager();
	}

	private ManagedObjectReference _virtualMachine;

	/**
	 * Use the SearchIndex to find a VirtualMachine by Inventory Path
	 * 
	 * @throws Exception
	 */

	private void findVirtualMachine() throws Exception {
		_virtualMachine = cb.getServiceUtil().getDecendentMoRef(null,
				"VirtualMachine", cb.getOption("vmname"));
	}

	/**
	 * Create method action to power off a vm
	 * 
	 * @return the action to run when the schedule runs
	 */
	private com.vmware.vim.Action createTaskAction() {
		MethodAction action = new MethodAction();

		// Method Name is the WSDL name of the
		// ManagedObject's method that is to be run,
		// in this Case, the powerOff method of the VM
		action.setName("PowerOffVM_Task");

		// There are no arguments to this method
		// so we pass in an empty MethodActionArgument
		action.setArgument(new MethodActionArgument[] {});
		return action;
	}

	/**
	 * Create a Once task scheduler to run 30 minutes from now
	 * 
	 * @return one time task scheduler
	 */
	private TaskScheduler createTaskScheduler() {
		// Create a Calendar Object and add 30 minutes to allow
		// the Action to be run 30 minutes from now
		Calendar runTime = Calendar.getInstance();
		runTime.add(Calendar.MINUTE, 01);

		// Create a OnceTaskScheduler and set the time to
		// run tha Task Action at in the Scheduler.
		OnceTaskScheduler scheduler = new OnceTaskScheduler();
		scheduler.setRunAt(runTime);

		return scheduler;
	}

	/**
	 * Create a Scheduled Task using the poweroff method action and the onetime
	 * scheduler, for the VM found.
	 * 
	 * @param taskAction
	 *            action to be performed when schedule executes
	 * @param scheduler
	 *            the scheduler used to execute the action
	 * @throws Exception
	 */

	private void createScheduledTask(com.vmware.vim.Action taskAction,
			TaskScheduler scheduler) throws Exception {
		try {
			// Create the Scheduled Task Spec and set a unique task name
			// and description, and enable the task as soon as it is created
			String taskName = cb.getOption("taskname");
			ScheduledTaskSpec scheduleSpec = new ScheduledTaskSpec();
			scheduleSpec.setName(taskName);
			scheduleSpec.setDescription("PowerOff VM in 1 minutes");
			scheduleSpec.setEnabled(true);

			// Set the PowerOff Method Task Action and the
			// Once scheduler in the spec
			scheduleSpec.setAction(taskAction);
			scheduleSpec.setScheduler(scheduler);

			// Create ScheduledTask for the VirtualMachine we found earlier
			if (_virtualMachine != null) {
				ManagedObjectReference task = _service.createScheduledTask(
						_scheduleManager, _virtualMachine, scheduleSpec);
				// printout the MoRef id of the Scheduled Task
				System.out.println("Successfully created Once Task: "
						+ task.get_value());
			} else {
				System.out.println("Virtual Machine " + cb.getOption("vmname")
						+ " not found");
				return;
			}
		} catch (InvalidRequest e) {
			System.out.println(" InvalidRequest: vmPath may be wrong");
		} catch (DuplicateName e) {
			System.out.println("Error :Task Name already Exists");
		} catch (Exception e) {
			System.out.println("Error");
			e.printStackTrace();
		}
	}

	private static OptionSpec[] constructOptions() {
		OptionSpec[] useroptions = new OptionSpec[2];
		useroptions[0] = new OptionSpec("vmname", "String", 1,
				"Name of Virtual Machine", null);
		useroptions[1] = new OptionSpec("taskname", "String", 1,
				"Name of the task to be scheduled", null);
		return useroptions;
	}

	/**
	 * The main entry point for the application.
	 * 
	 * @param args
	 *            Arguments: <url> <user> <password> <A VM Inventory Path>
	 */
	public static void main(String[] args) {
		try {
			OneTimeScheduledTask schedTask = new OneTimeScheduledTask();
			cb = AppUtil.initialize("OneTimeScheduledTask",
					OneTimeScheduledTask.constructOptions(), args);

			// Connect to the Service and initialize required
			// ManagedObjectReferences
			cb.connect();
			schedTask.initialize();

			// find VM by inventory path to create a scheduled task for
			schedTask.findVirtualMachine();

			// create the power Off action to be scheduled
			com.vmware.vim.Action taskAction = schedTask.createTaskAction();

			// create a One time scheduler to run
			TaskScheduler taskScheduler = schedTask.createTaskScheduler();

			// Create Scheduled Task
			schedTask.createScheduledTask(taskAction, taskScheduler);

			// Disconnect from the WebService
			cb.disConnect();
		} catch (Exception e) {
			System.out.println("Caught Exception : " + " Name : "
					+ e.getClass().getName() + " Message : " + e.getMessage()
					+ " Trace : ");
			e.printStackTrace();
		}
	}
}
