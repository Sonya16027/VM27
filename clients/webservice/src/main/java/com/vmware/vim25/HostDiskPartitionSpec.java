/**
 * HostDiskPartitionSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostDiskPartitionSpec extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.HostDiskDimensionsChs chs;

	private java.lang.Long totalSectors;

	private com.vmware.vim25.HostDiskPartitionAttributes[] partition;

	public HostDiskPartitionSpec() {
	}

	public HostDiskPartitionSpec(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.HostDiskDimensionsChs chs,
			java.lang.Long totalSectors,
			com.vmware.vim25.HostDiskPartitionAttributes[] partition) {
		super(dynamicType, dynamicProperty);
		this.chs = chs;
		this.totalSectors = totalSectors;
		this.partition = partition;
	}

	/**
	 * Gets the chs value for this HostDiskPartitionSpec.
	 * 
	 * @return chs
	 */
	public com.vmware.vim25.HostDiskDimensionsChs getChs() {
		return chs;
	}

	/**
	 * Sets the chs value for this HostDiskPartitionSpec.
	 * 
	 * @param chs
	 */
	public void setChs(com.vmware.vim25.HostDiskDimensionsChs chs) {
		this.chs = chs;
	}

	/**
	 * Gets the totalSectors value for this HostDiskPartitionSpec.
	 * 
	 * @return totalSectors
	 */
	public java.lang.Long getTotalSectors() {
		return totalSectors;
	}

	/**
	 * Sets the totalSectors value for this HostDiskPartitionSpec.
	 * 
	 * @param totalSectors
	 */
	public void setTotalSectors(java.lang.Long totalSectors) {
		this.totalSectors = totalSectors;
	}

	/**
	 * Gets the partition value for this HostDiskPartitionSpec.
	 * 
	 * @return partition
	 */
	public com.vmware.vim25.HostDiskPartitionAttributes[] getPartition() {
		return partition;
	}

	/**
	 * Sets the partition value for this HostDiskPartitionSpec.
	 * 
	 * @param partition
	 */
	public void setPartition(
			com.vmware.vim25.HostDiskPartitionAttributes[] partition) {
		this.partition = partition;
	}

	public com.vmware.vim25.HostDiskPartitionAttributes getPartition(int i) {
		return this.partition[i];
	}

	public void setPartition(int i,
			com.vmware.vim25.HostDiskPartitionAttributes _value) {
		this.partition[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostDiskPartitionSpec)) {
			return false;
		}
		HostDiskPartitionSpec other = (HostDiskPartitionSpec) obj;
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
				&& ((this.chs == null && other.getChs() == null) || (this.chs != null && this.chs
						.equals(other.getChs())))
				&& ((this.totalSectors == null && other.getTotalSectors() == null) || (this.totalSectors != null && this.totalSectors
						.equals(other.getTotalSectors())))
				&& ((this.partition == null && other.getPartition() == null) || (this.partition != null && java.util.Arrays
						.equals(this.partition, other.getPartition())));
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
		if (getChs() != null) {
			_hashCode += getChs().hashCode();
		}
		if (getTotalSectors() != null) {
			_hashCode += getTotalSectors().hashCode();
		}
		if (getPartition() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getPartition()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getPartition(), i);
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
			HostDiskPartitionSpec.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostDiskPartitionSpec"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("chs");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "chs"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostDiskDimensionsChs"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("totalSectors");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"totalSectors"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("partition");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"partition"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostDiskPartitionAttributes"));
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
