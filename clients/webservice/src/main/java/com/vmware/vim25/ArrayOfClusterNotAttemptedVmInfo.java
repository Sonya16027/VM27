/**
 * ArrayOfClusterNotAttemptedVmInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfClusterNotAttemptedVmInfo implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.ClusterNotAttemptedVmInfo[] clusterNotAttemptedVmInfo;

	public ArrayOfClusterNotAttemptedVmInfo() {
	}

	public ArrayOfClusterNotAttemptedVmInfo(
			com.vmware.vim25.ClusterNotAttemptedVmInfo[] clusterNotAttemptedVmInfo) {
		this.clusterNotAttemptedVmInfo = clusterNotAttemptedVmInfo;
	}

	/**
	 * Gets the clusterNotAttemptedVmInfo value for this
	 * ArrayOfClusterNotAttemptedVmInfo.
	 * 
	 * @return clusterNotAttemptedVmInfo
	 */
	public com.vmware.vim25.ClusterNotAttemptedVmInfo[] getClusterNotAttemptedVmInfo() {
		return clusterNotAttemptedVmInfo;
	}

	/**
	 * Sets the clusterNotAttemptedVmInfo value for this
	 * ArrayOfClusterNotAttemptedVmInfo.
	 * 
	 * @param clusterNotAttemptedVmInfo
	 */
	public void setClusterNotAttemptedVmInfo(
			com.vmware.vim25.ClusterNotAttemptedVmInfo[] clusterNotAttemptedVmInfo) {
		this.clusterNotAttemptedVmInfo = clusterNotAttemptedVmInfo;
	}

	public com.vmware.vim25.ClusterNotAttemptedVmInfo getClusterNotAttemptedVmInfo(
			int i) {
		return this.clusterNotAttemptedVmInfo[i];
	}

	public void setClusterNotAttemptedVmInfo(int i,
			com.vmware.vim25.ClusterNotAttemptedVmInfo _value) {
		this.clusterNotAttemptedVmInfo[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfClusterNotAttemptedVmInfo)) {
			return false;
		}
		ArrayOfClusterNotAttemptedVmInfo other = (ArrayOfClusterNotAttemptedVmInfo) obj;
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
		_equals = true && ((this.clusterNotAttemptedVmInfo == null && other
				.getClusterNotAttemptedVmInfo() == null) || (this.clusterNotAttemptedVmInfo != null && java.util.Arrays
				.equals(this.clusterNotAttemptedVmInfo, other
						.getClusterNotAttemptedVmInfo())));
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
		if (getClusterNotAttemptedVmInfo() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getClusterNotAttemptedVmInfo()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getClusterNotAttemptedVmInfo(), i);
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
			ArrayOfClusterNotAttemptedVmInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfClusterNotAttemptedVmInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("clusterNotAttemptedVmInfo");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"ClusterNotAttemptedVmInfo"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ClusterNotAttemptedVmInfo"));
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
