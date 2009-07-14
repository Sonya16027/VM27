/**
 * SetEntityPermissions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class SetEntityPermissions implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.ManagedObjectReference _this;

	private com.vmware.vim.ManagedObjectReference entity;

	private com.vmware.vim.Permission[] permission;

	public SetEntityPermissions() {
	}

	public SetEntityPermissions(com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference entity,
			com.vmware.vim.Permission[] permission) {
		this._this = _this;
		this.entity = entity;
		this.permission = permission;
	}

	/**
	 * Gets the _this value for this SetEntityPermissions.
	 * 
	 * @return _this
	 */
	public com.vmware.vim.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this SetEntityPermissions.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the entity value for this SetEntityPermissions.
	 * 
	 * @return entity
	 */
	public com.vmware.vim.ManagedObjectReference getEntity() {
		return entity;
	}

	/**
	 * Sets the entity value for this SetEntityPermissions.
	 * 
	 * @param entity
	 */
	public void setEntity(com.vmware.vim.ManagedObjectReference entity) {
		this.entity = entity;
	}

	/**
	 * Gets the permission value for this SetEntityPermissions.
	 * 
	 * @return permission
	 */
	public com.vmware.vim.Permission[] getPermission() {
		return permission;
	}

	/**
	 * Sets the permission value for this SetEntityPermissions.
	 * 
	 * @param permission
	 */
	public void setPermission(com.vmware.vim.Permission[] permission) {
		this.permission = permission;
	}

	public com.vmware.vim.Permission getPermission(int i) {
		return this.permission[i];
	}

	public void setPermission(int i, com.vmware.vim.Permission _value) {
		this.permission[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof SetEntityPermissions)) {
			return false;
		}
		SetEntityPermissions other = (SetEntityPermissions) obj;
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
				&& ((this.entity == null && other.getEntity() == null) || (this.entity != null && this.entity
						.equals(other.getEntity())))
				&& ((this.permission == null && other.getPermission() == null) || (this.permission != null && java.util.Arrays
						.equals(this.permission, other.getPermission())));
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
		if (getEntity() != null) {
			_hashCode += getEntity().hashCode();
		}
		if (getPermission() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getPermission()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getPermission(), i);
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
			SetEntityPermissions.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				">SetEntityPermissions"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("entity");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "entity"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("permission");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"permission"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"Permission"));
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
