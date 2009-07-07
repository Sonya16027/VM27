/**
 * VirtualMachineMemoryReservationSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualMachineMemoryReservationSpec  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.Long virtualMachineReserved;

    private java.lang.String allocationPolicy;

    public VirtualMachineMemoryReservationSpec() {
    }

    public VirtualMachineMemoryReservationSpec(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.Long virtualMachineReserved,
           java.lang.String allocationPolicy) {
        super(
            dynamicType,
            dynamicProperty);
        this.virtualMachineReserved = virtualMachineReserved;
        this.allocationPolicy = allocationPolicy;
    }


    /**
     * Gets the virtualMachineReserved value for this VirtualMachineMemoryReservationSpec.
     * 
     * @return virtualMachineReserved
     */
    public java.lang.Long getVirtualMachineReserved() {
        return virtualMachineReserved;
    }


    /**
     * Sets the virtualMachineReserved value for this VirtualMachineMemoryReservationSpec.
     * 
     * @param virtualMachineReserved
     */
    public void setVirtualMachineReserved(java.lang.Long virtualMachineReserved) {
        this.virtualMachineReserved = virtualMachineReserved;
    }


    /**
     * Gets the allocationPolicy value for this VirtualMachineMemoryReservationSpec.
     * 
     * @return allocationPolicy
     */
    public java.lang.String getAllocationPolicy() {
        return allocationPolicy;
    }


    /**
     * Sets the allocationPolicy value for this VirtualMachineMemoryReservationSpec.
     * 
     * @param allocationPolicy
     */
    public void setAllocationPolicy(java.lang.String allocationPolicy) {
        this.allocationPolicy = allocationPolicy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualMachineMemoryReservationSpec)) return false;
        VirtualMachineMemoryReservationSpec other = (VirtualMachineMemoryReservationSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.virtualMachineReserved==null && other.getVirtualMachineReserved()==null) || 
             (this.virtualMachineReserved!=null &&
              this.virtualMachineReserved.equals(other.getVirtualMachineReserved()))) &&
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
        if (getVirtualMachineReserved() != null) {
            _hashCode += getVirtualMachineReserved().hashCode();
        }
        if (getAllocationPolicy() != null) {
            _hashCode += getAllocationPolicy().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualMachineMemoryReservationSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineMemoryReservationSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualMachineReserved");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "virtualMachineReserved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allocationPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "allocationPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
