/**
 * VirtualMachineConfigOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualMachineConfigOption extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String version;

	private java.lang.String description;

	private com.vmware.vim25.GuestOsDescriptor[] guestOSDescriptor;

	private int guestOSDefaultIndex;

	private com.vmware.vim25.VirtualHardwareOption hardwareOptions;

	private com.vmware.vim25.VirtualMachineCapability capabilities;

	private com.vmware.vim25.DatastoreOption datastore;

	private com.vmware.vim25.VirtualDevice[] defaultDevice;

	private java.lang.String[] supportedMonitorType;

	private java.lang.String[] supportedOvfEnvironmentTransport;

	private java.lang.String[] supportedOvfInstallTransport;

	public VirtualMachineConfigOption() {
	}

	public VirtualMachineConfigOption(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String version, java.lang.String description,
			com.vmware.vim25.GuestOsDescriptor[] guestOSDescriptor,
			int guestOSDefaultIndex,
			com.vmware.vim25.VirtualHardwareOption hardwareOptions,
			com.vmware.vim25.VirtualMachineCapability capabilities,
			com.vmware.vim25.DatastoreOption datastore,
			com.vmware.vim25.VirtualDevice[] defaultDevice,
			java.lang.String[] supportedMonitorType,
			java.lang.String[] supportedOvfEnvironmentTransport,
			java.lang.String[] supportedOvfInstallTransport) {
		super(dynamicType, dynamicProperty);
		this.version = version;
		this.description = description;
		this.guestOSDescriptor = guestOSDescriptor;
		this.guestOSDefaultIndex = guestOSDefaultIndex;
		this.hardwareOptions = hardwareOptions;
		this.capabilities = capabilities;
		this.datastore = datastore;
		this.defaultDevice = defaultDevice;
		this.supportedMonitorType = supportedMonitorType;
		this.supportedOvfEnvironmentTransport = supportedOvfEnvironmentTransport;
		this.supportedOvfInstallTransport = supportedOvfInstallTransport;
	}

	/**
	 * Gets the version value for this VirtualMachineConfigOption.
	 * 
	 * @return version
	 */
	public java.lang.String getVersion() {
		return version;
	}

	/**
	 * Sets the version value for this VirtualMachineConfigOption.
	 * 
	 * @param version
	 */
	public void setVersion(java.lang.String version) {
		this.version = version;
	}

	/**
	 * Gets the description value for this VirtualMachineConfigOption.
	 * 
	 * @return description
	 */
	public java.lang.String getDescription() {
		return description;
	}

	/**
	 * Sets the description value for this VirtualMachineConfigOption.
	 * 
	 * @param description
	 */
	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	/**
	 * Gets the guestOSDescriptor value for this VirtualMachineConfigOption.
	 * 
	 * @return guestOSDescriptor
	 */
	public com.vmware.vim25.GuestOsDescriptor[] getGuestOSDescriptor() {
		return guestOSDescriptor;
	}

	/**
	 * Sets the guestOSDescriptor value for this VirtualMachineConfigOption.
	 * 
	 * @param guestOSDescriptor
	 */
	public void setGuestOSDescriptor(
			com.vmware.vim25.GuestOsDescriptor[] guestOSDescriptor) {
		this.guestOSDescriptor = guestOSDescriptor;
	}

	public com.vmware.vim25.GuestOsDescriptor getGuestOSDescriptor(int i) {
		return this.guestOSDescriptor[i];
	}

	public void setGuestOSDescriptor(int i,
			com.vmware.vim25.GuestOsDescriptor _value) {
		this.guestOSDescriptor[i] = _value;
	}

	/**
	 * Gets the guestOSDefaultIndex value for this VirtualMachineConfigOption.
	 * 
	 * @return guestOSDefaultIndex
	 */
	public int getGuestOSDefaultIndex() {
		return guestOSDefaultIndex;
	}

	/**
	 * Sets the guestOSDefaultIndex value for this VirtualMachineConfigOption.
	 * 
	 * @param guestOSDefaultIndex
	 */
	public void setGuestOSDefaultIndex(int guestOSDefaultIndex) {
		this.guestOSDefaultIndex = guestOSDefaultIndex;
	}

	/**
	 * Gets the hardwareOptions value for this VirtualMachineConfigOption.
	 * 
	 * @return hardwareOptions
	 */
	public com.vmware.vim25.VirtualHardwareOption getHardwareOptions() {
		return hardwareOptions;
	}

	/**
	 * Sets the hardwareOptions value for this VirtualMachineConfigOption.
	 * 
	 * @param hardwareOptions
	 */
	public void setHardwareOptions(
			com.vmware.vim25.VirtualHardwareOption hardwareOptions) {
		this.hardwareOptions = hardwareOptions;
	}

	/**
	 * Gets the capabilities value for this VirtualMachineConfigOption.
	 * 
	 * @return capabilities
	 */
	public com.vmware.vim25.VirtualMachineCapability getCapabilities() {
		return capabilities;
	}

	/**
	 * Sets the capabilities value for this VirtualMachineConfigOption.
	 * 
	 * @param capabilities
	 */
	public void setCapabilities(
			com.vmware.vim25.VirtualMachineCapability capabilities) {
		this.capabilities = capabilities;
	}

	/**
	 * Gets the datastore value for this VirtualMachineConfigOption.
	 * 
	 * @return datastore
	 */
	public com.vmware.vim25.DatastoreOption getDatastore() {
		return datastore;
	}

	/**
	 * Sets the datastore value for this VirtualMachineConfigOption.
	 * 
	 * @param datastore
	 */
	public void setDatastore(com.vmware.vim25.DatastoreOption datastore) {
		this.datastore = datastore;
	}

	/**
	 * Gets the defaultDevice value for this VirtualMachineConfigOption.
	 * 
	 * @return defaultDevice
	 */
	public com.vmware.vim25.VirtualDevice[] getDefaultDevice() {
		return defaultDevice;
	}

	/**
	 * Sets the defaultDevice value for this VirtualMachineConfigOption.
	 * 
	 * @param defaultDevice
	 */
	public void setDefaultDevice(com.vmware.vim25.VirtualDevice[] defaultDevice) {
		this.defaultDevice = defaultDevice;
	}

	public com.vmware.vim25.VirtualDevice getDefaultDevice(int i) {
		return this.defaultDevice[i];
	}

	public void setDefaultDevice(int i, com.vmware.vim25.VirtualDevice _value) {
		this.defaultDevice[i] = _value;
	}

	/**
	 * Gets the supportedMonitorType value for this VirtualMachineConfigOption.
	 * 
	 * @return supportedMonitorType
	 */
	public java.lang.String[] getSupportedMonitorType() {
		return supportedMonitorType;
	}

	/**
	 * Sets the supportedMonitorType value for this VirtualMachineConfigOption.
	 * 
	 * @param supportedMonitorType
	 */
	public void setSupportedMonitorType(java.lang.String[] supportedMonitorType) {
		this.supportedMonitorType = supportedMonitorType;
	}

	public java.lang.String getSupportedMonitorType(int i) {
		return this.supportedMonitorType[i];
	}

	public void setSupportedMonitorType(int i, java.lang.String _value) {
		this.supportedMonitorType[i] = _value;
	}

	/**
	 * Gets the supportedOvfEnvironmentTransport value for this
	 * VirtualMachineConfigOption.
	 * 
	 * @return supportedOvfEnvironmentTransport
	 */
	public java.lang.String[] getSupportedOvfEnvironmentTransport() {
		return supportedOvfEnvironmentTransport;
	}

	/**
	 * Sets the supportedOvfEnvironmentTransport value for this
	 * VirtualMachineConfigOption.
	 * 
	 * @param supportedOvfEnvironmentTransport
	 */
	public void setSupportedOvfEnvironmentTransport(
			java.lang.String[] supportedOvfEnvironmentTransport) {
		this.supportedOvfEnvironmentTransport = supportedOvfEnvironmentTransport;
	}

	public java.lang.String getSupportedOvfEnvironmentTransport(int i) {
		return this.supportedOvfEnvironmentTransport[i];
	}

	public void setSupportedOvfEnvironmentTransport(int i,
			java.lang.String _value) {
		this.supportedOvfEnvironmentTransport[i] = _value;
	}

	/**
	 * Gets the supportedOvfInstallTransport value for this
	 * VirtualMachineConfigOption.
	 * 
	 * @return supportedOvfInstallTransport
	 */
	public java.lang.String[] getSupportedOvfInstallTransport() {
		return supportedOvfInstallTransport;
	}

	/**
	 * Sets the supportedOvfInstallTransport value for this
	 * VirtualMachineConfigOption.
	 * 
	 * @param supportedOvfInstallTransport
	 */
	public void setSupportedOvfInstallTransport(
			java.lang.String[] supportedOvfInstallTransport) {
		this.supportedOvfInstallTransport = supportedOvfInstallTransport;
	}

	public java.lang.String getSupportedOvfInstallTransport(int i) {
		return this.supportedOvfInstallTransport[i];
	}

	public void setSupportedOvfInstallTransport(int i, java.lang.String _value) {
		this.supportedOvfInstallTransport[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualMachineConfigOption)) {
			return false;
		}
		VirtualMachineConfigOption other = (VirtualMachineConfigOption) obj;
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
				&& ((this.version == null && other.getVersion() == null) || (this.version != null && this.version
						.equals(other.getVersion())))
				&& ((this.description == null && other.getDescription() == null) || (this.description != null && this.description
						.equals(other.getDescription())))
				&& ((this.guestOSDescriptor == null && other
						.getGuestOSDescriptor() == null) || (this.guestOSDescriptor != null && java.util.Arrays
						.equals(this.guestOSDescriptor, other
								.getGuestOSDescriptor())))
				&& this.guestOSDefaultIndex == other.getGuestOSDefaultIndex()
				&& ((this.hardwareOptions == null && other.getHardwareOptions() == null) || (this.hardwareOptions != null && this.hardwareOptions
						.equals(other.getHardwareOptions())))
				&& ((this.capabilities == null && other.getCapabilities() == null) || (this.capabilities != null && this.capabilities
						.equals(other.getCapabilities())))
				&& ((this.datastore == null && other.getDatastore() == null) || (this.datastore != null && this.datastore
						.equals(other.getDatastore())))
				&& ((this.defaultDevice == null && other.getDefaultDevice() == null) || (this.defaultDevice != null && java.util.Arrays
						.equals(this.defaultDevice, other.getDefaultDevice())))
				&& ((this.supportedMonitorType == null && other
						.getSupportedMonitorType() == null) || (this.supportedMonitorType != null && java.util.Arrays
						.equals(this.supportedMonitorType, other
								.getSupportedMonitorType())))
				&& ((this.supportedOvfEnvironmentTransport == null && other
						.getSupportedOvfEnvironmentTransport() == null) || (this.supportedOvfEnvironmentTransport != null && java.util.Arrays
						.equals(this.supportedOvfEnvironmentTransport, other
								.getSupportedOvfEnvironmentTransport())))
				&& ((this.supportedOvfInstallTransport == null && other
						.getSupportedOvfInstallTransport() == null) || (this.supportedOvfInstallTransport != null && java.util.Arrays
						.equals(this.supportedOvfInstallTransport, other
								.getSupportedOvfInstallTransport())));
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
		if (getVersion() != null) {
			_hashCode += getVersion().hashCode();
		}
		if (getDescription() != null) {
			_hashCode += getDescription().hashCode();
		}
		if (getGuestOSDescriptor() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getGuestOSDescriptor()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getGuestOSDescriptor(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		_hashCode += getGuestOSDefaultIndex();
		if (getHardwareOptions() != null) {
			_hashCode += getHardwareOptions().hashCode();
		}
		if (getCapabilities() != null) {
			_hashCode += getCapabilities().hashCode();
		}
		if (getDatastore() != null) {
			_hashCode += getDatastore().hashCode();
		}
		if (getDefaultDevice() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getDefaultDevice()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getDefaultDevice(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getSupportedMonitorType() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getSupportedMonitorType()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getSupportedMonitorType(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getSupportedOvfEnvironmentTransport() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getSupportedOvfEnvironmentTransport()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getSupportedOvfEnvironmentTransport(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getSupportedOvfInstallTransport() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getSupportedOvfInstallTransport()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getSupportedOvfInstallTransport(), i);
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
			VirtualMachineConfigOption.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachineConfigOption"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("version");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"version"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("description");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"description"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("guestOSDescriptor");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"guestOSDescriptor"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"GuestOsDescriptor"));
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("guestOSDefaultIndex");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"guestOSDefaultIndex"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hardwareOptions");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"hardwareOptions"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualHardwareOption"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("capabilities");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"capabilities"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachineCapability"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("datastore");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"datastore"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DatastoreOption"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("defaultDevice");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"defaultDevice"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualDevice"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("supportedMonitorType");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"supportedMonitorType"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("supportedOvfEnvironmentTransport");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"supportedOvfEnvironmentTransport"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("supportedOvfInstallTransport");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"supportedOvfInstallTransport"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
