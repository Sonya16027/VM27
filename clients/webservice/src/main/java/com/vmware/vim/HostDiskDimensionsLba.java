/**
 * HostDiskDimensionsLba.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostDiskDimensionsLba extends com.vmware.vim.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int blockSize;

	private long block;

	public HostDiskDimensionsLba() {
	}

	public HostDiskDimensionsLba(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty, int blockSize,
			long block) {
		super(dynamicType, dynamicProperty);
		this.blockSize = blockSize;
		this.block = block;
	}

	/**
	 * Gets the blockSize value for this HostDiskDimensionsLba.
	 * 
	 * @return blockSize
	 */
	public int getBlockSize() {
		return blockSize;
	}

	/**
	 * Sets the blockSize value for this HostDiskDimensionsLba.
	 * 
	 * @param blockSize
	 */
	public void setBlockSize(int blockSize) {
		this.blockSize = blockSize;
	}

	/**
	 * Gets the block value for this HostDiskDimensionsLba.
	 * 
	 * @return block
	 */
	public long getBlock() {
		return block;
	}

	/**
	 * Sets the block value for this HostDiskDimensionsLba.
	 * 
	 * @param block
	 */
	public void setBlock(long block) {
		this.block = block;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostDiskDimensionsLba)) {
			return false;
		}
		HostDiskDimensionsLba other = (HostDiskDimensionsLba) obj;
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
		_equals = super.equals(obj) && this.blockSize == other.getBlockSize()
				&& this.block == other.getBlock();
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
		_hashCode += getBlockSize();
		_hashCode += new Long(getBlock()).hashCode();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostDiskDimensionsLba.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostDiskDimensionsLba"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("blockSize");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"blockSize"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("block");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "block"));
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
