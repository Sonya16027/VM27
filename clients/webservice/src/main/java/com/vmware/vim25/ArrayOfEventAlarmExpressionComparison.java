/**
 * ArrayOfEventAlarmExpressionComparison.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfEventAlarmExpressionComparison  implements java.io.Serializable {
    private com.vmware.vim25.EventAlarmExpressionComparison[] eventAlarmExpressionComparison;

    public ArrayOfEventAlarmExpressionComparison() {
    }

    public ArrayOfEventAlarmExpressionComparison(
           com.vmware.vim25.EventAlarmExpressionComparison[] eventAlarmExpressionComparison) {
           this.eventAlarmExpressionComparison = eventAlarmExpressionComparison;
    }


    /**
     * Gets the eventAlarmExpressionComparison value for this ArrayOfEventAlarmExpressionComparison.
     * 
     * @return eventAlarmExpressionComparison
     */
    public com.vmware.vim25.EventAlarmExpressionComparison[] getEventAlarmExpressionComparison() {
        return eventAlarmExpressionComparison;
    }


    /**
     * Sets the eventAlarmExpressionComparison value for this ArrayOfEventAlarmExpressionComparison.
     * 
     * @param eventAlarmExpressionComparison
     */
    public void setEventAlarmExpressionComparison(com.vmware.vim25.EventAlarmExpressionComparison[] eventAlarmExpressionComparison) {
        this.eventAlarmExpressionComparison = eventAlarmExpressionComparison;
    }

    public com.vmware.vim25.EventAlarmExpressionComparison getEventAlarmExpressionComparison(int i) {
        return this.eventAlarmExpressionComparison[i];
    }

    public void setEventAlarmExpressionComparison(int i, com.vmware.vim25.EventAlarmExpressionComparison _value) {
        this.eventAlarmExpressionComparison[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfEventAlarmExpressionComparison)) return false;
        ArrayOfEventAlarmExpressionComparison other = (ArrayOfEventAlarmExpressionComparison) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.eventAlarmExpressionComparison==null && other.getEventAlarmExpressionComparison()==null) || 
             (this.eventAlarmExpressionComparison!=null &&
              java.util.Arrays.equals(this.eventAlarmExpressionComparison, other.getEventAlarmExpressionComparison())));
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
        if (getEventAlarmExpressionComparison() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEventAlarmExpressionComparison());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEventAlarmExpressionComparison(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfEventAlarmExpressionComparison.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfEventAlarmExpressionComparison"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventAlarmExpressionComparison");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "EventAlarmExpressionComparison"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "EventAlarmExpressionComparison"));
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
