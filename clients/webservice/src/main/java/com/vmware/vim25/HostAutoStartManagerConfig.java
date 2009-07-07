/**
 * HostAutoStartManagerConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostAutoStartManagerConfig  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private com.vmware.vim25.AutoStartDefaults defaults;

    private com.vmware.vim25.AutoStartPowerInfo[] powerInfo;

    public HostAutoStartManagerConfig() {
    }

    public HostAutoStartManagerConfig(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.AutoStartDefaults defaults,
           com.vmware.vim25.AutoStartPowerInfo[] powerInfo) {
        super(
            dynamicType,
            dynamicProperty);
        this.defaults = defaults;
        this.powerInfo = powerInfo;
    }


    /**
     * Gets the defaults value for this HostAutoStartManagerConfig.
     * 
     * @return defaults
     */
    public com.vmware.vim25.AutoStartDefaults getDefaults() {
        return defaults;
    }


    /**
     * Sets the defaults value for this HostAutoStartManagerConfig.
     * 
     * @param defaults
     */
    public void setDefaults(com.vmware.vim25.AutoStartDefaults defaults) {
        this.defaults = defaults;
    }


    /**
     * Gets the powerInfo value for this HostAutoStartManagerConfig.
     * 
     * @return powerInfo
     */
    public com.vmware.vim25.AutoStartPowerInfo[] getPowerInfo() {
        return powerInfo;
    }


    /**
     * Sets the powerInfo value for this HostAutoStartManagerConfig.
     * 
     * @param powerInfo
     */
    public void setPowerInfo(com.vmware.vim25.AutoStartPowerInfo[] powerInfo) {
        this.powerInfo = powerInfo;
    }

    public com.vmware.vim25.AutoStartPowerInfo getPowerInfo(int i) {
        return this.powerInfo[i];
    }

    public void setPowerInfo(int i, com.vmware.vim25.AutoStartPowerInfo _value) {
        this.powerInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostAutoStartManagerConfig)) return false;
        HostAutoStartManagerConfig other = (HostAutoStartManagerConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.defaults==null && other.getDefaults()==null) || 
             (this.defaults!=null &&
              this.defaults.equals(other.getDefaults()))) &&
            ((this.powerInfo==null && other.getPowerInfo()==null) || 
             (this.powerInfo!=null &&
              java.util.Arrays.equals(this.powerInfo, other.getPowerInfo())));
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
        if (getDefaults() != null) {
            _hashCode += getDefaults().hashCode();
        }
        if (getPowerInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPowerInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPowerInfo(), i);
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
        new org.apache.axis.description.TypeDesc(HostAutoStartManagerConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostAutoStartManagerConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaults");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "defaults"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "AutoStartDefaults"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("powerInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "powerInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "AutoStartPowerInfo"));
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
