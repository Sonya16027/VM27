/**
 * HostDateTimeConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostDateTimeConfig  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.String timeZone;

    private com.vmware.vim25.HostNtpConfig ntpConfig;

    public HostDateTimeConfig() {
    }

    public HostDateTimeConfig(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String timeZone,
           com.vmware.vim25.HostNtpConfig ntpConfig) {
        super(
            dynamicType,
            dynamicProperty);
        this.timeZone = timeZone;
        this.ntpConfig = ntpConfig;
    }


    /**
     * Gets the timeZone value for this HostDateTimeConfig.
     * 
     * @return timeZone
     */
    public java.lang.String getTimeZone() {
        return timeZone;
    }


    /**
     * Sets the timeZone value for this HostDateTimeConfig.
     * 
     * @param timeZone
     */
    public void setTimeZone(java.lang.String timeZone) {
        this.timeZone = timeZone;
    }


    /**
     * Gets the ntpConfig value for this HostDateTimeConfig.
     * 
     * @return ntpConfig
     */
    public com.vmware.vim25.HostNtpConfig getNtpConfig() {
        return ntpConfig;
    }


    /**
     * Sets the ntpConfig value for this HostDateTimeConfig.
     * 
     * @param ntpConfig
     */
    public void setNtpConfig(com.vmware.vim25.HostNtpConfig ntpConfig) {
        this.ntpConfig = ntpConfig;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostDateTimeConfig)) return false;
        HostDateTimeConfig other = (HostDateTimeConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.timeZone==null && other.getTimeZone()==null) || 
             (this.timeZone!=null &&
              this.timeZone.equals(other.getTimeZone()))) &&
            ((this.ntpConfig==null && other.getNtpConfig()==null) || 
             (this.ntpConfig!=null &&
              this.ntpConfig.equals(other.getNtpConfig())));
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
        if (getTimeZone() != null) {
            _hashCode += getTimeZone().hashCode();
        }
        if (getNtpConfig() != null) {
            _hashCode += getNtpConfig().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostDateTimeConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostDateTimeConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "timeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ntpConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ntpConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostNtpConfig"));
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
