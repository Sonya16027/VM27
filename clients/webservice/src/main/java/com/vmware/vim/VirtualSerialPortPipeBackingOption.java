/**
 * VirtualSerialPortPipeBackingOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class VirtualSerialPortPipeBackingOption extends
		com.vmware.vim.VirtualDevicePipeBackingOption implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.ChoiceOption endpoint;

	private com.vmware.vim.BoolOption noRxLoss;

	public VirtualSerialPortPipeBackingOption() {
	}

	public VirtualSerialPortPipeBackingOption(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			java.lang.String type, com.vmware.vim.ChoiceOption endpoint,
			com.vmware.vim.BoolOption noRxLoss) {
		super(dynamicType, dynamicProperty, type);
		this.endpoint = endpoint;
		this.noRxLoss = noRxLoss;
	}

	/**
	 * Gets the endpoint value for this VirtualSerialPortPipeBackingOption.
	 * 
	 * @return endpoint
	 */
	public com.vmware.vim.ChoiceOption getEndpoint() {
		return endpoint;
	}

	/**
	 * Sets the endpoint value for this VirtualSerialPortPipeBackingOption.
	 * 
	 * @param endpoint
	 */
	public void setEndpoint(com.vmware.vim.ChoiceOption endpoint) {
		this.endpoint = endpoint;
	}

	/**
	 * Gets the noRxLoss value for this VirtualSerialPortPipeBackingOption.
	 * 
	 * @return noRxLoss
	 */
	public com.vmware.vim.BoolOption getNoRxLoss() {
		return noRxLoss;
	}

	/**
	 * Sets the noRxLoss value for this VirtualSerialPortPipeBackingOption.
	 * 
	 * @param noRxLoss
	 */
	public void setNoRxLoss(com.vmware.vim.BoolOption noRxLoss) {
		this.noRxLoss = noRxLoss;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualSerialPortPipeBackingOption)) {
			return false;
		}
		VirtualSerialPortPipeBackingOption other = (VirtualSerialPortPipeBackingOption) obj;
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
				&& ((this.endpoint == null && other.getEndpoint() == null) || (this.endpoint != null && this.endpoint
						.equals(other.getEndpoint())))
				&& ((this.noRxLoss == null && other.getNoRxLoss() == null) || (this.noRxLoss != null && this.noRxLoss
						.equals(other.getNoRxLoss())));
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
		if (getEndpoint() != null) {
			_hashCode += getEndpoint().hashCode();
		}
		if (getNoRxLoss() != null) {
			_hashCode += getNoRxLoss().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VirtualSerialPortPipeBackingOption.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualSerialPortPipeBackingOption"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("endpoint");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"endpoint"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ChoiceOption"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("noRxLoss");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"noRxLoss"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"BoolOption"));
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
