/**
 * ClusterDasFailoverLevelAdvancedRuntimeInfoSlotInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ClusterDasFailoverLevelAdvancedRuntimeInfoSlotInfo  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private int numVcpus;

    private int cpuMHz;

    private int memoryMB;

    public ClusterDasFailoverLevelAdvancedRuntimeInfoSlotInfo() {
    }

    public ClusterDasFailoverLevelAdvancedRuntimeInfoSlotInfo(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           int numVcpus,
           int cpuMHz,
           int memoryMB) {
        super(
            dynamicType,
            dynamicProperty);
        this.numVcpus = numVcpus;
        this.cpuMHz = cpuMHz;
        this.memoryMB = memoryMB;
    }


    /**
     * Gets the numVcpus value for this ClusterDasFailoverLevelAdvancedRuntimeInfoSlotInfo.
     * 
     * @return numVcpus
     */
    public int getNumVcpus() {
        return numVcpus;
    }


    /**
     * Sets the numVcpus value for this ClusterDasFailoverLevelAdvancedRuntimeInfoSlotInfo.
     * 
     * @param numVcpus
     */
    public void setNumVcpus(int numVcpus) {
        this.numVcpus = numVcpus;
    }


    /**
     * Gets the cpuMHz value for this ClusterDasFailoverLevelAdvancedRuntimeInfoSlotInfo.
     * 
     * @return cpuMHz
     */
    public int getCpuMHz() {
        return cpuMHz;
    }


    /**
     * Sets the cpuMHz value for this ClusterDasFailoverLevelAdvancedRuntimeInfoSlotInfo.
     * 
     * @param cpuMHz
     */
    public void setCpuMHz(int cpuMHz) {
        this.cpuMHz = cpuMHz;
    }


    /**
     * Gets the memoryMB value for this ClusterDasFailoverLevelAdvancedRuntimeInfoSlotInfo.
     * 
     * @return memoryMB
     */
    public int getMemoryMB() {
        return memoryMB;
    }


    /**
     * Sets the memoryMB value for this ClusterDasFailoverLevelAdvancedRuntimeInfoSlotInfo.
     * 
     * @param memoryMB
     */
    public void setMemoryMB(int memoryMB) {
        this.memoryMB = memoryMB;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClusterDasFailoverLevelAdvancedRuntimeInfoSlotInfo)) return false;
        ClusterDasFailoverLevelAdvancedRuntimeInfoSlotInfo other = (ClusterDasFailoverLevelAdvancedRuntimeInfoSlotInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.numVcpus == other.getNumVcpus() &&
            this.cpuMHz == other.getCpuMHz() &&
            this.memoryMB == other.getMemoryMB();
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
        _hashCode += getNumVcpus();
        _hashCode += getCpuMHz();
        _hashCode += getMemoryMB();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClusterDasFailoverLevelAdvancedRuntimeInfoSlotInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDasFailoverLevelAdvancedRuntimeInfoSlotInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numVcpus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numVcpus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpuMHz");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cpuMHz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memoryMB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "memoryMB"));
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
