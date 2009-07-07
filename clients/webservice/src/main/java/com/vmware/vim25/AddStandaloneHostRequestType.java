/**
 * AddStandaloneHostRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class AddStandaloneHostRequestType  implements java.io.Serializable {
    private com.vmware.vim25.ManagedObjectReference _this;

    private com.vmware.vim25.HostConnectSpec spec;

    private com.vmware.vim25.ComputeResourceConfigSpec compResSpec;

    private boolean addConnected;

    private java.lang.String license;

    public AddStandaloneHostRequestType() {
    }

    public AddStandaloneHostRequestType(
           com.vmware.vim25.ManagedObjectReference _this,
           com.vmware.vim25.HostConnectSpec spec,
           com.vmware.vim25.ComputeResourceConfigSpec compResSpec,
           boolean addConnected,
           java.lang.String license) {
           this._this = _this;
           this.spec = spec;
           this.compResSpec = compResSpec;
           this.addConnected = addConnected;
           this.license = license;
    }


    /**
     * Gets the _this value for this AddStandaloneHostRequestType.
     * 
     * @return _this
     */
    public com.vmware.vim25.ManagedObjectReference get_this() {
        return _this;
    }


    /**
     * Sets the _this value for this AddStandaloneHostRequestType.
     * 
     * @param _this
     */
    public void set_this(com.vmware.vim25.ManagedObjectReference _this) {
        this._this = _this;
    }


    /**
     * Gets the spec value for this AddStandaloneHostRequestType.
     * 
     * @return spec
     */
    public com.vmware.vim25.HostConnectSpec getSpec() {
        return spec;
    }


    /**
     * Sets the spec value for this AddStandaloneHostRequestType.
     * 
     * @param spec
     */
    public void setSpec(com.vmware.vim25.HostConnectSpec spec) {
        this.spec = spec;
    }


    /**
     * Gets the compResSpec value for this AddStandaloneHostRequestType.
     * 
     * @return compResSpec
     */
    public com.vmware.vim25.ComputeResourceConfigSpec getCompResSpec() {
        return compResSpec;
    }


    /**
     * Sets the compResSpec value for this AddStandaloneHostRequestType.
     * 
     * @param compResSpec
     */
    public void setCompResSpec(com.vmware.vim25.ComputeResourceConfigSpec compResSpec) {
        this.compResSpec = compResSpec;
    }


    /**
     * Gets the addConnected value for this AddStandaloneHostRequestType.
     * 
     * @return addConnected
     */
    public boolean isAddConnected() {
        return addConnected;
    }


    /**
     * Sets the addConnected value for this AddStandaloneHostRequestType.
     * 
     * @param addConnected
     */
    public void setAddConnected(boolean addConnected) {
        this.addConnected = addConnected;
    }


    /**
     * Gets the license value for this AddStandaloneHostRequestType.
     * 
     * @return license
     */
    public java.lang.String getLicense() {
        return license;
    }


    /**
     * Sets the license value for this AddStandaloneHostRequestType.
     * 
     * @param license
     */
    public void setLicense(java.lang.String license) {
        this.license = license;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddStandaloneHostRequestType)) return false;
        AddStandaloneHostRequestType other = (AddStandaloneHostRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._this==null && other.get_this()==null) || 
             (this._this!=null &&
              this._this.equals(other.get_this()))) &&
            ((this.spec==null && other.getSpec()==null) || 
             (this.spec!=null &&
              this.spec.equals(other.getSpec()))) &&
            ((this.compResSpec==null && other.getCompResSpec()==null) || 
             (this.compResSpec!=null &&
              this.compResSpec.equals(other.getCompResSpec()))) &&
            this.addConnected == other.isAddConnected() &&
            ((this.license==null && other.getLicense()==null) || 
             (this.license!=null &&
              this.license.equals(other.getLicense())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (get_this() != null) {
            _hashCode += get_this().hashCode();
        }
        if (getSpec() != null) {
            _hashCode += getSpec().hashCode();
        }
        if (getCompResSpec() != null) {
            _hashCode += getCompResSpec().hashCode();
        }
        _hashCode += (isAddConnected() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getLicense() != null) {
            _hashCode += getLicense().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddStandaloneHostRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "AddStandaloneHostRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_this");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "_this"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "spec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostConnectSpec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compResSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "compResSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ComputeResourceConfigSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addConnected");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "addConnected"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("license");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "license"));
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
