/**
 * HostScsiDisk.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostScsiDisk  extends com.vmware.vim25.ScsiLun  implements java.io.Serializable {
    private com.vmware.vim25.HostDiskDimensionsLba capacity;

    private java.lang.String devicePath;

    public HostScsiDisk() {
    }

    public HostScsiDisk(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String deviceName,
           java.lang.String deviceType,
           java.lang.String key,
           java.lang.String uuid,
           com.vmware.vim25.ScsiLunDescriptor[] descriptor,
           java.lang.String canonicalName,
           java.lang.String displayName,
           java.lang.String lunType,
           java.lang.String vendor,
           java.lang.String model,
           java.lang.String revision,
           java.lang.Integer scsiLevel,
           java.lang.String serialNumber,
           com.vmware.vim25.ScsiLunDurableName durableName,
           com.vmware.vim25.ScsiLunDurableName[] alternateName,
           byte[] standardInquiry,
           java.lang.Integer queueDepth,
           java.lang.String[] operationalState,
           com.vmware.vim25.ScsiLunCapabilities capabilities,
           com.vmware.vim25.HostDiskDimensionsLba capacity,
           java.lang.String devicePath) {
        super(
            dynamicType,
            dynamicProperty,
            deviceName,
            deviceType,
            key,
            uuid,
            descriptor,
            canonicalName,
            displayName,
            lunType,
            vendor,
            model,
            revision,
            scsiLevel,
            serialNumber,
            durableName,
            alternateName,
            standardInquiry,
            queueDepth,
            operationalState,
            capabilities);
        this.capacity = capacity;
        this.devicePath = devicePath;
    }


    /**
     * Gets the capacity value for this HostScsiDisk.
     * 
     * @return capacity
     */
    public com.vmware.vim25.HostDiskDimensionsLba getCapacity() {
        return capacity;
    }


    /**
     * Sets the capacity value for this HostScsiDisk.
     * 
     * @param capacity
     */
    public void setCapacity(com.vmware.vim25.HostDiskDimensionsLba capacity) {
        this.capacity = capacity;
    }


    /**
     * Gets the devicePath value for this HostScsiDisk.
     * 
     * @return devicePath
     */
    public java.lang.String getDevicePath() {
        return devicePath;
    }


    /**
     * Sets the devicePath value for this HostScsiDisk.
     * 
     * @param devicePath
     */
    public void setDevicePath(java.lang.String devicePath) {
        this.devicePath = devicePath;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostScsiDisk)) return false;
        HostScsiDisk other = (HostScsiDisk) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.capacity==null && other.getCapacity()==null) || 
             (this.capacity!=null &&
              this.capacity.equals(other.getCapacity()))) &&
            ((this.devicePath==null && other.getDevicePath()==null) || 
             (this.devicePath!=null &&
              this.devicePath.equals(other.getDevicePath())));
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
        if (getCapacity() != null) {
            _hashCode += getCapacity().hashCode();
        }
        if (getDevicePath() != null) {
            _hashCode += getDevicePath().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostScsiDisk.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostScsiDisk"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capacity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "capacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostDiskDimensionsLba"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("devicePath");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "devicePath"));
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
