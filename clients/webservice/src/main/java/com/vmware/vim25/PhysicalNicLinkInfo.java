/**
 * PhysicalNicLinkInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class PhysicalNicLinkInfo  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private int speedMb;

    private boolean duplex;

    public PhysicalNicLinkInfo() {
    }

    public PhysicalNicLinkInfo(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           int speedMb,
           boolean duplex) {
        super(
            dynamicType,
            dynamicProperty);
        this.speedMb = speedMb;
        this.duplex = duplex;
    }


    /**
     * Gets the speedMb value for this PhysicalNicLinkInfo.
     * 
     * @return speedMb
     */
    public int getSpeedMb() {
        return speedMb;
    }


    /**
     * Sets the speedMb value for this PhysicalNicLinkInfo.
     * 
     * @param speedMb
     */
    public void setSpeedMb(int speedMb) {
        this.speedMb = speedMb;
    }


    /**
     * Gets the duplex value for this PhysicalNicLinkInfo.
     * 
     * @return duplex
     */
    public boolean isDuplex() {
        return duplex;
    }


    /**
     * Sets the duplex value for this PhysicalNicLinkInfo.
     * 
     * @param duplex
     */
    public void setDuplex(boolean duplex) {
        this.duplex = duplex;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PhysicalNicLinkInfo)) return false;
        PhysicalNicLinkInfo other = (PhysicalNicLinkInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.speedMb == other.getSpeedMb() &&
            this.duplex == other.isDuplex();
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
        _hashCode += getSpeedMb();
        _hashCode += (isDuplex() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PhysicalNicLinkInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PhysicalNicLinkInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("speedMb");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "speedMb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duplex");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "duplex"));
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
