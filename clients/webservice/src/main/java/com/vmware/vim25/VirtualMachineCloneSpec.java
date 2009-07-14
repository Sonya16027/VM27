/**
 * VirtualMachineCloneSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualMachineCloneSpec extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.VirtualMachineRelocateSpec location;

	private boolean template;

	private com.vmware.vim25.VirtualMachineConfigSpec config;

	private com.vmware.vim25.CustomizationSpec customization;

	private boolean powerOn;

	private com.vmware.vim25.ManagedObjectReference snapshot;

	public VirtualMachineCloneSpec() {
	}

	public VirtualMachineCloneSpec(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.VirtualMachineRelocateSpec location,
			boolean template, com.vmware.vim25.VirtualMachineConfigSpec config,
			com.vmware.vim25.CustomizationSpec customization, boolean powerOn,
			com.vmware.vim25.ManagedObjectReference snapshot) {
		super(dynamicType, dynamicProperty);
		this.location = location;
		this.template = template;
		this.config = config;
		this.customization = customization;
		this.powerOn = powerOn;
		this.snapshot = snapshot;
	}

	/**
	 * Gets the location value for this VirtualMachineCloneSpec.
	 * 
	 * @return location
	 */
	public com.vmware.vim25.VirtualMachineRelocateSpec getLocation() {
		return location;
	}

	/**
	 * Sets the location value for this VirtualMachineCloneSpec.
	 * 
	 * @param location
	 */
	public void setLocation(com.vmware.vim25.VirtualMachineRelocateSpec location) {
		this.location = location;
	}

	/**
	 * Gets the template value for this VirtualMachineCloneSpec.
	 * 
	 * @return template
	 */
	public boolean isTemplate() {
		return template;
	}

	/**
	 * Sets the template value for this VirtualMachineCloneSpec.
	 * 
	 * @param template
	 */
	public void setTemplate(boolean template) {
		this.template = template;
	}

	/**
	 * Gets the config value for this VirtualMachineCloneSpec.
	 * 
	 * @return config
	 */
	public com.vmware.vim25.VirtualMachineConfigSpec getConfig() {
		return config;
	}

	/**
	 * Sets the config value for this VirtualMachineCloneSpec.
	 * 
	 * @param config
	 */
	public void setConfig(com.vmware.vim25.VirtualMachineConfigSpec config) {
		this.config = config;
	}

	/**
	 * Gets the customization value for this VirtualMachineCloneSpec.
	 * 
	 * @return customization
	 */
	public com.vmware.vim25.CustomizationSpec getCustomization() {
		return customization;
	}

	/**
	 * Sets the customization value for this VirtualMachineCloneSpec.
	 * 
	 * @param customization
	 */
	public void setCustomization(
			com.vmware.vim25.CustomizationSpec customization) {
		this.customization = customization;
	}

	/**
	 * Gets the powerOn value for this VirtualMachineCloneSpec.
	 * 
	 * @return powerOn
	 */
	public boolean isPowerOn() {
		return powerOn;
	}

	/**
	 * Sets the powerOn value for this VirtualMachineCloneSpec.
	 * 
	 * @param powerOn
	 */
	public void setPowerOn(boolean powerOn) {
		this.powerOn = powerOn;
	}

	/**
	 * Gets the snapshot value for this VirtualMachineCloneSpec.
	 * 
	 * @return snapshot
	 */
	public com.vmware.vim25.ManagedObjectReference getSnapshot() {
		return snapshot;
	}

	/**
	 * Sets the snapshot value for this VirtualMachineCloneSpec.
	 * 
	 * @param snapshot
	 */
	public void setSnapshot(com.vmware.vim25.ManagedObjectReference snapshot) {
		this.snapshot = snapshot;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualMachineCloneSpec)) {
			return false;
		}
		VirtualMachineCloneSpec other = (VirtualMachineCloneSpec) obj;
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
				&& ((this.location == null && other.getLocation() == null) || (this.location != null && this.location
						.equals(other.getLocation())))
				&& this.template == other.isTemplate()
				&& ((this.config == null && other.getConfig() == null) || (this.config != null && this.config
						.equals(other.getConfig())))
				&& ((this.customization == null && other.getCustomization() == null) || (this.customization != null && this.customization
						.equals(other.getCustomization())))
				&& this.powerOn == other.isPowerOn()
				&& ((this.snapshot == null && other.getSnapshot() == null) || (this.snapshot != null && this.snapshot
						.equals(other.getSnapshot())));
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
		if (getLocation() != null) {
			_hashCode += getLocation().hashCode();
		}
		_hashCode += (isTemplate() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		if (getConfig() != null) {
			_hashCode += getConfig().hashCode();
		}
		if (getCustomization() != null) {
			_hashCode += getCustomization().hashCode();
		}
		_hashCode += (isPowerOn() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		if (getSnapshot() != null) {
			_hashCode += getSnapshot().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VirtualMachineCloneSpec.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachineCloneSpec"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("location");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"location"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachineRelocateSpec"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("template");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"template"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("config");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"config"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachineConfigSpec"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("customization");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"customization"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"CustomizationSpec"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("powerOn");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"powerOn"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
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
