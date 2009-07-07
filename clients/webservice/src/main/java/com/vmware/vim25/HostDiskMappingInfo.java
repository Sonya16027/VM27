/**
 * HostDiskMappingInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostDiskMappingInfo  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private com.vmware.vim25.HostDiskMappingPartitionInfo physicalPartition;

    private java.lang.String name;

    private java.lang.Boolean exclusive;

    public HostDiskMappingInfo() {
    }

    public HostDiskMappingInfo(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.HostDiskMappingPartitionInfo physicalPartition,
           java.lang.String name,
           java.lang.Boolean exclusive) {
        super(
            dynamicType,
            dynamicProperty);
        this.physicalPartition = physicalPartition;
        this.name = name;
        this.exclusive = exclusive;
    }


    /**
     * Gets the physicalPartition value for this HostDiskMappingInfo.
     * 
     * @return physicalPartition
     */
    public com.vmware.vim25.HostDiskMappingPartitionInfo getPhysicalPartition() {
        return physicalPartition;
    }


    /**
     * Sets the physicalPartition value for this HostDiskMappingInfo.
     * 
     * @param physicalPartition
     */
    public void setPhysicalPartition(com.vmware.vim25.HostDiskMappingPartitionInfo physicalPartition) {
        this.physicalPartition = physicalPartition;
    }


    /**
     * Gets the name value for this HostDiskMappingInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this HostDiskMappingInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the exclusive value for this HostDiskMappingInfo.
     * 
     * @return exclusive
     */
    public java.lang.Boolean getExclusive() {
        return exclusive;
    }


    /**
     * Sets the exclusive value for this HostDiskMappingInfo.
     * 
     * @param exclusive
     */
    public void setExclusive(java.lang.Boolean exclusive) {
        this.exclusive = exclusive;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostDiskMappingInfo)) return false;
        HostDiskMappingInfo other = (HostDiskMappingInfo) obj;
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
              this.physicalPartition.equals(other.getPhysicalPartition()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.exclusive==null && other.getExclusive()==null) || 
             (this.exclusive!=null &&
              this.exclusive.equals(other.getExclusive())));
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
            _hashCode += getPhysicalPartition().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getExclusive() != null) {
            _hashCode += getExclusive().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostDiskMappingInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostDiskMappingInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("physicalPartition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "physicalPartition"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostDiskMappingPartitionInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exclusive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "exclusive"));
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
