/**
 * ArrayOfClusterDasAamNodeState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfClusterDasAamNodeState implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.ClusterDasAamNodeState[] clusterDasAamNodeState;

	public ArrayOfClusterDasAamNodeState() {
	}

	public ArrayOfClusterDasAamNodeState(
			com.vmware.vim25.ClusterDasAamNodeState[] clusterDasAamNodeState) {
		this.clusterDasAamNodeState = clusterDasAamNodeState;
	}

	/**
	 * Gets the clusterDasAamNodeState value for this
	 * ArrayOfClusterDasAamNodeState.
	 * 
	 * @return clusterDasAamNodeState
	 */
	public com.vmware.vim25.ClusterDasAamNodeState[] getClusterDasAamNodeState() {
		return clusterDasAamNodeState;
	}

	/**
	 * Sets the clusterDasAamNodeState value for this
	 * ArrayOfClusterDasAamNodeState.
	 * 
	 * @param clusterDasAamNodeState
	 */
	public void setClusterDasAamNodeState(
			com.vmware.vim25.ClusterDasAamNodeState[] clusterDasAamNodeState) {
		this.clusterDasAamNodeState = clusterDasAamNodeState;
	}

	public com.vmware.vim25.ClusterDasAamNodeState getClusterDasAamNodeState(
			int i) {
		return this.clusterDasAamNodeState[i];
	}

	public void setClusterDasAamNodeState(int i,
			com.vmware.vim25.ClusterDasAamNodeState _value) {
		this.clusterDasAamNodeState[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfClusterDasAamNodeState)) {
			return false;
		}
		ArrayOfClusterDasAamNodeState other = (ArrayOfClusterDasAamNodeState) obj;
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
		_equals = true && ((this.clusterDasAamNodeState == null && other
				.getClusterDasAamNodeState() == null) || (this.clusterDasAamNodeState != null && java.util.Arrays
				.equals(this.clusterDasAamNodeState, other
						.getClusterDasAamNodeState())));
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
		if (getClusterDasAamNodeState() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getClusterDasAamNodeState()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getClusterDasAamNodeState(), i);
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
			ArrayOfClusterDasAamNodeState.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfClusterDasAamNodeState"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("clusterDasAamNodeState");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"ClusterDasAamNodeState"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ClusterDasAamNodeState"));
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
