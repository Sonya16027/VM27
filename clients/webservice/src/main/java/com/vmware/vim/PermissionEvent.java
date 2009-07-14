/**
 * PermissionEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class PermissionEvent extends com.vmware.vim.AuthorizationEvent
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.ManagedEntityEventArgument entity;

	private java.lang.String principal;

	private boolean group;

	public PermissionEvent() {
	}

	public PermissionEvent(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty, int key,
			int chainId, java.util.Calendar createdTime,
			java.lang.String userName,
			com.vmware.vim.DatacenterEventArgument datacenter,
			com.vmware.vim.ComputeResourceEventArgument computeResource,
			com.vmware.vim.HostEventArgument host,
			com.vmware.vim.VmEventArgument vm,
			java.lang.String fullFormattedMessage,
			com.vmware.vim.ManagedEntityEventArgument entity,
			java.lang.String principal, boolean group) {
		super(dynamicType, dynamicProperty, key, chainId, createdTime,
				userName, datacenter, computeResource, host, vm,
				fullFormattedMessage);
		this.entity = entity;
		this.principal = principal;
		this.group = group;
	}

	/**
	 * Gets the entity value for this PermissionEvent.
	 * 
	 * @return entity
	 */
	public com.vmware.vim.ManagedEntityEventArgument getEntity() {
		return entity;
	}

	/**
	 * Sets the entity value for this PermissionEvent.
	 * 
	 * @param entity
	 */
	public void setEntity(com.vmware.vim.ManagedEntityEventArgument entity) {
		this.entity = entity;
	}

	/**
	 * Gets the principal value for this PermissionEvent.
	 * 
	 * @return principal
	 */
	public java.lang.String getPrincipal() {
		return principal;
	}

	/**
	 * Sets the principal value for this PermissionEvent.
	 * 
	 * @param principal
	 */
	public void setPrincipal(java.lang.String principal) {
		this.principal = principal;
	}

	/**
	 * Gets the group value for this PermissionEvent.
	 * 
	 * @return group
	 */
	public boolean isGroup() {
		return group;
	}

	/**
	 * Sets the group value for this PermissionEvent.
	 * 
	 * @param group
	 */
	public void setGroup(boolean group) {
		this.group = group;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof PermissionEvent)) {
			return false;
		}
		PermissionEvent other = (PermissionEvent) obj;
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
				&& ((this.principal == null && other.getPrincipal() == null) || (this.principal != null && this.principal
						.equals(other.getPrincipal())))
				&& this.group == other.isGroup();
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
		if (getPrincipal() != null) {
			_hashCode += getPrincipal().hashCode();
		}
		_hashCode += (isGroup() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			PermissionEvent.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"PermissionEvent"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("entity");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "entity"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedEntityEventArgument"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("principal");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"principal"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("group");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "group"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
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
