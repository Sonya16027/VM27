/**
 * VirtualMachineBootOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualMachineBootOptions extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.Long bootDelay;

	private java.lang.Boolean enterBIOSSetup;

	public VirtualMachineBootOptions() {
	}

	public VirtualMachineBootOptions(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.Long bootDelay, java.lang.Boolean enterBIOSSetup) {
		super(dynamicType, dynamicProperty);
		this.bootDelay = bootDelay;
		this.enterBIOSSetup = enterBIOSSetup;
	}

	/**
	 * Gets the bootDelay value for this VirtualMachineBootOptions.
	 * 
	 * @return bootDelay
	 */
	public java.lang.Long getBootDelay() {
		return bootDelay;
	}

	/**
	 * Sets the bootDelay value for this VirtualMachineBootOptions.
	 * 
	 * @param bootDelay
	 */
	public void setBootDelay(java.lang.Long bootDelay) {
		this.bootDelay = bootDelay;
	}

	/**
	 * Gets the enterBIOSSetup value for this VirtualMachineBootOptions.
	 * 
	 * @return enterBIOSSetup
	 */
	public java.lang.Boolean getEnterBIOSSetup() {
		return enterBIOSSetup;
	}

	/**
	 * Sets the enterBIOSSetup value for this VirtualMachineBootOptions.
	 * 
	 * @param enterBIOSSetup
	 */
	public void setEnterBIOSSetup(java.lang.Boolean enterBIOSSetup) {
		this.enterBIOSSetup = enterBIOSSetup;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualMachineBootOptions)) {
			return false;
		}
		VirtualMachineBootOptions other = (VirtualMachineBootOptions) obj;
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
				&& ((this.bootDelay == null && other.getBootDelay() == null) || (this.bootDelay != null && this.bootDelay
						.equals(other.getBootDelay())))
				&& ((this.enterBIOSSetup == null && other.getEnterBIOSSetup() == null) || (this.enterBIOSSetup != null && this.enterBIOSSetup
						.equals(other.getEnterBIOSSetup())));
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
		if (getBootDelay() != null) {
			_hashCode += getBootDelay().hashCode();
		}
		if (getEnterBIOSSetup() != null) {
			_hashCode += getEnterBIOSSetup().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VirtualMachineBootOptions.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachineBootOptions"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("bootDelay");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"bootDelay"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("enterBIOSSetup");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"enterBIOSSetup"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
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
