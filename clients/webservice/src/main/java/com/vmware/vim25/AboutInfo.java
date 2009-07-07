/**
 * AboutInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class AboutInfo  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String fullName;

    private java.lang.String vendor;

    private java.lang.String version;

    private java.lang.String build;

    private java.lang.String localeVersion;

    private java.lang.String localeBuild;

    private java.lang.String osType;

    private java.lang.String productLineId;

    private java.lang.String apiType;

    private java.lang.String apiVersion;

    private java.lang.String instanceUuid;

    private java.lang.String licenseProductName;

    private java.lang.String licenseProductVersion;

    public AboutInfo() {
    }

    public AboutInfo(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String name,
           java.lang.String fullName,
           java.lang.String vendor,
           java.lang.String version,
           java.lang.String build,
           java.lang.String localeVersion,
           java.lang.String localeBuild,
           java.lang.String osType,
           java.lang.String productLineId,
           java.lang.String apiType,
           java.lang.String apiVersion,
           java.lang.String instanceUuid,
           java.lang.String licenseProductName,
           java.lang.String licenseProductVersion) {
        super(
            dynamicType,
            dynamicProperty);
        this.name = name;
        this.fullName = fullName;
        this.vendor = vendor;
        this.version = version;
        this.build = build;
        this.localeVersion = localeVersion;
        this.localeBuild = localeBuild;
        this.osType = osType;
        this.productLineId = productLineId;
        this.apiType = apiType;
        this.apiVersion = apiVersion;
        this.instanceUuid = instanceUuid;
        this.licenseProductName = licenseProductName;
        this.licenseProductVersion = licenseProductVersion;
    }


    /**
     * Gets the name value for this AboutInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this AboutInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the fullName value for this AboutInfo.
     * 
     * @return fullName
     */
    public java.lang.String getFullName() {
        return fullName;
    }


    /**
     * Sets the fullName value for this AboutInfo.
     * 
     * @param fullName
     */
    public void setFullName(java.lang.String fullName) {
        this.fullName = fullName;
    }


    /**
     * Gets the vendor value for this AboutInfo.
     * 
     * @return vendor
     */
    public java.lang.String getVendor() {
        return vendor;
    }


    /**
     * Sets the vendor value for this AboutInfo.
     * 
     * @param vendor
     */
    public void setVendor(java.lang.String vendor) {
        this.vendor = vendor;
    }


    /**
     * Gets the version value for this AboutInfo.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this AboutInfo.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the build value for this AboutInfo.
     * 
     * @return build
     */
    public java.lang.String getBuild() {
        return build;
    }


    /**
     * Sets the build value for this AboutInfo.
     * 
     * @param build
     */
    public void setBuild(java.lang.String build) {
        this.build = build;
    }


    /**
     * Gets the localeVersion value for this AboutInfo.
     * 
     * @return localeVersion
     */
    public java.lang.String getLocaleVersion() {
        return localeVersion;
    }


    /**
     * Sets the localeVersion value for this AboutInfo.
     * 
     * @param localeVersion
     */
    public void setLocaleVersion(java.lang.String localeVersion) {
        this.localeVersion = localeVersion;
    }


    /**
     * Gets the localeBuild value for this AboutInfo.
     * 
     * @return localeBuild
     */
    public java.lang.String getLocaleBuild() {
        return localeBuild;
    }


    /**
     * Sets the localeBuild value for this AboutInfo.
     * 
     * @param localeBuild
     */
    public void setLocaleBuild(java.lang.String localeBuild) {
        this.localeBuild = localeBuild;
    }


    /**
     * Gets the osType value for this AboutInfo.
     * 
     * @return osType
     */
    public java.lang.String getOsType() {
        return osType;
    }


    /**
     * Sets the osType value for this AboutInfo.
     * 
     * @param osType
     */
    public void setOsType(java.lang.String osType) {
        this.osType = osType;
    }


    /**
     * Gets the productLineId value for this AboutInfo.
     * 
     * @return productLineId
     */
    public java.lang.String getProductLineId() {
        return productLineId;
    }


    /**
     * Sets the productLineId value for this AboutInfo.
     * 
     * @param productLineId
     */
    public void setProductLineId(java.lang.String productLineId) {
        this.productLineId = productLineId;
    }


    /**
     * Gets the apiType value for this AboutInfo.
     * 
     * @return apiType
     */
    public java.lang.String getApiType() {
        return apiType;
    }


    /**
     * Sets the apiType value for this AboutInfo.
     * 
     * @param apiType
     */
    public void setApiType(java.lang.String apiType) {
        this.apiType = apiType;
    }


    /**
     * Gets the apiVersion value for this AboutInfo.
     * 
     * @return apiVersion
     */
    public java.lang.String getApiVersion() {
        return apiVersion;
    }


    /**
     * Sets the apiVersion value for this AboutInfo.
     * 
     * @param apiVersion
     */
    public void setApiVersion(java.lang.String apiVersion) {
        this.apiVersion = apiVersion;
    }


    /**
     * Gets the instanceUuid value for this AboutInfo.
     * 
     * @return instanceUuid
     */
    public java.lang.String getInstanceUuid() {
        return instanceUuid;
    }


    /**
     * Sets the instanceUuid value for this AboutInfo.
     * 
     * @param instanceUuid
     */
    public void setInstanceUuid(java.lang.String instanceUuid) {
        this.instanceUuid = instanceUuid;
    }


    /**
     * Gets the licenseProductName value for this AboutInfo.
     * 
     * @return licenseProductName
     */
    public java.lang.String getLicenseProductName() {
        return licenseProductName;
    }


    /**
     * Sets the licenseProductName value for this AboutInfo.
     * 
     * @param licenseProductName
     */
    public void setLicenseProductName(java.lang.String licenseProductName) {
        this.licenseProductName = licenseProductName;
    }


    /**
     * Gets the licenseProductVersion value for this AboutInfo.
     * 
     * @return licenseProductVersion
     */
    public java.lang.String getLicenseProductVersion() {
        return licenseProductVersion;
    }


    /**
     * Sets the licenseProductVersion value for this AboutInfo.
     * 
     * @param licenseProductVersion
     */
    public void setLicenseProductVersion(java.lang.String licenseProductVersion) {
        this.licenseProductVersion = licenseProductVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AboutInfo)) return false;
        AboutInfo other = (AboutInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.fullName==null && other.getFullName()==null) || 
             (this.fullName!=null &&
              this.fullName.equals(other.getFullName()))) &&
            ((this.vendor==null && other.getVendor()==null) || 
             (this.vendor!=null &&
              this.vendor.equals(other.getVendor()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.build==null && other.getBuild()==null) || 
             (this.build!=null &&
              this.build.equals(other.getBuild()))) &&
            ((this.localeVersion==null && other.getLocaleVersion()==null) || 
             (this.localeVersion!=null &&
              this.localeVersion.equals(other.getLocaleVersion()))) &&
            ((this.localeBuild==null && other.getLocaleBuild()==null) || 
             (this.localeBuild!=null &&
              this.localeBuild.equals(other.getLocaleBuild()))) &&
            ((this.osType==null && other.getOsType()==null) || 
             (this.osType!=null &&
              this.osType.equals(other.getOsType()))) &&
            ((this.productLineId==null && other.getProductLineId()==null) || 
             (this.productLineId!=null &&
              this.productLineId.equals(other.getProductLineId()))) &&
            ((this.apiType==null && other.getApiType()==null) || 
             (this.apiType!=null &&
              this.apiType.equals(other.getApiType()))) &&
            ((this.apiVersion==null && other.getApiVersion()==null) || 
             (this.apiVersion!=null &&
              this.apiVersion.equals(other.getApiVersion()))) &&
            ((this.instanceUuid==null && other.getInstanceUuid()==null) || 
             (this.instanceUuid!=null &&
              this.instanceUuid.equals(other.getInstanceUuid()))) &&
            ((this.licenseProductName==null && other.getLicenseProductName()==null) || 
             (this.licenseProductName!=null &&
              this.licenseProductName.equals(other.getLicenseProductName()))) &&
            ((this.licenseProductVersion==null && other.getLicenseProductVersion()==null) || 
             (this.licenseProductVersion!=null &&
              this.licenseProductVersion.equals(other.getLicenseProductVersion())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getFullName() != null) {
            _hashCode += getFullName().hashCode();
        }
        if (getVendor() != null) {
            _hashCode += getVendor().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getBuild() != null) {
            _hashCode += getBuild().hashCode();
        }
        if (getLocaleVersion() != null) {
            _hashCode += getLocaleVersion().hashCode();
        }
        if (getLocaleBuild() != null) {
            _hashCode += getLocaleBuild().hashCode();
        }
        if (getOsType() != null) {
            _hashCode += getOsType().hashCode();
        }
        if (getProductLineId() != null) {
            _hashCode += getProductLineId().hashCode();
        }
        if (getApiType() != null) {
            _hashCode += getApiType().hashCode();
        }
        if (getApiVersion() != null) {
            _hashCode += getApiVersion().hashCode();
        }
        if (getInstanceUuid() != null) {
            _hashCode += getInstanceUuid().hashCode();
        }
        if (getLicenseProductName() != null) {
            _hashCode += getLicenseProductName().hashCode();
        }
        if (getLicenseProductVersion() != null) {
            _hashCode += getLicenseProductVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AboutInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "AboutInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "fullName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vendor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("build");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "build"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localeVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "localeVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localeBuild");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "localeBuild"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("osType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "osType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productLineId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "productLineId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apiType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "apiType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apiVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "apiVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instanceUuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "instanceUuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseProductName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "licenseProductName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseProductVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "licenseProductVersion"));
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
