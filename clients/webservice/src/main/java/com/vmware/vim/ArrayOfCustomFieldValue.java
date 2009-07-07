/**
 * ArrayOfCustomFieldValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ArrayOfCustomFieldValue  implements java.io.Serializable {
    private com.vmware.vim.CustomFieldValue[] customFieldValue;

    public ArrayOfCustomFieldValue() {
    }

    public ArrayOfCustomFieldValue(
           com.vmware.vim.CustomFieldValue[] customFieldValue) {
           this.customFieldValue = customFieldValue;
    }


    /**
     * Gets the customFieldValue value for this ArrayOfCustomFieldValue.
     * 
     * @return customFieldValue
     */
    public com.vmware.vim.CustomFieldValue[] getCustomFieldValue() {
        return customFieldValue;
    }


    /**
     * Sets the customFieldValue value for this ArrayOfCustomFieldValue.
     * 
     * @param customFieldValue
     */
    public void setCustomFieldValue(com.vmware.vim.CustomFieldValue[] customFieldValue) {
        this.customFieldValue = customFieldValue;
    }

    public com.vmware.vim.CustomFieldValue getCustomFieldValue(int i) {
        return this.customFieldValue[i];
    }

    public void setCustomFieldValue(int i, com.vmware.vim.CustomFieldValue _value) {
        this.customFieldValue[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfCustomFieldValue)) return false;
        ArrayOfCustomFieldValue other = (ArrayOfCustomFieldValue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customFieldValue==null && other.getCustomFieldValue()==null) || 
             (this.customFieldValue!=null &&
              java.util.Arrays.equals(this.customFieldValue, other.getCustomFieldValue())));
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
        if (getCustomFieldValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomFieldValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomFieldValue(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfCustomFieldValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ArrayOfCustomFieldValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "CustomFieldValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "CustomFieldValue"));
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
