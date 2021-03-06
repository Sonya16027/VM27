/**
 * ArrayOfFileQuery.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfFileQuery implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.FileQuery[] fileQuery;

	public ArrayOfFileQuery() {
	}

	public ArrayOfFileQuery(com.vmware.vim25.FileQuery[] fileQuery) {
		this.fileQuery = fileQuery;
	}

	/**
	 * Gets the fileQuery value for this ArrayOfFileQuery.
	 * 
	 * @return fileQuery
	 */
	public com.vmware.vim25.FileQuery[] getFileQuery() {
		return fileQuery;
	}

	/**
	 * Sets the fileQuery value for this ArrayOfFileQuery.
	 * 
	 * @param fileQuery
	 */
	public void setFileQuery(com.vmware.vim25.FileQuery[] fileQuery) {
		this.fileQuery = fileQuery;
	}

	public com.vmware.vim25.FileQuery getFileQuery(int i) {
		return this.fileQuery[i];
	}

	public void setFileQuery(int i, com.vmware.vim25.FileQuery _value) {
		this.fileQuery[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfFileQuery)) {
			return false;
		}
		ArrayOfFileQuery other = (ArrayOfFileQuery) obj;
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
		_equals = true && ((this.fileQuery == null && other.getFileQuery() == null) || (this.fileQuery != null && java.util.Arrays
				.equals(this.fileQuery, other.getFileQuery())));
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
		if (getFileQuery() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getFileQuery()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getFileQuery(), i);
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
			ArrayOfFileQuery.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfFileQuery"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("fileQuery");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"FileQuery"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"FileQuery"));
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
