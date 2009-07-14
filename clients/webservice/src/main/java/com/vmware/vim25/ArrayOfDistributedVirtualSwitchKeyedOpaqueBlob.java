/**
 * ArrayOfDistributedVirtualSwitchKeyedOpaqueBlob.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfDistributedVirtualSwitchKeyedOpaqueBlob implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.DistributedVirtualSwitchKeyedOpaqueBlob[] distributedVirtualSwitchKeyedOpaqueBlob;

	public ArrayOfDistributedVirtualSwitchKeyedOpaqueBlob() {
	}

	public ArrayOfDistributedVirtualSwitchKeyedOpaqueBlob(
			com.vmware.vim25.DistributedVirtualSwitchKeyedOpaqueBlob[] distributedVirtualSwitchKeyedOpaqueBlob) {
		this.distributedVirtualSwitchKeyedOpaqueBlob = distributedVirtualSwitchKeyedOpaqueBlob;
	}

	/**
	 * Gets the distributedVirtualSwitchKeyedOpaqueBlob value for this
	 * ArrayOfDistributedVirtualSwitchKeyedOpaqueBlob.
	 * 
	 * @return distributedVirtualSwitchKeyedOpaqueBlob
	 */
	public com.vmware.vim25.DistributedVirtualSwitchKeyedOpaqueBlob[] getDistributedVirtualSwitchKeyedOpaqueBlob() {
		return distributedVirtualSwitchKeyedOpaqueBlob;
	}

	/**
	 * Sets the distributedVirtualSwitchKeyedOpaqueBlob value for this
	 * ArrayOfDistributedVirtualSwitchKeyedOpaqueBlob.
	 * 
	 * @param distributedVirtualSwitchKeyedOpaqueBlob
	 */
	public void setDistributedVirtualSwitchKeyedOpaqueBlob(
			com.vmware.vim25.DistributedVirtualSwitchKeyedOpaqueBlob[] distributedVirtualSwitchKeyedOpaqueBlob) {
		this.distributedVirtualSwitchKeyedOpaqueBlob = distributedVirtualSwitchKeyedOpaqueBlob;
	}

	public com.vmware.vim25.DistributedVirtualSwitchKeyedOpaqueBlob getDistributedVirtualSwitchKeyedOpaqueBlob(
			int i) {
		return this.distributedVirtualSwitchKeyedOpaqueBlob[i];
	}

	public void setDistributedVirtualSwitchKeyedOpaqueBlob(int i,
			com.vmware.vim25.DistributedVirtualSwitchKeyedOpaqueBlob _value) {
		this.distributedVirtualSwitchKeyedOpaqueBlob[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfDistributedVirtualSwitchKeyedOpaqueBlob)) {
			return false;
		}
		ArrayOfDistributedVirtualSwitchKeyedOpaqueBlob other = (ArrayOfDistributedVirtualSwitchKeyedOpaqueBlob) obj;
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
		_equals = true && ((this.distributedVirtualSwitchKeyedOpaqueBlob == null && other
				.getDistributedVirtualSwitchKeyedOpaqueBlob() == null) || (this.distributedVirtualSwitchKeyedOpaqueBlob != null && java.util.Arrays
				.equals(this.distributedVirtualSwitchKeyedOpaqueBlob, other
						.getDistributedVirtualSwitchKeyedOpaqueBlob())));
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
		if (getDistributedVirtualSwitchKeyedOpaqueBlob() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getDistributedVirtualSwitchKeyedOpaqueBlob()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getDistributedVirtualSwitchKeyedOpaqueBlob(), i);
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
			ArrayOfDistributedVirtualSwitchKeyedOpaqueBlob.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfDistributedVirtualSwitchKeyedOpaqueBlob"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("distributedVirtualSwitchKeyedOpaqueBlob");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"DistributedVirtualSwitchKeyedOpaqueBlob"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DistributedVirtualSwitchKeyedOpaqueBlob"));
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
