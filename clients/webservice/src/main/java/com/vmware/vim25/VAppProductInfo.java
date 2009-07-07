/**
 * VAppProductInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VAppProductInfo  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private int key;

    private java.lang.String classId;

    private java.lang.String instanceId;

    private java.lang.String name;

    private java.lang.String vendor;

    private java.lang.String version;

    private java.lang.String fullVersion;

    private java.lang.String vendorUrl;

    private java.lang.String productUrl;

    private java.lang.String appUrl;

    public VAppProductInfo() {
    }

    public VAppProductInfo(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           int key,
           java.lang.String classId,
           java.lang.String instanceId,
           java.lang.String name,
           java.lang.String vendor,
           java.lang.String version,
           java.lang.String fullVersion,
           java.lang.String vendorUrl,
           java.lang.String productUrl,
           java.lang.String appUrl) {
        super(
            dynamicType,
            dynamicProperty);
        this.key = key;
        this.classId = classId;
        this.instanceId = instanceId;
        this.name = name;
        this.vendor = vendor;
        this.version = version;
        this.fullVersion = fullVersion;
        this.vendorUrl = vendorUrl;
        this.productUrl = productUrl;
        this.appUrl = appUrl;
    }


    /**
     * Gets the key value for this VAppProductInfo.
     * 
     * @return key
     */
    public int getKey() {
        return key;
    }


    /**
     * Sets the key value for this VAppProductInfo.
     * 
     * @param key
     */
    public void setKey(int key) {
        this.key = key;
    }


    /**
     * Gets the classId value for this VAppProductInfo.
     * 
     * @return classId
     */
    public java.lang.String getClassId() {
        return classId;
    }


    /**
     * Sets the classId value for this VAppProductInfo.
     * 
     * @param classId
     */
    public void setClassId(java.lang.String classId) {
        this.classId = classId;
    }


    /**
     * Gets the instanceId value for this VAppProductInfo.
     * 
     * @return instanceId
     */
    public java.lang.String getInstanceId() {
        return instanceId;
    }


    /**
     * Sets the instanceId value for this VAppProductInfo.
     * 
     * @param instanceId
     */
    public void setInstanceId(java.lang.String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * Gets the name value for this VAppProductInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this VAppProductInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the vendor value for this VAppProductInfo.
     * 
     * @return vendor
     */
    public java.lang.String getVendor() {
        return vendor;
    }


    /**
     * Sets the vendor value for this VAppProductInfo.
     * 
     * @param vendor
     */
    public void setVendor(java.lang.String vendor) {
        this.vendor = vendor;
    }


    /**
     * Gets the version value for this VAppProductInfo.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this VAppProductInfo.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the fullVersion value for this VAppProductInfo.
     * 
     * @return fullVersion
     */
    public java.lang.String getFullVersion() {
        return fullVersion;
    }


    /**
     * Sets the fullVersion value for this VAppProductInfo.
     * 
     * @param fullVersion
     */
    public void setFullVersion(java.lang.String fullVersion) {
        this.fullVersion = fullVersion;
    }


    /**
     * Gets the vendorUrl value for this VAppProductInfo.
     * 
     * @return vendorUrl
     */
    public java.lang.String getVendorUrl() {
        return vendorUrl;
    }


    /**
     * Sets the vendorUrl value for this VAppProductInfo.
     * 
     * @param vendorUrl
     */
    public void setVendorUrl(java.lang.String vendorUrl) {
        this.vendorUrl = vendorUrl;
    }


    /**
     * Gets the productUrl value for this VAppProductInfo.
     * 
     * @return productUrl
     */
    public java.lang.String getProductUrl() {
        return productUrl;
    }


    /**
     * Sets the productUrl value for this VAppProductInfo.
     * 
     * @param productUrl
     */
    public void setProductUrl(java.lang.String productUrl) {
        this.productUrl = productUrl;
    }


    /**
     * Gets the appUrl value for this VAppProductInfo.
     * 
     * @return appUrl
     */
    public java.lang.String getAppUrl() {
        return appUrl;
    }


    /**
     * Sets the appUrl value for this VAppProductInfo.
     * 
     * @param appUrl
     */
    public void setAppUrl(java.lang.String appUrl) {
        this.appUrl = appUrl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VAppProductInfo)) return false;
        VAppProductInfo other = (VAppProductInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.key == other.getKey() &&
            ((this.classId==null && other.getClassId()==null) || 
             (this.classId!=null &&
              this.classId.equals(other.getClassId()))) &&
            ((this.instanceId==null && other.getInstanceId()==null) || 
             (this.instanceId!=null &&
              this.instanceId.equals(other.getInstanceId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.vendor==null && other.getVendor()==null) || 
             (this.vendor!=null &&
              this.vendor.equals(other.getVendor()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.fullVersion==null && other.getFullVersion()==null) || 
             (this.fullVersion!=null &&
              this.fullVersion.equals(other.getFullVersion()))) &&
            ((this.vendorUrl==null && other.getVendorUrl()==null) || 
             (this.vendorUrl!=null &&
              this.vendorUrl.equals(other.getVendorUrl()))) &&
            ((this.productUrl==null && other.getProductUrl()==null) || 
             (this.productUrl!=null &&
              this.productUrl.equals(other.getProductUrl()))) &&
            ((this.appUrl==null && other.getAppUrl()==null) || 
             (this.appUrl!=null &&
              this.appUrl.equals(other.getAppUrl())));
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
        _hashCode += getKey();
        if (getClassId() != null) {
            _hashCode += getClassId().hashCode();
        }
        if (getInstanceId() != null) {
            _hashCode += getInstanceId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getVendor() != null) {
            _hashCode += getVendor().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getFullVersion() != null) {
            _hashCode += getFullVersion().hashCode();
        }
        if (getVendorUrl() != null) {
            _hashCode += getVendorUrl().hashCode();
        }
        if (getProductUrl() != null) {
            _hashCode += getProductUrl().hashCode();
        }
        if (getAppUrl() != null) {
            _hashCode += getAppUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VAppProductInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VAppProductInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "classId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instanceId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "instanceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vendor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "fullVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vendorUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "productUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "appUrl"));
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
