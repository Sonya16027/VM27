/**
 * VmfsDatastoreExtendSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VmfsDatastoreExtendSpec extends com.vmware.vim25.VmfsDatastoreSpec
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.HostDiskPartitionSpec partition;

	private com.vmware.vim25.HostScsiDiskPartition[] extent;

	public VmfsDatastoreExtendSpec() {
	}

	public VmfsDatastoreExtendSpec(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String diskUuid,
			com.vmware.vim25.HostDiskPartitionSpec partition,
			com.vmware.vim25.HostScsiDiskPartition[] extent) {
		super(dynamicType, dynamicProperty, diskUuid);
		this.partition = partition;
		this.extent = extent;
	}

	/**
	 * Gets the partition value for this VmfsDatastoreExtendSpec.
	 * 
	 * @return partition
	 */
	public com.vmware.vim25.HostDiskPartitionSpec getPartition() {
		return partition;
	}

	/**
	 * Sets the partition value for this VmfsDatastoreExtendSpec.
	 * 
	 * @param partition
	 */
	public void setPartition(com.vmware.vim25.HostDiskPartitionSpec partition) {
		this.partition = partition;
	}

	/**
	 * Gets the extent value for this VmfsDatastoreExtendSpec.
	 * 
	 * @return extent
	 */
	public com.vmware.vim25.HostScsiDiskPartition[] getExtent() {
		return extent;
	}

	/**
	 * Sets the extent value for this VmfsDatastoreExtendSpec.
	 * 
	 * @param extent
	 */
	public void setExtent(com.vmware.vim25.HostScsiDiskPartition[] extent) {
		this.extent = extent;
	}

	public com.vmware.vim25.HostScsiDiskPartition getExtent(int i) {
		return this.extent[i];
	}

	public void setExtent(int i, com.vmware.vim25.HostScsiDiskPartition _value) {
		this.extent[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VmfsDatastoreExtendSpec)) {
			return false;
		}
		VmfsDatastoreExtendSpec other = (VmfsDatastoreExtendSpec) obj;
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
				&& ((this.extent == null && other.getExtent() == null) || (this.extent != null && java.util.Arrays
						.equals(this.extent, other.getExtent())));
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
		if (getExtent() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getExtent()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getExtent(),
						i);
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
			VmfsDatastoreExtendSpec.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VmfsDatastoreExtendSpec"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("partition");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"partition"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostDiskPartitionSpec"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("extent");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"extent"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostScsiDiskPartition"));
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
