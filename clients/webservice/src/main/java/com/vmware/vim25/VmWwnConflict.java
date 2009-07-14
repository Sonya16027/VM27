/**
 * VmWwnConflict.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VmWwnConflict extends com.vmware.vim25.InvalidVmConfig implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference vm;

	private com.vmware.vim25.ManagedObjectReference host;

	private java.lang.String name;

	private java.lang.Long wwn;

	public VmWwnConflict() {
	}

	public VmWwnConflict(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.LocalizedMethodFault faultCause,
			com.vmware.vim25.LocalizableMessage[] faultMessage,
			java.lang.String property,
			com.vmware.vim25.ManagedObjectReference vm,
			com.vmware.vim25.ManagedObjectReference host,
			java.lang.String name, java.lang.Long wwn) {
		super(dynamicType, dynamicProperty, faultCause, faultMessage, property);
		this.vm = vm;
		this.host = host;
		this.name = name;
		this.wwn = wwn;
	}

	/**
	 * Gets the vm value for this VmWwnConflict.
	 * 
	 * @return vm
	 */
	public com.vmware.vim25.ManagedObjectReference getVm() {
		return vm;
	}

	/**
	 * Sets the vm value for this VmWwnConflict.
	 * 
	 * @param vm
	 */
	public void setVm(com.vmware.vim25.ManagedObjectReference vm) {
		this.vm = vm;
	}

	/**
	 * Gets the host value for this VmWwnConflict.
	 * 
	 * @return host
	 */
	public com.vmware.vim25.ManagedObjectReference getHost() {
		return host;
	}

	/**
	 * Sets the host value for this VmWwnConflict.
	 * 
	 * @param host
	 */
	public void setHost(com.vmware.vim25.ManagedObjectReference host) {
		this.host = host;
	}

	/**
	 * Gets the name value for this VmWwnConflict.
	 * 
	 * @return name
	 */
	public java.lang.String getName() {
		return name;
	}

	/**
	 * Sets the name value for this VmWwnConflict.
	 * 
	 * @param name
	 */
	public void setName(java.lang.String name) {
		this.name = name;
	}

	/**
	 * Gets the wwn value for this VmWwnConflict.
	 * 
	 * @return wwn
	 */
	public java.lang.Long getWwn() {
		return wwn;
	}

	/**
	 * Sets the wwn value for this VmWwnConflict.
	 * 
	 * @param wwn
	 */
	public void setWwn(java.lang.Long wwn) {
		this.wwn = wwn;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VmWwnConflict)) {
			return false;
		}
		VmWwnConflict other = (VmWwnConflict) obj;
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
				&& ((this.vm == null && other.getVm() == null) || (this.vm != null && this.vm
						.equals(other.getVm())))
				&& ((this.host == null && other.getHost() == null) || (this.host != null && this.host
						.equals(other.getHost())))
				&& ((this.name == null && other.getName() == null) || (this.name != null && this.name
						.equals(other.getName())))
				&& ((this.wwn == null && other.getWwn() == null) || (this.wwn != null && this.wwn
						.equals(other.getWwn())));
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
		if (getVm() != null) {
			_hashCode += getVm().hashCode();
		}
		if (getHost() != null) {
			_hashCode += getHost().hashCode();
		}
		if (getName() != null) {
			_hashCode += getName().hashCode();
		}
		if (getWwn() != null) {
			_hashCode += getWwn().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VmWwnConflict.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VmWwnConflict"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("vm");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vm"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("host");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "host"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("name");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "name"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("wwn");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "wwn"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setMinOccurs(0);
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

	/**
	 * Writes the exception data to the faultDetails
	 */
	@Override
	public void writeDetails(javax.xml.namespace.QName qname,
			org.apache.axis.encoding.SerializationContext context)
			throws java.io.IOException {
		context.serialize(qname, null, this);
	}
}
