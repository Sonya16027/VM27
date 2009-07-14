/**
 * ArrayOfDVPortgroupConfigSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfDVPortgroupConfigSpec implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.DVPortgroupConfigSpec[] DVPortgroupConfigSpec;

	public ArrayOfDVPortgroupConfigSpec() {
	}

	public ArrayOfDVPortgroupConfigSpec(
			com.vmware.vim25.DVPortgroupConfigSpec[] DVPortgroupConfigSpec) {
		this.DVPortgroupConfigSpec = DVPortgroupConfigSpec;
	}

	/**
	 * Gets the DVPortgroupConfigSpec value for this
	 * ArrayOfDVPortgroupConfigSpec.
	 * 
	 * @return DVPortgroupConfigSpec
	 */
	public com.vmware.vim25.DVPortgroupConfigSpec[] getDVPortgroupConfigSpec() {
		return DVPortgroupConfigSpec;
	}

	/**
	 * Sets the DVPortgroupConfigSpec value for this
	 * ArrayOfDVPortgroupConfigSpec.
	 * 
	 * @param DVPortgroupConfigSpec
	 */
	public void setDVPortgroupConfigSpec(
			com.vmware.vim25.DVPortgroupConfigSpec[] DVPortgroupConfigSpec) {
		this.DVPortgroupConfigSpec = DVPortgroupConfigSpec;
	}

	public com.vmware.vim25.DVPortgroupConfigSpec getDVPortgroupConfigSpec(int i) {
		return this.DVPortgroupConfigSpec[i];
	}

	public void setDVPortgroupConfigSpec(int i,
			com.vmware.vim25.DVPortgroupConfigSpec _value) {
		this.DVPortgroupConfigSpec[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfDVPortgroupConfigSpec)) {
			return false;
		}
		ArrayOfDVPortgroupConfigSpec other = (ArrayOfDVPortgroupConfigSpec) obj;
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
		_equals = true && ((this.DVPortgroupConfigSpec == null && other
				.getDVPortgroupConfigSpec() == null) || (this.DVPortgroupConfigSpec != null && java.util.Arrays
				.equals(this.DVPortgroupConfigSpec, other
						.getDVPortgroupConfigSpec())));
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
		if (getDVPortgroupConfigSpec() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getDVPortgroupConfigSpec()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getDVPortgroupConfigSpec(), i);
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
			ArrayOfDVPortgroupConfigSpec.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfDVPortgroupConfigSpec"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("DVPortgroupConfigSpec");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"DVPortgroupConfigSpec"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DVPortgroupConfigSpec"));
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
