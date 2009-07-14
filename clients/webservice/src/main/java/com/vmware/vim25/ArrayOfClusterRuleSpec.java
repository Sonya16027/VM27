/**
 * ArrayOfClusterRuleSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfClusterRuleSpec implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.ClusterRuleSpec[] clusterRuleSpec;

	public ArrayOfClusterRuleSpec() {
	}

	public ArrayOfClusterRuleSpec(
			com.vmware.vim25.ClusterRuleSpec[] clusterRuleSpec) {
		this.clusterRuleSpec = clusterRuleSpec;
	}

	/**
	 * Gets the clusterRuleSpec value for this ArrayOfClusterRuleSpec.
	 * 
	 * @return clusterRuleSpec
	 */
	public com.vmware.vim25.ClusterRuleSpec[] getClusterRuleSpec() {
		return clusterRuleSpec;
	}

	/**
	 * Sets the clusterRuleSpec value for this ArrayOfClusterRuleSpec.
	 * 
	 * @param clusterRuleSpec
	 */
	public void setClusterRuleSpec(
			com.vmware.vim25.ClusterRuleSpec[] clusterRuleSpec) {
		this.clusterRuleSpec = clusterRuleSpec;
	}

	public com.vmware.vim25.ClusterRuleSpec getClusterRuleSpec(int i) {
		return this.clusterRuleSpec[i];
	}

	public void setClusterRuleSpec(int i,
			com.vmware.vim25.ClusterRuleSpec _value) {
		this.clusterRuleSpec[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfClusterRuleSpec)) {
			return false;
		}
		ArrayOfClusterRuleSpec other = (ArrayOfClusterRuleSpec) obj;
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
		_equals = true && ((this.clusterRuleSpec == null && other
				.getClusterRuleSpec() == null) || (this.clusterRuleSpec != null && java.util.Arrays
				.equals(this.clusterRuleSpec, other.getClusterRuleSpec())));
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
		if (getClusterRuleSpec() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getClusterRuleSpec()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getClusterRuleSpec(), i);
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
			ArrayOfClusterRuleSpec.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfClusterRuleSpec"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("clusterRuleSpec");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"ClusterRuleSpec"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ClusterRuleSpec"));
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
