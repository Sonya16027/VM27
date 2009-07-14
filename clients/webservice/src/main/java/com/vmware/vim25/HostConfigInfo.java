/**
 * HostConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostConfigInfo extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference host;

	private com.vmware.vim25.AboutInfo product;

	private com.vmware.vim25.HostHyperThreadScheduleInfo hyperThread;

	private com.vmware.vim25.ServiceConsoleReservationInfo consoleReservation;

	private com.vmware.vim25.VirtualMachineMemoryReservationInfo virtualMachineReservation;

	private com.vmware.vim25.HostStorageDeviceInfo storageDevice;

	private com.vmware.vim25.HostMultipathStateInfo multipathState;

	private com.vmware.vim25.HostFileSystemVolumeInfo fileSystemVolume;

	private com.vmware.vim25.HostNetworkInfo network;

	private com.vmware.vim25.HostVMotionInfo vmotion;

	private com.vmware.vim25.HostVirtualNicManagerInfo virtualNicManagerInfo;

	private com.vmware.vim25.HostNetCapabilities capabilities;

	private com.vmware.vim25.HostDatastoreSystemCapabilities datastoreCapabilities;

	private com.vmware.vim25.HostNetOffloadCapabilities offloadCapabilities;

	private com.vmware.vim25.HostServiceInfo service;

	private com.vmware.vim25.HostFirewallInfo firewall;

	private com.vmware.vim25.HostAutoStartManagerConfig autoStart;

	private com.vmware.vim25.HostDiagnosticPartition activeDiagnosticPartition;

	private com.vmware.vim25.OptionValue[] option;

	private com.vmware.vim25.OptionDef[] optionDef;

	private java.lang.String datastorePrincipal;

	private com.vmware.vim25.ManagedObjectReference localSwapDatastore;

	private com.vmware.vim25.HostSystemResourceInfo systemResources;

	private com.vmware.vim25.HostDateTimeInfo dateTimeInfo;

	private com.vmware.vim25.HostFlagInfo flags;

	private java.lang.Boolean adminDisabled;

	private com.vmware.vim25.HostIpmiInfo ipmi;

	private com.vmware.vim25.HostSslThumbprintInfo sslThumbprintInfo;

	private com.vmware.vim25.HostPciPassthruInfo[] pciPassthruInfo;

	public HostConfigInfo() {
	}

	public HostConfigInfo(
			java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.ManagedObjectReference host,
			com.vmware.vim25.AboutInfo product,
			com.vmware.vim25.HostHyperThreadScheduleInfo hyperThread,
			com.vmware.vim25.ServiceConsoleReservationInfo consoleReservation,
			com.vmware.vim25.VirtualMachineMemoryReservationInfo virtualMachineReservation,
			com.vmware.vim25.HostStorageDeviceInfo storageDevice,
			com.vmware.vim25.HostMultipathStateInfo multipathState,
			com.vmware.vim25.HostFileSystemVolumeInfo fileSystemVolume,
			com.vmware.vim25.HostNetworkInfo network,
			com.vmware.vim25.HostVMotionInfo vmotion,
			com.vmware.vim25.HostVirtualNicManagerInfo virtualNicManagerInfo,
			com.vmware.vim25.HostNetCapabilities capabilities,
			com.vmware.vim25.HostDatastoreSystemCapabilities datastoreCapabilities,
			com.vmware.vim25.HostNetOffloadCapabilities offloadCapabilities,
			com.vmware.vim25.HostServiceInfo service,
			com.vmware.vim25.HostFirewallInfo firewall,
			com.vmware.vim25.HostAutoStartManagerConfig autoStart,
			com.vmware.vim25.HostDiagnosticPartition activeDiagnosticPartition,
			com.vmware.vim25.OptionValue[] option,
			com.vmware.vim25.OptionDef[] optionDef,
			java.lang.String datastorePrincipal,
			com.vmware.vim25.ManagedObjectReference localSwapDatastore,
			com.vmware.vim25.HostSystemResourceInfo systemResources,
			com.vmware.vim25.HostDateTimeInfo dateTimeInfo,
			com.vmware.vim25.HostFlagInfo flags,
			java.lang.Boolean adminDisabled,
			com.vmware.vim25.HostIpmiInfo ipmi,
			com.vmware.vim25.HostSslThumbprintInfo sslThumbprintInfo,
			com.vmware.vim25.HostPciPassthruInfo[] pciPassthruInfo) {
		super(dynamicType, dynamicProperty);
		this.host = host;
		this.product = product;
		this.hyperThread = hyperThread;
		this.consoleReservation = consoleReservation;
		this.virtualMachineReservation = virtualMachineReservation;
		this.storageDevice = storageDevice;
		this.multipathState = multipathState;
		this.fileSystemVolume = fileSystemVolume;
		this.network = network;
		this.vmotion = vmotion;
		this.virtualNicManagerInfo = virtualNicManagerInfo;
		this.capabilities = capabilities;
		this.datastoreCapabilities = datastoreCapabilities;
		this.offloadCapabilities = offloadCapabilities;
		this.service = service;
		this.firewall = firewall;
		this.autoStart = autoStart;
		this.activeDiagnosticPartition = activeDiagnosticPartition;
		this.option = option;
		this.optionDef = optionDef;
		this.datastorePrincipal = datastorePrincipal;
		this.localSwapDatastore = localSwapDatastore;
		this.systemResources = systemResources;
		this.dateTimeInfo = dateTimeInfo;
		this.flags = flags;
		this.adminDisabled = adminDisabled;
		this.ipmi = ipmi;
		this.sslThumbprintInfo = sslThumbprintInfo;
		this.pciPassthruInfo = pciPassthruInfo;
	}

	/**
	 * Gets the host value for this HostConfigInfo.
	 * 
	 * @return host
	 */
	public com.vmware.vim25.ManagedObjectReference getHost() {
		return host;
	}

	/**
	 * Sets the host value for this HostConfigInfo.
	 * 
	 * @param host
	 */
	public void setHost(com.vmware.vim25.ManagedObjectReference host) {
		this.host = host;
	}

	/**
	 * Gets the product value for this HostConfigInfo.
	 * 
	 * @return product
	 */
	public com.vmware.vim25.AboutInfo getProduct() {
		return product;
	}

	/**
	 * Sets the product value for this HostConfigInfo.
	 * 
	 * @param product
	 */
	public void setProduct(com.vmware.vim25.AboutInfo product) {
		this.product = product;
	}

	/**
	 * Gets the hyperThread value for this HostConfigInfo.
	 * 
	 * @return hyperThread
	 */
	public com.vmware.vim25.HostHyperThreadScheduleInfo getHyperThread() {
		return hyperThread;
	}

	/**
	 * Sets the hyperThread value for this HostConfigInfo.
	 * 
	 * @param hyperThread
	 */
	public void setHyperThread(
			com.vmware.vim25.HostHyperThreadScheduleInfo hyperThread) {
		this.hyperThread = hyperThread;
	}

	/**
	 * Gets the consoleReservation value for this HostConfigInfo.
	 * 
	 * @return consoleReservation
	 */
	public com.vmware.vim25.ServiceConsoleReservationInfo getConsoleReservation() {
		return consoleReservation;
	}

	/**
	 * Sets the consoleReservation value for this HostConfigInfo.
	 * 
	 * @param consoleReservation
	 */
	public void setConsoleReservation(
			com.vmware.vim25.ServiceConsoleReservationInfo consoleReservation) {
		this.consoleReservation = consoleReservation;
	}

	/**
	 * Gets the virtualMachineReservation value for this HostConfigInfo.
	 * 
	 * @return virtualMachineReservation
	 */
	public com.vmware.vim25.VirtualMachineMemoryReservationInfo getVirtualMachineReservation() {
		return virtualMachineReservation;
	}

	/**
	 * Sets the virtualMachineReservation value for this HostConfigInfo.
	 * 
	 * @param virtualMachineReservation
	 */
	public void setVirtualMachineReservation(
			com.vmware.vim25.VirtualMachineMemoryReservationInfo virtualMachineReservation) {
		this.virtualMachineReservation = virtualMachineReservation;
	}

	/**
	 * Gets the storageDevice value for this HostConfigInfo.
	 * 
	 * @return storageDevice
	 */
	public com.vmware.vim25.HostStorageDeviceInfo getStorageDevice() {
		return storageDevice;
	}

	/**
	 * Sets the storageDevice value for this HostConfigInfo.
	 * 
	 * @param storageDevice
	 */
	public void setStorageDevice(
			com.vmware.vim25.HostStorageDeviceInfo storageDevice) {
		this.storageDevice = storageDevice;
	}

	/**
	 * Gets the multipathState value for this HostConfigInfo.
	 * 
	 * @return multipathState
	 */
	public com.vmware.vim25.HostMultipathStateInfo getMultipathState() {
		return multipathState;
	}

	/**
	 * Sets the multipathState value for this HostConfigInfo.
	 * 
	 * @param multipathState
	 */
	public void setMultipathState(
			com.vmware.vim25.HostMultipathStateInfo multipathState) {
		this.multipathState = multipathState;
	}

	/**
	 * Gets the fileSystemVolume value for this HostConfigInfo.
	 * 
	 * @return fileSystemVolume
	 */
	public com.vmware.vim25.HostFileSystemVolumeInfo getFileSystemVolume() {
		return fileSystemVolume;
	}

	/**
	 * Sets the fileSystemVolume value for this HostConfigInfo.
	 * 
	 * @param fileSystemVolume
	 */
	public void setFileSystemVolume(
			com.vmware.vim25.HostFileSystemVolumeInfo fileSystemVolume) {
		this.fileSystemVolume = fileSystemVolume;
	}

	/**
	 * Gets the network value for this HostConfigInfo.
	 * 
	 * @return network
	 */
	public com.vmware.vim25.HostNetworkInfo getNetwork() {
		return network;
	}

	/**
	 * Sets the network value for this HostConfigInfo.
	 * 
	 * @param network
	 */
	public void setNetwork(com.vmware.vim25.HostNetworkInfo network) {
		this.network = network;
	}

	/**
	 * Gets the vmotion value for this HostConfigInfo.
	 * 
	 * @return vmotion
	 */
	public com.vmware.vim25.HostVMotionInfo getVmotion() {
		return vmotion;
	}

	/**
	 * Sets the vmotion value for this HostConfigInfo.
	 * 
	 * @param vmotion
	 */
	public void setVmotion(com.vmware.vim25.HostVMotionInfo vmotion) {
		this.vmotion = vmotion;
	}

	/**
	 * Gets the virtualNicManagerInfo value for this HostConfigInfo.
	 * 
	 * @return virtualNicManagerInfo
	 */
	public com.vmware.vim25.HostVirtualNicManagerInfo getVirtualNicManagerInfo() {
		return virtualNicManagerInfo;
	}

	/**
	 * Sets the virtualNicManagerInfo value for this HostConfigInfo.
	 * 
	 * @param virtualNicManagerInfo
	 */
	public void setVirtualNicManagerInfo(
			com.vmware.vim25.HostVirtualNicManagerInfo virtualNicManagerInfo) {
		this.virtualNicManagerInfo = virtualNicManagerInfo;
	}

	/**
	 * Gets the capabilities value for this HostConfigInfo.
	 * 
	 * @return capabilities
	 */
	public com.vmware.vim25.HostNetCapabilities getCapabilities() {
		return capabilities;
	}

	/**
	 * Sets the capabilities value for this HostConfigInfo.
	 * 
	 * @param capabilities
	 */
	public void setCapabilities(
			com.vmware.vim25.HostNetCapabilities capabilities) {
		this.capabilities = capabilities;
	}

	/**
	 * Gets the datastoreCapabilities value for this HostConfigInfo.
	 * 
	 * @return datastoreCapabilities
	 */
	public com.vmware.vim25.HostDatastoreSystemCapabilities getDatastoreCapabilities() {
		return datastoreCapabilities;
	}

	/**
	 * Sets the datastoreCapabilities value for this HostConfigInfo.
	 * 
	 * @param datastoreCapabilities
	 */
	public void setDatastoreCapabilities(
			com.vmware.vim25.HostDatastoreSystemCapabilities datastoreCapabilities) {
		this.datastoreCapabilities = datastoreCapabilities;
	}

	/**
	 * Gets the offloadCapabilities value for this HostConfigInfo.
	 * 
	 * @return offloadCapabilities
	 */
	public com.vmware.vim25.HostNetOffloadCapabilities getOffloadCapabilities() {
		return offloadCapabilities;
	}

	/**
	 * Sets the offloadCapabilities value for this HostConfigInfo.
	 * 
	 * @param offloadCapabilities
	 */
	public void setOffloadCapabilities(
			com.vmware.vim25.HostNetOffloadCapabilities offloadCapabilities) {
		this.offloadCapabilities = offloadCapabilities;
	}

	/**
	 * Gets the service value for this HostConfigInfo.
	 * 
	 * @return service
	 */
	public com.vmware.vim25.HostServiceInfo getService() {
		return service;
	}

	/**
	 * Sets the service value for this HostConfigInfo.
	 * 
	 * @param service
	 */
	public void setService(com.vmware.vim25.HostServiceInfo service) {
		this.service = service;
	}

	/**
	 * Gets the firewall value for this HostConfigInfo.
	 * 
	 * @return firewall
	 */
	public com.vmware.vim25.HostFirewallInfo getFirewall() {
		return firewall;
	}

	/**
	 * Sets the firewall value for this HostConfigInfo.
	 * 
	 * @param firewall
	 */
	public void setFirewall(com.vmware.vim25.HostFirewallInfo firewall) {
		this.firewall = firewall;
	}

	/**
	 * Gets the autoStart value for this HostConfigInfo.
	 * 
	 * @return autoStart
	 */
	public com.vmware.vim25.HostAutoStartManagerConfig getAutoStart() {
		return autoStart;
	}

	/**
	 * Sets the autoStart value for this HostConfigInfo.
	 * 
	 * @param autoStart
	 */
	public void setAutoStart(
			com.vmware.vim25.HostAutoStartManagerConfig autoStart) {
		this.autoStart = autoStart;
	}

	/**
	 * Gets the activeDiagnosticPartition value for this HostConfigInfo.
	 * 
	 * @return activeDiagnosticPartition
	 */
	public com.vmware.vim25.HostDiagnosticPartition getActiveDiagnosticPartition() {
		return activeDiagnosticPartition;
	}

	/**
	 * Sets the activeDiagnosticPartition value for this HostConfigInfo.
	 * 
	 * @param activeDiagnosticPartition
	 */
	public void setActiveDiagnosticPartition(
			com.vmware.vim25.HostDiagnosticPartition activeDiagnosticPartition) {
		this.activeDiagnosticPartition = activeDiagnosticPartition;
	}

	/**
	 * Gets the option value for this HostConfigInfo.
	 * 
	 * @return option
	 */
	public com.vmware.vim25.OptionValue[] getOption() {
		return option;
	}

	/**
	 * Sets the option value for this HostConfigInfo.
	 * 
	 * @param option
	 */
	public void setOption(com.vmware.vim25.OptionValue[] option) {
		this.option = option;
	}

	public com.vmware.vim25.OptionValue getOption(int i) {
		return this.option[i];
	}

	public void setOption(int i, com.vmware.vim25.OptionValue _value) {
		this.option[i] = _value;
	}

	/**
	 * Gets the optionDef value for this HostConfigInfo.
	 * 
	 * @return optionDef
	 */
	public com.vmware.vim25.OptionDef[] getOptionDef() {
		return optionDef;
	}

	/**
	 * Sets the optionDef value for this HostConfigInfo.
	 * 
	 * @param optionDef
	 */
	public void setOptionDef(com.vmware.vim25.OptionDef[] optionDef) {
		this.optionDef = optionDef;
	}

	public com.vmware.vim25.OptionDef getOptionDef(int i) {
		return this.optionDef[i];
	}

	public void setOptionDef(int i, com.vmware.vim25.OptionDef _value) {
		this.optionDef[i] = _value;
	}

	/**
	 * Gets the datastorePrincipal value for this HostConfigInfo.
	 * 
	 * @return datastorePrincipal
	 */
	public java.lang.String getDatastorePrincipal() {
		return datastorePrincipal;
	}

	/**
	 * Sets the datastorePrincipal value for this HostConfigInfo.
	 * 
	 * @param datastorePrincipal
	 */
	public void setDatastorePrincipal(java.lang.String datastorePrincipal) {
		this.datastorePrincipal = datastorePrincipal;
	}

	/**
	 * Gets the localSwapDatastore value for this HostConfigInfo.
	 * 
	 * @return localSwapDatastore
	 */
	public com.vmware.vim25.ManagedObjectReference getLocalSwapDatastore() {
		return localSwapDatastore;
	}

	/**
	 * Sets the localSwapDatastore value for this HostConfigInfo.
	 * 
	 * @param localSwapDatastore
	 */
	public void setLocalSwapDatastore(
			com.vmware.vim25.ManagedObjectReference localSwapDatastore) {
		this.localSwapDatastore = localSwapDatastore;
	}

	/**
	 * Gets the systemResources value for this HostConfigInfo.
	 * 
	 * @return systemResources
	 */
	public com.vmware.vim25.HostSystemResourceInfo getSystemResources() {
		return systemResources;
	}

	/**
	 * Sets the systemResources value for this HostConfigInfo.
	 * 
	 * @param systemResources
	 */
	public void setSystemResources(
			com.vmware.vim25.HostSystemResourceInfo systemResources) {
		this.systemResources = systemResources;
	}

	/**
	 * Gets the dateTimeInfo value for this HostConfigInfo.
	 * 
	 * @return dateTimeInfo
	 */
	public com.vmware.vim25.HostDateTimeInfo getDateTimeInfo() {
		return dateTimeInfo;
	}

	/**
	 * Sets the dateTimeInfo value for this HostConfigInfo.
	 * 
	 * @param dateTimeInfo
	 */
	public void setDateTimeInfo(com.vmware.vim25.HostDateTimeInfo dateTimeInfo) {
		this.dateTimeInfo = dateTimeInfo;
	}

	/**
	 * Gets the flags value for this HostConfigInfo.
	 * 
	 * @return flags
	 */
	public com.vmware.vim25.HostFlagInfo getFlags() {
		return flags;
	}

	/**
	 * Sets the flags value for this HostConfigInfo.
	 * 
	 * @param flags
	 */
	public void setFlags(com.vmware.vim25.HostFlagInfo flags) {
		this.flags = flags;
	}

	/**
	 * Gets the adminDisabled value for this HostConfigInfo.
	 * 
	 * @return adminDisabled
	 */
	public java.lang.Boolean getAdminDisabled() {
		return adminDisabled;
	}

	/**
	 * Sets the adminDisabled value for this HostConfigInfo.
	 * 
	 * @param adminDisabled
	 */
	public void setAdminDisabled(java.lang.Boolean adminDisabled) {
		this.adminDisabled = adminDisabled;
	}

	/**
	 * Gets the ipmi value for this HostConfigInfo.
	 * 
	 * @return ipmi
	 */
	public com.vmware.vim25.HostIpmiInfo getIpmi() {
		return ipmi;
	}

	/**
	 * Sets the ipmi value for this HostConfigInfo.
	 * 
	 * @param ipmi
	 */
	public void setIpmi(com.vmware.vim25.HostIpmiInfo ipmi) {
		this.ipmi = ipmi;
	}

	/**
	 * Gets the sslThumbprintInfo value for this HostConfigInfo.
	 * 
	 * @return sslThumbprintInfo
	 */
	public com.vmware.vim25.HostSslThumbprintInfo getSslThumbprintInfo() {
		return sslThumbprintInfo;
	}

	/**
	 * Sets the sslThumbprintInfo value for this HostConfigInfo.
	 * 
	 * @param sslThumbprintInfo
	 */
	public void setSslThumbprintInfo(
			com.vmware.vim25.HostSslThumbprintInfo sslThumbprintInfo) {
		this.sslThumbprintInfo = sslThumbprintInfo;
	}

	/**
	 * Gets the pciPassthruInfo value for this HostConfigInfo.
	 * 
	 * @return pciPassthruInfo
	 */
	public com.vmware.vim25.HostPciPassthruInfo[] getPciPassthruInfo() {
		return pciPassthruInfo;
	}

	/**
	 * Sets the pciPassthruInfo value for this HostConfigInfo.
	 * 
	 * @param pciPassthruInfo
	 */
	public void setPciPassthruInfo(
			com.vmware.vim25.HostPciPassthruInfo[] pciPassthruInfo) {
		this.pciPassthruInfo = pciPassthruInfo;
	}

	public com.vmware.vim25.HostPciPassthruInfo getPciPassthruInfo(int i) {
		return this.pciPassthruInfo[i];
	}

	public void setPciPassthruInfo(int i,
			com.vmware.vim25.HostPciPassthruInfo _value) {
		this.pciPassthruInfo[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostConfigInfo)) {
			return false;
		}
		HostConfigInfo other = (HostConfigInfo) obj;
		if (obj == null) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = super.equals(obj)
				&& ((this.host == null && other.getHost() == null) || (this.host != null && this.host
						.equals(other.getHost())))
				&& ((this.product == null && other.getProduct() == null) || (this.product != null && this.product
						.equals(other.getProduct())))
				&& ((this.hyperThread == null && other.getHyperThread() == null) || (this.hyperThread != null && this.hyperThread
						.equals(other.getHyperThread())))
				&& ((this.consoleReservation == null && other
						.getConsoleReservation() == null) || (this.consoleReservation != null && this.consoleReservation
						.equals(other.getConsoleReservation())))
				&& ((this.virtualMachineReservation == null && other
						.getVirtualMachineReservation() == null) || (this.virtualMachineReservation != null && this.virtualMachineReservation
						.equals(other.getVirtualMachineReservation())))
				&& ((this.storageDevice == null && other.getStorageDevice() == null) || (this.storageDevice != null && this.storageDevice
						.equals(other.getStorageDevice())))
				&& ((this.multipathState == null && other.getMultipathState() == null) || (this.multipathState != null && this.multipathState
						.equals(other.getMultipathState())))
				&& ((this.fileSystemVolume == null && other
						.getFileSystemVolume() == null) || (this.fileSystemVolume != null && this.fileSystemVolume
						.equals(other.getFileSystemVolume())))
				&& ((this.network == null && other.getNetwork() == null) || (this.network != null && this.network
						.equals(other.getNetwork())))
				&& ((this.vmotion == null && other.getVmotion() == null) || (this.vmotion != null && this.vmotion
						.equals(other.getVmotion())))
				&& ((this.virtualNicManagerInfo == null && other
						.getVirtualNicManagerInfo() == null) || (this.virtualNicManagerInfo != null && this.virtualNicManagerInfo
						.equals(other.getVirtualNicManagerInfo())))
				&& ((this.capabilities == null && other.getCapabilities() == null) || (this.capabilities != null && this.capabilities
						.equals(other.getCapabilities())))
				&& ((this.datastoreCapabilities == null && other
						.getDatastoreCapabilities() == null) || (this.datastoreCapabilities != null && this.datastoreCapabilities
						.equals(other.getDatastoreCapabilities())))
				&& ((this.offloadCapabilities == null && other
						.getOffloadCapabilities() == null) || (this.offloadCapabilities != null && this.offloadCapabilities
						.equals(other.getOffloadCapabilities())))
				&& ((this.service == null && other.getService() == null) || (this.service != null && this.service
						.equals(other.getService())))
				&& ((this.firewall == null && other.getFirewall() == null) || (this.firewall != null && this.firewall
						.equals(other.getFirewall())))
				&& ((this.autoStart == null && other.getAutoStart() == null) || (this.autoStart != null && this.autoStart
						.equals(other.getAutoStart())))
				&& ((this.activeDiagnosticPartition == null && other
						.getActiveDiagnosticPartition() == null) || (this.activeDiagnosticPartition != null && this.activeDiagnosticPartition
						.equals(other.getActiveDiagnosticPartition())))
				&& ((this.option == null && other.getOption() == null) || (this.option != null && java.util.Arrays
						.equals(this.option, other.getOption())))
				&& ((this.optionDef == null && other.getOptionDef() == null) || (this.optionDef != null && java.util.Arrays
						.equals(this.optionDef, other.getOptionDef())))
				&& ((this.datastorePrincipal == null && other
						.getDatastorePrincipal() == null) || (this.datastorePrincipal != null && this.datastorePrincipal
						.equals(other.getDatastorePrincipal())))
				&& ((this.localSwapDatastore == null && other
						.getLocalSwapDatastore() == null) || (this.localSwapDatastore != null && this.localSwapDatastore
						.equals(other.getLocalSwapDatastore())))
				&& ((this.systemResources == null && other.getSystemResources() == null) || (this.systemResources != null && this.systemResources
						.equals(other.getSystemResources())))
				&& ((this.dateTimeInfo == null && other.getDateTimeInfo() == null) || (this.dateTimeInfo != null && this.dateTimeInfo
						.equals(other.getDateTimeInfo())))
				&& ((this.flags == null && other.getFlags() == null) || (this.flags != null && this.flags
						.equals(other.getFlags())))
				&& ((this.adminDisabled == null && other.getAdminDisabled() == null) || (this.adminDisabled != null && this.adminDisabled
						.equals(other.getAdminDisabled())))
				&& ((this.ipmi == null && other.getIpmi() == null) || (this.ipmi != null && this.ipmi
						.equals(other.getIpmi())))
				&& ((this.sslThumbprintInfo == null && other
						.getSslThumbprintInfo() == null) || (this.sslThumbprintInfo != null && this.sslThumbprintInfo
						.equals(other.getSslThumbprintInfo())))
				&& ((this.pciPassthruInfo == null && other.getPciPassthruInfo() == null) || (this.pciPassthruInfo != null && java.util.Arrays
						.equals(this.pciPassthruInfo, other
								.getPciPassthruInfo())));
		__equalsCalc = null;
		return _equals;
	}

	private boolean __hashCodeCalc = false;

	public synchronized int hashCode() {
		if (__hashCodeCalc) {
			return 0;
		}
		__hashCodeCalc = true;
		int _hashCode = super.hashCode();
		if (getHost() != null) {
			_hashCode += getHost().hashCode();
		}
		if (getProduct() != null) {
			_hashCode += getProduct().hashCode();
		}
		if (getHyperThread() != null) {
			_hashCode += getHyperThread().hashCode();
		}
		if (getConsoleReservation() != null) {
			_hashCode += getConsoleReservation().hashCode();
		}
		if (getVirtualMachineReservation() != null) {
			_hashCode += getVirtualMachineReservation().hashCode();
		}
		if (getStorageDevice() != null) {
			_hashCode += getStorageDevice().hashCode();
		}
		if (getMultipathState() != null) {
			_hashCode += getMultipathState().hashCode();
		}
		if (getFileSystemVolume() != null) {
			_hashCode += getFileSystemVolume().hashCode();
		}
		if (getNetwork() != null) {
			_hashCode += getNetwork().hashCode();
		}
		if (getVmotion() != null) {
			_hashCode += getVmotion().hashCode();
		}
		if (getVirtualNicManagerInfo() != null) {
			_hashCode += getVirtualNicManagerInfo().hashCode();
		}
		if (getCapabilities() != null) {
			_hashCode += getCapabilities().hashCode();
		}
		if (getDatastoreCapabilities() != null) {
			_hashCode += getDatastoreCapabilities().hashCode();
		}
		if (getOffloadCapabilities() != null) {
			_hashCode += getOffloadCapabilities().hashCode();
		}
		if (getService() != null) {
			_hashCode += getService().hashCode();
		}
		if (getFirewall() != null) {
			_hashCode += getFirewall().hashCode();
		}
		if (getAutoStart() != null) {
			_hashCode += getAutoStart().hashCode();
		}
		if (getActiveDiagnosticPartition() != null) {
			_hashCode += getActiveDiagnosticPartition().hashCode();
		}
		if (getOption() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getOption()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getOption(),
						i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getOptionDef() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getOptionDef()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getOptionDef(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getDatastorePrincipal() != null) {
			_hashCode += getDatastorePrincipal().hashCode();
		}
		if (getLocalSwapDatastore() != null) {
			_hashCode += getLocalSwapDatastore().hashCode();
		}
		if (getSystemResources() != null) {
			_hashCode += getSystemResources().hashCode();
		}
		if (getDateTimeInfo() != null) {
			_hashCode += getDateTimeInfo().hashCode();
		}
		if (getFlags() != null) {
			_hashCode += getFlags().hashCode();
		}
		if (getAdminDisabled() != null) {
			_hashCode += getAdminDisabled().hashCode();
		}
		if (getIpmi() != null) {
			_hashCode += getIpmi().hashCode();
		}
		if (getSslThumbprintInfo() != null) {
			_hashCode += getSslThumbprintInfo().hashCode();
		}
		if (getPciPassthruInfo() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getPciPassthruInfo()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getPciPassthruInfo(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostConfigInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostConfigInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("host");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "host"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("product");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"product"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"AboutInfo"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hyperThread");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"hyperThread"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostHyperThreadScheduleInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("consoleReservation");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"consoleReservation"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ServiceConsoleReservationInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("virtualMachineReservation");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"virtualMachineReservation"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachineMemoryReservationInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("storageDevice");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"storageDevice"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostStorageDeviceInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("multipathState");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"multipathState"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostMultipathStateInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("fileSystemVolume");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"fileSystemVolume"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostFileSystemVolumeInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("network");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"network"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostNetworkInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("vmotion");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"vmotion"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostVMotionInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("virtualNicManagerInfo");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"virtualNicManagerInfo"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostVirtualNicManagerInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("capabilities");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"capabilities"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostNetCapabilities"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("datastoreCapabilities");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"datastoreCapabilities"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostDatastoreSystemCapabilities"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("offloadCapabilities");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"offloadCapabilities"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostNetOffloadCapabilities"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("service");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"service"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostServiceInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("firewall");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"firewall"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostFirewallInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("autoStart");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"autoStart"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostAutoStartManagerConfig"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("activeDiagnosticPartition");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"activeDiagnosticPartition"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostDiagnosticPartition"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("option");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"option"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"OptionValue"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("optionDef");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"optionDef"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"OptionDef"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("datastorePrincipal");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"datastorePrincipal"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("localSwapDatastore");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"localSwapDatastore"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("systemResources");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"systemResources"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostSystemResourceInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dateTimeInfo");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"dateTimeInfo"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostDateTimeInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("flags");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "flags"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostFlagInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("adminDisabled");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"adminDisabled"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ipmi");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipmi"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostIpmiInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("sslThumbprintInfo");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"sslThumbprintInfo"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostSslThumbprintInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("pciPassthruInfo");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"pciPassthruInfo"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostPciPassthruInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

	/**
	 * Get Custom Serializer
	 */
	public static org.apache.axis.encoding.Serializer getSerializer(
			java.lang.String mechType, java.lang.Class _javaType,
			javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanSerializer(_javaType,
				_xmlType, typeDesc);
	}

	/**
	 * Get Custom Deserializer
	 */
	public static org.apache.axis.encoding.Deserializer getDeserializer(
			java.lang.String mechType, java.lang.Class _javaType,
			javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanDeserializer(_javaType,
				_xmlType, typeDesc);
	}

}
