/**
 * SendEmailAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class SendEmailAction extends com.vmware.vim25.Action implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String toList;

	private java.lang.String ccList;

	private java.lang.String subject;

	private java.lang.String body;

	public SendEmailAction() {
	}

	public SendEmailAction(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String toList, java.lang.String ccList,
			java.lang.String subject, java.lang.String body) {
		super(dynamicType, dynamicProperty);
		this.toList = toList;
		this.ccList = ccList;
		this.subject = subject;
		this.body = body;
	}

	/**
	 * Gets the toList value for this SendEmailAction.
	 * 
	 * @return toList
	 */
	public java.lang.String getToList() {
		return toList;
	}

	/**
	 * Sets the toList value for this SendEmailAction.
	 * 
	 * @param toList
	 */
	public void setToList(java.lang.String toList) {
		this.toList = toList;
	}

	/**
	 * Gets the ccList value for this SendEmailAction.
	 * 
	 * @return ccList
	 */
	public java.lang.String getCcList() {
		return ccList;
	}

	/**
	 * Sets the ccList value for this SendEmailAction.
	 * 
	 * @param ccList
	 */
	public void setCcList(java.lang.String ccList) {
		this.ccList = ccList;
	}

	/**
	 * Gets the subject value for this SendEmailAction.
	 * 
	 * @return subject
	 */
	public java.lang.String getSubject() {
		return subject;
	}

	/**
	 * Sets the subject value for this SendEmailAction.
	 * 
	 * @param subject
	 */
	public void setSubject(java.lang.String subject) {
		this.subject = subject;
	}

	/**
	 * Gets the body value for this SendEmailAction.
	 * 
	 * @return body
	 */
	public java.lang.String getBody() {
		return body;
	}

	/**
	 * Sets the body value for this SendEmailAction.
	 * 
	 * @param body
	 */
	public void setBody(java.lang.String body) {
		this.body = body;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof SendEmailAction)) {
			return false;
		}
		SendEmailAction other = (SendEmailAction) obj;
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
				&& ((this.toList == null && other.getToList() == null) || (this.toList != null && this.toList
						.equals(other.getToList())))
				&& ((this.ccList == null && other.getCcList() == null) || (this.ccList != null && this.ccList
						.equals(other.getCcList())))
				&& ((this.subject == null && other.getSubject() == null) || (this.subject != null && this.subject
						.equals(other.getSubject())))
				&& ((this.body == null && other.getBody() == null) || (this.body != null && this.body
						.equals(other.getBody())));
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
		if (getToList() != null) {
			_hashCode += getToList().hashCode();
		}
		if (getCcList() != null) {
			_hashCode += getCcList().hashCode();
		}
		if (getSubject() != null) {
			_hashCode += getSubject().hashCode();
		}
		if (getBody() != null) {
			_hashCode += getBody().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			SendEmailAction.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"SendEmailAction"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("toList");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"toList"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ccList");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"ccList"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("subject");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"subject"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("body");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "body"));
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

}
