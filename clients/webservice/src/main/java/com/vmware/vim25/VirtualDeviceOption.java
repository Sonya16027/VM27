/**
 * VirtualDeviceOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualDeviceOption extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String type;

	private com.vmware.vim25.VirtualDeviceConnectOption connectOption;

	private java.lang.String controllerType;

	private com.vmware.vim25.BoolOption autoAssignController;

	private com.vmware.vim25.VirtualDeviceBackingOption[] backingOption;

	private java.lang.Integer defaultBackingOptionIndex;

	private java.lang.String[] licensingLimit;

	private boolean deprecated;

	private boolean plugAndPlay;

	private java.lang.Boolean hotRemoveSupported;

	public VirtualDeviceOption() {
	}

	public VirtualDeviceOption(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String type,
			com.vmware.vim25.VirtualDeviceConnectOption connectOption,
			java.lang.String controllerType,
			com.vmware.vim25.BoolOption autoAssignController,
			com.vmware.vim25.VirtualDeviceBackingOption[] backingOption,
			java.lang.Integer defaultBackingOptionIndex,
			java.lang.String[] licensingLimit, boolean deprecated,
			boolean plugAndPlay, java.lang.Boolean hotRemoveSupported) {
		super(dynamicType, dynamicProperty);
		this.type = type;
		this.connectOption = connectOption;
		this.controllerType = controllerType;
		this.autoAssignController = autoAssignController;
		this.backingOption = backingOption;
		this.defaultBackingOptionIndex = defaultBackingOptionIndex;
		this.licensingLimit = licensingLimit;
		this.deprecated = deprecated;
		this.plugAndPlay = plugAndPlay;
		this.hotRemoveSupported = hotRemoveSupported;
	}

	/**
	 * Gets the type value for this VirtualDeviceOption.
	 * 
	 * @return type
	 */
	public java.lang.String getType() {
		return type;
	}

	/**
	 * Sets the type value for this VirtualDeviceOption.
	 * 
	 * @param type
	 */
	public void setType(java.lang.String type) {
		this.type = type;
	}

	/**
	 * Gets the connectOption value for this VirtualDeviceOption.
	 * 
	 * @return connectOption
	 */
	public com.vmware.vim25.VirtualDeviceConnectOption getConnectOption() {
		return connectOption;
	}

	/**
	 * Sets the connectOption value for this VirtualDeviceOption.
	 * 
	 * @param connectOption
	 */
	public void setConnectOption(
			com.vmware.vim25.VirtualDeviceConnectOption connectOption) {
		this.connectOption = connectOption;
	}

	/**
	 * Gets the controllerType value for this VirtualDeviceOption.
	 * 
	 * @return controllerType
	 */
	public java.lang.String getControllerType() {
		return controllerType;
	}

	/**
	 * Sets the controllerType value for this VirtualDeviceOption.
	 * 
	 * @param controllerType
	 */
	public void setControllerType(java.lang.String controllerType) {
		this.controllerType = controllerType;
	}

	/**
	 * Gets the autoAssignController value for this VirtualDeviceOption.
	 * 
	 * @return autoAssignController
	 */
	public com.vmware.vim25.BoolOption getAutoAssignController() {
		return autoAssignController;
	}

	/**
	 * Sets the autoAssignController value for this VirtualDeviceOption.
	 * 
	 * @param autoAssignController
	 */
	public void setAutoAssignController(
			com.vmware.vim25.BoolOption autoAssignController) {
		this.autoAssignController = autoAssignController;
	}

	/**
	 * Gets the backingOption value for this VirtualDeviceOption.
	 * 
	 * @return backingOption
	 */
	public com.vmware.vim25.VirtualDeviceBackingOption[] getBackingOption() {
		return backingOption;
	}

	/**
	 * Sets the backingOption value for this VirtualDeviceOption.
	 * 
	 * @param backingOption
	 */
	public void setBackingOption(
			com.vmware.vim25.VirtualDeviceBackingOption[] backingOption) {
		this.backingOption = backingOption;
	}

	public com.vmware.vim25.VirtualDeviceBackingOption getBackingOption(int i) {
		return this.backingOption[i];
	}

	public void setBackingOption(int i,
			com.vmware.vim25.VirtualDeviceBackingOption _value) {
		this.backingOption[i] = _value;
	}

	/**
	 * Gets the defaultBackingOptionIndex value for this VirtualDeviceOption.
	 * 
	 * @return defaultBackingOptionIndex
	 */
	public java.lang.Integer getDefaultBackingOptionIndex() {
		return defaultBackingOptionIndex;
	}

	/**
	 * Sets the defaultBackingOptionIndex value for this VirtualDeviceOption.
	 * 
	 * @param defaultBackingOptionIndex
	 */
	public void setDefaultBackingOptionIndex(
			java.lang.Integer defaultBackingOptionIndex) {
		this.defaultBackingOptionIndex = defaultBackingOptionIndex;
	}

	/**
	 * Gets the licensingLimit value for this VirtualDeviceOption.
	 * 
	 * @return licensingLimit
	 */
	public java.lang.String[] getLicensingLimit() {
		return licensingLimit;
	}

	/**
	 * Sets the licensingLimit value for this VirtualDeviceOption.
	 * 
	 * @param licensingLimit
	 */
	public void setLicensingLimit(java.lang.String[] licensingLimit) {
		this.licensingLimit = licensingLimit;
	}

	public java.lang.String getLicensingLimit(int i) {
		return this.licensingLimit[i];
	}

	public void setLicensingLimit(int i, java.lang.String _value) {
		this.licensingLimit[i] = _value;
	}

	/**
	 * Gets the deprecated value for this VirtualDeviceOption.
	 * 
	 * @return deprecated
	 */
	public boolean isDeprecated() {
		return deprecated;
	}

	/**
	 * Sets the deprecated value for this VirtualDeviceOption.
	 * 
	 * @param deprecated
	 */
	public void setDeprecated(boolean deprecated) {
		this.deprecated = deprecated;
	}

	/**
	 * Gets the plugAndPlay value for this VirtualDeviceOption.
	 * 
	 * @return plugAndPlay
	 */
	public boolean isPlugAndPlay() {
		return plugAndPlay;
	}

	/**
	 * Sets the plugAndPlay value for this VirtualDeviceOption.
	 * 
	 * @param plugAndPlay
	 */
	public void setPlugAndPlay(boolean plugAndPlay) {
		this.plugAndPlay = plugAndPlay;
	}

	/**
	 * Gets the hotRemoveSupported value for this VirtualDeviceOption.
	 * 
	 * @return hotRemoveSupported
	 */
	public java.lang.Boolean getHotRemoveSupported() {
		return hotRemoveSupported;
	}

	/**
	 * Sets the hotRemoveSupported value for this VirtualDeviceOption.
	 * 
	 * @param hotRemoveSupported
	 */
	public void setHotRemoveSupported(java.lang.Boolean hotRemoveSupported) {
		this.hotRemoveSupported = hotRemoveSupported;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualDeviceOption)) {
			return false;
		}
		VirtualDeviceOption other = (VirtualDeviceOption) obj;
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
				&& ((this.type == null && other.getType() == null) || (this.type != null && this.type
						.equals(other.getType())))
				&& ((this.connectOption == null && other.getConnectOption() == null) || (this.connectOption != null && this.connectOption
						.equals(other.getConnectOption())))
				&& ((this.controllerType == null && other.getControllerType() == null) || (this.controllerType != null && this.controllerType
						.equals(other.getControllerType())))
				&& ((this.autoAssignController == null && other
						.getAutoAssignController() == null) || (this.autoAssignController != null && this.autoAssignController
						.equals(other.getAutoAssignController())))
				&& ((this.backingOption == null && other.getBackingOption() == null) || (this.backingOption != null && java.util.Arrays
						.equals(this.backingOption, other.getBackingOption())))
				&& ((this.defaultBackingOptionIndex == null && other
						.getDefaultBackingOptionIndex() == null) || (this.defaultBackingOptionIndex != null && this.defaultBackingOptionIndex
						.equals(other.getDefaultBackingOptionIndex())))
				&& ((this.licensingLimit == null && other.getLicensingLimit() == null) || (this.licensingLimit != null && java.util.Arrays
						.equals(this.licensingLimit, other.getLicensingLimit())))
				&& this.deprecated == other.isDeprecated()
				&& this.plugAndPlay == other.isPlugAndPlay()
				&& ((this.hotRemoveSupported == null && other
						.getHotRemoveSupported() == null) || (this.hotRemoveSupported != null && this.hotRemoveSupported
						.equals(other.getHotRemoveSupported())));
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
		if (getType() != null) {
			_hashCode += getType().hashCode();
		}
		if (getConnectOption() != null) {
			_hashCode += getConnectOption().hashCode();
		}
		if (getControllerType() != null) {
			_hashCode += getControllerType().hashCode();
		}
		if (getAutoAssignController() != null) {
			_hashCode += getAutoAssignController().hashCode();
		}
		if (getBackingOption() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getBackingOption()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getBackingOption(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getDefaultBackingOptionIndex() != null) {
			_hashCode += getDefaultBackingOptionIndex().hashCode();
		}
		if (getLicensingLimit() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getLicensingLimit()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getLicensingLimit(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		_hashCode += (isDeprecated() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		_hashCode += (isPlugAndPlay() ? Boolean.TRUE : Boolean.FALSE)
				.hashCode();
		if (getHotRemoveSupported() != null) {
			_hashCode += getHotRemoveSupported().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VirtualDeviceOption.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualDeviceOption"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("type");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "type"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("connectOption");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"connectOption"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualDeviceConnectOption"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("controllerType");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"controllerType"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("autoAssignController");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"autoAssignController"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"BoolOption"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("backingOption");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"backingOption"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualDeviceBackingOption"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("defaultBackingOptionIndex");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"defaultBackingOptionIndex"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("licensingLimit");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"licensingLimit"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("deprecated");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"deprecated"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("plugAndPlay");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"plugAndPlay"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hotRemoveSupported");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"hotRemoveSupported"));
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
