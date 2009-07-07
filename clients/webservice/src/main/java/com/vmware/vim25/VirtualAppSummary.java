/**
 * VirtualAppSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualAppSummary  extends com.vmware.vim25.ResourcePoolSummary  implements java.io.Serializable {
    private com.vmware.vim25.VAppProductInfo product;

    private com.vmware.vim25.VirtualAppVAppState vAppState;

    private java.lang.Boolean installBootRequired;

    public VirtualAppSummary() {
    }

    public VirtualAppSummary(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String name,
           com.vmware.vim25.ResourceConfigSpec config,
           com.vmware.vim25.ResourcePoolRuntimeInfo runtime,
           com.vmware.vim25.ResourcePoolQuickStats quickStats,
           java.lang.Integer configuredMemoryMB,
           com.vmware.vim25.VAppProductInfo product,
           com.vmware.vim25.VirtualAppVAppState vAppState,
           java.lang.Boolean installBootRequired) {
        super(
            dynamicType,
            dynamicProperty,
            name,
            config,
            runtime,
            quickStats,
            configuredMemoryMB);
        this.product = product;
        this.vAppState = vAppState;
        this.installBootRequired = installBootRequired;
    }


    /**
     * Gets the product value for this VirtualAppSummary.
     * 
     * @return product
     */
    public com.vmware.vim25.VAppProductInfo getProduct() {
        return product;
    }


    /**
     * Sets the product value for this VirtualAppSummary.
     * 
     * @param product
     */
    public void setProduct(com.vmware.vim25.VAppProductInfo product) {
        this.product = product;
    }


    /**
     * Gets the vAppState value for this VirtualAppSummary.
     * 
     * @return vAppState
     */
    public com.vmware.vim25.VirtualAppVAppState getVAppState() {
        return vAppState;
    }


    /**
     * Sets the vAppState value for this VirtualAppSummary.
     * 
     * @param vAppState
     */
    public void setVAppState(com.vmware.vim25.VirtualAppVAppState vAppState) {
        this.vAppState = vAppState;
    }


    /**
     * Gets the installBootRequired value for this VirtualAppSummary.
     * 
     * @return installBootRequired
     */
    public java.lang.Boolean getInstallBootRequired() {
        return installBootRequired;
    }


    /**
     * Sets the installBootRequired value for this VirtualAppSummary.
     * 
     * @param installBootRequired
     */
    public void setInstallBootRequired(java.lang.Boolean installBootRequired) {
        this.installBootRequired = installBootRequired;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualAppSummary)) return false;
        VirtualAppSummary other = (VirtualAppSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.vAppState==null && other.getVAppState()==null) || 
             (this.vAppState!=null &&
              this.vAppState.equals(other.getVAppState()))) &&
            ((this.installBootRequired==null && other.getInstallBootRequired()==null) || 
             (this.installBootRequired!=null &&
              this.installBootRequired.equals(other.getInstallBootRequired())));
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
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getVAppState() != null) {
            _hashCode += getVAppState().hashCode();
        }
        if (getInstallBootRequired() != null) {
            _hashCode += getInstallBootRequired().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualAppSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualAppSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "product"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VAppProductInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VAppState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vAppState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualAppVAppState"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("installBootRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "installBootRequired"));
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
