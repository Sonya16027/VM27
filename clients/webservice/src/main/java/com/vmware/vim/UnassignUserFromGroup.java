/**
 * UnassignUserFromGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class UnassignUserFromGroup implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.ManagedObjectReference _this;

	private java.lang.String user;

	private java.lang.String group;

	public UnassignUserFromGroup() {
	}

	public UnassignUserFromGroup(com.vmware.vim.ManagedObjectReference _this,
			java.lang.String user, java.lang.String group) {
		this._this = _this;
		this.user = user;
		this.group = group;
	}

	/**
	 * Gets the _this value for this UnassignUserFromGroup.
	 * 
	 * @return _this
	 */
	public com.vmware.vim.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this UnassignUserFromGroup.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the user value for this UnassignUserFromGroup.
	 * 
	 * @return user
	 */
	public java.lang.String getUser() {
		return user;
	}

	/**
	 * Sets the user value for this UnassignUserFromGroup.
	 * 
	 * @param user
	 */
	public void setUser(java.lang.String user) {
		this.user = user;
	}

	/**
	 * Gets the group value for this UnassignUserFromGroup.
	 * 
	 * @return group
	 */
	public java.lang.String getGroup() {
		return group;
	}

	/**
	 * Sets the group value for this UnassignUserFromGroup.
	 * 
	 * @param group
	 */
	public void setGroup(java.lang.String group) {
		this.group = group;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof UnassignUserFromGroup)) {
			return false;
		}
		UnassignUserFromGroup other = (UnassignUserFromGroup) obj;
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
				&& ((this.user == null && other.getUser() == null) || (this.user != null && this.user
						.equals(other.getUser())))
				&& ((this.group == null && other.getGroup() == null) || (this.group != null && this.group
						.equals(other.getGroup())));
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
		if (getUser() != null) {
			_hashCode += getUser().hashCode();
		}
		if (getGroup() != null) {
			_hashCode += getGroup().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			UnassignUserFromGroup.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				">UnassignUserFromGroup"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("user");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "user"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("group");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "group"));
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
