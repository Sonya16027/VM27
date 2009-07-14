/**
 * VirtualControllerOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class VirtualControllerOption extends com.vmware.vim.VirtualDeviceOption
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.IntOption devices;

	private java.lang.String[] supportedDevice;

	public VirtualControllerOption() {
	}

	public VirtualControllerOption(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			java.lang.String type,
			com.vmware.vim.VirtualDeviceConnectOption connectOption,
			java.lang.String controllerType,
			com.vmware.vim.BoolOption autoAssignController,
			com.vmware.vim.VirtualDeviceBackingOption[] backingOption,
			java.lang.Integer defaultBackingOptionIndex,
			java.lang.String[] licensingLimit, boolean deprecated,
			boolean plugAndPlay, com.vmware.vim.IntOption devices,
			java.lang.String[] supportedDevice) {
		super(dynamicType, dynamicProperty, type, connectOption,
				controllerType, autoAssignController, backingOption,
				defaultBackingOptionIndex, licensingLimit, deprecated,
				plugAndPlay);
		this.devices = devices;
		this.supportedDevice = supportedDevice;
	}

	/**
	 * Gets the devices value for this VirtualControllerOption.
	 * 
	 * @return devices
	 */
	public com.vmware.vim.IntOption getDevices() {
		return devices;
	}

	/**
	 * Sets the devices value for this VirtualControllerOption.
	 * 
	 * @param devices
	 */
	public void setDevices(com.vmware.vim.IntOption devices) {
		this.devices = devices;
	}

	/**
	 * Gets the supportedDevice value for this VirtualControllerOption.
	 * 
	 * @return supportedDevice
	 */
	public java.lang.String[] getSupportedDevice() {
		return supportedDevice;
	}

	/**
	 * Sets the supportedDevice value for this VirtualControllerOption.
	 * 
	 * @param supportedDevice
	 */
	public void setSupportedDevice(java.lang.String[] supportedDevice) {
		this.supportedDevice = supportedDevice;
	}

	public java.lang.String getSupportedDevice(int i) {
		return this.supportedDevice[i];
	}

	public void setSupportedDevice(int i, java.lang.String _value) {
		this.supportedDevice[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualControllerOption)) {
			return false;
		}
		VirtualControllerOption other = (VirtualControllerOption) obj;
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
				&& ((this.devices == null && other.getDevices() == null) || (this.devices != null && this.devices
						.equals(other.getDevices())))
				&& ((this.supportedDevice == null && other.getSupportedDevice() == null) || (this.supportedDevice != null && java.util.Arrays
						.equals(this.supportedDevice, other
								.getSupportedDevice())));
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
		if (getDevices() != null) {
			_hashCode += getDevices().hashCode();
		}
		if (getSupportedDevice() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getSupportedDevice()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getSupportedDevice(), i);
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
			VirtualControllerOption.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualControllerOption"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("devices");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"devices"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"IntOption"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("supportedDevice");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"supportedDevice"));
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
