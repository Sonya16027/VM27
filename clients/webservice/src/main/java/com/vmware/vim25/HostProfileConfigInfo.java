/**
 * HostProfileConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostProfileConfigInfo extends com.vmware.vim25.ProfileConfigInfo
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.HostApplyProfile applyProfile;

	private com.vmware.vim25.ComplianceProfile defaultComplyProfile;

	private com.vmware.vim25.ComplianceLocator[] defaultComplyLocator;

	private com.vmware.vim25.ComplianceProfile customComplyProfile;

	private java.lang.String[] disabledExpressionList;

	public HostProfileConfigInfo() {
	}

	public HostProfileConfigInfo(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String name, java.lang.String annotation,
			boolean enabled, com.vmware.vim25.HostApplyProfile applyProfile,
			com.vmware.vim25.ComplianceProfile defaultComplyProfile,
			com.vmware.vim25.ComplianceLocator[] defaultComplyLocator,
			com.vmware.vim25.ComplianceProfile customComplyProfile,
			java.lang.String[] disabledExpressionList) {
		super(dynamicType, dynamicProperty, name, annotation, enabled);
		this.applyProfile = applyProfile;
		this.defaultComplyProfile = defaultComplyProfile;
		this.defaultComplyLocator = defaultComplyLocator;
		this.customComplyProfile = customComplyProfile;
		this.disabledExpressionList = disabledExpressionList;
	}

	/**
	 * Gets the applyProfile value for this HostProfileConfigInfo.
	 * 
	 * @return applyProfile
	 */
	public com.vmware.vim25.HostApplyProfile getApplyProfile() {
		return applyProfile;
	}

	/**
	 * Sets the applyProfile value for this HostProfileConfigInfo.
	 * 
	 * @param applyProfile
	 */
	public void setApplyProfile(com.vmware.vim25.HostApplyProfile applyProfile) {
		this.applyProfile = applyProfile;
	}

	/**
	 * Gets the defaultComplyProfile value for this HostProfileConfigInfo.
	 * 
	 * @return defaultComplyProfile
	 */
	public com.vmware.vim25.ComplianceProfile getDefaultComplyProfile() {
		return defaultComplyProfile;
	}

	/**
	 * Sets the defaultComplyProfile value for this HostProfileConfigInfo.
	 * 
	 * @param defaultComplyProfile
	 */
	public void setDefaultComplyProfile(
			com.vmware.vim25.ComplianceProfile defaultComplyProfile) {
		this.defaultComplyProfile = defaultComplyProfile;
	}

	/**
	 * Gets the defaultComplyLocator value for this HostProfileConfigInfo.
	 * 
	 * @return defaultComplyLocator
	 */
	public com.vmware.vim25.ComplianceLocator[] getDefaultComplyLocator() {
		return defaultComplyLocator;
	}

	/**
	 * Sets the defaultComplyLocator value for this HostProfileConfigInfo.
	 * 
	 * @param defaultComplyLocator
	 */
	public void setDefaultComplyLocator(
			com.vmware.vim25.ComplianceLocator[] defaultComplyLocator) {
		this.defaultComplyLocator = defaultComplyLocator;
	}

	public com.vmware.vim25.ComplianceLocator getDefaultComplyLocator(int i) {
		return this.defaultComplyLocator[i];
	}

	public void setDefaultComplyLocator(int i,
			com.vmware.vim25.ComplianceLocator _value) {
		this.defaultComplyLocator[i] = _value;
	}

	/**
	 * Gets the customComplyProfile value for this HostProfileConfigInfo.
	 * 
	 * @return customComplyProfile
	 */
	public com.vmware.vim25.ComplianceProfile getCustomComplyProfile() {
		return customComplyProfile;
	}

	/**
	 * Sets the customComplyProfile value for this HostProfileConfigInfo.
	 * 
	 * @param customComplyProfile
	 */
	public void setCustomComplyProfile(
			com.vmware.vim25.ComplianceProfile customComplyProfile) {
		this.customComplyProfile = customComplyProfile;
	}

	/**
	 * Gets the disabledExpressionList value for this HostProfileConfigInfo.
	 * 
	 * @return disabledExpressionList
	 */
	public java.lang.String[] getDisabledExpressionList() {
		return disabledExpressionList;
	}

	/**
	 * Sets the disabledExpressionList value for this HostProfileConfigInfo.
	 * 
	 * @param disabledExpressionList
	 */
	public void setDisabledExpressionList(
			java.lang.String[] disabledExpressionList) {
		this.disabledExpressionList = disabledExpressionList;
	}

	public java.lang.String getDisabledExpressionList(int i) {
		return this.disabledExpressionList[i];
	}

	public void setDisabledExpressionList(int i, java.lang.String _value) {
		this.disabledExpressionList[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostProfileConfigInfo)) {
			return false;
		}
		HostProfileConfigInfo other = (HostProfileConfigInfo) obj;
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
				&& ((this.applyProfile == null && other.getApplyProfile() == null) || (this.applyProfile != null && this.applyProfile
						.equals(other.getApplyProfile())))
				&& ((this.defaultComplyProfile == null && other
						.getDefaultComplyProfile() == null) || (this.defaultComplyProfile != null && this.defaultComplyProfile
						.equals(other.getDefaultComplyProfile())))
				&& ((this.defaultComplyLocator == null && other
						.getDefaultComplyLocator() == null) || (this.defaultComplyLocator != null && java.util.Arrays
						.equals(this.defaultComplyLocator, other
								.getDefaultComplyLocator())))
				&& ((this.customComplyProfile == null && other
						.getCustomComplyProfile() == null) || (this.customComplyProfile != null && this.customComplyProfile
						.equals(other.getCustomComplyProfile())))
				&& ((this.disabledExpressionList == null && other
						.getDisabledExpressionList() == null) || (this.disabledExpressionList != null && java.util.Arrays
						.equals(this.disabledExpressionList, other
								.getDisabledExpressionList())));
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
		if (getApplyProfile() != null) {
			_hashCode += getApplyProfile().hashCode();
		}
		if (getDefaultComplyProfile() != null) {
			_hashCode += getDefaultComplyProfile().hashCode();
		}
		if (getDefaultComplyLocator() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getDefaultComplyLocator()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getDefaultComplyLocator(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getCustomComplyProfile() != null) {
			_hashCode += getCustomComplyProfile().hashCode();
		}
		if (getDisabledExpressionList() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getDisabledExpressionList()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getDisabledExpressionList(), i);
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
			HostProfileConfigInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostProfileConfigInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("applyProfile");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"applyProfile"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostApplyProfile"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("defaultComplyProfile");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"defaultComplyProfile"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ComplianceProfile"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("defaultComplyLocator");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"defaultComplyLocator"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ComplianceLocator"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("customComplyProfile");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"customComplyProfile"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ComplianceProfile"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("disabledExpressionList");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"disabledExpressionList"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
