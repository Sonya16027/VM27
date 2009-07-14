/**
 * PermissionUpdatedEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class PermissionUpdatedEvent extends com.vmware.vim.PermissionEvent
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.RoleEventArgument role;

	private boolean propagate;

	public PermissionUpdatedEvent() {
	}

	public PermissionUpdatedEvent(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty, int key,
			int chainId, java.util.Calendar createdTime,
			java.lang.String userName,
			com.vmware.vim.DatacenterEventArgument datacenter,
			com.vmware.vim.ComputeResourceEventArgument computeResource,
			com.vmware.vim.HostEventArgument host,
			com.vmware.vim.VmEventArgument vm,
			java.lang.String fullFormattedMessage,
			com.vmware.vim.ManagedEntityEventArgument entity,
			java.lang.String principal, boolean group,
			com.vmware.vim.RoleEventArgument role, boolean propagate) {
		super(dynamicType, dynamicProperty, key, chainId, createdTime,
				userName, datacenter, computeResource, host, vm,
				fullFormattedMessage, entity, principal, group);
		this.role = role;
		this.propagate = propagate;
	}

	/**
	 * Gets the role value for this PermissionUpdatedEvent.
	 * 
	 * @return role
	 */
	public com.vmware.vim.RoleEventArgument getRole() {
		return role;
	}

	/**
	 * Sets the role value for this PermissionUpdatedEvent.
	 * 
	 * @param role
	 */
	public void setRole(com.vmware.vim.RoleEventArgument role) {
		this.role = role;
	}

	/**
	 * Gets the propagate value for this PermissionUpdatedEvent.
	 * 
	 * @return propagate
	 */
	public boolean isPropagate() {
		return propagate;
	}

	/**
	 * Sets the propagate value for this PermissionUpdatedEvent.
	 * 
	 * @param propagate
	 */
	public void setPropagate(boolean propagate) {
		this.propagate = propagate;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof PermissionUpdatedEvent)) {
			return false;
		}
		PermissionUpdatedEvent other = (PermissionUpdatedEvent) obj;
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
				&& ((this.role == null && other.getRole() == null) || (this.role != null && this.role
						.equals(other.getRole())))
				&& this.propagate == other.isPropagate();
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
		if (getRole() != null) {
			_hashCode += getRole().hashCode();
		}
		_hashCode += (isPropagate() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			PermissionUpdatedEvent.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"PermissionUpdatedEvent"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("role");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "role"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"RoleEventArgument"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("propagate");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"propagate"));
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
