/**
 * InventoryHasStandardAloneHosts.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class InventoryHasStandardAloneHosts extends
		com.vmware.vim25.NotEnoughLicenses implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private java.lang.String[] hosts;

	public InventoryHasStandardAloneHosts() {
	}

	public InventoryHasStandardAloneHosts(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.LocalizedMethodFault faultCause,
			com.vmware.vim25.LocalizableMessage[] faultMessage,
			java.lang.String[] hosts) {
		super(dynamicType, dynamicProperty, faultCause, faultMessage);
		this.hosts = hosts;
	}

	/**
	 * Gets the hosts value for this InventoryHasStandardAloneHosts.
	 * 
	 * @return hosts
	 */
	public java.lang.String[] getHosts() {
		return hosts;
	}

	/**
	 * Sets the hosts value for this InventoryHasStandardAloneHosts.
	 * 
	 * @param hosts
	 */
	public void setHosts(java.lang.String[] hosts) {
		this.hosts = hosts;
	}

	public java.lang.String getHosts(int i) {
		return this.hosts[i];
	}

	public void setHosts(int i, java.lang.String _value) {
		this.hosts[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof InventoryHasStandardAloneHosts)) {
			return false;
		}
		InventoryHasStandardAloneHosts other = (InventoryHasStandardAloneHosts) obj;
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
				&& ((this.hosts == null && other.getHosts() == null) || (this.hosts != null && java.util.Arrays
						.equals(this.hosts, other.getHosts())));
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
		if (getHosts() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getHosts()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getHosts(),
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
			InventoryHasStandardAloneHosts.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"InventoryHasStandardAloneHosts"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hosts");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hosts"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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

	/**
	 * Writes the exception data to the faultDetails
	 */
	@Override
	public void writeDetails(javax.xml.namespace.QName qname,
			org.apache.axis.encoding.SerializationContext context)
			throws java.io.IOException {
		context.serialize(qname, null, this);
	}
}
