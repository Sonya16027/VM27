/**
 * DistributedVirtualSwitchProductSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class DistributedVirtualSwitchProductSpec  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String vendor;

    private java.lang.String version;

    private java.lang.String build;

    private java.lang.String forwardingClass;

    private java.lang.String bundleId;

    private java.lang.String bundleUrl;

    public DistributedVirtualSwitchProductSpec() {
    }

    public DistributedVirtualSwitchProductSpec(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String name,
           java.lang.String vendor,
           java.lang.String version,
           java.lang.String build,
           java.lang.String forwardingClass,
           java.lang.String bundleId,
           java.lang.String bundleUrl) {
        super(
            dynamicType,
            dynamicProperty);
        this.name = name;
        this.vendor = vendor;
        this.version = version;
        this.build = build;
        this.forwardingClass = forwardingClass;
        this.bundleId = bundleId;
        this.bundleUrl = bundleUrl;
    }


    /**
     * Gets the name value for this DistributedVirtualSwitchProductSpec.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DistributedVirtualSwitchProductSpec.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the vendor value for this DistributedVirtualSwitchProductSpec.
     * 
     * @return vendor
     */
    public java.lang.String getVendor() {
        return vendor;
    }


    /**
     * Sets the vendor value for this DistributedVirtualSwitchProductSpec.
     * 
     * @param vendor
     */
    public void setVendor(java.lang.String vendor) {
        this.vendor = vendor;
    }


    /**
     * Gets the version value for this DistributedVirtualSwitchProductSpec.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this DistributedVirtualSwitchProductSpec.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the build value for this DistributedVirtualSwitchProductSpec.
     * 
     * @return build
     */
    public java.lang.String getBuild() {
        return build;
    }


    /**
     * Sets the build value for this DistributedVirtualSwitchProductSpec.
     * 
     * @param build
     */
    public void setBuild(java.lang.String build) {
        this.build = build;
    }


    /**
     * Gets the forwardingClass value for this DistributedVirtualSwitchProductSpec.
     * 
     * @return forwardingClass
     */
    public java.lang.String getForwardingClass() {
        return forwardingClass;
    }


    /**
     * Sets the forwardingClass value for this DistributedVirtualSwitchProductSpec.
     * 
     * @param forwardingClass
     */
    public void setForwardingClass(java.lang.String forwardingClass) {
        this.forwardingClass = forwardingClass;
    }


    /**
     * Gets the bundleId value for this DistributedVirtualSwitchProductSpec.
     * 
     * @return bundleId
     */
    public java.lang.String getBundleId() {
        return bundleId;
    }


    /**
     * Sets the bundleId value for this DistributedVirtualSwitchProductSpec.
     * 
     * @param bundleId
     */
    public void setBundleId(java.lang.String bundleId) {
        this.bundleId = bundleId;
    }


    /**
     * Gets the bundleUrl value for this DistributedVirtualSwitchProductSpec.
     * 
     * @return bundleUrl
     */
    public java.lang.String getBundleUrl() {
        return bundleUrl;
    }


    /**
     * Sets the bundleUrl value for this DistributedVirtualSwitchProductSpec.
     * 
     * @param bundleUrl
     */
    public void setBundleUrl(java.lang.String bundleUrl) {
        this.bundleUrl = bundleUrl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DistributedVirtualSwitchProductSpec)) return false;
        DistributedVirtualSwitchProductSpec other = (DistributedVirtualSwitchProductSpec) obj;
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
            ((this.vendor==null && other.getVendor()==null) || 
             (this.vendor!=null &&
              this.vendor.equals(other.getVendor()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.build==null && other.getBuild()==null) || 
             (this.build!=null &&
              this.build.equals(other.getBuild()))) &&
            ((this.forwardingClass==null && other.getForwardingClass()==null) || 
             (this.forwardingClass!=null &&
              this.forwardingClass.equals(other.getForwardingClass()))) &&
            ((this.bundleId==null && other.getBundleId()==null) || 
             (this.bundleId!=null &&
              this.bundleId.equals(other.getBundleId()))) &&
            ((this.bundleUrl==null && other.getBundleUrl()==null) || 
             (this.bundleUrl!=null &&
              this.bundleUrl.equals(other.getBundleUrl())));
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
        if (getVendor() != null) {
            _hashCode += getVendor().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getBuild() != null) {
            _hashCode += getBuild().hashCode();
        }
        if (getForwardingClass() != null) {
            _hashCode += getForwardingClass().hashCode();
        }
        if (getBundleId() != null) {
            _hashCode += getBundleId().hashCode();
        }
        if (getBundleUrl() != null) {
            _hashCode += getBundleUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DistributedVirtualSwitchProductSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchProductSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("build");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "build"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forwardingClass");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "forwardingClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bundleId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "bundleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bundleUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "bundleUrl"));
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
