/**
 * NoPermission.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim.sms;

public class NoPermission extends com.vmware.vim.sms.AuthenticationFailed
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.sms.EntityReference entity;

	private java.lang.String privilegeId;

	public NoPermission() {
	}

	public NoPermission(java.lang.String dynamicType,
			com.vmware.vim.sms.DynamicProperty[] dynamicProperty,
			com.vmware.vim.sms.EntityReference entity,
			java.lang.String privilegeId) {
		super(dynamicType, dynamicProperty);
		this.entity = entity;
		this.privilegeId = privilegeId;
	}

	/**
	 * Gets the entity value for this NoPermission.
	 * 
	 * @return entity
	 */
	public com.vmware.vim.sms.EntityReference getEntity() {
		return entity;
	}

	/**
	 * Sets the entity value for this NoPermission.
	 * 
	 * @param entity
	 */
	public void setEntity(com.vmware.vim.sms.EntityReference entity) {
		this.entity = entity;
	}

	/**
	 * Gets the privilegeId value for this NoPermission.
	 * 
	 * @return privilegeId
	 */
	public java.lang.String getPrivilegeId() {
		return privilegeId;
	}

	/**
	 * Sets the privilegeId value for this NoPermission.
	 * 
	 * @param privilegeId
	 */
	public void setPrivilegeId(java.lang.String privilegeId) {
		this.privilegeId = privilegeId;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof NoPermission)) {
			return false;
		}
		NoPermission other = (NoPermission) obj;
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
				&& ((this.entity == null && other.getEntity() == null) || (this.entity != null && this.entity
						.equals(other.getEntity())))
				&& ((this.privilegeId == null && other.getPrivilegeId() == null) || (this.privilegeId != null && this.privilegeId
						.equals(other.getPrivilegeId())));
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
		if (getEntity() != null) {
			_hashCode += getEntity().hashCode();
		}
		if (getPrivilegeId() != null) {
			_hashCode += getPrivilegeId().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			NoPermission.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sm1",
				"NoPermission"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("entity");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:sm1", "entity"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:sm1",
				"EntityReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("privilegeId");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1",
				"privilegeId"));
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
