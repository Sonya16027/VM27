/**
 * ArrayOfHostBootDevice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfHostBootDevice implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.HostBootDevice[] hostBootDevice;

	public ArrayOfHostBootDevice() {
	}

	public ArrayOfHostBootDevice(
			com.vmware.vim25.HostBootDevice[] hostBootDevice) {
		this.hostBootDevice = hostBootDevice;
	}

	/**
	 * Gets the hostBootDevice value for this ArrayOfHostBootDevice.
	 * 
	 * @return hostBootDevice
	 */
	public com.vmware.vim25.HostBootDevice[] getHostBootDevice() {
		return hostBootDevice;
	}

	/**
	 * Sets the hostBootDevice value for this ArrayOfHostBootDevice.
	 * 
	 * @param hostBootDevice
	 */
	public void setHostBootDevice(
			com.vmware.vim25.HostBootDevice[] hostBootDevice) {
		this.hostBootDevice = hostBootDevice;
	}

	public com.vmware.vim25.HostBootDevice getHostBootDevice(int i) {
		return this.hostBootDevice[i];
	}

	public void setHostBootDevice(int i, com.vmware.vim25.HostBootDevice _value) {
		this.hostBootDevice[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfHostBootDevice)) {
			return false;
		}
		ArrayOfHostBootDevice other = (ArrayOfHostBootDevice) obj;
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
		_equals = true && ((this.hostBootDevice == null && other
				.getHostBootDevice() == null) || (this.hostBootDevice != null && java.util.Arrays
				.equals(this.hostBootDevice, other.getHostBootDevice())));
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
		int _hashCode = 1;
		if (getHostBootDevice() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getHostBootDevice()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getHostBootDevice(), i);
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
			ArrayOfHostBootDevice.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfHostBootDevice"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostBootDevice");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"HostBootDevice"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostBootDevice"));
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
