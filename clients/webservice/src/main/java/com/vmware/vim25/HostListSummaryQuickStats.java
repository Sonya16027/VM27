/**
 * HostListSummaryQuickStats.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostListSummaryQuickStats  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.Integer overallCpuUsage;

    private java.lang.Integer overallMemoryUsage;

    private java.lang.Integer distributedCpuFairness;

    private java.lang.Integer distributedMemoryFairness;

    public HostListSummaryQuickStats() {
    }

    public HostListSummaryQuickStats(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.Integer overallCpuUsage,
           java.lang.Integer overallMemoryUsage,
           java.lang.Integer distributedCpuFairness,
           java.lang.Integer distributedMemoryFairness) {
        super(
            dynamicType,
            dynamicProperty);
        this.overallCpuUsage = overallCpuUsage;
        this.overallMemoryUsage = overallMemoryUsage;
        this.distributedCpuFairness = distributedCpuFairness;
        this.distributedMemoryFairness = distributedMemoryFairness;
    }


    /**
     * Gets the overallCpuUsage value for this HostListSummaryQuickStats.
     * 
     * @return overallCpuUsage
     */
    public java.lang.Integer getOverallCpuUsage() {
        return overallCpuUsage;
    }


    /**
     * Sets the overallCpuUsage value for this HostListSummaryQuickStats.
     * 
     * @param overallCpuUsage
     */
    public void setOverallCpuUsage(java.lang.Integer overallCpuUsage) {
        this.overallCpuUsage = overallCpuUsage;
    }


    /**
     * Gets the overallMemoryUsage value for this HostListSummaryQuickStats.
     * 
     * @return overallMemoryUsage
     */
    public java.lang.Integer getOverallMemoryUsage() {
        return overallMemoryUsage;
    }


    /**
     * Sets the overallMemoryUsage value for this HostListSummaryQuickStats.
     * 
     * @param overallMemoryUsage
     */
    public void setOverallMemoryUsage(java.lang.Integer overallMemoryUsage) {
        this.overallMemoryUsage = overallMemoryUsage;
    }


    /**
     * Gets the distributedCpuFairness value for this HostListSummaryQuickStats.
     * 
     * @return distributedCpuFairness
     */
    public java.lang.Integer getDistributedCpuFairness() {
        return distributedCpuFairness;
    }


    /**
     * Sets the distributedCpuFairness value for this HostListSummaryQuickStats.
     * 
     * @param distributedCpuFairness
     */
    public void setDistributedCpuFairness(java.lang.Integer distributedCpuFairness) {
        this.distributedCpuFairness = distributedCpuFairness;
    }


    /**
     * Gets the distributedMemoryFairness value for this HostListSummaryQuickStats.
     * 
     * @return distributedMemoryFairness
     */
    public java.lang.Integer getDistributedMemoryFairness() {
        return distributedMemoryFairness;
    }


    /**
     * Sets the distributedMemoryFairness value for this HostListSummaryQuickStats.
     * 
     * @param distributedMemoryFairness
     */
    public void setDistributedMemoryFairness(java.lang.Integer distributedMemoryFairness) {
        this.distributedMemoryFairness = distributedMemoryFairness;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostListSummaryQuickStats)) return false;
        HostListSummaryQuickStats other = (HostListSummaryQuickStats) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.overallCpuUsage==null && other.getOverallCpuUsage()==null) || 
             (this.overallCpuUsage!=null &&
              this.overallCpuUsage.equals(other.getOverallCpuUsage()))) &&
            ((this.overallMemoryUsage==null && other.getOverallMemoryUsage()==null) || 
             (this.overallMemoryUsage!=null &&
              this.overallMemoryUsage.equals(other.getOverallMemoryUsage()))) &&
            ((this.distributedCpuFairness==null && other.getDistributedCpuFairness()==null) || 
             (this.distributedCpuFairness!=null &&
              this.distributedCpuFairness.equals(other.getDistributedCpuFairness()))) &&
            ((this.distributedMemoryFairness==null && other.getDistributedMemoryFairness()==null) || 
             (this.distributedMemoryFairness!=null &&
              this.distributedMemoryFairness.equals(other.getDistributedMemoryFairness())));
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
        if (getOverallCpuUsage() != null) {
            _hashCode += getOverallCpuUsage().hashCode();
        }
        if (getOverallMemoryUsage() != null) {
            _hashCode += getOverallMemoryUsage().hashCode();
        }
        if (getDistributedCpuFairness() != null) {
            _hashCode += getDistributedCpuFairness().hashCode();
        }
        if (getDistributedMemoryFairness() != null) {
            _hashCode += getDistributedMemoryFairness().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostListSummaryQuickStats.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostListSummaryQuickStats"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overallCpuUsage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "overallCpuUsage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overallMemoryUsage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "overallMemoryUsage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distributedCpuFairness");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "distributedCpuFairness"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distributedMemoryFairness");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "distributedMemoryFairness"));
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
