/**
 * PowerOnFtSecondaryTimedout.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class PowerOnFtSecondaryTimedout extends com.vmware.vim25.Timedout
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference vm;

	private java.lang.String vmName;

	private int timeout;

	public PowerOnFtSecondaryTimedout() {
	}

	public PowerOnFtSecondaryTimedout(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.LocalizedMethodFault faultCause,
			com.vmware.vim25.LocalizableMessage[] faultMessage,
			com.vmware.vim25.ManagedObjectReference vm,
			java.lang.String vmName, int timeout) {
		super(dynamicType, dynamicProperty, faultCause, faultMessage);
		this.vm = vm;
		this.vmName = vmName;
		this.timeout = timeout;
	}

	/**
	 * Gets the vm value for this PowerOnFtSecondaryTimedout.
	 * 
	 * @return vm
	 */
	public com.vmware.vim25.ManagedObjectReference getVm() {
		return vm;
	}

	/**
	 * Sets the vm value for this PowerOnFtSecondaryTimedout.
	 * 
	 * @param vm
	 */
	public void setVm(com.vmware.vim25.ManagedObjectReference vm) {
		this.vm = vm;
	}

	/**
	 * Gets the vmName value for this PowerOnFtSecondaryTimedout.
	 * 
	 * @return vmName
	 */
	public java.lang.String getVmName() {
		return vmName;
	}

	/**
	 * Sets the vmName value for this PowerOnFtSecondaryTimedout.
	 * 
	 * @param vmName
	 */
	public void setVmName(java.lang.String vmName) {
		this.vmName = vmName;
	}

	/**
	 * Gets the timeout value for this PowerOnFtSecondaryTimedout.
	 * 
	 * @return timeout
	 */
	public int getTimeout() {
		return timeout;
	}

	/**
	 * Sets the timeout value for this PowerOnFtSecondaryTimedout.
	 * 
	 * @param timeout
	 */
	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof PowerOnFtSecondaryTimedout)) {
			return false;
		}
		PowerOnFtSecondaryTimedout other = (PowerOnFtSecondaryTimedout) obj;
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
				&& ((this.vmName == null && other.getVmName() == null) || (this.vmName != null && this.vmName
						.equals(other.getVmName())))
				&& this.timeout == other.getTimeout();
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
		if (getVmName() != null) {
			_hashCode += getVmName().hashCode();
		}
		_hashCode += getTimeout();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			PowerOnFtSecondaryTimedout.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"PowerOnFtSecondaryTimedout"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("vm");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vm"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("vmName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"vmName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("timeout");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"timeout"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
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
