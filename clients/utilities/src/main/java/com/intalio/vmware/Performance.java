package com.intalio.vmware;

import java.util.HashMap;

import com.vmware.vim25.ArrayOfPerfCounterInfo;
import com.vmware.vim25.DynamicProperty;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ObjectContent;
import com.vmware.vim25.ObjectSpec;
import com.vmware.vim25.PerfCounterInfo;
import com.vmware.vim25.PerfEntityMetric;
import com.vmware.vim25.PerfEntityMetricBase;
import com.vmware.vim25.PerfMetricId;
import com.vmware.vim25.PerfMetricIntSeries;
import com.vmware.vim25.PerfMetricSeries;
import com.vmware.vim25.PerfProviderSummary;
import com.vmware.vim25.PerfQuerySpec;
import com.vmware.vim25.PerfSampleInfo;
import com.vmware.vim25.PropertyFilterSpec;
import com.vmware.vim25.PropertySpec;
import com.vmware.vim25.SelectionSpec;
import com.vmware.vim25.TraversalSpec;

public class Performance {
	private Connection connection;

	private ManagedObjectReference propertyCollector;
	private ManagedObjectReference rootFolder;
	private ManagedObjectReference performanceManager;

	private HashMap<Integer, PerfCounterInfo> counterInfoMap = new HashMap<Integer, PerfCounterInfo>();
	private HashMap<String, Integer> counters = new HashMap<String, Integer>();
	private HashMap<Integer, PerfMetricId> metrics = new HashMap<Integer, PerfMetricId>();

	public Performance(Connection connection) {
		this.connection = connection;
	}

