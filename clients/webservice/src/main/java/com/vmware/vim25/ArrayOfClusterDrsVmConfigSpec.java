/**
 * ArrayOfClusterDrsVmConfigSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfClusterDrsVmConfigSpec  implements java.io.Serializable {
    private com.vmware.vim25.ClusterDrsVmConfigSpec[] clusterDrsVmConfigSpec;

    public ArrayOfClusterDrsVmConfigSpec() {
    }

    public ArrayOfClusterDrsVmConfigSpec(
           com.vmware.vim25.ClusterDrsVmConfigSpec[] clusterDrsVmConfigSpec) {
           this.clusterDrsVmConfigSpec = clusterDrsVmConfigSpec;
    }


    /**
     * Gets the clusterDrsVmConfigSpec value for this ArrayOfClusterDrsVmConfigSpec.
     * 
     * @return clusterDrsVmConfigSpec
     */
    public com.vmware.vim25.ClusterDrsVmConfigSpec[] getClusterDrsVmConfigSpec() {
        return clusterDrsVmConfigSpec;
    }


    /**
     * Sets the clusterDrsVmConfigSpec value for this ArrayOfClusterDrsVmConfigSpec.
     * 
     * @param clusterDrsVmConfigSpec
     */
    public void setClusterDrsVmConfigSpec(com.vmware.vim25.ClusterDrsVmConfigSpec[] clusterDrsVmConfigSpec) {
        this.clusterDrsVmConfigSpec = clusterDrsVmConfigSpec;
    }

    public com.vmware.vim25.ClusterDrsVmConfigSpec getClusterDrsVmConfigSpec(int i) {
        return this.clusterDrsVmConfigSpec[i];
    }

    public void setClusterDrsVmConfigSpec(int i, com.vmware.vim25.ClusterDrsVmConfigSpec _value) {
        this.clusterDrsVmConfigSpec[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfClusterDrsVmConfigSpec)) return false;
        ArrayOfClusterDrsVmConfigSpec other = (ArrayOfClusterDrsVmConfigSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clusterDrsVmConfigSpec==null && other.getClusterDrsVmConfigSpec()==null) || 
             (this.clusterDrsVmConfigSpec!=null &&
              java.util.Arrays.equals(this.clusterDrsVmConfigSpec, other.getClusterDrsVmConfigSpec())));
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
        if (getClusterDrsVmConfigSpec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClusterDrsVmConfigSpec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClusterDrsVmConfigSpec(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfClusterDrsVmConfigSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfClusterDrsVmConfigSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterDrsVmConfigSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ClusterDrsVmConfigSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDrsVmConfigSpec"));
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
