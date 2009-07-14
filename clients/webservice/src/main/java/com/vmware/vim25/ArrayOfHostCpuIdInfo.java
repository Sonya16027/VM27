/**
 * ArrayOfHostCpuIdInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfHostCpuIdInfo implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.HostCpuIdInfo[] hostCpuIdInfo;

	public ArrayOfHostCpuIdInfo() {
	}

	public ArrayOfHostCpuIdInfo(com.vmware.vim25.HostCpuIdInfo[] hostCpuIdInfo) {
		this.hostCpuIdInfo = hostCpuIdInfo;
	}

	/**
	 * Gets the hostCpuIdInfo value for this ArrayOfHostCpuIdInfo.
	 * 
	 * @return hostCpuIdInfo
	 */
	public com.vmware.vim25.HostCpuIdInfo[] getHostCpuIdInfo() {
		return hostCpuIdInfo;
	}

	/**
	 * Sets the hostCpuIdInfo value for this ArrayOfHostCpuIdInfo.
	 * 
	 * @param hostCpuIdInfo
	 */
	public void setHostCpuIdInfo(com.vmware.vim25.HostCpuIdInfo[] hostCpuIdInfo) {
		this.hostCpuIdInfo = hostCpuIdInfo;
	}

	public com.vmware.vim25.HostCpuIdInfo getHostCpuIdInfo(int i) {
		return this.hostCpuIdInfo[i];
	}

	public void setHostCpuIdInfo(int i, com.vmware.vim25.HostCpuIdInfo _value) {
		this.hostCpuIdInfo[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfHostCpuIdInfo)) {
			return false;
		}
		ArrayOfHostCpuIdInfo other = (ArrayOfHostCpuIdInfo) obj;
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
		_equals = true && ((this.hostCpuIdInfo == null && other
				.getHostCpuIdInfo() == null) || (this.hostCpuIdInfo != null && java.util.Arrays
				.equals(this.hostCpuIdInfo, other.getHostCpuIdInfo())));
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
		if (getHostCpuIdInfo() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getHostCpuIdInfo()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getHostCpuIdInfo(), i);
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
			ArrayOfHostCpuIdInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfHostCpuIdInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostCpuIdInfo");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"HostCpuIdInfo"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostCpuIdInfo"));
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
