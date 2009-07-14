/**
 * ArrayOfHostHardwareElementInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfHostHardwareElementInfo implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.HostHardwareElementInfo[] hostHardwareElementInfo;

	public ArrayOfHostHardwareElementInfo() {
	}

	public ArrayOfHostHardwareElementInfo(
			com.vmware.vim25.HostHardwareElementInfo[] hostHardwareElementInfo) {
		this.hostHardwareElementInfo = hostHardwareElementInfo;
	}

	/**
	 * Gets the hostHardwareElementInfo value for this
	 * ArrayOfHostHardwareElementInfo.
	 * 
	 * @return hostHardwareElementInfo
	 */
	public com.vmware.vim25.HostHardwareElementInfo[] getHostHardwareElementInfo() {
		return hostHardwareElementInfo;
	}

	/**
	 * Sets the hostHardwareElementInfo value for this
	 * ArrayOfHostHardwareElementInfo.
	 * 
	 * @param hostHardwareElementInfo
	 */
	public void setHostHardwareElementInfo(
			com.vmware.vim25.HostHardwareElementInfo[] hostHardwareElementInfo) {
		this.hostHardwareElementInfo = hostHardwareElementInfo;
	}

	public com.vmware.vim25.HostHardwareElementInfo getHostHardwareElementInfo(
			int i) {
		return this.hostHardwareElementInfo[i];
	}

	public void setHostHardwareElementInfo(int i,
			com.vmware.vim25.HostHardwareElementInfo _value) {
		this.hostHardwareElementInfo[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfHostHardwareElementInfo)) {
			return false;
		}
		ArrayOfHostHardwareElementInfo other = (ArrayOfHostHardwareElementInfo) obj;
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
		_equals = true && ((this.hostHardwareElementInfo == null && other
				.getHostHardwareElementInfo() == null) || (this.hostHardwareElementInfo != null && java.util.Arrays
				.equals(this.hostHardwareElementInfo, other
						.getHostHardwareElementInfo())));
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
		if (getHostHardwareElementInfo() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getHostHardwareElementInfo()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getHostHardwareElementInfo(), i);
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
			ArrayOfHostHardwareElementInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfHostHardwareElementInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostHardwareElementInfo");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"HostHardwareElementInfo"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostHardwareElementInfo"));
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
