/**
 * VmFaultToleranceOpIssuesList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VmFaultToleranceOpIssuesList  extends com.vmware.vim25.VmFaultToleranceIssue  implements java.io.Serializable {
    private com.vmware.vim25.LocalizedMethodFault[] errors;

    private com.vmware.vim25.LocalizedMethodFault[] warnings;

    public VmFaultToleranceOpIssuesList() {
    }

    public VmFaultToleranceOpIssuesList(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.LocalizedMethodFault faultCause,
           com.vmware.vim25.LocalizableMessage[] faultMessage,
           com.vmware.vim25.LocalizedMethodFault[] errors,
           com.vmware.vim25.LocalizedMethodFault[] warnings) {
        super(
            dynamicType,
            dynamicProperty,
            faultCause,
            faultMessage);
        this.errors = errors;
        this.warnings = warnings;
    }


    /**
     * Gets the errors value for this VmFaultToleranceOpIssuesList.
     * 
     * @return errors
     */
    public com.vmware.vim25.LocalizedMethodFault[] getErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this VmFaultToleranceOpIssuesList.
     * 
     * @param errors
     */
    public void setErrors(com.vmware.vim25.LocalizedMethodFault[] errors) {
        this.errors = errors;
    }

    public com.vmware.vim25.LocalizedMethodFault getErrors(int i) {
        return this.errors[i];
    }

    public void setErrors(int i, com.vmware.vim25.LocalizedMethodFault _value) {
        this.errors[i] = _value;
    }


    /**
     * Gets the warnings value for this VmFaultToleranceOpIssuesList.
     * 
     * @return warnings
     */
    public com.vmware.vim25.LocalizedMethodFault[] getWarnings() {
        return warnings;
    }


    /**
     * Sets the warnings value for this VmFaultToleranceOpIssuesList.
     * 
     * @param warnings
     */
    public void setWarnings(com.vmware.vim25.LocalizedMethodFault[] warnings) {
        this.warnings = warnings;
    }

    public com.vmware.vim25.LocalizedMethodFault getWarnings(int i) {
        return this.warnings[i];
    }

    public void setWarnings(int i, com.vmware.vim25.LocalizedMethodFault _value) {
        this.warnings[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VmFaultToleranceOpIssuesList)) return false;
        VmFaultToleranceOpIssuesList other = (VmFaultToleranceOpIssuesList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.errors==null && other.getErrors()==null) || 
             (this.errors!=null &&
              java.util.Arrays.equals(this.errors, other.getErrors()))) &&
            ((this.warnings==null && other.getWarnings()==null) || 
             (this.warnings!=null &&
              java.util.Arrays.equals(this.warnings, other.getWarnings())));
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
        if (getErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWarnings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWarnings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWarnings(), i);
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
        new org.apache.axis.description.TypeDesc(VmFaultToleranceOpIssuesList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VmFaultToleranceOpIssuesList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errors");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "errors"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LocalizedMethodFault"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warnings");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "warnings"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LocalizedMethodFault"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
