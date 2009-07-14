/**
 * CheckResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class CheckResult extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference vm;

	private com.vmware.vim25.ManagedObjectReference host;

	private com.vmware.vim25.LocalizedMethodFault[] warning;

	private com.vmware.vim25.LocalizedMethodFault[] error;

	public CheckResult() {
	}

	public CheckResult(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.ManagedObjectReference vm,
			com.vmware.vim25.ManagedObjectReference host,
			com.vmware.vim25.LocalizedMethodFault[] warning,
			com.vmware.vim25.LocalizedMethodFault[] error) {
		super(dynamicType, dynamicProperty);
		this.vm = vm;
		this.host = host;
		this.warning = warning;
		this.error = error;
	}

	/**
	 * Gets the vm value for this CheckResult.
	 * 
	 * @return vm
	 */
	public com.vmware.vim25.ManagedObjectReference getVm() {
		return vm;
	}

	/**
	 * Sets the vm value for this CheckResult.
	 * 
	 * @param vm
	 */
	public void setVm(com.vmware.vim25.ManagedObjectReference vm) {
		this.vm = vm;
	}

	/**
	 * Gets the host value for this CheckResult.
	 * 
	 * @return host
	 */
	public com.vmware.vim25.ManagedObjectReference getHost() {
		return host;
	}

	/**
	 * Sets the host value for this CheckResult.
	 * 
	 * @param host
	 */
	public void setHost(com.vmware.vim25.ManagedObjectReference host) {
		this.host = host;
	}

	/**
	 * Gets the warning value for this CheckResult.
	 * 
	 * @return warning
	 */
	public com.vmware.vim25.LocalizedMethodFault[] getWarning() {
		return warning;
	}

	/**
	 * Sets the warning value for this CheckResult.
	 * 
	 * @param warning
	 */
	public void setWarning(com.vmware.vim25.LocalizedMethodFault[] warning) {
		this.warning = warning;
	}

	public com.vmware.vim25.LocalizedMethodFault getWarning(int i) {
		return this.warning[i];
	}

	public void setWarning(int i, com.vmware.vim25.LocalizedMethodFault _value) {
		this.warning[i] = _value;
	}

	/**
	 * Gets the error value for this CheckResult.
	 * 
	 * @return error
	 */
	public com.vmware.vim25.LocalizedMethodFault[] getError() {
		return error;
	}

	/**
	 * Sets the error value for this CheckResult.
	 * 
	 * @param error
	 */
	public void setError(com.vmware.vim25.LocalizedMethodFault[] error) {
		this.error = error;
	}

	public com.vmware.vim25.LocalizedMethodFault getError(int i) {
		return this.error[i];
	}

	public void setError(int i, com.vmware.vim25.LocalizedMethodFault _value) {
		this.error[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof CheckResult)) {
			return false;
		}
		CheckResult other = (CheckResult) obj;
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
				&& ((this.warning == null && other.getWarning() == null) || (this.warning != null && java.util.Arrays
						.equals(this.warning, other.getWarning())))
				&& ((this.error == null && other.getError() == null) || (this.error != null && java.util.Arrays
						.equals(this.error, other.getError())));
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
		if (getWarning() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getWarning()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getWarning(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getError() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getError()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getError(),
						i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			CheckResult.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"CheckResult"));
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
		elemField.setFieldName("warning");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"warning"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"LocalizedMethodFault"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("error");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "error"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"LocalizedMethodFault"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
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
