/**
 * ClearComplianceStatusRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ClearComplianceStatusRequestType implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference _this;

	private com.vmware.vim25.ManagedObjectReference[] profile;

	private com.vmware.vim25.ManagedObjectReference[] entity;

	public ClearComplianceStatusRequestType() {
	}

	public ClearComplianceStatusRequestType(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference[] profile,
			com.vmware.vim25.ManagedObjectReference[] entity) {
		this._this = _this;
		this.profile = profile;
		this.entity = entity;
	}

	/**
	 * Gets the _this value for this ClearComplianceStatusRequestType.
	 * 
	 * @return _this
	 */
	public com.vmware.vim25.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this ClearComplianceStatusRequestType.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim25.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the profile value for this ClearComplianceStatusRequestType.
	 * 
	 * @return profile
	 */
	public com.vmware.vim25.ManagedObjectReference[] getProfile() {
		return profile;
	}

	/**
	 * Sets the profile value for this ClearComplianceStatusRequestType.
	 * 
	 * @param profile
	 */
	public void setProfile(com.vmware.vim25.ManagedObjectReference[] profile) {
		this.profile = profile;
	}

	public com.vmware.vim25.ManagedObjectReference getProfile(int i) {
		return this.profile[i];
	}

	public void setProfile(int i, com.vmware.vim25.ManagedObjectReference _value) {
		this.profile[i] = _value;
	}

	/**
	 * Gets the entity value for this ClearComplianceStatusRequestType.
	 * 
	 * @return entity
	 */
	public com.vmware.vim25.ManagedObjectReference[] getEntity() {
		return entity;
	}

	/**
	 * Sets the entity value for this ClearComplianceStatusRequestType.
	 * 
	 * @param entity
	 */
	public void setEntity(com.vmware.vim25.ManagedObjectReference[] entity) {
		this.entity = entity;
	}

	public com.vmware.vim25.ManagedObjectReference getEntity(int i) {
		return this.entity[i];
	}

	public void setEntity(int i, com.vmware.vim25.ManagedObjectReference _value) {
		this.entity[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ClearComplianceStatusRequestType)) {
			return false;
		}
		ClearComplianceStatusRequestType other = (ClearComplianceStatusRequestType) obj;
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
		_equals = true
				&& ((this._this == null && other.get_this() == null) || (this._this != null && this._this
						.equals(other.get_this())))
				&& ((this.profile == null && other.getProfile() == null) || (this.profile != null && java.util.Arrays
						.equals(this.profile, other.getProfile())))
				&& ((this.entity == null && other.getEntity() == null) || (this.entity != null && java.util.Arrays
						.equals(this.entity, other.getEntity())));
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
		int _hashCode = 1;
		if (get_this() != null) {
			_hashCode += get_this().hashCode();
		}
		if (getProfile() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getProfile()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getProfile(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getEntity() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getEntity()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getEntity(),
						i);
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
			ClearComplianceStatusRequestType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ClearComplianceStatusRequestType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("profile");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"profile"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("entity");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"entity"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
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
