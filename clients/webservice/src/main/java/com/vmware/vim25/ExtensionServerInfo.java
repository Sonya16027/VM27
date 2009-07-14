/**
 * ExtensionServerInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ExtensionServerInfo extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String url;

	private com.vmware.vim25.Description description;

	private java.lang.String company;

	private java.lang.String type;

	private java.lang.String[] adminEmail;

	public ExtensionServerInfo() {
	}

	public ExtensionServerInfo(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String url, com.vmware.vim25.Description description,
			java.lang.String company, java.lang.String type,
			java.lang.String[] adminEmail) {
		super(dynamicType, dynamicProperty);
		this.url = url;
		this.description = description;
		this.company = company;
		this.type = type;
		this.adminEmail = adminEmail;
	}

	/**
	 * Gets the url value for this ExtensionServerInfo.
	 * 
	 * @return url
	 */
	public java.lang.String getUrl() {
		return url;
	}

	/**
	 * Sets the url value for this ExtensionServerInfo.
	 * 
	 * @param url
	 */
	public void setUrl(java.lang.String url) {
		this.url = url;
	}

	/**
	 * Gets the description value for this ExtensionServerInfo.
	 * 
	 * @return description
	 */
	public com.vmware.vim25.Description getDescription() {
		return description;
	}

	/**
	 * Sets the description value for this ExtensionServerInfo.
	 * 
	 * @param description
	 */
	public void setDescription(com.vmware.vim25.Description description) {
		this.description = description;
	}

	/**
	 * Gets the company value for this ExtensionServerInfo.
	 * 
	 * @return company
	 */
	public java.lang.String getCompany() {
		return company;
	}

	/**
	 * Sets the company value for this ExtensionServerInfo.
	 * 
	 * @param company
	 */
	public void setCompany(java.lang.String company) {
		this.company = company;
	}

	/**
	 * Gets the type value for this ExtensionServerInfo.
	 * 
	 * @return type
	 */
	public java.lang.String getType() {
		return type;
	}

	/**
	 * Sets the type value for this ExtensionServerInfo.
	 * 
	 * @param type
	 */
	public void setType(java.lang.String type) {
		this.type = type;
	}

	/**
	 * Gets the adminEmail value for this ExtensionServerInfo.
	 * 
	 * @return adminEmail
	 */
	public java.lang.String[] getAdminEmail() {
		return adminEmail;
	}

	/**
	 * Sets the adminEmail value for this ExtensionServerInfo.
	 * 
	 * @param adminEmail
	 */
	public void setAdminEmail(java.lang.String[] adminEmail) {
		this.adminEmail = adminEmail;
	}

	public java.lang.String getAdminEmail(int i) {
		return this.adminEmail[i];
	}

	public void setAdminEmail(int i, java.lang.String _value) {
		this.adminEmail[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ExtensionServerInfo)) {
			return false;
		}
		ExtensionServerInfo other = (ExtensionServerInfo) obj;
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
				&& ((this.url == null && other.getUrl() == null) || (this.url != null && this.url
						.equals(other.getUrl())))
				&& ((this.description == null && other.getDescription() == null) || (this.description != null && this.description
						.equals(other.getDescription())))
				&& ((this.company == null && other.getCompany() == null) || (this.company != null && this.company
						.equals(other.getCompany())))
				&& ((this.type == null && other.getType() == null) || (this.type != null && this.type
						.equals(other.getType())))
				&& ((this.adminEmail == null && other.getAdminEmail() == null) || (this.adminEmail != null && java.util.Arrays
						.equals(this.adminEmail, other.getAdminEmail())));
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
		if (getUrl() != null) {
			_hashCode += getUrl().hashCode();
		}
		if (getDescription() != null) {
			_hashCode += getDescription().hashCode();
		}
		if (getCompany() != null) {
			_hashCode += getCompany().hashCode();
		}
		if (getType() != null) {
			_hashCode += getType().hashCode();
		}
		if (getAdminEmail() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getAdminEmail()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getAdminEmail(), i);
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
			ExtensionServerInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ExtensionServerInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("url");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "url"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("description");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"description"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"Description"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("company");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"company"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("type");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "type"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("adminEmail");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"adminEmail"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
