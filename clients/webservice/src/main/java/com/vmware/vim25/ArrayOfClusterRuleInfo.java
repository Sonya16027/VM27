/**
 * ArrayOfClusterRuleInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfClusterRuleInfo  implements java.io.Serializable {
    private com.vmware.vim25.ClusterRuleInfo[] clusterRuleInfo;

    public ArrayOfClusterRuleInfo() {
    }

    public ArrayOfClusterRuleInfo(
           com.vmware.vim25.ClusterRuleInfo[] clusterRuleInfo) {
           this.clusterRuleInfo = clusterRuleInfo;
    }


    /**
     * Gets the clusterRuleInfo value for this ArrayOfClusterRuleInfo.
     * 
     * @return clusterRuleInfo
     */
    public com.vmware.vim25.ClusterRuleInfo[] getClusterRuleInfo() {
        return clusterRuleInfo;
    }


    /**
     * Sets the clusterRuleInfo value for this ArrayOfClusterRuleInfo.
     * 
     * @param clusterRuleInfo
     */
    public void setClusterRuleInfo(com.vmware.vim25.ClusterRuleInfo[] clusterRuleInfo) {
        this.clusterRuleInfo = clusterRuleInfo;
    }

    public com.vmware.vim25.ClusterRuleInfo getClusterRuleInfo(int i) {
        return this.clusterRuleInfo[i];
    }

    public void setClusterRuleInfo(int i, com.vmware.vim25.ClusterRuleInfo _value) {
        this.clusterRuleInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfClusterRuleInfo)) return false;
        ArrayOfClusterRuleInfo other = (ArrayOfClusterRuleInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clusterRuleInfo==null && other.getClusterRuleInfo()==null) || 
             (this.clusterRuleInfo!=null &&
              java.util.Arrays.equals(this.clusterRuleInfo, other.getClusterRuleInfo())));
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
        if (getClusterRuleInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClusterRuleInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClusterRuleInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfClusterRuleInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfClusterRuleInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterRuleInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ClusterRuleInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterRuleInfo"));
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
