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
 *
 * This class demonstrates how to retrieve performance statistics.
 * 
 * Usage: java GetPerfStats <host> <username> <password> <VMName | HostName> <isVM(true|false)> <PerfGroup.PerfCounter.RollupType>
 * 
 * host     - URL of the Virtual Center Server host
 *            https://<Server host name / ip>/sdk
 * username - User name
 * password - Password
 * vmname | hostname  - Virtual machine name or Host name
 * isVM - Bollean value to indicate whether it is a VM
 * PerfGroup.PerfCounter.RollupType - The performance statistic you want to retrieve
 * 
 * @author bparimi
 */

import java.net.MalformedURLException;
import java.net.URL;
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
import com.vmware.vim25.ServiceContent;
import com.vmware.vim25.TraversalSpec;
import com.vmware.vim25.VimPortType;
import com.vmware.vim25.VimServiceLocator;

public class Ex5_GetPerfStats {

	private static final ManagedObjectReference SIMO_REF = new ManagedObjectReference();
	private static ManagedObjectReference PROP_COLLECTOR;
	private static ManagedObjectReference ROOT_FOLDER;
	private static ManagedObjectReference PERF_MGR;
	private static VimPortType VIM_PORT;
	private static ServiceContent SERVICE_CONTENT;
	private static final String STR_SERVICE_INSTANCE = "ServiceInstance";
	private static String VIM_HOST;
	private static String USER_NAME;
	private static String PASSWORD;

	private static HashMap<Integer, PerfCounterInfo> counterInfoMap = new HashMap<Integer, PerfCounterInfo>();
	private static HashMap<String, Integer> counters = new HashMap<String, Integer>();
	private static HashMap<Integer, PerfMetricId> metrics = new HashMap<Integer, PerfMetricId>();

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
		initPerfMgr();
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

	private static void initPerfMgr() {
		if (PERF_MGR == null) {
			try {
				PERF_MGR = SERVICE_CONTENT.getPerfManager();
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
	 *            Establishes session with the virtual center server
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
	 * @param hostName
	 *            The name of the ESX host
	 * @return ManagedObjectReference to the host system
	 */
	public static ManagedObjectReference getHostByName(String hostName) {
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
	public static String getHostName(ManagedObjectReference mor) {
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

			ObjectContent[] oCont = VIM_PORT.retrieveProperties(PROP_COLLECTOR,
					propertyFilterSpecs);
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
	private static void getAvailablePerfMetricIds(String entityName,
			boolean isVM) {
		PerfMetricId[] pmArr = null;
		try {
			ManagedObjectReference entityMor = null;
			if (isVM) {
				entityMor = getVMByName(entityName);
			} else {
				entityMor = getHostByName(entityName);
			}

			pmArr = VIM_PORT.queryAvailablePerfMetric(PERF_MGR, entityMor,
					null, null, new Integer(20));
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
	 * This method retrieves all the performance counters available on the
	 * system it is connected to. The performance counters are stored in the
	 * hashmap counters with group.counter.rolluptype being the key and id being
	 * the value.
	 */
	private static void getPerfCounters() {
		try {
			// Create Property Spec
			PropertySpec propertySpec = new PropertySpec();
			propertySpec.setAll(Boolean.FALSE);
			propertySpec.setPathSet(new String[] { "perfCounter" });
			propertySpec.setType("PerformanceManager");
			PropertySpec[] propertySpecs = new PropertySpec[] { propertySpec };

			// Now create Object Spec
			ObjectSpec objectSpec = new ObjectSpec();
			objectSpec.setObj(PERF_MGR);
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
	public static void getPerfProviderSummary(String entityName, boolean isVM) {
		try {
			ManagedObjectReference mor = null;
			if (isVM) {
				mor = getVMByName(entityName);
			} else {
				mor = getHostByName(entityName);
			}

			PerfProviderSummary pps = VIM_PORT.queryPerfProviderSummary(
					PERF_MGR, mor);
			printPerfProviderSummary(pps);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method prints the PerfProviderSummary information
	 */
	public static void printPerfProviderSummary(PerfProviderSummary pps) {
		System.out.println("Current supported: " + pps.isCurrentSupported());
		System.out.println("Refresh rate: " + pps.getRefreshRate());
		System.out.println("Summary supported: " + pps.isSummarySupported());
		System.out.println("Managed entity: " + pps.getEntity());
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
	private static PerfQuerySpec getPerfQuerySpec(String entityName,
			boolean isVM, String perfCounter) {
		PerfQuerySpec retVal = null;

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
			Integer counterInteger = counters.get(perfCounter);
			if (counterInteger == null) {
				System.out.println("Counter doesn't exist...........");
				System.exit(1);
			}
			int counterId = counterInteger.intValue();
			System.out.println("Counter id " + counterId+ " - "+perfCounter);
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
	public static PerfEntityMetricBase[] getPerfStats(String entityName,
			boolean isVM, String perfCounter) {
		PerfEntityMetricBase[] retVal = null;
		try {
			retVal = VIM_PORT.queryPerf(PERF_MGR,
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
	 * This method prints the command line argument details for this program.
	 */
	private static void printUsage() {
		System.out
				.println("Usage: java Ex5_GetPerfStats <host> <username> <password> <VMName | HostName> <isVM(true|false)> <PerfGroup.PerfCounter.RollupType>");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// This is to accept all SSL certifcates by default.
		System.setProperty(
				"org.apache.axis.components.net.SecureSocketFactory",
				"org.apache.axis.components.net.SunFakeTrustSocketFactory");

		if (args.length < 6) {
			printUsage();
		} else {
			try {
				VIM_HOST = args[0];
				USER_NAME = args[1];
				PASSWORD = args[2];

				String entityName = args[3];
				boolean isVM = Boolean.parseBoolean(args[4]);
				String perfCounter = args[5];
				initAll();

				System.out
						.println("------------------------------------------------------");
				System.out
						.println("Performance Counters Available on the Connected System");
				System.out
						.println("------------------------------------------------------");
				getPerfCounters();
				// getPerfProviderSummary(entityName, true);
				System.out
						.println("----------------------------------------------------");
				System.out
						.println("Performance Metrics Available on the Managed Entity");
				System.out
						.println("----------------------------------------------------");
				System.out.println("Entity name: " + entityName);
				System.out.println("isVM: " + isVM);
				getAvailablePerfMetricIds(entityName, isVM);
				// getAvailablePerfMetricIds("bparimi-dev1.eng.vmware.com",
				// false);
				System.out.println("-----------------------");
				System.out.println("Performance Statistics");
				System.out.println("-----------------------");
				getPerfStats(entityName, isVM, perfCounter);
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