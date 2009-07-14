/**
 * VirtualMachineGuestOsFamily.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualMachineGuestOsFamily implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private java.lang.String _value_;
	private static java.util.HashMap _table_ = new java.util.HashMap();

	// Constructor
	protected VirtualMachineGuestOsFamily(java.lang.String value) {
		_value_ = value;
		_table_.put(_value_, this);
	}

	public static final java.lang.String _windowsGuest = "windowsGuest";
	public static final java.lang.String _linuxGuest = "linuxGuest";
	public static final java.lang.String _netwareGuest = "netwareGuest";
	public static final java.lang.String _solarisGuest = "solarisGuest";
	public static final java.lang.String _otherGuestFamily = "otherGuestFamily";
	public static final VirtualMachineGuestOsFamily windowsGuest = new VirtualMachineGuestOsFamily(
			_windowsGuest);
	public static final VirtualMachineGuestOsFamily linuxGuest = new VirtualMachineGuestOsFamily(
			_linuxGuest);
	public static final VirtualMachineGuestOsFamily netwareGuest = new VirtualMachineGuestOsFamily(
			_netwareGuest);
	public static final VirtualMachineGuestOsFamily solarisGuest = new VirtualMachineGuestOsFamily(
			_solarisGuest);
	public static final VirtualMachineGuestOsFamily otherGuestFamily = new VirtualMachineGuestOsFamily(
			_otherGuestFamily);

	public java.lang.String getValue() {
		return _value_;
	}

	public static VirtualMachineGuestOsFamily fromValue(java.lang.String value)
			throws java.lang.IllegalArgumentException {
		VirtualMachineGuestOsFamily enumeration = (VirtualMachineGuestOsFamily) _table_
				.get(value);
		if (enumeration == null) {
			throw new java.lang.IllegalArgumentException();
		}
		return enumeration;
	}

	public static VirtualMachineGuestOsFamily fromString(java.lang.String value)
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
			VirtualMachineGuestOsFamily.class);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachineGuestOsFamily"));
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

}
