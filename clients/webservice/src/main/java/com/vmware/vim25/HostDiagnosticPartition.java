/**
 * HostDiagnosticPartition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostDiagnosticPartition  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.String storageType;

    private java.lang.String diagnosticType;

    private int slots;

    private com.vmware.vim25.HostScsiDiskPartition id;

    public HostDiagnosticPartition() {
    }

    public HostDiagnosticPartition(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String storageType,
           java.lang.String diagnosticType,
           int slots,
           com.vmware.vim25.HostScsiDiskPartition id) {
        super(
            dynamicType,
            dynamicProperty);
        this.storageType = storageType;
        this.diagnosticType = diagnosticType;
        this.slots = slots;
        this.id = id;
    }


    /**
     * Gets the storageType value for this HostDiagnosticPartition.
     * 
     * @return storageType
     */
    public java.lang.String getStorageType() {
        return storageType;
    }


    /**
     * Sets the storageType value for this HostDiagnosticPartition.
     * 
     * @param storageType
     */
    public void setStorageType(java.lang.String storageType) {
        this.storageType = storageType;
    }


    /**
     * Gets the diagnosticType value for this HostDiagnosticPartition.
     * 
     * @return diagnosticType
     */
    public java.lang.String getDiagnosticType() {
        return diagnosticType;
    }


    /**
     * Sets the diagnosticType value for this HostDiagnosticPartition.
     * 
     * @param diagnosticType
     */
    public void setDiagnosticType(java.lang.String diagnosticType) {
        this.diagnosticType = diagnosticType;
    }


    /**
     * Gets the slots value for this HostDiagnosticPartition.
     * 
     * @return slots
     */
    public int getSlots() {
        return slots;
    }


    /**
     * Sets the slots value for this HostDiagnosticPartition.
     * 
     * @param slots
     */
    public void setSlots(int slots) {
        this.slots = slots;
    }


    /**
     * Gets the id value for this HostDiagnosticPartition.
     * 
     * @return id
     */
    public com.vmware.vim25.HostScsiDiskPartition getId() {
        return id;
    }


    /**
     * Sets the id value for this HostDiagnosticPartition.
     * 
     * @param id
     */
    public void setId(com.vmware.vim25.HostScsiDiskPartition id) {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostDiagnosticPartition)) return false;
        HostDiagnosticPartition other = (HostDiagnosticPartition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.storageType==null && other.getStorageType()==null) || 
             (this.storageType!=null &&
              this.storageType.equals(other.getStorageType()))) &&
            ((this.diagnosticType==null && other.getDiagnosticType()==null) || 
             (this.diagnosticType!=null &&
              this.diagnosticType.equals(other.getDiagnosticType()))) &&
            this.slots == other.getSlots() &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId())));
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
        if (getStorageType() != null) {
            _hashCode += getStorageType().hashCode();
        }
        if (getDiagnosticType() != null) {
            _hashCode += getDiagnosticType().hashCode();
        }
        _hashCode += getSlots();
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostDiagnosticPartition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostDiagnosticPartition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storageType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "storageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diagnosticType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "diagnosticType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("slots");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "slots"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostScsiDiskPartition"));
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
