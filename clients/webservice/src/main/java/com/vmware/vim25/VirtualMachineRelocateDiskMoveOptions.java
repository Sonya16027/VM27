/**
 * VirtualMachineRelocateDiskMoveOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualMachineRelocateDiskMoveOptions implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private java.lang.String _value_;
	private static java.util.HashMap _table_ = new java.util.HashMap();

	// Constructor
	protected VirtualMachineRelocateDiskMoveOptions(java.lang.String value) {
		_value_ = value;
		_table_.put(_value_, this);
	}

	public static final java.lang.String _moveAllDiskBackingsAndAllowSharing = "moveAllDiskBackingsAndAllowSharing";
	public static final java.lang.String _moveAllDiskBackingsAndDisallowSharing = "moveAllDiskBackingsAndDisallowSharing";
	public static final java.lang.String _moveChildMostDiskBacking = "moveChildMostDiskBacking";
	public static final java.lang.String _createNewChildDiskBacking = "createNewChildDiskBacking";
	public static final VirtualMachineRelocateDiskMoveOptions moveAllDiskBackingsAndAllowSharing = new VirtualMachineRelocateDiskMoveOptions(
			_moveAllDiskBackingsAndAllowSharing);
	public static final VirtualMachineRelocateDiskMoveOptions moveAllDiskBackingsAndDisallowSharing = new VirtualMachineRelocateDiskMoveOptions(
			_moveAllDiskBackingsAndDisallowSharing);
	public static final VirtualMachineRelocateDiskMoveOptions moveChildMostDiskBacking = new VirtualMachineRelocateDiskMoveOptions(
			_moveChildMostDiskBacking);
	public static final VirtualMachineRelocateDiskMoveOptions createNewChildDiskBacking = new VirtualMachineRelocateDiskMoveOptions(
			_createNewChildDiskBacking);

	public java.lang.String getValue() {
		return _value_;
	}

	public static VirtualMachineRelocateDiskMoveOptions fromValue(
			java.lang.String value) throws java.lang.IllegalArgumentException {
		VirtualMachineRelocateDiskMoveOptions enumeration = (VirtualMachineRelocateDiskMoveOptions) _table_
				.get(value);
		if (enumeration == null) {
			throw new java.lang.IllegalArgumentException();
		}
		return enumeration;
	}

	public static VirtualMachineRelocateDiskMoveOptions fromString(
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
			VirtualMachineRelocateDiskMoveOptions.class);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachineRelocateDiskMoveOptions"));
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

}
