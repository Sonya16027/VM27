/**
 * VirtualMachineVMCIDevice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualMachineVMCIDevice  extends com.vmware.vim25.VirtualDevice  implements java.io.Serializable {
    private java.lang.Long id;

    private java.lang.Boolean allowUnrestrictedCommunication;

    public VirtualMachineVMCIDevice() {
    }

    public VirtualMachineVMCIDevice(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           int key,
           com.vmware.vim25.Description deviceInfo,
           com.vmware.vim25.VirtualDeviceBackingInfo backing,
           com.vmware.vim25.VirtualDeviceConnectInfo connectable,
           java.lang.Integer controllerKey,
           java.lang.Integer unitNumber,
           java.lang.Long id,
           java.lang.Boolean allowUnrestrictedCommunication) {
        super(
            dynamicType,
            dynamicProperty,
            key,
            deviceInfo,
            backing,
            connectable,
            controllerKey,
            unitNumber);
        this.id = id;
        this.allowUnrestrictedCommunication = allowUnrestrictedCommunication;
    }


    /**
     * Gets the id value for this VirtualMachineVMCIDevice.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this VirtualMachineVMCIDevice.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the allowUnrestrictedCommunication value for this VirtualMachineVMCIDevice.
     * 
     * @return allowUnrestrictedCommunication
     */
    public java.lang.Boolean getAllowUnrestrictedCommunication() {
        return allowUnrestrictedCommunication;
    }


    /**
     * Sets the allowUnrestrictedCommunication value for this VirtualMachineVMCIDevice.
     * 
     * @param allowUnrestrictedCommunication
     */
    public void setAllowUnrestrictedCommunication(java.lang.Boolean allowUnrestrictedCommunication) {
        this.allowUnrestrictedCommunication = allowUnrestrictedCommunication;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualMachineVMCIDevice)) return false;
        VirtualMachineVMCIDevice other = (VirtualMachineVMCIDevice) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.allowUnrestrictedCommunication==null && other.getAllowUnrestrictedCommunication()==null) || 
             (this.allowUnrestrictedCommunication!=null &&
              this.allowUnrestrictedCommunication.equals(other.getAllowUnrestrictedCommunication())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getAllowUnrestrictedCommunication() != null) {
            _hashCode += getAllowUnrestrictedCommunication().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualMachineVMCIDevice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineVMCIDevice"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowUnrestrictedCommunication");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "allowUnrestrictedCommunication"));
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
