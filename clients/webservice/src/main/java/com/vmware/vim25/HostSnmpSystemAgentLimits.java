/**
 * HostSnmpSystemAgentLimits.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostSnmpSystemAgentLimits extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int maxReadOnlyCommunities;

	private int maxTrapDestinations;

	private int maxCommunityLength;

	private int maxBufferSize;

	private com.vmware.vim25.HostSnmpAgentCapability capability;

	public HostSnmpSystemAgentLimits() {
	}

	public HostSnmpSystemAgentLimits(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			int maxReadOnlyCommunities, int maxTrapDestinations,
			int maxCommunityLength, int maxBufferSize,
			com.vmware.vim25.HostSnmpAgentCapability capability) {
		super(dynamicType, dynamicProperty);
		this.maxReadOnlyCommunities = maxReadOnlyCommunities;
		this.maxTrapDestinations = maxTrapDestinations;
		this.maxCommunityLength = maxCommunityLength;
		this.maxBufferSize = maxBufferSize;
		this.capability = capability;
	}

	/**
	 * Gets the maxReadOnlyCommunities value for this HostSnmpSystemAgentLimits.
	 * 
	 * @return maxReadOnlyCommunities
	 */
	public int getMaxReadOnlyCommunities() {
		return maxReadOnlyCommunities;
	}

	/**
	 * Sets the maxReadOnlyCommunities value for this HostSnmpSystemAgentLimits.
	 * 
	 * @param maxReadOnlyCommunities
	 */
	public void setMaxReadOnlyCommunities(int maxReadOnlyCommunities) {
		this.maxReadOnlyCommunities = maxReadOnlyCommunities;
	}

	/**
	 * Gets the maxTrapDestinations value for this HostSnmpSystemAgentLimits.
	 * 
	 * @return maxTrapDestinations
	 */
	public int getMaxTrapDestinations() {
		return maxTrapDestinations;
	}

	/**
	 * Sets the maxTrapDestinations value for this HostSnmpSystemAgentLimits.
	 * 
	 * @param maxTrapDestinations
	 */
	public void setMaxTrapDestinations(int maxTrapDestinations) {
		this.maxTrapDestinations = maxTrapDestinations;
	}

	/**
	 * Gets the maxCommunityLength value for this HostSnmpSystemAgentLimits.
	 * 
	 * @return maxCommunityLength
	 */
	public int getMaxCommunityLength() {
		return maxCommunityLength;
	}

	/**
	 * Sets the maxCommunityLength value for this HostSnmpSystemAgentLimits.
	 * 
	 * @param maxCommunityLength
	 */
	public void setMaxCommunityLength(int maxCommunityLength) {
		this.maxCommunityLength = maxCommunityLength;
	}

	/**
	 * Gets the maxBufferSize value for this HostSnmpSystemAgentLimits.
	 * 
	 * @return maxBufferSize
	 */
	public int getMaxBufferSize() {
		return maxBufferSize;
	}

	/**
	 * Sets the maxBufferSize value for this HostSnmpSystemAgentLimits.
	 * 
	 * @param maxBufferSize
	 */
	public void setMaxBufferSize(int maxBufferSize) {
		this.maxBufferSize = maxBufferSize;
	}

	/**
	 * Gets the capability value for this HostSnmpSystemAgentLimits.
	 * 
	 * @return capability
	 */
	public com.vmware.vim25.HostSnmpAgentCapability getCapability() {
		return capability;
	}

	/**
	 * Sets the capability value for this HostSnmpSystemAgentLimits.
	 * 
	 * @param capability
	 */
	public void setCapability(
			com.vmware.vim25.HostSnmpAgentCapability capability) {
		this.capability = capability;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostSnmpSystemAgentLimits)) {
			return false;
		}
		HostSnmpSystemAgentLimits other = (HostSnmpSystemAgentLimits) obj;
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
				&& this.maxReadOnlyCommunities == other
						.getMaxReadOnlyCommunities()
				&& this.maxTrapDestinations == other.getMaxTrapDestinations()
				&& this.maxCommunityLength == other.getMaxCommunityLength()
				&& this.maxBufferSize == other.getMaxBufferSize()
				&& ((this.capability == null && other.getCapability() == null) || (this.capability != null && this.capability
						.equals(other.getCapability())));
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
		_hashCode += getMaxReadOnlyCommunities();
		_hashCode += getMaxTrapDestinations();
		_hashCode += getMaxCommunityLength();
		_hashCode += getMaxBufferSize();
		if (getCapability() != null) {
			_hashCode += getCapability().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostSnmpSystemAgentLimits.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostSnmpSystemAgentLimits"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("maxReadOnlyCommunities");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"maxReadOnlyCommunities"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("maxTrapDestinations");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"maxTrapDestinations"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("maxCommunityLength");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"maxCommunityLength"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("maxBufferSize");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"maxBufferSize"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("capability");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"capability"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostSnmpAgentCapability"));
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
