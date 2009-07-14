/**
 * ExtendedElementDescription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ExtendedElementDescription extends
		com.vmware.vim25.ElementDescription implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String messageCatalogKeyPrefix;

	private com.vmware.vim25.KeyAnyValue[] messageArg;

	public ExtendedElementDescription() {
	}

	public ExtendedElementDescription(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String label, java.lang.String summary,
			java.lang.String key, java.lang.String messageCatalogKeyPrefix,
			com.vmware.vim25.KeyAnyValue[] messageArg) {
		super(dynamicType, dynamicProperty, label, summary, key);
		this.messageCatalogKeyPrefix = messageCatalogKeyPrefix;
		this.messageArg = messageArg;
	}

	/**
	 * Gets the messageCatalogKeyPrefix value for this
	 * ExtendedElementDescription.
	 * 
	 * @return messageCatalogKeyPrefix
	 */
	public java.lang.String getMessageCatalogKeyPrefix() {
		return messageCatalogKeyPrefix;
	}

	/**
	 * Sets the messageCatalogKeyPrefix value for this
	 * ExtendedElementDescription.
	 * 
	 * @param messageCatalogKeyPrefix
	 */
	public void setMessageCatalogKeyPrefix(
			java.lang.String messageCatalogKeyPrefix) {
		this.messageCatalogKeyPrefix = messageCatalogKeyPrefix;
	}

	/**
	 * Gets the messageArg value for this ExtendedElementDescription.
	 * 
	 * @return messageArg
	 */
	public com.vmware.vim25.KeyAnyValue[] getMessageArg() {
		return messageArg;
	}

	/**
	 * Sets the messageArg value for this ExtendedElementDescription.
	 * 
	 * @param messageArg
	 */
	public void setMessageArg(com.vmware.vim25.KeyAnyValue[] messageArg) {
		this.messageArg = messageArg;
	}

	public com.vmware.vim25.KeyAnyValue getMessageArg(int i) {
		return this.messageArg[i];
	}

	public void setMessageArg(int i, com.vmware.vim25.KeyAnyValue _value) {
		this.messageArg[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ExtendedElementDescription)) {
			return false;
		}
		ExtendedElementDescription other = (ExtendedElementDescription) obj;
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
				&& ((this.messageCatalogKeyPrefix == null && other
						.getMessageCatalogKeyPrefix() == null) || (this.messageCatalogKeyPrefix != null && this.messageCatalogKeyPrefix
						.equals(other.getMessageCatalogKeyPrefix())))
				&& ((this.messageArg == null && other.getMessageArg() == null) || (this.messageArg != null && java.util.Arrays
						.equals(this.messageArg, other.getMessageArg())));
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
		if (getMessageCatalogKeyPrefix() != null) {
			_hashCode += getMessageCatalogKeyPrefix().hashCode();
		}
		if (getMessageArg() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getMessageArg()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getMessageArg(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ExtendedElementDescription.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ExtendedElementDescription"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("messageCatalogKeyPrefix");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"messageCatalogKeyPrefix"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("messageArg");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"messageArg"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"KeyAnyValue"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
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
