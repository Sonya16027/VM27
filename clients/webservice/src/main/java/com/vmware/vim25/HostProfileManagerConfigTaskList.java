/**
 * HostProfileManagerConfigTaskList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostProfileManagerConfigTaskList extends
		com.vmware.vim25.DynamicData implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.HostConfigSpec configSpec;

	private com.vmware.vim25.LocalizableMessage[] taskDescription;

	public HostProfileManagerConfigTaskList() {
	}

	public HostProfileManagerConfigTaskList(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.HostConfigSpec configSpec,
			com.vmware.vim25.LocalizableMessage[] taskDescription) {
		super(dynamicType, dynamicProperty);
		this.configSpec = configSpec;
		this.taskDescription = taskDescription;
	}

	/**
	 * Gets the configSpec value for this HostProfileManagerConfigTaskList.
	 * 
	 * @return configSpec
	 */
	public com.vmware.vim25.HostConfigSpec getConfigSpec() {
		return configSpec;
	}

	/**
	 * Sets the configSpec value for this HostProfileManagerConfigTaskList.
	 * 
	 * @param configSpec
	 */
	public void setConfigSpec(com.vmware.vim25.HostConfigSpec configSpec) {
		this.configSpec = configSpec;
	}

	/**
	 * Gets the taskDescription value for this HostProfileManagerConfigTaskList.
	 * 
	 * @return taskDescription
	 */
	public com.vmware.vim25.LocalizableMessage[] getTaskDescription() {
		return taskDescription;
	}

	/**
	 * Sets the taskDescription value for this HostProfileManagerConfigTaskList.
	 * 
	 * @param taskDescription
	 */
	public void setTaskDescription(
			com.vmware.vim25.LocalizableMessage[] taskDescription) {
		this.taskDescription = taskDescription;
	}

	public com.vmware.vim25.LocalizableMessage getTaskDescription(int i) {
		return this.taskDescription[i];
	}

	public void setTaskDescription(int i,
			com.vmware.vim25.LocalizableMessage _value) {
		this.taskDescription[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostProfileManagerConfigTaskList)) {
			return false;
		}
		HostProfileManagerConfigTaskList other = (HostProfileManagerConfigTaskList) obj;
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
				&& ((this.configSpec == null && other.getConfigSpec() == null) || (this.configSpec != null && this.configSpec
						.equals(other.getConfigSpec())))
				&& ((this.taskDescription == null && other.getTaskDescription() == null) || (this.taskDescription != null && java.util.Arrays
						.equals(this.taskDescription, other
								.getTaskDescription())));
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
		if (getConfigSpec() != null) {
			_hashCode += getConfigSpec().hashCode();
		}
		if (getTaskDescription() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getTaskDescription()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getTaskDescription(), i);
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
			HostProfileManagerConfigTaskList.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostProfileManagerConfigTaskList"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("configSpec");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"configSpec"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostConfigSpec"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("taskDescription");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"taskDescription"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"LocalizableMessage"));
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
