/**
 * FloatOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class FloatOption  extends com.vmware.vim.OptionType  implements java.io.Serializable {
    private float min;

    private float max;

    private float defaultValue;

    public FloatOption() {
    }

    public FloatOption(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           java.lang.Boolean valueIsReadonly,
           float min,
           float max,
           float defaultValue) {
        super(
            dynamicType,
            dynamicProperty,
            valueIsReadonly);
        this.min = min;
        this.max = max;
        this.defaultValue = defaultValue;
    }


    /**
     * Gets the min value for this FloatOption.
     * 
     * @return min
     */
    public float getMin() {
        return min;
    }


    /**
     * Sets the min value for this FloatOption.
     * 
     * @param min
     */
    public void setMin(float min) {
        this.min = min;
    }


    /**
     * Gets the max value for this FloatOption.
     * 
     * @return max
     */
    public float getMax() {
        return max;
    }


    /**
     * Sets the max value for this FloatOption.
     * 
     * @param max
     */
    public void setMax(float max) {
        this.max = max;
    }


    /**
     * Gets the defaultValue value for this FloatOption.
     * 
     * @return defaultValue
     */
    public float getDefaultValue() {
        return defaultValue;
    }


    /**
     * Sets the defaultValue value for this FloatOption.
     * 
     * @param defaultValue
     */
    public void setDefaultValue(float defaultValue) {
        this.defaultValue = defaultValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FloatOption)) return false;
        FloatOption other = (FloatOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.min == other.getMin() &&
            this.max == other.getMax() &&
            this.defaultValue == other.getDefaultValue();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        _hashCode += new Float(getMin()).hashCode();
        _hashCode += new Float(getMax()).hashCode();
        _hashCode += new Float(getDefaultValue()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FloatOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "FloatOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("min");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "min"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("max");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "max"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "defaultValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
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
