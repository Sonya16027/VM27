/**
 * UpdateDvsCapabilityRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class UpdateDvsCapabilityRequestType implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference _this;

	private com.vmware.vim25.DVSCapability capability;

	public UpdateDvsCapabilityRequestType() {
	}

	public UpdateDvsCapabilityRequestType(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.DVSCapability capability) {
		this._this = _this;
		this.capability = capability;
	}

	/**
	 * Gets the _this value for this UpdateDvsCapabilityRequestType.
	 * 
	 * @return _this
	 */
	public com.vmware.vim25.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this UpdateDvsCapabilityRequestType.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim25.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the capability value for this UpdateDvsCapabilityRequestType.
	 * 
	 * @return capability
	 */
	public com.vmware.vim25.DVSCapability getCapability() {
		return capability;
	}

	/**
	 * Sets the capability value for this UpdateDvsCapabilityRequestType.
	 * 
	 * @param capability
	 */
	public void setCapability(com.vmware.vim25.DVSCapability capability) {
		this.capability = capability;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof UpdateDvsCapabilityRequestType)) {
			return false;
		}
		UpdateDvsCapabilityRequestType other = (UpdateDvsCapabilityRequestType) obj;
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
		_equals = true
				&& ((this._this == null && other.get_this() == null) || (this._this != null && this._this
						.equals(other.get_this())))
				&& ((this.capability == null && other.getCapability() == null) || (this.capability != null && this.capability
						.equals(other.getCapability())));
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
		int _hashCode = 1;
		if (get_this() != null) {
			_hashCode += get_this().hashCode();
		}
		if (getCapability() != null) {
			_hashCode += getCapability().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			UpdateDvsCapabilityRequestType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"UpdateDvsCapabilityRequestType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("capability");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"capability"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DVSCapability"));
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
