/**
 * PerfEntityMetric.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class PerfEntityMetric  extends com.vmware.vim25.PerfEntityMetricBase  implements java.io.Serializable {
    private com.vmware.vim25.PerfSampleInfo[] sampleInfo;

    private com.vmware.vim25.PerfMetricSeries[] value;

    public PerfEntityMetric() {
    }

    public PerfEntityMetric(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.ManagedObjectReference entity,
           com.vmware.vim25.PerfSampleInfo[] sampleInfo,
           com.vmware.vim25.PerfMetricSeries[] value) {
        super(
            dynamicType,
            dynamicProperty,
            entity);
        this.sampleInfo = sampleInfo;
        this.value = value;
    }


    /**
     * Gets the sampleInfo value for this PerfEntityMetric.
     * 
     * @return sampleInfo
     */
    public com.vmware.vim25.PerfSampleInfo[] getSampleInfo() {
        return sampleInfo;
    }


    /**
     * Sets the sampleInfo value for this PerfEntityMetric.
     * 
     * @param sampleInfo
     */
    public void setSampleInfo(com.vmware.vim25.PerfSampleInfo[] sampleInfo) {
        this.sampleInfo = sampleInfo;
    }

    public com.vmware.vim25.PerfSampleInfo getSampleInfo(int i) {
        return this.sampleInfo[i];
    }

    public void setSampleInfo(int i, com.vmware.vim25.PerfSampleInfo _value) {
        this.sampleInfo[i] = _value;
    }


    /**
     * Gets the value value for this PerfEntityMetric.
     * 
     * @return value
     */
    public com.vmware.vim25.PerfMetricSeries[] getValue() {
        return value;
    }


    /**
     * Sets the value value for this PerfEntityMetric.
     * 
     * @param value
     */
    public void setValue(com.vmware.vim25.PerfMetricSeries[] value) {
        this.value = value;
    }

    public com.vmware.vim25.PerfMetricSeries getValue(int i) {
        return this.value[i];
    }

    public void setValue(int i, com.vmware.vim25.PerfMetricSeries _value) {
        this.value[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PerfEntityMetric)) return false;
        PerfEntityMetric other = (PerfEntityMetric) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sampleInfo==null && other.getSampleInfo()==null) || 
             (this.sampleInfo!=null &&
              java.util.Arrays.equals(this.sampleInfo, other.getSampleInfo()))) &&
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
        if (getSampleInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSampleInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSampleInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(PerfEntityMetric.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PerfEntityMetric"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sampleInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sampleInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PerfSampleInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PerfMetricSeries"));
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
