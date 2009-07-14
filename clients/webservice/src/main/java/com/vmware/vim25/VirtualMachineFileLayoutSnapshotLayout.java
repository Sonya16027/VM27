/**
 * VirtualMachineFileLayoutSnapshotLayout.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualMachineFileLayoutSnapshotLayout extends
		com.vmware.vim25.DynamicData implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference key;

	private java.lang.String[] snapshotFile;

	public VirtualMachineFileLayoutSnapshotLayout() {
	}

	public VirtualMachineFileLayoutSnapshotLayout(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.ManagedObjectReference key,
			java.lang.String[] snapshotFile) {
		super(dynamicType, dynamicProperty);
		this.key = key;
		this.snapshotFile = snapshotFile;
	}

	/**
	 * Gets the key value for this VirtualMachineFileLayoutSnapshotLayout.
	 * 
	 * @return key
	 */
	public com.vmware.vim25.ManagedObjectReference getKey() {
		return key;
	}

	/**
	 * Sets the key value for this VirtualMachineFileLayoutSnapshotLayout.
	 * 
	 * @param key
	 */
	public void setKey(com.vmware.vim25.ManagedObjectReference key) {
		this.key = key;
	}

	/**
	 * Gets the snapshotFile value for this
	 * VirtualMachineFileLayoutSnapshotLayout.
	 * 
	 * @return snapshotFile
	 */
	public java.lang.String[] getSnapshotFile() {
		return snapshotFile;
	}

	/**
	 * Sets the snapshotFile value for this
	 * VirtualMachineFileLayoutSnapshotLayout.
	 * 
	 * @param snapshotFile
	 */
	public void setSnapshotFile(java.lang.String[] snapshotFile) {
		this.snapshotFile = snapshotFile;
	}

	public java.lang.String getSnapshotFile(int i) {
		return this.snapshotFile[i];
	}

	public void setSnapshotFile(int i, java.lang.String _value) {
		this.snapshotFile[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualMachineFileLayoutSnapshotLayout)) {
			return false;
		}
		VirtualMachineFileLayoutSnapshotLayout other = (VirtualMachineFileLayoutSnapshotLayout) obj;
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
				&& ((this.key == null && other.getKey() == null) || (this.key != null && this.key
						.equals(other.getKey())))
				&& ((this.snapshotFile == null && other.getSnapshotFile() == null) || (this.snapshotFile != null && java.util.Arrays
						.equals(this.snapshotFile, other.getSnapshotFile())));
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
		if (getKey() != null) {
			_hashCode += getKey().hashCode();
		}
		if (getSnapshotFile() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getSnapshotFile()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getSnapshotFile(), i);
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
			VirtualMachineFileLayoutSnapshotLayout.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachineFileLayoutSnapshotLayout"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("key");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("snapshotFile");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"snapshotFile"));
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
