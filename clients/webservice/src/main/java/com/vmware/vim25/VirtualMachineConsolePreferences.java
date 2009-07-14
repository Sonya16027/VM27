/**
 * VirtualMachineConsolePreferences.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualMachineConsolePreferences extends
		com.vmware.vim25.DynamicData implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.Boolean powerOnWhenOpened;

	private java.lang.Boolean enterFullScreenOnPowerOn;

	private java.lang.Boolean closeOnPowerOffOrSuspend;

	public VirtualMachineConsolePreferences() {
	}

	public VirtualMachineConsolePreferences(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.Boolean powerOnWhenOpened,
			java.lang.Boolean enterFullScreenOnPowerOn,
			java.lang.Boolean closeOnPowerOffOrSuspend) {
		super(dynamicType, dynamicProperty);
		this.powerOnWhenOpened = powerOnWhenOpened;
		this.enterFullScreenOnPowerOn = enterFullScreenOnPowerOn;
		this.closeOnPowerOffOrSuspend = closeOnPowerOffOrSuspend;
	}

	/**
	 * Gets the powerOnWhenOpened value for this
	 * VirtualMachineConsolePreferences.
	 * 
	 * @return powerOnWhenOpened
	 */
	public java.lang.Boolean getPowerOnWhenOpened() {
		return powerOnWhenOpened;
	}

	/**
	 * Sets the powerOnWhenOpened value for this
	 * VirtualMachineConsolePreferences.
	 * 
	 * @param powerOnWhenOpened
	 */
	public void setPowerOnWhenOpened(java.lang.Boolean powerOnWhenOpened) {
		this.powerOnWhenOpened = powerOnWhenOpened;
	}

	/**
	 * Gets the enterFullScreenOnPowerOn value for this
	 * VirtualMachineConsolePreferences.
	 * 
	 * @return enterFullScreenOnPowerOn
	 */
	public java.lang.Boolean getEnterFullScreenOnPowerOn() {
		return enterFullScreenOnPowerOn;
	}

	/**
	 * Sets the enterFullScreenOnPowerOn value for this
	 * VirtualMachineConsolePreferences.
	 * 
	 * @param enterFullScreenOnPowerOn
	 */
	public void setEnterFullScreenOnPowerOn(
			java.lang.Boolean enterFullScreenOnPowerOn) {
		this.enterFullScreenOnPowerOn = enterFullScreenOnPowerOn;
	}

	/**
	 * Gets the closeOnPowerOffOrSuspend value for this
	 * VirtualMachineConsolePreferences.
	 * 
	 * @return closeOnPowerOffOrSuspend
	 */
	public java.lang.Boolean getCloseOnPowerOffOrSuspend() {
		return closeOnPowerOffOrSuspend;
	}

	/**
	 * Sets the closeOnPowerOffOrSuspend value for this
	 * VirtualMachineConsolePreferences.
	 * 
	 * @param closeOnPowerOffOrSuspend
	 */
	public void setCloseOnPowerOffOrSuspend(
			java.lang.Boolean closeOnPowerOffOrSuspend) {
		this.closeOnPowerOffOrSuspend = closeOnPowerOffOrSuspend;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualMachineConsolePreferences)) {
			return false;
		}
		VirtualMachineConsolePreferences other = (VirtualMachineConsolePreferences) obj;
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
				&& ((this.powerOnWhenOpened == null && other
						.getPowerOnWhenOpened() == null) || (this.powerOnWhenOpened != null && this.powerOnWhenOpened
						.equals(other.getPowerOnWhenOpened())))
				&& ((this.enterFullScreenOnPowerOn == null && other
						.getEnterFullScreenOnPowerOn() == null) || (this.enterFullScreenOnPowerOn != null && this.enterFullScreenOnPowerOn
						.equals(other.getEnterFullScreenOnPowerOn())))
				&& ((this.closeOnPowerOffOrSuspend == null && other
						.getCloseOnPowerOffOrSuspend() == null) || (this.closeOnPowerOffOrSuspend != null && this.closeOnPowerOffOrSuspend
						.equals(other.getCloseOnPowerOffOrSuspend())));
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
		if (getPowerOnWhenOpened() != null) {
			_hashCode += getPowerOnWhenOpened().hashCode();
		}
		if (getEnterFullScreenOnPowerOn() != null) {
			_hashCode += getEnterFullScreenOnPowerOn().hashCode();
		}
		if (getCloseOnPowerOffOrSuspend() != null) {
			_hashCode += getCloseOnPowerOffOrSuspend().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VirtualMachineConsolePreferences.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachineConsolePreferences"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("powerOnWhenOpened");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"powerOnWhenOpened"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("enterFullScreenOnPowerOn");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"enterFullScreenOnPowerOn"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("closeOnPowerOffOrSuspend");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"closeOnPowerOffOrSuspend"));
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
