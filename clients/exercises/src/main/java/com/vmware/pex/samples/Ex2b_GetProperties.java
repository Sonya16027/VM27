package com.vmware.pex.samples;

/* **********************************************************
 * Copyright 2009 VMware, Inc.  All rights reserved.
 * **********************************************************/

/* **********************************************************************************************
* DISCLAIMER. THIS CODE IS PROVIDED TO YOU "AS IS" WITHOUT WARRANTIES OR CONDITIONS 
* OF ANY KIND, WHETHER ORAL OR WRITTEN, EXPRESS OR IMPLIED. THE AUTHOR SPECIFICALLY 
* DISCLAIMS ANY IMPLIED WARRANTIES OR CONDITIONS OF MERCHANTABILITY, SATISFACTORY 
* QUALITY, NON-INFRINGEMENT AND FITNESS FOR A PARTICULAR PURPOSE. 
 * **********************************************************************************************/
 
/**
 * This class demonstrates how to use the PropertyCollector to retrieve the properties of a managed object
 * 
 * This class uses the client side code generated by AXIS.
 * This class will not compile with JAX-WS / JAXB generated client side code.
 * 
 * Usage: java Connect <host> <username> <password> <[vminfo | hostvminfo | vmmor vmname]>
 * 
 * host     - URL of the Virtual Center Server / ESX host
 *            https://<Server host name / ip>/sdk
 * username - User name
 * password - Password
 * vminfo   - To retrieve the VM info, its name and power state
 * hostvminfo   - To retrieve the names of the VMs and hosts
 * vmmor    - To retrieve the MOREF of the VM
 * vmname   - Name of the VM for which MOREF needs to be retrieved
 *
 * @author bparimi
 */
import java.net.MalformedURLException;
import java.net.URL;

import com.vmware.vim25.DynamicProperty;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ObjectContent;
import com.vmware.vim25.ObjectSpec;
import com.vmware.vim25.PropertyFilterSpec;
import com.vmware.vim25.PropertySpec;
import com.vmware.vim25.SelectionSpec;
import com.vmware.vim25.ServiceContent;
import com.vmware.vim25.TraversalSpec;
import com.vmware.vim25.VimPortType;
import com.vmware.vim25.VimServiceLocator;

public class Ex2b_GetProperties {

	private static final ManagedObjectReference SIMO_REF = new ManagedObjectReference();
	private static VimPortType VIM_PORT;
	private static ServiceContent SERVICE_CONTENT;
	private static final String STR_SERVICE_INSTANCE = "ServiceInstance";
	private static String VIM_HOST;
	private static String USER_NAME;
	private static String PASSWORD;
	private static ManagedObjectReference PROP_COLLECTOR;
	private static ManagedObjectReference ROOT_FOLDER;

	/**
	 * Set the managed object reference type, and value to ServiceInstance
	 */
	private static void initSIMORef() {
		SIMO_REF.setType(STR_SERVICE_INSTANCE);
		SIMO_REF.set_value(STR_SERVICE_INSTANCE);
	}

	/**
	 * 
	 * @param url
	 *            The URL of the Virtual Center Server
	 * 
	 *            https://<Server IP / host name>/sdk
	 * 
	 *            The method establishes connection with the web service port on
	 *            the server. This is not to be confused with the session
	 *            connection.
	 * 
	 */
	private static void initVimPort(String url) {
		VimServiceLocator locator = new VimServiceLocator();
		locator.setMaintainSession(true);
		try {
			VIM_PORT = locator.getVimPort(new URL(url));
		} catch (MalformedURLException mue) {
			mue.printStackTrace();
		} catch (Exception se) {
			se.printStackTrace();
		}
	} 

