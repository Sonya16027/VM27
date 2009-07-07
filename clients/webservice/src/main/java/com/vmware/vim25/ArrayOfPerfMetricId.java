/**
 * ArrayOfPerfMetricId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfPerfMetricId  implements java.io.Serializable {
    private com.vmware.vim25.PerfMetricId[] perfMetricId;

    public ArrayOfPerfMetricId() {
    }

    public ArrayOfPerfMetricId(
           com.vmware.vim25.PerfMetricId[] perfMetricId) {
           this.perfMetricId = perfMetricId;
    }


    /**
     * Gets the perfMetricId value for this ArrayOfPerfMetricId.
     * 
     * @return perfMetricId
     */
    public com.vmware.vim25.PerfMetricId[] getPerfMetricId() {
        return perfMetricId;
    }


    /**
     * Sets the perfMetricId value for this ArrayOfPerfMetricId.
     * 
     * @param perfMetricId
     */
    public void setPerfMetricId(com.vmware.vim25.PerfMetricId[] perfMetricId) {
        this.perfMetricId = perfMetricId;
    }

    public com.vmware.vim25.PerfMetricId getPerfMetricId(int i) {
        return this.perfMetricId[i];
    }

    public void setPerfMetricId(int i, com.vmware.vim25.PerfMetricId _value) {
        this.perfMetricId[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfPerfMetricId)) return false;
        ArrayOfPerfMetricId other = (ArrayOfPerfMetricId) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.perfMetricId==null && other.getPerfMetricId()==null) || 
             (this.perfMetricId!=null &&
              java.util.Arrays.equals(this.perfMetricId, other.getPerfMetricId())));
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
        if (getPerfMetricId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPerfMetricId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPerfMetricId(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfPerfMetricId.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfPerfMetricId"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("perfMetricId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "PerfMetricId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PerfMetricId"));
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
