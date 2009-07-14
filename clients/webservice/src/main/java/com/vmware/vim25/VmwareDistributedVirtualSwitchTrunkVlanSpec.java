/**
 * VmwareDistributedVirtualSwitchTrunkVlanSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VmwareDistributedVirtualSwitchTrunkVlanSpec extends
		com.vmware.vim25.VmwareDistributedVirtualSwitchVlanSpec implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.NumericRange[] vlanId;

	public VmwareDistributedVirtualSwitchTrunkVlanSpec() {
	}

	public VmwareDistributedVirtualSwitchTrunkVlanSpec(
			java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			boolean inherited, com.vmware.vim25.NumericRange[] vlanId) {
		super(dynamicType, dynamicProperty, inherited);
		this.vlanId = vlanId;
	}

	/**
	 * Gets the vlanId value for this
	 * VmwareDistributedVirtualSwitchTrunkVlanSpec.
	 * 
	 * @return vlanId
	 */
	public com.vmware.vim25.NumericRange[] getVlanId() {
		return vlanId;
	}

	/**
	 * Sets the vlanId value for this
	 * VmwareDistributedVirtualSwitchTrunkVlanSpec.
	 * 
	 * @param vlanId
	 */
	public void setVlanId(com.vmware.vim25.NumericRange[] vlanId) {
		this.vlanId = vlanId;
	}

	public com.vmware.vim25.NumericRange getVlanId(int i) {
		return this.vlanId[i];
	}

	public void setVlanId(int i, com.vmware.vim25.NumericRange _value) {
		this.vlanId[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VmwareDistributedVirtualSwitchTrunkVlanSpec)) {
			return false;
		}
		VmwareDistributedVirtualSwitchTrunkVlanSpec other = (VmwareDistributedVirtualSwitchTrunkVlanSpec) obj;
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
				&& ((this.vlanId == null && other.getVlanId() == null) || (this.vlanId != null && java.util.Arrays
						.equals(this.vlanId, other.getVlanId())));
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
		if (getVlanId() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getVlanId()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getVlanId(),
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
			VmwareDistributedVirtualSwitchTrunkVlanSpec.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VmwareDistributedVirtualSwitchTrunkVlanSpec"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("vlanId");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"vlanId"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"NumericRange"));
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
