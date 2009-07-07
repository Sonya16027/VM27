/**
 * ArrayOfClusterDrsFaults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfClusterDrsFaults  implements java.io.Serializable {
    private com.vmware.vim25.ClusterDrsFaults[] clusterDrsFaults;

    public ArrayOfClusterDrsFaults() {
    }

    public ArrayOfClusterDrsFaults(
           com.vmware.vim25.ClusterDrsFaults[] clusterDrsFaults) {
           this.clusterDrsFaults = clusterDrsFaults;
    }


    /**
     * Gets the clusterDrsFaults value for this ArrayOfClusterDrsFaults.
     * 
     * @return clusterDrsFaults
     */
    public com.vmware.vim25.ClusterDrsFaults[] getClusterDrsFaults() {
        return clusterDrsFaults;
    }


    /**
     * Sets the clusterDrsFaults value for this ArrayOfClusterDrsFaults.
     * 
     * @param clusterDrsFaults
     */
    public void setClusterDrsFaults(com.vmware.vim25.ClusterDrsFaults[] clusterDrsFaults) {
        this.clusterDrsFaults = clusterDrsFaults;
    }

    public com.vmware.vim25.ClusterDrsFaults getClusterDrsFaults(int i) {
        return this.clusterDrsFaults[i];
    }

    public void setClusterDrsFaults(int i, com.vmware.vim25.ClusterDrsFaults _value) {
        this.clusterDrsFaults[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfClusterDrsFaults)) return false;
        ArrayOfClusterDrsFaults other = (ArrayOfClusterDrsFaults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clusterDrsFaults==null && other.getClusterDrsFaults()==null) || 
             (this.clusterDrsFaults!=null &&
              java.util.Arrays.equals(this.clusterDrsFaults, other.getClusterDrsFaults())));
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
        if (getClusterDrsFaults() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClusterDrsFaults());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClusterDrsFaults(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfClusterDrsFaults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfClusterDrsFaults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterDrsFaults");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ClusterDrsFaults"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDrsFaults"));
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
