/**
 * VirtualHardwareOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualHardwareOption extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int hwVersion;

	private com.vmware.vim25.VirtualDeviceOption[] virtualDeviceOption;

	private boolean deviceListReadonly;

	private int[] numCPU;

	private boolean numCpuReadonly;

	private com.vmware.vim25.LongOption memoryMB;

	private com.vmware.vim25.IntOption numPCIControllers;

	private com.vmware.vim25.IntOption numIDEControllers;

	private com.vmware.vim25.IntOption numUSBControllers;

	private com.vmware.vim25.IntOption numSIOControllers;

	private com.vmware.vim25.IntOption numPS2Controllers;

	private java.lang.String[] licensingLimit;

	private com.vmware.vim25.IntOption numSupportedWwnPorts;

	private com.vmware.vim25.IntOption numSupportedWwnNodes;

	public VirtualHardwareOption() {
	}

	public VirtualHardwareOption(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty, int hwVersion,
			com.vmware.vim25.VirtualDeviceOption[] virtualDeviceOption,
			boolean deviceListReadonly, int[] numCPU, boolean numCpuReadonly,
			com.vmware.vim25.LongOption memoryMB,
			com.vmware.vim25.IntOption numPCIControllers,
			com.vmware.vim25.IntOption numIDEControllers,
			com.vmware.vim25.IntOption numUSBControllers,
			com.vmware.vim25.IntOption numSIOControllers,
			com.vmware.vim25.IntOption numPS2Controllers,
			java.lang.String[] licensingLimit,
			com.vmware.vim25.IntOption numSupportedWwnPorts,
			com.vmware.vim25.IntOption numSupportedWwnNodes) {
		super(dynamicType, dynamicProperty);
		this.hwVersion = hwVersion;
		this.virtualDeviceOption = virtualDeviceOption;
		this.deviceListReadonly = deviceListReadonly;
		this.numCPU = numCPU;
		this.numCpuReadonly = numCpuReadonly;
		this.memoryMB = memoryMB;
		this.numPCIControllers = numPCIControllers;
		this.numIDEControllers = numIDEControllers;
		this.numUSBControllers = numUSBControllers;
		this.numSIOControllers = numSIOControllers;
		this.numPS2Controllers = numPS2Controllers;
		this.licensingLimit = licensingLimit;
		this.numSupportedWwnPorts = numSupportedWwnPorts;
		this.numSupportedWwnNodes = numSupportedWwnNodes;
	}

	/**
	 * Gets the hwVersion value for this VirtualHardwareOption.
	 * 
	 * @return hwVersion
	 */
	public int getHwVersion() {
		return hwVersion;
	}

	/**
	 * Sets the hwVersion value for this VirtualHardwareOption.
	 * 
	 * @param hwVersion
	 */
	public void setHwVersion(int hwVersion) {
		this.hwVersion = hwVersion;
	}

	/**
	 * Gets the virtualDeviceOption value for this VirtualHardwareOption.
	 * 
	 * @return virtualDeviceOption
	 */
	public com.vmware.vim25.VirtualDeviceOption[] getVirtualDeviceOption() {
		return virtualDeviceOption;
	}

	/**
	 * Sets the virtualDeviceOption value for this VirtualHardwareOption.
	 * 
	 * @param virtualDeviceOption
	 */
	public void setVirtualDeviceOption(
			com.vmware.vim25.VirtualDeviceOption[] virtualDeviceOption) {
		this.virtualDeviceOption = virtualDeviceOption;
	}

	public com.vmware.vim25.VirtualDeviceOption getVirtualDeviceOption(int i) {
		return this.virtualDeviceOption[i];
	}

	public void setVirtualDeviceOption(int i,
			com.vmware.vim25.VirtualDeviceOption _value) {
		this.virtualDeviceOption[i] = _value;
	}

	/**
	 * Gets the deviceListReadonly value for this VirtualHardwareOption.
	 * 
	 * @return deviceListReadonly
	 */
	public boolean isDeviceListReadonly() {
		return deviceListReadonly;
	}

	/**
	 * Sets the deviceListReadonly value for this VirtualHardwareOption.
	 * 
	 * @param deviceListReadonly
	 */
	public void setDeviceListReadonly(boolean deviceListReadonly) {
		this.deviceListReadonly = deviceListReadonly;
	}

	/**
	 * Gets the numCPU value for this VirtualHardwareOption.
	 * 
	 * @return numCPU
	 */
	public int[] getNumCPU() {
		return numCPU;
	}

	/**
	 * Sets the numCPU value for this VirtualHardwareOption.
	 * 
	 * @param numCPU
	 */
	public void setNumCPU(int[] numCPU) {
		this.numCPU = numCPU;
	}

	public int getNumCPU(int i) {
		return this.numCPU[i];
	}

	public void setNumCPU(int i, int _value) {
		this.numCPU[i] = _value;
	}

	/**
	 * Gets the numCpuReadonly value for this VirtualHardwareOption.
	 * 
	 * @return numCpuReadonly
	 */
	public boolean isNumCpuReadonly() {
		return numCpuReadonly;
	}

	/**
	 * Sets the numCpuReadonly value for this VirtualHardwareOption.
	 * 
	 * @param numCpuReadonly
	 */
	public void setNumCpuReadonly(boolean numCpuReadonly) {
		this.numCpuReadonly = numCpuReadonly;
	}

	/**
	 * Gets the memoryMB value for this VirtualHardwareOption.
	 * 
	 * @return memoryMB
	 */
	public com.vmware.vim25.LongOption getMemoryMB() {
		return memoryMB;
	}

	/**
	 * Sets the memoryMB value for this VirtualHardwareOption.
	 * 
	 * @param memoryMB
	 */
	public void setMemoryMB(com.vmware.vim25.LongOption memoryMB) {
		this.memoryMB = memoryMB;
	}

	/**
	 * Gets the numPCIControllers value for this VirtualHardwareOption.
	 * 
	 * @return numPCIControllers
	 */
	public com.vmware.vim25.IntOption getNumPCIControllers() {
		return numPCIControllers;
	}

	/**
	 * Sets the numPCIControllers value for this VirtualHardwareOption.
	 * 
	 * @param numPCIControllers
	 */
	public void setNumPCIControllers(
			com.vmware.vim25.IntOption numPCIControllers) {
		this.numPCIControllers = numPCIControllers;
	}

	/**
	 * Gets the numIDEControllers value for this VirtualHardwareOption.
	 * 
	 * @return numIDEControllers
	 */
	public com.vmware.vim25.IntOption getNumIDEControllers() {
		return numIDEControllers;
	}

	/**
	 * Sets the numIDEControllers value for this VirtualHardwareOption.
	 * 
	 * @param numIDEControllers
	 */
	public void setNumIDEControllers(
			com.vmware.vim25.IntOption numIDEControllers) {
		this.numIDEControllers = numIDEControllers;
	}

	/**
	 * Gets the numUSBControllers value for this VirtualHardwareOption.
	 * 
	 * @return numUSBControllers
	 */
	public com.vmware.vim25.IntOption getNumUSBControllers() {
		return numUSBControllers;
	}

	/**
	 * Sets the numUSBControllers value for this VirtualHardwareOption.
	 * 
	 * @param numUSBControllers
	 */
	public void setNumUSBControllers(
			com.vmware.vim25.IntOption numUSBControllers) {
		this.numUSBControllers = numUSBControllers;
	}

	/**
	 * Gets the numSIOControllers value for this VirtualHardwareOption.
	 * 
	 * @return numSIOControllers
	 */
	public com.vmware.vim25.IntOption getNumSIOControllers() {
		return numSIOControllers;
	}

	/**
	 * Sets the numSIOControllers value for this VirtualHardwareOption.
	 * 
	 * @param numSIOControllers
	 */
	public void setNumSIOControllers(
			com.vmware.vim25.IntOption numSIOControllers) {
		this.numSIOControllers = numSIOControllers;
	}

	/**
	 * Gets the numPS2Controllers value for this VirtualHardwareOption.
	 * 
	 * @return numPS2Controllers
	 */
	public com.vmware.vim25.IntOption getNumPS2Controllers() {
		return numPS2Controllers;
	}

	/**
	 * Sets the numPS2Controllers value for this VirtualHardwareOption.
	 * 
	 * @param numPS2Controllers
	 */
	public void setNumPS2Controllers(
			com.vmware.vim25.IntOption numPS2Controllers) {
		this.numPS2Controllers = numPS2Controllers;
	}

	/**
	 * Gets the licensingLimit value for this VirtualHardwareOption.
	 * 
	 * @return licensingLimit
	 */
	public java.lang.String[] getLicensingLimit() {
		return licensingLimit;
	}

	/**
	 * Sets the licensingLimit value for this VirtualHardwareOption.
	 * 
	 * @param licensingLimit
	 */
	public void setLicensingLimit(java.lang.String[] licensingLimit) {
		this.licensingLimit = licensingLimit;
	}

	public java.lang.String getLicensingLimit(int i) {
		return this.licensingLimit[i];
	}

	public void setLicensingLimit(int i, java.lang.String _value) {
		this.licensingLimit[i] = _value;
	}

	/**
	 * Gets the numSupportedWwnPorts value for this VirtualHardwareOption.
	 * 
	 * @return numSupportedWwnPorts
	 */
	public com.vmware.vim25.IntOption getNumSupportedWwnPorts() {
		return numSupportedWwnPorts;
	}

	/**
	 * Sets the numSupportedWwnPorts value for this VirtualHardwareOption.
	 * 
	 * @param numSupportedWwnPorts
	 */
	public void setNumSupportedWwnPorts(
			com.vmware.vim25.IntOption numSupportedWwnPorts) {
		this.numSupportedWwnPorts = numSupportedWwnPorts;
	}

	/**
	 * Gets the numSupportedWwnNodes value for this VirtualHardwareOption.
	 * 
	 * @return numSupportedWwnNodes
	 */
	public com.vmware.vim25.IntOption getNumSupportedWwnNodes() {
		return numSupportedWwnNodes;
	}

	/**
	 * Sets the numSupportedWwnNodes value for this VirtualHardwareOption.
	 * 
	 * @param numSupportedWwnNodes
	 */
	public void setNumSupportedWwnNodes(
			com.vmware.vim25.IntOption numSupportedWwnNodes) {
		this.numSupportedWwnNodes = numSupportedWwnNodes;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualHardwareOption)) {
			return false;
		}
		VirtualHardwareOption other = (VirtualHardwareOption) obj;
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
				&& this.hwVersion == other.getHwVersion()
				&& ((this.virtualDeviceOption == null && other
						.getVirtualDeviceOption() == null) || (this.virtualDeviceOption != null && java.util.Arrays
						.equals(this.virtualDeviceOption, other
								.getVirtualDeviceOption())))
				&& this.deviceListReadonly == other.isDeviceListReadonly()
				&& ((this.numCPU == null && other.getNumCPU() == null) || (this.numCPU != null && java.util.Arrays
						.equals(this.numCPU, other.getNumCPU())))
				&& this.numCpuReadonly == other.isNumCpuReadonly()
				&& ((this.memoryMB == null && other.getMemoryMB() == null) || (this.memoryMB != null && this.memoryMB
						.equals(other.getMemoryMB())))
				&& ((this.numPCIControllers == null && other
						.getNumPCIControllers() == null) || (this.numPCIControllers != null && this.numPCIControllers
						.equals(other.getNumPCIControllers())))
				&& ((this.numIDEControllers == null && other
						.getNumIDEControllers() == null) || (this.numIDEControllers != null && this.numIDEControllers
						.equals(other.getNumIDEControllers())))
				&& ((this.numUSBControllers == null && other
						.getNumUSBControllers() == null) || (this.numUSBControllers != null && this.numUSBControllers
						.equals(other.getNumUSBControllers())))
				&& ((this.numSIOControllers == null && other
						.getNumSIOControllers() == null) || (this.numSIOControllers != null && this.numSIOControllers
						.equals(other.getNumSIOControllers())))
				&& ((this.numPS2Controllers == null && other
						.getNumPS2Controllers() == null) || (this.numPS2Controllers != null && this.numPS2Controllers
						.equals(other.getNumPS2Controllers())))
				&& ((this.licensingLimit == null && other.getLicensingLimit() == null) || (this.licensingLimit != null && java.util.Arrays
						.equals(this.licensingLimit, other.getLicensingLimit())))
				&& ((this.numSupportedWwnPorts == null && other
						.getNumSupportedWwnPorts() == null) || (this.numSupportedWwnPorts != null && this.numSupportedWwnPorts
						.equals(other.getNumSupportedWwnPorts())))
				&& ((this.numSupportedWwnNodes == null && other
						.getNumSupportedWwnNodes() == null) || (this.numSupportedWwnNodes != null && this.numSupportedWwnNodes
						.equals(other.getNumSupportedWwnNodes())));
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
		_hashCode += getHwVersion();
		if (getVirtualDeviceOption() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getVirtualDeviceOption()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getVirtualDeviceOption(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		_hashCode += (isDeviceListReadonly() ? Boolean.TRUE : Boolean.FALSE)
				.hashCode();
		if (getNumCPU() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getNumCPU()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getNumCPU(),
						i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		_hashCode += (isNumCpuReadonly() ? Boolean.TRUE : Boolean.FALSE)
				.hashCode();
		if (getMemoryMB() != null) {
			_hashCode += getMemoryMB().hashCode();
		}
		if (getNumPCIControllers() != null) {
			_hashCode += getNumPCIControllers().hashCode();
		}
		if (getNumIDEControllers() != null) {
			_hashCode += getNumIDEControllers().hashCode();
		}
		if (getNumUSBControllers() != null) {
			_hashCode += getNumUSBControllers().hashCode();
		}
		if (getNumSIOControllers() != null) {
			_hashCode += getNumSIOControllers().hashCode();
		}
		if (getNumPS2Controllers() != null) {
			_hashCode += getNumPS2Controllers().hashCode();
		}
		if (getLicensingLimit() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getLicensingLimit()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getLicensingLimit(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getNumSupportedWwnPorts() != null) {
			_hashCode += getNumSupportedWwnPorts().hashCode();
		}
		if (getNumSupportedWwnNodes() != null) {
			_hashCode += getNumSupportedWwnNodes().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VirtualHardwareOption.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualHardwareOption"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hwVersion");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"hwVersion"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("virtualDeviceOption");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"virtualDeviceOption"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualDeviceOption"));
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("deviceListReadonly");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"deviceListReadonly"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numCPU");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"numCPU"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numCpuReadonly");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"numCpuReadonly"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("memoryMB");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"memoryMB"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"LongOption"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numPCIControllers");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"numPCIControllers"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"IntOption"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numIDEControllers");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"numIDEControllers"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"IntOption"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numUSBControllers");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"numUSBControllers"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"IntOption"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numSIOControllers");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"numSIOControllers"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"IntOption"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numPS2Controllers");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"numPS2Controllers"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"IntOption"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("licensingLimit");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"licensingLimit"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numSupportedWwnPorts");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"numSupportedWwnPorts"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"IntOption"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numSupportedWwnNodes");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"numSupportedWwnNodes"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"IntOption"));
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
