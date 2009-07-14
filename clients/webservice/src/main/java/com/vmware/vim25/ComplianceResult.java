/**
 * ComplianceResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ComplianceResult extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference profile;

	private java.lang.String complianceStatus;

	private com.vmware.vim25.ManagedObjectReference entity;

	private java.util.Calendar checkTime;

	private com.vmware.vim25.ComplianceFailure[] failure;

	public ComplianceResult() {
	}

	public ComplianceResult(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.ManagedObjectReference profile,
			java.lang.String complianceStatus,
			com.vmware.vim25.ManagedObjectReference entity,
			java.util.Calendar checkTime,
			com.vmware.vim25.ComplianceFailure[] failure) {
		super(dynamicType, dynamicProperty);
		this.profile = profile;
		this.complianceStatus = complianceStatus;
		this.entity = entity;
		this.checkTime = checkTime;
		this.failure = failure;
	}

	/**
	 * Gets the profile value for this ComplianceResult.
	 * 
	 * @return profile
	 */
	public com.vmware.vim25.ManagedObjectReference getProfile() {
		return profile;
	}

	/**
	 * Sets the profile value for this ComplianceResult.
	 * 
	 * @param profile
	 */
	public void setProfile(com.vmware.vim25.ManagedObjectReference profile) {
		this.profile = profile;
	}

	/**
	 * Gets the complianceStatus value for this ComplianceResult.
	 * 
	 * @return complianceStatus
	 */
	public java.lang.String getComplianceStatus() {
		return complianceStatus;
	}

	/**
	 * Sets the complianceStatus value for this ComplianceResult.
	 * 
	 * @param complianceStatus
	 */
	public void setComplianceStatus(java.lang.String complianceStatus) {
		this.complianceStatus = complianceStatus;
	}

	/**
	 * Gets the entity value for this ComplianceResult.
	 * 
	 * @return entity
	 */
	public com.vmware.vim25.ManagedObjectReference getEntity() {
		return entity;
	}

	/**
	 * Sets the entity value for this ComplianceResult.
	 * 
	 * @param entity
	 */
	public void setEntity(com.vmware.vim25.ManagedObjectReference entity) {
		this.entity = entity;
	}

	/**
	 * Gets the checkTime value for this ComplianceResult.
	 * 
	 * @return checkTime
	 */
	public java.util.Calendar getCheckTime() {
		return checkTime;
	}

	/**
	 * Sets the checkTime value for this ComplianceResult.
	 * 
	 * @param checkTime
	 */
	public void setCheckTime(java.util.Calendar checkTime) {
		this.checkTime = checkTime;
	}

	/**
	 * Gets the failure value for this ComplianceResult.
	 * 
	 * @return failure
	 */
	public com.vmware.vim25.ComplianceFailure[] getFailure() {
		return failure;
	}

	/**
	 * Sets the failure value for this ComplianceResult.
	 * 
	 * @param failure
	 */
	public void setFailure(com.vmware.vim25.ComplianceFailure[] failure) {
		this.failure = failure;
	}

	public com.vmware.vim25.ComplianceFailure getFailure(int i) {
		return this.failure[i];
	}

	public void setFailure(int i, com.vmware.vim25.ComplianceFailure _value) {
		this.failure[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ComplianceResult)) {
			return false;
		}
		ComplianceResult other = (ComplianceResult) obj;
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
				&& ((this.profile == null && other.getProfile() == null) || (this.profile != null && this.profile
						.equals(other.getProfile())))
				&& ((this.complianceStatus == null && other
						.getComplianceStatus() == null) || (this.complianceStatus != null && this.complianceStatus
						.equals(other.getComplianceStatus())))
				&& ((this.entity == null && other.getEntity() == null) || (this.entity != null && this.entity
						.equals(other.getEntity())))
				&& ((this.checkTime == null && other.getCheckTime() == null) || (this.checkTime != null && this.checkTime
						.equals(other.getCheckTime())))
				&& ((this.failure == null && other.getFailure() == null) || (this.failure != null && java.util.Arrays
						.equals(this.failure, other.getFailure())));
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
		if (getProfile() != null) {
			_hashCode += getProfile().hashCode();
		}
		if (getComplianceStatus() != null) {
			_hashCode += getComplianceStatus().hashCode();
		}
		if (getEntity() != null) {
			_hashCode += getEntity().hashCode();
		}
		if (getCheckTime() != null) {
			_hashCode += getCheckTime().hashCode();
		}
		if (getFailure() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getFailure()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getFailure(), i);
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
			ComplianceResult.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ComplianceResult"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("profile");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"profile"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("complianceStatus");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"complianceStatus"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("entity");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"entity"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("checkTime");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"checkTime"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("failure");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"failure"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ComplianceFailure"));
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
