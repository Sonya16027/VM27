/**
 * EVCAdmissionFailedCPUFeaturesForMode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class EVCAdmissionFailedCPUFeaturesForMode extends
		com.vmware.vim25.EVCAdmissionFailed implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private java.lang.String currentEVCModeKey;

	public EVCAdmissionFailedCPUFeaturesForMode() {
	}

	public EVCAdmissionFailedCPUFeaturesForMode(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.LocalizedMethodFault faultCause,
			com.vmware.vim25.LocalizableMessage[] faultMessage,
			java.lang.String productName, java.lang.String productVersion,
			java.lang.String currentEVCModeKey) {
		super(dynamicType, dynamicProperty, faultCause, faultMessage,
				productName, productVersion);
		this.currentEVCModeKey = currentEVCModeKey;
	}

	/**
	 * Gets the currentEVCModeKey value for this
	 * EVCAdmissionFailedCPUFeaturesForMode.
	 * 
	 * @return currentEVCModeKey
	 */
	public java.lang.String getCurrentEVCModeKey() {
		return currentEVCModeKey;
	}

	/**
	 * Sets the currentEVCModeKey value for this
	 * EVCAdmissionFailedCPUFeaturesForMode.
	 * 
	 * @param currentEVCModeKey
	 */
	public void setCurrentEVCModeKey(java.lang.String currentEVCModeKey) {
		this.currentEVCModeKey = currentEVCModeKey;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof EVCAdmissionFailedCPUFeaturesForMode)) {
			return false;
		}
		EVCAdmissionFailedCPUFeaturesForMode other = (EVCAdmissionFailedCPUFeaturesForMode) obj;
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
				&& ((this.currentEVCModeKey == null && other
						.getCurrentEVCModeKey() == null) || (this.currentEVCModeKey != null && this.currentEVCModeKey
						.equals(other.getCurrentEVCModeKey())));
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
		if (getCurrentEVCModeKey() != null) {
			_hashCode += getCurrentEVCModeKey().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			EVCAdmissionFailedCPUFeaturesForMode.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"EVCAdmissionFailedCPUFeaturesForMode"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("currentEVCModeKey");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"currentEVCModeKey"));
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
