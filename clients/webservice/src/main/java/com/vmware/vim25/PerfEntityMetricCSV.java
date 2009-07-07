/**
 * PerfEntityMetricCSV.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class PerfEntityMetricCSV  extends com.vmware.vim25.PerfEntityMetricBase  implements java.io.Serializable {
    private java.lang.String sampleInfoCSV;

    private com.vmware.vim25.PerfMetricSeriesCSV[] value;

    public PerfEntityMetricCSV() {
    }

    public PerfEntityMetricCSV(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.ManagedObjectReference entity,
           java.lang.String sampleInfoCSV,
           com.vmware.vim25.PerfMetricSeriesCSV[] value) {
        super(
            dynamicType,
            dynamicProperty,
            entity);
        this.sampleInfoCSV = sampleInfoCSV;
        this.value = value;
    }


    /**
     * Gets the sampleInfoCSV value for this PerfEntityMetricCSV.
     * 
     * @return sampleInfoCSV
     */
    public java.lang.String getSampleInfoCSV() {
        return sampleInfoCSV;
    }


    /**
     * Sets the sampleInfoCSV value for this PerfEntityMetricCSV.
     * 
     * @param sampleInfoCSV
     */
    public void setSampleInfoCSV(java.lang.String sampleInfoCSV) {
        this.sampleInfoCSV = sampleInfoCSV;
    }


    /**
     * Gets the value value for this PerfEntityMetricCSV.
     * 
     * @return value
     */
    public com.vmware.vim25.PerfMetricSeriesCSV[] getValue() {
        return value;
    }


    /**
     * Sets the value value for this PerfEntityMetricCSV.
     * 
     * @param value
     */
    public void setValue(com.vmware.vim25.PerfMetricSeriesCSV[] value) {
        this.value = value;
    }

    public com.vmware.vim25.PerfMetricSeriesCSV getValue(int i) {
        return this.value[i];
    }

    public void setValue(int i, com.vmware.vim25.PerfMetricSeriesCSV _value) {
        this.value[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PerfEntityMetricCSV)) return false;
        PerfEntityMetricCSV other = (PerfEntityMetricCSV) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sampleInfoCSV==null && other.getSampleInfoCSV()==null) || 
             (this.sampleInfoCSV!=null &&
              this.sampleInfoCSV.equals(other.getSampleInfoCSV()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              java.util.Arrays.equals(this.value, other.getValue())));
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
        if (getSampleInfoCSV() != null) {
            _hashCode += getSampleInfoCSV().hashCode();
        }
        if (getValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValue(), i);
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
        new org.apache.axis.description.TypeDesc(PerfEntityMetricCSV.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PerfEntityMetricCSV"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sampleInfoCSV");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sampleInfoCSV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PerfMetricSeriesCSV"));
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
