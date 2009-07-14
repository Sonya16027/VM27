/**
 * ArrayOfHostStorageOperationalInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfHostStorageOperationalInfo implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.HostStorageOperationalInfo[] hostStorageOperationalInfo;

	public ArrayOfHostStorageOperationalInfo() {
	}

	public ArrayOfHostStorageOperationalInfo(
			com.vmware.vim25.HostStorageOperationalInfo[] hostStorageOperationalInfo) {
		this.hostStorageOperationalInfo = hostStorageOperationalInfo;
	}

	/**
	 * Gets the hostStorageOperationalInfo value for this
	 * ArrayOfHostStorageOperationalInfo.
	 * 
	 * @return hostStorageOperationalInfo
	 */
	public com.vmware.vim25.HostStorageOperationalInfo[] getHostStorageOperationalInfo() {
		return hostStorageOperationalInfo;
	}

	/**
	 * Sets the hostStorageOperationalInfo value for this
	 * ArrayOfHostStorageOperationalInfo.
	 * 
	 * @param hostStorageOperationalInfo
	 */
	public void setHostStorageOperationalInfo(
			com.vmware.vim25.HostStorageOperationalInfo[] hostStorageOperationalInfo) {
		this.hostStorageOperationalInfo = hostStorageOperationalInfo;
	}

	public com.vmware.vim25.HostStorageOperationalInfo getHostStorageOperationalInfo(
			int i) {
		return this.hostStorageOperationalInfo[i];
	}

	public void setHostStorageOperationalInfo(int i,
			com.vmware.vim25.HostStorageOperationalInfo _value) {
		this.hostStorageOperationalInfo[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfHostStorageOperationalInfo)) {
			return false;
		}
		ArrayOfHostStorageOperationalInfo other = (ArrayOfHostStorageOperationalInfo) obj;
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
		_equals = true && ((this.hostStorageOperationalInfo == null && other
				.getHostStorageOperationalInfo() == null) || (this.hostStorageOperationalInfo != null && java.util.Arrays
				.equals(this.hostStorageOperationalInfo, other
						.getHostStorageOperationalInfo())));
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
		if (getHostStorageOperationalInfo() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getHostStorageOperationalInfo()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getHostStorageOperationalInfo(), i);
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
			ArrayOfHostStorageOperationalInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfHostStorageOperationalInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostStorageOperationalInfo");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"HostStorageOperationalInfo"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostStorageOperationalInfo"));
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
