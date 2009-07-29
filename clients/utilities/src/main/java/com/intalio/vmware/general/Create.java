package com.intalio.vmware.general;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.w3c.dom.Element;

import com.vmware.apputils.AppUtil;
import com.vmware.apputils.Log;
import com.vmware.apputils.OptionSpec;
import com.vmware.vim.ClusterConfigSpec;
import com.vmware.vim.HostConnectSpec;
import com.vmware.vim.ManagedObjectReference;

/**
 *<pre>
 * his sample create managed entity like Host-Standalone Cluster
 * atacenter, and folder.
 * 
 * b&gt;To run this samples following parameters are used :&lt;/b&gt;
 * 
 * arentName [required]   : specifies the name of the parent folder  
 * temType   [required]   : Type of the object to be added e.g &quot;Host-Standalone&quot;,&quot;Cluster&quot;, &quot;Datacenter&quot;, &quot;Folder&quot;,
 * temName   [required]   : Name of the item added.
 * 
 * b&gt;Command:
 * 
 * o create a folder named myFolder under root folder Root:&lt;/b&gt;
 * un.bat com.intalio.vmware.general.Create --url [webserviceurl]
 * -username [username] --password [password] --parentName [Root]
 * -itemType [Folder] --itemName [myFolder]
 * 
 * b&gt;To create a datacenter named myDatacenter under root folder Root:&lt;/b&gt;
 * un.bat com.intalio.vmware.general.Create --url [webserviceurl]
 * -username [username] --password [password] --parentName [Root]
 * -itemType [Datacenter] --itemName [myDatacenter]
 * 
 * b&gt;To create a cluster named myCluster under root folder Root:&lt;/b&gt;
 * un.bat com.intalio.vmware.general.Create --url [webserviceurl]
 * -username [username] --password [password] --parentName [Root]
 * -itemType [Cluster] --itemName [myCluster]
 *</pre>
 */

public class Create {
	protected static AppUtil cb = null;

	protected static OptionSpec[] constructOptions() {
		OptionSpec[] useroptions = new OptionSpec[3];
		useroptions[0] = new OptionSpec("parentName", "String", 1,
				"Specifies the name of the parent folder", null);
		useroptions[1] = new OptionSpec("itemType", "String", 1,
				"Host-Standalone|Cluster|Datacenter|Folder", null);
		useroptions[2] = new OptionSpec("itemName", "String", 1,
				"Name of the item being added: For Host "
						+ "please specify the name of the host machine.", null);
		return useroptions;
	}

	protected static String getPassword() throws Exception {
		System.out.print("Enter the password for the host: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		return (reader.readLine());
	}

	protected static Integer getPort() throws Exception {
		System.out.print("Enter the port for the host : "
				+ "[Hit enter for default:] ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		String portStr = reader.readLine();
		if ((portStr == null) || portStr.length() == 0) {
			return new Integer(902);
		} else {
			return Integer.valueOf(portStr);
		}
	}

	protected static String getUserName() throws Exception {
		System.out.print("Enter the userName for the host: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		return (reader.readLine());
	}

	public static void main(String[] args) throws Exception {
		Create app = new Create();
		cb = AppUtil.initialize("Create", Create.constructOptions(), args);
		cb.connect();
		app.doCreate();
		cb.disConnect();
	}

	Log log = new Log();

	protected void doCreate() throws Exception {
		try {
			String type = getItemType();
			String name = getItemName();

			ManagedObjectReference taskMoRef = null;

			ManagedObjectReference folderMoRef = cb.getServiceUtil()
					.getDecendentMoRef(null, "Folder", getParentName());

			if (folderMoRef == null) {
				System.out.println("Parent folder '" + getParentName()
						+ "' not found");
			} else {
				if (type.equals("Folder")) {
					cb.getConnection().getService().createFolder(folderMoRef,
							name);
					System.out.println("Sucessfully created::" + name);
				} else if (type.equals("Datacenter")) {
					cb.getConnection().getService().createDatacenter(
							folderMoRef, name);
					System.out.println("Sucessfully created::" + name);
				} else if (type.equals("Cluster")) {
					ClusterConfigSpec clusterSpec = new ClusterConfigSpec();
					cb.getConnection().getService().createCluster(folderMoRef,
							name, clusterSpec);
					System.out.println("Sucessfully created::" + name);
				} else if (type.equals("Host-Standalone")) {
					HostConnectSpec hostSpec = new HostConnectSpec();
					hostSpec.setHostName(name);
					hostSpec.setUserName(getUserName());
					hostSpec.setPassword(getPassword());
					hostSpec.setPort(getPort());
					if (type.equals("Host-Standalone")) {
						taskMoRef = cb.getConnection().getService()
								.addStandaloneHost_Task(folderMoRef, hostSpec,
										true);

						if (taskMoRef != null) {
							String status = cb.getServiceUtil().waitForTask(
									taskMoRef);
							if (status.equalsIgnoreCase("sucess")) {
								System.out.println("Sucessfully created::"
										+ name);
							} else {
								System.out.println("Host'" + name
										+ " not created::");
							}
						}
					}
				} else {
					System.out.println("Unknown Type. Allowed types are:");
					System.out.println(" Host-Standalone");
					System.out.println(" Cluster");
					System.out.println(" Datacenter");
					System.out.println(" Folder");
				}
			}
		} catch (Exception e) {
			if (e instanceof org.apache.axis.AxisFault) {
				org.apache.axis.AxisFault fault = (org.apache.axis.AxisFault) e;
				org.w3c.dom.Element[] errors = fault.getFaultDetails();
				for (Element error : errors) {
					if (error.toString().indexOf("DuplicateName") != -1) {
						System.out
								.println("Managed Entity with the name already exists");
					} else if (error.toString().indexOf("InvalidArgument") != -1) {
						System.out.println("Specification is invalid");
					} else if (error.toString().indexOf("InvalidName") != -1) {
						System.out
								.println("Managed Entity Name is empty or too long");
					} else if (error.toString().indexOf("RuntimeFault") != -1) {
						System.out.println(error.toString() + " "
								+ "Either parent name or item name is invalid");
					} else if (error.toString().indexOf(
							"NotSupportedFault: null") != -1) {
						System.out
								.println(error.toString()
										+ " "
										+ "The Operation is not supported on this object");
					} else {
						System.out
								.println(error.toString()
										+ " "
										+ "The Operation is not supported on this object");
					}
				}
			} else {
				throw e;
			}
		}
	}

	protected String getItemName() throws Exception {
		return cb.get_option("itemName");
	}

	protected String getItemType() throws Exception {
		return cb.get_option("itemType");
	}

	protected String getParentName() throws Exception {
		return cb.get_option("parentName");
	}

	protected String getparentType() throws Exception {
		return cb.get_option("parentType");
	}
}
