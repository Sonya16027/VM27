/**
 * PerformanceDescription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class PerformanceDescription  extends com.vmware.vim.DynamicData  implements java.io.Serializable {
    private com.vmware.vim.ElementDescription[] counterType;

    private com.vmware.vim.ElementDescription[] statsType;

    public PerformanceDescription() {
    }

    public PerformanceDescription(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           com.vmware.vim.ElementDescription[] counterType,
           com.vmware.vim.ElementDescription[] statsType) {
        super(
            dynamicType,
            dynamicProperty);
        this.counterType = counterType;
        this.statsType = statsType;
    }


    /**
     * Gets the counterType value for this PerformanceDescription.
     * 
     * @return counterType
     */
    public com.vmware.vim.ElementDescription[] getCounterType() {
        return counterType;
    }


    /**
     * Sets the counterType value for this PerformanceDescription.
     * 
     * @param counterType
     */
    public void setCounterType(com.vmware.vim.ElementDescription[] counterType) {
        this.counterType = counterType;
    }

    public com.vmware.vim.ElementDescription getCounterType(int i) {
        return this.counterType[i];
    }

    public void setCounterType(int i, com.vmware.vim.ElementDescription _value) {
        this.counterType[i] = _value;
    }


    /**
     * Gets the statsType value for this PerformanceDescription.
     * 
     * @return statsType
     */
    public com.vmware.vim.ElementDescription[] getStatsType() {
        return statsType;
    }


    /**
     * Sets the statsType value for this PerformanceDescription.
     * 
     * @param statsType
     */
    public void setStatsType(com.vmware.vim.ElementDescription[] statsType) {
        this.statsType = statsType;
    }

    public com.vmware.vim.ElementDescription getStatsType(int i) {
        return this.statsType[i];
    }

    public void setStatsType(int i, com.vmware.vim.ElementDescription _value) {
        this.statsType[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PerformanceDescription)) return false;
        PerformanceDescription other = (PerformanceDescription) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.counterType==null && other.getCounterType()==null) || 
             (this.counterType!=null &&
              java.util.Arrays.equals(this.counterType, other.getCounterType()))) &&
            ((this.statsType==null && other.getStatsType()==null) || 
             (this.statsType!=null &&
              java.util.Arrays.equals(this.statsType, other.getStatsType())));
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
        if (getCounterType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCounterType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCounterType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatsType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatsType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStatsType(), i);
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
        new org.apache.axis.description.TypeDesc(PerformanceDescription.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "PerformanceDescription"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("counterType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "counterType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ElementDescription"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statsType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "statsType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ElementDescription"));
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
