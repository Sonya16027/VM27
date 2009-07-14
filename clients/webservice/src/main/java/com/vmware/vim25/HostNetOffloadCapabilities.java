/**
 * HostNetOffloadCapabilities.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostNetOffloadCapabilities extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.Boolean csumOffload;

	private java.lang.Boolean tcpSegmentation;

	private java.lang.Boolean zeroCopyXmit;

	public HostNetOffloadCapabilities() {
	}

	public HostNetOffloadCapabilities(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.Boolean csumOffload, java.lang.Boolean tcpSegmentation,
			java.lang.Boolean zeroCopyXmit) {
		super(dynamicType, dynamicProperty);
		this.csumOffload = csumOffload;
		this.tcpSegmentation = tcpSegmentation;
		this.zeroCopyXmit = zeroCopyXmit;
	}

	/**
	 * Gets the csumOffload value for this HostNetOffloadCapabilities.
	 * 
	 * @return csumOffload
	 */
	public java.lang.Boolean getCsumOffload() {
		return csumOffload;
	}

	/**
	 * Sets the csumOffload value for this HostNetOffloadCapabilities.
	 * 
	 * @param csumOffload
	 */
	public void setCsumOffload(java.lang.Boolean csumOffload) {
		this.csumOffload = csumOffload;
	}

	/**
	 * Gets the tcpSegmentation value for this HostNetOffloadCapabilities.
	 * 
	 * @return tcpSegmentation
	 */
	public java.lang.Boolean getTcpSegmentation() {
		return tcpSegmentation;
	}

	/**
	 * Sets the tcpSegmentation value for this HostNetOffloadCapabilities.
	 * 
	 * @param tcpSegmentation
	 */
	public void setTcpSegmentation(java.lang.Boolean tcpSegmentation) {
		this.tcpSegmentation = tcpSegmentation;
	}

	/**
	 * Gets the zeroCopyXmit value for this HostNetOffloadCapabilities.
	 * 
	 * @return zeroCopyXmit
	 */
	public java.lang.Boolean getZeroCopyXmit() {
		return zeroCopyXmit;
	}

	/**
	 * Sets the zeroCopyXmit value for this HostNetOffloadCapabilities.
	 * 
	 * @param zeroCopyXmit
	 */
	public void setZeroCopyXmit(java.lang.Boolean zeroCopyXmit) {
		this.zeroCopyXmit = zeroCopyXmit;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostNetOffloadCapabilities)) {
			return false;
		}
		HostNetOffloadCapabilities other = (HostNetOffloadCapabilities) obj;
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
				&& ((this.csumOffload == null && other.getCsumOffload() == null) || (this.csumOffload != null && this.csumOffload
						.equals(other.getCsumOffload())))
				&& ((this.tcpSegmentation == null && other.getTcpSegmentation() == null) || (this.tcpSegmentation != null && this.tcpSegmentation
						.equals(other.getTcpSegmentation())))
				&& ((this.zeroCopyXmit == null && other.getZeroCopyXmit() == null) || (this.zeroCopyXmit != null && this.zeroCopyXmit
						.equals(other.getZeroCopyXmit())));
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
		if (getCsumOffload() != null) {
			_hashCode += getCsumOffload().hashCode();
		}
		if (getTcpSegmentation() != null) {
			_hashCode += getTcpSegmentation().hashCode();
		}
		if (getZeroCopyXmit() != null) {
			_hashCode += getZeroCopyXmit().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostNetOffloadCapabilities.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostNetOffloadCapabilities"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("csumOffload");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"csumOffload"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("tcpSegmentation");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"tcpSegmentation"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("zeroCopyXmit");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"zeroCopyXmit"));
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
