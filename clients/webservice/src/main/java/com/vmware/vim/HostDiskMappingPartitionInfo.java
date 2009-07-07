/**
 * HostDiskMappingPartitionInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostDiskMappingPartitionInfo  extends com.vmware.vim.DynamicData  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String fileSystem;

    private long capacityInKb;

    public HostDiskMappingPartitionInfo() {
    }

    public HostDiskMappingPartitionInfo(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           java.lang.String name,
           java.lang.String fileSystem,
           long capacityInKb) {
        super(
            dynamicType,
            dynamicProperty);
        this.name = name;
        this.fileSystem = fileSystem;
        this.capacityInKb = capacityInKb;
    }


    /**
     * Gets the name value for this HostDiskMappingPartitionInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this HostDiskMappingPartitionInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the fileSystem value for this HostDiskMappingPartitionInfo.
     * 
     * @return fileSystem
     */
    public java.lang.String getFileSystem() {
        return fileSystem;
    }


    /**
     * Sets the fileSystem value for this HostDiskMappingPartitionInfo.
     * 
     * @param fileSystem
     */
    public void setFileSystem(java.lang.String fileSystem) {
        this.fileSystem = fileSystem;
    }


    /**
     * Gets the capacityInKb value for this HostDiskMappingPartitionInfo.
     * 
     * @return capacityInKb
     */
    public long getCapacityInKb() {
        return capacityInKb;
    }


    /**
     * Sets the capacityInKb value for this HostDiskMappingPartitionInfo.
     * 
     * @param capacityInKb
     */
    public void setCapacityInKb(long capacityInKb) {
        this.capacityInKb = capacityInKb;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostDiskMappingPartitionInfo)) return false;
        HostDiskMappingPartitionInfo other = (HostDiskMappingPartitionInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.fileSystem==null && other.getFileSystem()==null) || 
             (this.fileSystem!=null &&
              this.fileSystem.equals(other.getFileSystem()))) &&
            this.capacityInKb == other.getCapacityInKb();
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getFileSystem() != null) {
            _hashCode += getFileSystem().hashCode();
        }
        _hashCode += new Long(getCapacityInKb()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostDiskMappingPartitionInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostDiskMappingPartitionInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "fileSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capacityInKb");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "capacityInKb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
