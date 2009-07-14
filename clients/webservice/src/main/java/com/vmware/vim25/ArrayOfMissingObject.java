/**
 * ArrayOfMissingObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfMissingObject implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.MissingObject[] missingObject;

	public ArrayOfMissingObject() {
	}

	public ArrayOfMissingObject(com.vmware.vim25.MissingObject[] missingObject) {
		this.missingObject = missingObject;
	}

	/**
	 * Gets the missingObject value for this ArrayOfMissingObject.
	 * 
	 * @return missingObject
	 */
	public com.vmware.vim25.MissingObject[] getMissingObject() {
		return missingObject;
	}

	/**
	 * Sets the missingObject value for this ArrayOfMissingObject.
	 * 
	 * @param missingObject
	 */
	public void setMissingObject(com.vmware.vim25.MissingObject[] missingObject) {
		this.missingObject = missingObject;
	}

	public com.vmware.vim25.MissingObject getMissingObject(int i) {
		return this.missingObject[i];
	}

	public void setMissingObject(int i, com.vmware.vim25.MissingObject _value) {
		this.missingObject[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfMissingObject)) {
			return false;
		}
		ArrayOfMissingObject other = (ArrayOfMissingObject) obj;
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
		_equals = true && ((this.missingObject == null && other
				.getMissingObject() == null) || (this.missingObject != null && java.util.Arrays
				.equals(this.missingObject, other.getMissingObject())));
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
		if (getMissingObject() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getMissingObject()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getMissingObject(), i);
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
			ArrayOfMissingObject.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfMissingObject"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("missingObject");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"MissingObject"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"MissingObject"));
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
