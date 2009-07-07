/**
 * ArrayOfClusterAttemptedVmInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfClusterAttemptedVmInfo  implements java.io.Serializable {
    private com.vmware.vim25.ClusterAttemptedVmInfo[] clusterAttemptedVmInfo;

    public ArrayOfClusterAttemptedVmInfo() {
    }

    public ArrayOfClusterAttemptedVmInfo(
           com.vmware.vim25.ClusterAttemptedVmInfo[] clusterAttemptedVmInfo) {
           this.clusterAttemptedVmInfo = clusterAttemptedVmInfo;
    }


    /**
     * Gets the clusterAttemptedVmInfo value for this ArrayOfClusterAttemptedVmInfo.
     * 
     * @return clusterAttemptedVmInfo
     */
    public com.vmware.vim25.ClusterAttemptedVmInfo[] getClusterAttemptedVmInfo() {
        return clusterAttemptedVmInfo;
    }


    /**
     * Sets the clusterAttemptedVmInfo value for this ArrayOfClusterAttemptedVmInfo.
     * 
     * @param clusterAttemptedVmInfo
     */
    public void setClusterAttemptedVmInfo(com.vmware.vim25.ClusterAttemptedVmInfo[] clusterAttemptedVmInfo) {
        this.clusterAttemptedVmInfo = clusterAttemptedVmInfo;
    }

    public com.vmware.vim25.ClusterAttemptedVmInfo getClusterAttemptedVmInfo(int i) {
        return this.clusterAttemptedVmInfo[i];
    }

    public void setClusterAttemptedVmInfo(int i, com.vmware.vim25.ClusterAttemptedVmInfo _value) {
        this.clusterAttemptedVmInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfClusterAttemptedVmInfo)) return false;
        ArrayOfClusterAttemptedVmInfo other = (ArrayOfClusterAttemptedVmInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clusterAttemptedVmInfo==null && other.getClusterAttemptedVmInfo()==null) || 
             (this.clusterAttemptedVmInfo!=null &&
              java.util.Arrays.equals(this.clusterAttemptedVmInfo, other.getClusterAttemptedVmInfo())));
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
        if (getClusterAttemptedVmInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClusterAttemptedVmInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClusterAttemptedVmInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArrayOfClusterAttemptedVmInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfClusterAttemptedVmInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterAttemptedVmInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ClusterAttemptedVmInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterAttemptedVmInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
