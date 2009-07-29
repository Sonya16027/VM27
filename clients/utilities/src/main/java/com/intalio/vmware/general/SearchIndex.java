package com.intalio.vmware.general;

import org.w3c.dom.Element;

import com.vmware.apputils.AppUtil;
import com.vmware.apputils.Log;
import com.vmware.apputils.OptionSpec;
import com.vmware.vim.ManagedObjectReference;
import com.vmware.vim.ServiceContent;
import com.vmware.vim.VimPortType;

/**
 *<pre>
 * This sample excercise the SearchIndex API
 * 
 * &lt;b&gt;To run this samples following parameters are used :&lt;/b&gt;
 * 
 * cName        [required]   : name of the datacenter.
 * mDnsName     [optional]   : Dns of a virtual machine
 * ostDnsName   [optional]   : Dns of the host machine
 * mPath        [optional]   : Inventory path of a virtual machine
 * mIP          [optional]   : IP Address of a virtual machine.
 * 
 * b&gt; Command:
 * 
 * un the search index giving the valid dcName myDatacenter &lt;/b&gt;
 * un.bat com.intalio.vmware.general.SearchIndex --url [webserviceurl]
 * -username [username] --password [password] --dcName [myDatacenter]
 * 
 * b&gt;Run the search index giving the valid dcName myDatacenter and vmpath
 * o virtual machine named Test &lt;/b&gt;
 * un.bat com.intalio.vmware.general.SearchIndex --url [webserviceurl]
 * -username [username] --password [password] --dcName [myDatacenter] 
 * -vmpath [&quot;/DatacenterName/vm/Test&quot;]
 * 
 * b&gt;Run the search index giving the valid dcName myDatacenter and hostdns
 * ame as 'abc.bcd.com' &lt;/b&gt;
 * un.bat com.intalio.vmware.general.SearchIndex --url [webserviceurl]
 * -username [username] --password [password] --dcName [myDatacenter] 
 * -hostDns [abc.bcd.com]
 * 
 * 
 * b&gt;Run the search index giving the valid dcName myDatacenter and ip of the
 * m as 111.123.155.21 &lt;/b&gt;
 * 
 * un.bat com.intalio.vmware.general.SearchIndex --url [webserviceurl]
 * -username [username] --password [password] --dcName [myDatacenter] 
 * -vmIP [111.123.155.21]
 *</pre>
 */

public class SearchIndex {
	static VimPortType service; // All Methods
	static ServiceContent content;
	protected static AppUtil cb = null;

	protected static OptionSpec[] constructOptions() {
		OptionSpec[] useroptions = new OptionSpec[5];
		useroptions[0] = new OptionSpec("dcName", "String", 1,
				"Name of the Datacenter", null);
		useroptions[1] = new OptionSpec("vmDnsName", "String", 0,
				"Virtual machine dns name", null);
		useroptions[2] = new OptionSpec("hostDnsName", "String", 0,
				"Host machine DNS name", null);
		useroptions[3] = new OptionSpec("vmPath", "String", 0, "VM path", null);
		useroptions[4] = new OptionSpec("vmIP", "String", 0, "VM IP Address",
				null);
		return useroptions;
	}

	/**
	 * Excercise the SearchIndex API
	 * 
	 * @param args
	 *            Usage is: <url> <user> <password> <Datacenter Name> <A VM DNS
	 *            Name> <A Host DNS Name> <A VM Inventory Path>
	 */
	public static void main(String[] args) throws Exception {

		try {
			SearchIndex app = new SearchIndex();
			cb = AppUtil.initialize("SearchIndex", SearchIndex
					.constructOptions(), args);
			cb.connect();
			String dcName = cb.get_option("dcName");
			String vmDnsName = cb.get_option("vmDnsName");
			String hostDnsName = cb.get_option("hostDnsName");
			String vmPath = cb.get_option("vmPath");
			String vmIP = cb.get_option("vmIP");
			com.vmware.apputils.vim.ServiceConnection S1 = cb.getConnection();
			content = S1.getServiceContent();
			service = S1.getService();
			// Find the Datacenter by using findChild()
			ManagedObjectReference dcMoRef = cb.getServiceUtil()
					.getDecendentMoRef(null, "Datacenter", dcName);
			if (dcMoRef != null) {
				System.out.println("Found Datacenter with name: " + dcName
						+ ", MoRef: " + dcMoRef.get_value());
			} else {
				System.out.println("Datacenter not Found with name: " + dcName);
			}
			if (vmDnsName != null) {
				ManagedObjectReference vmMoRef = service.findByDnsName(content
						.getSearchIndex(), dcMoRef, vmDnsName, true);
				if (vmMoRef != null) {
					System.out.println("Found VirtualMachine with DNS name: "
							+ vmDnsName + ", MoRef: " + vmMoRef.get_value());
				} else {
					System.out
							.println("VirtualMachine not Found with DNS name: "
									+ vmDnsName);
				}
			}
			if (vmPath != null) {
				ManagedObjectReference vmMoRef = service.findByInventoryPath(
						content.getSearchIndex(), vmPath);
				if (vmMoRef != null) {
					System.out.println("Found VirtualMachine with Path: "
							+ vmPath + ", MoRef: " + vmMoRef.get_value());

				} else {
					System.out.println("VirtualMachine not found with vmPath "
							+ "address: " + vmPath);
				}
			}
			if (vmIP != null) {
				ManagedObjectReference vmMoRef = service.findByIp(content
						.getSearchIndex(), dcMoRef, vmIP, true);
				if (vmMoRef != null) {
					System.out.println("Found VirtualMachine with IP "
							+ "address " + vmIP + ", MoRef: "
							+ vmMoRef.get_value());
				} else {
					System.out.println("VirtualMachine not found with IP "
							+ "address: " + vmIP);
				}
			}
			if (hostDnsName != null) {
				ManagedObjectReference hostMoRef = service.findByDnsName(
						content.getSearchIndex(), null, hostDnsName, false);
				if (hostMoRef != null) {
					System.out
							.println("Found HostSystem with DNS name "
									+ hostDnsName + ", MoRef: "
									+ hostMoRef.get_value());
				} else {
					System.out.println("HostSystem not Found with DNS name:"
							+ hostDnsName);
				}
			}
			cb.disConnect();
		} catch (Exception e) {
			if (e instanceof org.apache.axis.AxisFault) {
				org.apache.axis.AxisFault fault = (org.apache.axis.AxisFault) e;
				org.w3c.dom.Element[] errors = fault.getFaultDetails();
				for (Element error : errors) {
					if (error.toString().indexOf("DuplicateName") != -1) {
						System.out
								.println("Alarm with the name already exists");
					} else if (error.toString().indexOf("InvalidArgument") != -1) {
						System.out.println("Specification is invalid");
					} else if (error.toString().indexOf("InvalidName") != -1) {
						System.out.println("Alarm name is empty or too long");
					} else if (error.toString().indexOf("RuntimeFault") != -1) {
						System.out.println(error.toString());
					} else {
						System.out.println(error.toString());
					}
				}
			} else {
				throw e;
			}
		}
	}

	Log log = new Log();

	public SearchIndex() {
	}
}
