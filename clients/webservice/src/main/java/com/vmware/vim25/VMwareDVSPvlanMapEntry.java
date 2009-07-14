/**
 * VMwareDVSPvlanMapEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VMwareDVSPvlanMapEntry extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int primaryVlanId;

	private int secondaryVlanId;

	private java.lang.String pvlanType;

	public VMwareDVSPvlanMapEntry() {
	}

	public VMwareDVSPvlanMapEntry(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			int primaryVlanId, int secondaryVlanId, java.lang.String pvlanType) {
		super(dynamicType, dynamicProperty);
		this.primaryVlanId = primaryVlanId;
		this.secondaryVlanId = secondaryVlanId;
		this.pvlanType = pvlanType;
	}

	/**
	 * Gets the primaryVlanId value for this VMwareDVSPvlanMapEntry.
	 * 
	 * @return primaryVlanId
	 */
	public int getPrimaryVlanId() {
		return primaryVlanId;
	}

	/**
	 * Sets the primaryVlanId value for this VMwareDVSPvlanMapEntry.
	 * 
	 * @param primaryVlanId
	 */
	public void setPrimaryVlanId(int primaryVlanId) {
		this.primaryVlanId = primaryVlanId;
	}

	/**
	 * Gets the secondaryVlanId value for this VMwareDVSPvlanMapEntry.
	 * 
	 * @return secondaryVlanId
	 */
	public int getSecondaryVlanId() {
		return secondaryVlanId;
	}

	/**
	 * Sets the secondaryVlanId value for this VMwareDVSPvlanMapEntry.
	 * 
	 * @param secondaryVlanId
	 */
	public void setSecondaryVlanId(int secondaryVlanId) {
		this.secondaryVlanId = secondaryVlanId;
	}

	/**
	 * Gets the pvlanType value for this VMwareDVSPvlanMapEntry.
	 * 
	 * @return pvlanType
	 */
	public java.lang.String getPvlanType() {
		return pvlanType;
	}

	/**
	 * Sets the pvlanType value for this VMwareDVSPvlanMapEntry.
	 * 
	 * @param pvlanType
	 */
	public void setPvlanType(java.lang.String pvlanType) {
		this.pvlanType = pvlanType;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VMwareDVSPvlanMapEntry)) {
			return false;
		}
		VMwareDVSPvlanMapEntry other = (VMwareDVSPvlanMapEntry) obj;
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
				&& this.primaryVlanId == other.getPrimaryVlanId()
				&& this.secondaryVlanId == other.getSecondaryVlanId()
				&& ((this.pvlanType == null && other.getPvlanType() == null) || (this.pvlanType != null && this.pvlanType
						.equals(other.getPvlanType())));
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
		_hashCode += getPrimaryVlanId();
		_hashCode += getSecondaryVlanId();
		if (getPvlanType() != null) {
			_hashCode += getPvlanType().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VMwareDVSPvlanMapEntry.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VMwareDVSPvlanMapEntry"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("primaryVlanId");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"primaryVlanId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("secondaryVlanId");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"secondaryVlanId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("pvlanType");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"pvlanType"));
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
