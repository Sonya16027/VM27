/**
 * MismatchedVMotionNetworkNames.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class MismatchedVMotionNetworkNames extends
		com.vmware.vim25.MigrationFault implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String sourceNetwork;

	private java.lang.String destNetwork;

	public MismatchedVMotionNetworkNames() {
	}

	public MismatchedVMotionNetworkNames(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.LocalizedMethodFault faultCause,
			com.vmware.vim25.LocalizableMessage[] faultMessage,
			java.lang.String sourceNetwork, java.lang.String destNetwork) {
		super(dynamicType, dynamicProperty, faultCause, faultMessage);
		this.sourceNetwork = sourceNetwork;
		this.destNetwork = destNetwork;
	}

	/**
	 * Gets the sourceNetwork value for this MismatchedVMotionNetworkNames.
	 * 
	 * @return sourceNetwork
	 */
	public java.lang.String getSourceNetwork() {
		return sourceNetwork;
	}

	/**
	 * Sets the sourceNetwork value for this MismatchedVMotionNetworkNames.
	 * 
	 * @param sourceNetwork
	 */
	public void setSourceNetwork(java.lang.String sourceNetwork) {
		this.sourceNetwork = sourceNetwork;
	}

	/**
	 * Gets the destNetwork value for this MismatchedVMotionNetworkNames.
	 * 
	 * @return destNetwork
	 */
	public java.lang.String getDestNetwork() {
		return destNetwork;
	}

	/**
	 * Sets the destNetwork value for this MismatchedVMotionNetworkNames.
	 * 
	 * @param destNetwork
	 */
	public void setDestNetwork(java.lang.String destNetwork) {
		this.destNetwork = destNetwork;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof MismatchedVMotionNetworkNames)) {
			return false;
		}
		MismatchedVMotionNetworkNames other = (MismatchedVMotionNetworkNames) obj;
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
				&& ((this.sourceNetwork == null && other.getSourceNetwork() == null) || (this.sourceNetwork != null && this.sourceNetwork
						.equals(other.getSourceNetwork())))
				&& ((this.destNetwork == null && other.getDestNetwork() == null) || (this.destNetwork != null && this.destNetwork
						.equals(other.getDestNetwork())));
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
		if (getSourceNetwork() != null) {
			_hashCode += getSourceNetwork().hashCode();
		}
		if (getDestNetwork() != null) {
			_hashCode += getDestNetwork().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			MismatchedVMotionNetworkNames.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"MismatchedVMotionNetworkNames"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("sourceNetwork");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"sourceNetwork"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("destNetwork");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"destNetwork"));
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

	/**
	 * Writes the exception data to the faultDetails
	 */
	@Override
	public void writeDetails(javax.xml.namespace.QName qname,
			org.apache.axis.encoding.SerializationContext context)
			throws java.io.IOException {
		context.serialize(qname, null, this);
	}
}
