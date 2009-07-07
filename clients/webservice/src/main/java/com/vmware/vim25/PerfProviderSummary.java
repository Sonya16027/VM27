/**
 * PerfProviderSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class PerfProviderSummary  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private com.vmware.vim25.ManagedObjectReference entity;

    private boolean currentSupported;

    private boolean summarySupported;

    private java.lang.Integer refreshRate;

    public PerfProviderSummary() {
    }

    public PerfProviderSummary(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.ManagedObjectReference entity,
           boolean currentSupported,
           boolean summarySupported,
           java.lang.Integer refreshRate) {
        super(
            dynamicType,
            dynamicProperty);
        this.entity = entity;
        this.currentSupported = currentSupported;
        this.summarySupported = summarySupported;
        this.refreshRate = refreshRate;
    }


    /**
     * Gets the entity value for this PerfProviderSummary.
     * 
     * @return entity
     */
    public com.vmware.vim25.ManagedObjectReference getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this PerfProviderSummary.
     * 
     * @param entity
     */
    public void setEntity(com.vmware.vim25.ManagedObjectReference entity) {
        this.entity = entity;
    }


    /**
     * Gets the currentSupported value for this PerfProviderSummary.
     * 
     * @return currentSupported
     */
    public boolean isCurrentSupported() {
        return currentSupported;
    }


    /**
     * Sets the currentSupported value for this PerfProviderSummary.
     * 
     * @param currentSupported
     */
    public void setCurrentSupported(boolean currentSupported) {
        this.currentSupported = currentSupported;
    }


    /**
     * Gets the summarySupported value for this PerfProviderSummary.
     * 
     * @return summarySupported
     */
    public boolean isSummarySupported() {
        return summarySupported;
    }


    /**
     * Sets the summarySupported value for this PerfProviderSummary.
     * 
     * @param summarySupported
     */
    public void setSummarySupported(boolean summarySupported) {
        this.summarySupported = summarySupported;
    }


    /**
     * Gets the refreshRate value for this PerfProviderSummary.
     * 
     * @return refreshRate
     */
    public java.lang.Integer getRefreshRate() {
        return refreshRate;
    }


    /**
     * Sets the refreshRate value for this PerfProviderSummary.
     * 
     * @param refreshRate
     */
    public void setRefreshRate(java.lang.Integer refreshRate) {
        this.refreshRate = refreshRate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PerfProviderSummary)) return false;
        PerfProviderSummary other = (PerfProviderSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.entity==null && other.getEntity()==null) || 
             (this.entity!=null &&
              this.entity.equals(other.getEntity()))) &&
            this.currentSupported == other.isCurrentSupported() &&
            this.summarySupported == other.isSummarySupported() &&
            ((this.refreshRate==null && other.getRefreshRate()==null) || 
             (this.refreshRate!=null &&
              this.refreshRate.equals(other.getRefreshRate())));
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
        if (getEntity() != null) {
            _hashCode += getEntity().hashCode();
        }
        _hashCode += (isCurrentSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSummarySupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRefreshRate() != null) {
            _hashCode += getRefreshRate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PerfProviderSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PerfProviderSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "currentSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summarySupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "summarySupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refreshRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "refreshRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
