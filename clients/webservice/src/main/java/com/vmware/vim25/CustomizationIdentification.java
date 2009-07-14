/**
 * CustomizationIdentification.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class CustomizationIdentification extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String joinWorkgroup;

	private java.lang.String joinDomain;

	private java.lang.String domainAdmin;

	private com.vmware.vim25.CustomizationPassword domainAdminPassword;

	public CustomizationIdentification() {
	}

	public CustomizationIdentification(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String joinWorkgroup, java.lang.String joinDomain,
			java.lang.String domainAdmin,
			com.vmware.vim25.CustomizationPassword domainAdminPassword) {
		super(dynamicType, dynamicProperty);
		this.joinWorkgroup = joinWorkgroup;
		this.joinDomain = joinDomain;
		this.domainAdmin = domainAdmin;
		this.domainAdminPassword = domainAdminPassword;
	}

	/**
	 * Gets the joinWorkgroup value for this CustomizationIdentification.
	 * 
	 * @return joinWorkgroup
	 */
	public java.lang.String getJoinWorkgroup() {
		return joinWorkgroup;
	}

	/**
	 * Sets the joinWorkgroup value for this CustomizationIdentification.
	 * 
	 * @param joinWorkgroup
	 */
	public void setJoinWorkgroup(java.lang.String joinWorkgroup) {
		this.joinWorkgroup = joinWorkgroup;
	}

	/**
	 * Gets the joinDomain value for this CustomizationIdentification.
	 * 
	 * @return joinDomain
	 */
	public java.lang.String getJoinDomain() {
		return joinDomain;
	}

	/**
	 * Sets the joinDomain value for this CustomizationIdentification.
	 * 
	 * @param joinDomain
	 */
	public void setJoinDomain(java.lang.String joinDomain) {
		this.joinDomain = joinDomain;
	}

	/**
	 * Gets the domainAdmin value for this CustomizationIdentification.
	 * 
	 * @return domainAdmin
	 */
	public java.lang.String getDomainAdmin() {
		return domainAdmin;
	}

	/**
	 * Sets the domainAdmin value for this CustomizationIdentification.
	 * 
	 * @param domainAdmin
	 */
	public void setDomainAdmin(java.lang.String domainAdmin) {
		this.domainAdmin = domainAdmin;
	}

	/**
	 * Gets the domainAdminPassword value for this CustomizationIdentification.
	 * 
	 * @return domainAdminPassword
	 */
	public com.vmware.vim25.CustomizationPassword getDomainAdminPassword() {
		return domainAdminPassword;
	}

	/**
	 * Sets the domainAdminPassword value for this CustomizationIdentification.
	 * 
	 * @param domainAdminPassword
	 */
	public void setDomainAdminPassword(
			com.vmware.vim25.CustomizationPassword domainAdminPassword) {
		this.domainAdminPassword = domainAdminPassword;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof CustomizationIdentification)) {
			return false;
		}
		CustomizationIdentification other = (CustomizationIdentification) obj;
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
				&& ((this.joinWorkgroup == null && other.getJoinWorkgroup() == null) || (this.joinWorkgroup != null && this.joinWorkgroup
						.equals(other.getJoinWorkgroup())))
				&& ((this.joinDomain == null && other.getJoinDomain() == null) || (this.joinDomain != null && this.joinDomain
						.equals(other.getJoinDomain())))
				&& ((this.domainAdmin == null && other.getDomainAdmin() == null) || (this.domainAdmin != null && this.domainAdmin
						.equals(other.getDomainAdmin())))
				&& ((this.domainAdminPassword == null && other
						.getDomainAdminPassword() == null) || (this.domainAdminPassword != null && this.domainAdminPassword
						.equals(other.getDomainAdminPassword())));
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
		if (getJoinWorkgroup() != null) {
			_hashCode += getJoinWorkgroup().hashCode();
		}
		if (getJoinDomain() != null) {
			_hashCode += getJoinDomain().hashCode();
		}
		if (getDomainAdmin() != null) {
			_hashCode += getDomainAdmin().hashCode();
		}
		if (getDomainAdminPassword() != null) {
			_hashCode += getDomainAdminPassword().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			CustomizationIdentification.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"CustomizationIdentification"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("joinWorkgroup");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"joinWorkgroup"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("joinDomain");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"joinDomain"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("domainAdmin");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"domainAdmin"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("domainAdminPassword");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"domainAdminPassword"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"CustomizationPassword"));
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
