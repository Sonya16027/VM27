/**
 * ArrayOfClusterDasVmConfigSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ArrayOfClusterDasVmConfigSpec implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim.ClusterDasVmConfigSpec[] clusterDasVmConfigSpec;

	public ArrayOfClusterDasVmConfigSpec() {
	}

	public ArrayOfClusterDasVmConfigSpec(
			com.vmware.vim.ClusterDasVmConfigSpec[] clusterDasVmConfigSpec) {
		this.clusterDasVmConfigSpec = clusterDasVmConfigSpec;
	}

	/**
	 * Gets the clusterDasVmConfigSpec value for this
	 * ArrayOfClusterDasVmConfigSpec.
	 * 
	 * @return clusterDasVmConfigSpec
	 */
	public com.vmware.vim.ClusterDasVmConfigSpec[] getClusterDasVmConfigSpec() {
		return clusterDasVmConfigSpec;
	}

	/**
	 * Sets the clusterDasVmConfigSpec value for this
	 * ArrayOfClusterDasVmConfigSpec.
	 * 
	 * @param clusterDasVmConfigSpec
	 */
	public void setClusterDasVmConfigSpec(
			com.vmware.vim.ClusterDasVmConfigSpec[] clusterDasVmConfigSpec) {
		this.clusterDasVmConfigSpec = clusterDasVmConfigSpec;
	}

	public com.vmware.vim.ClusterDasVmConfigSpec getClusterDasVmConfigSpec(int i) {
		return this.clusterDasVmConfigSpec[i];
	}

	public void setClusterDasVmConfigSpec(int i,
			com.vmware.vim.ClusterDasVmConfigSpec _value) {
		this.clusterDasVmConfigSpec[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfClusterDasVmConfigSpec)) {
			return false;
		}
		ArrayOfClusterDasVmConfigSpec other = (ArrayOfClusterDasVmConfigSpec) obj;
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
		_equals = true && ((this.clusterDasVmConfigSpec == null && other
				.getClusterDasVmConfigSpec() == null) || (this.clusterDasVmConfigSpec != null && java.util.Arrays
				.equals(this.clusterDasVmConfigSpec, other
						.getClusterDasVmConfigSpec())));
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
		if (getClusterDasVmConfigSpec() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getClusterDasVmConfigSpec()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getClusterDasVmConfigSpec(), i);
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
			ArrayOfClusterDasVmConfigSpec.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ArrayOfClusterDasVmConfigSpec"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("clusterDasVmConfigSpec");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"ClusterDasVmConfigSpec"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ClusterDasVmConfigSpec"));
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
