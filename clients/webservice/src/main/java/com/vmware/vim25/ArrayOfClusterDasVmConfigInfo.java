/**
 * ArrayOfClusterDasVmConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfClusterDasVmConfigInfo implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.ClusterDasVmConfigInfo[] clusterDasVmConfigInfo;

	public ArrayOfClusterDasVmConfigInfo() {
	}

	public ArrayOfClusterDasVmConfigInfo(
			com.vmware.vim25.ClusterDasVmConfigInfo[] clusterDasVmConfigInfo) {
		this.clusterDasVmConfigInfo = clusterDasVmConfigInfo;
	}

	/**
	 * Gets the clusterDasVmConfigInfo value for this
	 * ArrayOfClusterDasVmConfigInfo.
	 * 
	 * @return clusterDasVmConfigInfo
	 */
	public com.vmware.vim25.ClusterDasVmConfigInfo[] getClusterDasVmConfigInfo() {
		return clusterDasVmConfigInfo;
	}

	/**
	 * Sets the clusterDasVmConfigInfo value for this
	 * ArrayOfClusterDasVmConfigInfo.
	 * 
	 * @param clusterDasVmConfigInfo
	 */
	public void setClusterDasVmConfigInfo(
			com.vmware.vim25.ClusterDasVmConfigInfo[] clusterDasVmConfigInfo) {
		this.clusterDasVmConfigInfo = clusterDasVmConfigInfo;
	}

	public com.vmware.vim25.ClusterDasVmConfigInfo getClusterDasVmConfigInfo(
			int i) {
		return this.clusterDasVmConfigInfo[i];
	}

	public void setClusterDasVmConfigInfo(int i,
			com.vmware.vim25.ClusterDasVmConfigInfo _value) {
		this.clusterDasVmConfigInfo[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfClusterDasVmConfigInfo)) {
			return false;
		}
		ArrayOfClusterDasVmConfigInfo other = (ArrayOfClusterDasVmConfigInfo) obj;
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
		_equals = true && ((this.clusterDasVmConfigInfo == null && other
				.getClusterDasVmConfigInfo() == null) || (this.clusterDasVmConfigInfo != null && java.util.Arrays
				.equals(this.clusterDasVmConfigInfo, other
						.getClusterDasVmConfigInfo())));
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
		if (getClusterDasVmConfigInfo() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getClusterDasVmConfigInfo()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getClusterDasVmConfigInfo(), i);
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
			ArrayOfClusterDasVmConfigInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfClusterDasVmConfigInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("clusterDasVmConfigInfo");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"ClusterDasVmConfigInfo"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ClusterDasVmConfigInfo"));
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
