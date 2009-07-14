/**
 * VirtualEthernetCardOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class VirtualEthernetCardOption extends
		com.vmware.vim.VirtualDeviceOption implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.ChoiceOption supportedOUI;

	private com.vmware.vim.ChoiceOption macType;

	private com.vmware.vim.BoolOption wakeOnLanEnabled;

	public VirtualEthernetCardOption() {
	}

	public VirtualEthernetCardOption(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			java.lang.String type,
			com.vmware.vim.VirtualDeviceConnectOption connectOption,
			java.lang.String controllerType,
			com.vmware.vim.BoolOption autoAssignController,
			com.vmware.vim.VirtualDeviceBackingOption[] backingOption,
			java.lang.Integer defaultBackingOptionIndex,
			java.lang.String[] licensingLimit, boolean deprecated,
			boolean plugAndPlay, com.vmware.vim.ChoiceOption supportedOUI,
			com.vmware.vim.ChoiceOption macType,
			com.vmware.vim.BoolOption wakeOnLanEnabled) {
		super(dynamicType, dynamicProperty, type, connectOption,
				controllerType, autoAssignController, backingOption,
				defaultBackingOptionIndex, licensingLimit, deprecated,
				plugAndPlay);
		this.supportedOUI = supportedOUI;
		this.macType = macType;
		this.wakeOnLanEnabled = wakeOnLanEnabled;
	}

	/**
	 * Gets the supportedOUI value for this VirtualEthernetCardOption.
	 * 
	 * @return supportedOUI
	 */
	public com.vmware.vim.ChoiceOption getSupportedOUI() {
		return supportedOUI;
	}

	/**
	 * Sets the supportedOUI value for this VirtualEthernetCardOption.
	 * 
	 * @param supportedOUI
	 */
	public void setSupportedOUI(com.vmware.vim.ChoiceOption supportedOUI) {
		this.supportedOUI = supportedOUI;
	}

	/**
	 * Gets the macType value for this VirtualEthernetCardOption.
	 * 
	 * @return macType
	 */
	public com.vmware.vim.ChoiceOption getMacType() {
		return macType;
	}

	/**
	 * Sets the macType value for this VirtualEthernetCardOption.
	 * 
	 * @param macType
	 */
	public void setMacType(com.vmware.vim.ChoiceOption macType) {
		this.macType = macType;
	}

	/**
	 * Gets the wakeOnLanEnabled value for this VirtualEthernetCardOption.
	 * 
	 * @return wakeOnLanEnabled
	 */
	public com.vmware.vim.BoolOption getWakeOnLanEnabled() {
		return wakeOnLanEnabled;
	}

	/**
	 * Sets the wakeOnLanEnabled value for this VirtualEthernetCardOption.
	 * 
	 * @param wakeOnLanEnabled
	 */
	public void setWakeOnLanEnabled(com.vmware.vim.BoolOption wakeOnLanEnabled) {
		this.wakeOnLanEnabled = wakeOnLanEnabled;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualEthernetCardOption)) {
			return false;
		}
		VirtualEthernetCardOption other = (VirtualEthernetCardOption) obj;
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
				&& ((this.supportedOUI == null && other.getSupportedOUI() == null) || (this.supportedOUI != null && this.supportedOUI
						.equals(other.getSupportedOUI())))
				&& ((this.macType == null && other.getMacType() == null) || (this.macType != null && this.macType
						.equals(other.getMacType())))
				&& ((this.wakeOnLanEnabled == null && other
						.getWakeOnLanEnabled() == null) || (this.wakeOnLanEnabled != null && this.wakeOnLanEnabled
						.equals(other.getWakeOnLanEnabled())));
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
		if (getSupportedOUI() != null) {
			_hashCode += getSupportedOUI().hashCode();
		}
		if (getMacType() != null) {
			_hashCode += getMacType().hashCode();
		}
		if (getWakeOnLanEnabled() != null) {
			_hashCode += getWakeOnLanEnabled().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VirtualEthernetCardOption.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualEthernetCardOption"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("supportedOUI");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"supportedOUI"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ChoiceOption"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("macType");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"macType"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ChoiceOption"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("wakeOnLanEnabled");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"wakeOnLanEnabled"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"BoolOption"));
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
