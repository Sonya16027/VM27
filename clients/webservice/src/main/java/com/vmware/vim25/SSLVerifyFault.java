/**
 * SSLVerifyFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class SSLVerifyFault extends com.vmware.vim25.HostConnectFault implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private boolean selfSigned;

	private java.lang.String thumbprint;

	public SSLVerifyFault() {
	}

	public SSLVerifyFault(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.LocalizedMethodFault faultCause,
			com.vmware.vim25.LocalizableMessage[] faultMessage,
			boolean selfSigned, java.lang.String thumbprint) {
		super(dynamicType, dynamicProperty, faultCause, faultMessage);
		this.selfSigned = selfSigned;
		this.thumbprint = thumbprint;
	}

	/**
	 * Gets the selfSigned value for this SSLVerifyFault.
	 * 
	 * @return selfSigned
	 */
	public boolean isSelfSigned() {
		return selfSigned;
	}

	/**
	 * Sets the selfSigned value for this SSLVerifyFault.
	 * 
	 * @param selfSigned
	 */
	public void setSelfSigned(boolean selfSigned) {
		this.selfSigned = selfSigned;
	}

	/**
	 * Gets the thumbprint value for this SSLVerifyFault.
	 * 
	 * @return thumbprint
	 */
	public java.lang.String getThumbprint() {
		return thumbprint;
	}

	/**
	 * Sets the thumbprint value for this SSLVerifyFault.
	 * 
	 * @param thumbprint
	 */
	public void setThumbprint(java.lang.String thumbprint) {
		this.thumbprint = thumbprint;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof SSLVerifyFault)) {
			return false;
		}
		SSLVerifyFault other = (SSLVerifyFault) obj;
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
				&& this.selfSigned == other.isSelfSigned()
				&& ((this.thumbprint == null && other.getThumbprint() == null) || (this.thumbprint != null && this.thumbprint
						.equals(other.getThumbprint())));
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
		_hashCode += (isSelfSigned() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		if (getThumbprint() != null) {
			_hashCode += getThumbprint().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			SSLVerifyFault.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"SSLVerifyFault"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("selfSigned");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"selfSigned"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("thumbprint");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"thumbprint"));
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
