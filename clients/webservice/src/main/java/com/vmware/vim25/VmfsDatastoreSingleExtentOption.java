/**
 * VmfsDatastoreSingleExtentOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VmfsDatastoreSingleExtentOption extends
		com.vmware.vim25.VmfsDatastoreBaseOption implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.HostDiskPartitionBlockRange vmfsExtent;

	public VmfsDatastoreSingleExtentOption() {
	}

	public VmfsDatastoreSingleExtentOption(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.HostDiskPartitionLayout layout,
			com.vmware.vim25.HostDiskPartitionBlockRange vmfsExtent) {
		super(dynamicType, dynamicProperty, layout);
		this.vmfsExtent = vmfsExtent;
	}

	/**
	 * Gets the vmfsExtent value for this VmfsDatastoreSingleExtentOption.
	 * 
	 * @return vmfsExtent
	 */
	public com.vmware.vim25.HostDiskPartitionBlockRange getVmfsExtent() {
		return vmfsExtent;
	}

	/**
	 * Sets the vmfsExtent value for this VmfsDatastoreSingleExtentOption.
	 * 
	 * @param vmfsExtent
	 */
	public void setVmfsExtent(
			com.vmware.vim25.HostDiskPartitionBlockRange vmfsExtent) {
		this.vmfsExtent = vmfsExtent;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VmfsDatastoreSingleExtentOption)) {
			return false;
		}
		VmfsDatastoreSingleExtentOption other = (VmfsDatastoreSingleExtentOption) obj;
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
				&& ((this.vmfsExtent == null && other.getVmfsExtent() == null) || (this.vmfsExtent != null && this.vmfsExtent
						.equals(other.getVmfsExtent())));
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
		if (getVmfsExtent() != null) {
			_hashCode += getVmfsExtent().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VmfsDatastoreSingleExtentOption.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VmfsDatastoreSingleExtentOption"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("vmfsExtent");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"vmfsExtent"));
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
