/**
 * ClusterFailoverResourcesAdmissionControlPolicy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ClusterFailoverResourcesAdmissionControlPolicy  extends com.vmware.vim25.ClusterDasAdmissionControlPolicy  implements java.io.Serializable {
    private int cpuFailoverResourcesPercent;

    private int memoryFailoverResourcesPercent;

    public ClusterFailoverResourcesAdmissionControlPolicy() {
    }

    public ClusterFailoverResourcesAdmissionControlPolicy(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           int cpuFailoverResourcesPercent,
           int memoryFailoverResourcesPercent) {
        super(
            dynamicType,
            dynamicProperty);
        this.cpuFailoverResourcesPercent = cpuFailoverResourcesPercent;
        this.memoryFailoverResourcesPercent = memoryFailoverResourcesPercent;
    }


    /**
     * Gets the cpuFailoverResourcesPercent value for this ClusterFailoverResourcesAdmissionControlPolicy.
     * 
     * @return cpuFailoverResourcesPercent
     */
    public int getCpuFailoverResourcesPercent() {
        return cpuFailoverResourcesPercent;
    }


    /**
     * Sets the cpuFailoverResourcesPercent value for this ClusterFailoverResourcesAdmissionControlPolicy.
     * 
     * @param cpuFailoverResourcesPercent
     */
    public void setCpuFailoverResourcesPercent(int cpuFailoverResourcesPercent) {
        this.cpuFailoverResourcesPercent = cpuFailoverResourcesPercent;
    }


    /**
     * Gets the memoryFailoverResourcesPercent value for this ClusterFailoverResourcesAdmissionControlPolicy.
     * 
     * @return memoryFailoverResourcesPercent
     */
    public int getMemoryFailoverResourcesPercent() {
        return memoryFailoverResourcesPercent;
    }


    /**
     * Sets the memoryFailoverResourcesPercent value for this ClusterFailoverResourcesAdmissionControlPolicy.
     * 
     * @param memoryFailoverResourcesPercent
     */
    public void setMemoryFailoverResourcesPercent(int memoryFailoverResourcesPercent) {
        this.memoryFailoverResourcesPercent = memoryFailoverResourcesPercent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClusterFailoverResourcesAdmissionControlPolicy)) return false;
        ClusterFailoverResourcesAdmissionControlPolicy other = (ClusterFailoverResourcesAdmissionControlPolicy) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.cpuFailoverResourcesPercent == other.getCpuFailoverResourcesPercent() &&
            this.memoryFailoverResourcesPercent == other.getMemoryFailoverResourcesPercent();
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
        _hashCode += getCpuFailoverResourcesPercent();
        _hashCode += getMemoryFailoverResourcesPercent();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClusterFailoverResourcesAdmissionControlPolicy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterFailoverResourcesAdmissionControlPolicy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpuFailoverResourcesPercent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cpuFailoverResourcesPercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memoryFailoverResourcesPercent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "memoryFailoverResourcesPercent"));
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
