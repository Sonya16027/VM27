/**
 * HostNetworkConfigResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostNetworkConfigResult extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String[] vnicDevice;

	private java.lang.String[] consoleVnicDevice;

	public HostNetworkConfigResult() {
	}

	public HostNetworkConfigResult(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String[] vnicDevice, java.lang.String[] consoleVnicDevice) {
		super(dynamicType, dynamicProperty);
		this.vnicDevice = vnicDevice;
		this.consoleVnicDevice = consoleVnicDevice;
	}

	/**
	 * Gets the vnicDevice value for this HostNetworkConfigResult.
	 * 
	 * @return vnicDevice
	 */
	public java.lang.String[] getVnicDevice() {
		return vnicDevice;
	}

	/**
	 * Sets the vnicDevice value for this HostNetworkConfigResult.
	 * 
	 * @param vnicDevice
	 */
	public void setVnicDevice(java.lang.String[] vnicDevice) {
		this.vnicDevice = vnicDevice;
	}

	public java.lang.String getVnicDevice(int i) {
		return this.vnicDevice[i];
	}

	public void setVnicDevice(int i, java.lang.String _value) {
		this.vnicDevice[i] = _value;
	}

	/**
	 * Gets the consoleVnicDevice value for this HostNetworkConfigResult.
	 * 
	 * @return consoleVnicDevice
	 */
	public java.lang.String[] getConsoleVnicDevice() {
		return consoleVnicDevice;
	}

	/**
	 * Sets the consoleVnicDevice value for this HostNetworkConfigResult.
	 * 
	 * @param consoleVnicDevice
	 */
	public void setConsoleVnicDevice(java.lang.String[] consoleVnicDevice) {
		this.consoleVnicDevice = consoleVnicDevice;
	}

	public java.lang.String getConsoleVnicDevice(int i) {
		return this.consoleVnicDevice[i];
	}

	public void setConsoleVnicDevice(int i, java.lang.String _value) {
		this.consoleVnicDevice[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostNetworkConfigResult)) {
			return false;
		}
		HostNetworkConfigResult other = (HostNetworkConfigResult) obj;
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
				&& ((this.vnicDevice == null && other.getVnicDevice() == null) || (this.vnicDevice != null && java.util.Arrays
						.equals(this.vnicDevice, other.getVnicDevice())))
				&& ((this.consoleVnicDevice == null && other
						.getConsoleVnicDevice() == null) || (this.consoleVnicDevice != null && java.util.Arrays
						.equals(this.consoleVnicDevice, other
								.getConsoleVnicDevice())));
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
		if (getVnicDevice() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getVnicDevice()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getVnicDevice(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getConsoleVnicDevice() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getConsoleVnicDevice()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getConsoleVnicDevice(), i);
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
			HostNetworkConfigResult.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostNetworkConfigResult"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("vnicDevice");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"vnicDevice"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("consoleVnicDevice");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"consoleVnicDevice"));
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
