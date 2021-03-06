/**
 * UpdateNetworkConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class UpdateNetworkConfig implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.ManagedObjectReference _this;

	private com.vmware.vim.HostNetworkConfig config;

	private java.lang.String changeMode;

	public UpdateNetworkConfig() {
	}

	public UpdateNetworkConfig(com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.HostNetworkConfig config, java.lang.String changeMode) {
		this._this = _this;
		this.config = config;
		this.changeMode = changeMode;
	}

	/**
	 * Gets the _this value for this UpdateNetworkConfig.
	 * 
	 * @return _this
	 */
	public com.vmware.vim.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this UpdateNetworkConfig.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the config value for this UpdateNetworkConfig.
	 * 
	 * @return config
	 */
	public com.vmware.vim.HostNetworkConfig getConfig() {
		return config;
	}

	/**
	 * Sets the config value for this UpdateNetworkConfig.
	 * 
	 * @param config
	 */
	public void setConfig(com.vmware.vim.HostNetworkConfig config) {
		this.config = config;
	}

	/**
	 * Gets the changeMode value for this UpdateNetworkConfig.
	 * 
	 * @return changeMode
	 */
	public java.lang.String getChangeMode() {
		return changeMode;
	}

	/**
	 * Sets the changeMode value for this UpdateNetworkConfig.
	 * 
	 * @param changeMode
	 */
	public void setChangeMode(java.lang.String changeMode) {
		this.changeMode = changeMode;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof UpdateNetworkConfig)) {
			return false;
		}
		UpdateNetworkConfig other = (UpdateNetworkConfig) obj;
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
		_equals = true
				&& ((this._this == null && other.get_this() == null) || (this._this != null && this._this
						.equals(other.get_this())))
				&& ((this.config == null && other.getConfig() == null) || (this.config != null && this.config
						.equals(other.getConfig())))
				&& ((this.changeMode == null && other.getChangeMode() == null) || (this.changeMode != null && this.changeMode
						.equals(other.getChangeMode())));
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
		int _hashCode = 1;
		if (get_this() != null) {
			_hashCode += get_this().hashCode();
		}
		if (getConfig() != null) {
			_hashCode += getConfig().hashCode();
		}
		if (getChangeMode() != null) {
			_hashCode += getChangeMode().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			UpdateNetworkConfig.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				">UpdateNetworkConfig"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("config");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "config"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostNetworkConfig"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("changeMode");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"changeMode"));
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
