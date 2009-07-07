/**
 * ArrayOfTag.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfTag  implements java.io.Serializable {
    private com.vmware.vim25.Tag[] tag;

    public ArrayOfTag() {
    }

    public ArrayOfTag(
           com.vmware.vim25.Tag[] tag) {
           this.tag = tag;
    }


    /**
     * Gets the tag value for this ArrayOfTag.
     * 
     * @return tag
     */
    public com.vmware.vim25.Tag[] getTag() {
        return tag;
    }


    /**
     * Sets the tag value for this ArrayOfTag.
     * 
     * @param tag
     */
    public void setTag(com.vmware.vim25.Tag[] tag) {
        this.tag = tag;
    }

    public com.vmware.vim25.Tag getTag(int i) {
        return this.tag[i];
    }

    public void setTag(int i, com.vmware.vim25.Tag _value) {
        this.tag[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfTag)) return false;
        ArrayOfTag other = (ArrayOfTag) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tag==null && other.getTag()==null) || 
             (this.tag!=null &&
              java.util.Arrays.equals(this.tag, other.getTag())));
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
        if (getTag() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTag());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTag(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfTag.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfTag"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tag");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "Tag"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "Tag"));
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
