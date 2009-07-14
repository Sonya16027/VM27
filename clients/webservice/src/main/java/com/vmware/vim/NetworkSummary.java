/**
 * NetworkSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class NetworkSummary extends com.vmware.vim.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.ManagedObjectReference network;

	private java.lang.String name;

	private boolean accessible;

	public NetworkSummary() {
	}

	public NetworkSummary(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			com.vmware.vim.ManagedObjectReference network,
			java.lang.String name, boolean accessible) {
		super(dynamicType, dynamicProperty);
		this.network = network;
		this.name = name;
		this.accessible = accessible;
	}

	/**
	 * Gets the network value for this NetworkSummary.
	 * 
	 * @return network
	 */
	public com.vmware.vim.ManagedObjectReference getNetwork() {
		return network;
	}

	/**
	 * Sets the network value for this NetworkSummary.
	 * 
	 * @param network
	 */
	public void setNetwork(com.vmware.vim.ManagedObjectReference network) {
		this.network = network;
	}

	/**
	 * Gets the name value for this NetworkSummary.
	 * 
	 * @return name
	 */
	public java.lang.String getName() {
		return name;
	}

	/**
	 * Sets the name value for this NetworkSummary.
	 * 
	 * @param name
	 */
	public void setName(java.lang.String name) {
		this.name = name;
	}

	/**
	 * Gets the accessible value for this NetworkSummary.
	 * 
	 * @return accessible
	 */
	public boolean isAccessible() {
		return accessible;
	}

	/**
	 * Sets the accessible value for this NetworkSummary.
	 * 
	 * @param accessible
	 */
	public void setAccessible(boolean accessible) {
		this.accessible = accessible;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof NetworkSummary)) {
			return false;
		}
		NetworkSummary other = (NetworkSummary) obj;
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
				&& ((this.name == null && other.getName() == null) || (this.name != null && this.name
						.equals(other.getName())))
				&& this.accessible == other.isAccessible();
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
		if (getName() != null) {
			_hashCode += getName().hashCode();
		}
		_hashCode += (isAccessible() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			NetworkSummary.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"NetworkSummary"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("network");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"network"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("name");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "name"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("accessible");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"accessible"));
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
