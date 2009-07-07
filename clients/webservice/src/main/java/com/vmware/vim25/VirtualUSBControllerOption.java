/**
 * VirtualUSBControllerOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualUSBControllerOption  extends com.vmware.vim25.VirtualControllerOption  implements java.io.Serializable {
    private com.vmware.vim25.BoolOption autoConnectDevices;

    private com.vmware.vim25.BoolOption ehciSupported;

    public VirtualUSBControllerOption() {
    }

    public VirtualUSBControllerOption(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String type,
           com.vmware.vim25.VirtualDeviceConnectOption connectOption,
           java.lang.String controllerType,
           com.vmware.vim25.BoolOption autoAssignController,
           com.vmware.vim25.VirtualDeviceBackingOption[] backingOption,
           java.lang.Integer defaultBackingOptionIndex,
           java.lang.String[] licensingLimit,
           boolean deprecated,
           boolean plugAndPlay,
           java.lang.Boolean hotRemoveSupported,
           com.vmware.vim25.IntOption devices,
           java.lang.String[] supportedDevice,
           com.vmware.vim25.BoolOption autoConnectDevices,
           com.vmware.vim25.BoolOption ehciSupported) {
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
            hotRemoveSupported,
            devices,
            supportedDevice);
        this.autoConnectDevices = autoConnectDevices;
        this.ehciSupported = ehciSupported;
    }


    /**
     * Gets the autoConnectDevices value for this VirtualUSBControllerOption.
     * 
     * @return autoConnectDevices
     */
    public com.vmware.vim25.BoolOption getAutoConnectDevices() {
        return autoConnectDevices;
    }


    /**
     * Sets the autoConnectDevices value for this VirtualUSBControllerOption.
     * 
     * @param autoConnectDevices
     */
    public void setAutoConnectDevices(com.vmware.vim25.BoolOption autoConnectDevices) {
        this.autoConnectDevices = autoConnectDevices;
    }


    /**
     * Gets the ehciSupported value for this VirtualUSBControllerOption.
     * 
     * @return ehciSupported
     */
    public com.vmware.vim25.BoolOption getEhciSupported() {
        return ehciSupported;
    }


    /**
     * Sets the ehciSupported value for this VirtualUSBControllerOption.
     * 
     * @param ehciSupported
     */
    public void setEhciSupported(com.vmware.vim25.BoolOption ehciSupported) {
        this.ehciSupported = ehciSupported;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualUSBControllerOption)) return false;
        VirtualUSBControllerOption other = (VirtualUSBControllerOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.autoConnectDevices==null && other.getAutoConnectDevices()==null) || 
             (this.autoConnectDevices!=null &&
              this.autoConnectDevices.equals(other.getAutoConnectDevices()))) &&
            ((this.ehciSupported==null && other.getEhciSupported()==null) || 
             (this.ehciSupported!=null &&
              this.ehciSupported.equals(other.getEhciSupported())));
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
        if (getAutoConnectDevices() != null) {
            _hashCode += getAutoConnectDevices().hashCode();
        }
        if (getEhciSupported() != null) {
            _hashCode += getEhciSupported().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualUSBControllerOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualUSBControllerOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoConnectDevices");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "autoConnectDevices"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "BoolOption"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ehciSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ehciSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "BoolOption"));
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
