/**
 * AgentInstallFailedReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class AgentInstallFailedReason implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private java.lang.String _value_;
	private static java.util.HashMap _table_ = new java.util.HashMap();

	// Constructor
	protected AgentInstallFailedReason(java.lang.String value) {
		_value_ = value;
		_table_.put(_value_, this);
	}

	public static final java.lang.String _NotEnoughSpaceOnDevice = "NotEnoughSpaceOnDevice";
	public static final java.lang.String _PrepareToUpgradeFailed = "PrepareToUpgradeFailed";
	public static final java.lang.String _AgentNotRunning = "AgentNotRunning";
	public static final java.lang.String _AgentNotReachable = "AgentNotReachable";
	public static final java.lang.String _InstallTimedout = "InstallTimedout";
	public static final java.lang.String _SignatureVerificationFailed = "SignatureVerificationFailed";
	public static final java.lang.String _AgentUploadFailed = "AgentUploadFailed";
	public static final java.lang.String _AgentUploadTimedout = "AgentUploadTimedout";
	public static final java.lang.String _UnknownInstallerError = "UnknownInstallerError";
	public static final AgentInstallFailedReason NotEnoughSpaceOnDevice = new AgentInstallFailedReason(
			_NotEnoughSpaceOnDevice);
	public static final AgentInstallFailedReason PrepareToUpgradeFailed = new AgentInstallFailedReason(
			_PrepareToUpgradeFailed);
	public static final AgentInstallFailedReason AgentNotRunning = new AgentInstallFailedReason(
			_AgentNotRunning);
	public static final AgentInstallFailedReason AgentNotReachable = new AgentInstallFailedReason(
			_AgentNotReachable);
	public static final AgentInstallFailedReason InstallTimedout = new AgentInstallFailedReason(
			_InstallTimedout);
	public static final AgentInstallFailedReason SignatureVerificationFailed = new AgentInstallFailedReason(
			_SignatureVerificationFailed);
	public static final AgentInstallFailedReason AgentUploadFailed = new AgentInstallFailedReason(
			_AgentUploadFailed);
	public static final AgentInstallFailedReason AgentUploadTimedout = new AgentInstallFailedReason(
			_AgentUploadTimedout);
	public static final AgentInstallFailedReason UnknownInstallerError = new AgentInstallFailedReason(
			_UnknownInstallerError);

	public java.lang.String getValue() {
		return _value_;
	}

	public static AgentInstallFailedReason fromValue(java.lang.String value)
			throws java.lang.IllegalArgumentException {
		AgentInstallFailedReason enumeration = (AgentInstallFailedReason) _table_
				.get(value);
		if (enumeration == null) {
			throw new java.lang.IllegalArgumentException();
		}
		return enumeration;
	}

	public static AgentInstallFailedReason fromString(java.lang.String value)
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
			AgentInstallFailedReason.class);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"AgentInstallFailedReason"));
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

}
