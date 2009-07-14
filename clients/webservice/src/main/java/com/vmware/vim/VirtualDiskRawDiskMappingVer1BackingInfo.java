/**
 * VirtualDiskRawDiskMappingVer1BackingInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class VirtualDiskRawDiskMappingVer1BackingInfo extends
		com.vmware.vim.VirtualDeviceFileBackingInfo implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String lunUuid;

	private java.lang.String deviceName;

	private java.lang.String compatibilityMode;

	private java.lang.String diskMode;

	public VirtualDiskRawDiskMappingVer1BackingInfo() {
	}

	public VirtualDiskRawDiskMappingVer1BackingInfo(
			java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			java.lang.String fileName,
			com.vmware.vim.ManagedObjectReference datastore,
			java.lang.String lunUuid, java.lang.String deviceName,
			java.lang.String compatibilityMode, java.lang.String diskMode) {
		super(dynamicType, dynamicProperty, fileName, datastore);
		this.lunUuid = lunUuid;
		this.deviceName = deviceName;
		this.compatibilityMode = compatibilityMode;
		this.diskMode = diskMode;
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
						.equals(other.getDiskMode())));
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
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VirtualDiskRawDiskMappingVer1BackingInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualDiskRawDiskMappingVer1BackingInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("lunUuid");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"lunUuid"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("deviceName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"deviceName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("compatibilityMode");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"compatibilityMode"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("diskMode");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"diskMode"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
