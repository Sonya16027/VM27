/**
 * HostDiskMappingOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostDiskMappingOption  extends com.vmware.vim.DynamicData  implements java.io.Serializable {
    private com.vmware.vim.HostDiskMappingPartitionOption[] physicalPartition;

    private java.lang.String name;

    public HostDiskMappingOption() {
    }

    public HostDiskMappingOption(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           com.vmware.vim.HostDiskMappingPartitionOption[] physicalPartition,
           java.lang.String name) {
        super(
            dynamicType,
            dynamicProperty);
        this.physicalPartition = physicalPartition;
        this.name = name;
    }


    /**
     * Gets the physicalPartition value for this HostDiskMappingOption.
     * 
     * @return physicalPartition
     */
    public com.vmware.vim.HostDiskMappingPartitionOption[] getPhysicalPartition() {
        return physicalPartition;
    }


    /**
     * Sets the physicalPartition value for this HostDiskMappingOption.
     * 
     * @param physicalPartition
     */
    public void setPhysicalPartition(com.vmware.vim.HostDiskMappingPartitionOption[] physicalPartition) {
        this.physicalPartition = physicalPartition;
    }

    public com.vmware.vim.HostDiskMappingPartitionOption getPhysicalPartition(int i) {
        return this.physicalPartition[i];
    }

    public void setPhysicalPartition(int i, com.vmware.vim.HostDiskMappingPartitionOption _value) {
        this.physicalPartition[i] = _value;
    }


    /**
     * Gets the name value for this HostDiskMappingOption.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this HostDiskMappingOption.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostDiskMappingOption)) return false;
        HostDiskMappingOption other = (HostDiskMappingOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.physicalPartition==null && other.getPhysicalPartition()==null) || 
             (this.physicalPartition!=null &&
              java.util.Arrays.equals(this.physicalPartition, other.getPhysicalPartition()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName())));
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
        if (getPhysicalPartition() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPhysicalPartition());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPhysicalPartition(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostDiskMappingOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostDiskMappingOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("physicalPartition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "physicalPartition"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostDiskMappingPartitionOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
