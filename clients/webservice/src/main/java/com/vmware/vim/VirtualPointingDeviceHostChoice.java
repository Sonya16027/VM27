/**
 * VirtualPointingDeviceHostChoice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class VirtualPointingDeviceHostChoice implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private java.lang.String _value_;
	private static java.util.HashMap _table_ = new java.util.HashMap();

	// Constructor
	protected VirtualPointingDeviceHostChoice(java.lang.String value) {
		_value_ = value;
		_table_.put(_value_, this);
	}

	public static final java.lang.String _autodetect = "autodetect";
	public static final java.lang.String _intellimouseExplorer = "intellimouseExplorer";
	public static final java.lang.String _intellimousePs2 = "intellimousePs2";
	public static final java.lang.String _logitechMouseman = "logitechMouseman";
	public static final java.lang.String _microsoft_serial = "microsoft_serial";
	public static final java.lang.String _mouseSystems = "mouseSystems";
	public static final java.lang.String _mousemanSerial = "mousemanSerial";
	public static final java.lang.String _ps2 = "ps2";
	public static final VirtualPointingDeviceHostChoice autodetect = new VirtualPointingDeviceHostChoice(
			_autodetect);
	public static final VirtualPointingDeviceHostChoice intellimouseExplorer = new VirtualPointingDeviceHostChoice(
			_intellimouseExplorer);
	public static final VirtualPointingDeviceHostChoice intellimousePs2 = new VirtualPointingDeviceHostChoice(
			_intellimousePs2);
	public static final VirtualPointingDeviceHostChoice logitechMouseman = new VirtualPointingDeviceHostChoice(
			_logitechMouseman);
	public static final VirtualPointingDeviceHostChoice microsoft_serial = new VirtualPointingDeviceHostChoice(
			_microsoft_serial);
	public static final VirtualPointingDeviceHostChoice mouseSystems = new VirtualPointingDeviceHostChoice(
			_mouseSystems);
	public static final VirtualPointingDeviceHostChoice mousemanSerial = new VirtualPointingDeviceHostChoice(
			_mousemanSerial);
	public static final VirtualPointingDeviceHostChoice ps2 = new VirtualPointingDeviceHostChoice(
			_ps2);

	public java.lang.String getValue() {
		return _value_;
	}

	public static VirtualPointingDeviceHostChoice fromValue(
			java.lang.String value) throws java.lang.IllegalArgumentException {
		VirtualPointingDeviceHostChoice enumeration = (VirtualPointingDeviceHostChoice) _table_
				.get(value);
		if (enumeration == null) {
			throw new java.lang.IllegalArgumentException();
		}
		return enumeration;
	}

	public static VirtualPointingDeviceHostChoice fromString(
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
			VirtualPointingDeviceHostChoice.class);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualPointingDeviceHostChoice"));
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

}
