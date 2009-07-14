package com.intalio.vmware.scheduling;

import com.vmware.apputils.AppUtil;
import com.vmware.apputils.OptionSpec;
import com.vmware.vim.DynamicProperty;
import com.vmware.vim.InvalidRequest;
import com.vmware.vim.ManagedObjectReference;
import com.vmware.vim.ObjectContent;
import com.vmware.vim.ObjectSpec;
import com.vmware.vim.PropertyFilterSpec;
import com.vmware.vim.PropertySpec;
import com.vmware.vim.SelectionSpec;
import com.vmware.vim.ServiceContent;
import com.vmware.vim.TraversalSpec;
import com.vmware.vim.VimPortType;
import com.vmware.vim.VimServiceLocator;

/**
 *<pre>
 * his is a simple standalone client whose purpose is to 
 * emonstrate the process  deleting a ScheduledTask.
 * he OneTime Scheduled Task will be deleted.
 * 
 * b&gt;To run this samples following parameters are used :&lt;/b&gt;
 * 
 * askname   [required]   : name of the task to be deleted
 * 
 * b&gt;Command Line:&lt;/b&gt;
 * elete a task named Task1
 * un.bat com.intalio.vmware.vm.DeleteOneTimeScheduledTask --url [webserviceurl]
 * -username [username] --password [password] --taskname [Task1]
 *</pre>
 */

public class DeleteOneTimeScheduledTask {

	private static AppUtil cb = null;

	private static OptionSpec[] constructOptions() {
		OptionSpec[] useroptions = new OptionSpec[1];
		useroptions[0] = new OptionSpec("taskname", "String", 1,
				"Name of the task to be scheduled", null);
		return useroptions;
	}

	/**
	 * The main entry point for the application.
	 * 
	 * @param args
	 *            Arguments: <url> <user> <password>
	 */
	public static void main(String[] args) {
		try {
			DeleteOneTimeScheduledTask schedTask = new DeleteOneTimeScheduledTask();
			cb = AppUtil.initialize("DeleteOneTimeScheduledTask",
					DeleteOneTimeScheduledTask.constructOptions(), args);

			// Connect to the Service and initialize any required
			// ManagedObjectReferences
			cb.connect();
			schedTask.initialize();

			// create a Property Filter Spec to get names
			// of all scheduled tasks
			PropertyFilterSpec taskFilterSpec = schedTask
					.createTaskPropertyFilterSpec();

			// Retrieve names of all ScheduledTasks and find
			// the named one time Scheduled Task
			ManagedObjectReference oneTimeTask = schedTask
					.findOneTimeScheduledTask(taskFilterSpec);

			// Delete the one time scheduled task
			if (oneTimeTask != null) {
				schedTask.deleteScheduledTask(oneTimeTask);
			}

			// Disconnect from the WebService
			cb.disConnect();
		} catch (Exception e) {
			System.out.println("Caught Exception : " + " Name : "
					+ e.getClass().getName() + " Message : " + e.getMessage()
					+ " Trace : ");
			e.printStackTrace();
		}
	}

	private ManagedObjectReference _svcRef; // Service Instance Reference

	private VimServiceLocator _locator;
	private VimPortType _service; // All webservice methods
	// ServiceContent contains References to commonly used
	// Managed Objects like PropertyCollector, SearchIndex, EventManager, etc.
	private ServiceContent _sic;

	private ManagedObjectReference _propCol;

	private ManagedObjectReference _scheduleManager;

