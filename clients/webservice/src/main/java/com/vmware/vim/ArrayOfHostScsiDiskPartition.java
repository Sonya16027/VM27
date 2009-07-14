/**
 * ArrayOfHostScsiDiskPartition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ArrayOfHostScsiDiskPartition implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim.HostScsiDiskPartition[] hostScsiDiskPartition;

	public ArrayOfHostScsiDiskPartition() {
	}

	public ArrayOfHostScsiDiskPartition(
			com.vmware.vim.HostScsiDiskPartition[] hostScsiDiskPartition) {
		this.hostScsiDiskPartition = hostScsiDiskPartition;
	}

	/**
	 * Gets the hostScsiDiskPartition value for this
	 * ArrayOfHostScsiDiskPartition.
	 * 
	 * @return hostScsiDiskPartition
	 */
	public com.vmware.vim.HostScsiDiskPartition[] getHostScsiDiskPartition() {
		return hostScsiDiskPartition;
	}

	/**
	 * Sets the hostScsiDiskPartition value for this
	 * ArrayOfHostScsiDiskPartition.
	 * 
	 * @param hostScsiDiskPartition
	 */
	public void setHostScsiDiskPartition(
			com.vmware.vim.HostScsiDiskPartition[] hostScsiDiskPartition) {
		this.hostScsiDiskPartition = hostScsiDiskPartition;
	}

	public com.vmware.vim.HostScsiDiskPartition getHostScsiDiskPartition(int i) {
		return this.hostScsiDiskPartition[i];
	}

	public void setHostScsiDiskPartition(int i,
			com.vmware.vim.HostScsiDiskPartition _value) {
		this.hostScsiDiskPartition[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfHostScsiDiskPartition)) {
			return false;
		}
		ArrayOfHostScsiDiskPartition other = (ArrayOfHostScsiDiskPartition) obj;
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
		_equals = true && ((this.hostScsiDiskPartition == null && other
				.getHostScsiDiskPartition() == null) || (this.hostScsiDiskPartition != null && java.util.Arrays
				.equals(this.hostScsiDiskPartition, other
						.getHostScsiDiskPartition())));
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
		if (getHostScsiDiskPartition() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getHostScsiDiskPartition()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getHostScsiDiskPartition(), i);
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
			ArrayOfHostScsiDiskPartition.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ArrayOfHostScsiDiskPartition"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostScsiDiskPartition");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"HostScsiDiskPartition"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostScsiDiskPartition"));
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
