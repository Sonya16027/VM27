/**
 * ArrayOfHostUnresolvedVmfsExtent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfHostUnresolvedVmfsExtent  implements java.io.Serializable {
    private com.vmware.vim25.HostUnresolvedVmfsExtent[] hostUnresolvedVmfsExtent;

    public ArrayOfHostUnresolvedVmfsExtent() {
    }

    public ArrayOfHostUnresolvedVmfsExtent(
           com.vmware.vim25.HostUnresolvedVmfsExtent[] hostUnresolvedVmfsExtent) {
           this.hostUnresolvedVmfsExtent = hostUnresolvedVmfsExtent;
    }


    /**
     * Gets the hostUnresolvedVmfsExtent value for this ArrayOfHostUnresolvedVmfsExtent.
     * 
     * @return hostUnresolvedVmfsExtent
     */
    public com.vmware.vim25.HostUnresolvedVmfsExtent[] getHostUnresolvedVmfsExtent() {
        return hostUnresolvedVmfsExtent;
    }


    /**
     * Sets the hostUnresolvedVmfsExtent value for this ArrayOfHostUnresolvedVmfsExtent.
     * 
     * @param hostUnresolvedVmfsExtent
     */
    public void setHostUnresolvedVmfsExtent(com.vmware.vim25.HostUnresolvedVmfsExtent[] hostUnresolvedVmfsExtent) {
        this.hostUnresolvedVmfsExtent = hostUnresolvedVmfsExtent;
    }

    public com.vmware.vim25.HostUnresolvedVmfsExtent getHostUnresolvedVmfsExtent(int i) {
        return this.hostUnresolvedVmfsExtent[i];
    }

    public void setHostUnresolvedVmfsExtent(int i, com.vmware.vim25.HostUnresolvedVmfsExtent _value) {
        this.hostUnresolvedVmfsExtent[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostUnresolvedVmfsExtent)) return false;
        ArrayOfHostUnresolvedVmfsExtent other = (ArrayOfHostUnresolvedVmfsExtent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostUnresolvedVmfsExtent==null && other.getHostUnresolvedVmfsExtent()==null) || 
             (this.hostUnresolvedVmfsExtent!=null &&
              java.util.Arrays.equals(this.hostUnresolvedVmfsExtent, other.getHostUnresolvedVmfsExtent())));
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
        if (getHostUnresolvedVmfsExtent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostUnresolvedVmfsExtent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostUnresolvedVmfsExtent(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostUnresolvedVmfsExtent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostUnresolvedVmfsExtent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostUnresolvedVmfsExtent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostUnresolvedVmfsExtent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostUnresolvedVmfsExtent"));
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
