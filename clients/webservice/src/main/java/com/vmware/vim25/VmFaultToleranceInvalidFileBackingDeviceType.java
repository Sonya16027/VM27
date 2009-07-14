/**
 * VmFaultToleranceInvalidFileBackingDeviceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VmFaultToleranceInvalidFileBackingDeviceType implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private java.lang.String _value_;
	private static java.util.HashMap _table_ = new java.util.HashMap();

	// Constructor
	protected VmFaultToleranceInvalidFileBackingDeviceType(
			java.lang.String value) {
		_value_ = value;
		_table_.put(_value_, this);
	}

	public static final java.lang.String _virtualFloppy = "virtualFloppy";
	public static final java.lang.String _virtualCdrom = "virtualCdrom";
	public static final java.lang.String _virtualSerialPort = "virtualSerialPort";
	public static final java.lang.String _virtualParallelPort = "virtualParallelPort";
	public static final java.lang.String _virtualDisk = "virtualDisk";
	public static final VmFaultToleranceInvalidFileBackingDeviceType virtualFloppy = new VmFaultToleranceInvalidFileBackingDeviceType(
			_virtualFloppy);
	public static final VmFaultToleranceInvalidFileBackingDeviceType virtualCdrom = new VmFaultToleranceInvalidFileBackingDeviceType(
			_virtualCdrom);
	public static final VmFaultToleranceInvalidFileBackingDeviceType virtualSerialPort = new VmFaultToleranceInvalidFileBackingDeviceType(
			_virtualSerialPort);
	public static final VmFaultToleranceInvalidFileBackingDeviceType virtualParallelPort = new VmFaultToleranceInvalidFileBackingDeviceType(
			_virtualParallelPort);
	public static final VmFaultToleranceInvalidFileBackingDeviceType virtualDisk = new VmFaultToleranceInvalidFileBackingDeviceType(
			_virtualDisk);

	public java.lang.String getValue() {
		return _value_;
	}

	public static VmFaultToleranceInvalidFileBackingDeviceType fromValue(
			java.lang.String value) throws java.lang.IllegalArgumentException {
		VmFaultToleranceInvalidFileBackingDeviceType enumeration = (VmFaultToleranceInvalidFileBackingDeviceType) _table_
				.get(value);
		if (enumeration == null) {
			throw new java.lang.IllegalArgumentException();
		}
		return enumeration;
	}

	public static VmFaultToleranceInvalidFileBackingDeviceType fromString(
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
			VmFaultToleranceInvalidFileBackingDeviceType.class);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VmFaultToleranceInvalidFileBackingDeviceType"));
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

}
