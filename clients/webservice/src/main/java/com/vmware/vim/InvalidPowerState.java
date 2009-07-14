/**
 * InvalidPowerState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class InvalidPowerState extends com.vmware.vim.InvalidState implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.VirtualMachinePowerState requestedState;

	private com.vmware.vim.VirtualMachinePowerState existingState;

	public InvalidPowerState() {
	}

	public InvalidPowerState(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			com.vmware.vim.VirtualMachinePowerState requestedState,
			com.vmware.vim.VirtualMachinePowerState existingState) {
		super(dynamicType, dynamicProperty);
		this.requestedState = requestedState;
		this.existingState = existingState;
	}

	/**
	 * Gets the requestedState value for this InvalidPowerState.
	 * 
	 * @return requestedState
	 */
	public com.vmware.vim.VirtualMachinePowerState getRequestedState() {
		return requestedState;
	}

	/**
	 * Sets the requestedState value for this InvalidPowerState.
	 * 
	 * @param requestedState
	 */
	public void setRequestedState(
			com.vmware.vim.VirtualMachinePowerState requestedState) {
		this.requestedState = requestedState;
	}

	/**
	 * Gets the existingState value for this InvalidPowerState.
	 * 
	 * @return existingState
	 */
	public com.vmware.vim.VirtualMachinePowerState getExistingState() {
		return existingState;
	}

	/**
	 * Sets the existingState value for this InvalidPowerState.
	 * 
	 * @param existingState
	 */
	public void setExistingState(
			com.vmware.vim.VirtualMachinePowerState existingState) {
		this.existingState = existingState;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof InvalidPowerState)) {
			return false;
		}
		InvalidPowerState other = (InvalidPowerState) obj;
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
				&& ((this.requestedState == null && other.getRequestedState() == null) || (this.requestedState != null && this.requestedState
						.equals(other.getRequestedState())))
				&& ((this.existingState == null && other.getExistingState() == null) || (this.existingState != null && this.existingState
						.equals(other.getExistingState())));
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
		if (getRequestedState() != null) {
			_hashCode += getRequestedState().hashCode();
		}
		if (getExistingState() != null) {
			_hashCode += getExistingState().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			InvalidPowerState.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"InvalidPowerState"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("requestedState");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"requestedState"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualMachinePowerState"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("existingState");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"existingState"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualMachinePowerState"));
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
