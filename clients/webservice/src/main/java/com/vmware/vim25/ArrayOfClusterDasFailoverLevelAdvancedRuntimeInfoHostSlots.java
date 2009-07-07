/**
 * ArrayOfClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots  implements java.io.Serializable {
    private com.vmware.vim25.ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots[] clusterDasFailoverLevelAdvancedRuntimeInfoHostSlots;

    public ArrayOfClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots() {
    }

    public ArrayOfClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots(
           com.vmware.vim25.ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots[] clusterDasFailoverLevelAdvancedRuntimeInfoHostSlots) {
           this.clusterDasFailoverLevelAdvancedRuntimeInfoHostSlots = clusterDasFailoverLevelAdvancedRuntimeInfoHostSlots;
    }


    /**
     * Gets the clusterDasFailoverLevelAdvancedRuntimeInfoHostSlots value for this ArrayOfClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots.
     * 
     * @return clusterDasFailoverLevelAdvancedRuntimeInfoHostSlots
     */
    public com.vmware.vim25.ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots[] getClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots() {
        return clusterDasFailoverLevelAdvancedRuntimeInfoHostSlots;
    }


    /**
     * Sets the clusterDasFailoverLevelAdvancedRuntimeInfoHostSlots value for this ArrayOfClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots.
     * 
     * @param clusterDasFailoverLevelAdvancedRuntimeInfoHostSlots
     */
    public void setClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots(com.vmware.vim25.ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots[] clusterDasFailoverLevelAdvancedRuntimeInfoHostSlots) {
        this.clusterDasFailoverLevelAdvancedRuntimeInfoHostSlots = clusterDasFailoverLevelAdvancedRuntimeInfoHostSlots;
    }

    public com.vmware.vim25.ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots getClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots(int i) {
        return this.clusterDasFailoverLevelAdvancedRuntimeInfoHostSlots[i];
    }

    public void setClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots(int i, com.vmware.vim25.ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots _value) {
        this.clusterDasFailoverLevelAdvancedRuntimeInfoHostSlots[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots)) return false;
        ArrayOfClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots other = (ArrayOfClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clusterDasFailoverLevelAdvancedRuntimeInfoHostSlots==null && other.getClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots()==null) || 
             (this.clusterDasFailoverLevelAdvancedRuntimeInfoHostSlots!=null &&
              java.util.Arrays.equals(this.clusterDasFailoverLevelAdvancedRuntimeInfoHostSlots, other.getClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots())));
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
        if (getClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterDasFailoverLevelAdvancedRuntimeInfoHostSlots");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots"));
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
