/**
 * FaultTolerancePrimaryConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class FaultTolerancePrimaryConfigInfo extends
		com.vmware.vim25.FaultToleranceConfigInfo implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.ManagedObjectReference[] secondaries;

	public FaultTolerancePrimaryConfigInfo() {
	}

	public FaultTolerancePrimaryConfigInfo(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty, int role,
			java.lang.String[] instanceUuids, java.lang.String[] configPaths,
			com.vmware.vim25.ManagedObjectReference[] secondaries) {
		super(dynamicType, dynamicProperty, role, instanceUuids, configPaths);
		this.secondaries = secondaries;
	}

	/**
	 * Gets the secondaries value for this FaultTolerancePrimaryConfigInfo.
	 * 
	 * @return secondaries
	 */
	public com.vmware.vim25.ManagedObjectReference[] getSecondaries() {
		return secondaries;
	}

	/**
	 * Sets the secondaries value for this FaultTolerancePrimaryConfigInfo.
	 * 
	 * @param secondaries
	 */
	public void setSecondaries(
			com.vmware.vim25.ManagedObjectReference[] secondaries) {
		this.secondaries = secondaries;
	}

	public com.vmware.vim25.ManagedObjectReference getSecondaries(int i) {
		return this.secondaries[i];
	}

	public void setSecondaries(int i,
			com.vmware.vim25.ManagedObjectReference _value) {
		this.secondaries[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof FaultTolerancePrimaryConfigInfo)) {
			return false;
		}
		FaultTolerancePrimaryConfigInfo other = (FaultTolerancePrimaryConfigInfo) obj;
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
				&& ((this.secondaries == null && other.getSecondaries() == null) || (this.secondaries != null && java.util.Arrays
						.equals(this.secondaries, other.getSecondaries())));
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
		if (getSecondaries() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getSecondaries()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getSecondaries(), i);
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
			FaultTolerancePrimaryConfigInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"FaultTolerancePrimaryConfigInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("secondaries");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"secondaries"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
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
