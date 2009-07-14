/**
 * HostConfigSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostConfigSummary extends com.vmware.vim.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String name;

	private int port;

	private com.vmware.vim.AboutInfo product;

	private boolean vmotionEnabled;

	public HostConfigSummary() {
	}

	public HostConfigSummary(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			java.lang.String name, int port, com.vmware.vim.AboutInfo product,
			boolean vmotionEnabled) {
		super(dynamicType, dynamicProperty);
		this.name = name;
		this.port = port;
		this.product = product;
		this.vmotionEnabled = vmotionEnabled;
	}

	/**
	 * Gets the name value for this HostConfigSummary.
	 * 
	 * @return name
	 */
	public java.lang.String getName() {
		return name;
	}

	/**
	 * Sets the name value for this HostConfigSummary.
	 * 
	 * @param name
	 */
	public void setName(java.lang.String name) {
		this.name = name;
	}

	/**
	 * Gets the port value for this HostConfigSummary.
	 * 
	 * @return port
	 */
	public int getPort() {
		return port;
	}

	/**
	 * Sets the port value for this HostConfigSummary.
	 * 
	 * @param port
	 */
	public void setPort(int port) {
		this.port = port;
	}

	/**
	 * Gets the product value for this HostConfigSummary.
	 * 
	 * @return product
	 */
	public com.vmware.vim.AboutInfo getProduct() {
		return product;
	}

	/**
	 * Sets the product value for this HostConfigSummary.
	 * 
	 * @param product
	 */
	public void setProduct(com.vmware.vim.AboutInfo product) {
		this.product = product;
	}

	/**
	 * Gets the vmotionEnabled value for this HostConfigSummary.
	 * 
	 * @return vmotionEnabled
	 */
	public boolean isVmotionEnabled() {
		return vmotionEnabled;
	}

	/**
	 * Sets the vmotionEnabled value for this HostConfigSummary.
	 * 
	 * @param vmotionEnabled
	 */
	public void setVmotionEnabled(boolean vmotionEnabled) {
		this.vmotionEnabled = vmotionEnabled;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostConfigSummary)) {
			return false;
		}
		HostConfigSummary other = (HostConfigSummary) obj;
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
				&& ((this.name == null && other.getName() == null) || (this.name != null && this.name
						.equals(other.getName())))
				&& this.port == other.getPort()
				&& ((this.product == null && other.getProduct() == null) || (this.product != null && this.product
						.equals(other.getProduct())))
				&& this.vmotionEnabled == other.isVmotionEnabled();
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
		if (getName() != null) {
			_hashCode += getName().hashCode();
		}
		_hashCode += getPort();
		if (getProduct() != null) {
			_hashCode += getProduct().hashCode();
		}
		_hashCode += (isVmotionEnabled() ? Boolean.TRUE : Boolean.FALSE)
				.hashCode();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostConfigSummary.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostConfigSummary"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("name");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "name"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("port");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "port"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("product");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"product"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"AboutInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("vmotionEnabled");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"vmotionEnabled"));
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
