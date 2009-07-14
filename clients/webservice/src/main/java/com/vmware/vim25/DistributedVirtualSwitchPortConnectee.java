/**
 * DistributedVirtualSwitchPortConnectee.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class DistributedVirtualSwitchPortConnectee extends
		com.vmware.vim25.DynamicData implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference connectedEntity;

	private java.lang.String nicKey;

	private java.lang.String type;

	private java.lang.String addressHint;

	public DistributedVirtualSwitchPortConnectee() {
	}

	public DistributedVirtualSwitchPortConnectee(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.ManagedObjectReference connectedEntity,
			java.lang.String nicKey, java.lang.String type,
			java.lang.String addressHint) {
		super(dynamicType, dynamicProperty);
		this.connectedEntity = connectedEntity;
		this.nicKey = nicKey;
		this.type = type;
		this.addressHint = addressHint;
	}

	/**
	 * Gets the connectedEntity value for this
	 * DistributedVirtualSwitchPortConnectee.
	 * 
	 * @return connectedEntity
	 */
	public com.vmware.vim25.ManagedObjectReference getConnectedEntity() {
		return connectedEntity;
	}

	/**
	 * Sets the connectedEntity value for this
	 * DistributedVirtualSwitchPortConnectee.
	 * 
	 * @param connectedEntity
	 */
	public void setConnectedEntity(
			com.vmware.vim25.ManagedObjectReference connectedEntity) {
		this.connectedEntity = connectedEntity;
	}

	/**
	 * Gets the nicKey value for this DistributedVirtualSwitchPortConnectee.
	 * 
	 * @return nicKey
	 */
	public java.lang.String getNicKey() {
		return nicKey;
	}

	/**
	 * Sets the nicKey value for this DistributedVirtualSwitchPortConnectee.
	 * 
	 * @param nicKey
	 */
	public void setNicKey(java.lang.String nicKey) {
		this.nicKey = nicKey;
	}

	/**
	 * Gets the type value for this DistributedVirtualSwitchPortConnectee.
	 * 
	 * @return type
	 */
	public java.lang.String getType() {
		return type;
	}

	/**
	 * Sets the type value for this DistributedVirtualSwitchPortConnectee.
	 * 
	 * @param type
	 */
	public void setType(java.lang.String type) {
		this.type = type;
	}

	/**
	 * Gets the addressHint value for this
	 * DistributedVirtualSwitchPortConnectee.
	 * 
	 * @return addressHint
	 */
	public java.lang.String getAddressHint() {
		return addressHint;
	}

	/**
	 * Sets the addressHint value for this
	 * DistributedVirtualSwitchPortConnectee.
	 * 
	 * @param addressHint
	 */
	public void setAddressHint(java.lang.String addressHint) {
		this.addressHint = addressHint;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof DistributedVirtualSwitchPortConnectee)) {
			return false;
		}
		DistributedVirtualSwitchPortConnectee other = (DistributedVirtualSwitchPortConnectee) obj;
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
				&& ((this.connectedEntity == null && other.getConnectedEntity() == null) || (this.connectedEntity != null && this.connectedEntity
						.equals(other.getConnectedEntity())))
				&& ((this.nicKey == null && other.getNicKey() == null) || (this.nicKey != null && this.nicKey
						.equals(other.getNicKey())))
				&& ((this.type == null && other.getType() == null) || (this.type != null && this.type
						.equals(other.getType())))
				&& ((this.addressHint == null && other.getAddressHint() == null) || (this.addressHint != null && this.addressHint
						.equals(other.getAddressHint())));
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
		if (getConnectedEntity() != null) {
			_hashCode += getConnectedEntity().hashCode();
		}
		if (getNicKey() != null) {
			_hashCode += getNicKey().hashCode();
		}
		if (getType() != null) {
			_hashCode += getType().hashCode();
		}
		if (getAddressHint() != null) {
			_hashCode += getAddressHint().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			DistributedVirtualSwitchPortConnectee.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DistributedVirtualSwitchPortConnectee"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("connectedEntity");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"connectedEntity"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("nicKey");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"nicKey"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("type");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "type"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("addressHint");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"addressHint"));
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
