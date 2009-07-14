/**
 * AuthorizationRole.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class AuthorizationRole extends com.vmware.vim.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int roleId;

	private boolean system;

	private java.lang.String name;

	private com.vmware.vim.Description info;

	private java.lang.String[] privilege;

	public AuthorizationRole() {
	}

	public AuthorizationRole(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty, int roleId,
			boolean system, java.lang.String name,
			com.vmware.vim.Description info, java.lang.String[] privilege) {
		super(dynamicType, dynamicProperty);
		this.roleId = roleId;
		this.system = system;
		this.name = name;
		this.info = info;
		this.privilege = privilege;
	}

	/**
	 * Gets the roleId value for this AuthorizationRole.
	 * 
	 * @return roleId
	 */
	public int getRoleId() {
		return roleId;
	}

	/**
	 * Sets the roleId value for this AuthorizationRole.
	 * 
	 * @param roleId
	 */
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	/**
	 * Gets the system value for this AuthorizationRole.
	 * 
	 * @return system
	 */
	public boolean isSystem() {
		return system;
	}

	/**
	 * Sets the system value for this AuthorizationRole.
	 * 
	 * @param system
	 */
	public void setSystem(boolean system) {
		this.system = system;
	}

	/**
	 * Gets the name value for this AuthorizationRole.
	 * 
	 * @return name
	 */
	public java.lang.String getName() {
		return name;
	}

	/**
	 * Sets the name value for this AuthorizationRole.
	 * 
	 * @param name
	 */
	public void setName(java.lang.String name) {
		this.name = name;
	}

	/**
	 * Gets the info value for this AuthorizationRole.
	 * 
	 * @return info
	 */
	public com.vmware.vim.Description getInfo() {
		return info;
	}

	/**
	 * Sets the info value for this AuthorizationRole.
	 * 
	 * @param info
	 */
	public void setInfo(com.vmware.vim.Description info) {
		this.info = info;
	}

	/**
	 * Gets the privilege value for this AuthorizationRole.
	 * 
	 * @return privilege
	 */
	public java.lang.String[] getPrivilege() {
		return privilege;
	}

	/**
	 * Sets the privilege value for this AuthorizationRole.
	 * 
	 * @param privilege
	 */
	public void setPrivilege(java.lang.String[] privilege) {
		this.privilege = privilege;
	}

	public java.lang.String getPrivilege(int i) {
		return this.privilege[i];
	}

	public void setPrivilege(int i, java.lang.String _value) {
		this.privilege[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof AuthorizationRole)) {
			return false;
		}
		AuthorizationRole other = (AuthorizationRole) obj;
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
				&& this.roleId == other.getRoleId()
				&& this.system == other.isSystem()
				&& ((this.name == null && other.getName() == null) || (this.name != null && this.name
						.equals(other.getName())))
				&& ((this.info == null && other.getInfo() == null) || (this.info != null && this.info
						.equals(other.getInfo())))
				&& ((this.privilege == null && other.getPrivilege() == null) || (this.privilege != null && java.util.Arrays
						.equals(this.privilege, other.getPrivilege())));
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
		_hashCode += getRoleId();
		_hashCode += (isSystem() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		if (getName() != null) {
			_hashCode += getName().hashCode();
		}
		if (getInfo() != null) {
			_hashCode += getInfo().hashCode();
		}
		if (getPrivilege() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getPrivilege()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getPrivilege(), i);
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
			AuthorizationRole.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"AuthorizationRole"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("roleId");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "roleId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("system");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "system"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("name");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "name"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("info");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "info"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"Description"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("privilege");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"privilege"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
