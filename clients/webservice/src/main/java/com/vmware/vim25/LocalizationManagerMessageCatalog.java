/**
 * LocalizationManagerMessageCatalog.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class LocalizationManagerMessageCatalog  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.String moduleName;

    private java.lang.String catalogName;

    private java.lang.String locale;

    private java.lang.String catalogUri;

    private java.util.Calendar lastModified;

    private java.lang.String md5Sum;

    public LocalizationManagerMessageCatalog() {
    }

    public LocalizationManagerMessageCatalog(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String moduleName,
           java.lang.String catalogName,
           java.lang.String locale,
           java.lang.String catalogUri,
           java.util.Calendar lastModified,
           java.lang.String md5Sum) {
        super(
            dynamicType,
            dynamicProperty);
        this.moduleName = moduleName;
        this.catalogName = catalogName;
        this.locale = locale;
        this.catalogUri = catalogUri;
        this.lastModified = lastModified;
        this.md5Sum = md5Sum;
    }


    /**
     * Gets the moduleName value for this LocalizationManagerMessageCatalog.
     * 
     * @return moduleName
     */
    public java.lang.String getModuleName() {
        return moduleName;
    }


    /**
     * Sets the moduleName value for this LocalizationManagerMessageCatalog.
     * 
     * @param moduleName
     */
    public void setModuleName(java.lang.String moduleName) {
        this.moduleName = moduleName;
    }


    /**
     * Gets the catalogName value for this LocalizationManagerMessageCatalog.
     * 
     * @return catalogName
     */
    public java.lang.String getCatalogName() {
        return catalogName;
    }


    /**
     * Sets the catalogName value for this LocalizationManagerMessageCatalog.
     * 
     * @param catalogName
     */
    public void setCatalogName(java.lang.String catalogName) {
        this.catalogName = catalogName;
    }


    /**
     * Gets the locale value for this LocalizationManagerMessageCatalog.
     * 
     * @return locale
     */
    public java.lang.String getLocale() {
        return locale;
    }


    /**
     * Sets the locale value for this LocalizationManagerMessageCatalog.
     * 
     * @param locale
     */
    public void setLocale(java.lang.String locale) {
        this.locale = locale;
    }


    /**
     * Gets the catalogUri value for this LocalizationManagerMessageCatalog.
     * 
     * @return catalogUri
     */
    public java.lang.String getCatalogUri() {
        return catalogUri;
    }


    /**
     * Sets the catalogUri value for this LocalizationManagerMessageCatalog.
     * 
     * @param catalogUri
     */
    public void setCatalogUri(java.lang.String catalogUri) {
        this.catalogUri = catalogUri;
    }


    /**
     * Gets the lastModified value for this LocalizationManagerMessageCatalog.
     * 
     * @return lastModified
     */
    public java.util.Calendar getLastModified() {
        return lastModified;
    }


    /**
     * Sets the lastModified value for this LocalizationManagerMessageCatalog.
     * 
     * @param lastModified
     */
    public void setLastModified(java.util.Calendar lastModified) {
        this.lastModified = lastModified;
    }


    /**
     * Gets the md5Sum value for this LocalizationManagerMessageCatalog.
     * 
     * @return md5Sum
     */
    public java.lang.String getMd5Sum() {
        return md5Sum;
    }


    /**
     * Sets the md5Sum value for this LocalizationManagerMessageCatalog.
     * 
     * @param md5Sum
     */
    public void setMd5Sum(java.lang.String md5Sum) {
        this.md5Sum = md5Sum;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocalizationManagerMessageCatalog)) return false;
        LocalizationManagerMessageCatalog other = (LocalizationManagerMessageCatalog) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.moduleName==null && other.getModuleName()==null) || 
             (this.moduleName!=null &&
              this.moduleName.equals(other.getModuleName()))) &&
            ((this.catalogName==null && other.getCatalogName()==null) || 
             (this.catalogName!=null &&
              this.catalogName.equals(other.getCatalogName()))) &&
            ((this.locale==null && other.getLocale()==null) || 
             (this.locale!=null &&
              this.locale.equals(other.getLocale()))) &&
            ((this.catalogUri==null && other.getCatalogUri()==null) || 
             (this.catalogUri!=null &&
              this.catalogUri.equals(other.getCatalogUri()))) &&
            ((this.lastModified==null && other.getLastModified()==null) || 
             (this.lastModified!=null &&
              this.lastModified.equals(other.getLastModified()))) &&
            ((this.md5Sum==null && other.getMd5Sum()==null) || 
             (this.md5Sum!=null &&
              this.md5Sum.equals(other.getMd5Sum())));
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
        if (getModuleName() != null) {
            _hashCode += getModuleName().hashCode();
        }
        if (getCatalogName() != null) {
            _hashCode += getCatalogName().hashCode();
        }
        if (getLocale() != null) {
            _hashCode += getLocale().hashCode();
        }
        if (getCatalogUri() != null) {
            _hashCode += getCatalogUri().hashCode();
        }
        if (getLastModified() != null) {
            _hashCode += getLastModified().hashCode();
        }
        if (getMd5Sum() != null) {
            _hashCode += getMd5Sum().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocalizationManagerMessageCatalog.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LocalizationManagerMessageCatalog"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moduleName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "moduleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catalogName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "catalogName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locale");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "locale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catalogUri");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "catalogUri"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModified");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "lastModified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("md5Sum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "md5sum"));
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
