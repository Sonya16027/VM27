/**
 * HostPatchManagerReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostPatchManagerReason implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private java.lang.String _value_;
	private static java.util.HashMap _table_ = new java.util.HashMap();

	// Constructor
	protected HostPatchManagerReason(java.lang.String value) {
		_value_ = value;
		_table_.put(_value_, this);
	}

	public static final java.lang.String _obsoleted = "obsoleted";
	public static final java.lang.String _missingPatch = "missingPatch";
	public static final java.lang.String _missingLib = "missingLib";
	public static final java.lang.String _hasDependentPatch = "hasDependentPatch";
	public static final java.lang.String _conflictPatch = "conflictPatch";
	public static final java.lang.String _conflictLib = "conflictLib";
	public static final HostPatchManagerReason obsoleted = new HostPatchManagerReason(
			_obsoleted);
	public static final HostPatchManagerReason missingPatch = new HostPatchManagerReason(
			_missingPatch);
	public static final HostPatchManagerReason missingLib = new HostPatchManagerReason(
			_missingLib);
	public static final HostPatchManagerReason hasDependentPatch = new HostPatchManagerReason(
			_hasDependentPatch);
	public static final HostPatchManagerReason conflictPatch = new HostPatchManagerReason(
			_conflictPatch);
	public static final HostPatchManagerReason conflictLib = new HostPatchManagerReason(
			_conflictLib);

	public java.lang.String getValue() {
		return _value_;
	}

	public static HostPatchManagerReason fromValue(java.lang.String value)
			throws java.lang.IllegalArgumentException {
		HostPatchManagerReason enumeration = (HostPatchManagerReason) _table_
				.get(value);
		if (enumeration == null) {
			throw new java.lang.IllegalArgumentException();
		}
		return enumeration;
	}

	public static HostPatchManagerReason fromString(java.lang.String value)
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
			HostPatchManagerReason.class);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostPatchManagerReason"));
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

}
