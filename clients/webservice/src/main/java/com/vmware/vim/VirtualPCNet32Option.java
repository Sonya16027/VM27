/**
 * VirtualPCNet32Option.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class VirtualPCNet32Option extends
		com.vmware.vim.VirtualEthernetCardOption implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean supportsMorphing;

	public VirtualPCNet32Option() {
	}

	public VirtualPCNet32Option(java.lang.String dynamicType,
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
			com.vmware.vim.BoolOption wakeOnLanEnabled, boolean supportsMorphing) {
		super(dynamicType, dynamicProperty, type, connectOption,
				controllerType, autoAssignController, backingOption,
				defaultBackingOptionIndex, licensingLimit, deprecated,
				plugAndPlay, supportedOUI, macType, wakeOnLanEnabled);
		this.supportsMorphing = supportsMorphing;
	}

	/**
	 * Gets the supportsMorphing value for this VirtualPCNet32Option.
	 * 
	 * @return supportsMorphing
	 */
	public boolean isSupportsMorphing() {
		return supportsMorphing;
	}

	/**
	 * Sets the supportsMorphing value for this VirtualPCNet32Option.
	 * 
	 * @param supportsMorphing
	 */
	public void setSupportsMorphing(boolean supportsMorphing) {
		this.supportsMorphing = supportsMorphing;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualPCNet32Option)) {
			return false;
		}
		VirtualPCNet32Option other = (VirtualPCNet32Option) obj;
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
				&& this.supportsMorphing == other.isSupportsMorphing();
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
		_hashCode += (isSupportsMorphing() ? Boolean.TRUE : Boolean.FALSE)
				.hashCode();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VirtualPCNet32Option.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualPCNet32Option"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("supportsMorphing");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"supportsMorphing"));
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
