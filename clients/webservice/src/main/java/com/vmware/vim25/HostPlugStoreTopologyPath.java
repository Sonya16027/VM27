/**
 * HostPlugStoreTopologyPath.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostPlugStoreTopologyPath extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String key;

	private java.lang.String name;

	private java.lang.Integer channelNumber;

	private java.lang.Integer targetNumber;

	private java.lang.Integer lunNumber;

	private java.lang.String adapter;

	private java.lang.String target;

	private java.lang.String device;

	public HostPlugStoreTopologyPath() {
	}

	public HostPlugStoreTopologyPath(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String key, java.lang.String name,
			java.lang.Integer channelNumber, java.lang.Integer targetNumber,
			java.lang.Integer lunNumber, java.lang.String adapter,
			java.lang.String target, java.lang.String device) {
		super(dynamicType, dynamicProperty);
		this.key = key;
		this.name = name;
		this.channelNumber = channelNumber;
		this.targetNumber = targetNumber;
		this.lunNumber = lunNumber;
		this.adapter = adapter;
		this.target = target;
		this.device = device;
	}

	/**
	 * Gets the key value for this HostPlugStoreTopologyPath.
	 * 
	 * @return key
	 */
	public java.lang.String getKey() {
		return key;
	}

	/**
	 * Sets the key value for this HostPlugStoreTopologyPath.
	 * 
	 * @param key
	 */
	public void setKey(java.lang.String key) {
		this.key = key;
	}

	/**
	 * Gets the name value for this HostPlugStoreTopologyPath.
	 * 
	 * @return name
	 */
	public java.lang.String getName() {
		return name;
	}

	/**
	 * Sets the name value for this HostPlugStoreTopologyPath.
	 * 
	 * @param name
	 */
	public void setName(java.lang.String name) {
		this.name = name;
	}

	/**
	 * Gets the channelNumber value for this HostPlugStoreTopologyPath.
	 * 
	 * @return channelNumber
	 */
	public java.lang.Integer getChannelNumber() {
		return channelNumber;
	}

	/**
	 * Sets the channelNumber value for this HostPlugStoreTopologyPath.
	 * 
	 * @param channelNumber
	 */
	public void setChannelNumber(java.lang.Integer channelNumber) {
		this.channelNumber = channelNumber;
	}

	/**
	 * Gets the targetNumber value for this HostPlugStoreTopologyPath.
	 * 
	 * @return targetNumber
	 */
	public java.lang.Integer getTargetNumber() {
		return targetNumber;
	}

	/**
	 * Sets the targetNumber value for this HostPlugStoreTopologyPath.
	 * 
	 * @param targetNumber
	 */
	public void setTargetNumber(java.lang.Integer targetNumber) {
		this.targetNumber = targetNumber;
	}

	/**
	 * Gets the lunNumber value for this HostPlugStoreTopologyPath.
	 * 
	 * @return lunNumber
	 */
	public java.lang.Integer getLunNumber() {
		return lunNumber;
	}

	/**
	 * Sets the lunNumber value for this HostPlugStoreTopologyPath.
	 * 
	 * @param lunNumber
	 */
	public void setLunNumber(java.lang.Integer lunNumber) {
		this.lunNumber = lunNumber;
	}

	/**
	 * Gets the adapter value for this HostPlugStoreTopologyPath.
	 * 
	 * @return adapter
	 */
	public java.lang.String getAdapter() {
		return adapter;
	}

	/**
	 * Sets the adapter value for this HostPlugStoreTopologyPath.
	 * 
	 * @param adapter
	 */
	public void setAdapter(java.lang.String adapter) {
		this.adapter = adapter;
	}

	/**
	 * Gets the target value for this HostPlugStoreTopologyPath.
	 * 
	 * @return target
	 */
	public java.lang.String getTarget() {
		return target;
	}

	/**
	 * Sets the target value for this HostPlugStoreTopologyPath.
	 * 
	 * @param target
	 */
	public void setTarget(java.lang.String target) {
		this.target = target;
	}

	/**
	 * Gets the device value for this HostPlugStoreTopologyPath.
	 * 
	 * @return device
	 */
	public java.lang.String getDevice() {
		return device;
	}

	/**
	 * Sets the device value for this HostPlugStoreTopologyPath.
	 * 
	 * @param device
	 */
	public void setDevice(java.lang.String device) {
		this.device = device;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostPlugStoreTopologyPath)) {
			return false;
		}
		HostPlugStoreTopologyPath other = (HostPlugStoreTopologyPath) obj;
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
				&& ((this.channelNumber == null && other.getChannelNumber() == null) || (this.channelNumber != null && this.channelNumber
						.equals(other.getChannelNumber())))
				&& ((this.targetNumber == null && other.getTargetNumber() == null) || (this.targetNumber != null && this.targetNumber
						.equals(other.getTargetNumber())))
				&& ((this.lunNumber == null && other.getLunNumber() == null) || (this.lunNumber != null && this.lunNumber
						.equals(other.getLunNumber())))
				&& ((this.adapter == null && other.getAdapter() == null) || (this.adapter != null && this.adapter
						.equals(other.getAdapter())))
				&& ((this.target == null && other.getTarget() == null) || (this.target != null && this.target
						.equals(other.getTarget())))
				&& ((this.device == null && other.getDevice() == null) || (this.device != null && this.device
						.equals(other.getDevice())));
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
		if (getChannelNumber() != null) {
			_hashCode += getChannelNumber().hashCode();
		}
		if (getTargetNumber() != null) {
			_hashCode += getTargetNumber().hashCode();
		}
		if (getLunNumber() != null) {
			_hashCode += getLunNumber().hashCode();
		}
		if (getAdapter() != null) {
			_hashCode += getAdapter().hashCode();
		}
		if (getTarget() != null) {
			_hashCode += getTarget().hashCode();
		}
		if (getDevice() != null) {
			_hashCode += getDevice().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostPlugStoreTopologyPath.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostPlugStoreTopologyPath"));
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
		elemField.setFieldName("channelNumber");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"channelNumber"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("targetNumber");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"targetNumber"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("lunNumber");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"lunNumber"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("adapter");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"adapter"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("target");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"target"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
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
