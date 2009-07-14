/**
 * HostScsiDiskPartition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostScsiDiskPartition extends com.vmware.vim.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String diskName;

	private int partition;

	public HostScsiDiskPartition() {
	}

	public HostScsiDiskPartition(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			java.lang.String diskName, int partition) {
		super(dynamicType, dynamicProperty);
		this.diskName = diskName;
		this.partition = partition;
	}

	/**
	 * Gets the diskName value for this HostScsiDiskPartition.
	 * 
	 * @return diskName
	 */
	public java.lang.String getDiskName() {
		return diskName;
	}

	/**
	 * Sets the diskName value for this HostScsiDiskPartition.
	 * 
	 * @param diskName
	 */
	public void setDiskName(java.lang.String diskName) {
		this.diskName = diskName;
	}

	/**
	 * Gets the partition value for this HostScsiDiskPartition.
	 * 
	 * @return partition
	 */
	public int getPartition() {
		return partition;
	}

	/**
	 * Sets the partition value for this HostScsiDiskPartition.
	 * 
	 * @param partition
	 */
	public void setPartition(int partition) {
		this.partition = partition;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostScsiDiskPartition)) {
			return false;
		}
		HostScsiDiskPartition other = (HostScsiDiskPartition) obj;
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
				&& ((this.diskName == null && other.getDiskName() == null) || (this.diskName != null && this.diskName
						.equals(other.getDiskName())))
				&& this.partition == other.getPartition();
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
		if (getDiskName() != null) {
			_hashCode += getDiskName().hashCode();
		}
		_hashCode += getPartition();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostScsiDiskPartition.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostScsiDiskPartition"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("diskName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"diskName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("partition");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"partition"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
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
