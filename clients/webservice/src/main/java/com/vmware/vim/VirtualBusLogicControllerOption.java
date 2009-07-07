/**
 * VirtualBusLogicControllerOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class VirtualBusLogicControllerOption  extends com.vmware.vim.VirtualSCSIControllerOption  implements java.io.Serializable {
    public VirtualBusLogicControllerOption() {
    }

    public VirtualBusLogicControllerOption(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           java.lang.String type,
           com.vmware.vim.VirtualDeviceConnectOption connectOption,
           java.lang.String controllerType,
           com.vmware.vim.BoolOption autoAssignController,
           com.vmware.vim.VirtualDeviceBackingOption[] backingOption,
           java.lang.Integer defaultBackingOptionIndex,
           java.lang.String[] licensingLimit,
           boolean deprecated,
           boolean plugAndPlay,
           com.vmware.vim.IntOption devices,
           java.lang.String[] supportedDevice,
           com.vmware.vim.IntOption numSCSIDisks,
           com.vmware.vim.IntOption numSCSICdroms,
           com.vmware.vim.IntOption numSCSIPassthrough,
           com.vmware.vim.VirtualSCSISharing[] sharing,
           int defaultSharedIndex,
           com.vmware.vim.BoolOption hotAddRemove,
           int scsiCtlrUnitNumber) {
        super(
            dynamicType,
            dynamicProperty,
            type,
            connectOption,
            controllerType,
            autoAssignController,
            backingOption,
            defaultBackingOptionIndex,
            licensingLimit,
            deprecated,
            plugAndPlay,
            devices,
            supportedDevice,
            numSCSIDisks,
            numSCSICdroms,
            numSCSIPassthrough,
            sharing,
            defaultSharedIndex,
            hotAddRemove,
            scsiCtlrUnitNumber);
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualBusLogicControllerOption)) return false;
        VirtualBusLogicControllerOption other = (VirtualBusLogicControllerOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj);
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualBusLogicControllerOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "VirtualBusLogicControllerOption"));
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
