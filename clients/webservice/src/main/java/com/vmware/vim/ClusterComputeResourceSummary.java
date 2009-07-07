/**
 * ClusterComputeResourceSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ClusterComputeResourceSummary  extends com.vmware.vim.ComputeResourceSummary  implements java.io.Serializable {
    private int currentFailoverLevel;

    private int numVmotions;

    public ClusterComputeResourceSummary() {
    }

    public ClusterComputeResourceSummary(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           int totalCpu,
           long totalMemory,
           short numCpuCores,
           short numCpuThreads,
           int effectiveCpu,
           long effectiveMemory,
           int numHosts,
           int numEffectiveHosts,
           com.vmware.vim.ManagedEntityStatus overallStatus,
           int currentFailoverLevel,
           int numVmotions) {
        super(
            dynamicType,
            dynamicProperty,
            totalCpu,
            totalMemory,
            numCpuCores,
            numCpuThreads,
            effectiveCpu,
            effectiveMemory,
            numHosts,
            numEffectiveHosts,
            overallStatus);
        this.currentFailoverLevel = currentFailoverLevel;
        this.numVmotions = numVmotions;
    }


    /**
     * Gets the currentFailoverLevel value for this ClusterComputeResourceSummary.
     * 
     * @return currentFailoverLevel
     */
    public int getCurrentFailoverLevel() {
        return currentFailoverLevel;
    }


    /**
     * Sets the currentFailoverLevel value for this ClusterComputeResourceSummary.
     * 
     * @param currentFailoverLevel
     */
    public void setCurrentFailoverLevel(int currentFailoverLevel) {
        this.currentFailoverLevel = currentFailoverLevel;
    }


    /**
     * Gets the numVmotions value for this ClusterComputeResourceSummary.
     * 
     * @return numVmotions
     */
    public int getNumVmotions() {
        return numVmotions;
    }


    /**
     * Sets the numVmotions value for this ClusterComputeResourceSummary.
     * 
     * @param numVmotions
     */
    public void setNumVmotions(int numVmotions) {
        this.numVmotions = numVmotions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClusterComputeResourceSummary)) return false;
        ClusterComputeResourceSummary other = (ClusterComputeResourceSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.currentFailoverLevel == other.getCurrentFailoverLevel() &&
            this.numVmotions == other.getNumVmotions();
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
        _hashCode += getCurrentFailoverLevel();
        _hashCode += getNumVmotions();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClusterComputeResourceSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ClusterComputeResourceSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentFailoverLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "currentFailoverLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numVmotions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "numVmotions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
