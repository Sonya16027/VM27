/**
 * HostBIOSInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostBIOSInfo extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String biosVersion;

	private java.util.Calendar releaseDate;

	public HostBIOSInfo() {
	}

	public HostBIOSInfo(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String biosVersion, java.util.Calendar releaseDate) {
		super(dynamicType, dynamicProperty);
		this.biosVersion = biosVersion;
		this.releaseDate = releaseDate;
	}

	/**
	 * Gets the biosVersion value for this HostBIOSInfo.
	 * 
	 * @return biosVersion
	 */
	public java.lang.String getBiosVersion() {
		return biosVersion;
	}

	/**
	 * Sets the biosVersion value for this HostBIOSInfo.
	 * 
	 * @param biosVersion
	 */
	public void setBiosVersion(java.lang.String biosVersion) {
		this.biosVersion = biosVersion;
	}

	/**
	 * Gets the releaseDate value for this HostBIOSInfo.
	 * 
	 * @return releaseDate
	 */
	public java.util.Calendar getReleaseDate() {
		return releaseDate;
	}

	/**
	 * Sets the releaseDate value for this HostBIOSInfo.
	 * 
	 * @param releaseDate
	 */
	public void setReleaseDate(java.util.Calendar releaseDate) {
		this.releaseDate = releaseDate;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostBIOSInfo)) {
			return false;
		}
		HostBIOSInfo other = (HostBIOSInfo) obj;
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
				&& ((this.biosVersion == null && other.getBiosVersion() == null) || (this.biosVersion != null && this.biosVersion
						.equals(other.getBiosVersion())))
				&& ((this.releaseDate == null && other.getReleaseDate() == null) || (this.releaseDate != null && this.releaseDate
						.equals(other.getReleaseDate())));
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
		if (getBiosVersion() != null) {
			_hashCode += getBiosVersion().hashCode();
		}
		if (getReleaseDate() != null) {
			_hashCode += getReleaseDate().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostBIOSInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostBIOSInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("biosVersion");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"biosVersion"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("releaseDate");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"releaseDate"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "dateTime"));
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
