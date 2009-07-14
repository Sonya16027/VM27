/**
 * ProfileDeferredPolicyOptionParameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ProfileDeferredPolicyOptionParameter extends
		com.vmware.vim25.DynamicData implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ProfilePropertyPath inputPath;

	private com.vmware.vim25.KeyAnyValue[] parameter;

	public ProfileDeferredPolicyOptionParameter() {
	}

	public ProfileDeferredPolicyOptionParameter(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.ProfilePropertyPath inputPath,
			com.vmware.vim25.KeyAnyValue[] parameter) {
		super(dynamicType, dynamicProperty);
		this.inputPath = inputPath;
		this.parameter = parameter;
	}

	/**
	 * Gets the inputPath value for this ProfileDeferredPolicyOptionParameter.
	 * 
	 * @return inputPath
	 */
	public com.vmware.vim25.ProfilePropertyPath getInputPath() {
		return inputPath;
	}

	/**
	 * Sets the inputPath value for this ProfileDeferredPolicyOptionParameter.
	 * 
	 * @param inputPath
	 */
	public void setInputPath(com.vmware.vim25.ProfilePropertyPath inputPath) {
		this.inputPath = inputPath;
	}

	/**
	 * Gets the parameter value for this ProfileDeferredPolicyOptionParameter.
	 * 
	 * @return parameter
	 */
	public com.vmware.vim25.KeyAnyValue[] getParameter() {
		return parameter;
	}

	/**
	 * Sets the parameter value for this ProfileDeferredPolicyOptionParameter.
	 * 
	 * @param parameter
	 */
	public void setParameter(com.vmware.vim25.KeyAnyValue[] parameter) {
		this.parameter = parameter;
	}

	public com.vmware.vim25.KeyAnyValue getParameter(int i) {
		return this.parameter[i];
	}

	public void setParameter(int i, com.vmware.vim25.KeyAnyValue _value) {
		this.parameter[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ProfileDeferredPolicyOptionParameter)) {
			return false;
		}
		ProfileDeferredPolicyOptionParameter other = (ProfileDeferredPolicyOptionParameter) obj;
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
				&& ((this.inputPath == null && other.getInputPath() == null) || (this.inputPath != null && this.inputPath
						.equals(other.getInputPath())))
				&& ((this.parameter == null && other.getParameter() == null) || (this.parameter != null && java.util.Arrays
						.equals(this.parameter, other.getParameter())));
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
		if (getInputPath() != null) {
			_hashCode += getInputPath().hashCode();
		}
		if (getParameter() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getParameter()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getParameter(), i);
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
			ProfileDeferredPolicyOptionParameter.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ProfileDeferredPolicyOptionParameter"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("inputPath");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"inputPath"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ProfilePropertyPath"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("parameter");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"parameter"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"KeyAnyValue"));
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
