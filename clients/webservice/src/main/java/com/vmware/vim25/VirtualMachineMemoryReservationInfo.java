/**
 * VirtualMachineMemoryReservationInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualMachineMemoryReservationInfo  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private long virtualMachineMin;

    private long virtualMachineMax;

    private long virtualMachineReserved;

    private java.lang.String allocationPolicy;

    public VirtualMachineMemoryReservationInfo() {
    }

    public VirtualMachineMemoryReservationInfo(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           long virtualMachineMin,
           long virtualMachineMax,
           long virtualMachineReserved,
           java.lang.String allocationPolicy) {
        super(
            dynamicType,
            dynamicProperty);
        this.virtualMachineMin = virtualMachineMin;
        this.virtualMachineMax = virtualMachineMax;
        this.virtualMachineReserved = virtualMachineReserved;
        this.allocationPolicy = allocationPolicy;
    }


    /**
     * Gets the virtualMachineMin value for this VirtualMachineMemoryReservationInfo.
     * 
     * @return virtualMachineMin
     */
    public long getVirtualMachineMin() {
        return virtualMachineMin;
    }


    /**
     * Sets the virtualMachineMin value for this VirtualMachineMemoryReservationInfo.
     * 
     * @param virtualMachineMin
     */
    public void setVirtualMachineMin(long virtualMachineMin) {
        this.virtualMachineMin = virtualMachineMin;
    }


    /**
     * Gets the virtualMachineMax value for this VirtualMachineMemoryReservationInfo.
     * 
     * @return virtualMachineMax
     */
    public long getVirtualMachineMax() {
        return virtualMachineMax;
    }


    /**
     * Sets the virtualMachineMax value for this VirtualMachineMemoryReservationInfo.
     * 
     * @param virtualMachineMax
     */
    public void setVirtualMachineMax(long virtualMachineMax) {
        this.virtualMachineMax = virtualMachineMax;
    }


    /**
     * Gets the virtualMachineReserved value for this VirtualMachineMemoryReservationInfo.
     * 
     * @return virtualMachineReserved
     */
    public long getVirtualMachineReserved() {
        return virtualMachineReserved;
    }


    /**
     * Sets the virtualMachineReserved value for this VirtualMachineMemoryReservationInfo.
     * 
     * @param virtualMachineReserved
     */
    public void setVirtualMachineReserved(long virtualMachineReserved) {
        this.virtualMachineReserved = virtualMachineReserved;
    }


    /**
     * Gets the allocationPolicy value for this VirtualMachineMemoryReservationInfo.
     * 
     * @return allocationPolicy
     */
    public java.lang.String getAllocationPolicy() {
        return allocationPolicy;
    }


    /**
     * Sets the allocationPolicy value for this VirtualMachineMemoryReservationInfo.
     * 
     * @param allocationPolicy
     */
    public void setAllocationPolicy(java.lang.String allocationPolicy) {
        this.allocationPolicy = allocationPolicy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualMachineMemoryReservationInfo)) return false;
        VirtualMachineMemoryReservationInfo other = (VirtualMachineMemoryReservationInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.virtualMachineMin == other.getVirtualMachineMin() &&
            this.virtualMachineMax == other.getVirtualMachineMax() &&
            this.virtualMachineReserved == other.getVirtualMachineReserved() &&
            ((this.allocationPolicy==null && other.getAllocationPolicy()==null) || 
             (this.allocationPolicy!=null &&
              this.allocationPolicy.equals(other.getAllocationPolicy())));
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
        _hashCode += new Long(getVirtualMachineMin()).hashCode();
        _hashCode += new Long(getVirtualMachineMax()).hashCode();
        _hashCode += new Long(getVirtualMachineReserved()).hashCode();
        if (getAllocationPolicy() != null) {
            _hashCode += getAllocationPolicy().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualMachineMemoryReservationInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineMemoryReservationInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualMachineMin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "virtualMachineMin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualMachineMax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "virtualMachineMax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualMachineReserved");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "virtualMachineReserved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allocationPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "allocationPolicy"));
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
