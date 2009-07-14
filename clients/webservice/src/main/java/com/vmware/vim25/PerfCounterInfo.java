/**
 * PerfCounterInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class PerfCounterInfo extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int key;

	private com.vmware.vim25.ElementDescription nameInfo;

	private com.vmware.vim25.ElementDescription groupInfo;

	private com.vmware.vim25.ElementDescription unitInfo;

	private com.vmware.vim25.PerfSummaryType rollupType;

	private com.vmware.vim25.PerfStatsType statsType;

	private java.lang.Integer level;

	private int[] associatedCounterId;

	public PerfCounterInfo() {
	}

	public PerfCounterInfo(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty, int key,
			com.vmware.vim25.ElementDescription nameInfo,
			com.vmware.vim25.ElementDescription groupInfo,
			com.vmware.vim25.ElementDescription unitInfo,
			com.vmware.vim25.PerfSummaryType rollupType,
			com.vmware.vim25.PerfStatsType statsType, java.lang.Integer level,
			int[] associatedCounterId) {
		super(dynamicType, dynamicProperty);
		this.key = key;
		this.nameInfo = nameInfo;
		this.groupInfo = groupInfo;
		this.unitInfo = unitInfo;
		this.rollupType = rollupType;
		this.statsType = statsType;
		this.level = level;
		this.associatedCounterId = associatedCounterId;
	}

	/**
	 * Gets the key value for this PerfCounterInfo.
	 * 
	 * @return key
	 */
	public int getKey() {
		return key;
	}

	/**
	 * Sets the key value for this PerfCounterInfo.
	 * 
	 * @param key
	 */
	public void setKey(int key) {
		this.key = key;
	}

	/**
	 * Gets the nameInfo value for this PerfCounterInfo.
	 * 
	 * @return nameInfo
	 */
	public com.vmware.vim25.ElementDescription getNameInfo() {
		return nameInfo;
	}

	/**
	 * Sets the nameInfo value for this PerfCounterInfo.
	 * 
	 * @param nameInfo
	 */
	public void setNameInfo(com.vmware.vim25.ElementDescription nameInfo) {
		this.nameInfo = nameInfo;
	}

	/**
	 * Gets the groupInfo value for this PerfCounterInfo.
	 * 
	 * @return groupInfo
	 */
	public com.vmware.vim25.ElementDescription getGroupInfo() {
		return groupInfo;
	}

	/**
	 * Sets the groupInfo value for this PerfCounterInfo.
	 * 
	 * @param groupInfo
	 */
	public void setGroupInfo(com.vmware.vim25.ElementDescription groupInfo) {
		this.groupInfo = groupInfo;
	}

	/**
	 * Gets the unitInfo value for this PerfCounterInfo.
	 * 
	 * @return unitInfo
	 */
	public com.vmware.vim25.ElementDescription getUnitInfo() {
		return unitInfo;
	}

	/**
	 * Sets the unitInfo value for this PerfCounterInfo.
	 * 
	 * @param unitInfo
	 */
	public void setUnitInfo(com.vmware.vim25.ElementDescription unitInfo) {
		this.unitInfo = unitInfo;
	}

	/**
	 * Gets the rollupType value for this PerfCounterInfo.
	 * 
	 * @return rollupType
	 */
	public com.vmware.vim25.PerfSummaryType getRollupType() {
		return rollupType;
	}

	/**
	 * Sets the rollupType value for this PerfCounterInfo.
	 * 
	 * @param rollupType
	 */
	public void setRollupType(com.vmware.vim25.PerfSummaryType rollupType) {
		this.rollupType = rollupType;
	}

	/**
	 * Gets the statsType value for this PerfCounterInfo.
	 * 
	 * @return statsType
	 */
	public com.vmware.vim25.PerfStatsType getStatsType() {
		return statsType;
	}

	/**
	 * Sets the statsType value for this PerfCounterInfo.
	 * 
	 * @param statsType
	 */
	public void setStatsType(com.vmware.vim25.PerfStatsType statsType) {
		this.statsType = statsType;
	}

	/**
	 * Gets the level value for this PerfCounterInfo.
	 * 
	 * @return level
	 */
	public java.lang.Integer getLevel() {
		return level;
	}

	/**
	 * Sets the level value for this PerfCounterInfo.
	 * 
	 * @param level
	 */
	public void setLevel(java.lang.Integer level) {
		this.level = level;
	}

	/**
	 * Gets the associatedCounterId value for this PerfCounterInfo.
	 * 
	 * @return associatedCounterId
	 */
	public int[] getAssociatedCounterId() {
		return associatedCounterId;
	}

	/**
	 * Sets the associatedCounterId value for this PerfCounterInfo.
	 * 
	 * @param associatedCounterId
	 */
	public void setAssociatedCounterId(int[] associatedCounterId) {
		this.associatedCounterId = associatedCounterId;
	}

	public int getAssociatedCounterId(int i) {
		return this.associatedCounterId[i];
	}

	public void setAssociatedCounterId(int i, int _value) {
		this.associatedCounterId[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof PerfCounterInfo)) {
			return false;
		}
		PerfCounterInfo other = (PerfCounterInfo) obj;
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
				&& this.key == other.getKey()
				&& ((this.nameInfo == null && other.getNameInfo() == null) || (this.nameInfo != null && this.nameInfo
						.equals(other.getNameInfo())))
				&& ((this.groupInfo == null && other.getGroupInfo() == null) || (this.groupInfo != null && this.groupInfo
						.equals(other.getGroupInfo())))
				&& ((this.unitInfo == null && other.getUnitInfo() == null) || (this.unitInfo != null && this.unitInfo
						.equals(other.getUnitInfo())))
				&& ((this.rollupType == null && other.getRollupType() == null) || (this.rollupType != null && this.rollupType
						.equals(other.getRollupType())))
				&& ((this.statsType == null && other.getStatsType() == null) || (this.statsType != null && this.statsType
						.equals(other.getStatsType())))
				&& ((this.level == null && other.getLevel() == null) || (this.level != null && this.level
						.equals(other.getLevel())))
				&& ((this.associatedCounterId == null && other
						.getAssociatedCounterId() == null) || (this.associatedCounterId != null && java.util.Arrays
						.equals(this.associatedCounterId, other
								.getAssociatedCounterId())));
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
		_hashCode += getKey();
		if (getNameInfo() != null) {
			_hashCode += getNameInfo().hashCode();
		}
		if (getGroupInfo() != null) {
			_hashCode += getGroupInfo().hashCode();
		}
		if (getUnitInfo() != null) {
			_hashCode += getUnitInfo().hashCode();
		}
		if (getRollupType() != null) {
			_hashCode += getRollupType().hashCode();
		}
		if (getStatsType() != null) {
			_hashCode += getStatsType().hashCode();
		}
		if (getLevel() != null) {
			_hashCode += getLevel().hashCode();
		}
		if (getAssociatedCounterId() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getAssociatedCounterId()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getAssociatedCounterId(), i);
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
			PerfCounterInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"PerfCounterInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("key");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("nameInfo");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"nameInfo"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ElementDescription"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("groupInfo");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"groupInfo"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ElementDescription"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("unitInfo");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"unitInfo"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ElementDescription"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("rollupType");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"rollupType"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"PerfSummaryType"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("statsType");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"statsType"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"PerfStatsType"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("level");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "level"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("associatedCounterId");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"associatedCounterId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
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
