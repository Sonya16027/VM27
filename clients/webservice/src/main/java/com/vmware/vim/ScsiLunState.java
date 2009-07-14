/**
 * ScsiLunState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ScsiLunState implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private java.lang.String _value_;
	private static java.util.HashMap _table_ = new java.util.HashMap();

	// Constructor
	protected ScsiLunState(java.lang.String value) {
		_value_ = value;
		_table_.put(_value_, this);
	}

	public static final java.lang.String _unknownState = "unknownState";
	public static final java.lang.String _ok = "ok";
	public static final java.lang.String _error = "error";
	public static final java.lang.String _degraded = "degraded";
	public static final java.lang.String _lostCommunication = "lostCommunication";
	public static final ScsiLunState unknownState = new ScsiLunState(
			_unknownState);
	public static final ScsiLunState ok = new ScsiLunState(_ok);
	public static final ScsiLunState error = new ScsiLunState(_error);
	public static final ScsiLunState degraded = new ScsiLunState(_degraded);
	public static final ScsiLunState lostCommunication = new ScsiLunState(
			_lostCommunication);

	public java.lang.String getValue() {
		return _value_;
	}

	public static ScsiLunState fromValue(java.lang.String value)
			throws java.lang.IllegalArgumentException {
		ScsiLunState enumeration = (ScsiLunState) _table_.get(value);
		if (enumeration == null) {
			throw new java.lang.IllegalArgumentException();
		}
		return enumeration;
	}

	public static ScsiLunState fromString(java.lang.String value)
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
			ScsiLunState.class);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ScsiLunState"));
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

}
