/**
 * HostConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostConfigInfo extends com.vmware.vim.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.ManagedObjectReference host;

	private com.vmware.vim.AboutInfo product;

	private com.vmware.vim.HostHyperThreadScheduleInfo hyperThread;

	private com.vmware.vim.ServiceConsoleReservationInfo consoleReservation;

	private com.vmware.vim.HostStorageDeviceInfo storageDevice;

	private com.vmware.vim.HostFileSystemVolumeInfo fileSystemVolume;

	private com.vmware.vim.HostNetworkInfo network;

	private com.vmware.vim.HostVMotionInfo vmotion;

	private com.vmware.vim.HostNetCapabilities capabilities;

	private com.vmware.vim.HostNetOffloadCapabilities offloadCapabilities;

	private com.vmware.vim.HostServiceInfo service;

	private com.vmware.vim.HostFirewallInfo firewall;

	private com.vmware.vim.HostAutoStartManagerConfig autoStart;

	private com.vmware.vim.HostDiagnosticPartition activeDiagnosticPartition;

	private com.vmware.vim.OptionValue[] option;

	private com.vmware.vim.OptionDef[] optionDef;

	private java.lang.String datastorePrincipal;

	private com.vmware.vim.HostSystemResourceInfo systemResources;

	public HostConfigInfo() {
	}

	public HostConfigInfo(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			com.vmware.vim.ManagedObjectReference host,
			com.vmware.vim.AboutInfo product,
			com.vmware.vim.HostHyperThreadScheduleInfo hyperThread,
			com.vmware.vim.ServiceConsoleReservationInfo consoleReservation,
			com.vmware.vim.HostStorageDeviceInfo storageDevice,
			com.vmware.vim.HostFileSystemVolumeInfo fileSystemVolume,
			com.vmware.vim.HostNetworkInfo network,
			com.vmware.vim.HostVMotionInfo vmotion,
			com.vmware.vim.HostNetCapabilities capabilities,
			com.vmware.vim.HostNetOffloadCapabilities offloadCapabilities,
			com.vmware.vim.HostServiceInfo service,
			com.vmware.vim.HostFirewallInfo firewall,
			com.vmware.vim.HostAutoStartManagerConfig autoStart,
			com.vmware.vim.HostDiagnosticPartition activeDiagnosticPartition,
			com.vmware.vim.OptionValue[] option,
			com.vmware.vim.OptionDef[] optionDef,
			java.lang.String datastorePrincipal,
			com.vmware.vim.HostSystemResourceInfo systemResources) {
		super(dynamicType, dynamicProperty);
		this.host = host;
		this.product = product;
		this.hyperThread = hyperThread;
		this.consoleReservation = consoleReservation;
		this.storageDevice = storageDevice;
		this.fileSystemVolume = fileSystemVolume;
		this.network = network;
		this.vmotion = vmotion;
		this.capabilities = capabilities;
		this.offloadCapabilities = offloadCapabilities;
		this.service = service;
		this.firewall = firewall;
		this.autoStart = autoStart;
		this.activeDiagnosticPartition = activeDiagnosticPartition;
		this.option = option;
		this.optionDef = optionDef;
		this.datastorePrincipal = datastorePrincipal;
		this.systemResources = systemResources;
	}

	/**
	 * Gets the host value for this HostConfigInfo.
	 * 
	 * @return host
	 */
	public com.vmware.vim.ManagedObjectReference getHost() {
		return host;
	}

	/**
	 * Sets the host value for this HostConfigInfo.
	 * 
	 * @param host
	 */
	public void setHost(com.vmware.vim.ManagedObjectReference host) {
		this.host = host;
	}

	/**
	 * Gets the product value for this HostConfigInfo.
	 * 
	 * @return product
	 */
	public com.vmware.vim.AboutInfo getProduct() {
		return product;
	}

	/**
	 * Sets the product value for this HostConfigInfo.
	 * 
	 * @param product
	 */
	public void setProduct(com.vmware.vim.AboutInfo product) {
		this.product = product;
	}

	/**
	 * Gets the hyperThread value for this HostConfigInfo.
	 * 
	 * @return hyperThread
	 */
	public com.vmware.vim.HostHyperThreadScheduleInfo getHyperThread() {
		return hyperThread;
	}

	/**
	 * Sets the hyperThread value for this HostConfigInfo.
	 * 
	 * @param hyperThread
	 */
	public void setHyperThread(
			com.vmware.vim.HostHyperThreadScheduleInfo hyperThread) {
		this.hyperThread = hyperThread;
	}

	/**
	 * Gets the consoleReservation value for this HostConfigInfo.
	 * 
	 * @return consoleReservation
	 */
	public com.vmware.vim.ServiceConsoleReservationInfo getConsoleReservation() {
		return consoleReservation;
	}

	/**
	 * Sets the consoleReservation value for this HostConfigInfo.
	 * 
	 * @param consoleReservation
	 */
	public void setConsoleReservation(
			com.vmware.vim.ServiceConsoleReservationInfo consoleReservation) {
		this.consoleReservation = consoleReservation;
	}

	/**
	 * Gets the storageDevice value for this HostConfigInfo.
	 * 
	 * @return storageDevice
	 */
	public com.vmware.vim.HostStorageDeviceInfo getStorageDevice() {
		return storageDevice;
	}

	/**
	 * Sets the storageDevice value for this HostConfigInfo.
	 * 
	 * @param storageDevice
	 */
	public void setStorageDevice(
			com.vmware.vim.HostStorageDeviceInfo storageDevice) {
		this.storageDevice = storageDevice;
	}

	/**
	 * Gets the fileSystemVolume value for this HostConfigInfo.
	 * 
	 * @return fileSystemVolume
	 */
	public com.vmware.vim.HostFileSystemVolumeInfo getFileSystemVolume() {
		return fileSystemVolume;
	}

	/**
	 * Sets the fileSystemVolume value for this HostConfigInfo.
	 * 
	 * @param fileSystemVolume
	 */
	public void setFileSystemVolume(
			com.vmware.vim.HostFileSystemVolumeInfo fileSystemVolume) {
		this.fileSystemVolume = fileSystemVolume;
	}

	/**
	 * Gets the network value for this HostConfigInfo.
	 * 
	 * @return network
	 */
	public com.vmware.vim.HostNetworkInfo getNetwork() {
		return network;
	}

	/**
	 * Sets the network value for this HostConfigInfo.
	 * 
	 * @param network
	 */
	public void setNetwork(com.vmware.vim.HostNetworkInfo network) {
		this.network = network;
	}

	/**
	 * Gets the vmotion value for this HostConfigInfo.
	 * 
	 * @return vmotion
	 */
	public com.vmware.vim.HostVMotionInfo getVmotion() {
		return vmotion;
	}

	/**
	 * Sets the vmotion value for this HostConfigInfo.
	 * 
	 * @param vmotion
	 */
	public void setVmotion(com.vmware.vim.HostVMotionInfo vmotion) {
		this.vmotion = vmotion;
	}

	/**
	 * Gets the capabilities value for this HostConfigInfo.
	 * 
	 * @return capabilities
	 */
	public com.vmware.vim.HostNetCapabilities getCapabilities() {
		return capabilities;
	}

	/**
	 * Sets the capabilities value for this HostConfigInfo.
	 * 
	 * @param capabilities
	 */
	public void setCapabilities(com.vmware.vim.HostNetCapabilities capabilities) {
		this.capabilities = capabilities;
	}

	/**
	 * Gets the offloadCapabilities value for this HostConfigInfo.
	 * 
	 * @return offloadCapabilities
	 */
	public com.vmware.vim.HostNetOffloadCapabilities getOffloadCapabilities() {
		return offloadCapabilities;
	}

	/**
	 * Sets the offloadCapabilities value for this HostConfigInfo.
	 * 
	 * @param offloadCapabilities
	 */
	public void setOffloadCapabilities(
			com.vmware.vim.HostNetOffloadCapabilities offloadCapabilities) {
		this.offloadCapabilities = offloadCapabilities;
	}

	/**
	 * Gets the service value for this HostConfigInfo.
	 * 
	 * @return service
	 */
	public com.vmware.vim.HostServiceInfo getService() {
		return service;
	}

	/**
	 * Sets the service value for this HostConfigInfo.
	 * 
	 * @param service
	 */
	public void setService(com.vmware.vim.HostServiceInfo service) {
		this.service = service;
	}

	/**
	 * Gets the firewall value for this HostConfigInfo.
	 * 
	 * @return firewall
	 */
	public com.vmware.vim.HostFirewallInfo getFirewall() {
		return firewall;
	}

	/**
	 * Sets the firewall value for this HostConfigInfo.
	 * 
	 * @param firewall
	 */
	public void setFirewall(com.vmware.vim.HostFirewallInfo firewall) {
		this.firewall = firewall;
	}

	/**
	 * Gets the autoStart value for this HostConfigInfo.
	 * 
	 * @return autoStart
	 */
	public com.vmware.vim.HostAutoStartManagerConfig getAutoStart() {
		return autoStart;
	}

	/**
	 * Sets the autoStart value for this HostConfigInfo.
	 * 
	 * @param autoStart
	 */
	public void setAutoStart(com.vmware.vim.HostAutoStartManagerConfig autoStart) {
		this.autoStart = autoStart;
	}

	/**
	 * Gets the activeDiagnosticPartition value for this HostConfigInfo.
	 * 
	 * @return activeDiagnosticPartition
	 */
	public com.vmware.vim.HostDiagnosticPartition getActiveDiagnosticPartition() {
		return activeDiagnosticPartition;
	}

	/**
	 * Sets the activeDiagnosticPartition value for this HostConfigInfo.
	 * 
	 * @param activeDiagnosticPartition
	 */
	public void setActiveDiagnosticPartition(
			com.vmware.vim.HostDiagnosticPartition activeDiagnosticPartition) {
		this.activeDiagnosticPartition = activeDiagnosticPartition;
	}

	/**
	 * Gets the option value for this HostConfigInfo.
	 * 
	 * @return option
	 */
	public com.vmware.vim.OptionValue[] getOption() {
		return option;
	}

	/**
	 * Sets the option value for this HostConfigInfo.
	 * 
	 * @param option
	 */
	public void setOption(com.vmware.vim.OptionValue[] option) {
		this.option = option;
	}

	public com.vmware.vim.OptionValue getOption(int i) {
		return this.option[i];
	}

	public void setOption(int i, com.vmware.vim.OptionValue _value) {
		this.option[i] = _value;
	}

	/**
	 * Gets the optionDef value for this HostConfigInfo.
	 * 
	 * @return optionDef
	 */
	public com.vmware.vim.OptionDef[] getOptionDef() {
		return optionDef;
	}

	/**
	 * Sets the optionDef value for this HostConfigInfo.
	 * 
	 * @param optionDef
	 */
	public void setOptionDef(com.vmware.vim.OptionDef[] optionDef) {
		this.optionDef = optionDef;
	}

	public com.vmware.vim.OptionDef getOptionDef(int i) {
		return this.optionDef[i];
	}

	public void setOptionDef(int i, com.vmware.vim.OptionDef _value) {
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
	 * Gets the systemResources value for this HostConfigInfo.
	 * 
	 * @return systemResources
	 */
	public com.vmware.vim.HostSystemResourceInfo getSystemResources() {
		return systemResources;
	}

	/**
	 * Sets the systemResources value for this HostConfigInfo.
	 * 
	 * @param systemResources
	 */
	public void setSystemResources(
			com.vmware.vim.HostSystemResourceInfo systemResources) {
		this.systemResources = systemResources;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
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
				&& ((this.storageDevice == null && other.getStorageDevice() == null) || (this.storageDevice != null && this.storageDevice
						.equals(other.getStorageDevice())))
				&& ((this.fileSystemVolume == null && other
						.getFileSystemVolume() == null) || (this.fileSystemVolume != null && this.fileSystemVolume
						.equals(other.getFileSystemVolume())))
				&& ((this.network == null && other.getNetwork() == null) || (this.network != null && this.network
						.equals(other.getNetwork())))
				&& ((this.vmotion == null && other.getVmotion() == null) || (this.vmotion != null && this.vmotion
						.equals(other.getVmotion())))
				&& ((this.capabilities == null && other.getCapabilities() == null) || (this.capabilities != null && this.capabilities
						.equals(other.getCapabilities())))
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
				&& ((this.systemResources == null && other.getSystemResources() == null) || (this.systemResources != null && this.systemResources
						.equals(other.getSystemResources())));
		__equalsCalc = null;
		return _equals;
	}

	private boolean __hashCodeCalc = false;

	@Override
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
		if (getStorageDevice() != null) {
			_hashCode += getStorageDevice().hashCode();
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
		if (getCapabilities() != null) {
			_hashCode += getCapabilities().hashCode();
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
		if (getSystemResources() != null) {
			_hashCode += getSystemResources().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostConfigInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostConfigInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("host");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "host"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("product");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"product"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"AboutInfo"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hyperThread");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"hyperThread"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostHyperThreadScheduleInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("consoleReservation");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"consoleReservation"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ServiceConsoleReservationInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("storageDevice");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"storageDevice"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostStorageDeviceInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("fileSystemVolume");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"fileSystemVolume"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostFileSystemVolumeInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("network");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"network"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostNetworkInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("vmotion");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"vmotion"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostVMotionInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("capabilities");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"capabilities"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostNetCapabilities"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("offloadCapabilities");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"offloadCapabilities"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostNetOffloadCapabilities"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("service");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"service"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostServiceInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("firewall");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"firewall"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostFirewallInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("autoStart");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"autoStart"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostAutoStartManagerConfig"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("activeDiagnosticPartition");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"activeDiagnosticPartition"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostDiagnosticPartition"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("option");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "option"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"OptionValue"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("optionDef");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"optionDef"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"OptionDef"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("datastorePrincipal");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"datastorePrincipal"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("systemResources");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"systemResources"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostSystemResourceInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
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
