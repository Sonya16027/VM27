/**
 * EntityReferenceEntityType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim.sms;

public class EntityReferenceEntityType implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private java.lang.String _value_;
	private static java.util.HashMap _table_ = new java.util.HashMap();

	// Constructor
	protected EntityReferenceEntityType(java.lang.String value) {
		_value_ = value;
		_table_.put(_value_, this);
	}

	public static final java.lang.String _datacenter = "datacenter";
	public static final java.lang.String _resourcePool = "resourcePool";
	public static final java.lang.String _cluster = "cluster";
	public static final java.lang.String _vm = "vm";
	public static final java.lang.String _datastore = "datastore";
	public static final java.lang.String _host = "host";
	public static final java.lang.String _vmFile = "vmFile";
	public static final java.lang.String _scsiPath = "scsiPath";
	public static final java.lang.String _scsiTarget = "scsiTarget";
	public static final java.lang.String _scsiVolume = "scsiVolume";
	public static final java.lang.String _scsiAdapter = "scsiAdapter";
	public static final java.lang.String _nasMount = "nasMount";
	public static final EntityReferenceEntityType datacenter = new EntityReferenceEntityType(
			_datacenter);
	public static final EntityReferenceEntityType resourcePool = new EntityReferenceEntityType(
			_resourcePool);
	public static final EntityReferenceEntityType cluster = new EntityReferenceEntityType(
			_cluster);
	public static final EntityReferenceEntityType vm = new EntityReferenceEntityType(
			_vm);
	public static final EntityReferenceEntityType datastore = new EntityReferenceEntityType(
			_datastore);
	public static final EntityReferenceEntityType host = new EntityReferenceEntityType(
			_host);
	public static final EntityReferenceEntityType vmFile = new EntityReferenceEntityType(
			_vmFile);
	public static final EntityReferenceEntityType scsiPath = new EntityReferenceEntityType(
			_scsiPath);
	public static final EntityReferenceEntityType scsiTarget = new EntityReferenceEntityType(
			_scsiTarget);
	public static final EntityReferenceEntityType scsiVolume = new EntityReferenceEntityType(
			_scsiVolume);
	public static final EntityReferenceEntityType scsiAdapter = new EntityReferenceEntityType(
			_scsiAdapter);
	public static final EntityReferenceEntityType nasMount = new EntityReferenceEntityType(
			_nasMount);

	public java.lang.String getValue() {
		return _value_;
	}

	public static EntityReferenceEntityType fromValue(java.lang.String value)
			throws java.lang.IllegalArgumentException {
		EntityReferenceEntityType enumeration = (EntityReferenceEntityType) _table_
				.get(value);
		if (enumeration == null) {
			throw new java.lang.IllegalArgumentException();
		}
		return enumeration;
	}

	public static EntityReferenceEntityType fromString(java.lang.String value)
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
			EntityReferenceEntityType.class);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sm1",
				"EntityReferenceEntityType"));
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

}
