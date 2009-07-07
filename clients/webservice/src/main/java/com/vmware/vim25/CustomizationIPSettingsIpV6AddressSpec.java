/**
 * CustomizationIPSettingsIpV6AddressSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class CustomizationIPSettingsIpV6AddressSpec  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private com.vmware.vim25.CustomizationIpV6Generator[] ip;

    private java.lang.String[] gateway;

    public CustomizationIPSettingsIpV6AddressSpec() {
    }

    public CustomizationIPSettingsIpV6AddressSpec(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.CustomizationIpV6Generator[] ip,
           java.lang.String[] gateway) {
        super(
            dynamicType,
            dynamicProperty);
        this.ip = ip;
        this.gateway = gateway;
    }


    /**
     * Gets the ip value for this CustomizationIPSettingsIpV6AddressSpec.
     * 
     * @return ip
     */
    public com.vmware.vim25.CustomizationIpV6Generator[] getIp() {
        return ip;
    }


    /**
     * Sets the ip value for this CustomizationIPSettingsIpV6AddressSpec.
     * 
     * @param ip
     */
    public void setIp(com.vmware.vim25.CustomizationIpV6Generator[] ip) {
        this.ip = ip;
    }

    public com.vmware.vim25.CustomizationIpV6Generator getIp(int i) {
        return this.ip[i];
    }

    public void setIp(int i, com.vmware.vim25.CustomizationIpV6Generator _value) {
        this.ip[i] = _value;
    }


    /**
     * Gets the gateway value for this CustomizationIPSettingsIpV6AddressSpec.
     * 
     * @return gateway
     */
    public java.lang.String[] getGateway() {
        return gateway;
    }


    /**
     * Sets the gateway value for this CustomizationIPSettingsIpV6AddressSpec.
     * 
     * @param gateway
     */
    public void setGateway(java.lang.String[] gateway) {
        this.gateway = gateway;
    }

    public java.lang.String getGateway(int i) {
        return this.gateway[i];
    }

    public void setGateway(int i, java.lang.String _value) {
        this.gateway[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomizationIPSettingsIpV6AddressSpec)) return false;
        CustomizationIPSettingsIpV6AddressSpec other = (CustomizationIPSettingsIpV6AddressSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ip==null && other.getIp()==null) || 
             (this.ip!=null &&
              java.util.Arrays.equals(this.ip, other.getIp()))) &&
            ((this.gateway==null && other.getGateway()==null) || 
             (this.gateway!=null &&
              java.util.Arrays.equals(this.gateway, other.getGateway())));
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
        if (getIp() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIp());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIp(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGateway() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGateway());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGateway(), i);
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
        new org.apache.axis.description.TypeDesc(CustomizationIPSettingsIpV6AddressSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "CustomizationIPSettingsIpV6AddressSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ip"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "CustomizationIpV6Generator"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gateway");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "gateway"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
