/**
 * ProfileExecuteError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ProfileExecuteError extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ProfilePropertyPath path;

	private com.vmware.vim25.LocalizableMessage message;

	public ProfileExecuteError() {
	}

	public ProfileExecuteError(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.ProfilePropertyPath path,
			com.vmware.vim25.LocalizableMessage message) {
		super(dynamicType, dynamicProperty);
		this.path = path;
		this.message = message;
	}

	/**
	 * Gets the path value for this ProfileExecuteError.
	 * 
	 * @return path
	 */
	public com.vmware.vim25.ProfilePropertyPath getPath() {
		return path;
	}

	/**
	 * Sets the path value for this ProfileExecuteError.
	 * 
	 * @param path
	 */
	public void setPath(com.vmware.vim25.ProfilePropertyPath path) {
		this.path = path;
	}

	/**
	 * Gets the message value for this ProfileExecuteError.
	 * 
	 * @return message
	 */
	public com.vmware.vim25.LocalizableMessage getMessage() {
		return message;
	}

	/**
	 * Sets the message value for this ProfileExecuteError.
	 * 
	 * @param message
	 */
	public void setMessage(com.vmware.vim25.LocalizableMessage message) {
		this.message = message;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ProfileExecuteError)) {
			return false;
		}
		ProfileExecuteError other = (ProfileExecuteError) obj;
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
				&& ((this.path == null && other.getPath() == null) || (this.path != null && this.path
						.equals(other.getPath())))
				&& ((this.message == null && other.getMessage() == null) || (this.message != null && this.message
						.equals(other.getMessage())));
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
		if (getPath() != null) {
			_hashCode += getPath().hashCode();
		}
		if (getMessage() != null) {
			_hashCode += getMessage().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ProfileExecuteError.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ProfileExecuteError"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("path");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "path"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ProfilePropertyPath"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("message");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"message"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"LocalizableMessage"));
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
