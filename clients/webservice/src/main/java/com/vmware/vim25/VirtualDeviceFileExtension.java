/**
 * VirtualDeviceFileExtension.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualDeviceFileExtension implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private java.lang.String _value_;
	private static java.util.HashMap _table_ = new java.util.HashMap();

	// Constructor
	protected VirtualDeviceFileExtension(java.lang.String value) {
		_value_ = value;
		_table_.put(_value_, this);
	}

	public static final java.lang.String _iso = "iso";
	public static final java.lang.String _flp = "flp";
	public static final java.lang.String _vmdk = "vmdk";
	public static final java.lang.String _dsk = "dsk";
	public static final java.lang.String _rdm = "rdm";
	public static final VirtualDeviceFileExtension iso = new VirtualDeviceFileExtension(
			_iso);
	public static final VirtualDeviceFileExtension flp = new VirtualDeviceFileExtension(
			_flp);
	public static final VirtualDeviceFileExtension vmdk = new VirtualDeviceFileExtension(
			_vmdk);
	public static final VirtualDeviceFileExtension dsk = new VirtualDeviceFileExtension(
			_dsk);
	public static final VirtualDeviceFileExtension rdm = new VirtualDeviceFileExtension(
			_rdm);

	public java.lang.String getValue() {
		return _value_;
	}

	public static VirtualDeviceFileExtension fromValue(java.lang.String value)
			throws java.lang.IllegalArgumentException {
		VirtualDeviceFileExtension enumeration = (VirtualDeviceFileExtension) _table_
				.get(value);
		if (enumeration == null) {
			throw new java.lang.IllegalArgumentException();
		}
		return enumeration;
	}

	public static VirtualDeviceFileExtension fromString(java.lang.String value)
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
			VirtualDeviceFileExtension.class);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualDeviceFileExtension"));
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

}
