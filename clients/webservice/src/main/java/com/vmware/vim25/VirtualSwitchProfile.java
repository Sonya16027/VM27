/**
 * VirtualSwitchProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualSwitchProfile extends com.vmware.vim25.ApplyProfile
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String key;

	private java.lang.String name;

	private com.vmware.vim25.LinkProfile link;

	private com.vmware.vim25.NumPortsProfile numPorts;

	private com.vmware.vim25.NetworkPolicyProfile networkPolicy;

	public VirtualSwitchProfile() {
	}

	public VirtualSwitchProfile(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			boolean enabled, com.vmware.vim25.ProfilePolicy[] policy,
			java.lang.String key, java.lang.String name,
			com.vmware.vim25.LinkProfile link,
			com.vmware.vim25.NumPortsProfile numPorts,
			com.vmware.vim25.NetworkPolicyProfile networkPolicy) {
		super(dynamicType, dynamicProperty, enabled, policy);
		this.key = key;
		this.name = name;
		this.link = link;
		this.numPorts = numPorts;
		this.networkPolicy = networkPolicy;
	}

	/**
	 * Gets the key value for this VirtualSwitchProfile.
	 * 
	 * @return key
	 */
	public java.lang.String getKey() {
		return key;
	}

	/**
	 * Sets the key value for this VirtualSwitchProfile.
	 * 
	 * @param key
	 */
	public void setKey(java.lang.String key) {
		this.key = key;
	}

	/**
	 * Gets the name value for this VirtualSwitchProfile.
	 * 
	 * @return name
	 */
	public java.lang.String getName() {
		return name;
	}

	/**
	 * Sets the name value for this VirtualSwitchProfile.
	 * 
	 * @param name
	 */
	public void setName(java.lang.String name) {
		this.name = name;
	}

	/**
	 * Gets the link value for this VirtualSwitchProfile.
	 * 
	 * @return link
	 */
	public com.vmware.vim25.LinkProfile getLink() {
		return link;
	}

	/**
	 * Sets the link value for this VirtualSwitchProfile.
	 * 
	 * @param link
	 */
	public void setLink(com.vmware.vim25.LinkProfile link) {
		this.link = link;
	}

	/**
	 * Gets the numPorts value for this VirtualSwitchProfile.
	 * 
	 * @return numPorts
	 */
	public com.vmware.vim25.NumPortsProfile getNumPorts() {
		return numPorts;
	}

	/**
	 * Sets the numPorts value for this VirtualSwitchProfile.
	 * 
	 * @param numPorts
	 */
	public void setNumPorts(com.vmware.vim25.NumPortsProfile numPorts) {
		this.numPorts = numPorts;
	}

	/**
	 * Gets the networkPolicy value for this VirtualSwitchProfile.
	 * 
	 * @return networkPolicy
	 */
	public com.vmware.vim25.NetworkPolicyProfile getNetworkPolicy() {
		return networkPolicy;
	}

	/**
	 * Sets the networkPolicy value for this VirtualSwitchProfile.
	 * 
	 * @param networkPolicy
	 */
	public void setNetworkPolicy(
			com.vmware.vim25.NetworkPolicyProfile networkPolicy) {
		this.networkPolicy = networkPolicy;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualSwitchProfile)) {
			return false;
		}
		VirtualSwitchProfile other = (VirtualSwitchProfile) obj;
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
				&& ((this.key == null && other.getKey() == null) || (this.key != null && this.key
						.equals(other.getKey())))
				&& ((this.name == null && other.getName() == null) || (this.name != null && this.name
						.equals(other.getName())))
				&& ((this.link == null && other.getLink() == null) || (this.link != null && this.link
						.equals(other.getLink())))
				&& ((this.numPorts == null && other.getNumPorts() == null) || (this.numPorts != null && this.numPorts
						.equals(other.getNumPorts())))
				&& ((this.networkPolicy == null && other.getNetworkPolicy() == null) || (this.networkPolicy != null && this.networkPolicy
						.equals(other.getNetworkPolicy())));
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
		if (getKey() != null) {
			_hashCode += getKey().hashCode();
		}
		if (getName() != null) {
			_hashCode += getName().hashCode();
		}
		if (getLink() != null) {
			_hashCode += getLink().hashCode();
		}
		if (getNumPorts() != null) {
			_hashCode += getNumPorts().hashCode();
		}
		if (getNetworkPolicy() != null) {
			_hashCode += getNetworkPolicy().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VirtualSwitchProfile.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualSwitchProfile"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("key");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
		elemField.setFieldName("link");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "link"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"LinkProfile"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numPorts");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"numPorts"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"NumPortsProfile"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("networkPolicy");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"networkPolicy"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"NetworkPolicyProfile"));
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
