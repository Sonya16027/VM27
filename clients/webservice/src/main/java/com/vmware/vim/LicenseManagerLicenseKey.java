/**
 * LicenseManagerLicenseKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class LicenseManagerLicenseKey implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private java.lang.String _value_;
	private static java.util.HashMap _table_ = new java.util.HashMap();

	// Constructor
	protected LicenseManagerLicenseKey(java.lang.String value) {
		_value_ = value;
		_table_.put(_value_, this);
	}

	public static final java.lang.String _esxFull = "esxFull";
	public static final java.lang.String _esxVmtn = "esxVmtn";
	public static final java.lang.String _esxExpress = "esxExpress";
	public static final java.lang.String _san = "san";
	public static final java.lang.String _iscsi = "iscsi";
	public static final java.lang.String _nas = "nas";
	public static final java.lang.String _vsmp = "vsmp";
	public static final java.lang.String _backup = "backup";
	public static final java.lang.String _vc = "vc";
	public static final java.lang.String _esxHost = "esxHost";
	public static final java.lang.String _gsxHost = "gsxHost";
	public static final java.lang.String _vmotion = "vmotion";
	public static final java.lang.String _drs = "drs";
	public static final java.lang.String _das = "das";
	public static final LicenseManagerLicenseKey esxFull = new LicenseManagerLicenseKey(
			_esxFull);
	public static final LicenseManagerLicenseKey esxVmtn = new LicenseManagerLicenseKey(
			_esxVmtn);
	public static final LicenseManagerLicenseKey esxExpress = new LicenseManagerLicenseKey(
			_esxExpress);
	public static final LicenseManagerLicenseKey san = new LicenseManagerLicenseKey(
			_san);
	public static final LicenseManagerLicenseKey iscsi = new LicenseManagerLicenseKey(
			_iscsi);
	public static final LicenseManagerLicenseKey nas = new LicenseManagerLicenseKey(
			_nas);
	public static final LicenseManagerLicenseKey vsmp = new LicenseManagerLicenseKey(
			_vsmp);
	public static final LicenseManagerLicenseKey backup = new LicenseManagerLicenseKey(
			_backup);
	public static final LicenseManagerLicenseKey vc = new LicenseManagerLicenseKey(
			_vc);
	public static final LicenseManagerLicenseKey esxHost = new LicenseManagerLicenseKey(
			_esxHost);
	public static final LicenseManagerLicenseKey gsxHost = new LicenseManagerLicenseKey(
			_gsxHost);
	public static final LicenseManagerLicenseKey vmotion = new LicenseManagerLicenseKey(
			_vmotion);
	public static final LicenseManagerLicenseKey drs = new LicenseManagerLicenseKey(
			_drs);
	public static final LicenseManagerLicenseKey das = new LicenseManagerLicenseKey(
			_das);

	public java.lang.String getValue() {
		return _value_;
	}

	public static LicenseManagerLicenseKey fromValue(java.lang.String value)
			throws java.lang.IllegalArgumentException {
		LicenseManagerLicenseKey enumeration = (LicenseManagerLicenseKey) _table_
				.get(value);
		if (enumeration == null) {
			throw new java.lang.IllegalArgumentException();
		}
		return enumeration;
	}

	public static LicenseManagerLicenseKey fromString(java.lang.String value)
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
			LicenseManagerLicenseKey.class);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"LicenseManagerLicenseKey"));
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

}
