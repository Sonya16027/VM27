/**
 * ClusterFailoverLevelAdmissionControlPolicy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ClusterFailoverLevelAdmissionControlPolicy  extends com.vmware.vim25.ClusterDasAdmissionControlPolicy  implements java.io.Serializable {
    private int failoverLevel;

    public ClusterFailoverLevelAdmissionControlPolicy() {
    }

    public ClusterFailoverLevelAdmissionControlPolicy(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           int failoverLevel) {
        super(
            dynamicType,
            dynamicProperty);
        this.failoverLevel = failoverLevel;
    }


    /**
     * Gets the failoverLevel value for this ClusterFailoverLevelAdmissionControlPolicy.
     * 
     * @return failoverLevel
     */
    public int getFailoverLevel() {
        return failoverLevel;
    }


    /**
     * Sets the failoverLevel value for this ClusterFailoverLevelAdmissionControlPolicy.
     * 
     * @param failoverLevel
     */
    public void setFailoverLevel(int failoverLevel) {
        this.failoverLevel = failoverLevel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClusterFailoverLevelAdmissionControlPolicy)) return false;
        ClusterFailoverLevelAdmissionControlPolicy other = (ClusterFailoverLevelAdmissionControlPolicy) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.failoverLevel == other.getFailoverLevel();
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
        _hashCode += getFailoverLevel();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClusterFailoverLevelAdmissionControlPolicy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterFailoverLevelAdmissionControlPolicy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failoverLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "failoverLevel"));
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
