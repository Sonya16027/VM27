/**
 * ApplyProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ApplyProfile extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private boolean enabled;

	private com.vmware.vim25.ProfilePolicy[] policy;

	public ApplyProfile() {
	}

	public ApplyProfile(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			boolean enabled, com.vmware.vim25.ProfilePolicy[] policy) {
		super(dynamicType, dynamicProperty);
		this.enabled = enabled;
		this.policy = policy;
	}

	/**
	 * Gets the enabled value for this ApplyProfile.
	 * 
	 * @return enabled
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * Sets the enabled value for this ApplyProfile.
	 * 
	 * @param enabled
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * Gets the policy value for this ApplyProfile.
	 * 
	 * @return policy
	 */
	public com.vmware.vim25.ProfilePolicy[] getPolicy() {
		return policy;
	}

	/**
	 * Sets the policy value for this ApplyProfile.
	 * 
	 * @param policy
	 */
	public void setPolicy(com.vmware.vim25.ProfilePolicy[] policy) {
		this.policy = policy;
	}

	public com.vmware.vim25.ProfilePolicy getPolicy(int i) {
		return this.policy[i];
	}

	public void setPolicy(int i, com.vmware.vim25.ProfilePolicy _value) {
		this.policy[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ApplyProfile)) {
			return false;
		}
		ApplyProfile other = (ApplyProfile) obj;
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
				&& this.enabled == other.isEnabled()
				&& ((this.policy == null && other.getPolicy() == null) || (this.policy != null && java.util.Arrays
						.equals(this.policy, other.getPolicy())));
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
		_hashCode += (isEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		if (getPolicy() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getPolicy()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getPolicy(),
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
			ApplyProfile.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ApplyProfile"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("enabled");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"enabled"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("policy");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"policy"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ProfilePolicy"));
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
