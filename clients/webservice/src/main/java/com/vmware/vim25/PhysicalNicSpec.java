/**
 * PhysicalNicSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class PhysicalNicSpec extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.HostIpConfig ip;

	private com.vmware.vim25.PhysicalNicLinkInfo linkSpeed;

	public PhysicalNicSpec() {
	}

	public PhysicalNicSpec(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.HostIpConfig ip,
			com.vmware.vim25.PhysicalNicLinkInfo linkSpeed) {
		super(dynamicType, dynamicProperty);
		this.ip = ip;
		this.linkSpeed = linkSpeed;
	}

	/**
	 * Gets the ip value for this PhysicalNicSpec.
	 * 
	 * @return ip
	 */
	public com.vmware.vim25.HostIpConfig getIp() {
		return ip;
	}

	/**
	 * Sets the ip value for this PhysicalNicSpec.
	 * 
	 * @param ip
	 */
	public void setIp(com.vmware.vim25.HostIpConfig ip) {
		this.ip = ip;
	}

	/**
	 * Gets the linkSpeed value for this PhysicalNicSpec.
	 * 
	 * @return linkSpeed
	 */
	public com.vmware.vim25.PhysicalNicLinkInfo getLinkSpeed() {
		return linkSpeed;
	}

	/**
	 * Sets the linkSpeed value for this PhysicalNicSpec.
	 * 
	 * @param linkSpeed
	 */
	public void setLinkSpeed(com.vmware.vim25.PhysicalNicLinkInfo linkSpeed) {
		this.linkSpeed = linkSpeed;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof PhysicalNicSpec)) {
			return false;
		}
		PhysicalNicSpec other = (PhysicalNicSpec) obj;
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
				&& ((this.ip == null && other.getIp() == null) || (this.ip != null && this.ip
						.equals(other.getIp())))
				&& ((this.linkSpeed == null && other.getLinkSpeed() == null) || (this.linkSpeed != null && this.linkSpeed
						.equals(other.getLinkSpeed())));
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
		if (getIp() != null) {
			_hashCode += getIp().hashCode();
		}
		if (getLinkSpeed() != null) {
			_hashCode += getLinkSpeed().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			PhysicalNicSpec.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"PhysicalNicSpec"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ip");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ip"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostIpConfig"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("linkSpeed");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"linkSpeed"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"PhysicalNicLinkInfo"));
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
