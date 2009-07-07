/**
 * DistributedVirtualSwitchPortStatistics.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class DistributedVirtualSwitchPortStatistics  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private long packetsInMulticast;

    private long packetsOutMulticast;

    private long bytesInMulticast;

    private long bytesOutMulticast;

    private long packetsInUnicast;

    private long packetsOutUnicast;

    private long bytesInUnicast;

    private long bytesOutUnicast;

    private long packetsInBroadcast;

    private long packetsOutBroadcast;

    private long bytesInBroadcast;

    private long bytesOutBroadcast;

    private long packetsInDropped;

    private long packetsOutDropped;

    private long packetsInException;

    private long packetsOutException;

    public DistributedVirtualSwitchPortStatistics() {
    }

    public DistributedVirtualSwitchPortStatistics(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           long packetsInMulticast,
           long packetsOutMulticast,
           long bytesInMulticast,
           long bytesOutMulticast,
           long packetsInUnicast,
           long packetsOutUnicast,
           long bytesInUnicast,
           long bytesOutUnicast,
           long packetsInBroadcast,
           long packetsOutBroadcast,
           long bytesInBroadcast,
           long bytesOutBroadcast,
           long packetsInDropped,
           long packetsOutDropped,
           long packetsInException,
           long packetsOutException) {
        super(
            dynamicType,
            dynamicProperty);
        this.packetsInMulticast = packetsInMulticast;
        this.packetsOutMulticast = packetsOutMulticast;
        this.bytesInMulticast = bytesInMulticast;
        this.bytesOutMulticast = bytesOutMulticast;
        this.packetsInUnicast = packetsInUnicast;
        this.packetsOutUnicast = packetsOutUnicast;
        this.bytesInUnicast = bytesInUnicast;
        this.bytesOutUnicast = bytesOutUnicast;
        this.packetsInBroadcast = packetsInBroadcast;
        this.packetsOutBroadcast = packetsOutBroadcast;
        this.bytesInBroadcast = bytesInBroadcast;
        this.bytesOutBroadcast = bytesOutBroadcast;
        this.packetsInDropped = packetsInDropped;
        this.packetsOutDropped = packetsOutDropped;
        this.packetsInException = packetsInException;
        this.packetsOutException = packetsOutException;
    }


    /**
     * Gets the packetsInMulticast value for this DistributedVirtualSwitchPortStatistics.
     * 
     * @return packetsInMulticast
     */
    public long getPacketsInMulticast() {
        return packetsInMulticast;
    }


    /**
     * Sets the packetsInMulticast value for this DistributedVirtualSwitchPortStatistics.
     * 
     * @param packetsInMulticast
     */
    public void setPacketsInMulticast(long packetsInMulticast) {
        this.packetsInMulticast = packetsInMulticast;
    }


    /**
     * Gets the packetsOutMulticast value for this DistributedVirtualSwitchPortStatistics.
     * 
     * @return packetsOutMulticast
     */
    public long getPacketsOutMulticast() {
        return packetsOutMulticast;
    }


    /**
     * Sets the packetsOutMulticast value for this DistributedVirtualSwitchPortStatistics.
     * 
     * @param packetsOutMulticast
     */
    public void setPacketsOutMulticast(long packetsOutMulticast) {
        this.packetsOutMulticast = packetsOutMulticast;
    }


    /**
     * Gets the bytesInMulticast value for this DistributedVirtualSwitchPortStatistics.
     * 
     * @return bytesInMulticast
     */
    public long getBytesInMulticast() {
        return bytesInMulticast;
    }


    /**
     * Sets the bytesInMulticast value for this DistributedVirtualSwitchPortStatistics.
     * 
     * @param bytesInMulticast
     */
    public void setBytesInMulticast(long bytesInMulticast) {
        this.bytesInMulticast = bytesInMulticast;
    }


    /**
     * Gets the bytesOutMulticast value for this DistributedVirtualSwitchPortStatistics.
     * 
     * @return bytesOutMulticast
     */
    public long getBytesOutMulticast() {
        return bytesOutMulticast;
    }


    /**
     * Sets the bytesOutMulticast value for this DistributedVirtualSwitchPortStatistics.
     * 
     * @param bytesOutMulticast
     */
    public void setBytesOutMulticast(long bytesOutMulticast) {
        this.bytesOutMulticast = bytesOutMulticast;
    }


    /**
     * Gets the packetsInUnicast value for this DistributedVirtualSwitchPortStatistics.
     * 
     * @return packetsInUnicast
     */
    public long getPacketsInUnicast() {
        return packetsInUnicast;
    }


    /**
     * Sets the packetsInUnicast value for this DistributedVirtualSwitchPortStatistics.
     * 
     * @param packetsInUnicast
     */
    public void setPacketsInUnicast(long packetsInUnicast) {
        this.packetsInUnicast = packetsInUnicast;
    }


    /**
     * Gets the packetsOutUnicast value for this DistributedVirtualSwitchPortStatistics.
     * 
     * @return packetsOutUnicast
     */
    public long getPacketsOutUnicast() {
        return packetsOutUnicast;
    }


    /**
     * Sets the packetsOutUnicast value for this DistributedVirtualSwitchPortStatistics.
     * 
     * @param packetsOutUnicast
     */
    public void setPacketsOutUnicast(long packetsOutUnicast) {
        this.packetsOutUnicast = packetsOutUnicast;
    }


    /**
     * Gets the bytesInUnicast value for this DistributedVirtualSwitchPortStatistics.
     * 
     * @return bytesInUnicast
     */
    public long getBytesInUnicast() {
        return bytesInUnicast;
    }


    /**
     * Sets the bytesInUnicast value for this DistributedVirtualSwitchPortStatistics.
     * 
     * @param bytesInUnicast
     */
    public void setBytesInUnicast(long bytesInUnicast) {
        this.bytesInUnicast = bytesInUnicast;
    }


    /**
     * Gets the bytesOutUnicast value for this DistributedVirtualSwitchPortStatistics.
     * 
     * @return bytesOutUnicast
     */
    public long getBytesOutUnicast() {
        return bytesOutUnicast;
    }


    /**
     * Sets the bytesOutUnicast value for this DistributedVirtualSwitchPortStatistics.
     * 
     * @param bytesOutUnicast
     */
    public void setBytesOutUnicast(long bytesOutUnicast) {
        this.bytesOutUnicast = bytesOutUnicast;
    }


    /**
     * Gets the packetsInBroadcast value for this DistributedVirtualSwitchPortStatistics.
     * 
     * @return packetsInBroadcast
     */
    public long getPacketsInBroadcast() {
        return packetsInBroadcast;
    }


    /**
     * Sets the packetsInBroadcast value for this DistributedVirtualSwitchPortStatistics.
     * 
     * @param packetsInBroadcast
     */
    public void setPacketsInBroadcast(long packetsInBroadcast) {
        this.packetsInBroadcast = packetsInBroadcast;
    }


    /**
     * Gets the packetsOutBroadcast value for this DistributedVirtualSwitchPortStatistics.
     * 
     * @return packetsOutBroadcast
     */
    public long getPacketsOutBroadcast() {
        return packetsOutBroadcast;
    }


    /**
     * Sets the packetsOutBroadcast value for this DistributedVirtualSwitchPortStatistics.
     * 
     * @param packetsOutBroadcast
     */
    public void setPacketsOutBroadcast(long packetsOutBroadcast) {
        this.packetsOutBroadcast = packetsOutBroadcast;
    }


    /**
     * Gets the bytesInBroadcast value for this DistributedVirtualSwitchPortStatistics.
     * 
     * @return bytesInBroadcast
     */
    public long getBytesInBroadcast() {
        return bytesInBroadcast;
    }


    /**
     * Sets the bytesInBroadcast value for this DistributedVirtualSwitchPortStatistics.
     * 
     * @param bytesInBroadcast
     */
    public void setBytesInBroadcast(long bytesInBroadcast) {
        this.bytesInBroadcast = bytesInBroadcast;
    }


    /**
     * Gets the bytesOutBroadcast value for this DistributedVirtualSwitchPortStatistics.
     * 
     * @return bytesOutBroadcast
     */
    public long getBytesOutBroadcast() {
        return bytesOutBroadcast;
    }


    /**
     * Sets the bytesOutBroadcast value for this DistributedVirtualSwitchPortStatistics.
     * 
     * @param bytesOutBroadcast
     */
    public void setBytesOutBroadcast(long bytesOutBroadcast) {
        this.bytesOutBroadcast = bytesOutBroadcast;
    }


    /**
     * Gets the packetsInDropped value for this DistributedVirtualSwitchPortStatistics.
     * 
     * @return packetsInDropped
     */
    public long getPacketsInDropped() {
        return packetsInDropped;
    }


    /**
     * Sets the packetsInDropped value for this DistributedVirtualSwitchPortStatistics.
     * 
     * @param packetsInDropped
     */
    public void setPacketsInDropped(long packetsInDropped) {
        this.packetsInDropped = packetsInDropped;
    }


    /**
     * Gets the packetsOutDropped value for this DistributedVirtualSwitchPortStatistics.
     * 
     * @return packetsOutDropped
     */
    public long getPacketsOutDropped() {
        return packetsOutDropped;
    }


    /**
     * Sets the packetsOutDropped value for this DistributedVirtualSwitchPortStatistics.
     * 
     * @param packetsOutDropped
     */
    public void setPacketsOutDropped(long packetsOutDropped) {
        this.packetsOutDropped = packetsOutDropped;
    }


    /**
     * Gets the packetsInException value for this DistributedVirtualSwitchPortStatistics.
     * 
     * @return packetsInException
     */
    public long getPacketsInException() {
        return packetsInException;
    }


    /**
     * Sets the packetsInException value for this DistributedVirtualSwitchPortStatistics.
     * 
     * @param packetsInException
     */
    public void setPacketsInException(long packetsInException) {
        this.packetsInException = packetsInException;
    }


    /**
     * Gets the packetsOutException value for this DistributedVirtualSwitchPortStatistics.
     * 
     * @return packetsOutException
     */
    public long getPacketsOutException() {
        return packetsOutException;
    }


    /**
     * Sets the packetsOutException value for this DistributedVirtualSwitchPortStatistics.
     * 
     * @param packetsOutException
     */
    public void setPacketsOutException(long packetsOutException) {
        this.packetsOutException = packetsOutException;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DistributedVirtualSwitchPortStatistics)) return false;
        DistributedVirtualSwitchPortStatistics other = (DistributedVirtualSwitchPortStatistics) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.packetsInMulticast == other.getPacketsInMulticast() &&
            this.packetsOutMulticast == other.getPacketsOutMulticast() &&
            this.bytesInMulticast == other.getBytesInMulticast() &&
            this.bytesOutMulticast == other.getBytesOutMulticast() &&
            this.packetsInUnicast == other.getPacketsInUnicast() &&
            this.packetsOutUnicast == other.getPacketsOutUnicast() &&
            this.bytesInUnicast == other.getBytesInUnicast() &&
            this.bytesOutUnicast == other.getBytesOutUnicast() &&
            this.packetsInBroadcast == other.getPacketsInBroadcast() &&
            this.packetsOutBroadcast == other.getPacketsOutBroadcast() &&
            this.bytesInBroadcast == other.getBytesInBroadcast() &&
            this.bytesOutBroadcast == other.getBytesOutBroadcast() &&
            this.packetsInDropped == other.getPacketsInDropped() &&
            this.packetsOutDropped == other.getPacketsOutDropped() &&
            this.packetsInException == other.getPacketsInException() &&
            this.packetsOutException == other.getPacketsOutException();
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
        _hashCode += new Long(getPacketsInMulticast()).hashCode();
        _hashCode += new Long(getPacketsOutMulticast()).hashCode();
        _hashCode += new Long(getBytesInMulticast()).hashCode();
        _hashCode += new Long(getBytesOutMulticast()).hashCode();
        _hashCode += new Long(getPacketsInUnicast()).hashCode();
        _hashCode += new Long(getPacketsOutUnicast()).hashCode();
        _hashCode += new Long(getBytesInUnicast()).hashCode();
        _hashCode += new Long(getBytesOutUnicast()).hashCode();
        _hashCode += new Long(getPacketsInBroadcast()).hashCode();
        _hashCode += new Long(getPacketsOutBroadcast()).hashCode();
        _hashCode += new Long(getBytesInBroadcast()).hashCode();
        _hashCode += new Long(getBytesOutBroadcast()).hashCode();
        _hashCode += new Long(getPacketsInDropped()).hashCode();
        _hashCode += new Long(getPacketsOutDropped()).hashCode();
        _hashCode += new Long(getPacketsInException()).hashCode();
        _hashCode += new Long(getPacketsOutException()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DistributedVirtualSwitchPortStatistics.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchPortStatistics"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packetsInMulticast");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "packetsInMulticast"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packetsOutMulticast");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "packetsOutMulticast"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bytesInMulticast");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "bytesInMulticast"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bytesOutMulticast");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "bytesOutMulticast"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packetsInUnicast");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "packetsInUnicast"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packetsOutUnicast");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "packetsOutUnicast"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bytesInUnicast");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "bytesInUnicast"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bytesOutUnicast");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "bytesOutUnicast"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packetsInBroadcast");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "packetsInBroadcast"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packetsOutBroadcast");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "packetsOutBroadcast"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bytesInBroadcast");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "bytesInBroadcast"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bytesOutBroadcast");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "bytesOutBroadcast"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packetsInDropped");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "packetsInDropped"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packetsOutDropped");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "packetsOutDropped"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packetsInException");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "packetsInException"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packetsOutException");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "packetsOutException"));
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
