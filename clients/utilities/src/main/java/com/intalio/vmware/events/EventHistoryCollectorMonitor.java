package com.intalio.vmware.events;

import com.vmware.apputils.AppUtil;
import com.vmware.vim.ArrayOfEvent;
import com.vmware.vim.Event;
import com.vmware.vim.EventFilterSpec;
import com.vmware.vim.ManagedObjectReference;
import com.vmware.vim.ObjectContent;
import com.vmware.vim.ObjectSpec;
import com.vmware.vim.PropertyFilterSpec;
import com.vmware.vim.PropertySpec;
import com.vmware.vim.SelectionSpec;
import com.vmware.vim.ServiceContent;
import com.vmware.vim.VimPortType;

/**
 * This sample demonstrates how to create and monitor an
 * {@link <a href="../../../../../ReferenceGuide/vim.event.EventHistoryCollector.html"> EventHistoryCollector</a>}
 * . The sample uses the latesetPage property of the EventHistoryCollector to
 * filter the Events.</p>
 * <p>
 * This sample uses the helper classes {@link AppUtil} to perform the initial
 * connection tasks. It also uses the basic command-line arguments --url,
 * --userName, and --password.
 * <p>
 * 
 * <p>
 * <b>Command Line:</b>
 * </p>
 * 
 * <pre>
 * run.bat com.intalio.vmware.vm.EventHistoryCollectorMonitor --url [webserviceurl] 
 * --username [username] --password [password]
 * </pre>
 * <p>
 * <b>Usage Examples:</b>
 * </p>
 * 
 * <pre>
 * java com.intalio.vmware.vm.EventHistoryCollectorMonitor --url https://myVMwareService/sdk
 * --username root --password ***** --ignorecert
 * </pre>
 * 
 */

public class EventHistoryCollectorMonitor {

	protected static AppUtil cb = null;

	public static void main(String[] args) {
		try {
			EventHistoryCollectorMonitor eventMonitor = new EventHistoryCollectorMonitor();
			cb = AppUtil.initialize("EventFormat", args);
			cb.connect();
			eventMonitor.initialize();
			eventMonitor.createEventHistoryCollector();
			PropertyFilterSpec eventFilterSpec = eventMonitor
					.createEventFilterSpec();
			eventMonitor.monitorEvents(eventFilterSpec);
			cb.disConnect();
		} catch (Exception e) {
			System.out.println("Caught Exception : " + " Name : "
					+ e.getClass().getName() + " Message : " + e.getMessage()
					+ " Trace : ");
			e.printStackTrace();
		}
	}

	protected VimPortType _service; // All webservice methods
	protected ServiceContent _sic;

	protected ManagedObjectReference _propCol; // PropertyCollector Reference
	// EventManager and EventHistoryCollector References
	protected ManagedObjectReference _eventManager;

	protected ManagedObjectReference _eventHistoryCollector;

	protected PropertyFilterSpec createEventFilterSpec() {
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

	protected void createEventHistoryCollector() throws Exception {
		EventFilterSpec eventFilter = new EventFilterSpec();
		_eventHistoryCollector = _service.createCollectorForEvents(
				_eventManager, eventFilter);
	}

	protected void initialize() {
		_sic = cb.getConnection().getServiceContent();
		_service = cb.getConnection().getService();
		// The PropertyCollector and EventManager References are present
		// in the ServiceInstanceContent
		_propCol = _sic.getPropertyCollector();
		_eventManager = _sic.getEventManager();
	}

	protected void monitorEvents(PropertyFilterSpec spec) throws Exception {
		// Get all Events returned from the EventHistoryCollector
		// This will result in a large number of events, depending on the
		// page size of the latestPage.
		ObjectContent[] objectContents = _service.retrieveProperties(_propCol,
				new PropertyFilterSpec[] { spec });
		// Print out class names of the Events we got back
		if (objectContents != null) {
			ArrayOfEvent arrayEvents = (ArrayOfEvent) objectContents[0]
					.getPropSet(0).getVal();
			Event[] events = arrayEvents.getEvent();
			// Event[] events =
			// (Event[])objectContents[0].getPropSet(0).getVal();

			System.out.println("Events In the latestPage are : ");
			for (Event anEvent : events) {
				System.out.println("Event: " + anEvent.getClass().getName());
			}
		} else {
			System.out.println("No Events retrieved!");
		}
	}
}
