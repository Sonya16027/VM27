/**
 * HostIpConfigIpV6Address.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostIpConfigIpV6Address extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String ipAddress;

	private int prefixLength;

	private java.lang.String origin;

	private java.lang.String dadState;

	private java.util.Calendar lifetime;

	private java.lang.String operation;

	public HostIpConfigIpV6Address() {
	}

	public HostIpConfigIpV6Address(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String ipAddress, int prefixLength,
			java.lang.String origin, java.lang.String dadState,
			java.util.Calendar lifetime, java.lang.String operation) {
		super(dynamicType, dynamicProperty);
		this.ipAddress = ipAddress;
		this.prefixLength = prefixLength;
		this.origin = origin;
		this.dadState = dadState;
		this.lifetime = lifetime;
		this.operation = operation;
	}

	/**
	 * Gets the ipAddress value for this HostIpConfigIpV6Address.
	 * 
	 * @return ipAddress
	 */
	public java.lang.String getIpAddress() {
		return ipAddress;
	}

	/**
	 * Sets the ipAddress value for this HostIpConfigIpV6Address.
	 * 
	 * @param ipAddress
	 */
	public void setIpAddress(java.lang.String ipAddress) {
		this.ipAddress = ipAddress;
	}

	/**
	 * Gets the prefixLength value for this HostIpConfigIpV6Address.
	 * 
	 * @return prefixLength
	 */
	public int getPrefixLength() {
		return prefixLength;
	}

	/**
	 * Sets the prefixLength value for this HostIpConfigIpV6Address.
	 * 
	 * @param prefixLength
	 */
	public void setPrefixLength(int prefixLength) {
		this.prefixLength = prefixLength;
	}

	/**
	 * Gets the origin value for this HostIpConfigIpV6Address.
	 * 
	 * @return origin
	 */
	public java.lang.String getOrigin() {
		return origin;
	}

	/**
	 * Sets the origin value for this HostIpConfigIpV6Address.
	 * 
	 * @param origin
	 */
	public void setOrigin(java.lang.String origin) {
		this.origin = origin;
	}

	/**
	 * Gets the dadState value for this HostIpConfigIpV6Address.
	 * 
	 * @return dadState
	 */
	public java.lang.String getDadState() {
		return dadState;
	}

	/**
	 * Sets the dadState value for this HostIpConfigIpV6Address.
	 * 
	 * @param dadState
	 */
	public void setDadState(java.lang.String dadState) {
		this.dadState = dadState;
	}

	/**
	 * Gets the lifetime value for this HostIpConfigIpV6Address.
	 * 
	 * @return lifetime
	 */
	public java.util.Calendar getLifetime() {
		return lifetime;
	}

	/**
	 * Sets the lifetime value for this HostIpConfigIpV6Address.
	 * 
	 * @param lifetime
	 */
	public void setLifetime(java.util.Calendar lifetime) {
		this.lifetime = lifetime;
	}

	/**
	 * Gets the operation value for this HostIpConfigIpV6Address.
	 * 
	 * @return operation
	 */
	public java.lang.String getOperation() {
		return operation;
	}

	/**
	 * Sets the operation value for this HostIpConfigIpV6Address.
	 * 
	 * @param operation
	 */
	public void setOperation(java.lang.String operation) {
		this.operation = operation;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostIpConfigIpV6Address)) {
			return false;
		}
		HostIpConfigIpV6Address other = (HostIpConfigIpV6Address) obj;
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
				&& ((this.ipAddress == null && other.getIpAddress() == null) || (this.ipAddress != null && this.ipAddress
						.equals(other.getIpAddress())))
				&& this.prefixLength == other.getPrefixLength()
				&& ((this.origin == null && other.getOrigin() == null) || (this.origin != null && this.origin
						.equals(other.getOrigin())))
				&& ((this.dadState == null && other.getDadState() == null) || (this.dadState != null && this.dadState
						.equals(other.getDadState())))
				&& ((this.lifetime == null && other.getLifetime() == null) || (this.lifetime != null && this.lifetime
						.equals(other.getLifetime())))
				&& ((this.operation == null && other.getOperation() == null) || (this.operation != null && this.operation
						.equals(other.getOperation())));
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
		if (getIpAddress() != null) {
			_hashCode += getIpAddress().hashCode();
		}
		_hashCode += getPrefixLength();
		if (getOrigin() != null) {
			_hashCode += getOrigin().hashCode();
		}
		if (getDadState() != null) {
			_hashCode += getDadState().hashCode();
		}
		if (getLifetime() != null) {
			_hashCode += getLifetime().hashCode();
		}
		if (getOperation() != null) {
			_hashCode += getOperation().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostIpConfigIpV6Address.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostIpConfigIpV6Address"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ipAddress");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"ipAddress"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("prefixLength");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"prefixLength"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("origin");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"origin"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dadState");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"dadState"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("lifetime");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"lifetime"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("operation");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"operation"));
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
