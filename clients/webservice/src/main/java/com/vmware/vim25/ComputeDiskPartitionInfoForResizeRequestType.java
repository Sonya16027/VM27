/**
 * ComputeDiskPartitionInfoForResizeRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ComputeDiskPartitionInfoForResizeRequestType implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference _this;

	private com.vmware.vim25.HostScsiDiskPartition partition;

	private com.vmware.vim25.HostDiskPartitionBlockRange blockRange;

	public ComputeDiskPartitionInfoForResizeRequestType() {
	}

	public ComputeDiskPartitionInfoForResizeRequestType(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.HostScsiDiskPartition partition,
			com.vmware.vim25.HostDiskPartitionBlockRange blockRange) {
		this._this = _this;
		this.partition = partition;
		this.blockRange = blockRange;
	}

	/**
	 * Gets the _this value for this
	 * ComputeDiskPartitionInfoForResizeRequestType.
	 * 
	 * @return _this
	 */
	public com.vmware.vim25.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this
	 * ComputeDiskPartitionInfoForResizeRequestType.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim25.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the partition value for this
	 * ComputeDiskPartitionInfoForResizeRequestType.
	 * 
	 * @return partition
	 */
	public com.vmware.vim25.HostScsiDiskPartition getPartition() {
		return partition;
	}

	/**
	 * Sets the partition value for this
	 * ComputeDiskPartitionInfoForResizeRequestType.
	 * 
	 * @param partition
	 */
	public void setPartition(com.vmware.vim25.HostScsiDiskPartition partition) {
		this.partition = partition;
	}

	/**
	 * Gets the blockRange value for this
	 * ComputeDiskPartitionInfoForResizeRequestType.
	 * 
	 * @return blockRange
	 */
	public com.vmware.vim25.HostDiskPartitionBlockRange getBlockRange() {
		return blockRange;
	}

	/**
	 * Sets the blockRange value for this
	 * ComputeDiskPartitionInfoForResizeRequestType.
	 * 
	 * @param blockRange
	 */
	public void setBlockRange(
			com.vmware.vim25.HostDiskPartitionBlockRange blockRange) {
		this.blockRange = blockRange;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ComputeDiskPartitionInfoForResizeRequestType)) {
			return false;
		}
		ComputeDiskPartitionInfoForResizeRequestType other = (ComputeDiskPartitionInfoForResizeRequestType) obj;
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
		_equals = true
				&& ((this._this == null && other.get_this() == null) || (this._this != null && this._this
						.equals(other.get_this())))
				&& ((this.partition == null && other.getPartition() == null) || (this.partition != null && this.partition
						.equals(other.getPartition())))
				&& ((this.blockRange == null && other.getBlockRange() == null) || (this.blockRange != null && this.blockRange
						.equals(other.getBlockRange())));
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
		int _hashCode = 1;
		if (get_this() != null) {
			_hashCode += get_this().hashCode();
		}
		if (getPartition() != null) {
			_hashCode += getPartition().hashCode();
		}
		if (getBlockRange() != null) {
			_hashCode += getBlockRange().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ComputeDiskPartitionInfoForResizeRequestType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ComputeDiskPartitionInfoForResizeRequestType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("partition");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"partition"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostScsiDiskPartition"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("blockRange");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"blockRange"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostDiskPartitionBlockRange"));
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
