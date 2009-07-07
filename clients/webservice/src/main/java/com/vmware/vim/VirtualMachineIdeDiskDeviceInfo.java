/**
 * VirtualMachineIdeDiskDeviceInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class VirtualMachineIdeDiskDeviceInfo  extends com.vmware.vim.VirtualMachineDiskDeviceInfo  implements java.io.Serializable {
    private com.vmware.vim.VirtualMachineIdeDiskDevicePartitionInfo[] partitionTable;

    public VirtualMachineIdeDiskDeviceInfo() {
    }

    public VirtualMachineIdeDiskDeviceInfo(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           java.lang.String name,
           java.lang.String[] configurationTag,
           java.lang.Long capacity,
           com.vmware.vim.ManagedObjectReference[] vm,
           com.vmware.vim.VirtualMachineIdeDiskDevicePartitionInfo[] partitionTable) {
        super(
            dynamicType,
            dynamicProperty,
            name,
            configurationTag,
            capacity,
            vm);
        this.partitionTable = partitionTable;
    }


    /**
     * Gets the partitionTable value for this VirtualMachineIdeDiskDeviceInfo.
     * 
     * @return partitionTable
     */
    public com.vmware.vim.VirtualMachineIdeDiskDevicePartitionInfo[] getPartitionTable() {
        return partitionTable;
    }


    /**
     * Sets the partitionTable value for this VirtualMachineIdeDiskDeviceInfo.
     * 
     * @param partitionTable
     */
    public void setPartitionTable(com.vmware.vim.VirtualMachineIdeDiskDevicePartitionInfo[] partitionTable) {
        this.partitionTable = partitionTable;
    }

    public com.vmware.vim.VirtualMachineIdeDiskDevicePartitionInfo getPartitionTable(int i) {
        return this.partitionTable[i];
    }

    public void setPartitionTable(int i, com.vmware.vim.VirtualMachineIdeDiskDevicePartitionInfo _value) {
        this.partitionTable[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualMachineIdeDiskDeviceInfo)) return false;
        VirtualMachineIdeDiskDeviceInfo other = (VirtualMachineIdeDiskDeviceInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.partitionTable==null && other.getPartitionTable()==null) || 
             (this.partitionTable!=null &&
              java.util.Arrays.equals(this.partitionTable, other.getPartitionTable())));
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
        if (getPartitionTable() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartitionTable());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartitionTable(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualMachineIdeDiskDeviceInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "VirtualMachineIdeDiskDeviceInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitionTable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "partitionTable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "VirtualMachineIdeDiskDevicePartitionInfo"));
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
