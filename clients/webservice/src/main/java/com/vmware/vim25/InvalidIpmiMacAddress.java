/**
 * InvalidIpmiMacAddress.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class InvalidIpmiMacAddress extends com.vmware.vim25.VimFault implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String userProvidedMacAddress;

	private java.lang.String observedMacAddress;

	public InvalidIpmiMacAddress() {
	}

	public InvalidIpmiMacAddress(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.LocalizedMethodFault faultCause,
			com.vmware.vim25.LocalizableMessage[] faultMessage,
			java.lang.String userProvidedMacAddress,
			java.lang.String observedMacAddress) {
		super(dynamicType, dynamicProperty, faultCause, faultMessage);
		this.userProvidedMacAddress = userProvidedMacAddress;
		this.observedMacAddress = observedMacAddress;
	}

	/**
	 * Gets the userProvidedMacAddress value for this InvalidIpmiMacAddress.
	 * 
	 * @return userProvidedMacAddress
	 */
	public java.lang.String getUserProvidedMacAddress() {
		return userProvidedMacAddress;
	}

	/**
	 * Sets the userProvidedMacAddress value for this InvalidIpmiMacAddress.
	 * 
	 * @param userProvidedMacAddress
	 */
	public void setUserProvidedMacAddress(
			java.lang.String userProvidedMacAddress) {
		this.userProvidedMacAddress = userProvidedMacAddress;
	}

	/**
	 * Gets the observedMacAddress value for this InvalidIpmiMacAddress.
	 * 
	 * @return observedMacAddress
	 */
	public java.lang.String getObservedMacAddress() {
		return observedMacAddress;
	}

	/**
	 * Sets the observedMacAddress value for this InvalidIpmiMacAddress.
	 * 
	 * @param observedMacAddress
	 */
	public void setObservedMacAddress(java.lang.String observedMacAddress) {
		this.observedMacAddress = observedMacAddress;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof InvalidIpmiMacAddress)) {
			return false;
		}
		InvalidIpmiMacAddress other = (InvalidIpmiMacAddress) obj;
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
				&& ((this.userProvidedMacAddress == null && other
						.getUserProvidedMacAddress() == null) || (this.userProvidedMacAddress != null && this.userProvidedMacAddress
						.equals(other.getUserProvidedMacAddress())))
				&& ((this.observedMacAddress == null && other
						.getObservedMacAddress() == null) || (this.observedMacAddress != null && this.observedMacAddress
						.equals(other.getObservedMacAddress())));
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
		if (getUserProvidedMacAddress() != null) {
			_hashCode += getUserProvidedMacAddress().hashCode();
		}
		if (getObservedMacAddress() != null) {
			_hashCode += getObservedMacAddress().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			InvalidIpmiMacAddress.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"InvalidIpmiMacAddress"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("userProvidedMacAddress");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"userProvidedMacAddress"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("observedMacAddress");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"observedMacAddress"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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

	/**
	 * Writes the exception data to the faultDetails
	 */
	@Override
	public void writeDetails(javax.xml.namespace.QName qname,
			org.apache.axis.encoding.SerializationContext context)
			throws java.io.IOException {
		context.serialize(qname, null, this);
	}
}
