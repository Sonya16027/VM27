/**
 * ArrayOfRowData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim.sms;

public class ArrayOfRowData implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim.sms.RowData[] rowData;

	public ArrayOfRowData() {
	}

	public ArrayOfRowData(com.vmware.vim.sms.RowData[] rowData) {
		this.rowData = rowData;
	}

	/**
	 * Gets the rowData value for this ArrayOfRowData.
	 * 
	 * @return rowData
	 */
	public com.vmware.vim.sms.RowData[] getRowData() {
		return rowData;
	}

	/**
	 * Sets the rowData value for this ArrayOfRowData.
	 * 
	 * @param rowData
	 */
	public void setRowData(com.vmware.vim.sms.RowData[] rowData) {
		this.rowData = rowData;
	}

	public com.vmware.vim.sms.RowData getRowData(int i) {
		return this.rowData[i];
	}

	public void setRowData(int i, com.vmware.vim.sms.RowData _value) {
		this.rowData[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfRowData)) {
			return false;
		}
		ArrayOfRowData other = (ArrayOfRowData) obj;
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
		_equals = true && ((this.rowData == null && other.getRowData() == null) || (this.rowData != null && java.util.Arrays
				.equals(this.rowData, other.getRowData())));
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
		if (getRowData() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getRowData()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getRowData(), i);
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
			ArrayOfRowData.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sm1",
				"ArrayOfRowData"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("rowData");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:sm1", "RowData"));
		elemField
				.setXmlType(new javax.xml.namespace.QName("urn:sm1", "RowData"));
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
