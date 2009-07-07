/**
 * ArrayOfAlarmTriggeringActionTransitionSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfAlarmTriggeringActionTransitionSpec  implements java.io.Serializable {
    private com.vmware.vim25.AlarmTriggeringActionTransitionSpec[] alarmTriggeringActionTransitionSpec;

    public ArrayOfAlarmTriggeringActionTransitionSpec() {
    }

    public ArrayOfAlarmTriggeringActionTransitionSpec(
           com.vmware.vim25.AlarmTriggeringActionTransitionSpec[] alarmTriggeringActionTransitionSpec) {
           this.alarmTriggeringActionTransitionSpec = alarmTriggeringActionTransitionSpec;
    }


    /**
     * Gets the alarmTriggeringActionTransitionSpec value for this ArrayOfAlarmTriggeringActionTransitionSpec.
     * 
     * @return alarmTriggeringActionTransitionSpec
     */
    public com.vmware.vim25.AlarmTriggeringActionTransitionSpec[] getAlarmTriggeringActionTransitionSpec() {
        return alarmTriggeringActionTransitionSpec;
    }


    /**
     * Sets the alarmTriggeringActionTransitionSpec value for this ArrayOfAlarmTriggeringActionTransitionSpec.
     * 
     * @param alarmTriggeringActionTransitionSpec
     */
    public void setAlarmTriggeringActionTransitionSpec(com.vmware.vim25.AlarmTriggeringActionTransitionSpec[] alarmTriggeringActionTransitionSpec) {
        this.alarmTriggeringActionTransitionSpec = alarmTriggeringActionTransitionSpec;
    }

    public com.vmware.vim25.AlarmTriggeringActionTransitionSpec getAlarmTriggeringActionTransitionSpec(int i) {
        return this.alarmTriggeringActionTransitionSpec[i];
    }

    public void setAlarmTriggeringActionTransitionSpec(int i, com.vmware.vim25.AlarmTriggeringActionTransitionSpec _value) {
        this.alarmTriggeringActionTransitionSpec[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfAlarmTriggeringActionTransitionSpec)) return false;
        ArrayOfAlarmTriggeringActionTransitionSpec other = (ArrayOfAlarmTriggeringActionTransitionSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.alarmTriggeringActionTransitionSpec==null && other.getAlarmTriggeringActionTransitionSpec()==null) || 
             (this.alarmTriggeringActionTransitionSpec!=null &&
              java.util.Arrays.equals(this.alarmTriggeringActionTransitionSpec, other.getAlarmTriggeringActionTransitionSpec())));
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
        if (getAlarmTriggeringActionTransitionSpec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAlarmTriggeringActionTransitionSpec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAlarmTriggeringActionTransitionSpec(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfAlarmTriggeringActionTransitionSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfAlarmTriggeringActionTransitionSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alarmTriggeringActionTransitionSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "AlarmTriggeringActionTransitionSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "AlarmTriggeringActionTransitionSpec"));
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
