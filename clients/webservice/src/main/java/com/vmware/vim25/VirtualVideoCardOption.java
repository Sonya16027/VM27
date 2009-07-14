/**
 * VirtualVideoCardOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualVideoCardOption extends
		com.vmware.vim25.VirtualDeviceOption implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.LongOption videoRamSizeInKB;

	private com.vmware.vim25.IntOption numDisplays;

	private com.vmware.vim25.BoolOption useAutoDetect;

	private com.vmware.vim25.BoolOption support3D;

	public VirtualVideoCardOption() {
	}

	public VirtualVideoCardOption(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String type,
			com.vmware.vim25.VirtualDeviceConnectOption connectOption,
			java.lang.String controllerType,
			com.vmware.vim25.BoolOption autoAssignController,
			com.vmware.vim25.VirtualDeviceBackingOption[] backingOption,
			java.lang.Integer defaultBackingOptionIndex,
			java.lang.String[] licensingLimit, boolean deprecated,
			boolean plugAndPlay, java.lang.Boolean hotRemoveSupported,
			com.vmware.vim25.LongOption videoRamSizeInKB,
			com.vmware.vim25.IntOption numDisplays,
			com.vmware.vim25.BoolOption useAutoDetect,
			com.vmware.vim25.BoolOption support3D) {
		super(dynamicType, dynamicProperty, type, connectOption,
				controllerType, autoAssignController, backingOption,
				defaultBackingOptionIndex, licensingLimit, deprecated,
				plugAndPlay, hotRemoveSupported);
		this.videoRamSizeInKB = videoRamSizeInKB;
		this.numDisplays = numDisplays;
		this.useAutoDetect = useAutoDetect;
		this.support3D = support3D;
	}

	/**
	 * Gets the videoRamSizeInKB value for this VirtualVideoCardOption.
	 * 
	 * @return videoRamSizeInKB
	 */
	public com.vmware.vim25.LongOption getVideoRamSizeInKB() {
		return videoRamSizeInKB;
	}

	/**
	 * Sets the videoRamSizeInKB value for this VirtualVideoCardOption.
	 * 
	 * @param videoRamSizeInKB
	 */
	public void setVideoRamSizeInKB(com.vmware.vim25.LongOption videoRamSizeInKB) {
		this.videoRamSizeInKB = videoRamSizeInKB;
	}

	/**
	 * Gets the numDisplays value for this VirtualVideoCardOption.
	 * 
	 * @return numDisplays
	 */
	public com.vmware.vim25.IntOption getNumDisplays() {
		return numDisplays;
	}

	/**
	 * Sets the numDisplays value for this VirtualVideoCardOption.
	 * 
	 * @param numDisplays
	 */
	public void setNumDisplays(com.vmware.vim25.IntOption numDisplays) {
		this.numDisplays = numDisplays;
	}

	/**
	 * Gets the useAutoDetect value for this VirtualVideoCardOption.
	 * 
	 * @return useAutoDetect
	 */
	public com.vmware.vim25.BoolOption getUseAutoDetect() {
		return useAutoDetect;
	}

	/**
	 * Sets the useAutoDetect value for this VirtualVideoCardOption.
	 * 
	 * @param useAutoDetect
	 */
	public void setUseAutoDetect(com.vmware.vim25.BoolOption useAutoDetect) {
		this.useAutoDetect = useAutoDetect;
	}

	/**
	 * Gets the support3D value for this VirtualVideoCardOption.
	 * 
	 * @return support3D
	 */
	public com.vmware.vim25.BoolOption getSupport3D() {
		return support3D;
	}

	/**
	 * Sets the support3D value for this VirtualVideoCardOption.
	 * 
	 * @param support3D
	 */
	public void setSupport3D(com.vmware.vim25.BoolOption support3D) {
		this.support3D = support3D;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualVideoCardOption)) {
			return false;
		}
		VirtualVideoCardOption other = (VirtualVideoCardOption) obj;
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
				&& ((this.support3D == null && other.getSupport3D() == null) || (this.support3D != null && this.support3D
						.equals(other.getSupport3D())));
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
		if (getSupport3D() != null) {
			_hashCode += getSupport3D().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VirtualVideoCardOption.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualVideoCardOption"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("videoRamSizeInKB");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"videoRamSizeInKB"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"LongOption"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numDisplays");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"numDisplays"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"IntOption"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("useAutoDetect");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"useAutoDetect"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"BoolOption"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("support3D");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"support3D"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"BoolOption"));
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
