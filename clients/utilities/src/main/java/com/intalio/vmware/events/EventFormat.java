package com.intalio.vmware.events;

import java.util.Hashtable;

import com.vmware.apputils.AppUtil;
import com.vmware.vim.ArrayOfEventDescriptionEventDetail;
import com.vmware.vim.Event;
import com.vmware.vim.EventDescriptionEventDetail;
import com.vmware.vim.ObjectContent;
import com.vmware.vim.UserLoginSessionEvent;
import com.vmware.vim.VmPoweredOnEvent;
import com.vmware.vim.VmRenamedEvent;

/**
 *<pre>
 * t Retrieves and format the lastEvent - Hostd or Vpxd
 * 
 * b&gt;Command Line: &lt;/b&gt;
 * un.bat com.intalio.vmware.vm.EventFormat --url [webserviceurl]
 * -username [username] --password [password]
 *</pre>
 */

public class EventFormat {
	protected static AppUtil cb = null;

	/**
	 * The main entry point for the application.
	 */
	public static void main(String[] args) throws Exception {
		EventFormat app = new EventFormat();
		cb = AppUtil.initialize("EventFormat", args);
		cb.connect();
		app.formatLatestEvent();
		cb.disConnect();
	}

	final int Vm = 0;
	final int Host = 1;
	final int ComputeResource = 2;
	final int Datacenter = 3;

	final int Full = 4;

	// / <summary>
	// / This function formats the event message using the format strings
	// / in the EventDescriptionEventDetail for the event passed in
	// / using the passed in format requested
	// / </summary>
	// / <param name="fType">The format type you wish to display</param>
	// / <param name="eventDetail">Map of Event typename to
	// / EventDescriptionEventDetail objects</param>
	// / <param name="theEvent">The Event to format the message for</param>
	// / <returns></returns>
	String formatEvent(int fType, Hashtable eventDetail, Event theEvent) {
		// EventDescriptionEventDetail contains format strings and category for
		// the event
		// There are 5 format strings to use depending on which context:
		// formatOnComputeResource - Used for the ComputeResource
		// (Usually a cluster) context
		// formatOnDatacenter - Used for the Datacenter context
		// formatOnHost - Used for the HostSystem context
		// formatOnVm - Used for the VirtualMachine context
		// fullFormat - Used for a fully qualified context

		// The place holder used for string replacement has the following
		// format:
		// 
		// {<property-path>}
		//
		// Where <property-path> is the path to the data that should be used to
		// replace the place holder. These are relative to the event in question

		// For example, the messages for the Event type 'VmPoweredOnEvent' are:
		// formatOnComputeResource - "{vm.name} on  {host.name} is powered on"
		// formatOnDatacenter - "{vm.name} on  {host.name} is powered on"
		// formatOnHost - "{vm.name} is powered on"
		// formatOnVm - "Virtual machine on {host.name} is powered on"
		// fullFormat - "{vm.name} on {host.name} in
		// {datacenter.name} is powered on"

		// The messages for the Event type 'VmRenamedEvent' are:
		// formatOnComputeResource -
		// "Renamed {vm.name} from {oldName} to {newName}"
		// formatOnDatacenter - "Renamed {vm.name} from {oldName} to {newName}"
		// formatOnHost - "Renamed {vm.name} from {oldName} to {newName}"
		// formatOnVm - "Renamed from {oldName} to {newName}"
		// fullFormat - "Renamed {vm.name} from {oldName}
		// to {newName} in {datacenter.name}"

		// To handle event messages in a general way you would need to handle
		// each type
		// in a specific way.

		String typeName = theEvent.getClass().getName();
		// Remove package information...
		int lastDot = typeName.lastIndexOf('.');
		if (lastDot != -1) {
			typeName = typeName.substring(lastDot + 1);
		}
		EventDescriptionEventDetail detail = (EventDescriptionEventDetail) eventDetail
				.get(typeName);

		// Determine format string
		String format = detail.getFullFormat();
		switch (fType) {
		case ComputeResource:
			format = detail.getFormatOnComputeResource();
			break;
		case Datacenter:
			format = detail.getFormatOnDatacenter();
			break;
		case Host:
			format = detail.getFormatOnHost();
			break;
		case Vm:
			format = detail.getFormatOnVm();
			break;
		}

		if ("VmPoweredOnEvent".equals(typeName)) {
			return replaceText(format, (VmPoweredOnEvent) theEvent);
		} else if ("VmRenamedEvent".equals(typeName)) {
			return replaceText(format, (VmRenamedEvent) theEvent);
		} else if ("UserLoginSessionEvent".equals(typeName)) {
			return replaceText(format, (UserLoginSessionEvent) theEvent);
		} else {
			// Try generic, if all values are replaced by base type
			// return that, else return fullFormattedMessage;
			String ret = replaceText(format, theEvent);
			if (ret.length() == 0 || ret.indexOf("{") != -1) {
				ret = theEvent.getFullFormattedMessage();
			}
			return ret;
		}
	}

