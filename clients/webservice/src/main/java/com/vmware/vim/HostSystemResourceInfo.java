/**
 * HostSystemResourceInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostSystemResourceInfo extends com.vmware.vim.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String key;

	private com.vmware.vim.ResourceConfigSpec config;

	private com.vmware.vim.HostSystemResourceInfo[] child;

	public HostSystemResourceInfo() {
	}

	public HostSystemResourceInfo(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			java.lang.String key, com.vmware.vim.ResourceConfigSpec config,
			com.vmware.vim.HostSystemResourceInfo[] child) {
		super(dynamicType, dynamicProperty);
		this.key = key;
		this.config = config;
		this.child = child;
	}

	/**
	 * Gets the key value for this HostSystemResourceInfo.
	 * 
	 * @return key
	 */
	public java.lang.String getKey() {
		return key;
	}

	/**
	 * Sets the key value for this HostSystemResourceInfo.
	 * 
	 * @param key
	 */
	public void setKey(java.lang.String key) {
		this.key = key;
	}

	/**
	 * Gets the config value for this HostSystemResourceInfo.
	 * 
	 * @return config
	 */
	public com.vmware.vim.ResourceConfigSpec getConfig() {
		return config;
	}

	/**
	 * Sets the config value for this HostSystemResourceInfo.
	 * 
	 * @param config
	 */
	public void setConfig(com.vmware.vim.ResourceConfigSpec config) {
		this.config = config;
	}

	/**
	 * Gets the child value for this HostSystemResourceInfo.
	 * 
	 * @return child
	 */
	public com.vmware.vim.HostSystemResourceInfo[] getChild() {
		return child;
	}

	/**
	 * Sets the child value for this HostSystemResourceInfo.
	 * 
	 * @param child
	 */
	public void setChild(com.vmware.vim.HostSystemResourceInfo[] child) {
		this.child = child;
	}

	public com.vmware.vim.HostSystemResourceInfo getChild(int i) {
		return this.child[i];
	}

	public void setChild(int i, com.vmware.vim.HostSystemResourceInfo _value) {
		this.child[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostSystemResourceInfo)) {
			return false;
		}
		HostSystemResourceInfo other = (HostSystemResourceInfo) obj;
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
				&& ((this.key == null && other.getKey() == null) || (this.key != null && this.key
						.equals(other.getKey())))
				&& ((this.config == null && other.getConfig() == null) || (this.config != null && this.config
						.equals(other.getConfig())))
				&& ((this.child == null && other.getChild() == null) || (this.child != null && java.util.Arrays
						.equals(this.child, other.getChild())));
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
		if (getKey() != null) {
			_hashCode += getKey().hashCode();
		}
		if (getConfig() != null) {
			_hashCode += getConfig().hashCode();
		}
		if (getChild() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getChild()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getChild(),
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
			HostSystemResourceInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostSystemResourceInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("key");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "key"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("config");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "config"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ResourceConfigSpec"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("child");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "child"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostSystemResourceInfo"));
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
