/**
 * ClusterProfileCompleteConfigSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ClusterProfileCompleteConfigSpec extends
		com.vmware.vim25.ClusterProfileConfigSpec implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.ComplianceProfile complyProfile;

	public ClusterProfileCompleteConfigSpec() {
	}

	public ClusterProfileCompleteConfigSpec(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String name, java.lang.String annotation,
			java.lang.Boolean enabled,
			com.vmware.vim25.ComplianceProfile complyProfile) {
		super(dynamicType, dynamicProperty, name, annotation, enabled);
		this.complyProfile = complyProfile;
	}

	/**
	 * Gets the complyProfile value for this ClusterProfileCompleteConfigSpec.
	 * 
	 * @return complyProfile
	 */
	public com.vmware.vim25.ComplianceProfile getComplyProfile() {
		return complyProfile;
	}

	/**
	 * Sets the complyProfile value for this ClusterProfileCompleteConfigSpec.
	 * 
	 * @param complyProfile
	 */
	public void setComplyProfile(
			com.vmware.vim25.ComplianceProfile complyProfile) {
		this.complyProfile = complyProfile;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ClusterProfileCompleteConfigSpec)) {
			return false;
		}
		ClusterProfileCompleteConfigSpec other = (ClusterProfileCompleteConfigSpec) obj;
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
				&& ((this.complyProfile == null && other.getComplyProfile() == null) || (this.complyProfile != null && this.complyProfile
						.equals(other.getComplyProfile())));
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
		if (getComplyProfile() != null) {
			_hashCode += getComplyProfile().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ClusterProfileCompleteConfigSpec.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ClusterProfileCompleteConfigSpec"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("complyProfile");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"complyProfile"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ComplianceProfile"));
		elemField.setMinOccurs(0);
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
