/**
 * UncustomizableGuest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class UncustomizableGuest extends com.vmware.vim25.CustomizationFault
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private java.lang.String uncustomizableGuestOS;

	public UncustomizableGuest() {
	}

	public UncustomizableGuest(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.LocalizedMethodFault faultCause,
			com.vmware.vim25.LocalizableMessage[] faultMessage,
			java.lang.String uncustomizableGuestOS) {
		super(dynamicType, dynamicProperty, faultCause, faultMessage);
		this.uncustomizableGuestOS = uncustomizableGuestOS;
	}

	/**
	 * Gets the uncustomizableGuestOS value for this UncustomizableGuest.
	 * 
	 * @return uncustomizableGuestOS
	 */
	public java.lang.String getUncustomizableGuestOS() {
		return uncustomizableGuestOS;
	}

	/**
	 * Sets the uncustomizableGuestOS value for this UncustomizableGuest.
	 * 
	 * @param uncustomizableGuestOS
	 */
	public void setUncustomizableGuestOS(java.lang.String uncustomizableGuestOS) {
		this.uncustomizableGuestOS = uncustomizableGuestOS;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof UncustomizableGuest)) {
			return false;
		}
		UncustomizableGuest other = (UncustomizableGuest) obj;
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
				&& ((this.uncustomizableGuestOS == null && other
						.getUncustomizableGuestOS() == null) || (this.uncustomizableGuestOS != null && this.uncustomizableGuestOS
						.equals(other.getUncustomizableGuestOS())));
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
		if (getUncustomizableGuestOS() != null) {
			_hashCode += getUncustomizableGuestOS().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			UncustomizableGuest.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"UncustomizableGuest"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("uncustomizableGuestOS");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"uncustomizableGuestOS"));
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
