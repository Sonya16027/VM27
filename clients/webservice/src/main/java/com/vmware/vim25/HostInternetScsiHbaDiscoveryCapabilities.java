/**
 * HostInternetScsiHbaDiscoveryCapabilities.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostInternetScsiHbaDiscoveryCapabilities  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private boolean iSnsDiscoverySettable;

    private boolean slpDiscoverySettable;

    private boolean staticTargetDiscoverySettable;

    private boolean sendTargetsDiscoverySettable;

    public HostInternetScsiHbaDiscoveryCapabilities() {
    }

    public HostInternetScsiHbaDiscoveryCapabilities(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           boolean iSnsDiscoverySettable,
           boolean slpDiscoverySettable,
           boolean staticTargetDiscoverySettable,
           boolean sendTargetsDiscoverySettable) {
        super(
            dynamicType,
            dynamicProperty);
        this.iSnsDiscoverySettable = iSnsDiscoverySettable;
        this.slpDiscoverySettable = slpDiscoverySettable;
        this.staticTargetDiscoverySettable = staticTargetDiscoverySettable;
        this.sendTargetsDiscoverySettable = sendTargetsDiscoverySettable;
    }


    /**
     * Gets the iSnsDiscoverySettable value for this HostInternetScsiHbaDiscoveryCapabilities.
     * 
     * @return iSnsDiscoverySettable
     */
    public boolean isISnsDiscoverySettable() {
        return iSnsDiscoverySettable;
    }


    /**
     * Sets the iSnsDiscoverySettable value for this HostInternetScsiHbaDiscoveryCapabilities.
     * 
     * @param iSnsDiscoverySettable
     */
    public void setISnsDiscoverySettable(boolean iSnsDiscoverySettable) {
        this.iSnsDiscoverySettable = iSnsDiscoverySettable;
    }


    /**
     * Gets the slpDiscoverySettable value for this HostInternetScsiHbaDiscoveryCapabilities.
     * 
     * @return slpDiscoverySettable
     */
    public boolean isSlpDiscoverySettable() {
        return slpDiscoverySettable;
    }


    /**
     * Sets the slpDiscoverySettable value for this HostInternetScsiHbaDiscoveryCapabilities.
     * 
     * @param slpDiscoverySettable
     */
    public void setSlpDiscoverySettable(boolean slpDiscoverySettable) {
        this.slpDiscoverySettable = slpDiscoverySettable;
    }


    /**
     * Gets the staticTargetDiscoverySettable value for this HostInternetScsiHbaDiscoveryCapabilities.
     * 
     * @return staticTargetDiscoverySettable
     */
    public boolean isStaticTargetDiscoverySettable() {
        return staticTargetDiscoverySettable;
    }


    /**
     * Sets the staticTargetDiscoverySettable value for this HostInternetScsiHbaDiscoveryCapabilities.
     * 
     * @param staticTargetDiscoverySettable
     */
    public void setStaticTargetDiscoverySettable(boolean staticTargetDiscoverySettable) {
        this.staticTargetDiscoverySettable = staticTargetDiscoverySettable;
    }


    /**
     * Gets the sendTargetsDiscoverySettable value for this HostInternetScsiHbaDiscoveryCapabilities.
     * 
     * @return sendTargetsDiscoverySettable
     */
    public boolean isSendTargetsDiscoverySettable() {
        return sendTargetsDiscoverySettable;
    }


    /**
     * Sets the sendTargetsDiscoverySettable value for this HostInternetScsiHbaDiscoveryCapabilities.
     * 
     * @param sendTargetsDiscoverySettable
     */
    public void setSendTargetsDiscoverySettable(boolean sendTargetsDiscoverySettable) {
        this.sendTargetsDiscoverySettable = sendTargetsDiscoverySettable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostInternetScsiHbaDiscoveryCapabilities)) return false;
        HostInternetScsiHbaDiscoveryCapabilities other = (HostInternetScsiHbaDiscoveryCapabilities) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.iSnsDiscoverySettable == other.isISnsDiscoverySettable() &&
            this.slpDiscoverySettable == other.isSlpDiscoverySettable() &&
            this.staticTargetDiscoverySettable == other.isStaticTargetDiscoverySettable() &&
            this.sendTargetsDiscoverySettable == other.isSendTargetsDiscoverySettable();
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
        _hashCode += (isISnsDiscoverySettable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSlpDiscoverySettable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isStaticTargetDiscoverySettable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSendTargetsDiscoverySettable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostInternetScsiHbaDiscoveryCapabilities.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostInternetScsiHbaDiscoveryCapabilities"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ISnsDiscoverySettable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "iSnsDiscoverySettable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("slpDiscoverySettable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "slpDiscoverySettable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("staticTargetDiscoverySettable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "staticTargetDiscoverySettable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendTargetsDiscoverySettable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sendTargetsDiscoverySettable"));
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
