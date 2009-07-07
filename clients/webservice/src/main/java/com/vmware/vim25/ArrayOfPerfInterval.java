/**
 * ArrayOfPerfInterval.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfPerfInterval  implements java.io.Serializable {
    private com.vmware.vim25.PerfInterval[] perfInterval;

    public ArrayOfPerfInterval() {
    }

    public ArrayOfPerfInterval(
           com.vmware.vim25.PerfInterval[] perfInterval) {
           this.perfInterval = perfInterval;
    }


    /**
     * Gets the perfInterval value for this ArrayOfPerfInterval.
     * 
     * @return perfInterval
     */
    public com.vmware.vim25.PerfInterval[] getPerfInterval() {
        return perfInterval;
    }


    /**
     * Sets the perfInterval value for this ArrayOfPerfInterval.
     * 
     * @param perfInterval
     */
    public void setPerfInterval(com.vmware.vim25.PerfInterval[] perfInterval) {
        this.perfInterval = perfInterval;
    }

    public com.vmware.vim25.PerfInterval getPerfInterval(int i) {
        return this.perfInterval[i];
    }

    public void setPerfInterval(int i, com.vmware.vim25.PerfInterval _value) {
        this.perfInterval[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfPerfInterval)) return false;
        ArrayOfPerfInterval other = (ArrayOfPerfInterval) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.perfInterval==null && other.getPerfInterval()==null) || 
             (this.perfInterval!=null &&
              java.util.Arrays.equals(this.perfInterval, other.getPerfInterval())));
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
        if (getPerfInterval() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPerfInterval());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPerfInterval(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfPerfInterval.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfPerfInterval"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("perfInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "PerfInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PerfInterval"));
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
