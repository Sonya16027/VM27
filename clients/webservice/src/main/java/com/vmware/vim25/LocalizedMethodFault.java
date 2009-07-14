/**
 * LocalizedMethodFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class LocalizedMethodFault extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.MethodFault fault;

	private java.lang.String localizedMessage;

	public LocalizedMethodFault() {
	}

	public LocalizedMethodFault(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.MethodFault fault,
			java.lang.String localizedMessage) {
		super(dynamicType, dynamicProperty);
		this.fault = fault;
		this.localizedMessage = localizedMessage;
	}

	/**
	 * Gets the fault value for this LocalizedMethodFault.
	 * 
	 * @return fault
	 */
	public com.vmware.vim25.MethodFault getFault() {
		return fault;
	}

	/**
	 * Sets the fault value for this LocalizedMethodFault.
	 * 
	 * @param fault
	 */
	public void setFault(com.vmware.vim25.MethodFault fault) {
		this.fault = fault;
	}

	/**
	 * Gets the localizedMessage value for this LocalizedMethodFault.
	 * 
	 * @return localizedMessage
	 */
	public java.lang.String getLocalizedMessage() {
		return localizedMessage;
	}

	/**
	 * Sets the localizedMessage value for this LocalizedMethodFault.
	 * 
	 * @param localizedMessage
	 */
	public void setLocalizedMessage(java.lang.String localizedMessage) {
		this.localizedMessage = localizedMessage;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof LocalizedMethodFault)) {
			return false;
		}
		LocalizedMethodFault other = (LocalizedMethodFault) obj;
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
				&& ((this.fault == null && other.getFault() == null) || (this.fault != null && this.fault
						.equals(other.getFault())))
				&& ((this.localizedMessage == null && other
						.getLocalizedMessage() == null) || (this.localizedMessage != null && this.localizedMessage
						.equals(other.getLocalizedMessage())));
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
		if (getFault() != null) {
			_hashCode += getFault().hashCode();
		}
		if (getLocalizedMessage() != null) {
			_hashCode += getLocalizedMessage().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			LocalizedMethodFault.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"LocalizedMethodFault"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("fault");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "fault"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"MethodFault"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("localizedMessage");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"localizedMessage"));
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
