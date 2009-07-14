package com.intalio.vmware.general;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

import org.w3c.dom.Element;

import com.vmware.apputils.AppUtil;
import com.vmware.apputils.Log;
import com.vmware.apputils.OptionSpec;
import com.vmware.vim.DatastoreInfo;
import com.vmware.vim.DynamicProperty;
import com.vmware.vim.HostHardwareSummary;
import com.vmware.vim.HostListSummaryQuickStats;
import com.vmware.vim.HostSystemConnectionState;
import com.vmware.vim.InvalidProperty;
import com.vmware.vim.ManagedEntityStatus;
import com.vmware.vim.ManagedObjectReference;
import com.vmware.vim.NasDatastoreInfo;
import com.vmware.vim.ObjectContent;
import com.vmware.vim.ObjectSpec;
import com.vmware.vim.PropertyFilterSpec;
import com.vmware.vim.PropertySpec;
import com.vmware.vim.RuntimeFault;
import com.vmware.vim.SelectionSpec;
import com.vmware.vim.ServiceContent;
import com.vmware.vim.TraversalSpec;
import com.vmware.vim.VimPortType;
import com.vmware.vim.VirtualMachinePowerState;
import com.vmware.vim.VirtualMachineQuickStats;
import com.vmware.vim.VirtualMachineToolsStatus;
import com.vmware.vim.VmfsDatastoreInfo;

/**
 *<pre>
 * This sample excercise the PropertyCollector API of all the managed entity
 * 
 * &lt;b&gt;To run this samples following parameters are used :&lt;/b&gt;
 * 
 * cName        [required]   : name of the datacenter.
 * mDnsName     [required]   : Dns name of a virtual machine
 * 
 * b&gt;Command: &lt;/b&gt;
 * 
 * un.bat com.intalio.vmware.general.PropertyCollector --url [webserviceurl]
 * -username [username] --password [password] --dcName [datacenterName]
 * -vmDnsName [vmDnsName]
 *</pre>
 */

public class PropertyCollector {
	static class Host {
		private ManagedObjectReference moRef;
		private String name;
		private ManagedObjectReference network;
		private HostHardwareSummary hardware;
		private HostSystemConnectionState connectionState;
		private ManagedEntityStatus overallStatus;
		private HostListSummaryQuickStats quickStats;

		public Host(ManagedObjectReference _this) {
			this.setMoRef(_this);
		}

		public Host(ManagedObjectReference _this, String name,
				ManagedObjectReference network, HostHardwareSummary hardware,
				HostSystemConnectionState connectionState,
				ManagedEntityStatus overallStatus,
				HostListSummaryQuickStats quickStats) {
			this.setMoRef(_this);
			this.setName(name);
			this.setNetwork(network);
			this.setHardware(hardware);
			this.setConnectionState(connectionState);
			this.setOverallStatus(overallStatus);
			this.setQuickStats(quickStats);
		}

		public HostSystemConnectionState getConnectionState() {
			return connectionState;
		}

		public HostHardwareSummary getHardware() {
			return hardware;
		}

		public ManagedObjectReference getMoRef() {
			return moRef;
		}

		public String getName() {
			return name;
		}

		public ManagedObjectReference getNetwork() {
			return network;
		}

		public ManagedEntityStatus getOverallStatus() {
			return overallStatus;
		}

		public HostListSummaryQuickStats getQuickStats() {
			return quickStats;
		}

		public void setConnectionState(HostSystemConnectionState connectionState) {
			this.connectionState = connectionState;
		}

		public void setHardware(HostHardwareSummary hardware) {
			this.hardware = hardware;
		}

		public void setMoRef(ManagedObjectReference moRef) {
			this.moRef = moRef;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setNetwork(ManagedObjectReference network) {
			this.network = network;
		}

		public void setOverallStatus(ManagedEntityStatus overallStatus) {
			this.overallStatus = overallStatus;
		}

		public void setQuickStats(HostListSummaryQuickStats quickStats) {
			this.quickStats = quickStats;
		}
	}

	static class MeNode {
		private ManagedObjectReference parent;
		private ManagedObjectReference node;
		private String name;
		private ArrayList children = new ArrayList();

		public MeNode(ManagedObjectReference parent,
				ManagedObjectReference node, String name) {
			this.setParent(parent);
			this.setNode(node);
			this.setName(name);
		}

		public ArrayList getChildren() {
			return children;
		}

		public String getName() {
			return name;
		}

		public ManagedObjectReference getNode() {
			return node;
		}

		public ManagedObjectReference getParent() {
			return parent;
		}

		public void setChildren(ArrayList children) {
			this.children = children;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setNode(ManagedObjectReference node) {
			this.node = node;
		}

		public void setParent(ManagedObjectReference parent) {
			this.parent = parent;
		}
	}

	static class Network {
		private ManagedObjectReference moRef;
		private String name;

		public Network(ManagedObjectReference _this) {
			this.setMoRef(_this);
		}

		public ManagedObjectReference getMoRef() {
			return moRef;
		}

		public String getName() {
			return name;
		}

