/**
 * ArrayOfDatacenterMismatchArgument.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfDatacenterMismatchArgument implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.DatacenterMismatchArgument[] datacenterMismatchArgument;

	public ArrayOfDatacenterMismatchArgument() {
	}

	public ArrayOfDatacenterMismatchArgument(
			com.vmware.vim25.DatacenterMismatchArgument[] datacenterMismatchArgument) {
		this.datacenterMismatchArgument = datacenterMismatchArgument;
	}

	/**
	 * Gets the datacenterMismatchArgument value for this
	 * ArrayOfDatacenterMismatchArgument.
	 * 
	 * @return datacenterMismatchArgument
	 */
	public com.vmware.vim25.DatacenterMismatchArgument[] getDatacenterMismatchArgument() {
		return datacenterMismatchArgument;
	}

	/**
	 * Sets the datacenterMismatchArgument value for this
	 * ArrayOfDatacenterMismatchArgument.
	 * 
	 * @param datacenterMismatchArgument
	 */
	public void setDatacenterMismatchArgument(
			com.vmware.vim25.DatacenterMismatchArgument[] datacenterMismatchArgument) {
		this.datacenterMismatchArgument = datacenterMismatchArgument;
	}

	public com.vmware.vim25.DatacenterMismatchArgument getDatacenterMismatchArgument(
			int i) {
		return this.datacenterMismatchArgument[i];
	}

	public void setDatacenterMismatchArgument(int i,
			com.vmware.vim25.DatacenterMismatchArgument _value) {
		this.datacenterMismatchArgument[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfDatacenterMismatchArgument)) {
			return false;
		}
		ArrayOfDatacenterMismatchArgument other = (ArrayOfDatacenterMismatchArgument) obj;
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
		_equals = true && ((this.datacenterMismatchArgument == null && other
				.getDatacenterMismatchArgument() == null) || (this.datacenterMismatchArgument != null && java.util.Arrays
				.equals(this.datacenterMismatchArgument, other
						.getDatacenterMismatchArgument())));
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
		if (getDatacenterMismatchArgument() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getDatacenterMismatchArgument()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getDatacenterMismatchArgument(), i);
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
			ArrayOfDatacenterMismatchArgument.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfDatacenterMismatchArgument"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("datacenterMismatchArgument");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"DatacenterMismatchArgument"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DatacenterMismatchArgument"));
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
