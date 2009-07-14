/**
 * PerfInterval.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class PerfInterval extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int key;

	private int samplingPeriod;

	private java.lang.String name;

	private int length;

	private java.lang.Integer level;

	private boolean enabled;

	public PerfInterval() {
	}

	public PerfInterval(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty, int key,
			int samplingPeriod, java.lang.String name, int length,
			java.lang.Integer level, boolean enabled) {
		super(dynamicType, dynamicProperty);
		this.key = key;
		this.samplingPeriod = samplingPeriod;
		this.name = name;
		this.length = length;
		this.level = level;
		this.enabled = enabled;
	}

	/**
	 * Gets the key value for this PerfInterval.
	 * 
	 * @return key
	 */
	public int getKey() {
		return key;
	}

	/**
	 * Sets the key value for this PerfInterval.
	 * 
	 * @param key
	 */
	public void setKey(int key) {
		this.key = key;
	}

	/**
	 * Gets the samplingPeriod value for this PerfInterval.
	 * 
	 * @return samplingPeriod
	 */
	public int getSamplingPeriod() {
		return samplingPeriod;
	}

	/**
	 * Sets the samplingPeriod value for this PerfInterval.
	 * 
	 * @param samplingPeriod
	 */
	public void setSamplingPeriod(int samplingPeriod) {
		this.samplingPeriod = samplingPeriod;
	}

	/**
	 * Gets the name value for this PerfInterval.
	 * 
	 * @return name
	 */
	public java.lang.String getName() {
		return name;
	}

	/**
	 * Sets the name value for this PerfInterval.
	 * 
	 * @param name
	 */
	public void setName(java.lang.String name) {
		this.name = name;
	}

	/**
	 * Gets the length value for this PerfInterval.
	 * 
	 * @return length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * Sets the length value for this PerfInterval.
	 * 
	 * @param length
	 */
	public void setLength(int length) {
		this.length = length;
	}

	/**
	 * Gets the level value for this PerfInterval.
	 * 
	 * @return level
	 */
	public java.lang.Integer getLevel() {
		return level;
	}

	/**
	 * Sets the level value for this PerfInterval.
	 * 
	 * @param level
	 */
	public void setLevel(java.lang.Integer level) {
		this.level = level;
	}

	/**
	 * Gets the enabled value for this PerfInterval.
	 * 
	 * @return enabled
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * Sets the enabled value for this PerfInterval.
	 * 
	 * @param enabled
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof PerfInterval)) {
			return false;
		}
		PerfInterval other = (PerfInterval) obj;
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
				&& this.key == other.getKey()
				&& this.samplingPeriod == other.getSamplingPeriod()
				&& ((this.name == null && other.getName() == null) || (this.name != null && this.name
						.equals(other.getName())))
				&& this.length == other.getLength()
				&& ((this.level == null && other.getLevel() == null) || (this.level != null && this.level
						.equals(other.getLevel())))
				&& this.enabled == other.isEnabled();
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
		_hashCode += getKey();
		_hashCode += getSamplingPeriod();
		if (getName() != null) {
			_hashCode += getName().hashCode();
		}
		_hashCode += getLength();
		if (getLevel() != null) {
			_hashCode += getLevel().hashCode();
		}
		_hashCode += (isEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			PerfInterval.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"PerfInterval"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("key");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("samplingPeriod");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"samplingPeriod"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
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
		elemField.setFieldName("length");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"length"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("level");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "level"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("enabled");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"enabled"));
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
