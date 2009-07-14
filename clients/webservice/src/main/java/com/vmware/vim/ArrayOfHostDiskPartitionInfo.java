/**
 * ArrayOfHostDiskPartitionInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ArrayOfHostDiskPartitionInfo implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim.HostDiskPartitionInfo[] hostDiskPartitionInfo;

	public ArrayOfHostDiskPartitionInfo() {
	}

	public ArrayOfHostDiskPartitionInfo(
			com.vmware.vim.HostDiskPartitionInfo[] hostDiskPartitionInfo) {
		this.hostDiskPartitionInfo = hostDiskPartitionInfo;
	}

	/**
	 * Gets the hostDiskPartitionInfo value for this
	 * ArrayOfHostDiskPartitionInfo.
	 * 
	 * @return hostDiskPartitionInfo
	 */
	public com.vmware.vim.HostDiskPartitionInfo[] getHostDiskPartitionInfo() {
		return hostDiskPartitionInfo;
	}

	/**
	 * Sets the hostDiskPartitionInfo value for this
	 * ArrayOfHostDiskPartitionInfo.
	 * 
	 * @param hostDiskPartitionInfo
	 */
	public void setHostDiskPartitionInfo(
			com.vmware.vim.HostDiskPartitionInfo[] hostDiskPartitionInfo) {
		this.hostDiskPartitionInfo = hostDiskPartitionInfo;
	}

	public com.vmware.vim.HostDiskPartitionInfo getHostDiskPartitionInfo(int i) {
		return this.hostDiskPartitionInfo[i];
	}

	public void setHostDiskPartitionInfo(int i,
			com.vmware.vim.HostDiskPartitionInfo _value) {
		this.hostDiskPartitionInfo[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfHostDiskPartitionInfo)) {
			return false;
		}
		ArrayOfHostDiskPartitionInfo other = (ArrayOfHostDiskPartitionInfo) obj;
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
		_equals = true && ((this.hostDiskPartitionInfo == null && other
				.getHostDiskPartitionInfo() == null) || (this.hostDiskPartitionInfo != null && java.util.Arrays
				.equals(this.hostDiskPartitionInfo, other
						.getHostDiskPartitionInfo())));
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
		if (getHostDiskPartitionInfo() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getHostDiskPartitionInfo()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getHostDiskPartitionInfo(), i);
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
			ArrayOfHostDiskPartitionInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ArrayOfHostDiskPartitionInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostDiskPartitionInfo");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"HostDiskPartitionInfo"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostDiskPartitionInfo"));
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
