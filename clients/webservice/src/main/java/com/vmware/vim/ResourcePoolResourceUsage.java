/**
 * ResourcePoolResourceUsage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ResourcePoolResourceUsage extends com.vmware.vim.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long reservationUsed;

	private long reservationUsedForVm;

	private long unreservedForPool;

	private long unreservedForVm;

	private long overallUsage;

	private long maxUsage;

	public ResourcePoolResourceUsage() {
	}

	public ResourcePoolResourceUsage(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			long reservationUsed, long reservationUsedForVm,
			long unreservedForPool, long unreservedForVm, long overallUsage,
			long maxUsage) {
		super(dynamicType, dynamicProperty);
		this.reservationUsed = reservationUsed;
		this.reservationUsedForVm = reservationUsedForVm;
		this.unreservedForPool = unreservedForPool;
		this.unreservedForVm = unreservedForVm;
		this.overallUsage = overallUsage;
		this.maxUsage = maxUsage;
	}

	/**
	 * Gets the reservationUsed value for this ResourcePoolResourceUsage.
	 * 
	 * @return reservationUsed
	 */
	public long getReservationUsed() {
		return reservationUsed;
	}

	/**
	 * Sets the reservationUsed value for this ResourcePoolResourceUsage.
	 * 
	 * @param reservationUsed
	 */
	public void setReservationUsed(long reservationUsed) {
		this.reservationUsed = reservationUsed;
	}

	/**
	 * Gets the reservationUsedForVm value for this ResourcePoolResourceUsage.
	 * 
	 * @return reservationUsedForVm
	 */
	public long getReservationUsedForVm() {
		return reservationUsedForVm;
	}

	/**
	 * Sets the reservationUsedForVm value for this ResourcePoolResourceUsage.
	 * 
	 * @param reservationUsedForVm
	 */
	public void setReservationUsedForVm(long reservationUsedForVm) {
		this.reservationUsedForVm = reservationUsedForVm;
	}

	/**
	 * Gets the unreservedForPool value for this ResourcePoolResourceUsage.
	 * 
	 * @return unreservedForPool
	 */
	public long getUnreservedForPool() {
		return unreservedForPool;
	}

	/**
	 * Sets the unreservedForPool value for this ResourcePoolResourceUsage.
	 * 
	 * @param unreservedForPool
	 */
	public void setUnreservedForPool(long unreservedForPool) {
		this.unreservedForPool = unreservedForPool;
	}

	/**
	 * Gets the unreservedForVm value for this ResourcePoolResourceUsage.
	 * 
	 * @return unreservedForVm
	 */
	public long getUnreservedForVm() {
		return unreservedForVm;
	}

	/**
	 * Sets the unreservedForVm value for this ResourcePoolResourceUsage.
	 * 
	 * @param unreservedForVm
	 */
	public void setUnreservedForVm(long unreservedForVm) {
		this.unreservedForVm = unreservedForVm;
	}

	/**
	 * Gets the overallUsage value for this ResourcePoolResourceUsage.
	 * 
	 * @return overallUsage
	 */
	public long getOverallUsage() {
		return overallUsage;
	}

	/**
	 * Sets the overallUsage value for this ResourcePoolResourceUsage.
	 * 
	 * @param overallUsage
	 */
	public void setOverallUsage(long overallUsage) {
		this.overallUsage = overallUsage;
	}

	/**
	 * Gets the maxUsage value for this ResourcePoolResourceUsage.
	 * 
	 * @return maxUsage
	 */
	public long getMaxUsage() {
		return maxUsage;
	}

	/**
	 * Sets the maxUsage value for this ResourcePoolResourceUsage.
	 * 
	 * @param maxUsage
	 */
	public void setMaxUsage(long maxUsage) {
		this.maxUsage = maxUsage;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ResourcePoolResourceUsage)) {
			return false;
		}
		ResourcePoolResourceUsage other = (ResourcePoolResourceUsage) obj;
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
				&& this.reservationUsed == other.getReservationUsed()
				&& this.reservationUsedForVm == other.getReservationUsedForVm()
				&& this.unreservedForPool == other.getUnreservedForPool()
				&& this.unreservedForVm == other.getUnreservedForVm()
				&& this.overallUsage == other.getOverallUsage()
				&& this.maxUsage == other.getMaxUsage();
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
		_hashCode += new Long(getReservationUsed()).hashCode();
		_hashCode += new Long(getReservationUsedForVm()).hashCode();
		_hashCode += new Long(getUnreservedForPool()).hashCode();
		_hashCode += new Long(getUnreservedForVm()).hashCode();
		_hashCode += new Long(getOverallUsage()).hashCode();
		_hashCode += new Long(getMaxUsage()).hashCode();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ResourcePoolResourceUsage.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ResourcePoolResourceUsage"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("reservationUsed");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"reservationUsed"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("reservationUsedForVm");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"reservationUsedForVm"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("unreservedForPool");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"unreservedForPool"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("unreservedForVm");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"unreservedForVm"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("overallUsage");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"overallUsage"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("maxUsage");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"maxUsage"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
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
