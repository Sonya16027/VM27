/**
 * HostVirtualSwitchSimpleBridge.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostVirtualSwitchSimpleBridge  extends com.vmware.vim.HostVirtualSwitchBridge  implements java.io.Serializable {
    private java.lang.String nicDevice;

    public HostVirtualSwitchSimpleBridge() {
    }

    public HostVirtualSwitchSimpleBridge(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           java.lang.String nicDevice) {
        super(
            dynamicType,
            dynamicProperty);
        this.nicDevice = nicDevice;
    }


    /**
     * Gets the nicDevice value for this HostVirtualSwitchSimpleBridge.
     * 
     * @return nicDevice
     */
    public java.lang.String getNicDevice() {
        return nicDevice;
    }


    /**
     * Sets the nicDevice value for this HostVirtualSwitchSimpleBridge.
     * 
     * @param nicDevice
     */
    public void setNicDevice(java.lang.String nicDevice) {
        this.nicDevice = nicDevice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostVirtualSwitchSimpleBridge)) return false;
        HostVirtualSwitchSimpleBridge other = (HostVirtualSwitchSimpleBridge) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.nicDevice==null && other.getNicDevice()==null) || 
             (this.nicDevice!=null &&
              this.nicDevice.equals(other.getNicDevice())));
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
        if (getNicDevice() != null) {
            _hashCode += getNicDevice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostVirtualSwitchSimpleBridge.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostVirtualSwitchSimpleBridge"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nicDevice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "nicDevice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
