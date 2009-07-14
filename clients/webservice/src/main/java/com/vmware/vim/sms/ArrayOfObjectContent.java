/**
 * ArrayOfObjectContent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim.sms;

public class ArrayOfObjectContent implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim.sms.ObjectContent[] objectContent;

	public ArrayOfObjectContent() {
	}

	public ArrayOfObjectContent(com.vmware.vim.sms.ObjectContent[] objectContent) {
		this.objectContent = objectContent;
	}

	/**
	 * Gets the objectContent value for this ArrayOfObjectContent.
	 * 
	 * @return objectContent
	 */
	public com.vmware.vim.sms.ObjectContent[] getObjectContent() {
		return objectContent;
	}

	/**
	 * Sets the objectContent value for this ArrayOfObjectContent.
	 * 
	 * @param objectContent
	 */
	public void setObjectContent(
			com.vmware.vim.sms.ObjectContent[] objectContent) {
		this.objectContent = objectContent;
	}

	public com.vmware.vim.sms.ObjectContent getObjectContent(int i) {
		return this.objectContent[i];
	}

	public void setObjectContent(int i, com.vmware.vim.sms.ObjectContent _value) {
		this.objectContent[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfObjectContent)) {
			return false;
		}
		ArrayOfObjectContent other = (ArrayOfObjectContent) obj;
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
		_equals = true && ((this.objectContent == null && other
				.getObjectContent() == null) || (this.objectContent != null && java.util.Arrays
				.equals(this.objectContent, other.getObjectContent())));
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
		if (getObjectContent() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getObjectContent()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getObjectContent(), i);
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
			ArrayOfObjectContent.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sm1",
				"ArrayOfObjectContent"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("objectContent");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1",
				"ObjectContent"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:sm1",
				"ObjectContent"));
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