	protected void formatLatestEvent() throws Exception {
		try {
			// Get the static EventDescriptionEventDetail[] (format strings
			// etc.)
			ObjectContent[] oc = cb.getServiceUtil().getObjectProperties(
					cb.getConnection().getPropCol(),
					cb.getConnection().getServiceContent().getEventManager(),
					new String[] { "description.eventInfo" });
			ArrayOfEventDescriptionEventDetail arrayEventDetails = (ArrayOfEventDescriptionEventDetail) oc[0]
					.getPropSet(0).getVal();
			EventDescriptionEventDetail[] eventDetails = arrayEventDetails
					.getEventDescriptionEventDetail();

			// Map between event type and details
			Hashtable eventDetail = new Hashtable();
			for (int i = 0; i < eventDetails.length; ++i) {
				eventDetail.put(eventDetails[i].getKey(), eventDetails[i]);
			}

			// Get the 'latestEvent' property of the EventManager
			oc = cb.getServiceUtil().getObjectProperties(
					cb.getConnection().getPropCol(),
					cb.getConnection().getServiceContent().getEventManager(),
					new String[] { "latestEvent" });
			Event anEvent = (Event) oc[0].getPropSet(0).getVal();

			System.out.println("The latestEvent was : "
					+ anEvent.getClass().getName());
			System.out.println(formatEvent(Vm, eventDetail, anEvent));
			System.out.println(formatEvent(Host, eventDetail, anEvent));
			System.out.println(formatEvent(ComputeResource, eventDetail,
					anEvent));
			System.out.println(formatEvent(Datacenter, eventDetail, anEvent));
			System.out.println(formatEvent(Full, eventDetail, anEvent));
		} catch (Exception e) {
			throw e;
		}
	}

	String replaceText(String format, Event theEvent) {
		format = format.replaceAll("\\{userName\\}", theEvent.getUserName());
		if (theEvent.getComputeResource() != null) {
			format = format.replaceAll("\\{computeResource.name\\}", theEvent
					.getComputeResource().getName());
		}
		if (theEvent.getDatacenter() != null) {
			format = format.replaceAll("\\{datacenter.name\\}", theEvent
					.getDatacenter().getName());
		}
		if (theEvent.getHost() != null) {
			format = format.replaceAll("\\{host.name\\}", theEvent.getHost()
					.getName());
		}
		if (theEvent.getVm() != null) {
			format = format.replaceAll("\\{vm.name\\}", theEvent.getVm()
					.getName());
		}
		return format;
	}

	String replaceText(String format, UserLoginSessionEvent theEvent) {
		// Do base first
		format = replaceText(format, (Event) theEvent);
		// Then specific values
		format = format.replaceAll("\\{ipAddress\\}", theEvent.getIpAddress());
		return format;
	}

	String replaceText(String format, VmPoweredOnEvent theEvent) {
		// Same as base type
		return replaceText(format, (Event) theEvent);
	}

	String replaceText(String format, VmRenamedEvent theEvent) {
		// Do base first
		format = replaceText(format, (Event) theEvent);
		// Then specific values
		format = format.replaceAll("\\{oldName\\}", theEvent.getOldName());
		format = format.replaceAll("\\{newName\\}", theEvent.getNewName());
		return format;
	}
}
