/**
 * QueryChangedDiskAreasRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class QueryChangedDiskAreasRequestType implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference _this;

	private com.vmware.vim25.ManagedObjectReference snapshot;

	private int deviceKey;

	private long startOffset;

	private java.lang.String changeId;

	public QueryChangedDiskAreasRequestType() {
	}

	public QueryChangedDiskAreasRequestType(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference snapshot, int deviceKey,
			long startOffset, java.lang.String changeId) {
		this._this = _this;
		this.snapshot = snapshot;
		this.deviceKey = deviceKey;
		this.startOffset = startOffset;
		this.changeId = changeId;
	}

	/**
	 * Gets the _this value for this QueryChangedDiskAreasRequestType.
	 * 
	 * @return _this
	 */
	public com.vmware.vim25.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this QueryChangedDiskAreasRequestType.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim25.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the snapshot value for this QueryChangedDiskAreasRequestType.
	 * 
	 * @return snapshot
	 */
	public com.vmware.vim25.ManagedObjectReference getSnapshot() {
		return snapshot;
	}

	/**
	 * Sets the snapshot value for this QueryChangedDiskAreasRequestType.
	 * 
	 * @param snapshot
	 */
	public void setSnapshot(com.vmware.vim25.ManagedObjectReference snapshot) {
		this.snapshot = snapshot;
	}

	/**
	 * Gets the deviceKey value for this QueryChangedDiskAreasRequestType.
	 * 
	 * @return deviceKey
	 */
	public int getDeviceKey() {
		return deviceKey;
	}

	/**
	 * Sets the deviceKey value for this QueryChangedDiskAreasRequestType.
	 * 
	 * @param deviceKey
	 */
	public void setDeviceKey(int deviceKey) {
		this.deviceKey = deviceKey;
	}

	/**
	 * Gets the startOffset value for this QueryChangedDiskAreasRequestType.
	 * 
	 * @return startOffset
	 */
	public long getStartOffset() {
		return startOffset;
	}

	/**
	 * Sets the startOffset value for this QueryChangedDiskAreasRequestType.
	 * 
	 * @param startOffset
	 */
	public void setStartOffset(long startOffset) {
		this.startOffset = startOffset;
	}

	/**
	 * Gets the changeId value for this QueryChangedDiskAreasRequestType.
	 * 
	 * @return changeId
	 */
	public java.lang.String getChangeId() {
		return changeId;
	}

	/**
	 * Sets the changeId value for this QueryChangedDiskAreasRequestType.
	 * 
	 * @param changeId
	 */
	public void setChangeId(java.lang.String changeId) {
		this.changeId = changeId;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof QueryChangedDiskAreasRequestType)) {
			return false;
		}
		QueryChangedDiskAreasRequestType other = (QueryChangedDiskAreasRequestType) obj;
		if (obj == null) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true
				&& ((this._this == null && other.get_this() == null) || (this._this != null && this._this
						.equals(other.get_this())))
				&& ((this.snapshot == null && other.getSnapshot() == null) || (this.snapshot != null && this.snapshot
						.equals(other.getSnapshot())))
				&& this.deviceKey == other.getDeviceKey()
				&& this.startOffset == other.getStartOffset()
				&& ((this.changeId == null && other.getChangeId() == null) || (this.changeId != null && this.changeId
						.equals(other.getChangeId())));
		__equalsCalc = null;
		return _equals;
	}

	private boolean __hashCodeCalc = false;

	@Override
	public synchronized int hashCode() {
		if (__hashCodeCalc) {
			return 0;
		}
		__hashCodeCalc = true;
		int _hashCode = 1;
		if (get_this() != null) {
			_hashCode += get_this().hashCode();
		}
		if (getSnapshot() != null) {
			_hashCode += getSnapshot().hashCode();
		}
		_hashCode += getDeviceKey();
		_hashCode += new Long(getStartOffset()).hashCode();
		if (getChangeId() != null) {
			_hashCode += getChangeId().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			QueryChangedDiskAreasRequestType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"QueryChangedDiskAreasRequestType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("snapshot");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"snapshot"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("deviceKey");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"deviceKey"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("startOffset");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"startOffset"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("changeId");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"changeId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

	/**
	 * Get Custom Serializer
	 */
	public static org.apache.axis.encoding.Serializer getSerializer(
			java.lang.String mechType, java.lang.Class _javaType,
			javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanSerializer(_javaType,
				_xmlType, typeDesc);
	}

	/**
	 * Get Custom Deserializer
	 */
	public static org.apache.axis.encoding.Deserializer getDeserializer(
			java.lang.String mechType, java.lang.Class _javaType,
			javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanDeserializer(_javaType,
				_xmlType, typeDesc);
	}

}
