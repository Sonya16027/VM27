/**
 * OvfManagerCommonParams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class OvfManagerCommonParams  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.String locale;

    private java.lang.String deploymentOption;

    private com.vmware.vim25.KeyValue[] msgBundle;

    public OvfManagerCommonParams() {
    }

    public OvfManagerCommonParams(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String locale,
           java.lang.String deploymentOption,
           com.vmware.vim25.KeyValue[] msgBundle) {
        super(
            dynamicType,
            dynamicProperty);
        this.locale = locale;
        this.deploymentOption = deploymentOption;
        this.msgBundle = msgBundle;
    }


    /**
     * Gets the locale value for this OvfManagerCommonParams.
     * 
     * @return locale
     */
    public java.lang.String getLocale() {
        return locale;
    }


    /**
     * Sets the locale value for this OvfManagerCommonParams.
     * 
     * @param locale
     */
    public void setLocale(java.lang.String locale) {
        this.locale = locale;
    }


    /**
     * Gets the deploymentOption value for this OvfManagerCommonParams.
     * 
     * @return deploymentOption
     */
    public java.lang.String getDeploymentOption() {
        return deploymentOption;
    }


    /**
     * Sets the deploymentOption value for this OvfManagerCommonParams.
     * 
     * @param deploymentOption
     */
    public void setDeploymentOption(java.lang.String deploymentOption) {
        this.deploymentOption = deploymentOption;
    }


    /**
     * Gets the msgBundle value for this OvfManagerCommonParams.
     * 
     * @return msgBundle
     */
    public com.vmware.vim25.KeyValue[] getMsgBundle() {
        return msgBundle;
    }


    /**
     * Sets the msgBundle value for this OvfManagerCommonParams.
     * 
     * @param msgBundle
     */
    public void setMsgBundle(com.vmware.vim25.KeyValue[] msgBundle) {
        this.msgBundle = msgBundle;
    }

    public com.vmware.vim25.KeyValue getMsgBundle(int i) {
        return this.msgBundle[i];
    }

    public void setMsgBundle(int i, com.vmware.vim25.KeyValue _value) {
        this.msgBundle[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OvfManagerCommonParams)) return false;
        OvfManagerCommonParams other = (OvfManagerCommonParams) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.locale==null && other.getLocale()==null) || 
             (this.locale!=null &&
              this.locale.equals(other.getLocale()))) &&
            ((this.deploymentOption==null && other.getDeploymentOption()==null) || 
             (this.deploymentOption!=null &&
              this.deploymentOption.equals(other.getDeploymentOption()))) &&
            ((this.msgBundle==null && other.getMsgBundle()==null) || 
             (this.msgBundle!=null &&
              java.util.Arrays.equals(this.msgBundle, other.getMsgBundle())));
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
        if (getLocale() != null) {
            _hashCode += getLocale().hashCode();
        }
        if (getDeploymentOption() != null) {
            _hashCode += getDeploymentOption().hashCode();
        }
        if (getMsgBundle() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMsgBundle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMsgBundle(), i);
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
        new org.apache.axis.description.TypeDesc(OvfManagerCommonParams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OvfManagerCommonParams"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locale");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "locale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deploymentOption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "deploymentOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msgBundle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "msgBundle"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "KeyValue"));
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