	/**
	 * Create Property Collector Filter to get names of all ScheduledTasks the
	 * ScheduledTaskManager has.
	 * 
	 * @return PropertyFilterSpec to get properties
	 */
	private PropertyFilterSpec createTaskPropertyFilterSpec() {
		// The traversal spec traverses the "scheduledTask" property of
		// ScheduledTaskManager to get names of ScheduledTask ManagedEntities
		// A Traversal Spec allows traversal into a ManagedObjects
		// using a single attribute of the managedObject
		TraversalSpec scheduledTaskTraversal = new TraversalSpec();

		scheduledTaskTraversal.setType(_scheduleManager.getType());
		scheduledTaskTraversal.setPath("scheduledTask");

		// We want to get values of the scheduleTask property
		// of the scheduledTaskManager, which are the ScheduledTasks
		// so we set skip = false.
		scheduledTaskTraversal.setSkip(Boolean.FALSE);

		// no further traversal needed once we get to scheduled task list
		scheduledTaskTraversal.setSelectSet(new SelectionSpec[] {});

		scheduledTaskTraversal.setName("scheduleManagerToScheduledTasks");

		// Setup a PropertySpec to return names of Scheduled Tasks so
		// we can find the named ScheduleTask ManagedEntity to delete
		// Name is an attribute of ScheduledTaskInfo so
		// the path set will contain "info.name"
		PropertySpec propSpec = new PropertySpec();
		propSpec.setAll(new Boolean(false));
		propSpec.setPathSet(new String[] { "info.name" });
		propSpec.setType("ScheduledTask");

		// PropertySpecs are wrapped in a PropertySpec array
		// since we only have a propertySpec for the ScheduledTask,
		// the only values we will get back are names of scheduledTasks
		PropertySpec[] propSpecArray = new PropertySpec[] { propSpec };

		// Create an Object Spec to specify the starting or root object
		// and the SelectionSpec to traverse to each ScheduledTask in the
		// array of scheduledTasks in the ScheduleManager
		ObjectSpec objSpec = new ObjectSpec();
		objSpec.setObj(_scheduleManager);
		objSpec.setSelectSet(new SelectionSpec[] { scheduledTaskTraversal });

		// Set skip = true so properties of ScheduledTaskManager
		// are not returned, and only values of info.name property of
		// each ScheduledTask is returned
		objSpec.setSkip(Boolean.TRUE);

		// ObjectSpecs used in PropertyFilterSpec are wrapped in an array
		ObjectSpec[] objSpecArray = new ObjectSpec[] { objSpec };

		// Create the PropertyFilter spec with
		// ScheduledTaskManager as "root" object
		PropertyFilterSpec spec = new PropertyFilterSpec();
		spec.setPropSet(propSpecArray);
		spec.setObjectSet(objSpecArray);
		return spec;
	}

	/**
	 * Delete a Scheduled Task
	 * 
	 * @param oneTimeTask
	 *            the ManagedObjectReference of task to delete
	 * @throws Exception
	 */
	private void deleteScheduledTask(ManagedObjectReference oneTimeTask)
			throws Exception {
		try {

			// Remove the One Time Scheduled Task
			_service.removeScheduledTask(oneTimeTask);
			System.out.println("Successfully Deleted ScheduledTask: "
					+ oneTimeTask.get_value());
		} catch (InvalidRequest e) {
			System.out.println(" InvalidRequest: Task Name may be wrong");
		} catch (Exception e) {
			System.out.println("Error");
			e.printStackTrace();
		}
	}

	/**
	 * Find the Scheduled Task to be deleted
	 * 
	 * @return ManagedObjectReference of the OneTimeScheduled Task
	 * @throws Exception
	 *             an reported exceptions
	 */
	private ManagedObjectReference findOneTimeScheduledTask(
			PropertyFilterSpec scheduledTaskSpec) throws Exception {
		String findTaskName = cb.get_option("taskname");
		boolean found = false;
		ManagedObjectReference oneTimeTask = null;

		// Use PropertyCollector to get all scheduled tasks the
		// ScheduleManager has
		ObjectContent[] scheduledTasks = _service.retrieveProperties(_propCol,
				new PropertyFilterSpec[] { scheduledTaskSpec });

		// Find the task name we're looking for and return the
		// ManagedObjectReference for the ScheduledTask with the
		// name that matched the name of the OneTimeTask created earlier
		if (scheduledTasks != null) {
			for (int i = 0; i < scheduledTasks.length && !found; i++) {
				ObjectContent taskContent = scheduledTasks[i];
				DynamicProperty[] props = taskContent.getPropSet();
				for (int p = 0; p < props.length && !found; p++) {
					DynamicProperty prop = props[p];
					String taskName = (String) prop.getVal();
					if (taskName.equals(findTaskName)) {
						oneTimeTask = taskContent.getObj();
						found = true;
					}
				}
			}
		}
		if (!found) {
			System.out.println("Scheduled task '" + findTaskName
					+ "' not found");
		}
		return oneTimeTask;
	}

	/**
	 * Initialize the necessary Managed Object References needed here
	 */
	private void initialize() {
		_sic = cb.getConnection().getServiceContent();
		_service = cb.getConnection().getService();
		// Get the PropertyCollector and ScheduleManager references from
		// ServiceContent
		_propCol = _sic.getPropertyCollector();
		_scheduleManager = _sic.getScheduledTaskManager();
	}
}
