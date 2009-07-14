/**
 * HostPortGroupSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostPortGroupSpec extends com.vmware.vim.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String name;

	private int vlanId;

	private java.lang.String vswitchName;

	private com.vmware.vim.HostNetworkPolicy policy;

	public HostPortGroupSpec() {
	}

	public HostPortGroupSpec(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			java.lang.String name, int vlanId, java.lang.String vswitchName,
			com.vmware.vim.HostNetworkPolicy policy) {
		super(dynamicType, dynamicProperty);
		this.name = name;
		this.vlanId = vlanId;
		this.vswitchName = vswitchName;
		this.policy = policy;
	}

	/**
	 * Gets the name value for this HostPortGroupSpec.
	 * 
	 * @return name
	 */
	public java.lang.String getName() {
		return name;
	}

	/**
	 * Sets the name value for this HostPortGroupSpec.
	 * 
	 * @param name
	 */
	public void setName(java.lang.String name) {
		this.name = name;
	}

	/**
	 * Gets the vlanId value for this HostPortGroupSpec.
	 * 
	 * @return vlanId
	 */
	public int getVlanId() {
		return vlanId;
	}

	/**
	 * Sets the vlanId value for this HostPortGroupSpec.
	 * 
	 * @param vlanId
	 */
	public void setVlanId(int vlanId) {
		this.vlanId = vlanId;
	}

	/**
	 * Gets the vswitchName value for this HostPortGroupSpec.
	 * 
	 * @return vswitchName
	 */
	public java.lang.String getVswitchName() {
		return vswitchName;
	}

	/**
	 * Sets the vswitchName value for this HostPortGroupSpec.
	 * 
	 * @param vswitchName
	 */
	public void setVswitchName(java.lang.String vswitchName) {
		this.vswitchName = vswitchName;
	}

	/**
	 * Gets the policy value for this HostPortGroupSpec.
	 * 
	 * @return policy
	 */
	public com.vmware.vim.HostNetworkPolicy getPolicy() {
		return policy;
	}

	/**
	 * Sets the policy value for this HostPortGroupSpec.
	 * 
	 * @param policy
	 */
	public void setPolicy(com.vmware.vim.HostNetworkPolicy policy) {
		this.policy = policy;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostPortGroupSpec)) {
			return false;
		}
		HostPortGroupSpec other = (HostPortGroupSpec) obj;
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
				&& ((this.name == null && other.getName() == null) || (this.name != null && this.name
						.equals(other.getName())))
				&& this.vlanId == other.getVlanId()
				&& ((this.vswitchName == null && other.getVswitchName() == null) || (this.vswitchName != null && this.vswitchName
						.equals(other.getVswitchName())))
				&& ((this.policy == null && other.getPolicy() == null) || (this.policy != null && this.policy
						.equals(other.getPolicy())));
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
		if (getName() != null) {
			_hashCode += getName().hashCode();
		}
		_hashCode += getVlanId();
		if (getVswitchName() != null) {
			_hashCode += getVswitchName().hashCode();
		}
		if (getPolicy() != null) {
			_hashCode += getPolicy().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostPortGroupSpec.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostPortGroupSpec"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("name");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "name"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("vlanId");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "vlanId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("vswitchName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"vswitchName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("policy");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "policy"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostNetworkPolicy"));
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
