/**
 * CustomizationLinuxPrep.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class CustomizationLinuxPrep extends
		com.vmware.vim25.CustomizationIdentitySettings implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.CustomizationName hostName;

	private java.lang.String domain;

	private java.lang.String timeZone;

	private java.lang.Boolean hwClockUTC;

	public CustomizationLinuxPrep() {
	}

	public CustomizationLinuxPrep(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.CustomizationName hostName,
			java.lang.String domain, java.lang.String timeZone,
			java.lang.Boolean hwClockUTC) {
		super(dynamicType, dynamicProperty);
		this.hostName = hostName;
		this.domain = domain;
		this.timeZone = timeZone;
		this.hwClockUTC = hwClockUTC;
	}

	/**
	 * Gets the hostName value for this CustomizationLinuxPrep.
	 * 
	 * @return hostName
	 */
	public com.vmware.vim25.CustomizationName getHostName() {
		return hostName;
	}

	/**
	 * Sets the hostName value for this CustomizationLinuxPrep.
	 * 
	 * @param hostName
	 */
	public void setHostName(com.vmware.vim25.CustomizationName hostName) {
		this.hostName = hostName;
	}

	/**
	 * Gets the domain value for this CustomizationLinuxPrep.
	 * 
	 * @return domain
	 */
	public java.lang.String getDomain() {
		return domain;
	}

	/**
	 * Sets the domain value for this CustomizationLinuxPrep.
	 * 
	 * @param domain
	 */
	public void setDomain(java.lang.String domain) {
		this.domain = domain;
	}

	/**
	 * Gets the timeZone value for this CustomizationLinuxPrep.
	 * 
	 * @return timeZone
	 */
	public java.lang.String getTimeZone() {
		return timeZone;
	}

	/**
	 * Sets the timeZone value for this CustomizationLinuxPrep.
	 * 
	 * @param timeZone
	 */
	public void setTimeZone(java.lang.String timeZone) {
		this.timeZone = timeZone;
	}

	/**
	 * Gets the hwClockUTC value for this CustomizationLinuxPrep.
	 * 
	 * @return hwClockUTC
	 */
	public java.lang.Boolean getHwClockUTC() {
		return hwClockUTC;
	}

	/**
	 * Sets the hwClockUTC value for this CustomizationLinuxPrep.
	 * 
	 * @param hwClockUTC
	 */
	public void setHwClockUTC(java.lang.Boolean hwClockUTC) {
		this.hwClockUTC = hwClockUTC;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof CustomizationLinuxPrep)) {
			return false;
		}
		CustomizationLinuxPrep other = (CustomizationLinuxPrep) obj;
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
				&& ((this.hostName == null && other.getHostName() == null) || (this.hostName != null && this.hostName
						.equals(other.getHostName())))
				&& ((this.domain == null && other.getDomain() == null) || (this.domain != null && this.domain
						.equals(other.getDomain())))
				&& ((this.timeZone == null && other.getTimeZone() == null) || (this.timeZone != null && this.timeZone
						.equals(other.getTimeZone())))
				&& ((this.hwClockUTC == null && other.getHwClockUTC() == null) || (this.hwClockUTC != null && this.hwClockUTC
						.equals(other.getHwClockUTC())));
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
		if (getHostName() != null) {
			_hashCode += getHostName().hashCode();
		}
		if (getDomain() != null) {
			_hashCode += getDomain().hashCode();
		}
		if (getTimeZone() != null) {
			_hashCode += getTimeZone().hashCode();
		}
		if (getHwClockUTC() != null) {
			_hashCode += getHwClockUTC().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			CustomizationLinuxPrep.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"CustomizationLinuxPrep"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"hostName"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"CustomizationName"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("domain");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"domain"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("timeZone");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"timeZone"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hwClockUTC");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"hwClockUTC"));
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
