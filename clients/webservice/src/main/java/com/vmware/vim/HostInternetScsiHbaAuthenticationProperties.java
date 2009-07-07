/**
 * HostInternetScsiHbaAuthenticationProperties.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostInternetScsiHbaAuthenticationProperties  extends com.vmware.vim.DynamicData  implements java.io.Serializable {
    private boolean chapAuthEnabled;

    private java.lang.String chapName;

    private java.lang.String chapSecret;

    public HostInternetScsiHbaAuthenticationProperties() {
    }

    public HostInternetScsiHbaAuthenticationProperties(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           boolean chapAuthEnabled,
           java.lang.String chapName,
           java.lang.String chapSecret) {
        super(
            dynamicType,
            dynamicProperty);
        this.chapAuthEnabled = chapAuthEnabled;
        this.chapName = chapName;
        this.chapSecret = chapSecret;
    }


    /**
     * Gets the chapAuthEnabled value for this HostInternetScsiHbaAuthenticationProperties.
     * 
     * @return chapAuthEnabled
     */
    public boolean isChapAuthEnabled() {
        return chapAuthEnabled;
    }


    /**
     * Sets the chapAuthEnabled value for this HostInternetScsiHbaAuthenticationProperties.
     * 
     * @param chapAuthEnabled
     */
    public void setChapAuthEnabled(boolean chapAuthEnabled) {
        this.chapAuthEnabled = chapAuthEnabled;
    }


    /**
     * Gets the chapName value for this HostInternetScsiHbaAuthenticationProperties.
     * 
     * @return chapName
     */
    public java.lang.String getChapName() {
        return chapName;
    }


    /**
     * Sets the chapName value for this HostInternetScsiHbaAuthenticationProperties.
     * 
     * @param chapName
     */
    public void setChapName(java.lang.String chapName) {
        this.chapName = chapName;
    }


    /**
     * Gets the chapSecret value for this HostInternetScsiHbaAuthenticationProperties.
     * 
     * @return chapSecret
     */
    public java.lang.String getChapSecret() {
        return chapSecret;
    }


    /**
     * Sets the chapSecret value for this HostInternetScsiHbaAuthenticationProperties.
     * 
     * @param chapSecret
     */
    public void setChapSecret(java.lang.String chapSecret) {
        this.chapSecret = chapSecret;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostInternetScsiHbaAuthenticationProperties)) return false;
        HostInternetScsiHbaAuthenticationProperties other = (HostInternetScsiHbaAuthenticationProperties) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.chapAuthEnabled == other.isChapAuthEnabled() &&
            ((this.chapName==null && other.getChapName()==null) || 
             (this.chapName!=null &&
              this.chapName.equals(other.getChapName()))) &&
            ((this.chapSecret==null && other.getChapSecret()==null) || 
             (this.chapSecret!=null &&
              this.chapSecret.equals(other.getChapSecret())));
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
        _hashCode += (isChapAuthEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getChapName() != null) {
            _hashCode += getChapName().hashCode();
        }
        if (getChapSecret() != null) {
            _hashCode += getChapSecret().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostInternetScsiHbaAuthenticationProperties.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostInternetScsiHbaAuthenticationProperties"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chapAuthEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "chapAuthEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chapName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "chapName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chapSecret");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "chapSecret"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
