/**
 * VMwareDVSPvlanConfigSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VMwareDVSPvlanConfigSpec extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.VMwareDVSPvlanMapEntry pvlanEntry;

	private java.lang.String operation;

	public VMwareDVSPvlanConfigSpec() {
	}

	public VMwareDVSPvlanConfigSpec(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.VMwareDVSPvlanMapEntry pvlanEntry,
			java.lang.String operation) {
		super(dynamicType, dynamicProperty);
		this.pvlanEntry = pvlanEntry;
		this.operation = operation;
	}

	/**
	 * Gets the pvlanEntry value for this VMwareDVSPvlanConfigSpec.
	 * 
	 * @return pvlanEntry
	 */
	public com.vmware.vim25.VMwareDVSPvlanMapEntry getPvlanEntry() {
		return pvlanEntry;
	}

	/**
	 * Sets the pvlanEntry value for this VMwareDVSPvlanConfigSpec.
	 * 
	 * @param pvlanEntry
	 */
	public void setPvlanEntry(com.vmware.vim25.VMwareDVSPvlanMapEntry pvlanEntry) {
		this.pvlanEntry = pvlanEntry;
	}

	/**
	 * Gets the operation value for this VMwareDVSPvlanConfigSpec.
	 * 
	 * @return operation
	 */
	public java.lang.String getOperation() {
		return operation;
	}

	/**
	 * Sets the operation value for this VMwareDVSPvlanConfigSpec.
	 * 
	 * @param operation
	 */
	public void setOperation(java.lang.String operation) {
		this.operation = operation;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VMwareDVSPvlanConfigSpec)) {
			return false;
		}
		VMwareDVSPvlanConfigSpec other = (VMwareDVSPvlanConfigSpec) obj;
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
				&& ((this.pvlanEntry == null && other.getPvlanEntry() == null) || (this.pvlanEntry != null && this.pvlanEntry
						.equals(other.getPvlanEntry())))
				&& ((this.operation == null && other.getOperation() == null) || (this.operation != null && this.operation
						.equals(other.getOperation())));
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
		if (getPvlanEntry() != null) {
			_hashCode += getPvlanEntry().hashCode();
		}
		if (getOperation() != null) {
			_hashCode += getOperation().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VMwareDVSPvlanConfigSpec.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VMwareDVSPvlanConfigSpec"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("pvlanEntry");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"pvlanEntry"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VMwareDVSPvlanMapEntry"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("operation");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"operation"));
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
