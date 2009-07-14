/**
 * DvsNotAuthorized.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class DvsNotAuthorized extends com.vmware.vim25.DvsFault implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String sessionExtensionKey;

	private java.lang.String dvsExtensionKey;

	public DvsNotAuthorized() {
	}

	public DvsNotAuthorized(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.LocalizedMethodFault faultCause,
			com.vmware.vim25.LocalizableMessage[] faultMessage,
			java.lang.String sessionExtensionKey,
			java.lang.String dvsExtensionKey) {
		super(dynamicType, dynamicProperty, faultCause, faultMessage);
		this.sessionExtensionKey = sessionExtensionKey;
		this.dvsExtensionKey = dvsExtensionKey;
	}

	/**
	 * Gets the sessionExtensionKey value for this DvsNotAuthorized.
	 * 
	 * @return sessionExtensionKey
	 */
	public java.lang.String getSessionExtensionKey() {
		return sessionExtensionKey;
	}

	/**
	 * Sets the sessionExtensionKey value for this DvsNotAuthorized.
	 * 
	 * @param sessionExtensionKey
	 */
	public void setSessionExtensionKey(java.lang.String sessionExtensionKey) {
		this.sessionExtensionKey = sessionExtensionKey;
	}

	/**
	 * Gets the dvsExtensionKey value for this DvsNotAuthorized.
	 * 
	 * @return dvsExtensionKey
	 */
	public java.lang.String getDvsExtensionKey() {
		return dvsExtensionKey;
	}

	/**
	 * Sets the dvsExtensionKey value for this DvsNotAuthorized.
	 * 
	 * @param dvsExtensionKey
	 */
	public void setDvsExtensionKey(java.lang.String dvsExtensionKey) {
		this.dvsExtensionKey = dvsExtensionKey;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof DvsNotAuthorized)) {
			return false;
		}
		DvsNotAuthorized other = (DvsNotAuthorized) obj;
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
				&& ((this.sessionExtensionKey == null && other
						.getSessionExtensionKey() == null) || (this.sessionExtensionKey != null && this.sessionExtensionKey
						.equals(other.getSessionExtensionKey())))
				&& ((this.dvsExtensionKey == null && other.getDvsExtensionKey() == null) || (this.dvsExtensionKey != null && this.dvsExtensionKey
						.equals(other.getDvsExtensionKey())));
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
		if (getSessionExtensionKey() != null) {
			_hashCode += getSessionExtensionKey().hashCode();
		}
		if (getDvsExtensionKey() != null) {
			_hashCode += getDvsExtensionKey().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			DvsNotAuthorized.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DvsNotAuthorized"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("sessionExtensionKey");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"sessionExtensionKey"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dvsExtensionKey");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"dvsExtensionKey"));
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
