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
 * This class demonstrates how to run tasks.
 * Specifically shows how to create / remove snapshots. 
 * 
 * Snapshot removal requires ManagedObjectReference to the VirtulaMachineSnapshot 
 * managed object. The client application needs to store that, if it requires to 
 * remove a specific snapshot. Since, this is just a sample to demo, the code 
 * exists to do that, but the user has to choose to remove after the creation. 
 * The sample removes all the snapshots when the managed object reference to 
 * the specific snapshot is not available.
 * 
 * 
 * Usage: java RunTask <host> <username> <password> <vmname> <snapshotOperation> <snapshotName>
 * 
 * host     - URL of the Virtual Center Server host
 *            https://<Server host name / ip>/sdk
 * username - User name
 * password - Password
 * vmname   - Virtual machine name
 * snapshotOperation    - One of create | removeall
 * snapshotName - Requires a name for the snapshot if creating, otherwise the system chooses a name
 * 
 * @author bparimi
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import com.vmware.vim25.DynamicProperty;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ObjectContent;
import com.vmware.vim25.ObjectSpec;
import com.vmware.vim25.ObjectUpdate;
import com.vmware.vim25.ObjectUpdateKind;
import com.vmware.vim25.PropertyChange;
import com.vmware.vim25.PropertyChangeOp;
import com.vmware.vim25.PropertyFilterSpec;
import com.vmware.vim25.PropertyFilterUpdate;
import com.vmware.vim25.PropertySpec;
import com.vmware.vim25.SelectionSpec;
import com.vmware.vim25.ServiceContent;
import com.vmware.vim25.TaskInfoState;
import com.vmware.vim25.TraversalSpec;
import com.vmware.vim25.UpdateSet;
import com.vmware.vim25.VimPortType;
import com.vmware.vim25.VimServiceLocator;

public class Ex4_SnapshotOp {

	private static final ManagedObjectReference SIMO_REF = new ManagedObjectReference();
	private static VimPortType VIM_PORT;
	private static ServiceContent SERVICE_CONTENT;
	private static final String STR_SERVICE_INSTANCE = "ServiceInstance";
	private static String VIM_HOST;
	private static String USER_NAME;
	private static String PASSWORD;
	private static ManagedObjectReference PROP_COLLECTOR;
	private static ManagedObjectReference ROOT_FOLDER;

	// Need to keep track of the created snapshot to remove it later.
	private static ManagedObjectReference VM_SNAPSHOT;

	private static ArrayList<String> SNAPSHOT_OPS = new ArrayList<String>(3);
	static {
		SNAPSHOT_OPS.add("create");
		SNAPSHOT_OPS.add("remove");
		SNAPSHOT_OPS.add("removeall");
	}

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
		SelectionSpec[] sSpecArr = new SelectionSpec[] { sSpec,
				dataCenterToVMFolder };
		traversalSpec.setSelectSet(sSpecArr);

