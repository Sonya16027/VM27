/**
 * Metadata.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim.sms;

public class Metadata extends com.vmware.vim.sms.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int numRows;

	private int totalRows;

	private java.util.Calendar lastUpdateTime;

	private java.lang.String[] propertyName;

	public Metadata() {
	}

	public Metadata(java.lang.String dynamicType,
			com.vmware.vim.sms.DynamicProperty[] dynamicProperty, int numRows,
			int totalRows, java.util.Calendar lastUpdateTime,
			java.lang.String[] propertyName) {
		super(dynamicType, dynamicProperty);
		this.numRows = numRows;
		this.totalRows = totalRows;
		this.lastUpdateTime = lastUpdateTime;
		this.propertyName = propertyName;
	}

	/**
	 * Gets the numRows value for this Metadata.
	 * 
	 * @return numRows
	 */
	public int getNumRows() {
		return numRows;
	}

	/**
	 * Sets the numRows value for this Metadata.
	 * 
	 * @param numRows
	 */
	public void setNumRows(int numRows) {
		this.numRows = numRows;
	}

	/**
	 * Gets the totalRows value for this Metadata.
	 * 
	 * @return totalRows
	 */
	public int getTotalRows() {
		return totalRows;
	}

	/**
	 * Sets the totalRows value for this Metadata.
	 * 
	 * @param totalRows
	 */
	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
	}

	/**
	 * Gets the lastUpdateTime value for this Metadata.
	 * 
	 * @return lastUpdateTime
	 */
	public java.util.Calendar getLastUpdateTime() {
		return lastUpdateTime;
	}

	/**
	 * Sets the lastUpdateTime value for this Metadata.
	 * 
	 * @param lastUpdateTime
	 */
	public void setLastUpdateTime(java.util.Calendar lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	/**
	 * Gets the propertyName value for this Metadata.
	 * 
	 * @return propertyName
	 */
	public java.lang.String[] getPropertyName() {
		return propertyName;
	}

	/**
	 * Sets the propertyName value for this Metadata.
	 * 
	 * @param propertyName
	 */
	public void setPropertyName(java.lang.String[] propertyName) {
		this.propertyName = propertyName;
	}

	public java.lang.String getPropertyName(int i) {
		return this.propertyName[i];
	}

	public void setPropertyName(int i, java.lang.String _value) {
		this.propertyName[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof Metadata)) {
			return false;
		}
		Metadata other = (Metadata) obj;
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
				&& this.numRows == other.getNumRows()
				&& this.totalRows == other.getTotalRows()
				&& ((this.lastUpdateTime == null && other.getLastUpdateTime() == null) || (this.lastUpdateTime != null && this.lastUpdateTime
						.equals(other.getLastUpdateTime())))
				&& ((this.propertyName == null && other.getPropertyName() == null) || (this.propertyName != null && java.util.Arrays
						.equals(this.propertyName, other.getPropertyName())));
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
		_hashCode += getNumRows();
		_hashCode += getTotalRows();
		if (getLastUpdateTime() != null) {
			_hashCode += getLastUpdateTime().hashCode();
		}
		if (getPropertyName() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getPropertyName()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getPropertyName(), i);
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
			Metadata.class, true);

	static {
		typeDesc
				.setXmlType(new javax.xml.namespace.QName("urn:sm1", "Metadata"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numRows");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:sm1", "numRows"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("totalRows");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1",
				"totalRows"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("lastUpdateTime");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1",
				"lastUpdateTime"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("propertyName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1",
				"propertyName"));
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
