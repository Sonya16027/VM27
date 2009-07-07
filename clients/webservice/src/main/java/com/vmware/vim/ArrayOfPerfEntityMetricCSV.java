/**
 * ArrayOfPerfEntityMetricCSV.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ArrayOfPerfEntityMetricCSV  implements java.io.Serializable {
    private com.vmware.vim.PerfEntityMetricCSV[] perfEntityMetricCSV;

    public ArrayOfPerfEntityMetricCSV() {
    }

    public ArrayOfPerfEntityMetricCSV(
           com.vmware.vim.PerfEntityMetricCSV[] perfEntityMetricCSV) {
           this.perfEntityMetricCSV = perfEntityMetricCSV;
    }


    /**
     * Gets the perfEntityMetricCSV value for this ArrayOfPerfEntityMetricCSV.
     * 
     * @return perfEntityMetricCSV
     */
    public com.vmware.vim.PerfEntityMetricCSV[] getPerfEntityMetricCSV() {
        return perfEntityMetricCSV;
    }


    /**
     * Sets the perfEntityMetricCSV value for this ArrayOfPerfEntityMetricCSV.
     * 
     * @param perfEntityMetricCSV
     */
    public void setPerfEntityMetricCSV(com.vmware.vim.PerfEntityMetricCSV[] perfEntityMetricCSV) {
        this.perfEntityMetricCSV = perfEntityMetricCSV;
    }

    public com.vmware.vim.PerfEntityMetricCSV getPerfEntityMetricCSV(int i) {
        return this.perfEntityMetricCSV[i];
    }

    public void setPerfEntityMetricCSV(int i, com.vmware.vim.PerfEntityMetricCSV _value) {
        this.perfEntityMetricCSV[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfPerfEntityMetricCSV)) return false;
        ArrayOfPerfEntityMetricCSV other = (ArrayOfPerfEntityMetricCSV) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.perfEntityMetricCSV==null && other.getPerfEntityMetricCSV()==null) || 
             (this.perfEntityMetricCSV!=null &&
              java.util.Arrays.equals(this.perfEntityMetricCSV, other.getPerfEntityMetricCSV())));
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
        if (getPerfEntityMetricCSV() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPerfEntityMetricCSV());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPerfEntityMetricCSV(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfPerfEntityMetricCSV.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ArrayOfPerfEntityMetricCSV"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("perfEntityMetricCSV");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "PerfEntityMetricCSV"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "PerfEntityMetricCSV"));
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
