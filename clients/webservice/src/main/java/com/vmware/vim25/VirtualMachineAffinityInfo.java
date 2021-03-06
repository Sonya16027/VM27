/**
 * VirtualMachineAffinityInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualMachineAffinityInfo extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int[] affinitySet;

	public VirtualMachineAffinityInfo() {
	}

	public VirtualMachineAffinityInfo(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			int[] affinitySet) {
		super(dynamicType, dynamicProperty);
		this.affinitySet = affinitySet;
	}

	/**
	 * Gets the affinitySet value for this VirtualMachineAffinityInfo.
	 * 
	 * @return affinitySet
	 */
	public int[] getAffinitySet() {
		return affinitySet;
	}

	/**
	 * Sets the affinitySet value for this VirtualMachineAffinityInfo.
	 * 
	 * @param affinitySet
	 */
	public void setAffinitySet(int[] affinitySet) {
		this.affinitySet = affinitySet;
	}

	public int getAffinitySet(int i) {
		return this.affinitySet[i];
	}

	public void setAffinitySet(int i, int _value) {
		this.affinitySet[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualMachineAffinityInfo)) {
			return false;
		}
		VirtualMachineAffinityInfo other = (VirtualMachineAffinityInfo) obj;
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
				&& ((this.affinitySet == null && other.getAffinitySet() == null) || (this.affinitySet != null && java.util.Arrays
						.equals(this.affinitySet, other.getAffinitySet())));
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
		if (getAffinitySet() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getAffinitySet()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getAffinitySet(), i);
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
			VirtualMachineAffinityInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachineAffinityInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("affinitySet");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"affinitySet"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
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
