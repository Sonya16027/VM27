/**
 * VmStaticMacConflictEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class VmStaticMacConflictEvent extends com.vmware.vim.VmEvent implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.VmEventArgument conflictedVm;

	private java.lang.String mac;

	public VmStaticMacConflictEvent() {
	}

	public VmStaticMacConflictEvent(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty, int key,
			int chainId, java.util.Calendar createdTime,
			java.lang.String userName,
			com.vmware.vim.DatacenterEventArgument datacenter,
			com.vmware.vim.ComputeResourceEventArgument computeResource,
			com.vmware.vim.HostEventArgument host,
			com.vmware.vim.VmEventArgument vm,
			java.lang.String fullFormattedMessage, boolean template,
			com.vmware.vim.VmEventArgument conflictedVm, java.lang.String mac) {
		super(dynamicType, dynamicProperty, key, chainId, createdTime,
				userName, datacenter, computeResource, host, vm,
				fullFormattedMessage, template);
		this.conflictedVm = conflictedVm;
		this.mac = mac;
	}

	/**
	 * Gets the conflictedVm value for this VmStaticMacConflictEvent.
	 * 
	 * @return conflictedVm
	 */
	public com.vmware.vim.VmEventArgument getConflictedVm() {
		return conflictedVm;
	}

	/**
	 * Sets the conflictedVm value for this VmStaticMacConflictEvent.
	 * 
	 * @param conflictedVm
	 */
	public void setConflictedVm(com.vmware.vim.VmEventArgument conflictedVm) {
		this.conflictedVm = conflictedVm;
	}

	/**
	 * Gets the mac value for this VmStaticMacConflictEvent.
	 * 
	 * @return mac
	 */
	public java.lang.String getMac() {
		return mac;
	}

	/**
	 * Sets the mac value for this VmStaticMacConflictEvent.
	 * 
	 * @param mac
	 */
	public void setMac(java.lang.String mac) {
		this.mac = mac;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VmStaticMacConflictEvent)) {
			return false;
		}
		VmStaticMacConflictEvent other = (VmStaticMacConflictEvent) obj;
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
				&& ((this.conflictedVm == null && other.getConflictedVm() == null) || (this.conflictedVm != null && this.conflictedVm
						.equals(other.getConflictedVm())))
				&& ((this.mac == null && other.getMac() == null) || (this.mac != null && this.mac
						.equals(other.getMac())));
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
		if (getConflictedVm() != null) {
			_hashCode += getConflictedVm().hashCode();
		}
		if (getMac() != null) {
			_hashCode += getMac().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VmStaticMacConflictEvent.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VmStaticMacConflictEvent"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("conflictedVm");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"conflictedVm"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VmEventArgument"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("mac");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "mac"));
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
