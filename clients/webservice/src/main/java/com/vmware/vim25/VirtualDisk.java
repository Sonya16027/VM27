/**
 * VirtualDisk.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualDisk  extends com.vmware.vim25.VirtualDevice  implements java.io.Serializable {
    private long capacityInKB;

    private com.vmware.vim25.SharesInfo shares;

    public VirtualDisk() {
    }

    public VirtualDisk(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           int key,
           com.vmware.vim25.Description deviceInfo,
           com.vmware.vim25.VirtualDeviceBackingInfo backing,
           com.vmware.vim25.VirtualDeviceConnectInfo connectable,
           java.lang.Integer controllerKey,
           java.lang.Integer unitNumber,
           long capacityInKB,
           com.vmware.vim25.SharesInfo shares) {
        super(
            dynamicType,
            dynamicProperty,
            key,
            deviceInfo,
            backing,
            connectable,
            controllerKey,
            unitNumber);
        this.capacityInKB = capacityInKB;
        this.shares = shares;
    }


    /**
     * Gets the capacityInKB value for this VirtualDisk.
     * 
     * @return capacityInKB
     */
    public long getCapacityInKB() {
        return capacityInKB;
    }


    /**
     * Sets the capacityInKB value for this VirtualDisk.
     * 
     * @param capacityInKB
     */
    public void setCapacityInKB(long capacityInKB) {
        this.capacityInKB = capacityInKB;
    }


    /**
     * Gets the shares value for this VirtualDisk.
     * 
     * @return shares
     */
    public com.vmware.vim25.SharesInfo getShares() {
        return shares;
    }


    /**
     * Sets the shares value for this VirtualDisk.
     * 
     * @param shares
     */
    public void setShares(com.vmware.vim25.SharesInfo shares) {
        this.shares = shares;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualDisk)) return false;
        VirtualDisk other = (VirtualDisk) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.capacityInKB == other.getCapacityInKB() &&
            ((this.shares==null && other.getShares()==null) || 
             (this.shares!=null &&
              this.shares.equals(other.getShares())));
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
        _hashCode += new Long(getCapacityInKB()).hashCode();
        if (getShares() != null) {
            _hashCode += getShares().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualDisk.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDisk"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capacityInKB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "capacityInKB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shares");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "shares"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "SharesInfo"));
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
