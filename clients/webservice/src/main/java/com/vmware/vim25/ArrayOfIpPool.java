/**
 * ArrayOfIpPool.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfIpPool  implements java.io.Serializable {
    private com.vmware.vim25.IpPool[] ipPool;

    public ArrayOfIpPool() {
    }

    public ArrayOfIpPool(
           com.vmware.vim25.IpPool[] ipPool) {
           this.ipPool = ipPool;
    }


    /**
     * Gets the ipPool value for this ArrayOfIpPool.
     * 
     * @return ipPool
     */
    public com.vmware.vim25.IpPool[] getIpPool() {
        return ipPool;
    }


    /**
     * Sets the ipPool value for this ArrayOfIpPool.
     * 
     * @param ipPool
     */
    public void setIpPool(com.vmware.vim25.IpPool[] ipPool) {
        this.ipPool = ipPool;
    }

    public com.vmware.vim25.IpPool getIpPool(int i) {
        return this.ipPool[i];
    }

    public void setIpPool(int i, com.vmware.vim25.IpPool _value) {
        this.ipPool[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfIpPool)) return false;
        ArrayOfIpPool other = (ArrayOfIpPool) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ipPool==null && other.getIpPool()==null) || 
             (this.ipPool!=null &&
              java.util.Arrays.equals(this.ipPool, other.getIpPool())));
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
        if (getIpPool() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIpPool());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIpPool(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfIpPool.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfIpPool"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipPool");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "IpPool"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IpPool"));
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
