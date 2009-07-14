/**
 * CannotAccessVmConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class CannotAccessVmConfig extends
		com.vmware.vim.CannotAccessVmComponent implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim.LocalizedMethodFault reason;

	public CannotAccessVmConfig() {
	}

	public CannotAccessVmConfig(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			com.vmware.vim.LocalizedMethodFault reason) {
		super(dynamicType, dynamicProperty);
		this.reason = reason;
	}

	/**
	 * Gets the reason value for this CannotAccessVmConfig.
	 * 
	 * @return reason
	 */
	public com.vmware.vim.LocalizedMethodFault getReason() {
		return reason;
	}

	/**
	 * Sets the reason value for this CannotAccessVmConfig.
	 * 
	 * @param reason
	 */
	public void setReason(com.vmware.vim.LocalizedMethodFault reason) {
		this.reason = reason;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof CannotAccessVmConfig)) {
			return false;
		}
		CannotAccessVmConfig other = (CannotAccessVmConfig) obj;
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
				&& ((this.reason == null && other.getReason() == null) || (this.reason != null && this.reason
						.equals(other.getReason())));
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
		if (getReason() != null) {
			_hashCode += getReason().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			CannotAccessVmConfig.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"CannotAccessVmConfig"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("reason");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "reason"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"LocalizedMethodFault"));
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