		return traversalSpec;
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
						System.out.println("VM Name: " + vmnm);
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
	 * This method creates a snapshot of a specific VM.
	 * 
	 * @param vmName
	 *            The name of the VM for which the snapshot is being created
	 * @param ssName
	 *            The name for the snapshot
	 * 
	 */
	public static void createSnapShot(String vmName, String ssName) {
		try {
			/********************************
			 ********************************
			 ***                          ***
			 ***   Your code goes here    ***
			 ***    (fill-in 1 of 1)      ***
			 ***                          ***
			 ********************************
			 ********************************
			 */
			ManagedObjectReference cssTask = VIM_PORT.createSnapshot_Task(
					getVMByName(vmName), ssName, "Testing create snap shot",
					false, true);
			Object[] result = waitForValues(cssTask, new String[] {
			"info.state", "info.error", "info.progress" },
			new String[] { "state" }, // info has a property - state for
			// state of the task
			new Object[][] { new Object[] { TaskInfoState.success,
			TaskInfoState.error } });
			if (result[0].equals(TaskInfoState.success)) {
				System.out.println("Success: SnapShot creation");
				VM_SNAPSHOT = getVMSnapshotFromTask(cssTask);
			} else {
				System.out.println("Failure: SnapShot creation");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method removes a specific snapshot
	 * 
	 * @param vmss
	 *            ManagedObjectReference to a VirtualMachineSnapshot object
	 * @param removeChildren
	 *            Boolean value to indicate whether to remove all its children
	 * 
	 */
	public static void removeSnapShot(ManagedObjectReference vmss,
			boolean removeChildren) {
		try {
			ManagedObjectReference rssTask = VIM_PORT.removeSnapshot_Task(vmss,
					removeChildren);
			Object[] result = waitForValues(rssTask, new String[] {
					"info.state", "info.error", "info.progress" },
					new String[] { "state" }, // info has a property - state for
					// state of the task
					new Object[][] { new Object[] { TaskInfoState.success,
							TaskInfoState.error } });
			if (result[0].equals(TaskInfoState.success)) {
				System.out.println("Success: Removing the SnapShot");
			} else {
				System.out.println("Failure: Removing the SnapShot");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method removes all the snapshots on a given VM
	 * 
	 * @param vmName
	 *            The name of the VM for which all the snapshots need to be
	 *            removed
	 * 
	 */
	public static void removeAllSnapShots(String vmName) {
		try {
			ManagedObjectReference rassTask = VIM_PORT
					.removeAllSnapshots_Task(getVMByName(vmName));
			Object[] result = waitForValues(rassTask, new String[] {
					"info.state", "info.error", "info.progress" },
					new String[] { "state" }, // info has a property - state for
					// state of the task
					new Object[][] { new Object[] { TaskInfoState.success,
							TaskInfoState.error } });
			if (result[0].equals(TaskInfoState.success)) {
				System.out.println("Success: Removing all SnapShots");
			} else {
				System.out.println("Failure: Removing all SnapShots");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Demonstrate how to use the PropertyCollector to retrieve properties of a
	 * managed object when the managed object reference is known.
	 * 
	 * Retrieves info.result property of the Task that contains the managed
	 * object reference of the VirtualMachineSnapshot. This managed object
	 * reference is required to remove that specific snapshot.
	 * 
	 * @return ManagedObjectReference MOREF of the VM snapshot.
	 */
	public static ManagedObjectReference getVMSnapshotFromTask(
			ManagedObjectReference mor) {
		ManagedObjectReference retVal = null;
		try {
			// Create Property Spec
			PropertySpec propertySpec = new PropertySpec();
			propertySpec.setAll(Boolean.FALSE);
			propertySpec.setPathSet(new String[] { "info.result" });
			propertySpec.setType("Task");
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
							retVal = (ManagedObjectReference) dp.getVal();
							System.out.println(retVal.getType() + " : "
									+ retVal.get_value());
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return retVal;
	}

	/************************************************************/
	/**
	 * Handle Updates for a single object. waits till expected values of
	 * properties to check are reached Destroys the ObjectFilter when done.
	 * 
	 * @param objmor
	 *            MOR of the Object to wait for</param>
	 * @param filterProps
	 *            Properties list to filter
	 * @param endWaitProps
	 *            Properties list to check for expected values these be
	 *            properties of a property in the filter properties list
	 * @param expectedVals
	 *            values for properties to end the wait
	 * @return true indicating expected values were met, and false otherwise
	 */
	public static Object[] waitForValues(ManagedObjectReference objmor,
			String[] filterProps, String[] endWaitProps, Object[][] expectedVals)
			throws Exception {
		// version string is initially null
		String version = "";
		Object[] endVals = new Object[endWaitProps.length];
		Object[] filterVals = new Object[filterProps.length];

		PropertyFilterSpec spec = new PropertyFilterSpec();
		spec.setObjectSet(new ObjectSpec[] { new ObjectSpec() });
		spec.getObjectSet(0).setObj(objmor);

		spec.setPropSet(new PropertySpec[] { new PropertySpec() });
		spec.getPropSet(0).setPathSet(filterProps);
		spec.getPropSet(0).setType(objmor.getType());

		spec.getObjectSet(0).setSelectSet(null);
		spec.getObjectSet(0).setSkip(Boolean.FALSE);

		ManagedObjectReference filterSpecRef = VIM_PORT.createFilter(
				PROP_COLLECTOR, spec, true);

		boolean reached = false;

		UpdateSet updateset = null;
		PropertyFilterUpdate[] filtupary = null;
		PropertyFilterUpdate filtup = null;
		ObjectUpdate[] objupary = null;
		ObjectUpdate objup = null;
		PropertyChange[] propchgary = null;
		PropertyChange propchg = null;
		while (!reached) {
			updateset = VIM_PORT.waitForUpdates(PROP_COLLECTOR, version);

			version = updateset.getVersion();

			if (updateset == null || updateset.getFilterSet() == null) {
				continue;
			}

			// Make this code more general purpose when PropCol changes later.
			filtupary = updateset.getFilterSet();
			filtup = null;
			for (int fi = 0; fi < filtupary.length; fi++) {
				filtup = filtupary[fi];
				objupary = filtup.getObjectSet();
				objup = null;
				propchgary = null;
				for (int oi = 0; oi < objupary.length; oi++) {
					objup = objupary[oi];

					// TODO: Handle all "kind"s of updates.
					if (objup.getKind() == ObjectUpdateKind.modify
							|| objup.getKind() == ObjectUpdateKind.enter
							|| objup.getKind() == ObjectUpdateKind.leave) {
						propchgary = objup.getChangeSet();
						for (int ci = 0; ci < propchgary.length; ci++) {
							propchg = propchgary[ci];
							updateValues(endWaitProps, endVals, propchg);
							updateValues(filterProps, filterVals, propchg);
						}
					}
				}
			}

			Object expctdval = null;
			// Check if the expected values have been reached and exit the loop
			// if done.
			// Also exit the WaitForUpdates loop if this is the case.
			for (int chgi = 0; chgi < endVals.length && !reached; chgi++) {
				for (int vali = 0; vali < expectedVals[chgi].length && !reached; vali++) {
					expctdval = expectedVals[chgi][vali];

					reached = expctdval.equals(endVals[chgi]) || reached;
				}
			}
		}

		// Destroy the filter when we are done.
		VIM_PORT.destroyPropertyFilter(filterSpecRef);

		return filterVals;
	}

	protected static void updateValues(String[] props, Object[] vals,
			PropertyChange propchg) {
		for (int findi = 0; findi < props.length; findi++) {
			if (propchg.getName().lastIndexOf(props[findi]) >= 0) {
				if (propchg.getOp() == PropertyChangeOp.remove) {
					vals[findi] = "";
				} else {
					vals[findi] = propchg.getVal();
					// System.out.println("Changed value : " +
					// propchg.getVal());
				}
			}
		}
	}

	/************************************************************/

	private static void printUsage() {
		System.out
				.println("Usage: java Ex4_SnapShotOp <host> <username> <password> <vmname> <snapshot_operation[create | removeall]> <snapshotname>");
	}

	/**
	 * @param args
	 *            arg[0] - URL of the Virtual Center Server host https://<Server
	 *            host name / ip>/sdk arg[1] - User name arg[2] - Password
	 *            arg[3] - virtual machine name args[5] - create | remove |
	 *            removeall args[4] - SnapShot name
	 */
	public static void main(String[] args) {
		// This is to accept all SSL certifcates by default.
		System.setProperty(
				"org.apache.axis.components.net.SecureSocketFactory",
				"org.apache.axis.components.net.SunFakeTrustSocketFactory");

		if (args.length < 5) {
			printUsage();
		} else {
			try {
				VIM_HOST = args[0];
				USER_NAME = args[1];
				PASSWORD = args[2];
				String vmName = args[3];
				String snapshotOperation = args[4];
				String snapshotName = null;
				if (args.length > 5)
					snapshotName = args[5];
				initAll();

				if (SNAPSHOT_OPS.contains(snapshotOperation)) {
					if (snapshotOperation.equalsIgnoreCase("create")) {
						if (vmName != null) {
							if (args.length == 5)
								snapshotName = vmName + "_"
										+ System.currentTimeMillis();
							createSnapShot(vmName, snapshotName);
							System.out
									.println("Please press 'r' to remove the created snapshot and press enter : ");
							String response = "n";
							BufferedReader bir = new BufferedReader(
									new InputStreamReader(System.in));
							try {
								response = bir.readLine().toLowerCase();
							} catch (IOException ioe) {
								ioe.printStackTrace();
							}

							System.out.println("Input: " + response);
							if (response.startsWith("r")) {
								if (VM_SNAPSHOT != null) {
									removeSnapShot(VM_SNAPSHOT, true);
								} else {
									removeAllSnapShots(vmName);
								}
							}
							else
								System.out.println("Snapshot not Removed");
						} else {
							System.out
									.println("You need to specify a VM name for which the snapshot needs to be created !");
						}
					} else if (snapshotOperation.equalsIgnoreCase("remove")) {
						if (VM_SNAPSHOT != null) {
							removeSnapShot(VM_SNAPSHOT, true);
						} else {
							removeAllSnapShots(vmName);
						}
					} else if (snapshotOperation.equalsIgnoreCase("removeall")) {
						removeAllSnapShots(vmName);
					} else {
						System.out
								.println("Please specify valid snapshot operation (create | sremoveall) !");
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