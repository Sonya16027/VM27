/**
 * AuthorizationDescription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class AuthorizationDescription extends com.vmware.vim.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.ElementDescription[] privilege;

	private com.vmware.vim.ElementDescription[] privilegeGroup;

	public AuthorizationDescription() {
	}

	public AuthorizationDescription(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			com.vmware.vim.ElementDescription[] privilege,
			com.vmware.vim.ElementDescription[] privilegeGroup) {
		super(dynamicType, dynamicProperty);
		this.privilege = privilege;
		this.privilegeGroup = privilegeGroup;
	}

	/**
	 * Gets the privilege value for this AuthorizationDescription.
	 * 
	 * @return privilege
	 */
	public com.vmware.vim.ElementDescription[] getPrivilege() {
		return privilege;
	}

	/**
	 * Sets the privilege value for this AuthorizationDescription.
	 * 
	 * @param privilege
	 */
	public void setPrivilege(com.vmware.vim.ElementDescription[] privilege) {
		this.privilege = privilege;
	}

	public com.vmware.vim.ElementDescription getPrivilege(int i) {
		return this.privilege[i];
	}

	public void setPrivilege(int i, com.vmware.vim.ElementDescription _value) {
		this.privilege[i] = _value;
	}

	/**
	 * Gets the privilegeGroup value for this AuthorizationDescription.
	 * 
	 * @return privilegeGroup
	 */
	public com.vmware.vim.ElementDescription[] getPrivilegeGroup() {
		return privilegeGroup;
	}

	/**
	 * Sets the privilegeGroup value for this AuthorizationDescription.
	 * 
	 * @param privilegeGroup
	 */
	public void setPrivilegeGroup(
			com.vmware.vim.ElementDescription[] privilegeGroup) {
		this.privilegeGroup = privilegeGroup;
	}

	public com.vmware.vim.ElementDescription getPrivilegeGroup(int i) {
		return this.privilegeGroup[i];
	}

	public void setPrivilegeGroup(int i,
			com.vmware.vim.ElementDescription _value) {
		this.privilegeGroup[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof AuthorizationDescription)) {
			return false;
		}
		AuthorizationDescription other = (AuthorizationDescription) obj;
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
				&& ((this.privilege == null && other.getPrivilege() == null) || (this.privilege != null && java.util.Arrays
						.equals(this.privilege, other.getPrivilege())))
				&& ((this.privilegeGroup == null && other.getPrivilegeGroup() == null) || (this.privilegeGroup != null && java.util.Arrays
						.equals(this.privilegeGroup, other.getPrivilegeGroup())));
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
		if (getPrivilegeGroup() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getPrivilegeGroup()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getPrivilegeGroup(), i);
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
			AuthorizationDescription.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"AuthorizationDescription"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("privilege");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"privilege"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ElementDescription"));
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("privilegeGroup");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"privilegeGroup"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ElementDescription"));
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
