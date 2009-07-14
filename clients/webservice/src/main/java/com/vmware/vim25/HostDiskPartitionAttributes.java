/**
 * HostDiskPartitionAttributes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostDiskPartitionAttributes extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int partition;

	private long startSector;

	private long endSector;

	private java.lang.String type;

	private boolean logical;

	private byte attributes;

	public HostDiskPartitionAttributes() {
	}

	public HostDiskPartitionAttributes(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty, int partition,
			long startSector, long endSector, java.lang.String type,
			boolean logical, byte attributes) {
		super(dynamicType, dynamicProperty);
		this.partition = partition;
		this.startSector = startSector;
		this.endSector = endSector;
		this.type = type;
		this.logical = logical;
		this.attributes = attributes;
	}

	/**
	 * Gets the partition value for this HostDiskPartitionAttributes.
	 * 
	 * @return partition
	 */
	public int getPartition() {
		return partition;
	}

	/**
	 * Sets the partition value for this HostDiskPartitionAttributes.
	 * 
	 * @param partition
	 */
	public void setPartition(int partition) {
		this.partition = partition;
	}

	/**
	 * Gets the startSector value for this HostDiskPartitionAttributes.
	 * 
	 * @return startSector
	 */
	public long getStartSector() {
		return startSector;
	}

	/**
	 * Sets the startSector value for this HostDiskPartitionAttributes.
	 * 
	 * @param startSector
	 */
	public void setStartSector(long startSector) {
		this.startSector = startSector;
	}

	/**
	 * Gets the endSector value for this HostDiskPartitionAttributes.
	 * 
	 * @return endSector
	 */
	public long getEndSector() {
		return endSector;
	}

	/**
	 * Sets the endSector value for this HostDiskPartitionAttributes.
	 * 
	 * @param endSector
	 */
	public void setEndSector(long endSector) {
		this.endSector = endSector;
	}

	/**
	 * Gets the type value for this HostDiskPartitionAttributes.
	 * 
	 * @return type
	 */
	public java.lang.String getType() {
		return type;
	}

	/**
	 * Sets the type value for this HostDiskPartitionAttributes.
	 * 
	 * @param type
	 */
	public void setType(java.lang.String type) {
		this.type = type;
	}

	/**
	 * Gets the logical value for this HostDiskPartitionAttributes.
	 * 
	 * @return logical
	 */
	public boolean isLogical() {
		return logical;
	}

	/**
	 * Sets the logical value for this HostDiskPartitionAttributes.
	 * 
	 * @param logical
	 */
	public void setLogical(boolean logical) {
		this.logical = logical;
	}

	/**
	 * Gets the attributes value for this HostDiskPartitionAttributes.
	 * 
	 * @return attributes
	 */
	public byte getAttributes() {
		return attributes;
	}

	/**
	 * Sets the attributes value for this HostDiskPartitionAttributes.
	 * 
	 * @param attributes
	 */
	public void setAttributes(byte attributes) {
		this.attributes = attributes;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostDiskPartitionAttributes)) {
			return false;
		}
		HostDiskPartitionAttributes other = (HostDiskPartitionAttributes) obj;
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
				&& this.partition == other.getPartition()
				&& this.startSector == other.getStartSector()
				&& this.endSector == other.getEndSector()
				&& ((this.type == null && other.getType() == null) || (this.type != null && this.type
						.equals(other.getType())))
				&& this.logical == other.isLogical()
				&& this.attributes == other.getAttributes();
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
		_hashCode += getPartition();
		_hashCode += new Long(getStartSector()).hashCode();
		_hashCode += new Long(getEndSector()).hashCode();
		if (getType() != null) {
			_hashCode += getType().hashCode();
		}
		_hashCode += (isLogical() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		_hashCode += getAttributes();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostDiskPartitionAttributes.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostDiskPartitionAttributes"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("partition");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"partition"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("startSector");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"startSector"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("endSector");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"endSector"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
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
		elemField.setFieldName("logical");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"logical"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("attributes");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"attributes"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "byte"));
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
