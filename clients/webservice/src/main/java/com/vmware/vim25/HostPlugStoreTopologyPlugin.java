/**
 * HostPlugStoreTopologyPlugin.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostPlugStoreTopologyPlugin extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String key;

	private java.lang.String name;

	private java.lang.String[] device;

	private java.lang.String[] claimedPath;

	public HostPlugStoreTopologyPlugin() {
	}

	public HostPlugStoreTopologyPlugin(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String key, java.lang.String name,
			java.lang.String[] device, java.lang.String[] claimedPath) {
		super(dynamicType, dynamicProperty);
		this.key = key;
		this.name = name;
		this.device = device;
		this.claimedPath = claimedPath;
	}

	/**
	 * Gets the key value for this HostPlugStoreTopologyPlugin.
	 * 
	 * @return key
	 */
	public java.lang.String getKey() {
		return key;
	}

	/**
	 * Sets the key value for this HostPlugStoreTopologyPlugin.
	 * 
	 * @param key
	 */
	public void setKey(java.lang.String key) {
		this.key = key;
	}

	/**
	 * Gets the name value for this HostPlugStoreTopologyPlugin.
	 * 
	 * @return name
	 */
	public java.lang.String getName() {
		return name;
	}

	/**
	 * Sets the name value for this HostPlugStoreTopologyPlugin.
	 * 
	 * @param name
	 */
	public void setName(java.lang.String name) {
		this.name = name;
	}

	/**
	 * Gets the device value for this HostPlugStoreTopologyPlugin.
	 * 
	 * @return device
	 */
	public java.lang.String[] getDevice() {
		return device;
	}

	/**
	 * Sets the device value for this HostPlugStoreTopologyPlugin.
	 * 
	 * @param device
	 */
	public void setDevice(java.lang.String[] device) {
		this.device = device;
	}

	public java.lang.String getDevice(int i) {
		return this.device[i];
	}

	public void setDevice(int i, java.lang.String _value) {
		this.device[i] = _value;
	}

	/**
	 * Gets the claimedPath value for this HostPlugStoreTopologyPlugin.
	 * 
	 * @return claimedPath
	 */
	public java.lang.String[] getClaimedPath() {
		return claimedPath;
	}

	/**
	 * Sets the claimedPath value for this HostPlugStoreTopologyPlugin.
	 * 
	 * @param claimedPath
	 */
	public void setClaimedPath(java.lang.String[] claimedPath) {
		this.claimedPath = claimedPath;
	}

	public java.lang.String getClaimedPath(int i) {
		return this.claimedPath[i];
	}

	public void setClaimedPath(int i, java.lang.String _value) {
		this.claimedPath[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostPlugStoreTopologyPlugin)) {
			return false;
		}
		HostPlugStoreTopologyPlugin other = (HostPlugStoreTopologyPlugin) obj;
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
				&& ((this.name == null && other.getName() == null) || (this.name != null && this.name
						.equals(other.getName())))
				&& ((this.device == null && other.getDevice() == null) || (this.device != null && java.util.Arrays
						.equals(this.device, other.getDevice())))
				&& ((this.claimedPath == null && other.getClaimedPath() == null) || (this.claimedPath != null && java.util.Arrays
						.equals(this.claimedPath, other.getClaimedPath())));
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
		if (getName() != null) {
			_hashCode += getName().hashCode();
		}
		if (getDevice() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getDevice()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getDevice(),
						i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getClaimedPath() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getClaimedPath()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getClaimedPath(), i);
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
			HostPlugStoreTopologyPlugin.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostPlugStoreTopologyPlugin"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("key");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("name");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "name"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("device");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"device"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("claimedPath");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"claimedPath"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