	/*
	 * This method calls all the initialization methods required in order.
	 */
	private static void initAll() {
		// These following methods have to be called in this order.
		initSIMORef();
		initVimPort(VIM_HOST);
		initServiceContent();
		try {
			connect(VIM_HOST, USER_NAME, PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}

		initPropertyCollector();
		initRootFolder();

	}

	private static void initServiceContent() {
		if (SERVICE_CONTENT == null) {
			try {
				SERVICE_CONTENT = VIM_PORT.retrieveServiceContent(SIMO_REF);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private static void initPropertyCollector() {
		if (PROP_COLLECTOR == null) {
			try {
				PROP_COLLECTOR = SERVICE_CONTENT.getPropertyCollector();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private static void initRootFolder() {
		if (ROOT_FOLDER == null) {
			try {
				ROOT_FOLDER = SERVICE_CONTENT.getRootFolder();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 
	 * @param url
	 *            The URL of the server
	 * @param uname
	 *            The user name for the session
	 * @param pword
	 *            The password for the user
	 * 
	 *            Establishes session with the virtual center / ESX server
	 * 
	 * @throws Exception
	 */
	private static void connect(String url, String uname, String pword)
			throws Exception {
		VIM_PORT.login(SERVICE_CONTENT.getSessionManager(), uname, pword, null);
	}

	/**
	 * Disconnects the user session
	 * 
	 * @throws Exception
	 */
	private static void disconnect() throws Exception {
		VIM_PORT.logout(SERVICE_CONTENT.getSessionManager());
	}

	/**
	 * 
	 * @return TraversalSpec specification to get to the VirtualMachine managed
	 *         object.
	 */
	public static TraversalSpec getVMTraversalSpec() {
		// Create a traversal spec that starts from the 'root' objects
		// and traverses the inventory tree to get to the VirtualMachines.
		// Build the traversal specs bottoms up

		// Traversal to get to the vmFolder from DataCenter
		/********************************
		 ********************************
		 ***                          ***
		 ***   Your code goes here    ***
		 ***    (fill-in 1 of 1)      ***
		 ***                          ***
		 ********************************
		 ********************************
		 */
		
		TraversalSpec dataCenterToVMFolder = new TraversalSpec();
		dataCenterToVMFolder.setName("DataCenterToVMFolder");
		dataCenterToVMFolder.setType("Datacenter");
		dataCenterToVMFolder.setPath("vmFolder");
		dataCenterToVMFolder.setSkip(false);
		SelectionSpec sSpec = new SelectionSpec();
		sSpec.setName("VisitFolders");
		SelectionSpec[] sSpecs = new SelectionSpec[] { sSpec };
		dataCenterToVMFolder.setSelectSet(sSpecs);
		// TraversalSpec to get to the DataCenter from rootFolder
		TraversalSpec traversalSpec = new TraversalSpec();
		traversalSpec.setName("VisitFolders");
		traversalSpec.setType("Folder");
		traversalSpec.setPath("childEntity");
		traversalSpec.setSkip(false);
		SelectionSpec[] sSpecArr = new SelectionSpec[] { sSpec, dataCenterToVMFolder };
		traversalSpec.setSelectSet(sSpecArr);
		return traversalSpec;		
	}

	/**
	 * Demonstrate how to use the PropertyCollector to retrieve properties of a
	 * managed object.
	 * 
	 * Prints Virtual machine name and its power state of all the VMs in the
	 * datacenter (Either VC or ESX host).
	 */
	public static void getVMInfo() {
		try {
			TraversalSpec tSpec = getVMTraversalSpec();
			// Create Property Spec
			PropertySpec propertySpec = new PropertySpec();
			propertySpec.setAll(Boolean.FALSE);
			propertySpec
					.setPathSet(new String[] { "name", "runtime.powerState" });
			propertySpec.setType("VirtualMachine");
			PropertySpec[] propertySpecs = new PropertySpec[] { propertySpec };

			// Now create Object Spec
			ObjectSpec objectSpec = new ObjectSpec();
			objectSpec.setObj(ROOT_FOLDER);
			objectSpec.setSkip(Boolean.TRUE);
			objectSpec.setSelectSet(new SelectionSpec[] { tSpec });
			ObjectSpec[] objectSpecs = new ObjectSpec[] { objectSpec };

			// Create PropertyFilterSpec using the PropertySpec and ObjectPec
			// created above.
			PropertyFilterSpec propertyFilterSpec = new PropertyFilterSpec();
			propertyFilterSpec.setPropSet(propertySpecs);
			propertyFilterSpec.setObjectSet(objectSpecs);

			PropertyFilterSpec[] propertyFilterSpecs = new PropertyFilterSpec[] { propertyFilterSpec };

			ObjectContent[] oCont = VIM_PORT.retrieveProperties(PROP_COLLECTOR,
					propertyFilterSpecs);
			if (oCont != null) {
				// System.out.println("ObjectContent Length : " + oCont.length);
				StringBuilder sb = new StringBuilder();
				for (ObjectContent oc : oCont) {
					DynamicProperty[] dps = oc.getPropSet();
					if (dps != null) {
						for (DynamicProperty dp : dps) {
							if (dp.getName().equalsIgnoreCase("name")) {
								sb.append(dp.getVal());
								sb.append(" : ");
							} else {
								sb.append(dp.getVal());
								sb.append("\n");
							}
							// System.out.println(dp.getName() + " : " +
							// dp.getVal());
						}
					}
				}
				System.out.println(sb.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Demonstrate how to use the PropertyCollector to retrieve properties of a
	 * managed object and its managed object reference in one call.
	 * 
	 * Retrieves the Virtual machine name and its managed object reference.
	 * 
	 * @return ManagedObjectReference to the VirtualMachine managed object.
	 */
	public static ManagedObjectReference getVMByName(String vmName) {
		ManagedObjectReference retVal = null;
		try {
			TraversalSpec tSpec = getVMTraversalSpec();
			// Create Property Spec
			PropertySpec propertySpec = new PropertySpec();
			propertySpec.setAll(Boolean.FALSE);
			propertySpec.setPathSet(new String[] { "name" });
			propertySpec.setType("VirtualMachine");
			PropertySpec[] propertySpecs = new PropertySpec[] { propertySpec };

			// Now create Object Spec
			ObjectSpec objectSpec = new ObjectSpec();
			objectSpec.setObj(ROOT_FOLDER);
			objectSpec.setSkip(Boolean.TRUE);
			objectSpec.setSelectSet(new SelectionSpec[] { tSpec });
			ObjectSpec[] objectSpecs = new ObjectSpec[] { objectSpec };

			// Create PropertyFilterSpec using the PropertySpec and ObjectPec
			// created above.
			PropertyFilterSpec propertyFilterSpec = new PropertyFilterSpec();
			propertyFilterSpec.setPropSet(propertySpecs);
			propertyFilterSpec.setObjectSet(objectSpecs);

			PropertyFilterSpec[] propertyFilterSpecs = new PropertyFilterSpec[] { propertyFilterSpec };

			ObjectContent[] oCont = VIM_PORT.retrieveProperties(PROP_COLLECTOR,
					propertyFilterSpecs);
			if (oCont != null) {
				// System.out.println("ObjectContent Length : " + oCont.length);
				for (ObjectContent oc : oCont) {
					ManagedObjectReference mr = oc.getObj();
					// System.out.println("MOR Type : " + mr.getType());
					String vmnm = null;
					DynamicProperty[] dps = oc.getPropSet();
					if (dps != null) {
						for (DynamicProperty dp : dps) {
							// System.out.println(dp.getName() + " : " +
							// dp.getVal());
							vmnm = (String) dp.getVal();
						}
					}

					// System.out.println("VM Name: " + vmnm);
					if (vmnm != null && vmnm.equals(vmName)) {
						retVal = mr;
						System.out.println("MOR Type : " + mr.getType());
						System.out.println("VM Name: " + getVMName(mr));
						break;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return retVal;
	}

	/**
	 * Demonstrate how to use the PropertyCollector to retrieve properties of a
	 * managed object when the managed object reference is known.
	 * 
	 * Retrieves the Virtual machine name.
	 * 
	 * @return String name of the VirtualMachine.
	 */
	public static String getVMName(ManagedObjectReference mor) {
		String retVal = null;
		try {
			// Create Property Spec
			PropertySpec propertySpec = new PropertySpec();
			propertySpec.setAll(Boolean.FALSE);
			propertySpec.setPathSet(new String[] { "name" });
			propertySpec.setType("VirtualMachine");
			PropertySpec[] propertySpecs = new PropertySpec[] { propertySpec };

			// Now create Object Spec
			ObjectSpec objectSpec = new ObjectSpec();
			objectSpec.setObj(mor);
			ObjectSpec[] objectSpecs = new ObjectSpec[] { objectSpec };

			// Create PropertyFilterSpec using the PropertySpec and ObjectPec
			// created above.
			PropertyFilterSpec propertyFilterSpec = new PropertyFilterSpec();
			propertyFilterSpec.setPropSet(propertySpecs);
			propertyFilterSpec.setObjectSet(objectSpecs);

			PropertyFilterSpec[] propertyFilterSpecs = new PropertyFilterSpec[] { propertyFilterSpec };

			ObjectContent[] oCont = VIM_PORT.retrieveProperties(PROP_COLLECTOR,
					propertyFilterSpecs);
			if (oCont != null) {
				// System.out.println("ObjectContent Length : " + oCont.length);
				for (ObjectContent oc : oCont) {
					// DynamicProperty[] dps = oc.getPropSet();
					DynamicProperty[] dps = oc.getPropSet();
					if (dps != null) {
						for (DynamicProperty dp : dps) {
							// System.out.println(dp.getName() + " : " +
							// dp.getVal());
							retVal = (String) dp.getVal();
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return retVal;
	}

	/**
	 * 
	 * @return TraversalSpec specification to get to the HostSystem managed
	 *         object.
	 */
	public static TraversalSpec getHostSystemTraversalSpec() {
		// Create a traversal spec that starts from the 'root' objects
		// and traverses the inventory tree to get to the Host system.
		// Build the traversal specs bottoms up

		// Traversal to get to the host from ComputeResource
		TraversalSpec computeResourceToHostSystem = new TraversalSpec();
		computeResourceToHostSystem.setName("computeResourceToHostSystem");
		computeResourceToHostSystem.setType("ComputeResource");
		computeResourceToHostSystem.setPath("host");
		computeResourceToHostSystem.setSkip(false);
		SelectionSpec sSpec = new SelectionSpec();
		sSpec.setName("VisitFolders");
		SelectionSpec[] sSpecs = new SelectionSpec[] { sSpec };
		computeResourceToHostSystem.setSelectSet(sSpecs);

		// Traversal to get to the hostFolder from DataCenter
		TraversalSpec dataCenterToHostFolder = new TraversalSpec();
		dataCenterToHostFolder.setName("DataCenterToHostFolder");
		dataCenterToHostFolder.setType("Datacenter");
		dataCenterToHostFolder.setPath("hostFolder");
		dataCenterToHostFolder.setSkip(false);
		dataCenterToHostFolder.setSelectSet(sSpecs);

		// TraversalSpec to get to the DataCenter from rootFolder
		TraversalSpec traversalSpec = new TraversalSpec();
		traversalSpec.setName("VisitFolders");
		traversalSpec.setType("Folder");
		traversalSpec.setPath("childEntity");
		traversalSpec.setSkip(false);
		SelectionSpec[] sSpecArr = new SelectionSpec[] { sSpec,
				dataCenterToHostFolder, computeResourceToHostSystem };
		traversalSpec.setSelectSet(sSpecArr);

		return traversalSpec;
	}

	/**
	 * Demonstrate how to use the PropertyCollector to retrieve properties of
	 * two different types of managed objects in one call.
	 * 
	 * Prints the names of the managed objects in the datacenter.
	 */
	public static void getHostAndVMNames() {
		try {
			// Create Property Filter Spec for HostSystem
			TraversalSpec tSpec = getHostSystemTraversalSpec();
			// Create Property Spec
			PropertySpec propertySpec = new PropertySpec();
			propertySpec.setAll(Boolean.FALSE);
			propertySpec.setPathSet(new String[] { "name" });
			propertySpec.setType("HostSystem");
			PropertySpec[] propertySpecs = new PropertySpec[] { propertySpec };

			// Now create Object Spec
			ObjectSpec objectSpec = new ObjectSpec();
			objectSpec.setObj(ROOT_FOLDER);
			objectSpec.setSkip(Boolean.TRUE);
			objectSpec.setSelectSet(new SelectionSpec[] { tSpec });
			ObjectSpec[] objectSpecs = new ObjectSpec[] { objectSpec };

			// Create PropertyFilterSpec using the PropertySpec and ObjectPec
			// created above.
			PropertyFilterSpec propertyFilterSpec = new PropertyFilterSpec();
			propertyFilterSpec.setPropSet(propertySpecs);
			propertyFilterSpec.setObjectSet(objectSpecs);

			// Create Property Filter Spec for VirtualMachine
			TraversalSpec vmTraversalSpec = getVMTraversalSpec();
			// Create Property Spec
			PropertySpec vmPropertySpec = new PropertySpec();
			vmPropertySpec.setAll(Boolean.FALSE);
			vmPropertySpec.setPathSet(new String[] { "name" });
			vmPropertySpec.setType("VirtualMachine");
			PropertySpec[] vmPropertySpecs = new PropertySpec[] { vmPropertySpec };

			// Now create Object Spec
			ObjectSpec vmObjectSpec = new ObjectSpec();
			vmObjectSpec.setObj(ROOT_FOLDER);
			vmObjectSpec.setSkip(Boolean.TRUE);
			vmObjectSpec.setSelectSet(new SelectionSpec[] { vmTraversalSpec });
			ObjectSpec[] vmObjectSpecs = new ObjectSpec[] { vmObjectSpec };

			// Create PropertyFilterSpec using the PropertySpec and ObjectPec
			// created above.
			PropertyFilterSpec vmPropertyFilterSpec = new PropertyFilterSpec();
			vmPropertyFilterSpec.setPropSet(vmPropertySpecs);
			vmPropertyFilterSpec.setObjectSet(vmObjectSpecs);

			// Add HostSystem and VirtualMachine property filter specs to
			// property filter spec list
			PropertyFilterSpec[] pfSpecList = new PropertyFilterSpec[] {
					propertyFilterSpec, vmPropertyFilterSpec };

			ObjectContent[] oCont = VIM_PORT.retrieveProperties(PROP_COLLECTOR,
					pfSpecList);
			if (oCont != null) {
				// System.out.println("ObjectContent Length : " + oCont.length);
				for (ObjectContent oc : oCont) {
					DynamicProperty[] dps = oc.getPropSet();
					ManagedObjectReference mor = oc.getObj();
					if (dps != null) {
						for (DynamicProperty dp : dps) {
							System.out.println(mor.getType() + " "
									+ dp.getName() + " : " + dp.getVal());
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void printUsage() {
		System.out
				.println("Usage: java Ex2b_GetProperties <host> <username> <password> <[vminfo | hostvminfo | vmmor vmname]>");
	}

	/**
	 * @param args
	 *            arg[0] - URL of the Virtual Center Server / ESX host
	 *            https://<Server host name / ip>/sdk arg[1] - User name arg[2]
	 *            - Password
	 */
	public static void main(String[] args) {
		// This is to accept all SSL certifcates by default.
		System.setProperty(
				"org.apache.axis.components.net.SecureSocketFactory",
				"org.apache.axis.components.net.SunFakeTrustSocketFactory");
		if (args.length < 4) {
			printUsage();
		} else {
			try {
				VIM_HOST = args[0];
				USER_NAME = args[1];
				PASSWORD = args[2];

				initAll();
				if (args[3].equalsIgnoreCase("vminfo")) {
					getVMInfo();
				} else if (args[3].equalsIgnoreCase("hostvminfo")) {
					getHostAndVMNames();
				} else if (args[3].equalsIgnoreCase("vmmor")) {
					try {
						String vmName = args[4];
						ManagedObjectReference vmMor = getVMByName(vmName
								.trim());
						if (vmMor == null) {
							System.out
									.println("Virtual Machine with the name \""
											+ vmName
											+ "\" does not exist in the inventory.");
						} else {
							// This is just to confirm that the MOREF retrieved,
							// belongs
							// to the correct VM.
							System.out
									.println("Confirmation : ---------------------------- : "
											+ getVMName(vmMor));
						}
					} catch (ArrayIndexOutOfBoundsException aie) {
						System.out
								.println("You need to specify a VM name to retrieve its MOREF !");
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					disconnect();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}