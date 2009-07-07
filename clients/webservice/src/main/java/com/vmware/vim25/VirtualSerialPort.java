/**
 * VirtualSerialPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualSerialPort  extends com.vmware.vim25.VirtualDevice  implements java.io.Serializable {
    private boolean yieldOnPoll;

    public VirtualSerialPort() {
    }

    public VirtualSerialPort(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           int key,
           com.vmware.vim25.Description deviceInfo,
           com.vmware.vim25.VirtualDeviceBackingInfo backing,
           com.vmware.vim25.VirtualDeviceConnectInfo connectable,
           java.lang.Integer controllerKey,
           java.lang.Integer unitNumber,
           boolean yieldOnPoll) {
        super(
            dynamicType,
            dynamicProperty,
            key,
            deviceInfo,
            backing,
            connectable,
            controllerKey,
            unitNumber);
        this.yieldOnPoll = yieldOnPoll;
    }


    /**
     * Gets the yieldOnPoll value for this VirtualSerialPort.
     * 
     * @return yieldOnPoll
     */
    public boolean isYieldOnPoll() {
        return yieldOnPoll;
    }


    /**
     * Sets the yieldOnPoll value for this VirtualSerialPort.
     * 
     * @param yieldOnPoll
     */
    public void setYieldOnPoll(boolean yieldOnPoll) {
        this.yieldOnPoll = yieldOnPoll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualSerialPort)) return false;
        VirtualSerialPort other = (VirtualSerialPort) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.yieldOnPoll == other.isYieldOnPoll();
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
        _hashCode += (isYieldOnPoll() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualSerialPort.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualSerialPort"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yieldOnPoll");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "yieldOnPoll"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
