/**
 * CustomizationUserData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class CustomizationUserData extends com.vmware.vim.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String fullName;

	private java.lang.String orgName;

	private com.vmware.vim.CustomizationName computerName;

	private java.lang.String productId;

	public CustomizationUserData() {
	}

	public CustomizationUserData(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			java.lang.String fullName, java.lang.String orgName,
			com.vmware.vim.CustomizationName computerName,
			java.lang.String productId) {
		super(dynamicType, dynamicProperty);
		this.fullName = fullName;
		this.orgName = orgName;
		this.computerName = computerName;
		this.productId = productId;
	}

	/**
	 * Gets the fullName value for this CustomizationUserData.
	 * 
	 * @return fullName
	 */
	public java.lang.String getFullName() {
		return fullName;
	}

	/**
	 * Sets the fullName value for this CustomizationUserData.
	 * 
	 * @param fullName
	 */
	public void setFullName(java.lang.String fullName) {
		this.fullName = fullName;
	}

	/**
	 * Gets the orgName value for this CustomizationUserData.
	 * 
	 * @return orgName
	 */
	public java.lang.String getOrgName() {
		return orgName;
	}

	/**
	 * Sets the orgName value for this CustomizationUserData.
	 * 
	 * @param orgName
	 */
	public void setOrgName(java.lang.String orgName) {
		this.orgName = orgName;
	}

	/**
	 * Gets the computerName value for this CustomizationUserData.
	 * 
	 * @return computerName
	 */
	public com.vmware.vim.CustomizationName getComputerName() {
		return computerName;
	}

	/**
	 * Sets the computerName value for this CustomizationUserData.
	 * 
	 * @param computerName
	 */
	public void setComputerName(com.vmware.vim.CustomizationName computerName) {
		this.computerName = computerName;
	}

	/**
	 * Gets the productId value for this CustomizationUserData.
	 * 
	 * @return productId
	 */
	public java.lang.String getProductId() {
		return productId;
	}

	/**
	 * Sets the productId value for this CustomizationUserData.
	 * 
	 * @param productId
	 */
	public void setProductId(java.lang.String productId) {
		this.productId = productId;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof CustomizationUserData)) {
			return false;
		}
		CustomizationUserData other = (CustomizationUserData) obj;
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
				&& ((this.fullName == null && other.getFullName() == null) || (this.fullName != null && this.fullName
						.equals(other.getFullName())))
				&& ((this.orgName == null && other.getOrgName() == null) || (this.orgName != null && this.orgName
						.equals(other.getOrgName())))
				&& ((this.computerName == null && other.getComputerName() == null) || (this.computerName != null && this.computerName
						.equals(other.getComputerName())))
				&& ((this.productId == null && other.getProductId() == null) || (this.productId != null && this.productId
						.equals(other.getProductId())));
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
		if (getFullName() != null) {
			_hashCode += getFullName().hashCode();
		}
		if (getOrgName() != null) {
			_hashCode += getOrgName().hashCode();
		}
		if (getComputerName() != null) {
			_hashCode += getComputerName().hashCode();
		}
		if (getProductId() != null) {
			_hashCode += getProductId().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			CustomizationUserData.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"CustomizationUserData"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("fullName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"fullName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("orgName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"orgName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("computerName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"computerName"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"CustomizationName"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("productId");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"productId"));
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
