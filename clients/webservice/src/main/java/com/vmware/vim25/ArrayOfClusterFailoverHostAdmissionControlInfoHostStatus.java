/**
 * ArrayOfClusterFailoverHostAdmissionControlInfoHostStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfClusterFailoverHostAdmissionControlInfoHostStatus implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.ClusterFailoverHostAdmissionControlInfoHostStatus[] clusterFailoverHostAdmissionControlInfoHostStatus;

	public ArrayOfClusterFailoverHostAdmissionControlInfoHostStatus() {
	}

	public ArrayOfClusterFailoverHostAdmissionControlInfoHostStatus(
			com.vmware.vim25.ClusterFailoverHostAdmissionControlInfoHostStatus[] clusterFailoverHostAdmissionControlInfoHostStatus) {
		this.clusterFailoverHostAdmissionControlInfoHostStatus = clusterFailoverHostAdmissionControlInfoHostStatus;
	}

	/**
	 * Gets the clusterFailoverHostAdmissionControlInfoHostStatus value for this
	 * ArrayOfClusterFailoverHostAdmissionControlInfoHostStatus.
	 * 
	 * @return clusterFailoverHostAdmissionControlInfoHostStatus
	 */
	public com.vmware.vim25.ClusterFailoverHostAdmissionControlInfoHostStatus[] getClusterFailoverHostAdmissionControlInfoHostStatus() {
		return clusterFailoverHostAdmissionControlInfoHostStatus;
	}

	/**
	 * Sets the clusterFailoverHostAdmissionControlInfoHostStatus value for this
	 * ArrayOfClusterFailoverHostAdmissionControlInfoHostStatus.
	 * 
	 * @param clusterFailoverHostAdmissionControlInfoHostStatus
	 */
	public void setClusterFailoverHostAdmissionControlInfoHostStatus(
			com.vmware.vim25.ClusterFailoverHostAdmissionControlInfoHostStatus[] clusterFailoverHostAdmissionControlInfoHostStatus) {
		this.clusterFailoverHostAdmissionControlInfoHostStatus = clusterFailoverHostAdmissionControlInfoHostStatus;
	}

	public com.vmware.vim25.ClusterFailoverHostAdmissionControlInfoHostStatus getClusterFailoverHostAdmissionControlInfoHostStatus(
			int i) {
		return this.clusterFailoverHostAdmissionControlInfoHostStatus[i];
	}

	public void setClusterFailoverHostAdmissionControlInfoHostStatus(
			int i,
			com.vmware.vim25.ClusterFailoverHostAdmissionControlInfoHostStatus _value) {
		this.clusterFailoverHostAdmissionControlInfoHostStatus[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfClusterFailoverHostAdmissionControlInfoHostStatus)) {
			return false;
		}
		ArrayOfClusterFailoverHostAdmissionControlInfoHostStatus other = (ArrayOfClusterFailoverHostAdmissionControlInfoHostStatus) obj;
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
		_equals = true && ((this.clusterFailoverHostAdmissionControlInfoHostStatus == null && other
				.getClusterFailoverHostAdmissionControlInfoHostStatus() == null) || (this.clusterFailoverHostAdmissionControlInfoHostStatus != null && java.util.Arrays
				.equals(
						this.clusterFailoverHostAdmissionControlInfoHostStatus,
						other
								.getClusterFailoverHostAdmissionControlInfoHostStatus())));
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
		if (getClusterFailoverHostAdmissionControlInfoHostStatus() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getClusterFailoverHostAdmissionControlInfoHostStatus()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getClusterFailoverHostAdmissionControlInfoHostStatus(),
						i);
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
			ArrayOfClusterFailoverHostAdmissionControlInfoHostStatus.class,
			true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfClusterFailoverHostAdmissionControlInfoHostStatus"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField
				.setFieldName("clusterFailoverHostAdmissionControlInfoHostStatus");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"ClusterFailoverHostAdmissionControlInfoHostStatus"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ClusterFailoverHostAdmissionControlInfoHostStatus"));
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
