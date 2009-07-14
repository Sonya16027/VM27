/**
 * MigrationResourceErrorEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class MigrationResourceErrorEvent extends com.vmware.vim.MigrationEvent
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.ResourcePoolEventArgument dstPool;

	private com.vmware.vim.HostEventArgument dstHost;

	public MigrationResourceErrorEvent() {
	}

	public MigrationResourceErrorEvent(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty, int key,
			int chainId, java.util.Calendar createdTime,
			java.lang.String userName,
			com.vmware.vim.DatacenterEventArgument datacenter,
			com.vmware.vim.ComputeResourceEventArgument computeResource,
			com.vmware.vim.HostEventArgument host,
			com.vmware.vim.VmEventArgument vm,
			java.lang.String fullFormattedMessage, boolean template,
			com.vmware.vim.LocalizedMethodFault fault,
			com.vmware.vim.ResourcePoolEventArgument dstPool,
			com.vmware.vim.HostEventArgument dstHost) {
		super(dynamicType, dynamicProperty, key, chainId, createdTime,
				userName, datacenter, computeResource, host, vm,
				fullFormattedMessage, template, fault);
		this.dstPool = dstPool;
		this.dstHost = dstHost;
	}

	/**
	 * Gets the dstPool value for this MigrationResourceErrorEvent.
	 * 
	 * @return dstPool
	 */
	public com.vmware.vim.ResourcePoolEventArgument getDstPool() {
		return dstPool;
	}

	/**
	 * Sets the dstPool value for this MigrationResourceErrorEvent.
	 * 
	 * @param dstPool
	 */
	public void setDstPool(com.vmware.vim.ResourcePoolEventArgument dstPool) {
		this.dstPool = dstPool;
	}

	/**
	 * Gets the dstHost value for this MigrationResourceErrorEvent.
	 * 
	 * @return dstHost
	 */
	public com.vmware.vim.HostEventArgument getDstHost() {
		return dstHost;
	}

	/**
	 * Sets the dstHost value for this MigrationResourceErrorEvent.
	 * 
	 * @param dstHost
	 */
	public void setDstHost(com.vmware.vim.HostEventArgument dstHost) {
		this.dstHost = dstHost;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof MigrationResourceErrorEvent)) {
			return false;
		}
		MigrationResourceErrorEvent other = (MigrationResourceErrorEvent) obj;
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
				&& ((this.dstPool == null && other.getDstPool() == null) || (this.dstPool != null && this.dstPool
						.equals(other.getDstPool())))
				&& ((this.dstHost == null && other.getDstHost() == null) || (this.dstHost != null && this.dstHost
						.equals(other.getDstHost())));
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
		if (getDstPool() != null) {
			_hashCode += getDstPool().hashCode();
		}
		if (getDstHost() != null) {
			_hashCode += getDstHost().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			MigrationResourceErrorEvent.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"MigrationResourceErrorEvent"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dstPool");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"dstPool"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ResourcePoolEventArgument"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dstHost");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"dstHost"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostEventArgument"));
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
