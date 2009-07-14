/**
 * ActionParameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ActionParameter implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private java.lang.String _value_;
	private static java.util.HashMap _table_ = new java.util.HashMap();

	// Constructor
	protected ActionParameter(java.lang.String value) {
		_value_ = value;
		_table_.put(_value_, this);
	}

	public static final java.lang.String _targetName = "targetName";
	public static final java.lang.String _alarmName = "alarmName";
	public static final java.lang.String _oldStatus = "oldStatus";
	public static final java.lang.String _newStatus = "newStatus";
	public static final java.lang.String _triggeringSummary = "triggeringSummary";
	public static final java.lang.String _declaringSummary = "declaringSummary";
	public static final java.lang.String _eventDescription = "eventDescription";
	public static final java.lang.String _target = "target";
	public static final java.lang.String _alarm = "alarm";
	public static final ActionParameter targetName = new ActionParameter(
			_targetName);
	public static final ActionParameter alarmName = new ActionParameter(
			_alarmName);
	public static final ActionParameter oldStatus = new ActionParameter(
			_oldStatus);
	public static final ActionParameter newStatus = new ActionParameter(
			_newStatus);
	public static final ActionParameter triggeringSummary = new ActionParameter(
			_triggeringSummary);
	public static final ActionParameter declaringSummary = new ActionParameter(
			_declaringSummary);
	public static final ActionParameter eventDescription = new ActionParameter(
			_eventDescription);
	public static final ActionParameter target = new ActionParameter(_target);
	public static final ActionParameter alarm = new ActionParameter(_alarm);

	public java.lang.String getValue() {
		return _value_;
	}

	public static ActionParameter fromValue(java.lang.String value)
			throws java.lang.IllegalArgumentException {
		ActionParameter enumeration = (ActionParameter) _table_.get(value);
		if (enumeration == null) {
			throw new java.lang.IllegalArgumentException();
		}
		return enumeration;
	}

	public static ActionParameter fromString(java.lang.String value)
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
			ActionParameter.class);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ActionParameter"));
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

}
