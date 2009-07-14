/**
 * VirtualDiskRawDiskMappingVer1BackingInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualDiskRawDiskMappingVer1BackingInfo extends
		com.vmware.vim25.VirtualDeviceFileBackingInfo implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String lunUuid;

	private java.lang.String deviceName;

	private java.lang.String compatibilityMode;

	private java.lang.String diskMode;

	private java.lang.String uuid;

	private java.lang.String contentId;

	private java.lang.String changeId;

	private com.vmware.vim25.VirtualDiskRawDiskMappingVer1BackingInfo parent;

	public VirtualDiskRawDiskMappingVer1BackingInfo() {
	}

	public VirtualDiskRawDiskMappingVer1BackingInfo(
			java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String fileName,
			com.vmware.vim25.ManagedObjectReference datastore,
			java.lang.String lunUuid, java.lang.String deviceName,
			java.lang.String compatibilityMode, java.lang.String diskMode,
			java.lang.String uuid, java.lang.String contentId,
			java.lang.String changeId,
			com.vmware.vim25.VirtualDiskRawDiskMappingVer1BackingInfo parent) {
		super(dynamicType, dynamicProperty, fileName, datastore);
		this.lunUuid = lunUuid;
		this.deviceName = deviceName;
		this.compatibilityMode = compatibilityMode;
		this.diskMode = diskMode;
		this.uuid = uuid;
		this.contentId = contentId;
		this.changeId = changeId;
		this.parent = parent;
	}

	/**
	 * Gets the lunUuid value for this VirtualDiskRawDiskMappingVer1BackingInfo.
	 * 
	 * @return lunUuid
	 */
	public java.lang.String getLunUuid() {
		return lunUuid;
	}

	/**
	 * Sets the lunUuid value for this VirtualDiskRawDiskMappingVer1BackingInfo.
	 * 
	 * @param lunUuid
	 */
	public void setLunUuid(java.lang.String lunUuid) {
		this.lunUuid = lunUuid;
	}

	/**
	 * Gets the deviceName value for this
	 * VirtualDiskRawDiskMappingVer1BackingInfo.
	 * 
	 * @return deviceName
	 */
	public java.lang.String getDeviceName() {
		return deviceName;
	}

	/**
	 * Sets the deviceName value for this
	 * VirtualDiskRawDiskMappingVer1BackingInfo.
	 * 
	 * @param deviceName
	 */
	public void setDeviceName(java.lang.String deviceName) {
		this.deviceName = deviceName;
	}

	/**
	 * Gets the compatibilityMode value for this
	 * VirtualDiskRawDiskMappingVer1BackingInfo.
	 * 
	 * @return compatibilityMode
	 */
	public java.lang.String getCompatibilityMode() {
		return compatibilityMode;
	}

	/**
	 * Sets the compatibilityMode value for this
	 * VirtualDiskRawDiskMappingVer1BackingInfo.
	 * 
	 * @param compatibilityMode
	 */
	public void setCompatibilityMode(java.lang.String compatibilityMode) {
		this.compatibilityMode = compatibilityMode;
	}

	/**
	 * Gets the diskMode value for this
	 * VirtualDiskRawDiskMappingVer1BackingInfo.
	 * 
	 * @return diskMode
	 */
	public java.lang.String getDiskMode() {
		return diskMode;
	}

	/**
	 * Sets the diskMode value for this
	 * VirtualDiskRawDiskMappingVer1BackingInfo.
	 * 
	 * @param diskMode
	 */
	public void setDiskMode(java.lang.String diskMode) {
		this.diskMode = diskMode;
	}

	/**
	 * Gets the uuid value for this VirtualDiskRawDiskMappingVer1BackingInfo.
	 * 
	 * @return uuid
	 */
	public java.lang.String getUuid() {
		return uuid;
	}

	/**
	 * Sets the uuid value for this VirtualDiskRawDiskMappingVer1BackingInfo.
	 * 
	 * @param uuid
	 */
	public void setUuid(java.lang.String uuid) {
		this.uuid = uuid;
	}

	/**
	 * Gets the contentId value for this
	 * VirtualDiskRawDiskMappingVer1BackingInfo.
	 * 
	 * @return contentId
	 */
	public java.lang.String getContentId() {
		return contentId;
	}

	/**
	 * Sets the contentId value for this
	 * VirtualDiskRawDiskMappingVer1BackingInfo.
	 * 
	 * @param contentId
	 */
	public void setContentId(java.lang.String contentId) {
		this.contentId = contentId;
	}

	/**
	 * Gets the changeId value for this
	 * VirtualDiskRawDiskMappingVer1BackingInfo.
	 * 
	 * @return changeId
	 */
	public java.lang.String getChangeId() {
		return changeId;
	}

	/**
	 * Sets the changeId value for this
	 * VirtualDiskRawDiskMappingVer1BackingInfo.
	 * 
	 * @param changeId
	 */
	public void setChangeId(java.lang.String changeId) {
		this.changeId = changeId;
	}

	/**
	 * Gets the parent value for this VirtualDiskRawDiskMappingVer1BackingInfo.
	 * 
	 * @return parent
	 */
	public com.vmware.vim25.VirtualDiskRawDiskMappingVer1BackingInfo getParent() {
		return parent;
	}

	/**
	 * Sets the parent value for this VirtualDiskRawDiskMappingVer1BackingInfo.
	 * 
	 * @param parent
	 */
	public void setParent(
			com.vmware.vim25.VirtualDiskRawDiskMappingVer1BackingInfo parent) {
		this.parent = parent;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualDiskRawDiskMappingVer1BackingInfo)) {
			return false;
		}
		VirtualDiskRawDiskMappingVer1BackingInfo other = (VirtualDiskRawDiskMappingVer1BackingInfo) obj;
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
		_equals = super.equals(obj)
				&& ((this.lunUuid == null && other.getLunUuid() == null) || (this.lunUuid != null && this.lunUuid
						.equals(other.getLunUuid())))
				&& ((this.deviceName == null && other.getDeviceName() == null) || (this.deviceName != null && this.deviceName
						.equals(other.getDeviceName())))
				&& ((this.compatibilityMode == null && other
						.getCompatibilityMode() == null) || (this.compatibilityMode != null && this.compatibilityMode
						.equals(other.getCompatibilityMode())))
				&& ((this.diskMode == null && other.getDiskMode() == null) || (this.diskMode != null && this.diskMode
						.equals(other.getDiskMode())))
				&& ((this.uuid == null && other.getUuid() == null) || (this.uuid != null && this.uuid
						.equals(other.getUuid())))
				&& ((this.contentId == null && other.getContentId() == null) || (this.contentId != null && this.contentId
						.equals(other.getContentId())))
				&& ((this.changeId == null && other.getChangeId() == null) || (this.changeId != null && this.changeId
						.equals(other.getChangeId())))
				&& ((this.parent == null && other.getParent() == null) || (this.parent != null && this.parent
						.equals(other.getParent())));
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
		int _hashCode = super.hashCode();
		if (getLunUuid() != null) {
			_hashCode += getLunUuid().hashCode();
		}
		if (getDeviceName() != null) {
			_hashCode += getDeviceName().hashCode();
		}
		if (getCompatibilityMode() != null) {
			_hashCode += getCompatibilityMode().hashCode();
		}
		if (getDiskMode() != null) {
			_hashCode += getDiskMode().hashCode();
		}
		if (getUuid() != null) {
			_hashCode += getUuid().hashCode();
		}
		if (getContentId() != null) {
			_hashCode += getContentId().hashCode();
		}
		if (getChangeId() != null) {
			_hashCode += getChangeId().hashCode();
		}
		if (getParent() != null) {
			_hashCode += getParent().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VirtualDiskRawDiskMappingVer1BackingInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualDiskRawDiskMappingVer1BackingInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("lunUuid");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"lunUuid"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("deviceName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"deviceName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("compatibilityMode");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"compatibilityMode"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("diskMode");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"diskMode"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("uuid");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "uuid"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("contentId");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"contentId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("changeId");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"changeId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("parent");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"parent"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualDiskRawDiskMappingVer1BackingInfo"));
		elemField.setMinOccurs(0);
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
