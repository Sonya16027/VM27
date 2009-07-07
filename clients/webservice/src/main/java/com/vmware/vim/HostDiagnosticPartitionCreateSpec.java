/**
 * HostDiagnosticPartitionCreateSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostDiagnosticPartitionCreateSpec  extends com.vmware.vim.DynamicData  implements java.io.Serializable {
    private java.lang.String storageType;

    private java.lang.String diagnosticType;

    private com.vmware.vim.HostScsiDiskPartition id;

    private com.vmware.vim.HostDiskPartitionSpec partition;

    private java.lang.Boolean active;

    public HostDiagnosticPartitionCreateSpec() {
    }

    public HostDiagnosticPartitionCreateSpec(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           java.lang.String storageType,
           java.lang.String diagnosticType,
           com.vmware.vim.HostScsiDiskPartition id,
           com.vmware.vim.HostDiskPartitionSpec partition,
           java.lang.Boolean active) {
        super(
            dynamicType,
            dynamicProperty);
        this.storageType = storageType;
        this.diagnosticType = diagnosticType;
        this.id = id;
        this.partition = partition;
        this.active = active;
    }


    /**
     * Gets the storageType value for this HostDiagnosticPartitionCreateSpec.
     * 
     * @return storageType
     */
    public java.lang.String getStorageType() {
        return storageType;
    }


    /**
     * Sets the storageType value for this HostDiagnosticPartitionCreateSpec.
     * 
     * @param storageType
     */
    public void setStorageType(java.lang.String storageType) {
        this.storageType = storageType;
    }


    /**
     * Gets the diagnosticType value for this HostDiagnosticPartitionCreateSpec.
     * 
     * @return diagnosticType
     */
    public java.lang.String getDiagnosticType() {
        return diagnosticType;
    }


    /**
     * Sets the diagnosticType value for this HostDiagnosticPartitionCreateSpec.
     * 
     * @param diagnosticType
     */
    public void setDiagnosticType(java.lang.String diagnosticType) {
        this.diagnosticType = diagnosticType;
    }


    /**
     * Gets the id value for this HostDiagnosticPartitionCreateSpec.
     * 
     * @return id
     */
    public com.vmware.vim.HostScsiDiskPartition getId() {
        return id;
    }


    /**
     * Sets the id value for this HostDiagnosticPartitionCreateSpec.
     * 
     * @param id
     */
    public void setId(com.vmware.vim.HostScsiDiskPartition id) {
        this.id = id;
    }


    /**
     * Gets the partition value for this HostDiagnosticPartitionCreateSpec.
     * 
     * @return partition
     */
    public com.vmware.vim.HostDiskPartitionSpec getPartition() {
        return partition;
    }


    /**
     * Sets the partition value for this HostDiagnosticPartitionCreateSpec.
     * 
     * @param partition
     */
    public void setPartition(com.vmware.vim.HostDiskPartitionSpec partition) {
        this.partition = partition;
    }


    /**
     * Gets the active value for this HostDiagnosticPartitionCreateSpec.
     * 
     * @return active
     */
    public java.lang.Boolean getActive() {
        return active;
    }


    /**
     * Sets the active value for this HostDiagnosticPartitionCreateSpec.
     * 
     * @param active
     */
    public void setActive(java.lang.Boolean active) {
        this.active = active;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostDiagnosticPartitionCreateSpec)) return false;
        HostDiagnosticPartitionCreateSpec other = (HostDiagnosticPartitionCreateSpec) obj;
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
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.partition==null && other.getPartition()==null) || 
             (this.partition!=null &&
              this.partition.equals(other.getPartition()))) &&
            ((this.active==null && other.getActive()==null) || 
             (this.active!=null &&
              this.active.equals(other.getActive())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getPartition() != null) {
            _hashCode += getPartition().hashCode();
        }
        if (getActive() != null) {
            _hashCode += getActive().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostDiagnosticPartitionCreateSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostDiagnosticPartitionCreateSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storageType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "storageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diagnosticType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "diagnosticType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostScsiDiskPartition"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "partition"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostDiskPartitionSpec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
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
