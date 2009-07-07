/**
 * VirtualMachineScsiDiskDeviceInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class VirtualMachineScsiDiskDeviceInfo  extends com.vmware.vim.VirtualMachineDiskDeviceInfo  implements java.io.Serializable {
    private com.vmware.vim.HostScsiDisk disk;

    public VirtualMachineScsiDiskDeviceInfo() {
    }

    public VirtualMachineScsiDiskDeviceInfo(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           java.lang.String name,
           java.lang.String[] configurationTag,
           java.lang.Long capacity,
           com.vmware.vim.ManagedObjectReference[] vm,
           com.vmware.vim.HostScsiDisk disk) {
        super(
            dynamicType,
            dynamicProperty,
            name,
            configurationTag,
            capacity,
            vm);
        this.disk = disk;
    }


    /**
     * Gets the disk value for this VirtualMachineScsiDiskDeviceInfo.
     * 
     * @return disk
     */
    public com.vmware.vim.HostScsiDisk getDisk() {
        return disk;
    }


    /**
     * Sets the disk value for this VirtualMachineScsiDiskDeviceInfo.
     * 
     * @param disk
     */
    public void setDisk(com.vmware.vim.HostScsiDisk disk) {
        this.disk = disk;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualMachineScsiDiskDeviceInfo)) return false;
        VirtualMachineScsiDiskDeviceInfo other = (VirtualMachineScsiDiskDeviceInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.disk==null && other.getDisk()==null) || 
             (this.disk!=null &&
              this.disk.equals(other.getDisk())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getDisk() != null) {
            _hashCode += getDisk().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualMachineScsiDiskDeviceInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "VirtualMachineScsiDiskDeviceInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disk");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "disk"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostScsiDisk"));
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
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
