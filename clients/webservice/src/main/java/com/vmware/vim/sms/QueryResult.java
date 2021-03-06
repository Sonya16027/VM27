/**
 * QueryResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim.sms;

public class QueryResult extends com.vmware.vim.sms.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.sms.RowData[] row;

	private com.vmware.vim.sms.Metadata metadata;

	public QueryResult() {
	}

	public QueryResult(java.lang.String dynamicType,
			com.vmware.vim.sms.DynamicProperty[] dynamicProperty,
			com.vmware.vim.sms.RowData[] row,
			com.vmware.vim.sms.Metadata metadata) {
		super(dynamicType, dynamicProperty);
		this.row = row;
		this.metadata = metadata;
	}

	/**
	 * Gets the row value for this QueryResult.
	 * 
	 * @return row
	 */
	public com.vmware.vim.sms.RowData[] getRow() {
		return row;
	}

	/**
	 * Sets the row value for this QueryResult.
	 * 
	 * @param row
	 */
	public void setRow(com.vmware.vim.sms.RowData[] row) {
		this.row = row;
	}

	public com.vmware.vim.sms.RowData getRow(int i) {
		return this.row[i];
	}

	public void setRow(int i, com.vmware.vim.sms.RowData _value) {
		this.row[i] = _value;
	}

	/**
	 * Gets the metadata value for this QueryResult.
	 * 
	 * @return metadata
	 */
	public com.vmware.vim.sms.Metadata getMetadata() {
		return metadata;
	}

	/**
	 * Sets the metadata value for this QueryResult.
	 * 
	 * @param metadata
	 */
	public void setMetadata(com.vmware.vim.sms.Metadata metadata) {
		this.metadata = metadata;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof QueryResult)) {
			return false;
		}
		QueryResult other = (QueryResult) obj;
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
		_equals = super.equals(obj)
				&& ((this.row == null && other.getRow() == null) || (this.row != null && java.util.Arrays
						.equals(this.row, other.getRow())))
				&& ((this.metadata == null && other.getMetadata() == null) || (this.metadata != null && this.metadata
						.equals(other.getMetadata())));
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
		int _hashCode = super.hashCode();
		if (getRow() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getRow()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getRow(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getMetadata() != null) {
			_hashCode += getMetadata().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			QueryResult.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sm1",
				"QueryResult"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("row");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1", "row"));
		elemField
				.setXmlType(new javax.xml.namespace.QName("urn:sm1", "RowData"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("metadata");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1",
				"metadata"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:sm1",
				"Metadata"));
		elemField.setNillable(false);
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
