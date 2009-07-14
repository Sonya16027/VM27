/**
 * HostVMotionManagerDestinationState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostVMotionManagerDestinationState extends
		com.vmware.vim.DynamicData implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int dstId;

	private com.vmware.vim.ManagedObjectReference dstTask;

	public HostVMotionManagerDestinationState() {
	}

	public HostVMotionManagerDestinationState(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty, int dstId,
			com.vmware.vim.ManagedObjectReference dstTask) {
		super(dynamicType, dynamicProperty);
		this.dstId = dstId;
		this.dstTask = dstTask;
	}

	/**
	 * Gets the dstId value for this HostVMotionManagerDestinationState.
	 * 
	 * @return dstId
	 */
	public int getDstId() {
		return dstId;
	}

	/**
	 * Sets the dstId value for this HostVMotionManagerDestinationState.
	 * 
	 * @param dstId
	 */
	public void setDstId(int dstId) {
		this.dstId = dstId;
	}

	/**
	 * Gets the dstTask value for this HostVMotionManagerDestinationState.
	 * 
	 * @return dstTask
	 */
	public com.vmware.vim.ManagedObjectReference getDstTask() {
		return dstTask;
	}

	/**
	 * Sets the dstTask value for this HostVMotionManagerDestinationState.
	 * 
	 * @param dstTask
	 */
	public void setDstTask(com.vmware.vim.ManagedObjectReference dstTask) {
		this.dstTask = dstTask;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostVMotionManagerDestinationState)) {
			return false;
		}
		HostVMotionManagerDestinationState other = (HostVMotionManagerDestinationState) obj;
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
				&& this.dstId == other.getDstId()
				&& ((this.dstTask == null && other.getDstTask() == null) || (this.dstTask != null && this.dstTask
						.equals(other.getDstTask())));
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
		_hashCode += getDstId();
		if (getDstTask() != null) {
			_hashCode += getDstTask().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostVMotionManagerDestinationState.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostVMotionManagerDestinationState"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dstId");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "dstId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dstTask");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"dstTask"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
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
