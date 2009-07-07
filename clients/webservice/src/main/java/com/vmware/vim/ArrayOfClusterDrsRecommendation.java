/**
 * ArrayOfClusterDrsRecommendation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ArrayOfClusterDrsRecommendation  implements java.io.Serializable {
    private com.vmware.vim.ClusterDrsRecommendation[] clusterDrsRecommendation;

    public ArrayOfClusterDrsRecommendation() {
    }

    public ArrayOfClusterDrsRecommendation(
           com.vmware.vim.ClusterDrsRecommendation[] clusterDrsRecommendation) {
           this.clusterDrsRecommendation = clusterDrsRecommendation;
    }


    /**
     * Gets the clusterDrsRecommendation value for this ArrayOfClusterDrsRecommendation.
     * 
     * @return clusterDrsRecommendation
     */
    public com.vmware.vim.ClusterDrsRecommendation[] getClusterDrsRecommendation() {
        return clusterDrsRecommendation;
    }


    /**
     * Sets the clusterDrsRecommendation value for this ArrayOfClusterDrsRecommendation.
     * 
     * @param clusterDrsRecommendation
     */
    public void setClusterDrsRecommendation(com.vmware.vim.ClusterDrsRecommendation[] clusterDrsRecommendation) {
        this.clusterDrsRecommendation = clusterDrsRecommendation;
    }

    public com.vmware.vim.ClusterDrsRecommendation getClusterDrsRecommendation(int i) {
        return this.clusterDrsRecommendation[i];
    }

    public void setClusterDrsRecommendation(int i, com.vmware.vim.ClusterDrsRecommendation _value) {
        this.clusterDrsRecommendation[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfClusterDrsRecommendation)) return false;
        ArrayOfClusterDrsRecommendation other = (ArrayOfClusterDrsRecommendation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clusterDrsRecommendation==null && other.getClusterDrsRecommendation()==null) || 
             (this.clusterDrsRecommendation!=null &&
              java.util.Arrays.equals(this.clusterDrsRecommendation, other.getClusterDrsRecommendation())));
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
        if (getClusterDrsRecommendation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClusterDrsRecommendation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClusterDrsRecommendation(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfClusterDrsRecommendation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ArrayOfClusterDrsRecommendation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterDrsRecommendation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "ClusterDrsRecommendation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ClusterDrsRecommendation"));
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
