/**
 * HttpNfcLeaseInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HttpNfcLeaseInfo extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference lease;

	private com.vmware.vim25.ManagedObjectReference entity;

	private com.vmware.vim25.HttpNfcLeaseDeviceUrl[] deviceUrl;

	private long totalDiskCapacityInKB;

	private int leaseTimeout;

	public HttpNfcLeaseInfo() {
	}

	public HttpNfcLeaseInfo(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.ManagedObjectReference lease,
			com.vmware.vim25.ManagedObjectReference entity,
			com.vmware.vim25.HttpNfcLeaseDeviceUrl[] deviceUrl,
			long totalDiskCapacityInKB, int leaseTimeout) {
		super(dynamicType, dynamicProperty);
		this.lease = lease;
		this.entity = entity;
		this.deviceUrl = deviceUrl;
		this.totalDiskCapacityInKB = totalDiskCapacityInKB;
		this.leaseTimeout = leaseTimeout;
	}

	/**
	 * Gets the lease value for this HttpNfcLeaseInfo.
	 * 
	 * @return lease
	 */
	public com.vmware.vim25.ManagedObjectReference getLease() {
		return lease;
	}

	/**
	 * Sets the lease value for this HttpNfcLeaseInfo.
	 * 
	 * @param lease
	 */
	public void setLease(com.vmware.vim25.ManagedObjectReference lease) {
		this.lease = lease;
	}

	/**
	 * Gets the entity value for this HttpNfcLeaseInfo.
	 * 
	 * @return entity
	 */
	public com.vmware.vim25.ManagedObjectReference getEntity() {
		return entity;
	}

	/**
	 * Sets the entity value for this HttpNfcLeaseInfo.
	 * 
	 * @param entity
	 */
	public void setEntity(com.vmware.vim25.ManagedObjectReference entity) {
		this.entity = entity;
	}

	/**
	 * Gets the deviceUrl value for this HttpNfcLeaseInfo.
	 * 
	 * @return deviceUrl
	 */
	public com.vmware.vim25.HttpNfcLeaseDeviceUrl[] getDeviceUrl() {
		return deviceUrl;
	}

	/**
	 * Sets the deviceUrl value for this HttpNfcLeaseInfo.
	 * 
	 * @param deviceUrl
	 */
	public void setDeviceUrl(com.vmware.vim25.HttpNfcLeaseDeviceUrl[] deviceUrl) {
		this.deviceUrl = deviceUrl;
	}

	public com.vmware.vim25.HttpNfcLeaseDeviceUrl getDeviceUrl(int i) {
		return this.deviceUrl[i];
	}

	public void setDeviceUrl(int i,
			com.vmware.vim25.HttpNfcLeaseDeviceUrl _value) {
		this.deviceUrl[i] = _value;
	}

	/**
	 * Gets the totalDiskCapacityInKB value for this HttpNfcLeaseInfo.
	 * 
	 * @return totalDiskCapacityInKB
	 */
	public long getTotalDiskCapacityInKB() {
		return totalDiskCapacityInKB;
	}

	/**
	 * Sets the totalDiskCapacityInKB value for this HttpNfcLeaseInfo.
	 * 
	 * @param totalDiskCapacityInKB
	 */
	public void setTotalDiskCapacityInKB(long totalDiskCapacityInKB) {
		this.totalDiskCapacityInKB = totalDiskCapacityInKB;
	}

	/**
	 * Gets the leaseTimeout value for this HttpNfcLeaseInfo.
	 * 
	 * @return leaseTimeout
	 */
	public int getLeaseTimeout() {
		return leaseTimeout;
	}

	/**
	 * Sets the leaseTimeout value for this HttpNfcLeaseInfo.
	 * 
	 * @param leaseTimeout
	 */
	public void setLeaseTimeout(int leaseTimeout) {
		this.leaseTimeout = leaseTimeout;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HttpNfcLeaseInfo)) {
			return false;
		}
		HttpNfcLeaseInfo other = (HttpNfcLeaseInfo) obj;
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
				&& ((this.lease == null && other.getLease() == null) || (this.lease != null && this.lease
						.equals(other.getLease())))
				&& ((this.entity == null && other.getEntity() == null) || (this.entity != null && this.entity
						.equals(other.getEntity())))
				&& ((this.deviceUrl == null && other.getDeviceUrl() == null) || (this.deviceUrl != null && java.util.Arrays
						.equals(this.deviceUrl, other.getDeviceUrl())))
				&& this.totalDiskCapacityInKB == other
						.getTotalDiskCapacityInKB()
				&& this.leaseTimeout == other.getLeaseTimeout();
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
		if (getLease() != null) {
			_hashCode += getLease().hashCode();
		}
		if (getEntity() != null) {
			_hashCode += getEntity().hashCode();
		}
		if (getDeviceUrl() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getDeviceUrl()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getDeviceUrl(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		_hashCode += new Long(getTotalDiskCapacityInKB()).hashCode();
		_hashCode += getLeaseTimeout();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HttpNfcLeaseInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HttpNfcLeaseInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("lease");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "lease"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("entity");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"entity"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("deviceUrl");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"deviceUrl"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HttpNfcLeaseDeviceUrl"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("totalDiskCapacityInKB");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"totalDiskCapacityInKB"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("leaseTimeout");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"leaseTimeout"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
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
