/**
 * VirtualDiskRawDiskVer2BackingInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class VirtualDiskRawDiskVer2BackingInfo extends
		com.vmware.vim.VirtualDeviceDeviceBackingInfo implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private java.lang.String descriptorFileName;

	public VirtualDiskRawDiskVer2BackingInfo() {
	}

	public VirtualDiskRawDiskVer2BackingInfo(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			java.lang.String deviceName, java.lang.String descriptorFileName) {
		super(dynamicType, dynamicProperty, deviceName);
		this.descriptorFileName = descriptorFileName;
	}

	/**
	 * Gets the descriptorFileName value for this
	 * VirtualDiskRawDiskVer2BackingInfo.
	 * 
	 * @return descriptorFileName
	 */
	public java.lang.String getDescriptorFileName() {
		return descriptorFileName;
	}

	/**
	 * Sets the descriptorFileName value for this
	 * VirtualDiskRawDiskVer2BackingInfo.
	 * 
	 * @param descriptorFileName
	 */
	public void setDescriptorFileName(java.lang.String descriptorFileName) {
		this.descriptorFileName = descriptorFileName;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualDiskRawDiskVer2BackingInfo)) {
			return false;
		}
		VirtualDiskRawDiskVer2BackingInfo other = (VirtualDiskRawDiskVer2BackingInfo) obj;
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
				&& ((this.descriptorFileName == null && other
						.getDescriptorFileName() == null) || (this.descriptorFileName != null && this.descriptorFileName
						.equals(other.getDescriptorFileName())));
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
		if (getDescriptorFileName() != null) {
			_hashCode += getDescriptorFileName().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VirtualDiskRawDiskVer2BackingInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualDiskRawDiskVer2BackingInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("descriptorFileName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"descriptorFileName"));
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
