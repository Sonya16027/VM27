/**
 * ArrayOfHostStorageElementInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfHostStorageElementInfo implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.HostStorageElementInfo[] hostStorageElementInfo;

	public ArrayOfHostStorageElementInfo() {
	}

	public ArrayOfHostStorageElementInfo(
			com.vmware.vim25.HostStorageElementInfo[] hostStorageElementInfo) {
		this.hostStorageElementInfo = hostStorageElementInfo;
	}

	/**
	 * Gets the hostStorageElementInfo value for this
	 * ArrayOfHostStorageElementInfo.
	 * 
	 * @return hostStorageElementInfo
	 */
	public com.vmware.vim25.HostStorageElementInfo[] getHostStorageElementInfo() {
		return hostStorageElementInfo;
	}

	/**
	 * Sets the hostStorageElementInfo value for this
	 * ArrayOfHostStorageElementInfo.
	 * 
	 * @param hostStorageElementInfo
	 */
	public void setHostStorageElementInfo(
			com.vmware.vim25.HostStorageElementInfo[] hostStorageElementInfo) {
		this.hostStorageElementInfo = hostStorageElementInfo;
	}

	public com.vmware.vim25.HostStorageElementInfo getHostStorageElementInfo(
			int i) {
		return this.hostStorageElementInfo[i];
	}

	public void setHostStorageElementInfo(int i,
			com.vmware.vim25.HostStorageElementInfo _value) {
		this.hostStorageElementInfo[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfHostStorageElementInfo)) {
			return false;
		}
		ArrayOfHostStorageElementInfo other = (ArrayOfHostStorageElementInfo) obj;
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
		_equals = true && ((this.hostStorageElementInfo == null && other
				.getHostStorageElementInfo() == null) || (this.hostStorageElementInfo != null && java.util.Arrays
				.equals(this.hostStorageElementInfo, other
						.getHostStorageElementInfo())));
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
		if (getHostStorageElementInfo() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getHostStorageElementInfo()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getHostStorageElementInfo(), i);
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
			ArrayOfHostStorageElementInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfHostStorageElementInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostStorageElementInfo");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"HostStorageElementInfo"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostStorageElementInfo"));
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
