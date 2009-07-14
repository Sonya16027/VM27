/**
 * VAppCloneSpecNetworkMappingPair.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VAppCloneSpecNetworkMappingPair extends
		com.vmware.vim25.DynamicData implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference source;

	private com.vmware.vim25.ManagedObjectReference destination;

	public VAppCloneSpecNetworkMappingPair() {
	}

	public VAppCloneSpecNetworkMappingPair(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.ManagedObjectReference source,
			com.vmware.vim25.ManagedObjectReference destination) {
		super(dynamicType, dynamicProperty);
		this.source = source;
		this.destination = destination;
	}

	/**
	 * Gets the source value for this VAppCloneSpecNetworkMappingPair.
	 * 
	 * @return source
	 */
	public com.vmware.vim25.ManagedObjectReference getSource() {
		return source;
	}

	/**
	 * Sets the source value for this VAppCloneSpecNetworkMappingPair.
	 * 
	 * @param source
	 */
	public void setSource(com.vmware.vim25.ManagedObjectReference source) {
		this.source = source;
	}

	/**
	 * Gets the destination value for this VAppCloneSpecNetworkMappingPair.
	 * 
	 * @return destination
	 */
	public com.vmware.vim25.ManagedObjectReference getDestination() {
		return destination;
	}

	/**
	 * Sets the destination value for this VAppCloneSpecNetworkMappingPair.
	 * 
	 * @param destination
	 */
	public void setDestination(
			com.vmware.vim25.ManagedObjectReference destination) {
		this.destination = destination;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VAppCloneSpecNetworkMappingPair)) {
			return false;
		}
		VAppCloneSpecNetworkMappingPair other = (VAppCloneSpecNetworkMappingPair) obj;
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
				&& ((this.source == null && other.getSource() == null) || (this.source != null && this.source
						.equals(other.getSource())))
				&& ((this.destination == null && other.getDestination() == null) || (this.destination != null && this.destination
						.equals(other.getDestination())));
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
		if (getSource() != null) {
			_hashCode += getSource().hashCode();
		}
		if (getDestination() != null) {
			_hashCode += getDestination().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VAppCloneSpecNetworkMappingPair.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VAppCloneSpecNetworkMappingPair"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("source");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"source"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("destination");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"destination"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
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
