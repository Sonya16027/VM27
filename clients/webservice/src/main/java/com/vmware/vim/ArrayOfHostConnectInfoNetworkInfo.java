/**
 * ArrayOfHostConnectInfoNetworkInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ArrayOfHostConnectInfoNetworkInfo implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim.HostConnectInfoNetworkInfo[] hostConnectInfoNetworkInfo;

	public ArrayOfHostConnectInfoNetworkInfo() {
	}

	public ArrayOfHostConnectInfoNetworkInfo(
			com.vmware.vim.HostConnectInfoNetworkInfo[] hostConnectInfoNetworkInfo) {
		this.hostConnectInfoNetworkInfo = hostConnectInfoNetworkInfo;
	}

	/**
	 * Gets the hostConnectInfoNetworkInfo value for this
	 * ArrayOfHostConnectInfoNetworkInfo.
	 * 
	 * @return hostConnectInfoNetworkInfo
	 */
	public com.vmware.vim.HostConnectInfoNetworkInfo[] getHostConnectInfoNetworkInfo() {
		return hostConnectInfoNetworkInfo;
	}

	/**
	 * Sets the hostConnectInfoNetworkInfo value for this
	 * ArrayOfHostConnectInfoNetworkInfo.
	 * 
	 * @param hostConnectInfoNetworkInfo
	 */
	public void setHostConnectInfoNetworkInfo(
			com.vmware.vim.HostConnectInfoNetworkInfo[] hostConnectInfoNetworkInfo) {
		this.hostConnectInfoNetworkInfo = hostConnectInfoNetworkInfo;
	}

	public com.vmware.vim.HostConnectInfoNetworkInfo getHostConnectInfoNetworkInfo(
			int i) {
		return this.hostConnectInfoNetworkInfo[i];
	}

	public void setHostConnectInfoNetworkInfo(int i,
			com.vmware.vim.HostConnectInfoNetworkInfo _value) {
		this.hostConnectInfoNetworkInfo[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfHostConnectInfoNetworkInfo)) {
			return false;
		}
		ArrayOfHostConnectInfoNetworkInfo other = (ArrayOfHostConnectInfoNetworkInfo) obj;
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
		_equals = true && ((this.hostConnectInfoNetworkInfo == null && other
				.getHostConnectInfoNetworkInfo() == null) || (this.hostConnectInfoNetworkInfo != null && java.util.Arrays
				.equals(this.hostConnectInfoNetworkInfo, other
						.getHostConnectInfoNetworkInfo())));
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
		if (getHostConnectInfoNetworkInfo() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getHostConnectInfoNetworkInfo()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getHostConnectInfoNetworkInfo(), i);
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
			ArrayOfHostConnectInfoNetworkInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ArrayOfHostConnectInfoNetworkInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostConnectInfoNetworkInfo");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"HostConnectInfoNetworkInfo"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostConnectInfoNetworkInfo"));
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
