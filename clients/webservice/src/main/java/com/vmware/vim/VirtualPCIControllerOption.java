/**
 * VirtualPCIControllerOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class VirtualPCIControllerOption  extends com.vmware.vim.VirtualControllerOption  implements java.io.Serializable {
    private com.vmware.vim.IntOption numSCSIControllers;

    private com.vmware.vim.IntOption numEthernetCards;

    private com.vmware.vim.IntOption numVideoCards;

    private com.vmware.vim.IntOption numSoundCards;

    public VirtualPCIControllerOption() {
    }

    public VirtualPCIControllerOption(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           java.lang.String type,
           com.vmware.vim.VirtualDeviceConnectOption connectOption,
           java.lang.String controllerType,
           com.vmware.vim.BoolOption autoAssignController,
           com.vmware.vim.VirtualDeviceBackingOption[] backingOption,
           java.lang.Integer defaultBackingOptionIndex,
           java.lang.String[] licensingLimit,
           boolean deprecated,
           boolean plugAndPlay,
           com.vmware.vim.IntOption devices,
           java.lang.String[] supportedDevice,
           com.vmware.vim.IntOption numSCSIControllers,
           com.vmware.vim.IntOption numEthernetCards,
           com.vmware.vim.IntOption numVideoCards,
           com.vmware.vim.IntOption numSoundCards) {
        super(
            dynamicType,
            dynamicProperty,
            type,
            connectOption,
            controllerType,
            autoAssignController,
            backingOption,
            defaultBackingOptionIndex,
            licensingLimit,
            deprecated,
            plugAndPlay,
            devices,
            supportedDevice);
        this.numSCSIControllers = numSCSIControllers;
        this.numEthernetCards = numEthernetCards;
        this.numVideoCards = numVideoCards;
        this.numSoundCards = numSoundCards;
    }


    /**
     * Gets the numSCSIControllers value for this VirtualPCIControllerOption.
     * 
     * @return numSCSIControllers
     */
    public com.vmware.vim.IntOption getNumSCSIControllers() {
        return numSCSIControllers;
    }


    /**
     * Sets the numSCSIControllers value for this VirtualPCIControllerOption.
     * 
     * @param numSCSIControllers
     */
    public void setNumSCSIControllers(com.vmware.vim.IntOption numSCSIControllers) {
        this.numSCSIControllers = numSCSIControllers;
    }


    /**
     * Gets the numEthernetCards value for this VirtualPCIControllerOption.
     * 
     * @return numEthernetCards
     */
    public com.vmware.vim.IntOption getNumEthernetCards() {
        return numEthernetCards;
    }


    /**
     * Sets the numEthernetCards value for this VirtualPCIControllerOption.
     * 
     * @param numEthernetCards
     */
    public void setNumEthernetCards(com.vmware.vim.IntOption numEthernetCards) {
        this.numEthernetCards = numEthernetCards;
    }


    /**
     * Gets the numVideoCards value for this VirtualPCIControllerOption.
     * 
     * @return numVideoCards
     */
    public com.vmware.vim.IntOption getNumVideoCards() {
        return numVideoCards;
    }


    /**
     * Sets the numVideoCards value for this VirtualPCIControllerOption.
     * 
     * @param numVideoCards
     */
    public void setNumVideoCards(com.vmware.vim.IntOption numVideoCards) {
        this.numVideoCards = numVideoCards;
    }


    /**
     * Gets the numSoundCards value for this VirtualPCIControllerOption.
     * 
     * @return numSoundCards
     */
    public com.vmware.vim.IntOption getNumSoundCards() {
        return numSoundCards;
    }


    /**
     * Sets the numSoundCards value for this VirtualPCIControllerOption.
     * 
     * @param numSoundCards
     */
    public void setNumSoundCards(com.vmware.vim.IntOption numSoundCards) {
        this.numSoundCards = numSoundCards;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualPCIControllerOption)) return false;
        VirtualPCIControllerOption other = (VirtualPCIControllerOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.numSCSIControllers==null && other.getNumSCSIControllers()==null) || 
             (this.numSCSIControllers!=null &&
              this.numSCSIControllers.equals(other.getNumSCSIControllers()))) &&
            ((this.numEthernetCards==null && other.getNumEthernetCards()==null) || 
             (this.numEthernetCards!=null &&
              this.numEthernetCards.equals(other.getNumEthernetCards()))) &&
            ((this.numVideoCards==null && other.getNumVideoCards()==null) || 
             (this.numVideoCards!=null &&
              this.numVideoCards.equals(other.getNumVideoCards()))) &&
            ((this.numSoundCards==null && other.getNumSoundCards()==null) || 
             (this.numSoundCards!=null &&
              this.numSoundCards.equals(other.getNumSoundCards())));
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
        if (getNumSCSIControllers() != null) {
            _hashCode += getNumSCSIControllers().hashCode();
        }
        if (getNumEthernetCards() != null) {
            _hashCode += getNumEthernetCards().hashCode();
        }
        if (getNumVideoCards() != null) {
            _hashCode += getNumVideoCards().hashCode();
        }
        if (getNumSoundCards() != null) {
            _hashCode += getNumSoundCards().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualPCIControllerOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "VirtualPCIControllerOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numSCSIControllers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "numSCSIControllers"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "IntOption"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numEthernetCards");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "numEthernetCards"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "IntOption"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numVideoCards");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "numVideoCards"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "IntOption"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numSoundCards");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "numSoundCards"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "IntOption"));
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
