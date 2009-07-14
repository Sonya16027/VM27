package com.intalio.vmware.events;

import com.vmware.apputils.AppUtil;
import com.vmware.apputils.OptionSpec;
import com.vmware.vim.ArrayOfEvent;
import com.vmware.vim.Event;
import com.vmware.vim.EventFilterSpec;
import com.vmware.vim.EventFilterSpecByEntity;
import com.vmware.vim.EventFilterSpecRecursionOption;
import com.vmware.vim.InvalidRequest;
import com.vmware.vim.ManagedObjectReference;
import com.vmware.vim.ObjectContent;
import com.vmware.vim.ObjectSpec;
import com.vmware.vim.PropertyFilterSpec;
import com.vmware.vim.PropertySpec;
import com.vmware.vim.SelectionSpec;
import com.vmware.vim.ServiceContent;
import com.vmware.vim.VimPortType;

/**
 *<pre>
 * his is a simple standalone client whose purpose is to demonstrate the
 * rocess for Logging into the Webservice, Creating EventHistoryCollector
 * iltered for a single VM and monitoring Events using the 
 * atestPage attribute of the EventHistoryCollector
 * 
 * b&gt;To run this samples following parameters are used :&lt;/b&gt;
 * mpath    [required]   : A VM Inventory Path
 * 
 * b&gt;Command Line:&lt;/b&gt;
 * un.bat com.intalio.vmware.vm.VMEventHistoryCollectorMonitor --url [webserviceurl]
 * -username [username] --password  [password] --vmPath [vm inventory Path]
 *</pre>
 */

public class VMEventHistoryCollectorMonitor {
	private static AppUtil cb = null;

	private static OptionSpec[] constructOptions() {
		OptionSpec[] useroptions = new OptionSpec[1];
		useroptions[0] = new OptionSpec("vmpath", "String", 1,
				"A VM Inventory Path", null);
		return useroptions;
	}

	public static void main(String[] args) {
		try {
			VMEventHistoryCollectorMonitor eventMonitor = new VMEventHistoryCollectorMonitor();
			cb = AppUtil.initialize("VMEventHistoryCollectorMonitor",
					VMEventHistoryCollectorMonitor.constructOptions(), args);
			cb.connect();
			eventMonitor.initialize();
			if (eventMonitor.findVirtualMachine()) {
				eventMonitor.createEventHistoryCollector();
				PropertyFilterSpec eventFilterSpec = eventMonitor
						.createEventFilterSpec();
				eventMonitor.monitorEvents(eventFilterSpec);
			} else {
				System.out
						.println("Virtual Machine not found from the vmPath specified");
			}
			cb.disConnect();
		} catch (Exception e) {
			System.out.println("Caught Exception : " + " Name : "
					+ e.getClass().getName() + " Message : " + e.getMessage()
					+ " Trace : ");
		}
	}

	private VimPortType _service; // All webservice methods
	private ServiceContent _sic;

	private ManagedObjectReference _propCol; // PropertyCollector Reference
	private ManagedObjectReference _searchIndex;

	// EventManager and EventHistoryCollector References
	private ManagedObjectReference _eventManager;

	private ManagedObjectReference _eventHistoryCollector;

	private ManagedObjectReference _virtualMachine;

	private PropertyFilterSpec createEventFilterSpec() {
		// Set up a PropertySpec to use the latestPage attribute
		// of the EventHistoryCollector

		PropertySpec propSpec = new PropertySpec();
		propSpec.setAll(new Boolean(false));
		propSpec.setPathSet(new String[] { "latestPage" });
		propSpec.setType(_eventHistoryCollector.getType());

		// PropertySpecs are wrapped in a PropertySpec array
		PropertySpec[] propSpecAry = new PropertySpec[] { propSpec };

		// Set up an ObjectSpec with the above PropertySpec for the
		// EventHistoryCollector we just created
		// as the Root or Starting Object to get Attributes for.
		ObjectSpec objSpec = new ObjectSpec();
		objSpec.setObj(_eventHistoryCollector);
		objSpec.setSkip(new Boolean(false));

		// Get Event objects in "latestPage" from "EventHistoryCollector"
		// and no "traversl" further, so, no SelectionSpec is specified
		objSpec.setSelectSet(new SelectionSpec[] {});

		// ObjectSpecs are wrapped in an ObjectSpec array
		ObjectSpec[] objSpecAry = new ObjectSpec[] { objSpec };

		PropertyFilterSpec spec = new PropertyFilterSpec();
		spec.setPropSet(propSpecAry);
		spec.setObjectSet(objSpecAry);
		return spec;
	}

	private void createEventHistoryCollector() throws Exception {
		// Create an Entity Event Filter Spec to
		// specify the MoRef of the VM to be get events filtered for
		EventFilterSpecByEntity entitySpec = new EventFilterSpecByEntity();
		entitySpec.setEntity(_virtualMachine);
		// we are only interested in getting events for the VM
		entitySpec.setRecursion(EventFilterSpecRecursionOption.self);
		// set the entity spec in the EventFilter
		EventFilterSpec eventFilter = new EventFilterSpec();
		eventFilter.setEntity(entitySpec);
		// create the EventHistoryCollector to monitor events for a VM
		// and get the ManagedObjectReference of the EventHistoryCollector
		// returned
		_eventHistoryCollector = _service.createCollectorForEvents(
				_eventManager, eventFilter);
	}

	public boolean findVirtualMachine() throws Exception {
		String vmPath = cb.get_option("vmpath");
		_virtualMachine = _service.findByInventoryPath(_searchIndex, vmPath);
		if (_virtualMachine != null) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Initialize the necessary Managed Object References needed here
	 */
	private void initialize() {
		_sic = cb.getConnection().getServiceContent();
		_service = cb.getConnection().getService();
		// The SearchIndex Reference is present in the ServiceInstanceContent
		_searchIndex = _sic.getSearchIndex();

		// The PropertyCollector and EventManager References are present
		// in the ServiceInstanceContent
		_propCol = _sic.getPropertyCollector();
		_eventManager = _sic.getEventManager();
	}

	private void monitorEvents(PropertyFilterSpec spec) throws Exception {
		// Get all Events returned from the EventHistoryCollector
		// This will result in a large number of events, depending on the
		// page size of the latestPage.
		try {
			ObjectContent[] objectContents = _service.retrieveProperties(
					_propCol, new PropertyFilterSpec[] { spec });
			// Print out class names of the Events we got back
			if (objectContents != null) {
				ArrayOfEvent arrayEvents = (ArrayOfEvent) objectContents[0]
						.getPropSet(0).getVal();
				Event[] events = arrayEvents.getEvent();
				// Event[] events =
				// (Event[])objectContents[0].getPropSet(0).getVal();

				System.out.println("Events In the latestPage are: ");
				for (Event anEvent : events) {
					System.out
							.println("Event: " + anEvent.getClass().getName());
				}
			} else {
				System.out.println("No Events retrieved!");
			}
		} catch (InvalidRequest e) {
			System.out.println(" InvalidRequest: vmPath may be wrong");
		} catch (Exception e) {
			System.out.println("Error");
			e.printStackTrace();
		}
	}
}
