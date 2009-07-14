package com.intalio.vmware;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
import com.vmware.vim25.TaskInfoState;
import com.vmware.vim25.TraversalSpec;
import com.vmware.vim25.UpdateSet;

public class Snapshot {

	private Connection connection;

	private String vmName;
	private String snapshotOperation;
	private String snapshotName;

	private ManagedObjectReference propertyCollector;

	private ManagedObjectReference rootFolder;
	// Need to keep track of the created snapshot to remove it later.
	private ManagedObjectReference vmSnapshot;

	private ArrayList<String> SNAPSHOT_OPS = new ArrayList<String>(3);

	{
		SNAPSHOT_OPS.add("create");
		SNAPSHOT_OPS.add("remove");
		SNAPSHOT_OPS.add("removeall");
	}

	public Snapshot(Connection connection) {
		this.connection = connection;
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
	public void createSnapShot(String vmName, String ssName) {
		try {
			/********************************
			 ******************************** 
			 *** *** Your code goes here *** (fill-in 1 of 1) *** ***
			 ******************************** 
			 ******************************** 
			 */
			ManagedObjectReference cssTask = connection.getVimPort()
					.createSnapshot_Task(getVMByName(vmName), ssName,
							"Testing create snap shot", false, true);
			Object[] result = waitForValues(cssTask, new String[] {
					"info.state", "info.error", "info.progress" },
					new String[] { "state" }, // info has a property - state for
					// state of the task
					new Object[][] { new Object[] { TaskInfoState.success,
							TaskInfoState.error } });
			if (result[0].equals(TaskInfoState.success)) {
				System.out.println("Success: SnapShot creation");
				vmSnapshot = getVMSnapshotFromTask(cssTask);
			} else {
				System.out.println("Failure: SnapShot creation");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getSnapshotName() {
		return snapshotName;
	}

	public String getSnapshotOperation() {
		return snapshotOperation;
	}

	/**
	 * Demonstrate how to use the PropertyCollector to retrieve properties of a
	 * managed object and its managed object reference in one call.
	 * 
	 * Retrieves the Virtual machine name and its managed object reference.
	 * 
	 * @return ManagedObjectReference to the VirtualMachine managed object.
	 */
	public ManagedObjectReference getVMByName(String vmName) {
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
			objectSpec.setObj(rootFolder);
			objectSpec.setSkip(Boolean.TRUE);
			objectSpec.setSelectSet(new SelectionSpec[] { tSpec });
			ObjectSpec[] objectSpecs = new ObjectSpec[] { objectSpec };

			// Create PropertyFilterSpec using the PropertySpec and ObjectPec
			// created above.
			PropertyFilterSpec propertyFilterSpec = new PropertyFilterSpec();
			propertyFilterSpec.setPropSet(propertySpecs);
			propertyFilterSpec.setObjectSet(objectSpecs);

			PropertyFilterSpec[] propertyFilterSpecs = new PropertyFilterSpec[] { propertyFilterSpec };

			ObjectContent[] oCont = connection.getVimPort().retrieveProperties(
					propertyCollector, propertyFilterSpecs);
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

	public String getVmName() {
		return vmName;
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
	public ManagedObjectReference getVMSnapshotFromTask(
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

			ObjectContent[] oCont = connection.getVimPort().retrieveProperties(
					propertyCollector, propertyFilterSpecs);
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

	/**
	 * 
	 * @return TraversalSpec specification to get to the VirtualMachine managed
	 *         object.
	 */
	public TraversalSpec getVMTraversalSpec() {
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

	public void initialize() {
		initPropertyCollector();
		initRootFolder();
	}

	private void initPropertyCollector() {
		if (propertyCollector == null) {
			try {
				propertyCollector = connection.getServiceContent()
						.getPropertyCollector();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private void initRootFolder() {
		if (rootFolder == null) {
			try {
				rootFolder = connection.getServiceContent().getRootFolder();
			} catch (Exception e) {
				e.printStackTrace();
			}
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
	public void removeAllSnapShots(String vmName) {
		try {
			ManagedObjectReference rassTask = connection.getVimPort()
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
	 * This method removes a specific snapshot
	 * 
	 * @param vmss
	 *            ManagedObjectReference to a VirtualMachineSnapshot object
	 * @param removeChildren
	 *            Boolean value to indicate whether to remove all its children
	 * 
	 */
	public void removeSnapShot(ManagedObjectReference vmss,
			boolean removeChildren) {
		try {
			ManagedObjectReference rssTask = connection.getVimPort()
					.removeSnapshot_Task(vmss, removeChildren);
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

	public void setSnapshotName(String snapshotName) {
		this.snapshotName = snapshotName;
	}

	public void setSnapshotOperation(String snapshotOperation) {
		this.snapshotOperation = snapshotOperation;
	}

	public void setVmName(String vmName) {
		this.vmName = vmName;
	}

	public void takeSnapshot() {
		if (SNAPSHOT_OPS.contains(snapshotOperation)) {
			if (snapshotOperation.equalsIgnoreCase("create")) {
				if (vmName != null) {
					if (snapshotName != null) {
						snapshotName = vmName + "_"
								+ System.currentTimeMillis();
					}
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
						if (vmSnapshot != null) {
							removeSnapShot(vmSnapshot, true);
						} else {
							removeAllSnapShots(vmName);
						}
					} else {
						System.out.println("Snapshot not Removed");
					}
				} else {
					System.out
							.println("You need to specify a VM name for which the snapshot needs to be created !");
				}
			} else if (snapshotOperation.equalsIgnoreCase("remove")) {
				if (vmSnapshot != null) {
					removeSnapShot(vmSnapshot, true);
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

	}

	protected void updateValues(String[] props, Object[] vals,
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
	public Object[] waitForValues(ManagedObjectReference objmor,
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

		ManagedObjectReference filterSpecRef = connection.getVimPort()
				.createFilter(propertyCollector, spec, true);

		boolean reached = false;

		UpdateSet updateset = null;
		PropertyFilterUpdate[] filtupary = null;
		PropertyFilterUpdate filtup = null;
		ObjectUpdate[] objupary = null;
		ObjectUpdate objup = null;
		PropertyChange[] propchgary = null;
		PropertyChange propchg = null;
		while (!reached) {
			updateset = connection.getVimPort().waitForUpdates(
					propertyCollector, version);

			version = updateset.getVersion();

			if (updateset == null || updateset.getFilterSet() == null) {
				continue;
			}

			// Make this code more general purpose when PropCol changes later.
			filtupary = updateset.getFilterSet();
			filtup = null;
			for (PropertyFilterUpdate element : filtupary) {
				filtup = element;
				objupary = filtup.getObjectSet();
				objup = null;
				propchgary = null;
				for (ObjectUpdate element2 : objupary) {
					objup = element2;

					// TODO: Handle all "kind"s of updates.
					if (objup.getKind() == ObjectUpdateKind.modify
							|| objup.getKind() == ObjectUpdateKind.enter
							|| objup.getKind() == ObjectUpdateKind.leave) {
						propchgary = objup.getChangeSet();
						for (PropertyChange element3 : propchgary) {
							propchg = element3;
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
		connection.getVimPort().destroyPropertyFilter(filterSpecRef);

		return filterVals;
	}
}
