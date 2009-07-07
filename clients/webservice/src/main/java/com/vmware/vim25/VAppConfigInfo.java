/**
 * VAppConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VAppConfigInfo  extends com.vmware.vim25.VmConfigInfo  implements java.io.Serializable {
    private com.vmware.vim25.VAppEntityConfigInfo[] entityConfig;

    private java.lang.String annotation;

    public VAppConfigInfo() {
    }

    public VAppConfigInfo(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.VAppProductInfo[] product,
           com.vmware.vim25.VAppPropertyInfo[] property,
           com.vmware.vim25.VAppIPAssignmentInfo ipAssignment,
           java.lang.String[] eula,
           com.vmware.vim25.VAppOvfSectionInfo[] ovfSection,
           java.lang.String[] ovfEnvironmentTransport,
           boolean installBootRequired,
           int installBootStopDelay,
           com.vmware.vim25.VAppEntityConfigInfo[] entityConfig,
           java.lang.String annotation) {
        super(
            dynamicType,
            dynamicProperty,
            product,
            property,
            ipAssignment,
            eula,
            ovfSection,
            ovfEnvironmentTransport,
            installBootRequired,
            installBootStopDelay);
        this.entityConfig = entityConfig;
        this.annotation = annotation;
    }


    /**
     * Gets the entityConfig value for this VAppConfigInfo.
     * 
     * @return entityConfig
     */
    public com.vmware.vim25.VAppEntityConfigInfo[] getEntityConfig() {
        return entityConfig;
    }


    /**
     * Sets the entityConfig value for this VAppConfigInfo.
     * 
     * @param entityConfig
     */
    public void setEntityConfig(com.vmware.vim25.VAppEntityConfigInfo[] entityConfig) {
        this.entityConfig = entityConfig;
    }

    public com.vmware.vim25.VAppEntityConfigInfo getEntityConfig(int i) {
        return this.entityConfig[i];
    }

    public void setEntityConfig(int i, com.vmware.vim25.VAppEntityConfigInfo _value) {
        this.entityConfig[i] = _value;
    }


    /**
     * Gets the annotation value for this VAppConfigInfo.
     * 
     * @return annotation
     */
    public java.lang.String getAnnotation() {
        return annotation;
    }


    /**
     * Sets the annotation value for this VAppConfigInfo.
     * 
     * @param annotation
     */
    public void setAnnotation(java.lang.String annotation) {
        this.annotation = annotation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VAppConfigInfo)) return false;
        VAppConfigInfo other = (VAppConfigInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.entityConfig==null && other.getEntityConfig()==null) || 
             (this.entityConfig!=null &&
              java.util.Arrays.equals(this.entityConfig, other.getEntityConfig()))) &&
            ((this.annotation==null && other.getAnnotation()==null) || 
             (this.annotation!=null &&
              this.annotation.equals(other.getAnnotation())));
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
        if (getEntityConfig() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntityConfig());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntityConfig(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAnnotation() != null) {
            _hashCode += getAnnotation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VAppConfigInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VAppConfigInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "entityConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VAppEntityConfigInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annotation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "annotation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
