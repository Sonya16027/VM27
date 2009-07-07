/**
 * HostInternetScsiHbaAuthenticationProperties.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostInternetScsiHbaAuthenticationProperties  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private boolean chapAuthEnabled;

    private java.lang.String chapName;

    private java.lang.String chapSecret;

    private java.lang.String chapAuthenticationType;

    private java.lang.Boolean chapInherited;

    private java.lang.String mutualChapName;

    private java.lang.String mutualChapSecret;

    private java.lang.String mutualChapAuthenticationType;

    private java.lang.Boolean mutualChapInherited;

    public HostInternetScsiHbaAuthenticationProperties() {
    }

    public HostInternetScsiHbaAuthenticationProperties(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           boolean chapAuthEnabled,
           java.lang.String chapName,
           java.lang.String chapSecret,
           java.lang.String chapAuthenticationType,
           java.lang.Boolean chapInherited,
           java.lang.String mutualChapName,
           java.lang.String mutualChapSecret,
           java.lang.String mutualChapAuthenticationType,
           java.lang.Boolean mutualChapInherited) {
        super(
            dynamicType,
            dynamicProperty);
        this.chapAuthEnabled = chapAuthEnabled;
        this.chapName = chapName;
        this.chapSecret = chapSecret;
        this.chapAuthenticationType = chapAuthenticationType;
        this.chapInherited = chapInherited;
        this.mutualChapName = mutualChapName;
        this.mutualChapSecret = mutualChapSecret;
        this.mutualChapAuthenticationType = mutualChapAuthenticationType;
        this.mutualChapInherited = mutualChapInherited;
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


    /**
     * Gets the chapAuthenticationType value for this HostInternetScsiHbaAuthenticationProperties.
     * 
     * @return chapAuthenticationType
     */
    public java.lang.String getChapAuthenticationType() {
        return chapAuthenticationType;
    }


    /**
     * Sets the chapAuthenticationType value for this HostInternetScsiHbaAuthenticationProperties.
     * 
     * @param chapAuthenticationType
     */
    public void setChapAuthenticationType(java.lang.String chapAuthenticationType) {
        this.chapAuthenticationType = chapAuthenticationType;
    }


    /**
     * Gets the chapInherited value for this HostInternetScsiHbaAuthenticationProperties.
     * 
     * @return chapInherited
     */
    public java.lang.Boolean getChapInherited() {
        return chapInherited;
    }


    /**
     * Sets the chapInherited value for this HostInternetScsiHbaAuthenticationProperties.
     * 
     * @param chapInherited
     */
    public void setChapInherited(java.lang.Boolean chapInherited) {
        this.chapInherited = chapInherited;
    }


    /**
     * Gets the mutualChapName value for this HostInternetScsiHbaAuthenticationProperties.
     * 
     * @return mutualChapName
     */
    public java.lang.String getMutualChapName() {
        return mutualChapName;
    }


    /**
     * Sets the mutualChapName value for this HostInternetScsiHbaAuthenticationProperties.
     * 
     * @param mutualChapName
     */
    public void setMutualChapName(java.lang.String mutualChapName) {
        this.mutualChapName = mutualChapName;
    }


    /**
     * Gets the mutualChapSecret value for this HostInternetScsiHbaAuthenticationProperties.
     * 
     * @return mutualChapSecret
     */
    public java.lang.String getMutualChapSecret() {
        return mutualChapSecret;
    }


    /**
     * Sets the mutualChapSecret value for this HostInternetScsiHbaAuthenticationProperties.
     * 
     * @param mutualChapSecret
     */
    public void setMutualChapSecret(java.lang.String mutualChapSecret) {
        this.mutualChapSecret = mutualChapSecret;
    }


    /**
     * Gets the mutualChapAuthenticationType value for this HostInternetScsiHbaAuthenticationProperties.
     * 
     * @return mutualChapAuthenticationType
     */
    public java.lang.String getMutualChapAuthenticationType() {
        return mutualChapAuthenticationType;
    }


    /**
     * Sets the mutualChapAuthenticationType value for this HostInternetScsiHbaAuthenticationProperties.
     * 
     * @param mutualChapAuthenticationType
     */
    public void setMutualChapAuthenticationType(java.lang.String mutualChapAuthenticationType) {
        this.mutualChapAuthenticationType = mutualChapAuthenticationType;
    }


    /**
     * Gets the mutualChapInherited value for this HostInternetScsiHbaAuthenticationProperties.
     * 
     * @return mutualChapInherited
     */
    public java.lang.Boolean getMutualChapInherited() {
        return mutualChapInherited;
    }


    /**
     * Sets the mutualChapInherited value for this HostInternetScsiHbaAuthenticationProperties.
     * 
     * @param mutualChapInherited
     */
    public void setMutualChapInherited(java.lang.Boolean mutualChapInherited) {
        this.mutualChapInherited = mutualChapInherited;
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
              this.chapSecret.equals(other.getChapSecret()))) &&
            ((this.chapAuthenticationType==null && other.getChapAuthenticationType()==null) || 
             (this.chapAuthenticationType!=null &&
              this.chapAuthenticationType.equals(other.getChapAuthenticationType()))) &&
            ((this.chapInherited==null && other.getChapInherited()==null) || 
             (this.chapInherited!=null &&
              this.chapInherited.equals(other.getChapInherited()))) &&
            ((this.mutualChapName==null && other.getMutualChapName()==null) || 
             (this.mutualChapName!=null &&
              this.mutualChapName.equals(other.getMutualChapName()))) &&
            ((this.mutualChapSecret==null && other.getMutualChapSecret()==null) || 
             (this.mutualChapSecret!=null &&
              this.mutualChapSecret.equals(other.getMutualChapSecret()))) &&
            ((this.mutualChapAuthenticationType==null && other.getMutualChapAuthenticationType()==null) || 
             (this.mutualChapAuthenticationType!=null &&
              this.mutualChapAuthenticationType.equals(other.getMutualChapAuthenticationType()))) &&
            ((this.mutualChapInherited==null && other.getMutualChapInherited()==null) || 
             (this.mutualChapInherited!=null &&
              this.mutualChapInherited.equals(other.getMutualChapInherited())));
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
        if (getChapAuthenticationType() != null) {
            _hashCode += getChapAuthenticationType().hashCode();
        }
        if (getChapInherited() != null) {
            _hashCode += getChapInherited().hashCode();
        }
        if (getMutualChapName() != null) {
            _hashCode += getMutualChapName().hashCode();
        }
        if (getMutualChapSecret() != null) {
            _hashCode += getMutualChapSecret().hashCode();
        }
        if (getMutualChapAuthenticationType() != null) {
            _hashCode += getMutualChapAuthenticationType().hashCode();
        }
        if (getMutualChapInherited() != null) {
            _hashCode += getMutualChapInherited().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostInternetScsiHbaAuthenticationProperties.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostInternetScsiHbaAuthenticationProperties"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chapAuthEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "chapAuthEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chapName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "chapName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chapSecret");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "chapSecret"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chapAuthenticationType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "chapAuthenticationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chapInherited");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "chapInherited"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mutualChapName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "mutualChapName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mutualChapSecret");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "mutualChapSecret"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mutualChapAuthenticationType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "mutualChapAuthenticationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mutualChapInherited");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "mutualChapInherited"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
