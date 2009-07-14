/**
 * VirtualDiskRawDiskVer2BackingOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualDiskRawDiskVer2BackingOption extends
		com.vmware.vim25.VirtualDeviceDeviceBackingOption implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ChoiceOption descriptorFileNameExtensions;

	private boolean uuid;

	public VirtualDiskRawDiskVer2BackingOption() {
	}

	public VirtualDiskRawDiskVer2BackingOption(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String type,
			com.vmware.vim25.BoolOption autoDetectAvailable,
			com.vmware.vim25.ChoiceOption descriptorFileNameExtensions,
			boolean uuid) {
		super(dynamicType, dynamicProperty, type, autoDetectAvailable);
		this.descriptorFileNameExtensions = descriptorFileNameExtensions;
		this.uuid = uuid;
	}

	/**
	 * Gets the descriptorFileNameExtensions value for this
	 * VirtualDiskRawDiskVer2BackingOption.
	 * 
	 * @return descriptorFileNameExtensions
	 */
	public com.vmware.vim25.ChoiceOption getDescriptorFileNameExtensions() {
		return descriptorFileNameExtensions;
	}

	/**
	 * Sets the descriptorFileNameExtensions value for this
	 * VirtualDiskRawDiskVer2BackingOption.
	 * 
	 * @param descriptorFileNameExtensions
	 */
	public void setDescriptorFileNameExtensions(
			com.vmware.vim25.ChoiceOption descriptorFileNameExtensions) {
		this.descriptorFileNameExtensions = descriptorFileNameExtensions;
	}

	/**
	 * Gets the uuid value for this VirtualDiskRawDiskVer2BackingOption.
	 * 
	 * @return uuid
	 */
	public boolean isUuid() {
		return uuid;
	}

	/**
	 * Sets the uuid value for this VirtualDiskRawDiskVer2BackingOption.
	 * 
	 * @param uuid
	 */
	public void setUuid(boolean uuid) {
		this.uuid = uuid;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualDiskRawDiskVer2BackingOption)) {
			return false;
		}
		VirtualDiskRawDiskVer2BackingOption other = (VirtualDiskRawDiskVer2BackingOption) obj;
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
				&& ((this.descriptorFileNameExtensions == null && other
						.getDescriptorFileNameExtensions() == null) || (this.descriptorFileNameExtensions != null && this.descriptorFileNameExtensions
						.equals(other.getDescriptorFileNameExtensions())))
				&& this.uuid == other.isUuid();
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
		if (getDescriptorFileNameExtensions() != null) {
			_hashCode += getDescriptorFileNameExtensions().hashCode();
		}
		_hashCode += (isUuid() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VirtualDiskRawDiskVer2BackingOption.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualDiskRawDiskVer2BackingOption"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("descriptorFileNameExtensions");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"descriptorFileNameExtensions"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ChoiceOption"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("uuid");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "uuid"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
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
