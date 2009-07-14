/**
 * HostInternetScsiHbaStaticTarget.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostInternetScsiHbaStaticTarget extends com.vmware.vim.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String address;

	private java.lang.Integer port;

	private java.lang.String iScsiName;

	public HostInternetScsiHbaStaticTarget() {
	}

	public HostInternetScsiHbaStaticTarget(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			java.lang.String address, java.lang.Integer port,
			java.lang.String iScsiName) {
		super(dynamicType, dynamicProperty);
		this.address = address;
		this.port = port;
		this.iScsiName = iScsiName;
	}

	/**
	 * Gets the address value for this HostInternetScsiHbaStaticTarget.
	 * 
	 * @return address
	 */
	public java.lang.String getAddress() {
		return address;
	}

	/**
	 * Sets the address value for this HostInternetScsiHbaStaticTarget.
	 * 
	 * @param address
	 */
	public void setAddress(java.lang.String address) {
		this.address = address;
	}

	/**
	 * Gets the port value for this HostInternetScsiHbaStaticTarget.
	 * 
	 * @return port
	 */
	public java.lang.Integer getPort() {
		return port;
	}

	/**
	 * Sets the port value for this HostInternetScsiHbaStaticTarget.
	 * 
	 * @param port
	 */
	public void setPort(java.lang.Integer port) {
		this.port = port;
	}

	/**
	 * Gets the iScsiName value for this HostInternetScsiHbaStaticTarget.
	 * 
	 * @return iScsiName
	 */
	public java.lang.String getIScsiName() {
		return iScsiName;
	}

	/**
	 * Sets the iScsiName value for this HostInternetScsiHbaStaticTarget.
	 * 
	 * @param iScsiName
	 */
	public void setIScsiName(java.lang.String iScsiName) {
		this.iScsiName = iScsiName;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostInternetScsiHbaStaticTarget)) {
			return false;
		}
		HostInternetScsiHbaStaticTarget other = (HostInternetScsiHbaStaticTarget) obj;
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
				&& ((this.address == null && other.getAddress() == null) || (this.address != null && this.address
						.equals(other.getAddress())))
				&& ((this.port == null && other.getPort() == null) || (this.port != null && this.port
						.equals(other.getPort())))
				&& ((this.iScsiName == null && other.getIScsiName() == null) || (this.iScsiName != null && this.iScsiName
						.equals(other.getIScsiName())));
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
		if (getAddress() != null) {
			_hashCode += getAddress().hashCode();
		}
		if (getPort() != null) {
			_hashCode += getPort().hashCode();
		}
		if (getIScsiName() != null) {
			_hashCode += getIScsiName().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostInternetScsiHbaStaticTarget.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostInternetScsiHbaStaticTarget"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("address");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"address"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("port");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "port"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("IScsiName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"iScsiName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
