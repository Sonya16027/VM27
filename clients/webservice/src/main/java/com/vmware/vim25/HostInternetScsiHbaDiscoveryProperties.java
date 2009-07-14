/**
 * HostInternetScsiHbaDiscoveryProperties.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostInternetScsiHbaDiscoveryProperties extends
		com.vmware.vim25.DynamicData implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private boolean iSnsDiscoveryEnabled;

	private java.lang.String iSnsDiscoveryMethod;

	private java.lang.String iSnsHost;

	private boolean slpDiscoveryEnabled;

	private java.lang.String slpDiscoveryMethod;

	private java.lang.String slpHost;

	private boolean staticTargetDiscoveryEnabled;

	private boolean sendTargetsDiscoveryEnabled;

	public HostInternetScsiHbaDiscoveryProperties() {
	}

	public HostInternetScsiHbaDiscoveryProperties(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			boolean iSnsDiscoveryEnabled, java.lang.String iSnsDiscoveryMethod,
			java.lang.String iSnsHost, boolean slpDiscoveryEnabled,
			java.lang.String slpDiscoveryMethod, java.lang.String slpHost,
			boolean staticTargetDiscoveryEnabled,
			boolean sendTargetsDiscoveryEnabled) {
		super(dynamicType, dynamicProperty);
		this.iSnsDiscoveryEnabled = iSnsDiscoveryEnabled;
		this.iSnsDiscoveryMethod = iSnsDiscoveryMethod;
		this.iSnsHost = iSnsHost;
		this.slpDiscoveryEnabled = slpDiscoveryEnabled;
		this.slpDiscoveryMethod = slpDiscoveryMethod;
		this.slpHost = slpHost;
		this.staticTargetDiscoveryEnabled = staticTargetDiscoveryEnabled;
		this.sendTargetsDiscoveryEnabled = sendTargetsDiscoveryEnabled;
	}

	/**
	 * Gets the iSnsDiscoveryEnabled value for this
	 * HostInternetScsiHbaDiscoveryProperties.
	 * 
	 * @return iSnsDiscoveryEnabled
	 */
	public boolean isISnsDiscoveryEnabled() {
		return iSnsDiscoveryEnabled;
	}

	/**
	 * Sets the iSnsDiscoveryEnabled value for this
	 * HostInternetScsiHbaDiscoveryProperties.
	 * 
	 * @param iSnsDiscoveryEnabled
	 */
	public void setISnsDiscoveryEnabled(boolean iSnsDiscoveryEnabled) {
		this.iSnsDiscoveryEnabled = iSnsDiscoveryEnabled;
	}

	/**
	 * Gets the iSnsDiscoveryMethod value for this
	 * HostInternetScsiHbaDiscoveryProperties.
	 * 
	 * @return iSnsDiscoveryMethod
	 */
	public java.lang.String getISnsDiscoveryMethod() {
		return iSnsDiscoveryMethod;
	}

	/**
	 * Sets the iSnsDiscoveryMethod value for this
	 * HostInternetScsiHbaDiscoveryProperties.
	 * 
	 * @param iSnsDiscoveryMethod
	 */
	public void setISnsDiscoveryMethod(java.lang.String iSnsDiscoveryMethod) {
		this.iSnsDiscoveryMethod = iSnsDiscoveryMethod;
	}

	/**
	 * Gets the iSnsHost value for this HostInternetScsiHbaDiscoveryProperties.
	 * 
	 * @return iSnsHost
	 */
	public java.lang.String getISnsHost() {
		return iSnsHost;
	}

	/**
	 * Sets the iSnsHost value for this HostInternetScsiHbaDiscoveryProperties.
	 * 
	 * @param iSnsHost
	 */
	public void setISnsHost(java.lang.String iSnsHost) {
		this.iSnsHost = iSnsHost;
	}

	/**
	 * Gets the slpDiscoveryEnabled value for this
	 * HostInternetScsiHbaDiscoveryProperties.
	 * 
	 * @return slpDiscoveryEnabled
	 */
	public boolean isSlpDiscoveryEnabled() {
		return slpDiscoveryEnabled;
	}

	/**
	 * Sets the slpDiscoveryEnabled value for this
	 * HostInternetScsiHbaDiscoveryProperties.
	 * 
	 * @param slpDiscoveryEnabled
	 */
	public void setSlpDiscoveryEnabled(boolean slpDiscoveryEnabled) {
		this.slpDiscoveryEnabled = slpDiscoveryEnabled;
	}

	/**
	 * Gets the slpDiscoveryMethod value for this
	 * HostInternetScsiHbaDiscoveryProperties.
	 * 
	 * @return slpDiscoveryMethod
	 */
	public java.lang.String getSlpDiscoveryMethod() {
		return slpDiscoveryMethod;
	}

	/**
	 * Sets the slpDiscoveryMethod value for this
	 * HostInternetScsiHbaDiscoveryProperties.
	 * 
	 * @param slpDiscoveryMethod
	 */
	public void setSlpDiscoveryMethod(java.lang.String slpDiscoveryMethod) {
		this.slpDiscoveryMethod = slpDiscoveryMethod;
	}

	/**
	 * Gets the slpHost value for this HostInternetScsiHbaDiscoveryProperties.
	 * 
	 * @return slpHost
	 */
	public java.lang.String getSlpHost() {
		return slpHost;
	}

	/**
	 * Sets the slpHost value for this HostInternetScsiHbaDiscoveryProperties.
	 * 
	 * @param slpHost
	 */
	public void setSlpHost(java.lang.String slpHost) {
		this.slpHost = slpHost;
	}

	/**
	 * Gets the staticTargetDiscoveryEnabled value for this
	 * HostInternetScsiHbaDiscoveryProperties.
	 * 
	 * @return staticTargetDiscoveryEnabled
	 */
	public boolean isStaticTargetDiscoveryEnabled() {
		return staticTargetDiscoveryEnabled;
	}

	/**
	 * Sets the staticTargetDiscoveryEnabled value for this
	 * HostInternetScsiHbaDiscoveryProperties.
	 * 
	 * @param staticTargetDiscoveryEnabled
	 */
	public void setStaticTargetDiscoveryEnabled(
			boolean staticTargetDiscoveryEnabled) {
		this.staticTargetDiscoveryEnabled = staticTargetDiscoveryEnabled;
	}

	/**
	 * Gets the sendTargetsDiscoveryEnabled value for this
	 * HostInternetScsiHbaDiscoveryProperties.
	 * 
	 * @return sendTargetsDiscoveryEnabled
	 */
	public boolean isSendTargetsDiscoveryEnabled() {
		return sendTargetsDiscoveryEnabled;
	}

	/**
	 * Sets the sendTargetsDiscoveryEnabled value for this
	 * HostInternetScsiHbaDiscoveryProperties.
	 * 
	 * @param sendTargetsDiscoveryEnabled
	 */
	public void setSendTargetsDiscoveryEnabled(
			boolean sendTargetsDiscoveryEnabled) {
		this.sendTargetsDiscoveryEnabled = sendTargetsDiscoveryEnabled;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostInternetScsiHbaDiscoveryProperties)) {
			return false;
		}
		HostInternetScsiHbaDiscoveryProperties other = (HostInternetScsiHbaDiscoveryProperties) obj;
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
				&& this.iSnsDiscoveryEnabled == other.isISnsDiscoveryEnabled()
				&& ((this.iSnsDiscoveryMethod == null && other
						.getISnsDiscoveryMethod() == null) || (this.iSnsDiscoveryMethod != null && this.iSnsDiscoveryMethod
						.equals(other.getISnsDiscoveryMethod())))
				&& ((this.iSnsHost == null && other.getISnsHost() == null) || (this.iSnsHost != null && this.iSnsHost
						.equals(other.getISnsHost())))
				&& this.slpDiscoveryEnabled == other.isSlpDiscoveryEnabled()
				&& ((this.slpDiscoveryMethod == null && other
						.getSlpDiscoveryMethod() == null) || (this.slpDiscoveryMethod != null && this.slpDiscoveryMethod
						.equals(other.getSlpDiscoveryMethod())))
				&& ((this.slpHost == null && other.getSlpHost() == null) || (this.slpHost != null && this.slpHost
						.equals(other.getSlpHost())))
				&& this.staticTargetDiscoveryEnabled == other
						.isStaticTargetDiscoveryEnabled()
				&& this.sendTargetsDiscoveryEnabled == other
						.isSendTargetsDiscoveryEnabled();
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
		_hashCode += (isISnsDiscoveryEnabled() ? Boolean.TRUE : Boolean.FALSE)
				.hashCode();
		if (getISnsDiscoveryMethod() != null) {
			_hashCode += getISnsDiscoveryMethod().hashCode();
		}
		if (getISnsHost() != null) {
			_hashCode += getISnsHost().hashCode();
		}
		_hashCode += (isSlpDiscoveryEnabled() ? Boolean.TRUE : Boolean.FALSE)
				.hashCode();
		if (getSlpDiscoveryMethod() != null) {
			_hashCode += getSlpDiscoveryMethod().hashCode();
		}
		if (getSlpHost() != null) {
			_hashCode += getSlpHost().hashCode();
		}
		_hashCode += (isStaticTargetDiscoveryEnabled() ? Boolean.TRUE
				: Boolean.FALSE).hashCode();
		_hashCode += (isSendTargetsDiscoveryEnabled() ? Boolean.TRUE
				: Boolean.FALSE).hashCode();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostInternetScsiHbaDiscoveryProperties.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostInternetScsiHbaDiscoveryProperties"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ISnsDiscoveryEnabled");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"iSnsDiscoveryEnabled"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ISnsDiscoveryMethod");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"iSnsDiscoveryMethod"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ISnsHost");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"iSnsHost"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("slpDiscoveryEnabled");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"slpDiscoveryEnabled"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("slpDiscoveryMethod");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"slpDiscoveryMethod"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("slpHost");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"slpHost"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("staticTargetDiscoveryEnabled");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"staticTargetDiscoveryEnabled"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("sendTargetsDiscoveryEnabled");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"sendTargetsDiscoveryEnabled"));
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
