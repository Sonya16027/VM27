/**
 * CpuIncompatible.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class CpuIncompatible extends
		com.vmware.vim25.VirtualHardwareCompatibilityIssue implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int level;

	private java.lang.String registerName;

	private java.lang.String registerBits;

	private java.lang.String desiredBits;

	private com.vmware.vim25.ManagedObjectReference host;

	public CpuIncompatible() {
	}

	public CpuIncompatible(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.LocalizedMethodFault faultCause,
			com.vmware.vim25.LocalizableMessage[] faultMessage, int level,
			java.lang.String registerName, java.lang.String registerBits,
			java.lang.String desiredBits,
			com.vmware.vim25.ManagedObjectReference host) {
		super(dynamicType, dynamicProperty, faultCause, faultMessage);
		this.level = level;
		this.registerName = registerName;
		this.registerBits = registerBits;
		this.desiredBits = desiredBits;
		this.host = host;
	}

	/**
	 * Gets the level value for this CpuIncompatible.
	 * 
	 * @return level
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * Sets the level value for this CpuIncompatible.
	 * 
	 * @param level
	 */
	public void setLevel(int level) {
		this.level = level;
	}

	/**
	 * Gets the registerName value for this CpuIncompatible.
	 * 
	 * @return registerName
	 */
	public java.lang.String getRegisterName() {
		return registerName;
	}

	/**
	 * Sets the registerName value for this CpuIncompatible.
	 * 
	 * @param registerName
	 */
	public void setRegisterName(java.lang.String registerName) {
		this.registerName = registerName;
	}

	/**
	 * Gets the registerBits value for this CpuIncompatible.
	 * 
	 * @return registerBits
	 */
	public java.lang.String getRegisterBits() {
		return registerBits;
	}

	/**
	 * Sets the registerBits value for this CpuIncompatible.
	 * 
	 * @param registerBits
	 */
	public void setRegisterBits(java.lang.String registerBits) {
		this.registerBits = registerBits;
	}

	/**
	 * Gets the desiredBits value for this CpuIncompatible.
	 * 
	 * @return desiredBits
	 */
	public java.lang.String getDesiredBits() {
		return desiredBits;
	}

	/**
	 * Sets the desiredBits value for this CpuIncompatible.
	 * 
	 * @param desiredBits
	 */
	public void setDesiredBits(java.lang.String desiredBits) {
		this.desiredBits = desiredBits;
	}

	/**
	 * Gets the host value for this CpuIncompatible.
	 * 
	 * @return host
	 */
	public com.vmware.vim25.ManagedObjectReference getHost() {
		return host;
	}

	/**
	 * Sets the host value for this CpuIncompatible.
	 * 
	 * @param host
	 */
	public void setHost(com.vmware.vim25.ManagedObjectReference host) {
		this.host = host;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof CpuIncompatible)) {
			return false;
		}
		CpuIncompatible other = (CpuIncompatible) obj;
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
				&& this.level == other.getLevel()
				&& ((this.registerName == null && other.getRegisterName() == null) || (this.registerName != null && this.registerName
						.equals(other.getRegisterName())))
				&& ((this.registerBits == null && other.getRegisterBits() == null) || (this.registerBits != null && this.registerBits
						.equals(other.getRegisterBits())))
				&& ((this.desiredBits == null && other.getDesiredBits() == null) || (this.desiredBits != null && this.desiredBits
						.equals(other.getDesiredBits())))
				&& ((this.host == null && other.getHost() == null) || (this.host != null && this.host
						.equals(other.getHost())));
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
		_hashCode += getLevel();
		if (getRegisterName() != null) {
			_hashCode += getRegisterName().hashCode();
		}
		if (getRegisterBits() != null) {
			_hashCode += getRegisterBits().hashCode();
		}
		if (getDesiredBits() != null) {
			_hashCode += getDesiredBits().hashCode();
		}
		if (getHost() != null) {
			_hashCode += getHost().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			CpuIncompatible.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"CpuIncompatible"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("level");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "level"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("registerName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"registerName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("registerBits");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"registerBits"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("desiredBits");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"desiredBits"));
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
