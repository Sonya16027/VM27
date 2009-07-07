/**
 * ArrayOfOptionDef.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ArrayOfOptionDef  implements java.io.Serializable {
    private com.vmware.vim.OptionDef[] optionDef;

    public ArrayOfOptionDef() {
    }

    public ArrayOfOptionDef(
           com.vmware.vim.OptionDef[] optionDef) {
           this.optionDef = optionDef;
    }


    /**
     * Gets the optionDef value for this ArrayOfOptionDef.
     * 
     * @return optionDef
     */
    public com.vmware.vim.OptionDef[] getOptionDef() {
        return optionDef;
    }


    /**
     * Sets the optionDef value for this ArrayOfOptionDef.
     * 
     * @param optionDef
     */
    public void setOptionDef(com.vmware.vim.OptionDef[] optionDef) {
        this.optionDef = optionDef;
    }

    public com.vmware.vim.OptionDef getOptionDef(int i) {
        return this.optionDef[i];
    }

    public void setOptionDef(int i, com.vmware.vim.OptionDef _value) {
        this.optionDef[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfOptionDef)) return false;
        ArrayOfOptionDef other = (ArrayOfOptionDef) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.optionDef==null && other.getOptionDef()==null) || 
             (this.optionDef!=null &&
              java.util.Arrays.equals(this.optionDef, other.getOptionDef())));
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
        if (getOptionDef() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOptionDef());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOptionDef(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfOptionDef.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ArrayOfOptionDef"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionDef");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "OptionDef"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "OptionDef"));
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
