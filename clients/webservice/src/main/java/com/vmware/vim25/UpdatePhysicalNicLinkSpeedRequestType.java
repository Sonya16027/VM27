/**
 * UpdatePhysicalNicLinkSpeedRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class UpdatePhysicalNicLinkSpeedRequestType  implements java.io.Serializable {
    private com.vmware.vim25.ManagedObjectReference _this;

    private java.lang.String device;

    private com.vmware.vim25.PhysicalNicLinkInfo linkSpeed;

    public UpdatePhysicalNicLinkSpeedRequestType() {
    }

    public UpdatePhysicalNicLinkSpeedRequestType(
           com.vmware.vim25.ManagedObjectReference _this,
           java.lang.String device,
           com.vmware.vim25.PhysicalNicLinkInfo linkSpeed) {
           this._this = _this;
           this.device = device;
           this.linkSpeed = linkSpeed;
    }


    /**
     * Gets the _this value for this UpdatePhysicalNicLinkSpeedRequestType.
     * 
     * @return _this
     */
    public com.vmware.vim25.ManagedObjectReference get_this() {
        return _this;
    }


    /**
     * Sets the _this value for this UpdatePhysicalNicLinkSpeedRequestType.
     * 
     * @param _this
     */
    public void set_this(com.vmware.vim25.ManagedObjectReference _this) {
        this._this = _this;
    }


    /**
     * Gets the device value for this UpdatePhysicalNicLinkSpeedRequestType.
     * 
     * @return device
     */
    public java.lang.String getDevice() {
        return device;
    }


    /**
     * Sets the device value for this UpdatePhysicalNicLinkSpeedRequestType.
     * 
     * @param device
     */
    public void setDevice(java.lang.String device) {
        this.device = device;
    }


    /**
     * Gets the linkSpeed value for this UpdatePhysicalNicLinkSpeedRequestType.
     * 
     * @return linkSpeed
     */
    public com.vmware.vim25.PhysicalNicLinkInfo getLinkSpeed() {
        return linkSpeed;
    }


    /**
     * Sets the linkSpeed value for this UpdatePhysicalNicLinkSpeedRequestType.
     * 
     * @param linkSpeed
     */
    public void setLinkSpeed(com.vmware.vim25.PhysicalNicLinkInfo linkSpeed) {
        this.linkSpeed = linkSpeed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdatePhysicalNicLinkSpeedRequestType)) return false;
        UpdatePhysicalNicLinkSpeedRequestType other = (UpdatePhysicalNicLinkSpeedRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._this==null && other.get_this()==null) || 
             (this._this!=null &&
              this._this.equals(other.get_this()))) &&
            ((this.device==null && other.getDevice()==null) || 
             (this.device!=null &&
              this.device.equals(other.getDevice()))) &&
            ((this.linkSpeed==null && other.getLinkSpeed()==null) || 
             (this.linkSpeed!=null &&
              this.linkSpeed.equals(other.getLinkSpeed())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (get_this() != null) {
            _hashCode += get_this().hashCode();
        }
        if (getDevice() != null) {
            _hashCode += getDevice().hashCode();
        }
        if (getLinkSpeed() != null) {
            _hashCode += getLinkSpeed().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdatePhysicalNicLinkSpeedRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "UpdatePhysicalNicLinkSpeedRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_this");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "_this"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("device");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "device"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkSpeed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "linkSpeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PhysicalNicLinkInfo"));
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
