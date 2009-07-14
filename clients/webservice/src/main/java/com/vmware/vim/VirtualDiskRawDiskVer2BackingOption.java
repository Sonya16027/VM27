/**
 * VirtualDiskRawDiskVer2BackingOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class VirtualDiskRawDiskVer2BackingOption extends
		com.vmware.vim.VirtualDeviceDeviceBackingOption implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim.ChoiceOption descriptorFileNameExtensions;

	public VirtualDiskRawDiskVer2BackingOption() {
	}

	public VirtualDiskRawDiskVer2BackingOption(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			java.lang.String type,
			com.vmware.vim.ChoiceOption descriptorFileNameExtensions) {
		super(dynamicType, dynamicProperty, type);
		this.descriptorFileNameExtensions = descriptorFileNameExtensions;
	}

	/**
	 * Gets the descriptorFileNameExtensions value for this
	 * VirtualDiskRawDiskVer2BackingOption.
	 * 
	 * @return descriptorFileNameExtensions
	 */
	public com.vmware.vim.ChoiceOption getDescriptorFileNameExtensions() {
		return descriptorFileNameExtensions;
	}

	/**
	 * Sets the descriptorFileNameExtensions value for this
	 * VirtualDiskRawDiskVer2BackingOption.
	 * 
	 * @param descriptorFileNameExtensions
	 */
	public void setDescriptorFileNameExtensions(
			com.vmware.vim.ChoiceOption descriptorFileNameExtensions) {
		this.descriptorFileNameExtensions = descriptorFileNameExtensions;
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
						.equals(other.getDescriptorFileNameExtensions())));
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
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VirtualDiskRawDiskVer2BackingOption.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualDiskRawDiskVer2BackingOption"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("descriptorFileNameExtensions");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"descriptorFileNameExtensions"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ChoiceOption"));
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
