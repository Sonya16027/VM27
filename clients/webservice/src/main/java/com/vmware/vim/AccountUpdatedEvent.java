/**
 * AccountUpdatedEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class AccountUpdatedEvent extends com.vmware.vim.HostEvent implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.HostAccountSpec spec;

	private boolean group;

	public AccountUpdatedEvent() {
	}

	public AccountUpdatedEvent(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty, int key,
			int chainId, java.util.Calendar createdTime,
			java.lang.String userName,
			com.vmware.vim.DatacenterEventArgument datacenter,
			com.vmware.vim.ComputeResourceEventArgument computeResource,
			com.vmware.vim.HostEventArgument host,
			com.vmware.vim.VmEventArgument vm,
			java.lang.String fullFormattedMessage,
			com.vmware.vim.HostAccountSpec spec, boolean group) {
		super(dynamicType, dynamicProperty, key, chainId, createdTime,
				userName, datacenter, computeResource, host, vm,
				fullFormattedMessage);
		this.spec = spec;
		this.group = group;
	}

	/**
	 * Gets the spec value for this AccountUpdatedEvent.
	 * 
	 * @return spec
	 */
	public com.vmware.vim.HostAccountSpec getSpec() {
		return spec;
	}

	/**
	 * Sets the spec value for this AccountUpdatedEvent.
	 * 
	 * @param spec
	 */
	public void setSpec(com.vmware.vim.HostAccountSpec spec) {
		this.spec = spec;
	}

	/**
	 * Gets the group value for this AccountUpdatedEvent.
	 * 
	 * @return group
	 */
	public boolean isGroup() {
		return group;
	}

	/**
	 * Sets the group value for this AccountUpdatedEvent.
	 * 
	 * @param group
	 */
	public void setGroup(boolean group) {
		this.group = group;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof AccountUpdatedEvent)) {
			return false;
		}
		AccountUpdatedEvent other = (AccountUpdatedEvent) obj;
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
				&& ((this.spec == null && other.getSpec() == null) || (this.spec != null && this.spec
						.equals(other.getSpec())))
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
		if (getSpec() != null) {
			_hashCode += getSpec().hashCode();
		}
		_hashCode += (isGroup() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			AccountUpdatedEvent.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"AccountUpdatedEvent"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("spec");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "spec"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostAccountSpec"));
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
