/**
 * DiagnosticManagerLogCreator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class DiagnosticManagerLogCreator implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private java.lang.String _value_;
	private static java.util.HashMap _table_ = new java.util.HashMap();

	// Constructor
	protected DiagnosticManagerLogCreator(java.lang.String value) {
		_value_ = value;
		_table_.put(_value_, this);
	}

	public static final java.lang.String _vpxd = "vpxd";
	public static final java.lang.String _vpxa = "vpxa";
	public static final java.lang.String _hostd = "hostd";
	public static final java.lang.String _serverd = "serverd";
	public static final java.lang.String _install = "install";
	public static final java.lang.String _vpxClient = "vpxClient";
	public static final DiagnosticManagerLogCreator vpxd = new DiagnosticManagerLogCreator(
			_vpxd);
	public static final DiagnosticManagerLogCreator vpxa = new DiagnosticManagerLogCreator(
			_vpxa);
	public static final DiagnosticManagerLogCreator hostd = new DiagnosticManagerLogCreator(
			_hostd);
	public static final DiagnosticManagerLogCreator serverd = new DiagnosticManagerLogCreator(
			_serverd);
	public static final DiagnosticManagerLogCreator install = new DiagnosticManagerLogCreator(
			_install);
	public static final DiagnosticManagerLogCreator vpxClient = new DiagnosticManagerLogCreator(
			_vpxClient);

	public java.lang.String getValue() {
		return _value_;
	}

	public static DiagnosticManagerLogCreator fromValue(java.lang.String value)
			throws java.lang.IllegalArgumentException {
		DiagnosticManagerLogCreator enumeration = (DiagnosticManagerLogCreator) _table_
				.get(value);
		if (enumeration == null) {
			throw new java.lang.IllegalArgumentException();
		}
		return enumeration;
	}

	public static DiagnosticManagerLogCreator fromString(java.lang.String value)
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
			DiagnosticManagerLogCreator.class);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"DiagnosticManagerLogCreator"));
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

}
