/**
 * Capability.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class Capability extends com.vmware.vim.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private boolean provisioningSupported;

	private boolean multiHostSupported;

	public Capability() {
	}

	public Capability(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			boolean provisioningSupported, boolean multiHostSupported) {
		super(dynamicType, dynamicProperty);
		this.provisioningSupported = provisioningSupported;
		this.multiHostSupported = multiHostSupported;
	}

	/**
	 * Gets the provisioningSupported value for this Capability.
	 * 
	 * @return provisioningSupported
	 */
	public boolean isProvisioningSupported() {
		return provisioningSupported;
	}

	/**
	 * Sets the provisioningSupported value for this Capability.
	 * 
	 * @param provisioningSupported
	 */
	public void setProvisioningSupported(boolean provisioningSupported) {
		this.provisioningSupported = provisioningSupported;
	}

	/**
	 * Gets the multiHostSupported value for this Capability.
	 * 
	 * @return multiHostSupported
	 */
	public boolean isMultiHostSupported() {
		return multiHostSupported;
	}

	/**
	 * Sets the multiHostSupported value for this Capability.
	 * 
	 * @param multiHostSupported
	 */
	public void setMultiHostSupported(boolean multiHostSupported) {
		this.multiHostSupported = multiHostSupported;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof Capability)) {
			return false;
		}
		Capability other = (Capability) obj;
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
				&& this.provisioningSupported == other
						.isProvisioningSupported()
				&& this.multiHostSupported == other.isMultiHostSupported();
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
		_hashCode += (isProvisioningSupported() ? Boolean.TRUE : Boolean.FALSE)
				.hashCode();
		_hashCode += (isMultiHostSupported() ? Boolean.TRUE : Boolean.FALSE)
				.hashCode();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			Capability.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"Capability"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("provisioningSupported");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"provisioningSupported"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("multiHostSupported");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"multiHostSupported"));
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
