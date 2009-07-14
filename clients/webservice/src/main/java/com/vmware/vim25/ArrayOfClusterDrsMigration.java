/**
 * ArrayOfClusterDrsMigration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfClusterDrsMigration implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.ClusterDrsMigration[] clusterDrsMigration;

	public ArrayOfClusterDrsMigration() {
	}

	public ArrayOfClusterDrsMigration(
			com.vmware.vim25.ClusterDrsMigration[] clusterDrsMigration) {
		this.clusterDrsMigration = clusterDrsMigration;
	}

	/**
	 * Gets the clusterDrsMigration value for this ArrayOfClusterDrsMigration.
	 * 
	 * @return clusterDrsMigration
	 */
	public com.vmware.vim25.ClusterDrsMigration[] getClusterDrsMigration() {
		return clusterDrsMigration;
	}

	/**
	 * Sets the clusterDrsMigration value for this ArrayOfClusterDrsMigration.
	 * 
	 * @param clusterDrsMigration
	 */
	public void setClusterDrsMigration(
			com.vmware.vim25.ClusterDrsMigration[] clusterDrsMigration) {
		this.clusterDrsMigration = clusterDrsMigration;
	}

	public com.vmware.vim25.ClusterDrsMigration getClusterDrsMigration(int i) {
		return this.clusterDrsMigration[i];
	}

	public void setClusterDrsMigration(int i,
			com.vmware.vim25.ClusterDrsMigration _value) {
		this.clusterDrsMigration[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfClusterDrsMigration)) {
			return false;
		}
		ArrayOfClusterDrsMigration other = (ArrayOfClusterDrsMigration) obj;
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
		_equals = true && ((this.clusterDrsMigration == null && other
				.getClusterDrsMigration() == null) || (this.clusterDrsMigration != null && java.util.Arrays
				.equals(this.clusterDrsMigration, other
						.getClusterDrsMigration())));
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
		if (getClusterDrsMigration() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getClusterDrsMigration()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getClusterDrsMigration(), i);
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
			ArrayOfClusterDrsMigration.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfClusterDrsMigration"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("clusterDrsMigration");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"ClusterDrsMigration"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ClusterDrsMigration"));
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
