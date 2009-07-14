/**
 * NotSupportedHost.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class NotSupportedHost extends com.vmware.vim.HostConnectFault implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String productName;

	private java.lang.String productVersion;

	public NotSupportedHost() {
	}

	public NotSupportedHost(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			java.lang.String productName, java.lang.String productVersion) {
		super(dynamicType, dynamicProperty);
		this.productName = productName;
		this.productVersion = productVersion;
	}

	/**
	 * Gets the productName value for this NotSupportedHost.
	 * 
	 * @return productName
	 */
	public java.lang.String getProductName() {
		return productName;
	}

	/**
	 * Sets the productName value for this NotSupportedHost.
	 * 
	 * @param productName
	 */
	public void setProductName(java.lang.String productName) {
		this.productName = productName;
	}

	/**
	 * Gets the productVersion value for this NotSupportedHost.
	 * 
	 * @return productVersion
	 */
	public java.lang.String getProductVersion() {
		return productVersion;
	}

	/**
	 * Sets the productVersion value for this NotSupportedHost.
	 * 
	 * @param productVersion
	 */
	public void setProductVersion(java.lang.String productVersion) {
		this.productVersion = productVersion;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof NotSupportedHost)) {
			return false;
		}
		NotSupportedHost other = (NotSupportedHost) obj;
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
				&& ((this.productName == null && other.getProductName() == null) || (this.productName != null && this.productName
						.equals(other.getProductName())))
				&& ((this.productVersion == null && other.getProductVersion() == null) || (this.productVersion != null && this.productVersion
						.equals(other.getProductVersion())));
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
		if (getProductName() != null) {
			_hashCode += getProductName().hashCode();
		}
		if (getProductVersion() != null) {
			_hashCode += getProductVersion().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			NotSupportedHost.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"NotSupportedHost"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("productName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"productName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("productVersion");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"productVersion"));
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
