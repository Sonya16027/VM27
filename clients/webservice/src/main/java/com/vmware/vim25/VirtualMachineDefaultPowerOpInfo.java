/**
 * VirtualMachineDefaultPowerOpInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualMachineDefaultPowerOpInfo extends
		com.vmware.vim25.DynamicData implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String powerOffType;

	private java.lang.String suspendType;

	private java.lang.String resetType;

	private java.lang.String defaultPowerOffType;

	private java.lang.String defaultSuspendType;

	private java.lang.String defaultResetType;

	private java.lang.String standbyAction;

	public VirtualMachineDefaultPowerOpInfo() {
	}

	public VirtualMachineDefaultPowerOpInfo(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String powerOffType, java.lang.String suspendType,
			java.lang.String resetType, java.lang.String defaultPowerOffType,
			java.lang.String defaultSuspendType,
			java.lang.String defaultResetType, java.lang.String standbyAction) {
		super(dynamicType, dynamicProperty);
		this.powerOffType = powerOffType;
		this.suspendType = suspendType;
		this.resetType = resetType;
		this.defaultPowerOffType = defaultPowerOffType;
		this.defaultSuspendType = defaultSuspendType;
		this.defaultResetType = defaultResetType;
		this.standbyAction = standbyAction;
	}

	/**
	 * Gets the powerOffType value for this VirtualMachineDefaultPowerOpInfo.
	 * 
	 * @return powerOffType
	 */
	public java.lang.String getPowerOffType() {
		return powerOffType;
	}

	/**
	 * Sets the powerOffType value for this VirtualMachineDefaultPowerOpInfo.
	 * 
	 * @param powerOffType
	 */
	public void setPowerOffType(java.lang.String powerOffType) {
		this.powerOffType = powerOffType;
	}

	/**
	 * Gets the suspendType value for this VirtualMachineDefaultPowerOpInfo.
	 * 
	 * @return suspendType
	 */
	public java.lang.String getSuspendType() {
		return suspendType;
	}

	/**
	 * Sets the suspendType value for this VirtualMachineDefaultPowerOpInfo.
	 * 
	 * @param suspendType
	 */
	public void setSuspendType(java.lang.String suspendType) {
		this.suspendType = suspendType;
	}

	/**
	 * Gets the resetType value for this VirtualMachineDefaultPowerOpInfo.
	 * 
	 * @return resetType
	 */
	public java.lang.String getResetType() {
		return resetType;
	}

	/**
	 * Sets the resetType value for this VirtualMachineDefaultPowerOpInfo.
	 * 
	 * @param resetType
	 */
	public void setResetType(java.lang.String resetType) {
		this.resetType = resetType;
	}

	/**
	 * Gets the defaultPowerOffType value for this
	 * VirtualMachineDefaultPowerOpInfo.
	 * 
	 * @return defaultPowerOffType
	 */
	public java.lang.String getDefaultPowerOffType() {
		return defaultPowerOffType;
	}

	/**
	 * Sets the defaultPowerOffType value for this
	 * VirtualMachineDefaultPowerOpInfo.
	 * 
	 * @param defaultPowerOffType
	 */
	public void setDefaultPowerOffType(java.lang.String defaultPowerOffType) {
		this.defaultPowerOffType = defaultPowerOffType;
	}

	/**
	 * Gets the defaultSuspendType value for this
	 * VirtualMachineDefaultPowerOpInfo.
	 * 
	 * @return defaultSuspendType
	 */
	public java.lang.String getDefaultSuspendType() {
		return defaultSuspendType;
	}

	/**
	 * Sets the defaultSuspendType value for this
	 * VirtualMachineDefaultPowerOpInfo.
	 * 
	 * @param defaultSuspendType
	 */
	public void setDefaultSuspendType(java.lang.String defaultSuspendType) {
		this.defaultSuspendType = defaultSuspendType;
	}

	/**
	 * Gets the defaultResetType value for this
	 * VirtualMachineDefaultPowerOpInfo.
	 * 
	 * @return defaultResetType
	 */
	public java.lang.String getDefaultResetType() {
		return defaultResetType;
	}

	/**
	 * Sets the defaultResetType value for this
	 * VirtualMachineDefaultPowerOpInfo.
	 * 
	 * @param defaultResetType
	 */
	public void setDefaultResetType(java.lang.String defaultResetType) {
		this.defaultResetType = defaultResetType;
	}

	/**
	 * Gets the standbyAction value for this VirtualMachineDefaultPowerOpInfo.
	 * 
	 * @return standbyAction
	 */
	public java.lang.String getStandbyAction() {
		return standbyAction;
	}

	/**
	 * Sets the standbyAction value for this VirtualMachineDefaultPowerOpInfo.
	 * 
	 * @param standbyAction
	 */
	public void setStandbyAction(java.lang.String standbyAction) {
		this.standbyAction = standbyAction;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualMachineDefaultPowerOpInfo)) {
			return false;
		}
		VirtualMachineDefaultPowerOpInfo other = (VirtualMachineDefaultPowerOpInfo) obj;
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
				&& ((this.powerOffType == null && other.getPowerOffType() == null) || (this.powerOffType != null && this.powerOffType
						.equals(other.getPowerOffType())))
				&& ((this.suspendType == null && other.getSuspendType() == null) || (this.suspendType != null && this.suspendType
						.equals(other.getSuspendType())))
				&& ((this.resetType == null && other.getResetType() == null) || (this.resetType != null && this.resetType
						.equals(other.getResetType())))
				&& ((this.defaultPowerOffType == null && other
						.getDefaultPowerOffType() == null) || (this.defaultPowerOffType != null && this.defaultPowerOffType
						.equals(other.getDefaultPowerOffType())))
				&& ((this.defaultSuspendType == null && other
						.getDefaultSuspendType() == null) || (this.defaultSuspendType != null && this.defaultSuspendType
						.equals(other.getDefaultSuspendType())))
				&& ((this.defaultResetType == null && other
						.getDefaultResetType() == null) || (this.defaultResetType != null && this.defaultResetType
						.equals(other.getDefaultResetType())))
				&& ((this.standbyAction == null && other.getStandbyAction() == null) || (this.standbyAction != null && this.standbyAction
						.equals(other.getStandbyAction())));
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
		if (getPowerOffType() != null) {
			_hashCode += getPowerOffType().hashCode();
		}
		if (getSuspendType() != null) {
			_hashCode += getSuspendType().hashCode();
		}
		if (getResetType() != null) {
			_hashCode += getResetType().hashCode();
		}
		if (getDefaultPowerOffType() != null) {
			_hashCode += getDefaultPowerOffType().hashCode();
		}
		if (getDefaultSuspendType() != null) {
			_hashCode += getDefaultSuspendType().hashCode();
		}
		if (getDefaultResetType() != null) {
			_hashCode += getDefaultResetType().hashCode();
		}
		if (getStandbyAction() != null) {
			_hashCode += getStandbyAction().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VirtualMachineDefaultPowerOpInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachineDefaultPowerOpInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("powerOffType");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"powerOffType"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("suspendType");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"suspendType"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("resetType");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"resetType"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("defaultPowerOffType");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"defaultPowerOffType"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("defaultSuspendType");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"defaultSuspendType"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("defaultResetType");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"defaultResetType"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("standbyAction");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"standbyAction"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
