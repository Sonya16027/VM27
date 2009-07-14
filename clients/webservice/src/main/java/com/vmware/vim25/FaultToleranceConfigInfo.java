/**
 * FaultToleranceConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class FaultToleranceConfigInfo extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int role;

	private java.lang.String[] instanceUuids;

	private java.lang.String[] configPaths;

	public FaultToleranceConfigInfo() {
	}

	public FaultToleranceConfigInfo(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty, int role,
			java.lang.String[] instanceUuids, java.lang.String[] configPaths) {
		super(dynamicType, dynamicProperty);
		this.role = role;
		this.instanceUuids = instanceUuids;
		this.configPaths = configPaths;
	}

	/**
	 * Gets the role value for this FaultToleranceConfigInfo.
	 * 
	 * @return role
	 */
	public int getRole() {
		return role;
	}

	/**
	 * Sets the role value for this FaultToleranceConfigInfo.
	 * 
	 * @param role
	 */
	public void setRole(int role) {
		this.role = role;
	}

	/**
	 * Gets the instanceUuids value for this FaultToleranceConfigInfo.
	 * 
	 * @return instanceUuids
	 */
	public java.lang.String[] getInstanceUuids() {
		return instanceUuids;
	}

	/**
	 * Sets the instanceUuids value for this FaultToleranceConfigInfo.
	 * 
	 * @param instanceUuids
	 */
	public void setInstanceUuids(java.lang.String[] instanceUuids) {
		this.instanceUuids = instanceUuids;
	}

	public java.lang.String getInstanceUuids(int i) {
		return this.instanceUuids[i];
	}

	public void setInstanceUuids(int i, java.lang.String _value) {
		this.instanceUuids[i] = _value;
	}

	/**
	 * Gets the configPaths value for this FaultToleranceConfigInfo.
	 * 
	 * @return configPaths
	 */
	public java.lang.String[] getConfigPaths() {
		return configPaths;
	}

	/**
	 * Sets the configPaths value for this FaultToleranceConfigInfo.
	 * 
	 * @param configPaths
	 */
	public void setConfigPaths(java.lang.String[] configPaths) {
		this.configPaths = configPaths;
	}

	public java.lang.String getConfigPaths(int i) {
		return this.configPaths[i];
	}

	public void setConfigPaths(int i, java.lang.String _value) {
		this.configPaths[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof FaultToleranceConfigInfo)) {
			return false;
		}
		FaultToleranceConfigInfo other = (FaultToleranceConfigInfo) obj;
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
				&& this.role == other.getRole()
				&& ((this.instanceUuids == null && other.getInstanceUuids() == null) || (this.instanceUuids != null && java.util.Arrays
						.equals(this.instanceUuids, other.getInstanceUuids())))
				&& ((this.configPaths == null && other.getConfigPaths() == null) || (this.configPaths != null && java.util.Arrays
						.equals(this.configPaths, other.getConfigPaths())));
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
		_hashCode += getRole();
		if (getInstanceUuids() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getInstanceUuids()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getInstanceUuids(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getConfigPaths() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getConfigPaths()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getConfigPaths(), i);
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
			FaultToleranceConfigInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"FaultToleranceConfigInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("role");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "role"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("instanceUuids");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"instanceUuids"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("configPaths");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"configPaths"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
