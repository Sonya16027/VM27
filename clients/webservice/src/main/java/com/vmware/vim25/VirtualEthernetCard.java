/**
 * VirtualEthernetCard.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualEthernetCard  extends com.vmware.vim25.VirtualDevice  implements java.io.Serializable {
    private java.lang.String addressType;

    private java.lang.String macAddress;

    private java.lang.Boolean wakeOnLanEnabled;

    public VirtualEthernetCard() {
    }

    public VirtualEthernetCard(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           int key,
           com.vmware.vim25.Description deviceInfo,
           com.vmware.vim25.VirtualDeviceBackingInfo backing,
           com.vmware.vim25.VirtualDeviceConnectInfo connectable,
           java.lang.Integer controllerKey,
           java.lang.Integer unitNumber,
           java.lang.String addressType,
           java.lang.String macAddress,
           java.lang.Boolean wakeOnLanEnabled) {
        super(
            dynamicType,
            dynamicProperty,
            key,
            deviceInfo,
            backing,
            connectable,
            controllerKey,
            unitNumber);
        this.addressType = addressType;
        this.macAddress = macAddress;
        this.wakeOnLanEnabled = wakeOnLanEnabled;
    }


    /**
     * Gets the addressType value for this VirtualEthernetCard.
     * 
     * @return addressType
     */
    public java.lang.String getAddressType() {
        return addressType;
    }


    /**
     * Sets the addressType value for this VirtualEthernetCard.
     * 
     * @param addressType
     */
    public void setAddressType(java.lang.String addressType) {
        this.addressType = addressType;
    }


    /**
     * Gets the macAddress value for this VirtualEthernetCard.
     * 
     * @return macAddress
     */
    public java.lang.String getMacAddress() {
        return macAddress;
    }


    /**
     * Sets the macAddress value for this VirtualEthernetCard.
     * 
     * @param macAddress
     */
    public void setMacAddress(java.lang.String macAddress) {
        this.macAddress = macAddress;
    }


    /**
     * Gets the wakeOnLanEnabled value for this VirtualEthernetCard.
     * 
     * @return wakeOnLanEnabled
     */
    public java.lang.Boolean getWakeOnLanEnabled() {
        return wakeOnLanEnabled;
    }


    /**
     * Sets the wakeOnLanEnabled value for this VirtualEthernetCard.
     * 
     * @param wakeOnLanEnabled
     */
    public void setWakeOnLanEnabled(java.lang.Boolean wakeOnLanEnabled) {
        this.wakeOnLanEnabled = wakeOnLanEnabled;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualEthernetCard)) return false;
        VirtualEthernetCard other = (VirtualEthernetCard) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.addressType==null && other.getAddressType()==null) || 
             (this.addressType!=null &&
              this.addressType.equals(other.getAddressType()))) &&
            ((this.macAddress==null && other.getMacAddress()==null) || 
             (this.macAddress!=null &&
              this.macAddress.equals(other.getMacAddress()))) &&
            ((this.wakeOnLanEnabled==null && other.getWakeOnLanEnabled()==null) || 
             (this.wakeOnLanEnabled!=null &&
              this.wakeOnLanEnabled.equals(other.getWakeOnLanEnabled())));
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
        if (getAddressType() != null) {
            _hashCode += getAddressType().hashCode();
        }
        if (getMacAddress() != null) {
            _hashCode += getMacAddress().hashCode();
        }
        if (getWakeOnLanEnabled() != null) {
            _hashCode += getWakeOnLanEnabled().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualEthernetCard.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualEthernetCard"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "addressType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("macAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "macAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wakeOnLanEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "wakeOnLanEnabled"));
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
