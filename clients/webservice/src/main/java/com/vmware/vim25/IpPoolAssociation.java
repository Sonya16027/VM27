/**
 * IpPoolAssociation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class IpPoolAssociation extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference network;

	private java.lang.String networkName;

	public IpPoolAssociation() {
	}

	public IpPoolAssociation(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.ManagedObjectReference network,
			java.lang.String networkName) {
		super(dynamicType, dynamicProperty);
		this.network = network;
		this.networkName = networkName;
	}

	/**
	 * Gets the network value for this IpPoolAssociation.
	 * 
	 * @return network
	 */
	public com.vmware.vim25.ManagedObjectReference getNetwork() {
		return network;
	}

	/**
	 * Sets the network value for this IpPoolAssociation.
	 * 
	 * @param network
	 */
	public void setNetwork(com.vmware.vim25.ManagedObjectReference network) {
		this.network = network;
	}

	/**
	 * Gets the networkName value for this IpPoolAssociation.
	 * 
	 * @return networkName
	 */
	public java.lang.String getNetworkName() {
		return networkName;
	}

	/**
	 * Sets the networkName value for this IpPoolAssociation.
	 * 
	 * @param networkName
	 */
	public void setNetworkName(java.lang.String networkName) {
		this.networkName = networkName;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof IpPoolAssociation)) {
			return false;
		}
		IpPoolAssociation other = (IpPoolAssociation) obj;
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
				&& ((this.network == null && other.getNetwork() == null) || (this.network != null && this.network
						.equals(other.getNetwork())))
				&& ((this.networkName == null && other.getNetworkName() == null) || (this.networkName != null && this.networkName
						.equals(other.getNetworkName())));
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
		if (getNetwork() != null) {
			_hashCode += getNetwork().hashCode();
		}
		if (getNetworkName() != null) {
			_hashCode += getNetworkName().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			IpPoolAssociation.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"IpPoolAssociation"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("network");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"network"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("networkName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"networkName"));
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
