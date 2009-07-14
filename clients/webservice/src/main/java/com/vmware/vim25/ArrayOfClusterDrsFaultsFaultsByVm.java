/**
 * ArrayOfClusterDrsFaultsFaultsByVm.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfClusterDrsFaultsFaultsByVm implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.ClusterDrsFaultsFaultsByVm[] clusterDrsFaultsFaultsByVm;

	public ArrayOfClusterDrsFaultsFaultsByVm() {
	}

	public ArrayOfClusterDrsFaultsFaultsByVm(
			com.vmware.vim25.ClusterDrsFaultsFaultsByVm[] clusterDrsFaultsFaultsByVm) {
		this.clusterDrsFaultsFaultsByVm = clusterDrsFaultsFaultsByVm;
	}

	/**
	 * Gets the clusterDrsFaultsFaultsByVm value for this
	 * ArrayOfClusterDrsFaultsFaultsByVm.
	 * 
	 * @return clusterDrsFaultsFaultsByVm
	 */
	public com.vmware.vim25.ClusterDrsFaultsFaultsByVm[] getClusterDrsFaultsFaultsByVm() {
		return clusterDrsFaultsFaultsByVm;
	}

	/**
	 * Sets the clusterDrsFaultsFaultsByVm value for this
	 * ArrayOfClusterDrsFaultsFaultsByVm.
	 * 
	 * @param clusterDrsFaultsFaultsByVm
	 */
	public void setClusterDrsFaultsFaultsByVm(
			com.vmware.vim25.ClusterDrsFaultsFaultsByVm[] clusterDrsFaultsFaultsByVm) {
		this.clusterDrsFaultsFaultsByVm = clusterDrsFaultsFaultsByVm;
	}

	public com.vmware.vim25.ClusterDrsFaultsFaultsByVm getClusterDrsFaultsFaultsByVm(
			int i) {
		return this.clusterDrsFaultsFaultsByVm[i];
	}

	public void setClusterDrsFaultsFaultsByVm(int i,
			com.vmware.vim25.ClusterDrsFaultsFaultsByVm _value) {
		this.clusterDrsFaultsFaultsByVm[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfClusterDrsFaultsFaultsByVm)) {
			return false;
		}
		ArrayOfClusterDrsFaultsFaultsByVm other = (ArrayOfClusterDrsFaultsFaultsByVm) obj;
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
		_equals = true && ((this.clusterDrsFaultsFaultsByVm == null && other
				.getClusterDrsFaultsFaultsByVm() == null) || (this.clusterDrsFaultsFaultsByVm != null && java.util.Arrays
				.equals(this.clusterDrsFaultsFaultsByVm, other
						.getClusterDrsFaultsFaultsByVm())));
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
		if (getClusterDrsFaultsFaultsByVm() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getClusterDrsFaultsFaultsByVm()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getClusterDrsFaultsFaultsByVm(), i);
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
			ArrayOfClusterDrsFaultsFaultsByVm.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfClusterDrsFaultsFaultsByVm"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("clusterDrsFaultsFaultsByVm");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"ClusterDrsFaultsFaultsByVm"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ClusterDrsFaultsFaultsByVm"));
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