		public void setMoRef(ManagedObjectReference moRef) {
			this.moRef = moRef;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	static class VirtualMachine {
		private ManagedObjectReference moRef;
		private String name;
		private ManagedObjectReference network;
		private ManagedObjectReference host;
		private VirtualMachinePowerState powerState;
		private ManagedEntityStatus overallStatus;
		private VirtualMachineQuickStats quickStats;

		public VirtualMachine(ManagedObjectReference _this) {
			this.setMoRef(_this);
		}

		public VirtualMachine(ManagedObjectReference _this, String name,
				ManagedObjectReference network, ManagedObjectReference host,
				VirtualMachinePowerState powerState,
				ManagedEntityStatus overallStatus,
				VirtualMachineQuickStats quickStats) {
			this.setMoRef(_this);
			this.setName(name);
			this.setNetwork(network);
			this.setHost(host);
			this.setPowerState(powerState);
			this.setOverallStatus(overallStatus);
			this.setQuickStats(quickStats);
		}

		public ManagedObjectReference getHost() {
			return host;
		}

		public ManagedObjectReference getMoRef() {
			return moRef;
		}

		public String getName() {
			return name;
		}

		public ManagedObjectReference getNetwork() {
			return network;
		}

		public ManagedEntityStatus getOverallStatus() {
			return overallStatus;
		}

		public VirtualMachinePowerState getPowerState() {
			return powerState;
		}

		public VirtualMachineQuickStats getQuickStats() {
			return quickStats;
		}

		public void setHost(ManagedObjectReference host) {
			this.host = host;
		}

		public void setMoRef(ManagedObjectReference moRef) {
			this.moRef = moRef;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setNetwork(ManagedObjectReference network) {
			this.network = network;
		}

		public void setOverallStatus(ManagedEntityStatus overallStatus) {
			this.overallStatus = overallStatus;
		}

		public void setPowerState(VirtualMachinePowerState powerState) {
			this.powerState = powerState;
		}

		public void setQuickStats(VirtualMachineQuickStats quickStats) {
			this.quickStats = quickStats;
		}
	}

	static class VMInfo {
		private String name = "";
		private String configGuestFullName = "";
		private int configHardwareMemoryMB;
		private int configHardwareNumCPU;
		private VirtualMachineToolsStatus guestToolsStatus;
		private ManagedEntityStatus guestHeartbeatStatus;
		private String guestIpAddress = "";
		private String guestHostName = "";
		private VirtualMachinePowerState runtimePowerState;
		private int summaryQuickStatsOverallCpuUsage;
		private int summaryQuickStatsHostMemoryUsage;
		private int summaryQuickStatsGuestMemoryUsage;
		private String hostSystemName = "";
		private ArrayList taskInfoNames;
		private ArrayList datastoreInfos;
		private ArrayList networkNames;

		String getConfigGuestFullName() {
			return configGuestFullName;
		}

		int getConfigHardwareMemoryMB() {
			return configHardwareMemoryMB;
		}

		int getConfigHardwareNumCPU() {
			return configHardwareNumCPU;
		}

		ArrayList getDatastoreInfos() {
			return datastoreInfos;
		}

		ManagedEntityStatus getGuestHeartbeatStatus() {
			return guestHeartbeatStatus;
		}

		String getGuestHostName() {
			return guestHostName;
		}

		String getGuestIpAddress() {
			return guestIpAddress;
		}

		VirtualMachineToolsStatus getGuestToolsStatus() {
			return guestToolsStatus;
		}

		String getHostSystemName() {
			return hostSystemName;
		}

		String getName() {
			return name;
		}

		ArrayList getNetworkNames() {
			return networkNames;
		}

		VirtualMachinePowerState getRuntimePowerState() {
			return runtimePowerState;
		}

		int getSummaryQuickStatsGuestMemoryUsage() {
			return summaryQuickStatsGuestMemoryUsage;
		}

		int getSummaryQuickStatsHostMemoryUsage() {
			return summaryQuickStatsHostMemoryUsage;
		}

		int getSummaryQuickStatsOverallCpuUsage() {
			return summaryQuickStatsOverallCpuUsage;
		}

		ArrayList getTaskInfoNames() {
			return taskInfoNames;
		}

		void setConfigGuestFullName(String configGuestFullName) {
			this.configGuestFullName = configGuestFullName;
		}

		void setConfigHardwareMemoryMB(int configHardwareMemoryMB) {
			this.configHardwareMemoryMB = configHardwareMemoryMB;
		}

		void setConfigHardwareNumCPU(int configHardwareNumCPU) {
			this.configHardwareNumCPU = configHardwareNumCPU;
		}

		void setDatastoreInfos(ArrayList datastoreInfos) {
			this.datastoreInfos = datastoreInfos;
		}

		void setGuestHeartbeatStatus(ManagedEntityStatus guestHeartbeatStatus) {
			this.guestHeartbeatStatus = guestHeartbeatStatus;
		}

		void setGuestHostName(String guestHostName) {
			this.guestHostName = guestHostName;
		}

		void setGuestIpAddress(String guestIpAddress) {
			this.guestIpAddress = guestIpAddress;
		}

		void setGuestToolsStatus(VirtualMachineToolsStatus guestToolsStatus) {
			this.guestToolsStatus = guestToolsStatus;
		}

		void setHostSystemName(String hostSystemName) {
			this.hostSystemName = hostSystemName;
		}

		void setName(String name) {
			this.name = name;
		}

		void setNetworkNames(ArrayList networkNames) {
			this.networkNames = networkNames;
		}

		void setRuntimePowerState(VirtualMachinePowerState runtimePowerState) {
			this.runtimePowerState = runtimePowerState;
		}

		void setSummaryQuickStatsGuestMemoryUsage(
				int summaryQuickStatsGuestMemoryUsage) {
			this.summaryQuickStatsGuestMemoryUsage = summaryQuickStatsGuestMemoryUsage;
		}

		void setSummaryQuickStatsHostMemoryUsage(
				int summaryQuickStatsHostMemoryUsage) {
			this.summaryQuickStatsHostMemoryUsage = summaryQuickStatsHostMemoryUsage;
		}

		void setSummaryQuickStatsOverallCpuUsage(
				int summaryQuickStatsOverallCpuUsage) {
			this.summaryQuickStatsOverallCpuUsage = summaryQuickStatsOverallCpuUsage;
		}

		void setTaskInfoNames(ArrayList taskInfoNames) {
			this.taskInfoNames = taskInfoNames;
		}

		public String toString() {
			// Ok, now print it out...
			StringBuilder sb = new StringBuilder();
			sb.append("VM Information\n").append("  Name               : ")
					.append(getName()).append("\n").append(
							"  Guest OS Name      : ").append(
							getConfigGuestFullName()).append("\n").append(
							"  Num vCPU           : ").append(
							getConfigHardwareNumCPU()).append("\n").append(
							"  Memory             : ").append(
							getConfigHardwareMemoryMB()).append("\n").append(
							"  VMware Tools       : ").append(
							getGuestToolsStatus()).append("\n").append(
							"  Guest Heartbeat    : ").append(
							getGuestHeartbeatStatus()).append("\n").append(
							"  Guest IP Address   : ").append(
							getGuestIpAddress()).append("\n").append(
							"  Guest DNS Name     : ").append(
							getGuestHostName()).append("\n").append(
							"  State              : ").append(
							getRuntimePowerState()).append("\n").append(
							"  Host               : ").append(
							getHostSystemName()).append("\n").append(
							"  Active Tasks       : ");
			if (getTaskInfoNames() != null) {
				for (int tini = 0; tini < getTaskInfoNames().size(); ++tini) {
					sb.append(getTaskInfoNames().get(tini)).append(" ");
				}
			}
			sb.append("\n").append("  CPU Usage          : ").append(
					getSummaryQuickStatsOverallCpuUsage()).append(" MHz\n")
					.append("  Host Memory Usage  : ").append(
							getSummaryQuickStatsHostMemoryUsage()).append(
							" MB\n").append("  Guest Memory Usage : ").append(
							getSummaryQuickStatsGuestMemoryUsage()).append(
							" MB\n").append("  Datastores         : \n");
			if (getDatastoreInfos() != null) {
				for (int di = 0; di < getDatastoreInfos().size(); ++di) {
					DatastoreInfo dInfo = (DatastoreInfo) getDatastoreInfos()
							.get(di);
					sb.append("    Name       : ").append(dInfo.getName())
							.append("\n").append("    Free Space : ").append(
									dInfo.getFreeSpace() / 1024 / 1024 / 1024)
							.append(" GB\n");
					int cap = 0;
					if (dInfo instanceof VmfsDatastoreInfo) {
						VmfsDatastoreInfo vmfsInfo = (VmfsDatastoreInfo) dInfo;
						if (vmfsInfo.getVmfs() != null) {
							cap = (int) (vmfsInfo.getVmfs().getCapacity() / 1024 / 1024 / 1024);
						}
					} else if (dInfo instanceof NasDatastoreInfo) {
						NasDatastoreInfo nasInfo = (NasDatastoreInfo) dInfo;
						if (nasInfo.getNas() != null) {
							cap = (int) (nasInfo.getNas().getCapacity() / 1024 / 1024 / 1024);
						}
					}
					if (cap != 0) {
						sb.append("    Capacity   : ").append(cap).append(
								" GB\n");
					}
				}
			}
			sb.append("  Networks           : \n");
			if (getNetworkNames() != null) {
				for (int nni = 0; nni < getNetworkNames().size(); ++nni) {
					sb.append("    Name : ").append(getNetworkNames().get(nni))
							.append("\n");
				}
			}
			return sb.toString();
		}
	}

	static VimPortType service;

	static ServiceContent content;

	private static AppUtil cb = null;

	private static OptionSpec[] constructOptions() {
		OptionSpec[] useroptions = new OptionSpec[2];
		useroptions[0] = new OptionSpec("dcName", "String", 1,
				"Name of the Datacenter", null);
		useroptions[1] = new OptionSpec("vmDnsName", "String", 1,
				"Virtual machine dns name", null);
		return useroptions;
	}

	// Specifications to find all the Datacenters and
	// retrieve their name, vmFolder and hostFolder values.
	//
	static ObjectContent[] getDatacenters() throws InvalidProperty,
			RemoteException {

		// The PropertySpec object specifies what properties
		// to retrieve from what type of Managed Object
		PropertySpec pSpec = new PropertySpec();
		pSpec.setType("Datacenter");
		pSpec.setPathSet(new String[] { "name", "vmFolder", "hostFolder" });

		// The following TraversalSpec and SelectionSpec
		// objects create the following relationship:
		//
		// a. Folder -> childEntity
		// b. recurse to a.
		//
		// This specifies that starting with a Folder
		// managed object, traverse through its childEntity
		// property. For each element in the childEntity
		// property, process by going back to the 'parent'
		// TraversalSpec.
		// SelectionSpec to cause Folder recursion
		SelectionSpec recurseFolders = new SelectionSpec();
		// The name of a SelectionSpec must refer to a
		// TraversalSpec with the same name value.
		recurseFolders.setName("folder2childEntity");
		// Traverse from a Folder through the 'childEntity' property
		TraversalSpec folder2childEntity = new TraversalSpec();
		// Select the Folder type managed object
		folder2childEntity.setType("Folder");
		// Traverse through the childEntity property of the Folder
		folder2childEntity.setPath("childEntity");
		// Name this TraversalSpec so the SelectionSpec above
		// can refer to it
		folder2childEntity.setName(recurseFolders.getName());
		// Add the SelectionSpec above to this traversal so that
		// we will recurse through the tree via the childEntity
		// property
		folder2childEntity.setSelectSet(new SelectionSpec[] { recurseFolders });

		// The ObjectSpec object specifies the starting object and
		// any TraversalSpecs used to specify other objects
		// for consideration
		ObjectSpec oSpec = new ObjectSpec();
		oSpec.setObj(content.getRootFolder());
		// We set skip to true because we are not interested
		// in retrieving properties from the root Folder
		oSpec.setSkip(Boolean.TRUE);
		// Specify the TraversalSpec. This is what causes
		// other objects besides the starting object to
		// be considered part of the collection process
		oSpec.setSelectSet(new SelectionSpec[] { folder2childEntity });

		// The PropertyFilterSpec object is used to hold the
		// ObjectSpec and PropertySpec objects for the call
		PropertyFilterSpec pfSpec = new PropertyFilterSpec();
		pfSpec.setPropSet(new PropertySpec[] { pSpec });
		pfSpec.setObjectSet(new ObjectSpec[] { oSpec });
		// retrieveProperties() returns the properties
		// selected from the PropertyFilterSpec
		return service.retrieveProperties(content.getPropertyCollector(),
				new PropertyFilterSpec[] { pfSpec });
	}

	static ObjectContent[] getHosts(ManagedObjectReference dcMoRef)
			throws InvalidProperty, RemoteException {
		// PropertySpec specifies what properties to
		// retrieve from what type of Managed Object
		PropertySpec pSpec = new PropertySpec();
		pSpec.setType("HostSystem");
		pSpec.setPathSet(new String[] { "name", "runtime.connectionState" });
		SelectionSpec recurseFolders = new SelectionSpec();
		recurseFolders.setName("folder2childEntity");
		TraversalSpec computeResource2host = new TraversalSpec();
		computeResource2host.setType("ComputeResource");
		computeResource2host.setPath("host");
		TraversalSpec folder2childEntity = new TraversalSpec();
		folder2childEntity.setType("Folder");
		folder2childEntity.setPath("childEntity");
		folder2childEntity.setName(recurseFolders.getName());
		// Add BOTH of the specifications to this specification
		folder2childEntity.setSelectSet(new SelectionSpec[] { recurseFolders,
				computeResource2host });

		// Traverse from a Datacenter through
		// the 'hostFolder' property
		TraversalSpec dc2hostFolder = new TraversalSpec();
		dc2hostFolder.setType("Datacenter");
		dc2hostFolder.setPath("hostFolder");
		dc2hostFolder.setSelectSet(new SelectionSpec[] { folder2childEntity });
		ObjectSpec oSpec = new ObjectSpec();
		oSpec.setObj(dcMoRef);
		oSpec.setSkip(Boolean.TRUE);
		oSpec.setSelectSet(new SelectionSpec[] { dc2hostFolder });
		PropertyFilterSpec pfSpec = new PropertyFilterSpec();
		pfSpec.setPropSet(new PropertySpec[] { pSpec });
		pfSpec.setObjectSet(new ObjectSpec[] { oSpec });
		return service.retrieveProperties(content.getPropertyCollector(),
				new PropertyFilterSpec[] { pfSpec });
	}

	//
	// Specifications to find all items in inventory and
	// retrieve their name and parent values.
	//
	static ObjectContent[] getInventory() throws InvalidProperty,
			RemoteException {

		// PropertySpec specifies what properties to
		// retrieve from what type of Managed Object
		PropertySpec pSpec = new PropertySpec();
		// We use ManagedEntity for the type because all
		// items in inventory are derived from the ManagedEntity
		// managed object.
		pSpec.setType("ManagedEntity");
		pSpec.setPathSet(new String[] { "name", "parent" });

		// The following TraversalSpec and SelectionSpec
		// objects create the following relationship:
		//
		// a. Folder -> childEntity
		// b. recurse to a.
		// c. Datacenter -> vmFolder
		// d. Folder -> childEntity
		// e. recurse to d.
		// f. Datacenter -> hostFolder
		// g. Folder -> childEntity
		// h. recurse to g.
		// i. ComputeResource -> host
		// j. ComputeResource -> resourcePool
		// k. ResourcePool -> resourcePool
		// l. recurse to k.
		//
		// Notice how this mirrors how inventory is laid out
		// 
		// k. Traverse from a ResourcePool
		// through the 'resourcePool' property
		TraversalSpec resourcePool2resourcePool = new TraversalSpec();
		resourcePool2resourcePool.setType("ResourcePool");
		resourcePool2resourcePool.setPath("resourcePool");
		resourcePool2resourcePool.setName("resourcePoolRecurse");
		resourcePool2resourcePool.setSelectSet(
		// Add l. traversal
				new SelectionSpec[] { new SelectionSpec(null, null,
						"resourcePoolRecurse") });

		// j. Traverse from a ComputeResource
		// through the 'resourcePool' property
		TraversalSpec computeResource2resourcePool = new TraversalSpec();
		computeResource2resourcePool.setType("ComputeResource");
		computeResource2resourcePool.setPath("resourcePool");
		computeResource2resourcePool.setSelectSet(
		// Add k. traversal
				new SelectionSpec[] { resourcePool2resourcePool });

		// i. Traverse from a ComputeResource
		// through the 'host' property
		TraversalSpec computeResource2host = new TraversalSpec();
		computeResource2host.setType("ComputeResource");
		computeResource2host.setPath("host");

		// g. Traverse from a Folder through the 'childEntity' property
		// This traversal is specific to the 'hostFolder'
		// Folder of the Datacenter
		TraversalSpec hostFolder2childEntity = new TraversalSpec();
		hostFolder2childEntity.setType("Folder");
		hostFolder2childEntity.setPath("childEntity");
		hostFolder2childEntity.setName("hostFolderRecurse");
		hostFolder2childEntity.setSelectSet(new SelectionSpec[] {
		// Add h. traversal
				new SelectionSpec(null, null, "hostFolderRecurse"),
				// Add i. and j. traversals
				computeResource2resourcePool, computeResource2host, });

		// f. Traverse from a Datacenter
		// through the 'hostFolder' property
		TraversalSpec dc2hostFolder = new TraversalSpec();
		dc2hostFolder.setType("Datacenter");
		dc2hostFolder.setPath("hostFolder");
		dc2hostFolder.setSelectSet(
		// Add g. traversal
				new SelectionSpec[] { hostFolder2childEntity, });

		// d. Traverse from a Folder through
		// the 'childEntity' property
		// This traversal is specific to the
		// 'vmFolder' Folder of the Datacenter
		TraversalSpec vmFolder2childEntity = new TraversalSpec();
		vmFolder2childEntity.setType("Folder");
		vmFolder2childEntity.setPath("childEntity");
		vmFolder2childEntity.setName("vmFolderRecurse");
		vmFolder2childEntity.setSelectSet(
		// e. recurse to d.
				new SelectionSpec[] { new SelectionSpec(null, null,
						"vmFolderRecurse") });

		// c. Traverse from a Datacenter
		// through the 'vmFolder' property
		TraversalSpec dc2vmFolder = new TraversalSpec();
		dc2vmFolder.setType("Datacenter");
		dc2vmFolder.setPath("vmFolder");
		dc2vmFolder.setSelectSet(new SelectionSpec[] { vmFolder2childEntity });

		// a. Traverse from a Folder through the 'childEntity' property
		// This traversal is specific to the 'rootFolder' Folder
		// of the ServiceInstance
		TraversalSpec rootFolder2childEntity = new TraversalSpec();
		rootFolder2childEntity.setType("Folder");
		rootFolder2childEntity.setPath("childEntity");
		rootFolder2childEntity.setName("rootFolderRecurse");
		rootFolder2childEntity.setSelectSet(new SelectionSpec[] {
		// b. recurse to a.
				new SelectionSpec(null, null, "rootFolderRecurse"),
				// Add c. and d. traversals
				dc2vmFolder, dc2hostFolder });

		// ObjectSpec specifies the starting object and
		// any TraversalSpecs used to specify other objects
		// for consideration
		ObjectSpec oSpec = new ObjectSpec();
		oSpec.setObj(content.getRootFolder());
		oSpec.setSelectSet(
		// Add the a. traversal
				new SelectionSpec[] { rootFolder2childEntity });

		// PropertyFilterSpec is used to hold the ObjectSpec and
		// PropertySpec for the call
		PropertyFilterSpec pfSpec = new PropertyFilterSpec();
		pfSpec.setPropSet(new PropertySpec[] { pSpec });
		pfSpec.setObjectSet(new ObjectSpec[] { oSpec });

		// retrieveProperties() returns the properties
		// selected from the PropertyFilterSpec
		return service.retrieveProperties(content.getPropertyCollector(),
				new PropertyFilterSpec[] { pfSpec });
	}

	//
	// Specifications to find all Networks in a Datacenter,
	// list all VMs on each Network,
	// list all Hosts on each Network
	//
	static ObjectContent[] getNetworkInfo(ManagedObjectReference dcMoRef)
			throws InvalidProperty, RemoteException {

		// PropertySpec specifies what properties to
		// retrieve from what type of Managed Object

		// This spec selects the Network name
		PropertySpec networkPropSpec = new PropertySpec();
		networkPropSpec.setType("Network");
		networkPropSpec.setPathSet(new String[] { "name" });

		// This spec selects HostSystem information
		PropertySpec hostPropSpec = new PropertySpec();
		hostPropSpec.setType("HostSystem");
		hostPropSpec.setPathSet(new String[] { "network", "name",
				"summary.hardware", "runtime.connectionState",
				"summary.overallStatus", "summary.quickStats" });

		// This spec selects VirtualMachine information
		PropertySpec vmPropSpec = new PropertySpec();
		vmPropSpec.setType("VirtualMachine");
		vmPropSpec.setPathSet(new String[] { "network", "name", "runtime.host",
				"runtime.powerState", "summary.overallStatus",
				"summary.quickStats" });

		// The following TraversalSpec and SelectionSpec
		// objects create the following relationship:
		//
		// a. Datacenter -> network
		// b. Network -> host
		// c. Network -> vm

		// b. Traverse from a Network through the 'host' property
		TraversalSpec network2host = new TraversalSpec();
		network2host.setType("Network");
		network2host.setPath("host");

		// c. Traverse from a Network through the 'vm' property
		TraversalSpec network2vm = new TraversalSpec();
		network2vm.setType("Network");
		network2vm.setPath("vm");

		// a. Traverse from a Datacenter through
		// the 'network' property
		TraversalSpec dc2network = new TraversalSpec();
		dc2network.setType("Datacenter");
		dc2network.setPath("network");
		dc2network.setSelectSet(new SelectionSpec[] {
		// Add b. traversal
				network2host,
				// Add c. traversal
				network2vm });

		// ObjectSpec specifies the starting object and
		// any TraversalSpecs used to specify other objects
		// for consideration
		ObjectSpec oSpec = new ObjectSpec();
		oSpec.setObj(dcMoRef);
		oSpec.setSkip(Boolean.TRUE);
		oSpec.setSelectSet(new SelectionSpec[] { dc2network });

		// PropertyFilterSpec is used to hold the ObjectSpec and
		// PropertySpec for the call
		PropertyFilterSpec pfSpec = new PropertyFilterSpec();
		pfSpec.setPropSet(new PropertySpec[] { networkPropSpec, hostPropSpec,
				vmPropSpec });
		pfSpec.setObjectSet(new ObjectSpec[] { oSpec });

		// retrieveProperties() returns the properties
		// selected from the PropertyFilterSpec
		return service.retrieveProperties(content.getPropertyCollector(),
				new PropertyFilterSpec[] { pfSpec });
	}

	// Retrieve properties from a single MoRef
	static Object[] getProperties(ManagedObjectReference moRef,
			String[] properties) throws RuntimeFault, RemoteException {
		PropertySpec pSpec = new PropertySpec();
		pSpec.setType(moRef.getType());
		pSpec.setPathSet(properties);

		ObjectSpec oSpec = new ObjectSpec();
		// Set the starting object
		oSpec.setObj(moRef);
		PropertyFilterSpec pfSpec = new PropertyFilterSpec();
		pfSpec.setPropSet(new PropertySpec[] { pSpec });
		pfSpec.setObjectSet(new ObjectSpec[] { oSpec });
		ObjectContent[] ocs = service.retrieveProperties(content
				.getPropertyCollector(), new PropertyFilterSpec[] { pfSpec });

		Object[] ret = new Object[properties.length];

		if (ocs != null) {
			for (int i = 0; i < ocs.length; ++i) {
				ObjectContent oc = ocs[i];
				DynamicProperty[] dps = oc.getPropSet();
				if (dps != null) {
					for (int j = 0; j < dps.length; ++j) {
						DynamicProperty dp = dps[j];
						for (int p = 0; p < ret.length; ++p) {
							if (properties[p].equals(dp.getName())) {
								ret[p] = dp.getVal();
							}
						}
					}
				}
			}
		}
		return ret;
	}

	static ObjectContent[] getVMInfo(ManagedObjectReference vmMoRef)
			throws InvalidProperty, RemoteException {

		// This spec selects VirtualMachine information
		PropertySpec vmPropSpec = new PropertySpec();
		vmPropSpec.setType("VirtualMachine");
		vmPropSpec.setPathSet(new String[] { "name", "config.guestFullName",
				"config.hardware.memoryMB", "config.hardware.numCPU",
				"guest.toolsStatus", "guestHeartbeatStatus", "guest.ipAddress",
				"guest.hostName", "runtime.powerState",
				"summary.quickStats.overallCpuUsage",
				"summary.quickStats.hostMemoryUsage",
				"summary.quickStats.guestMemoryUsage", });
		PropertySpec hostPropSpec = new PropertySpec();
		hostPropSpec.setType("HostSystem");
		hostPropSpec.setPathSet(new String[] { "name" });
		PropertySpec taskPropSpec = new PropertySpec();
		taskPropSpec.setType("Task");
		taskPropSpec
				.setPathSet(new String[] { "info.name", "info.completeTime" });
		PropertySpec datastorePropSpec = new PropertySpec();
		datastorePropSpec.setType("Datastore");
		datastorePropSpec.setPathSet(new String[] { "info" });
		PropertySpec networkPropSpec = new PropertySpec();
		networkPropSpec.setType("Network");
		networkPropSpec.setPathSet(new String[] { "name" });
		TraversalSpec hostTraversalSpec = new TraversalSpec();
		hostTraversalSpec.setType("VirtualMachine");
		hostTraversalSpec.setPath("runtime.host");
		TraversalSpec taskTravesalSpec = new TraversalSpec();
		taskTravesalSpec.setType("VirtualMachine");
		taskTravesalSpec.setPath("recentTask");
		TraversalSpec datastoreTraversalSpec = new TraversalSpec();
		datastoreTraversalSpec.setType("VirtualMachine");
		datastoreTraversalSpec.setPath("datastore");
		TraversalSpec networkTraversalSpec = new TraversalSpec();
		networkTraversalSpec.setType("VirtualMachine");
		networkTraversalSpec.setPath("network");
		// ObjectSpec specifies the starting object and
		// any TraversalSpecs used to specify other objects
		// for consideration
		ObjectSpec oSpec = new ObjectSpec();
		oSpec.setObj(vmMoRef);
		// Add the TraversalSpec objects to the ObjectSpec
		// This specifies what additional object we want to
		// consider during the process.
		oSpec
				.setSelectSet(new SelectionSpec[] { hostTraversalSpec,
						taskTravesalSpec, datastoreTraversalSpec,
						networkTraversalSpec });
		PropertyFilterSpec pfSpec = new PropertyFilterSpec();
		// Add the PropertySpec objects to the PropertyFilterSpec
		// This specifies what data we want to collect while
		// processing the found objects from the ObjectSpec
		pfSpec.setPropSet(new PropertySpec[] { vmPropSpec, hostPropSpec,
				taskPropSpec, datastorePropSpec, networkPropSpec });
		pfSpec.setObjectSet(new ObjectSpec[] { oSpec });
		return service.retrieveProperties(content.getPropertyCollector(),
				new PropertyFilterSpec[] { pfSpec });
	}

	//
	// Specifications to find all the VMs in a Datacenter and
	// retrieve their name and runtime.powerState values.
	//
	static ObjectContent[] getVMs(ManagedObjectReference dcMoRef)
			throws InvalidProperty, RemoteException {
		// The PropertySpec object specifies what properties
		// retrieve from what type of Managed Object
		PropertySpec pSpec = new PropertySpec();
		pSpec.setType("VirtualMachine");
		pSpec.setPathSet(new String[] { "name", "runtime.powerState" });
		SelectionSpec recurseFolders = new SelectionSpec();
		recurseFolders.setName("folder2childEntity");
		TraversalSpec folder2childEntity = new TraversalSpec();
		folder2childEntity.setType("Folder");
		folder2childEntity.setPath("childEntity");
		folder2childEntity.setName(recurseFolders.getName());
		folder2childEntity.setSelectSet(new SelectionSpec[] { recurseFolders });
		// Traverse from a Datacenter through the 'vmFolder' property
		TraversalSpec dc2vmFolder = new TraversalSpec();
		dc2vmFolder.setType("Datacenter");
		dc2vmFolder.setPath("vmFolder");
		dc2vmFolder.setSelectSet(new SelectionSpec[] { folder2childEntity });
		ObjectSpec oSpec = new ObjectSpec();
		oSpec.setObj(dcMoRef);
		oSpec.setSkip(Boolean.TRUE);
		oSpec.setSelectSet(new SelectionSpec[] { dc2vmFolder });
		PropertyFilterSpec pfSpec = new PropertyFilterSpec();
		pfSpec.setPropSet(new PropertySpec[] { pSpec });
		pfSpec.setObjectSet(new ObjectSpec[] { oSpec });
		return service.retrieveProperties(content.getPropertyCollector(),
				new PropertyFilterSpec[] { pfSpec });
	}

	public static void main(String[] args) throws Exception {
		try {
			PropertyCollector app = new PropertyCollector();
			cb = AppUtil.initialize("PropertyCollector", PropertyCollector
					.constructOptions(), args);
			cb.connect();
			com.vmware.apputils.vim.ServiceConnection S1 = cb.getConnection();
			content = S1.getServiceContent();
			service = S1.getService();
			String dcName = cb.get_option("dcName");
			String vmDnsName = cb.get_option("vmDnsName");
			ObjectContent[] ocs = null;
			ManagedObjectReference dcMoRef = cb.getServiceUtil()
					.getDecendentMoRef(null, "Datacenter", dcName);
			if (dcMoRef == null) {
				System.out.println("Datacenter not found");
			} else {
				ManagedObjectReference vmMoRef = service.findByDnsName(content
						.getSearchIndex(), dcMoRef, vmDnsName, true);
				if (vmMoRef == null) {
					System.out.println("The virtual machine with DNS '"
							+ vmDnsName + "' not found ");
				} else {
					// Retrieve name and powerState from a Virtual Machine
					Object[] properties = getProperties(vmMoRef, new String[] {
							"name", "runtime.powerState" });
					String vmName = (String) properties[0];
					VirtualMachinePowerState vmState = (VirtualMachinePowerState) properties[1];
					if (vmName != null && vmState != null) {
						System.out.println("The VM with DNS name \'"
								+ vmDnsName + "\' is named \'" + vmName
								+ "\' and is " + vmState.toString());
					}
					ocs = getDatacenters();
					printObjectContent(ocs, "All Datacenters");
					// Find all the VMs in the Datacenter
					ocs = getVMs(dcMoRef);
					printObjectContent(ocs, "All VMs in the Datacenter: "
							+ dcName);
					// Find all the Hosts in the Datacenter
					ocs = getHosts(dcMoRef);
					printObjectContent(ocs, "All Hosts in the Datacenter: "
							+ dcName);
					// Display summary information about a VM
					ocs = getVMInfo(vmMoRef);
					printVmInfo(ocs);
					// Display all of inventory
					ocs = getInventory();
					printInventoryTree(ocs);
					ocs = getNetworkInfo(dcMoRef);
					cb.disConnect();
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

	//
	// Print the inventory tree retrieved from
	// the PropertyCollector
	static void printInventoryTree(ObjectContent[] ocs) {
		// Hashtable MoRef.Value -> MeNode
		Hashtable nodes = new Hashtable();
		// The root folder node
		MeNode root = null;

		for (int oci = 0; oci < ocs.length; ++oci) {
			ObjectContent oc = ocs[oci];
			ManagedObjectReference mor = oc.getObj();
			DynamicProperty[] dps = oc.getPropSet();
			if (dps != null) {
				ManagedObjectReference parent = null;
				String name = null;
				for (int dpi = 0; dpi < dps.length; ++dpi) {
					DynamicProperty dp = dps[dpi];
					if (dp != null) {
						if ("name".equals(dp.getName())) {
							name = (String) dp.getVal();
						}
						if ("parent".equals(dp.getName())) {
							parent = (ManagedObjectReference) dp.getVal();
						}
					}
				}
				// Create a MeNode to hold the data
				MeNode node = new MeNode(parent, mor, name);
				// The root folder has no parent
				if (parent == null) {
					root = node;
				}
				// Add the node
				nodes.put(node.getNode().get_value(), node);
			}
		}

		// Build the nodes into a tree
		for (Iterator it = nodes.values().iterator(); it.hasNext();) {
			MeNode meNode = (MeNode) it.next();
			if (meNode.getParent() != null) {
				MeNode parent = (MeNode) nodes.get(meNode.getParent()
						.get_value());
				parent.getChildren().add(meNode);
			}
		}
		System.out.println("Inventory Tree");
		printNode(root, 0);
	}

	//
	// Take the ObjectContent[] from retrieveProperties()
	// and print it out.
	// ObjectContent[] should have Network information
	static void printNetworkInfo(ObjectContent[] ocs) {
		// Network MoRef -> Network
		Hashtable networksByNetwork = new Hashtable();
		// Network MoRef -> Host
		Hashtable hostsByNetwork = new Hashtable();
		// Network MoRef -> VirtualMachine
		Hashtable vmsByNetwork = new Hashtable();
		// HostSystem MoRef -> Host
		Hashtable hostByHost = new Hashtable();

		if (ocs != null) {
			for (int i = 0; i < ocs.length; ++i) {
				ObjectContent oc = ocs[i];
				String type = oc.getObj().getType();
				// Create our Network objects
				if ("Network".equals(type)) {
					Network network = new Network(oc.getObj());
					DynamicProperty[] dps = oc.getPropSet();
					if (dps != null) {
						for (int j = 0; j < dps.length; ++j) {
							DynamicProperty dp = dps[j];
							if ("name".equals(dp.getName())) {
								network.setName((String) dp.getVal());
							}
						}
					}
					// Put them in the Map
					networksByNetwork.put(oc.getObj().get_value(), network);
					// Create our Host objects
				} else if ("HostSystem".equals(type)) {
					Host cHost = new Host(oc.getObj());
					ManagedObjectReference[] network = null;
					DynamicProperty[] dps = oc.getPropSet();
					if (dps != null) {
						for (int j = 0; j < dps.length; ++j) {
							String pName = dps[j].getName();
							Object pVal = dps[j].getVal();
							if ("name".equals(pName)) {
								cHost.setName((String) pVal);
							} else if ("network".equals(pName)) {
								network = (ManagedObjectReference[]) pVal;
							} else if ("summary.hardware".equals(pName)) {
								cHost.setHardware((HostHardwareSummary) pVal);
							} else if ("runtime.connectionState".equals(pName)) {
								cHost
										.setConnectionState((HostSystemConnectionState) pVal);
							} else if ("summary.overallStatus".equals(pName)) {
								cHost
										.setOverallStatus((ManagedEntityStatus) pVal);
							} else if ("summary.quickStats".equals(pName)) {
								cHost
										.setQuickStats((HostListSummaryQuickStats) pVal);
							}
						}
					}
					for (int n = 0; n < network.length; ++n) {
						Host host = new Host(cHost.getMoRef(), cHost.getName(),
								network[n], cHost.getHardware(), cHost
										.getConnectionState(), cHost
										.getOverallStatus(), cHost
										.getQuickStats());
						ArrayList hl = (ArrayList) hostsByNetwork
								.get(network[n].get_value());
						if (hl == null) {
							hl = new ArrayList();
							hostsByNetwork.put(network[n].get_value(), hl);
						}
						hl.add(host);
						hostByHost.put(host.getMoRef().get_value(), host);
					}
					// Create our VirtualMachine objects
				} else if ("VirtualMachine".equals(type)) {
					VirtualMachine cVm = new VirtualMachine(oc.getObj());
					ManagedObjectReference[] network = null;
					DynamicProperty[] dps = oc.getPropSet();
					if (dps != null) {
						for (int j = 0; j < dps.length; ++j) {
							String pName = dps[j].getName();
							Object pVal = dps[j].getVal();
							if ("name".equals(pName)) {
								cVm.setName((String) pVal);
							} else if ("network".equals(pName)) {
								network = (ManagedObjectReference[]) pVal;
							} else if ("runtime.host".equals(pName)) {
								cVm.setHost((ManagedObjectReference) pVal);
							} else if ("runtime.powerState".equals(pName)) {
								cVm
										.setPowerState((VirtualMachinePowerState) pVal);
							} else if ("summary.overallStatus".equals(pName)) {
								cVm
										.setOverallStatus((ManagedEntityStatus) pVal);
							} else if ("summary.quickStats".equals(pName)) {
								cVm
										.setQuickStats((VirtualMachineQuickStats) pVal);
							}
						}
					}
					for (int n = 0; n < network.length; ++n) {
						VirtualMachine vm = new VirtualMachine(cVm.getMoRef(),
								cVm.getName(), network[n], cVm.getHost(), cVm
										.getPowerState(), cVm
										.getOverallStatus(), cVm
										.getQuickStats());
						ArrayList vml = (ArrayList) vmsByNetwork.get(network[n]
								.get_value());
						if (vml == null) {
							vml = new ArrayList();
							vmsByNetwork.put(network[n].get_value(), vml);
						}
						vml.add(vm);
					}
				}
			}
		}

		// Now the Hashtables have all the information
		// Now populate our Network object with the Hosts
		// and VMs connected and print out the 'tables'
		for (Iterator nit = networksByNetwork.values().iterator(); nit
				.hasNext();) {
			Network network = (Network) nit.next();
			ArrayList vms = (ArrayList) vmsByNetwork.get(network.getMoRef()
					.get_value());
			ArrayList hosts = (ArrayList) hostsByNetwork.get(network.getMoRef()
					.get_value());

			System.out.println("Network: " + network.getName());
			System.out.println("  Virtual Machines:");
			if (vms != null) {
				for (Iterator vmIt = vms.iterator(); vmIt.hasNext();) {
					VirtualMachine vm = (VirtualMachine) vmIt.next();
					Host host = (Host) hostByHost.get(vm.getHost().get_value());

					Integer cpuUsage = vm.getQuickStats().getOverallCpuUsage();
					Integer memUsage = vm.getQuickStats().getHostMemoryUsage();

					StringBuffer sb = new StringBuffer();
					sb
							.append("    Name          :")
							.append(vm.getName())
							.append("\n")
							.append("    State         :")
							.append(vm.getPowerState())
							.append("\n")
							.append("    Status        :")
							.append(vm.getOverallStatus())
							.append("\n")
							.append("    Host Name     :")
							.append(host != null ? host.getName() : "")
							.append("\n")
							.append("    Host CPU MHZ  :")
							.append(
									cpuUsage != null ? cpuUsage
											: new Integer(0))
							.append("\n")
							.append("    Host Mem = MB :")
							.append(
									memUsage != null ? memUsage.intValue() / 1024 / 1024
											: 0).append("\n");
					System.out.println(sb.toString());
				}
			}
			System.out.println("  Hosts:");
			if (hosts != null) {
				for (Iterator hostIt = hosts.iterator(); hostIt.hasNext();) {
					Host host = (Host) hostIt.next();

					Integer cpuUsage = host.getQuickStats()
							.getOverallCpuUsage();
					Integer memUsage = host.getQuickStats()
							.getOverallMemoryUsage();

					StringBuffer sb = new StringBuffer();
					sb.append("    Name    :").append(host.getName()).append(
							"\n").append("    State   :").append(
							host.getConnectionState()).append("\n").append(
							"    Status  :").append(host.getOverallStatus())
							.append("\n").append("    CPU %   :").append(
									cpuUsage != null ? cpuUsage
											: new Integer(0)).append("\n")
							.append("    Mem MB  :").append(
									memUsage != null ? memUsage
											: new Integer(0)).append("\n");

					System.out.println(sb.toString());
				}
			}
		}
	}

	//
	// Recursive method to print an inventory tree node
	//
	static void printNode(MeNode node, int indent) {
		// Make it pretty
		for (int i = 0; i < indent; ++i) {
			System.out.print(' ');
		}
		System.out.println(node.getName() + " (" + node.getNode().getType()
				+ ")");
		if (!node.getChildren().isEmpty()) {
			for (int c = 0; c < node.getChildren().size(); ++c) {
				printNode((MeNode) node.getChildren().get(c), indent + 2);
			}
		}
	}

	// Print out the ObjectContent[]
	// returned from retrieveProperties()
	static void printObjectContent(ObjectContent[] ocs, String title) {
		// Print out the title to label the output
		System.out.println(title);
		if (ocs != null) {
			for (int i = 0; i < ocs.length; ++i) {
				ObjectContent oc = ocs[i];
				// Print out the managed object type
				System.out.println(oc.getObj().getType());
				System.out.println("  Property Name:Value");
				DynamicProperty[] dps = oc.getPropSet();
				if (dps != null) {
					for (int j = 0; j < dps.length; ++j) {
						DynamicProperty dp = dps[j];
						// Print out the property name and value
						System.out.println("  " + dp.getName() + ": "
								+ dp.getVal());
					}
				}
			}
		}
	}

	//
	// Take the ObjectContent[] from retrieveProperties()
	// and print it out.
	//
	static void printVmInfo(ObjectContent[] ocs) {
		if (ocs != null) {
			// Create an instance of our data class
			VMInfo vmInfo = new VMInfo();
			// Each instance of ObjectContent contains the properties
			// retrieved for one instance of a managed object
			for (int oci = 0; oci < ocs.length; ++oci) {
				// Properties for one managed object
				ObjectContent oc = ocs[oci];
				// Get the type of managed object
				String type = oc.getObj().getType();

				// Handle data from VirtualMachine managed objects
				if ("VirtualMachine".equals(type)) {
					DynamicProperty[] dps = oc.getPropSet();
					if (dps != null) {
						// Each instance of DynamicProperty contains a
						// single property from the managed object
						// This data comes back as name-value pairs
						// The code below is checking each name and
						// assigning the proper field in the data
						// object
						for (int j = 0; j < dps.length; ++j) {
							DynamicProperty dp = dps[j];
							if ("name".equals(dp.getName())) {
								vmInfo.setName((String) dp.getVal());
							} else if ("config.guestFullName".equals(dp
									.getName())) {
								vmInfo.setConfigGuestFullName((String) dp
										.getVal());
							} else if ("config.hardware.memoryMB".equals(dp
									.getName())) {
								vmInfo.setConfigHardwareMemoryMB(((Integer) dp
										.getVal()).intValue());
							} else if ("config.hardware.numCPU".equals(dp
									.getName())) {
								vmInfo.setConfigHardwareNumCPU(((Integer) dp
										.getVal()).intValue());
							} else if ("guest.toolsStatus".equals(dp.getName())) {
								vmInfo
										.setGuestToolsStatus((VirtualMachineToolsStatus) dp
												.getVal());
							} else if ("guestHeartbeatStatus".equals(dp
									.getName())) {
								vmInfo
										.setGuestHeartbeatStatus((ManagedEntityStatus) dp
												.getVal());
							} else if ("guest.ipAddress".equals(dp.getName())) {
								vmInfo.setGuestIpAddress((String) dp.getVal());
							} else if ("guest.hostName".equals(dp.getName())) {
								vmInfo.setGuestHostName((String) dp.getVal());
							} else if ("runtime.powerState"
									.equals(dp.getName())) {
								vmInfo
										.setRuntimePowerState((VirtualMachinePowerState) dp
												.getVal());
							} else if ("summary.quickStats.overallCpuUsage"
									.equals(dp.getName())) {
								vmInfo
										.setSummaryQuickStatsOverallCpuUsage(((Integer) dp
												.getVal()).intValue());
							} else if ("summary.quickStats.hostMemoryUsage"
									.equals(dp.getName())) {
								vmInfo
										.setSummaryQuickStatsHostMemoryUsage(((Integer) dp
												.getVal()).intValue());
							} else if ("summary.quickStats.guestMemoryUsage"
									.equals(dp.getName())) {
								vmInfo
										.setSummaryQuickStatsGuestMemoryUsage(((Integer) dp
												.getVal()).intValue());
							}
						}
					}

					// Handle data from HostSystem managed objects
				} else if ("HostSystem".equals(type)) {
					DynamicProperty[] dps = oc.getPropSet();
					if (dps != null) {
						for (int j = 0; j < dps.length; ++j) {
							DynamicProperty dp = dps[j];
							if ("name".equals(dp.getName())) {
								vmInfo.setHostSystemName((String) dp.getVal());
							}
						}
					}

					// Handle data from Task managed objects
				} else if ("Task".equals(type)) {
					DynamicProperty[] dps = oc.getPropSet();
					if (dps != null) {
						boolean taskCompleted = false;
						String taskName = "";
						for (int j = 0; j < dps.length; ++j) {
							DynamicProperty dp = dps[j];
							if ("info.name".equals(dp.getName())) {
								taskName = (String) dp.getVal();
							} else if ("info.completeTime".equals(dp.getName())) {
								taskCompleted = true;
							}
						}
						if (!taskCompleted) {
							if (vmInfo.getTaskInfoNames() == null) {
								vmInfo.setTaskInfoNames(new ArrayList());
							}
							vmInfo.getTaskInfoNames().add(taskName);
						}
					}

					// Handle data from Datastore managed objects
				} else if ("Datastore".equals(type)) {
					DynamicProperty[] dps = oc.getPropSet();
					if (dps != null) {
						for (int j = 0; j < dps.length; ++j) {
							DynamicProperty dp = dps[j];
							if ("info".equals(dp.getName())) {
								if (vmInfo.getDatastoreInfos() == null) {
									vmInfo.setDatastoreInfos(new ArrayList());
								}
								vmInfo.getDatastoreInfos().add(dp.getVal());
							}
						}
					}

					// Handle data from Network managed objects
				} else if ("Network".equals(type)) {
					DynamicProperty[] dps = oc.getPropSet();
					if (dps != null) {
						for (int j = 0; j < dps.length; ++j) {
							DynamicProperty dp = dps[j];
							if ("name".equals(dp.getName())) {
								if (vmInfo.getNetworkNames() == null) {
									vmInfo.setNetworkNames(new ArrayList());
								}
								vmInfo.getNetworkNames().add(dp.getVal());
							}
						}
					}
				}
			}
			// Print out the results
			System.out.println(vmInfo.toString());
		}
	}

	Log log = new Log();
}
