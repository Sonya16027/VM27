/**
 * ArrayOfDvsOperationBulkFaultFaultOnHost.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfDvsOperationBulkFaultFaultOnHost implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.DvsOperationBulkFaultFaultOnHost[] dvsOperationBulkFaultFaultOnHost;

	public ArrayOfDvsOperationBulkFaultFaultOnHost() {
	}

	public ArrayOfDvsOperationBulkFaultFaultOnHost(
			com.vmware.vim25.DvsOperationBulkFaultFaultOnHost[] dvsOperationBulkFaultFaultOnHost) {
		this.dvsOperationBulkFaultFaultOnHost = dvsOperationBulkFaultFaultOnHost;
	}

	/**
	 * Gets the dvsOperationBulkFaultFaultOnHost value for this
	 * ArrayOfDvsOperationBulkFaultFaultOnHost.
	 * 
	 * @return dvsOperationBulkFaultFaultOnHost
	 */
	public com.vmware.vim25.DvsOperationBulkFaultFaultOnHost[] getDvsOperationBulkFaultFaultOnHost() {
		return dvsOperationBulkFaultFaultOnHost;
	}

	/**
	 * Sets the dvsOperationBulkFaultFaultOnHost value for this
	 * ArrayOfDvsOperationBulkFaultFaultOnHost.
	 * 
	 * @param dvsOperationBulkFaultFaultOnHost
	 */
	public void setDvsOperationBulkFaultFaultOnHost(
			com.vmware.vim25.DvsOperationBulkFaultFaultOnHost[] dvsOperationBulkFaultFaultOnHost) {
		this.dvsOperationBulkFaultFaultOnHost = dvsOperationBulkFaultFaultOnHost;
	}

	public com.vmware.vim25.DvsOperationBulkFaultFaultOnHost getDvsOperationBulkFaultFaultOnHost(
			int i) {
		return this.dvsOperationBulkFaultFaultOnHost[i];
	}

	public void setDvsOperationBulkFaultFaultOnHost(int i,
			com.vmware.vim25.DvsOperationBulkFaultFaultOnHost _value) {
		this.dvsOperationBulkFaultFaultOnHost[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfDvsOperationBulkFaultFaultOnHost)) {
			return false;
		}
		ArrayOfDvsOperationBulkFaultFaultOnHost other = (ArrayOfDvsOperationBulkFaultFaultOnHost) obj;
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
		_equals = true && ((this.dvsOperationBulkFaultFaultOnHost == null && other
				.getDvsOperationBulkFaultFaultOnHost() == null) || (this.dvsOperationBulkFaultFaultOnHost != null && java.util.Arrays
				.equals(this.dvsOperationBulkFaultFaultOnHost, other
						.getDvsOperationBulkFaultFaultOnHost())));
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
		if (getDvsOperationBulkFaultFaultOnHost() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getDvsOperationBulkFaultFaultOnHost()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getDvsOperationBulkFaultFaultOnHost(), i);
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
			ArrayOfDvsOperationBulkFaultFaultOnHost.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfDvsOperationBulkFaultFaultOnHost"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dvsOperationBulkFaultFaultOnHost");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"DvsOperationBulkFaultFaultOnHost"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DvsOperationBulkFaultFaultOnHost"));
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