	/**
	 * This method retrieves all the performance metrics available on the
	 * managed entity. It could be either a VM or a Host system. The performance
	 * metrics are stored in the hashmap metrics with counterId being the key
	 * and PerfMetricId being the value.
	 * 
	 * @param entityName
	 *            - The name of the entity (vm or host)
	 * @param isVM
	 *            - Boolean indicating whether the entityName is a VM name
	 */
	private void getAvailablePerfMetricIds(String entityName, boolean isVM) {
		PerfMetricId[] pmArr = null;
		try {
			ManagedObjectReference entityMor = null;
			if (isVM) {
				entityMor = getVMByName(entityName);
			} else {
				entityMor = getHostByName(entityName);
			}

			pmArr = connection.getVimPort().queryAvailablePerfMetric(
					performanceManager, entityMor, null, null, new Integer(20));
			System.out.println("PerfMetricId array length: " + pmArr.length);
			for (PerfMetricId pmid : pmArr) {
				System.out.println("CounterID: " + pmid.getCounterId()
						+ " - Instance: " + pmid.getInstance());
				metrics.put(new Integer(pmid.getCounterId()), pmid);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param hostName
	 *            The name of the ESX host
	 * @return ManagedObjectReference to the host system
	 */
	public ManagedObjectReference getHostByName(String hostName) {
		ManagedObjectReference retVal = null;
		try {
			TraversalSpec tSpec = getHostSystemTraversalSpec();
			// Create Property Spec
			PropertySpec propertySpec = new PropertySpec();
			propertySpec.setAll(Boolean.FALSE);
			propertySpec.setPathSet(new String[] { "name" });
			propertySpec.setType("HostSystem");
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
					String hostnm = null;
					DynamicProperty[] dps = oc.getPropSet();
					if (dps != null) {
						for (DynamicProperty dp : dps) {
							// System.out.println(dp.getName() + " : " +
							// dp.getVal());
							hostnm = (String) dp.getVal();
						}
					}

					// System.out.println("VM Name: " + vmnm);
					if (hostnm != null && hostnm.equals(hostName)) {
						retVal = mr;
						System.out.println("MOR Type : " + mr.getType());
						System.out.println("Host Name: " + hostnm);
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
	 * @param mor
	 *            ManagedObjectReference of a managed object, specifically host
	 *            system
	 * @return String the name of the ESX host system
	 */
	public String getHostName(ManagedObjectReference mor) {
		String retVal = null;
		try {
			// Create Property Spec
			PropertySpec propertySpec = new PropertySpec();
			propertySpec.setAll(Boolean.FALSE);
			propertySpec.setPathSet(new String[] { "name" });
			propertySpec.setType("HostSystem");
			PropertySpec[] propertySpecs = new PropertySpec[] { propertySpec };

			// Now create Object Spec
			ObjectSpec objectSpec = new ObjectSpec();
			objectSpec.setObj(mor);
			// objectSpec.setSkip(Boolean.TRUE);
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
	public TraversalSpec getHostSystemTraversalSpec() {
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
	 * This method retrieves all the performance counters available on the
	 * system it is connected to. The performance counters are stored in the
	 * hashmap counters with group.counter.rolluptype being the key and id being
	 * the value.
	 */
	private void getPerfCounters() {
		try {
			// Create Property Spec
			PropertySpec propertySpec = new PropertySpec();
			propertySpec.setAll(Boolean.FALSE);
			propertySpec.setPathSet(new String[] { "perfCounter" });
			propertySpec.setType("PerformanceManager");
			PropertySpec[] propertySpecs = new PropertySpec[] { propertySpec };

			// Now create Object Spec
			ObjectSpec objectSpec = new ObjectSpec();
			objectSpec.setObj(performanceManager);
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
					DynamicProperty[] dps = oc.getPropSet();
					if (dps != null) {
						for (DynamicProperty dp : dps) {
							// System.out.println(dp.getName() + " : " +
							// dp.getVal());
							PerfCounterInfo[] pciArr = ((ArrayOfPerfCounterInfo) dp
									.getVal()).getPerfCounterInfo();
							for (PerfCounterInfo pci : pciArr) {
								String fullCounter = pci.getGroupInfo()
										.getKey()
										+ "."
										+ pci.getNameInfo().getKey()
										+ "." + pci.getRollupType().getValue();
								// System.out.println(pci.getNameInfo().getLabel()
								// + " : " + pci.getKey() + " : " +
								// pci.getUnitInfo().getLabel() + " - " +
								// fullCounter);
								System.out.println(fullCounter + " - "
										+ pci.getKey());
								counterInfoMap.put(new Integer(pci.getKey()),
										pci);
								counters.put(fullCounter, new Integer(pci
										.getKey()));

								// if
								// (pci.getNameInfo().getLabel().contains("CPU Used"))
								// {
								// retVal = pci;
								// break;
								// }
							}
						}
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method retrieves the PerfProviderSummary for a mamaged entity
	 * 
	 * @param entityName
	 *            - The name of the managed entity (VM or a Host system)
	 * @param isVM
	 *            - Boolean indicating whether the name is a VM name
	 */
	public void getPerfProviderSummary(String entityName, boolean isVM) {
		try {
			ManagedObjectReference mor = null;
			if (isVM) {
				mor = getVMByName(entityName);
			} else {
				mor = getHostByName(entityName);
			}

			PerfProviderSummary pps = connection.getVimPort()
					.queryPerfProviderSummary(performanceManager, mor);
			printPerfProviderSummary(pps);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method is used to construct the PerfQuerySpec required for querying
	 * performance information related to the managed entity
	 * 
	 * @param entityName
	 *            - The name of the managed entity (VM or Host system)
	 * @param perfCounter
	 *            - The name of the performance counter (cpu.usage.average)
	 * @return PerfQuerySpec
	 */
	private PerfQuerySpec getPerfQuerySpec(String entityName, boolean isVM,
			String perfCounter) {
		PerfQuerySpec retVal = null;

		try {
			/********************************
			 ******************************** 
			 *** *** Your code goes here *** (fill-in 1 of 1) *** ***
			 ******************************** 
			 ******************************** 
			 */
			Integer counterInteger = counters.get(perfCounter);
			if (counterInteger == null) {
				System.out.println("Counter doesn't exist...........");
				System.exit(1);
			}
			int counterId = counterInteger.intValue();
			System.out.println("Counter id " + counterId + " - " + perfCounter);
			if (!metrics.containsKey(counterInteger)) {
				System.out
						.println("This Counter is not supported in this entity $$$$$$$$$$$$$$$$$$");
				System.exit(1);
			}
			PerfMetricId pmid = new PerfMetricId();
			pmid.setInstance("*");
			pmid.setCounterId(counterId);
			PerfQuerySpec pqSpec = new PerfQuerySpec();
			// You can obtain this from the PerfProviderSummary.
			// By default 20 sec interval exists.
			// When connecting to ESX host directly, interval value 0 can be
			// used.
			// But the value retrieved will be the same in that 20 second
			// window.
			pqSpec.setIntervalId(new Integer(20));
			pqSpec.setMaxSample(new Integer(1));
			pqSpec.setMetricId(new PerfMetricId[] { pmid });
			ManagedObjectReference entityMor = null;
			if (isVM) {
				entityMor = getVMByName(entityName);
			} else {
				entityMor = getHostByName(entityName);
			}
			pqSpec.setEntity(entityMor);
			retVal = pqSpec;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return retVal;
	}

	/**
	 * This method actually retrieves the performance stats from the server.
	 * 
	 * @param entityName
	 *            - The name of the managed entity (VM or Host system)
	 * @param isVM
	 *            - Boolean value indicating if the entity is a VM
	 * @param perfCounter
	 *            - The name of the performance counter (cpu.usage.average)
	 * @return PerfEntityMetricBase array
	 */
	public PerfEntityMetricBase[] getPerfStats(String entityName, boolean isVM,
			String perfCounter) {
		PerfEntityMetricBase[] retVal = null;
		try {
			retVal = connection.getVimPort().queryPerf(
					performanceManager,
					new PerfQuerySpec[] { getPerfQuerySpec(entityName, isVM,
							perfCounter) });
			System.out.println("PerfEntityMetricBase array length: "
					+ retVal.length);
			for (PerfEntityMetricBase pemb : retVal) {
				// System.out.println(pemb.getTypeDesc().toString());

				PerfMetricSeries[] vals = ((PerfEntityMetric) pemb).getValue();
				PerfSampleInfo[] infos = ((PerfEntityMetric) pemb)
						.getSampleInfo();
				System.out.println("Sample time range: "
						+ infos[0].getTimestamp().getTime().toString()
						+ " - "
						+ infos[infos.length - 1].getTimestamp().getTime()
								.toString() + "\n");

				for (int vi = 0; vi < vals.length; ++vi) {

					PerfCounterInfo pci = counterInfoMap.get(new Integer(
							vals[vi].getId().getCounterId()));
					System.out.println("Counter ID: " + pci.getKey()
							+ "\nCounter Instance: "
							+ vals[vi].getId().getInstance()
							+ "\nCounter Info: " + pci.getGroupInfo().getKey()
							+ "." + pci.getNameInfo().getKey() + "."
							+ pci.getRollupType().getValue() + " - "
							+ pci.getUnitInfo().getKey());
					if (vals[vi] instanceof PerfMetricIntSeries) {
						PerfMetricIntSeries val = (PerfMetricIntSeries) vals[vi];
						long[] longs = val.getValue();
						for (int k = 0; k < longs.length; ++k) {
							System.out.print("Stats value: " + longs[k] + "\n");
						}
						System.out.println();
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
		initPerfMgr();
	}

	private void initPerfMgr() {
		if (performanceManager == null) {
			try {
				performanceManager = connection.getServiceContent()
						.getPerfManager();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
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
	 * This method prints the PerfProviderSummary information
	 */
	public void printPerfProviderSummary(PerfProviderSummary pps) {
		System.out.println("Current supported: " + pps.isCurrentSupported());
		System.out.println("Refresh rate: " + pps.getRefreshRate());
		System.out.println("Summary supported: " + pps.isSummarySupported());
		System.out.println("Managed entity: " + pps.getEntity());
	}
}
