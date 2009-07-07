/**
 * ArrayOfProductComponentInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfProductComponentInfo  implements java.io.Serializable {
    private com.vmware.vim25.ProductComponentInfo[] productComponentInfo;

    public ArrayOfProductComponentInfo() {
    }

    public ArrayOfProductComponentInfo(
           com.vmware.vim25.ProductComponentInfo[] productComponentInfo) {
           this.productComponentInfo = productComponentInfo;
    }


    /**
     * Gets the productComponentInfo value for this ArrayOfProductComponentInfo.
     * 
     * @return productComponentInfo
     */
    public com.vmware.vim25.ProductComponentInfo[] getProductComponentInfo() {
        return productComponentInfo;
    }


    /**
     * Sets the productComponentInfo value for this ArrayOfProductComponentInfo.
     * 
     * @param productComponentInfo
     */
    public void setProductComponentInfo(com.vmware.vim25.ProductComponentInfo[] productComponentInfo) {
        this.productComponentInfo = productComponentInfo;
    }

    public com.vmware.vim25.ProductComponentInfo getProductComponentInfo(int i) {
        return this.productComponentInfo[i];
    }

    public void setProductComponentInfo(int i, com.vmware.vim25.ProductComponentInfo _value) {
        this.productComponentInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfProductComponentInfo)) return false;
        ArrayOfProductComponentInfo other = (ArrayOfProductComponentInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.productComponentInfo==null && other.getProductComponentInfo()==null) || 
             (this.productComponentInfo!=null &&
              java.util.Arrays.equals(this.productComponentInfo, other.getProductComponentInfo())));
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
        if (getProductComponentInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductComponentInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductComponentInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfProductComponentInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfProductComponentInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productComponentInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ProductComponentInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ProductComponentInfo"));
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
