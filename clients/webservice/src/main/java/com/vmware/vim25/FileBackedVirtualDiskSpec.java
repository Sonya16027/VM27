/**
 * FileBackedVirtualDiskSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class FileBackedVirtualDiskSpec  extends com.vmware.vim25.VirtualDiskSpec  implements java.io.Serializable {
    private long capacityKb;

    public FileBackedVirtualDiskSpec() {
    }

    public FileBackedVirtualDiskSpec(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String diskType,
           java.lang.String adapterType,
           long capacityKb) {
        super(
            dynamicType,
            dynamicProperty,
            diskType,
            adapterType);
        this.capacityKb = capacityKb;
    }


    /**
     * Gets the capacityKb value for this FileBackedVirtualDiskSpec.
     * 
     * @return capacityKb
     */
    public long getCapacityKb() {
        return capacityKb;
    }


    /**
     * Sets the capacityKb value for this FileBackedVirtualDiskSpec.
     * 
     * @param capacityKb
     */
    public void setCapacityKb(long capacityKb) {
        this.capacityKb = capacityKb;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FileBackedVirtualDiskSpec)) return false;
        FileBackedVirtualDiskSpec other = (FileBackedVirtualDiskSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.capacityKb == other.getCapacityKb();
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
        _hashCode += new Long(getCapacityKb()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FileBackedVirtualDiskSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "FileBackedVirtualDiskSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capacityKb");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "capacityKb"));
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
