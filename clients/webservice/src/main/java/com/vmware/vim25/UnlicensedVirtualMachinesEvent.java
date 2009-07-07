/**
 * UnlicensedVirtualMachinesEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class UnlicensedVirtualMachinesEvent  extends com.vmware.vim25.LicenseEvent  implements java.io.Serializable {
    private int unlicensed;

    private int available;

    public UnlicensedVirtualMachinesEvent() {
    }

    public UnlicensedVirtualMachinesEvent(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           int key,
           int chainId,
           java.util.Calendar createdTime,
           java.lang.String userName,
           com.vmware.vim25.DatacenterEventArgument datacenter,
           com.vmware.vim25.ComputeResourceEventArgument computeResource,
           com.vmware.vim25.HostEventArgument host,
           com.vmware.vim25.VmEventArgument vm,
           com.vmware.vim25.DatastoreEventArgument ds,
           com.vmware.vim25.NetworkEventArgument net,
           com.vmware.vim25.DvsEventArgument dvs,
           java.lang.String fullFormattedMessage,
           java.lang.String changeTag,
           int unlicensed,
           int available) {
        super(
            dynamicType,
            dynamicProperty,
            key,
            chainId,
            createdTime,
            userName,
            datacenter,
            computeResource,
            host,
            vm,
            ds,
            net,
            dvs,
            fullFormattedMessage,
            changeTag);
        this.unlicensed = unlicensed;
        this.available = available;
    }


    /**
     * Gets the unlicensed value for this UnlicensedVirtualMachinesEvent.
     * 
     * @return unlicensed
     */
    public int getUnlicensed() {
        return unlicensed;
    }


    /**
     * Sets the unlicensed value for this UnlicensedVirtualMachinesEvent.
     * 
     * @param unlicensed
     */
    public void setUnlicensed(int unlicensed) {
        this.unlicensed = unlicensed;
    }


    /**
     * Gets the available value for this UnlicensedVirtualMachinesEvent.
     * 
     * @return available
     */
    public int getAvailable() {
        return available;
    }


    /**
     * Sets the available value for this UnlicensedVirtualMachinesEvent.
     * 
     * @param available
     */
    public void setAvailable(int available) {
        this.available = available;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UnlicensedVirtualMachinesEvent)) return false;
        UnlicensedVirtualMachinesEvent other = (UnlicensedVirtualMachinesEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.unlicensed == other.getUnlicensed() &&
            this.available == other.getAvailable();
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
        _hashCode += getUnlicensed();
        _hashCode += getAvailable();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UnlicensedVirtualMachinesEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "UnlicensedVirtualMachinesEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unlicensed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "unlicensed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("available");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "available"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
