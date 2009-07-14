/**
 * ArrayOfClusterDpmHostConfigSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfClusterDpmHostConfigSpec implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.ClusterDpmHostConfigSpec[] clusterDpmHostConfigSpec;

	public ArrayOfClusterDpmHostConfigSpec() {
	}

	public ArrayOfClusterDpmHostConfigSpec(
			com.vmware.vim25.ClusterDpmHostConfigSpec[] clusterDpmHostConfigSpec) {
		this.clusterDpmHostConfigSpec = clusterDpmHostConfigSpec;
	}

	/**
	 * Gets the clusterDpmHostConfigSpec value for this
	 * ArrayOfClusterDpmHostConfigSpec.
	 * 
	 * @return clusterDpmHostConfigSpec
	 */
	public com.vmware.vim25.ClusterDpmHostConfigSpec[] getClusterDpmHostConfigSpec() {
		return clusterDpmHostConfigSpec;
	}

	/**
	 * Sets the clusterDpmHostConfigSpec value for this
	 * ArrayOfClusterDpmHostConfigSpec.
	 * 
	 * @param clusterDpmHostConfigSpec
	 */
	public void setClusterDpmHostConfigSpec(
			com.vmware.vim25.ClusterDpmHostConfigSpec[] clusterDpmHostConfigSpec) {
		this.clusterDpmHostConfigSpec = clusterDpmHostConfigSpec;
	}

	public com.vmware.vim25.ClusterDpmHostConfigSpec getClusterDpmHostConfigSpec(
			int i) {
		return this.clusterDpmHostConfigSpec[i];
	}

	public void setClusterDpmHostConfigSpec(int i,
			com.vmware.vim25.ClusterDpmHostConfigSpec _value) {
		this.clusterDpmHostConfigSpec[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfClusterDpmHostConfigSpec)) {
			return false;
		}
		ArrayOfClusterDpmHostConfigSpec other = (ArrayOfClusterDpmHostConfigSpec) obj;
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
		_equals = true && ((this.clusterDpmHostConfigSpec == null && other
				.getClusterDpmHostConfigSpec() == null) || (this.clusterDpmHostConfigSpec != null && java.util.Arrays
				.equals(this.clusterDpmHostConfigSpec, other
						.getClusterDpmHostConfigSpec())));
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
		if (getClusterDpmHostConfigSpec() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getClusterDpmHostConfigSpec()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getClusterDpmHostConfigSpec(), i);
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
			ArrayOfClusterDpmHostConfigSpec.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfClusterDpmHostConfigSpec"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("clusterDpmHostConfigSpec");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"ClusterDpmHostConfigSpec"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ClusterDpmHostConfigSpec"));
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
