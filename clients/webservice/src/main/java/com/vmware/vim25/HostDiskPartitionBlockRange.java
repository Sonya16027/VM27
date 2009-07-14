/**
 * HostDiskPartitionBlockRange.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostDiskPartitionBlockRange extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.Integer partition;

	private java.lang.String type;

	private com.vmware.vim25.HostDiskDimensionsLba start;

	private com.vmware.vim25.HostDiskDimensionsLba end;

	public HostDiskPartitionBlockRange() {
	}

	public HostDiskPartitionBlockRange(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.Integer partition, java.lang.String type,
			com.vmware.vim25.HostDiskDimensionsLba start,
			com.vmware.vim25.HostDiskDimensionsLba end) {
		super(dynamicType, dynamicProperty);
		this.partition = partition;
		this.type = type;
		this.start = start;
		this.end = end;
	}

	/**
	 * Gets the partition value for this HostDiskPartitionBlockRange.
	 * 
	 * @return partition
	 */
	public java.lang.Integer getPartition() {
		return partition;
	}

	/**
	 * Sets the partition value for this HostDiskPartitionBlockRange.
	 * 
	 * @param partition
	 */
	public void setPartition(java.lang.Integer partition) {
		this.partition = partition;
	}

	/**
	 * Gets the type value for this HostDiskPartitionBlockRange.
	 * 
	 * @return type
	 */
	public java.lang.String getType() {
		return type;
	}

	/**
	 * Sets the type value for this HostDiskPartitionBlockRange.
	 * 
	 * @param type
	 */
	public void setType(java.lang.String type) {
		this.type = type;
	}

	/**
	 * Gets the start value for this HostDiskPartitionBlockRange.
	 * 
	 * @return start
	 */
	public com.vmware.vim25.HostDiskDimensionsLba getStart() {
		return start;
	}

	/**
	 * Sets the start value for this HostDiskPartitionBlockRange.
	 * 
	 * @param start
	 */
	public void setStart(com.vmware.vim25.HostDiskDimensionsLba start) {
		this.start = start;
	}

	/**
	 * Gets the end value for this HostDiskPartitionBlockRange.
	 * 
	 * @return end
	 */
	public com.vmware.vim25.HostDiskDimensionsLba getEnd() {
		return end;
	}

	/**
	 * Sets the end value for this HostDiskPartitionBlockRange.
	 * 
	 * @param end
	 */
	public void setEnd(com.vmware.vim25.HostDiskDimensionsLba end) {
		this.end = end;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostDiskPartitionBlockRange)) {
			return false;
		}
		HostDiskPartitionBlockRange other = (HostDiskPartitionBlockRange) obj;
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
				&& ((this.partition == null && other.getPartition() == null) || (this.partition != null && this.partition
						.equals(other.getPartition())))
				&& ((this.type == null && other.getType() == null) || (this.type != null && this.type
						.equals(other.getType())))
				&& ((this.start == null && other.getStart() == null) || (this.start != null && this.start
						.equals(other.getStart())))
				&& ((this.end == null && other.getEnd() == null) || (this.end != null && this.end
						.equals(other.getEnd())));
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
		if (getPartition() != null) {
			_hashCode += getPartition().hashCode();
		}
		if (getType() != null) {
			_hashCode += getType().hashCode();
		}
		if (getStart() != null) {
			_hashCode += getStart().hashCode();
		}
		if (getEnd() != null) {
			_hashCode += getEnd().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostDiskPartitionBlockRange.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostDiskPartitionBlockRange"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("partition");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"partition"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("type");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "type"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("start");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "start"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostDiskDimensionsLba"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("end");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "end"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostDiskDimensionsLba"));
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
