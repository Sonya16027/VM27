/**
 * RowData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim.sms;

public class RowData extends com.vmware.vim.sms.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private java.lang.String[] column;

	public RowData() {
	}

	public RowData(java.lang.String dynamicType,
			com.vmware.vim.sms.DynamicProperty[] dynamicProperty,
			java.lang.String[] column) {
		super(dynamicType, dynamicProperty);
		this.column = column;
	}

	/**
	 * Gets the column value for this RowData.
	 * 
	 * @return column
	 */
	public java.lang.String[] getColumn() {
		return column;
	}

	/**
	 * Sets the column value for this RowData.
	 * 
	 * @param column
	 */
	public void setColumn(java.lang.String[] column) {
		this.column = column;
	}

	public java.lang.String getColumn(int i) {
		return this.column[i];
	}

	public void setColumn(int i, java.lang.String _value) {
		this.column[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof RowData)) {
			return false;
		}
		RowData other = (RowData) obj;
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
				&& ((this.column == null && other.getColumn() == null) || (this.column != null && java.util.Arrays
						.equals(this.column, other.getColumn())));
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
		if (getColumn() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getColumn()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getColumn(),
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
			RowData.class, true);

	static {
		typeDesc
				.setXmlType(new javax.xml.namespace.QName("urn:sm1", "RowData"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("column");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:sm1", "column"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
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
