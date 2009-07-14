/**
 * ArrayOfHostDatastoreConnectInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ArrayOfHostDatastoreConnectInfo implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim.HostDatastoreConnectInfo[] hostDatastoreConnectInfo;

	public ArrayOfHostDatastoreConnectInfo() {
	}

	public ArrayOfHostDatastoreConnectInfo(
			com.vmware.vim.HostDatastoreConnectInfo[] hostDatastoreConnectInfo) {
		this.hostDatastoreConnectInfo = hostDatastoreConnectInfo;
	}

	/**
	 * Gets the hostDatastoreConnectInfo value for this
	 * ArrayOfHostDatastoreConnectInfo.
	 * 
	 * @return hostDatastoreConnectInfo
	 */
	public com.vmware.vim.HostDatastoreConnectInfo[] getHostDatastoreConnectInfo() {
		return hostDatastoreConnectInfo;
	}

	/**
	 * Sets the hostDatastoreConnectInfo value for this
	 * ArrayOfHostDatastoreConnectInfo.
	 * 
	 * @param hostDatastoreConnectInfo
	 */
	public void setHostDatastoreConnectInfo(
			com.vmware.vim.HostDatastoreConnectInfo[] hostDatastoreConnectInfo) {
		this.hostDatastoreConnectInfo = hostDatastoreConnectInfo;
	}

	public com.vmware.vim.HostDatastoreConnectInfo getHostDatastoreConnectInfo(
			int i) {
		return this.hostDatastoreConnectInfo[i];
	}

	public void setHostDatastoreConnectInfo(int i,
			com.vmware.vim.HostDatastoreConnectInfo _value) {
		this.hostDatastoreConnectInfo[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfHostDatastoreConnectInfo)) {
			return false;
		}
		ArrayOfHostDatastoreConnectInfo other = (ArrayOfHostDatastoreConnectInfo) obj;
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
		_equals = true && ((this.hostDatastoreConnectInfo == null && other
				.getHostDatastoreConnectInfo() == null) || (this.hostDatastoreConnectInfo != null && java.util.Arrays
				.equals(this.hostDatastoreConnectInfo, other
						.getHostDatastoreConnectInfo())));
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
		if (getHostDatastoreConnectInfo() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getHostDatastoreConnectInfo()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getHostDatastoreConnectInfo(), i);
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
			ArrayOfHostDatastoreConnectInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ArrayOfHostDatastoreConnectInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostDatastoreConnectInfo");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"HostDatastoreConnectInfo"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostDatastoreConnectInfo"));
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
