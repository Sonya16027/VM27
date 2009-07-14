/**
 * VirtualMachineVideoCard.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualMachineVideoCard extends com.vmware.vim25.VirtualDevice
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.Long videoRamSizeInKB;

	private java.lang.Integer numDisplays;

	private java.lang.Boolean useAutoDetect;

	private java.lang.Boolean enable3DSupport;

	public VirtualMachineVideoCard() {
	}

	public VirtualMachineVideoCard(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty, int key,
			com.vmware.vim25.Description deviceInfo,
			com.vmware.vim25.VirtualDeviceBackingInfo backing,
			com.vmware.vim25.VirtualDeviceConnectInfo connectable,
			java.lang.Integer controllerKey, java.lang.Integer unitNumber,
			java.lang.Long videoRamSizeInKB, java.lang.Integer numDisplays,
			java.lang.Boolean useAutoDetect, java.lang.Boolean enable3DSupport) {
		super(dynamicType, dynamicProperty, key, deviceInfo, backing,
				connectable, controllerKey, unitNumber);
		this.videoRamSizeInKB = videoRamSizeInKB;
		this.numDisplays = numDisplays;
		this.useAutoDetect = useAutoDetect;
		this.enable3DSupport = enable3DSupport;
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

	/**
	 * Gets the numDisplays value for this VirtualMachineVideoCard.
	 * 
	 * @return numDisplays
	 */
	public java.lang.Integer getNumDisplays() {
		return numDisplays;
	}

	/**
	 * Sets the numDisplays value for this VirtualMachineVideoCard.
	 * 
	 * @param numDisplays
	 */
	public void setNumDisplays(java.lang.Integer numDisplays) {
		this.numDisplays = numDisplays;
	}

	/**
	 * Gets the useAutoDetect value for this VirtualMachineVideoCard.
	 * 
	 * @return useAutoDetect
	 */
	public java.lang.Boolean getUseAutoDetect() {
		return useAutoDetect;
	}

	/**
	 * Sets the useAutoDetect value for this VirtualMachineVideoCard.
	 * 
	 * @param useAutoDetect
	 */
	public void setUseAutoDetect(java.lang.Boolean useAutoDetect) {
		this.useAutoDetect = useAutoDetect;
	}

	/**
	 * Gets the enable3DSupport value for this VirtualMachineVideoCard.
	 * 
	 * @return enable3DSupport
	 */
	public java.lang.Boolean getEnable3DSupport() {
		return enable3DSupport;
	}

	/**
	 * Sets the enable3DSupport value for this VirtualMachineVideoCard.
	 * 
	 * @param enable3DSupport
	 */
	public void setEnable3DSupport(java.lang.Boolean enable3DSupport) {
		this.enable3DSupport = enable3DSupport;
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
						.equals(other.getVideoRamSizeInKB())))
				&& ((this.numDisplays == null && other.getNumDisplays() == null) || (this.numDisplays != null && this.numDisplays
						.equals(other.getNumDisplays())))
				&& ((this.useAutoDetect == null && other.getUseAutoDetect() == null) || (this.useAutoDetect != null && this.useAutoDetect
						.equals(other.getUseAutoDetect())))
				&& ((this.enable3DSupport == null && other.getEnable3DSupport() == null) || (this.enable3DSupport != null && this.enable3DSupport
						.equals(other.getEnable3DSupport())));
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
		if (getNumDisplays() != null) {
			_hashCode += getNumDisplays().hashCode();
		}
		if (getUseAutoDetect() != null) {
			_hashCode += getUseAutoDetect().hashCode();
		}
		if (getEnable3DSupport() != null) {
			_hashCode += getEnable3DSupport().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VirtualMachineVideoCard.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachineVideoCard"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("videoRamSizeInKB");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"videoRamSizeInKB"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numDisplays");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"numDisplays"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("useAutoDetect");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"useAutoDetect"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("enable3DSupport");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"enable3DSupport"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
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
