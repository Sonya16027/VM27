/**
 * VirtualMachineConfigOptionDescriptor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualMachineConfigOptionDescriptor extends
		com.vmware.vim25.DynamicData implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String key;

	private java.lang.String description;

	private com.vmware.vim25.ManagedObjectReference[] host;

	private java.lang.Boolean createSupported;

	private java.lang.Boolean defaultConfigOption;

	public VirtualMachineConfigOptionDescriptor() {
	}

	public VirtualMachineConfigOptionDescriptor(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String key, java.lang.String description,
			com.vmware.vim25.ManagedObjectReference[] host,
			java.lang.Boolean createSupported,
			java.lang.Boolean defaultConfigOption) {
		super(dynamicType, dynamicProperty);
		this.key = key;
		this.description = description;
		this.host = host;
		this.createSupported = createSupported;
		this.defaultConfigOption = defaultConfigOption;
	}

	/**
	 * Gets the key value for this VirtualMachineConfigOptionDescriptor.
	 * 
	 * @return key
	 */
	public java.lang.String getKey() {
		return key;
	}

	/**
	 * Sets the key value for this VirtualMachineConfigOptionDescriptor.
	 * 
	 * @param key
	 */
	public void setKey(java.lang.String key) {
		this.key = key;
	}

	/**
	 * Gets the description value for this VirtualMachineConfigOptionDescriptor.
	 * 
	 * @return description
	 */
	public java.lang.String getDescription() {
		return description;
	}

	/**
	 * Sets the description value for this VirtualMachineConfigOptionDescriptor.
	 * 
	 * @param description
	 */
	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	/**
	 * Gets the host value for this VirtualMachineConfigOptionDescriptor.
	 * 
	 * @return host
	 */
	public com.vmware.vim25.ManagedObjectReference[] getHost() {
		return host;
	}

	/**
	 * Sets the host value for this VirtualMachineConfigOptionDescriptor.
	 * 
	 * @param host
	 */
	public void setHost(com.vmware.vim25.ManagedObjectReference[] host) {
		this.host = host;
	}

	public com.vmware.vim25.ManagedObjectReference getHost(int i) {
		return this.host[i];
	}

	public void setHost(int i, com.vmware.vim25.ManagedObjectReference _value) {
		this.host[i] = _value;
	}

	/**
	 * Gets the createSupported value for this
	 * VirtualMachineConfigOptionDescriptor.
	 * 
	 * @return createSupported
	 */
	public java.lang.Boolean getCreateSupported() {
		return createSupported;
	}

	/**
	 * Sets the createSupported value for this
	 * VirtualMachineConfigOptionDescriptor.
	 * 
	 * @param createSupported
	 */
	public void setCreateSupported(java.lang.Boolean createSupported) {
		this.createSupported = createSupported;
	}

	/**
	 * Gets the defaultConfigOption value for this
	 * VirtualMachineConfigOptionDescriptor.
	 * 
	 * @return defaultConfigOption
	 */
	public java.lang.Boolean getDefaultConfigOption() {
		return defaultConfigOption;
	}

	/**
	 * Sets the defaultConfigOption value for this
	 * VirtualMachineConfigOptionDescriptor.
	 * 
	 * @param defaultConfigOption
	 */
	public void setDefaultConfigOption(java.lang.Boolean defaultConfigOption) {
		this.defaultConfigOption = defaultConfigOption;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualMachineConfigOptionDescriptor)) {
			return false;
		}
		VirtualMachineConfigOptionDescriptor other = (VirtualMachineConfigOptionDescriptor) obj;
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
				&& ((this.description == null && other.getDescription() == null) || (this.description != null && this.description
						.equals(other.getDescription())))
				&& ((this.host == null && other.getHost() == null) || (this.host != null && java.util.Arrays
						.equals(this.host, other.getHost())))
				&& ((this.createSupported == null && other.getCreateSupported() == null) || (this.createSupported != null && this.createSupported
						.equals(other.getCreateSupported())))
				&& ((this.defaultConfigOption == null && other
						.getDefaultConfigOption() == null) || (this.defaultConfigOption != null && this.defaultConfigOption
						.equals(other.getDefaultConfigOption())));
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
		if (getDescription() != null) {
			_hashCode += getDescription().hashCode();
		}
		if (getHost() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getHost()); i++) {
				java.lang.Object obj = java.lang.reflect.Array
						.get(getHost(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getCreateSupported() != null) {
			_hashCode += getCreateSupported().hashCode();
		}
		if (getDefaultConfigOption() != null) {
			_hashCode += getDefaultConfigOption().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VirtualMachineConfigOptionDescriptor.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachineConfigOptionDescriptor"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("key");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("description");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"description"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("createSupported");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"createSupported"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("defaultConfigOption");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"defaultConfigOption"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
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

}
