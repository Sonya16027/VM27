/**
 * VmInstanceUuidConflictEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VmInstanceUuidConflictEvent extends com.vmware.vim25.VmEvent
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.VmEventArgument conflictedVm;

	private java.lang.String instanceUuid;

	public VmInstanceUuidConflictEvent() {
	}

	public VmInstanceUuidConflictEvent(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty, int key,
			int chainId, java.util.Calendar createdTime,
			java.lang.String userName,
			com.vmware.vim25.DatacenterEventArgument datacenter,
			com.vmware.vim25.ComputeResourceEventArgument computeResource,
			com.vmware.vim25.HostEventArgument host,
			com.vmware.vim25.VmEventArgument vm,
			com.vmware.vim25.DatastoreEventArgument ds,
			com.vmware.vim25.NetworkEventArgument net,
			com.vmware.vim25.DvsEventArgument dvs,
			java.lang.String fullFormattedMessage, java.lang.String changeTag,
			boolean template, com.vmware.vim25.VmEventArgument conflictedVm,
			java.lang.String instanceUuid) {
		super(dynamicType, dynamicProperty, key, chainId, createdTime,
				userName, datacenter, computeResource, host, vm, ds, net, dvs,
				fullFormattedMessage, changeTag, template);
		this.conflictedVm = conflictedVm;
		this.instanceUuid = instanceUuid;
	}

	/**
	 * Gets the conflictedVm value for this VmInstanceUuidConflictEvent.
	 * 
	 * @return conflictedVm
	 */
	public com.vmware.vim25.VmEventArgument getConflictedVm() {
		return conflictedVm;
	}

	/**
	 * Sets the conflictedVm value for this VmInstanceUuidConflictEvent.
	 * 
	 * @param conflictedVm
	 */
	public void setConflictedVm(com.vmware.vim25.VmEventArgument conflictedVm) {
		this.conflictedVm = conflictedVm;
	}

	/**
	 * Gets the instanceUuid value for this VmInstanceUuidConflictEvent.
	 * 
	 * @return instanceUuid
	 */
	public java.lang.String getInstanceUuid() {
		return instanceUuid;
	}

	/**
	 * Sets the instanceUuid value for this VmInstanceUuidConflictEvent.
	 * 
	 * @param instanceUuid
	 */
	public void setInstanceUuid(java.lang.String instanceUuid) {
		this.instanceUuid = instanceUuid;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VmInstanceUuidConflictEvent)) {
			return false;
		}
		VmInstanceUuidConflictEvent other = (VmInstanceUuidConflictEvent) obj;
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
				&& ((this.instanceUuid == null && other.getInstanceUuid() == null) || (this.instanceUuid != null && this.instanceUuid
						.equals(other.getInstanceUuid())));
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
		if (getInstanceUuid() != null) {
			_hashCode += getInstanceUuid().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VmInstanceUuidConflictEvent.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VmInstanceUuidConflictEvent"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("conflictedVm");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"conflictedVm"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VmEventArgument"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("instanceUuid");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"instanceUuid"));
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
