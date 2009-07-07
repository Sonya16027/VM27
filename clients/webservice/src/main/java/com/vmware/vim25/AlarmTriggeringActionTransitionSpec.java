/**
 * AlarmTriggeringActionTransitionSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class AlarmTriggeringActionTransitionSpec  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private com.vmware.vim25.ManagedEntityStatus startState;

    private com.vmware.vim25.ManagedEntityStatus finalState;

    private boolean repeats;

    public AlarmTriggeringActionTransitionSpec() {
    }

    public AlarmTriggeringActionTransitionSpec(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.ManagedEntityStatus startState,
           com.vmware.vim25.ManagedEntityStatus finalState,
           boolean repeats) {
        super(
            dynamicType,
            dynamicProperty);
        this.startState = startState;
        this.finalState = finalState;
        this.repeats = repeats;
    }


    /**
     * Gets the startState value for this AlarmTriggeringActionTransitionSpec.
     * 
     * @return startState
     */
    public com.vmware.vim25.ManagedEntityStatus getStartState() {
        return startState;
    }


    /**
     * Sets the startState value for this AlarmTriggeringActionTransitionSpec.
     * 
     * @param startState
     */
    public void setStartState(com.vmware.vim25.ManagedEntityStatus startState) {
        this.startState = startState;
    }


    /**
     * Gets the finalState value for this AlarmTriggeringActionTransitionSpec.
     * 
     * @return finalState
     */
    public com.vmware.vim25.ManagedEntityStatus getFinalState() {
        return finalState;
    }


    /**
     * Sets the finalState value for this AlarmTriggeringActionTransitionSpec.
     * 
     * @param finalState
     */
    public void setFinalState(com.vmware.vim25.ManagedEntityStatus finalState) {
        this.finalState = finalState;
    }


    /**
     * Gets the repeats value for this AlarmTriggeringActionTransitionSpec.
     * 
     * @return repeats
     */
    public boolean isRepeats() {
        return repeats;
    }


    /**
     * Sets the repeats value for this AlarmTriggeringActionTransitionSpec.
     * 
     * @param repeats
     */
    public void setRepeats(boolean repeats) {
        this.repeats = repeats;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlarmTriggeringActionTransitionSpec)) return false;
        AlarmTriggeringActionTransitionSpec other = (AlarmTriggeringActionTransitionSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.startState==null && other.getStartState()==null) || 
             (this.startState!=null &&
              this.startState.equals(other.getStartState()))) &&
            ((this.finalState==null && other.getFinalState()==null) || 
             (this.finalState!=null &&
              this.finalState.equals(other.getFinalState()))) &&
            this.repeats == other.isRepeats();
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
        if (getStartState() != null) {
            _hashCode += getStartState().hashCode();
        }
        if (getFinalState() != null) {
            _hashCode += getFinalState().hashCode();
        }
        _hashCode += (isRepeats() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlarmTriggeringActionTransitionSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "AlarmTriggeringActionTransitionSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "startState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedEntityStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finalState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "finalState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedEntityStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repeats");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "repeats"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
