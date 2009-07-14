/**
 * OvfCreateImportSpecResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class OvfCreateImportSpecResult extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ImportSpec importSpec;

	private com.vmware.vim25.OvfFileItem[] fileItem;

	private com.vmware.vim25.LocalizedMethodFault[] warning;

	private com.vmware.vim25.LocalizedMethodFault[] error;

	public OvfCreateImportSpecResult() {
	}

	public OvfCreateImportSpecResult(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.ImportSpec importSpec,
			com.vmware.vim25.OvfFileItem[] fileItem,
			com.vmware.vim25.LocalizedMethodFault[] warning,
			com.vmware.vim25.LocalizedMethodFault[] error) {
		super(dynamicType, dynamicProperty);
		this.importSpec = importSpec;
		this.fileItem = fileItem;
		this.warning = warning;
		this.error = error;
	}

	/**
	 * Gets the importSpec value for this OvfCreateImportSpecResult.
	 * 
	 * @return importSpec
	 */
	public com.vmware.vim25.ImportSpec getImportSpec() {
		return importSpec;
	}

	/**
	 * Sets the importSpec value for this OvfCreateImportSpecResult.
	 * 
	 * @param importSpec
	 */
	public void setImportSpec(com.vmware.vim25.ImportSpec importSpec) {
		this.importSpec = importSpec;
	}

	/**
	 * Gets the fileItem value for this OvfCreateImportSpecResult.
	 * 
	 * @return fileItem
	 */
	public com.vmware.vim25.OvfFileItem[] getFileItem() {
		return fileItem;
	}

	/**
	 * Sets the fileItem value for this OvfCreateImportSpecResult.
	 * 
	 * @param fileItem
	 */
	public void setFileItem(com.vmware.vim25.OvfFileItem[] fileItem) {
		this.fileItem = fileItem;
	}

	public com.vmware.vim25.OvfFileItem getFileItem(int i) {
		return this.fileItem[i];
	}

	public void setFileItem(int i, com.vmware.vim25.OvfFileItem _value) {
		this.fileItem[i] = _value;
	}

	/**
	 * Gets the warning value for this OvfCreateImportSpecResult.
	 * 
	 * @return warning
	 */
	public com.vmware.vim25.LocalizedMethodFault[] getWarning() {
		return warning;
	}

	/**
	 * Sets the warning value for this OvfCreateImportSpecResult.
	 * 
	 * @param warning
	 */
	public void setWarning(com.vmware.vim25.LocalizedMethodFault[] warning) {
		this.warning = warning;
	}

	public com.vmware.vim25.LocalizedMethodFault getWarning(int i) {
		return this.warning[i];
	}

	public void setWarning(int i, com.vmware.vim25.LocalizedMethodFault _value) {
		this.warning[i] = _value;
	}

	/**
	 * Gets the error value for this OvfCreateImportSpecResult.
	 * 
	 * @return error
	 */
	public com.vmware.vim25.LocalizedMethodFault[] getError() {
		return error;
	}

	/**
	 * Sets the error value for this OvfCreateImportSpecResult.
	 * 
	 * @param error
	 */
	public void setError(com.vmware.vim25.LocalizedMethodFault[] error) {
		this.error = error;
	}

	public com.vmware.vim25.LocalizedMethodFault getError(int i) {
		return this.error[i];
	}

	public void setError(int i, com.vmware.vim25.LocalizedMethodFault _value) {
		this.error[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof OvfCreateImportSpecResult)) {
			return false;
		}
		OvfCreateImportSpecResult other = (OvfCreateImportSpecResult) obj;
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
				&& ((this.importSpec == null && other.getImportSpec() == null) || (this.importSpec != null && this.importSpec
						.equals(other.getImportSpec())))
				&& ((this.fileItem == null && other.getFileItem() == null) || (this.fileItem != null && java.util.Arrays
						.equals(this.fileItem, other.getFileItem())))
				&& ((this.warning == null && other.getWarning() == null) || (this.warning != null && java.util.Arrays
						.equals(this.warning, other.getWarning())))
				&& ((this.error == null && other.getError() == null) || (this.error != null && java.util.Arrays
						.equals(this.error, other.getError())));
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
		if (getImportSpec() != null) {
			_hashCode += getImportSpec().hashCode();
		}
		if (getFileItem() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getFileItem()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getFileItem(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getWarning() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getWarning()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getWarning(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getError() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getError()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getError(),
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
			OvfCreateImportSpecResult.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"OvfCreateImportSpecResult"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("importSpec");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"importSpec"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ImportSpec"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("fileItem");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"fileItem"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"OvfFileItem"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("warning");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"warning"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"LocalizedMethodFault"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("error");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "error"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"LocalizedMethodFault"));
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
