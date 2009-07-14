/**
 * HostDasErrorEventHostDasErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostDasErrorEventHostDasErrorReason implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private java.lang.String _value_;
	private static java.util.HashMap _table_ = new java.util.HashMap();

	// Constructor
	protected HostDasErrorEventHostDasErrorReason(java.lang.String value) {
		_value_ = value;
		_table_.put(_value_, this);
	}

	public static final java.lang.String _configFailed = "configFailed";
	public static final java.lang.String _timeout = "timeout";
	public static final java.lang.String _communicationInitFailed = "communicationInitFailed";
	public static final java.lang.String _healthCheckScriptFailed = "healthCheckScriptFailed";
	public static final java.lang.String _agentFailed = "agentFailed";
	public static final java.lang.String _agentShutdown = "agentShutdown";
	public static final java.lang.String _other = "other";
	public static final HostDasErrorEventHostDasErrorReason configFailed = new HostDasErrorEventHostDasErrorReason(
			_configFailed);
	public static final HostDasErrorEventHostDasErrorReason timeout = new HostDasErrorEventHostDasErrorReason(
			_timeout);
	public static final HostDasErrorEventHostDasErrorReason communicationInitFailed = new HostDasErrorEventHostDasErrorReason(
			_communicationInitFailed);
	public static final HostDasErrorEventHostDasErrorReason healthCheckScriptFailed = new HostDasErrorEventHostDasErrorReason(
			_healthCheckScriptFailed);
	public static final HostDasErrorEventHostDasErrorReason agentFailed = new HostDasErrorEventHostDasErrorReason(
			_agentFailed);
	public static final HostDasErrorEventHostDasErrorReason agentShutdown = new HostDasErrorEventHostDasErrorReason(
			_agentShutdown);
	public static final HostDasErrorEventHostDasErrorReason other = new HostDasErrorEventHostDasErrorReason(
			_other);

	public java.lang.String getValue() {
		return _value_;
	}

	public static HostDasErrorEventHostDasErrorReason fromValue(
			java.lang.String value) throws java.lang.IllegalArgumentException {
		HostDasErrorEventHostDasErrorReason enumeration = (HostDasErrorEventHostDasErrorReason) _table_
				.get(value);
		if (enumeration == null) {
			throw new java.lang.IllegalArgumentException();
		}
		return enumeration;
	}

	public static HostDasErrorEventHostDasErrorReason fromString(
			java.lang.String value) throws java.lang.IllegalArgumentException {
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
			HostDasErrorEventHostDasErrorReason.class);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostDasErrorEventHostDasErrorReason"));
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

}
