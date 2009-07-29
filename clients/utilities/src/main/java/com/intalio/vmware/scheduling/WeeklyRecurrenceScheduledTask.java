package com.intalio.vmware.scheduling;

import com.vmware.apputils.AppUtil;
import com.vmware.apputils.OptionSpec;
import com.vmware.vim.Action;
import com.vmware.vim.DuplicateName;
import com.vmware.vim.InvalidRequest;
import com.vmware.vim.ManagedObjectReference;
import com.vmware.vim.MethodAction;
import com.vmware.vim.MethodActionArgument;
import com.vmware.vim.ScheduledTaskSpec;
import com.vmware.vim.ServiceContent;
import com.vmware.vim.TaskScheduler;
import com.vmware.vim.VimPortType;
import com.vmware.vim.VimServiceLocator;
import com.vmware.vim.WeeklyTaskScheduler;

/**
 *<pre>
 * his is a simple standalone client whose purpose is to demonstrate the
 * rocess of creation of a ScheduledTask
 * sing the ScheduledTaskManager
 * 
 * 
 * b&gt;To run this samples following parameters are used :&lt;/b&gt;
 * 
 * askname   [required]   : name of the task to be scheduled
 * mpath     [required]   :VM Inventory Path
 * 
 * 
 * b&gt;Command Line:&lt;/b&gt;
 * un.bat com.intalio.vmware.vm.WeeklyRecurrenceScheduledTask --url [webserviceurl]
 * -username [username] --password  [password] 
 * -vmpath [&quot;/DatacenterName/vm/FolderName/myVM&quot;]
 * -taskname [Task1]
 *</pre>
 */

public class WeeklyRecurrenceScheduledTask {
	protected static AppUtil cb = null;

	protected static OptionSpec[] constructOptions() {
		OptionSpec[] useroptions = new OptionSpec[2];
		useroptions[0] = new OptionSpec("vmpath", "String", 1,
				"VM Inventory Path", null);
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

			WeeklyRecurrenceScheduledTask schedTask = new WeeklyRecurrenceScheduledTask();
			cb = AppUtil.initialize("WeeklyRecurrenceScheduledTask",
					WeeklyRecurrenceScheduledTask.constructOptions(), args);

			// Connect to the Service and initialize
			// any required ManagedObjectReferences
			cb.connect();
			schedTask.initialize();

			// find the VM by dns name to create a scheduled task for
			schedTask.findVirtualMachine();

			// create the power Off action to be scheduled
			Action taskAction = schedTask.createTaskAction();

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

	protected ManagedObjectReference _svcRef; // Service Instance Reference

	protected VimServiceLocator _locator;

	protected VimPortType _service; // All webservice methods

	// ServiceContent contains References to commonly used
	// Managed Objects like PropertyCollector, SearchIndex, EventManager, etc.
	protected ServiceContent _sic;

	protected ManagedObjectReference _searchIndex;

	protected ManagedObjectReference _scheduleManager;

	protected ManagedObjectReference _virtualMachine;

	/**
	 * Create a Scheduled Task using the reboot method action and the weekly
	 * scheduler, for the VM found.
	 * 
	 * @param taskAction
	 *            action to be performed when schedule executes
	 * @param scheduler
	 *            the scheduler used to execute the action
	 * @throws Exception
	 */
	protected void createScheduledTask(Action taskAction, TaskScheduler scheduler)
			throws Exception {
		try {
			// Create the Scheduled Task Spec and set a unique task name
			// and description, and enable the task as soon as it is created
			String taskName = cb.get_option("taskname");
			ScheduledTaskSpec scheduleSpec = new ScheduledTaskSpec();
			scheduleSpec.setName(taskName);
			scheduleSpec
					.setDescription("Reboot VM's Guest at 11.59pm every Saturday");
			scheduleSpec.setEnabled(true);

			// Set the RebootGuest Method Task action and
			// the Weekly scheduler in the spec
			scheduleSpec.setAction(taskAction);
			scheduleSpec.setScheduler(scheduler);

			// Create the ScheduledTask for the VirtualMachine we found earlier
			ManagedObjectReference task = _service.createScheduledTask(
					_scheduleManager, _virtualMachine, scheduleSpec);

			// printout the MoRef id of the Scheduled Task
			System.out.println("Successfully created Weekly Task: "
					+ task.get_value());
		} catch (InvalidRequest e) {
			System.out.println(" InvalidRequest: vmPath may be wrong");
		} catch (DuplicateName e) {
			System.out.println("Task Name already Exists");
		} catch (Exception e) {
			System.out.println("Error");
			e.printStackTrace();
		}
	}

	/**
	 * Create method action to reboot the guest in a vm
	 * 
	 * @return the action to run when the schedule runs
	 */
	protected Action createTaskAction() {
		MethodAction action = new MethodAction();

		// Method Name is the WSDL name of the
		// ManagedObject's method to be run, in this Case,
		// the rebootGuest method for the VM
		action.setName("RebootGuest");

		// There are no arguments to this method
		// so we pass in an empty MethodActionArgument
		action.setArgument(new MethodActionArgument[] {});

		return action;
	}

	/**
	 * Create a Weekly task scheduler to run at 11:59 pm every Saturday
	 * 
	 * @return weekly task scheduler
	 */
	protected TaskScheduler createTaskScheduler() {
		WeeklyTaskScheduler scheduler = new WeeklyTaskScheduler();

		// Set the Day of the Week to be Saturday
		scheduler.setSaturday(true);

		// Set the Time to be 23:59 hours or 11:59 pm
		scheduler.setHour(23);
		scheduler.setMinute(59);

		// set the interval to 1 to run the task only
		// Once every Week at the specified time
		scheduler.setInterval(1);

		return scheduler;
	}

	/**
	 * Use the SearchIndex to find a VirtualMachine by Inventory Path
	 * 
	 * @throws Exception
	 */
	protected void findVirtualMachine() throws Exception {
		String vmPath = cb.get_option("vmpath");
		_virtualMachine = _service.findByInventoryPath(_searchIndex, vmPath);
	}

	/**
	 * Initialize the necessary Managed Object References needed here
	 */
	protected void initialize() {
		_sic = cb.getConnection().getServiceContent();
		_service = cb.getConnection().getService();
		// Get the SearchIndex and ScheduleManager references from
		// ServiceContent
		_searchIndex = _sic.getSearchIndex();
		_scheduleManager = _sic.getScheduledTaskManager();
	}
}
