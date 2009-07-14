/**
 * FilterSpecComparisonOperator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim.sms;

public class FilterSpecComparisonOperator implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private java.lang.String _value_;
	private static java.util.HashMap _table_ = new java.util.HashMap();

	// Constructor
	protected FilterSpecComparisonOperator(java.lang.String value) {
		_value_ = value;
		_table_.put(_value_, this);
	}

	public static final java.lang.String _equal = "equal";
	public static final java.lang.String _notEqual = "notEqual";
	public static final java.lang.String _greaterThanOrEqual = "greaterThanOrEqual";
	public static final java.lang.String _lessThanOrEqual = "lessThanOrEqual";
	public static final java.lang.String _contains = "contains";
	public static final java.lang.String _notContains = "notContains";
	public static final java.lang.String _beginsWith = "beginsWith";
	public static final java.lang.String _endsWith = "endsWith";
	public static final FilterSpecComparisonOperator equal = new FilterSpecComparisonOperator(
			_equal);
	public static final FilterSpecComparisonOperator notEqual = new FilterSpecComparisonOperator(
			_notEqual);
	public static final FilterSpecComparisonOperator greaterThanOrEqual = new FilterSpecComparisonOperator(
			_greaterThanOrEqual);
	public static final FilterSpecComparisonOperator lessThanOrEqual = new FilterSpecComparisonOperator(
			_lessThanOrEqual);
	public static final FilterSpecComparisonOperator contains = new FilterSpecComparisonOperator(
			_contains);
	public static final FilterSpecComparisonOperator notContains = new FilterSpecComparisonOperator(
			_notContains);
	public static final FilterSpecComparisonOperator beginsWith = new FilterSpecComparisonOperator(
			_beginsWith);
	public static final FilterSpecComparisonOperator endsWith = new FilterSpecComparisonOperator(
			_endsWith);

	public java.lang.String getValue() {
		return _value_;
	}

	public static FilterSpecComparisonOperator fromValue(java.lang.String value)
			throws java.lang.IllegalArgumentException {
		FilterSpecComparisonOperator enumeration = (FilterSpecComparisonOperator) _table_
				.get(value);
		if (enumeration == null) {
			throw new java.lang.IllegalArgumentException();
		}
		return enumeration;
	}

	public static FilterSpecComparisonOperator fromString(java.lang.String value)
			throws java.lang.IllegalArgumentException {
		return fromValue(value);
	}

	@Override
	public boolean equals(java.lang.Object obj) {
		return (obj == this);
	}

	@Override
	public int hashCode() {
		return toString().hashCode();
	}

	@Override
	public java.lang.String toString() {
		return _value_;
	}

	public java.lang.Object readResolve() throws java.io.ObjectStreamException {
		return fromValue(_value_);
	}

	public static org.apache.axis.encoding.Serializer getSerializer(
			java.lang.String mechType, java.lang.Class _javaType,
			javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.EnumSerializer(_javaType,
				_xmlType);
	}

	public static org.apache.axis.encoding.Deserializer getDeserializer(
			java.lang.String mechType, java.lang.Class _javaType,
			javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.EnumDeserializer(_javaType,
				_xmlType);
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			FilterSpecComparisonOperator.class);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sm1",
				"FilterSpecComparisonOperator"));
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

}
