/**
 * HostScsiTopology.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostScsiTopology extends com.vmware.vim.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim.HostScsiTopologyInterface[] adapter;

	public HostScsiTopology() {
	}

	public HostScsiTopology(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			com.vmware.vim.HostScsiTopologyInterface[] adapter) {
		super(dynamicType, dynamicProperty);
		this.adapter = adapter;
	}

	/**
	 * Gets the adapter value for this HostScsiTopology.
	 * 
	 * @return adapter
	 */
	public com.vmware.vim.HostScsiTopologyInterface[] getAdapter() {
		return adapter;
	}

	/**
	 * Sets the adapter value for this HostScsiTopology.
	 * 
	 * @param adapter
	 */
	public void setAdapter(com.vmware.vim.HostScsiTopologyInterface[] adapter) {
		this.adapter = adapter;
	}

	public com.vmware.vim.HostScsiTopologyInterface getAdapter(int i) {
		return this.adapter[i];
	}

	public void setAdapter(int i,
			com.vmware.vim.HostScsiTopologyInterface _value) {
		this.adapter[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostScsiTopology)) {
			return false;
		}
		HostScsiTopology other = (HostScsiTopology) obj;
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
				&& ((this.adapter == null && other.getAdapter() == null) || (this.adapter != null && java.util.Arrays
						.equals(this.adapter, other.getAdapter())));
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
		if (getAdapter() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getAdapter()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getAdapter(), i);
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
			HostScsiTopology.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostScsiTopology"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("adapter");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"adapter"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostScsiTopologyInterface"));
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
