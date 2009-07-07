/**
 * SnapshotRevertIssue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class SnapshotRevertIssue  extends com.vmware.vim.MigrationFault  implements java.io.Serializable {
    private java.lang.String snapshotName;

    private com.vmware.vim.Event[] event;

    private boolean errors;

    public SnapshotRevertIssue() {
    }

    public SnapshotRevertIssue(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           java.lang.String snapshotName,
           com.vmware.vim.Event[] event,
           boolean errors) {
        super(
            dynamicType,
            dynamicProperty);
        this.snapshotName = snapshotName;
        this.event = event;
        this.errors = errors;
    }


    /**
     * Gets the snapshotName value for this SnapshotRevertIssue.
     * 
     * @return snapshotName
     */
    public java.lang.String getSnapshotName() {
        return snapshotName;
    }


    /**
     * Sets the snapshotName value for this SnapshotRevertIssue.
     * 
     * @param snapshotName
     */
    public void setSnapshotName(java.lang.String snapshotName) {
        this.snapshotName = snapshotName;
    }


    /**
     * Gets the event value for this SnapshotRevertIssue.
     * 
     * @return event
     */
    public com.vmware.vim.Event[] getEvent() {
        return event;
    }


    /**
     * Sets the event value for this SnapshotRevertIssue.
     * 
     * @param event
     */
    public void setEvent(com.vmware.vim.Event[] event) {
        this.event = event;
    }

    public com.vmware.vim.Event getEvent(int i) {
        return this.event[i];
    }

    public void setEvent(int i, com.vmware.vim.Event _value) {
        this.event[i] = _value;
    }


    /**
     * Gets the errors value for this SnapshotRevertIssue.
     * 
     * @return errors
     */
    public boolean isErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this SnapshotRevertIssue.
     * 
     * @param errors
     */
    public void setErrors(boolean errors) {
        this.errors = errors;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SnapshotRevertIssue)) return false;
        SnapshotRevertIssue other = (SnapshotRevertIssue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.snapshotName==null && other.getSnapshotName()==null) || 
             (this.snapshotName!=null &&
              this.snapshotName.equals(other.getSnapshotName()))) &&
            ((this.event==null && other.getEvent()==null) || 
             (this.event!=null &&
              java.util.Arrays.equals(this.event, other.getEvent()))) &&
            this.errors == other.isErrors();
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
        if (getSnapshotName() != null) {
            _hashCode += getSnapshotName().hashCode();
        }
        if (getEvent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEvent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEvent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isErrors() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SnapshotRevertIssue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "SnapshotRevertIssue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snapshotName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "snapshotName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("event");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "event"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "Event"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errors");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "errors"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
