/**
 * ArrayOfExtension.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfExtension implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.Extension[] extension;

	public ArrayOfExtension() {
	}

	public ArrayOfExtension(com.vmware.vim25.Extension[] extension) {
		this.extension = extension;
	}

	/**
	 * Gets the extension value for this ArrayOfExtension.
	 * 
	 * @return extension
	 */
	public com.vmware.vim25.Extension[] getExtension() {
		return extension;
	}

	/**
	 * Sets the extension value for this ArrayOfExtension.
	 * 
	 * @param extension
	 */
	public void setExtension(com.vmware.vim25.Extension[] extension) {
		this.extension = extension;
	}

	public com.vmware.vim25.Extension getExtension(int i) {
		return this.extension[i];
	}

	public void setExtension(int i, com.vmware.vim25.Extension _value) {
		this.extension[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfExtension)) {
			return false;
		}
		ArrayOfExtension other = (ArrayOfExtension) obj;
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
		_equals = true && ((this.extension == null && other.getExtension() == null) || (this.extension != null && java.util.Arrays
				.equals(this.extension, other.getExtension())));
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
		if (getExtension() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getExtension()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getExtension(), i);
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
			ArrayOfExtension.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfExtension"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("extension");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"Extension"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"Extension"));
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
