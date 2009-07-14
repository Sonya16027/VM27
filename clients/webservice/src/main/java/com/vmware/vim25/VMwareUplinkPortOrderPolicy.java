/**
 * VMwareUplinkPortOrderPolicy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VMwareUplinkPortOrderPolicy extends
		com.vmware.vim25.InheritablePolicy implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String[] activeUplinkPort;

	private java.lang.String[] standbyUplinkPort;

	public VMwareUplinkPortOrderPolicy() {
	}

	public VMwareUplinkPortOrderPolicy(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			boolean inherited, java.lang.String[] activeUplinkPort,
			java.lang.String[] standbyUplinkPort) {
		super(dynamicType, dynamicProperty, inherited);
		this.activeUplinkPort = activeUplinkPort;
		this.standbyUplinkPort = standbyUplinkPort;
	}

	/**
	 * Gets the activeUplinkPort value for this VMwareUplinkPortOrderPolicy.
	 * 
	 * @return activeUplinkPort
	 */
	public java.lang.String[] getActiveUplinkPort() {
		return activeUplinkPort;
	}

	/**
	 * Sets the activeUplinkPort value for this VMwareUplinkPortOrderPolicy.
	 * 
	 * @param activeUplinkPort
	 */
	public void setActiveUplinkPort(java.lang.String[] activeUplinkPort) {
		this.activeUplinkPort = activeUplinkPort;
	}

	public java.lang.String getActiveUplinkPort(int i) {
		return this.activeUplinkPort[i];
	}

	public void setActiveUplinkPort(int i, java.lang.String _value) {
		this.activeUplinkPort[i] = _value;
	}

	/**
	 * Gets the standbyUplinkPort value for this VMwareUplinkPortOrderPolicy.
	 * 
	 * @return standbyUplinkPort
	 */
	public java.lang.String[] getStandbyUplinkPort() {
		return standbyUplinkPort;
	}

	/**
	 * Sets the standbyUplinkPort value for this VMwareUplinkPortOrderPolicy.
	 * 
	 * @param standbyUplinkPort
	 */
	public void setStandbyUplinkPort(java.lang.String[] standbyUplinkPort) {
		this.standbyUplinkPort = standbyUplinkPort;
	}

	public java.lang.String getStandbyUplinkPort(int i) {
		return this.standbyUplinkPort[i];
	}

	public void setStandbyUplinkPort(int i, java.lang.String _value) {
		this.standbyUplinkPort[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VMwareUplinkPortOrderPolicy)) {
			return false;
		}
		VMwareUplinkPortOrderPolicy other = (VMwareUplinkPortOrderPolicy) obj;
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
				&& ((this.activeUplinkPort == null && other
						.getActiveUplinkPort() == null) || (this.activeUplinkPort != null && java.util.Arrays
						.equals(this.activeUplinkPort, other
								.getActiveUplinkPort())))
				&& ((this.standbyUplinkPort == null && other
						.getStandbyUplinkPort() == null) || (this.standbyUplinkPort != null && java.util.Arrays
						.equals(this.standbyUplinkPort, other
								.getStandbyUplinkPort())));
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
		if (getActiveUplinkPort() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getActiveUplinkPort()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getActiveUplinkPort(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getStandbyUplinkPort() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getStandbyUplinkPort()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getStandbyUplinkPort(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VMwareUplinkPortOrderPolicy.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VMwareUplinkPortOrderPolicy"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("activeUplinkPort");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"activeUplinkPort"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("standbyUplinkPort");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"standbyUplinkPort"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
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
