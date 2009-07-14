/**
 * VirtualMachineVideoCard.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class VirtualMachineVideoCard extends com.vmware.vim.VirtualDevice
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private java.lang.Long videoRamSizeInKB;

	public VirtualMachineVideoCard() {
	}

	public VirtualMachineVideoCard(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty, int key,
			com.vmware.vim.Description deviceInfo,
			com.vmware.vim.VirtualDeviceBackingInfo backing,
			com.vmware.vim.VirtualDeviceConnectInfo connectable,
			java.lang.Integer controllerKey, java.lang.Integer unitNumber,
			java.lang.Long videoRamSizeInKB) {
		super(dynamicType, dynamicProperty, key, deviceInfo, backing,
				connectable, controllerKey, unitNumber);
		this.videoRamSizeInKB = videoRamSizeInKB;
	}

	/**
	 * Gets the videoRamSizeInKB value for this VirtualMachineVideoCard.
	 * 
	 * @return videoRamSizeInKB
	 */
	public java.lang.Long getVideoRamSizeInKB() {
		return videoRamSizeInKB;
	}

	/**
	 * Sets the videoRamSizeInKB value for this VirtualMachineVideoCard.
	 * 
	 * @param videoRamSizeInKB
	 */
	public void setVideoRamSizeInKB(java.lang.Long videoRamSizeInKB) {
		this.videoRamSizeInKB = videoRamSizeInKB;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualMachineVideoCard)) {
			return false;
		}
		VirtualMachineVideoCard other = (VirtualMachineVideoCard) obj;
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
				&& ((this.videoRamSizeInKB == null && other
						.getVideoRamSizeInKB() == null) || (this.videoRamSizeInKB != null && this.videoRamSizeInKB
						.equals(other.getVideoRamSizeInKB())));
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
		if (getVideoRamSizeInKB() != null) {
			_hashCode += getVideoRamSizeInKB().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VirtualMachineVideoCard.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualMachineVideoCard"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("videoRamSizeInKB");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"videoRamSizeInKB"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
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
