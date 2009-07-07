/**
 * DistributedVirtualSwitchHostMemberPnicSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class DistributedVirtualSwitchHostMemberPnicSpec  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.String pnicDevice;

    private java.lang.String uplinkPortKey;

    private java.lang.String uplinkPortgroupKey;

    private java.lang.Integer connectionCookie;

    public DistributedVirtualSwitchHostMemberPnicSpec() {
    }

    public DistributedVirtualSwitchHostMemberPnicSpec(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String pnicDevice,
           java.lang.String uplinkPortKey,
           java.lang.String uplinkPortgroupKey,
           java.lang.Integer connectionCookie) {
        super(
            dynamicType,
            dynamicProperty);
        this.pnicDevice = pnicDevice;
        this.uplinkPortKey = uplinkPortKey;
        this.uplinkPortgroupKey = uplinkPortgroupKey;
        this.connectionCookie = connectionCookie;
    }


    /**
     * Gets the pnicDevice value for this DistributedVirtualSwitchHostMemberPnicSpec.
     * 
     * @return pnicDevice
     */
    public java.lang.String getPnicDevice() {
        return pnicDevice;
    }


    /**
     * Sets the pnicDevice value for this DistributedVirtualSwitchHostMemberPnicSpec.
     * 
     * @param pnicDevice
     */
    public void setPnicDevice(java.lang.String pnicDevice) {
        this.pnicDevice = pnicDevice;
    }


    /**
     * Gets the uplinkPortKey value for this DistributedVirtualSwitchHostMemberPnicSpec.
     * 
     * @return uplinkPortKey
     */
    public java.lang.String getUplinkPortKey() {
        return uplinkPortKey;
    }


    /**
     * Sets the uplinkPortKey value for this DistributedVirtualSwitchHostMemberPnicSpec.
     * 
     * @param uplinkPortKey
     */
    public void setUplinkPortKey(java.lang.String uplinkPortKey) {
        this.uplinkPortKey = uplinkPortKey;
    }


    /**
     * Gets the uplinkPortgroupKey value for this DistributedVirtualSwitchHostMemberPnicSpec.
     * 
     * @return uplinkPortgroupKey
     */
    public java.lang.String getUplinkPortgroupKey() {
        return uplinkPortgroupKey;
    }


    /**
     * Sets the uplinkPortgroupKey value for this DistributedVirtualSwitchHostMemberPnicSpec.
     * 
     * @param uplinkPortgroupKey
     */
    public void setUplinkPortgroupKey(java.lang.String uplinkPortgroupKey) {
        this.uplinkPortgroupKey = uplinkPortgroupKey;
    }


    /**
     * Gets the connectionCookie value for this DistributedVirtualSwitchHostMemberPnicSpec.
     * 
     * @return connectionCookie
     */
    public java.lang.Integer getConnectionCookie() {
        return connectionCookie;
    }


    /**
     * Sets the connectionCookie value for this DistributedVirtualSwitchHostMemberPnicSpec.
     * 
     * @param connectionCookie
     */
    public void setConnectionCookie(java.lang.Integer connectionCookie) {
        this.connectionCookie = connectionCookie;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DistributedVirtualSwitchHostMemberPnicSpec)) return false;
        DistributedVirtualSwitchHostMemberPnicSpec other = (DistributedVirtualSwitchHostMemberPnicSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.pnicDevice==null && other.getPnicDevice()==null) || 
             (this.pnicDevice!=null &&
              this.pnicDevice.equals(other.getPnicDevice()))) &&
            ((this.uplinkPortKey==null && other.getUplinkPortKey()==null) || 
             (this.uplinkPortKey!=null &&
              this.uplinkPortKey.equals(other.getUplinkPortKey()))) &&
            ((this.uplinkPortgroupKey==null && other.getUplinkPortgroupKey()==null) || 
             (this.uplinkPortgroupKey!=null &&
              this.uplinkPortgroupKey.equals(other.getUplinkPortgroupKey()))) &&
            ((this.connectionCookie==null && other.getConnectionCookie()==null) || 
             (this.connectionCookie!=null &&
              this.connectionCookie.equals(other.getConnectionCookie())));
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
        if (getPnicDevice() != null) {
            _hashCode += getPnicDevice().hashCode();
        }
        if (getUplinkPortKey() != null) {
            _hashCode += getUplinkPortKey().hashCode();
        }
        if (getUplinkPortgroupKey() != null) {
            _hashCode += getUplinkPortgroupKey().hashCode();
        }
        if (getConnectionCookie() != null) {
            _hashCode += getConnectionCookie().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DistributedVirtualSwitchHostMemberPnicSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchHostMemberPnicSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pnicDevice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "pnicDevice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uplinkPortKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "uplinkPortKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uplinkPortgroupKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "uplinkPortgroupKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectionCookie");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "connectionCookie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
