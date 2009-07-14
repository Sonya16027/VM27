/**
 * DatabaseSizeParam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class DatabaseSizeParam extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.InventoryDescription inventoryDesc;

	private com.vmware.vim25.PerformanceStatisticsDescription perfStatsDesc;

	public DatabaseSizeParam() {
	}

	public DatabaseSizeParam(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.InventoryDescription inventoryDesc,
			com.vmware.vim25.PerformanceStatisticsDescription perfStatsDesc) {
		super(dynamicType, dynamicProperty);
		this.inventoryDesc = inventoryDesc;
		this.perfStatsDesc = perfStatsDesc;
	}

	/**
	 * Gets the inventoryDesc value for this DatabaseSizeParam.
	 * 
	 * @return inventoryDesc
	 */
	public com.vmware.vim25.InventoryDescription getInventoryDesc() {
		return inventoryDesc;
	}

	/**
	 * Sets the inventoryDesc value for this DatabaseSizeParam.
	 * 
	 * @param inventoryDesc
	 */
	public void setInventoryDesc(
			com.vmware.vim25.InventoryDescription inventoryDesc) {
		this.inventoryDesc = inventoryDesc;
	}

	/**
	 * Gets the perfStatsDesc value for this DatabaseSizeParam.
	 * 
	 * @return perfStatsDesc
	 */
	public com.vmware.vim25.PerformanceStatisticsDescription getPerfStatsDesc() {
		return perfStatsDesc;
	}

	/**
	 * Sets the perfStatsDesc value for this DatabaseSizeParam.
	 * 
	 * @param perfStatsDesc
	 */
	public void setPerfStatsDesc(
			com.vmware.vim25.PerformanceStatisticsDescription perfStatsDesc) {
		this.perfStatsDesc = perfStatsDesc;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof DatabaseSizeParam)) {
			return false;
		}
		DatabaseSizeParam other = (DatabaseSizeParam) obj;
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
				&& ((this.inventoryDesc == null && other.getInventoryDesc() == null) || (this.inventoryDesc != null && this.inventoryDesc
						.equals(other.getInventoryDesc())))
				&& ((this.perfStatsDesc == null && other.getPerfStatsDesc() == null) || (this.perfStatsDesc != null && this.perfStatsDesc
						.equals(other.getPerfStatsDesc())));
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
		if (getInventoryDesc() != null) {
			_hashCode += getInventoryDesc().hashCode();
		}
		if (getPerfStatsDesc() != null) {
			_hashCode += getPerfStatsDesc().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			DatabaseSizeParam.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DatabaseSizeParam"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("inventoryDesc");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"inventoryDesc"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"InventoryDescription"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("perfStatsDesc");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"perfStatsDesc"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"PerformanceStatisticsDescription"));
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
