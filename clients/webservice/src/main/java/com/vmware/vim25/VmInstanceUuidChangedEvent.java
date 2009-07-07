/**
 * VmInstanceUuidChangedEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VmInstanceUuidChangedEvent  extends com.vmware.vim25.VmEvent  implements java.io.Serializable {
    private java.lang.String oldInstanceUuid;

    private java.lang.String newInstanceUuid;

    public VmInstanceUuidChangedEvent() {
    }

    public VmInstanceUuidChangedEvent(
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
           boolean template,
           java.lang.String oldInstanceUuid,
           java.lang.String newInstanceUuid) {
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
            changeTag,
            template);
        this.oldInstanceUuid = oldInstanceUuid;
        this.newInstanceUuid = newInstanceUuid;
    }


    /**
     * Gets the oldInstanceUuid value for this VmInstanceUuidChangedEvent.
     * 
     * @return oldInstanceUuid
     */
    public java.lang.String getOldInstanceUuid() {
        return oldInstanceUuid;
    }


    /**
     * Sets the oldInstanceUuid value for this VmInstanceUuidChangedEvent.
     * 
     * @param oldInstanceUuid
     */
    public void setOldInstanceUuid(java.lang.String oldInstanceUuid) {
        this.oldInstanceUuid = oldInstanceUuid;
    }


    /**
     * Gets the newInstanceUuid value for this VmInstanceUuidChangedEvent.
     * 
     * @return newInstanceUuid
     */
    public java.lang.String getNewInstanceUuid() {
        return newInstanceUuid;
    }


    /**
     * Sets the newInstanceUuid value for this VmInstanceUuidChangedEvent.
     * 
     * @param newInstanceUuid
     */
    public void setNewInstanceUuid(java.lang.String newInstanceUuid) {
        this.newInstanceUuid = newInstanceUuid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VmInstanceUuidChangedEvent)) return false;
        VmInstanceUuidChangedEvent other = (VmInstanceUuidChangedEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.oldInstanceUuid==null && other.getOldInstanceUuid()==null) || 
             (this.oldInstanceUuid!=null &&
              this.oldInstanceUuid.equals(other.getOldInstanceUuid()))) &&
            ((this.newInstanceUuid==null && other.getNewInstanceUuid()==null) || 
             (this.newInstanceUuid!=null &&
              this.newInstanceUuid.equals(other.getNewInstanceUuid())));
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
        if (getOldInstanceUuid() != null) {
            _hashCode += getOldInstanceUuid().hashCode();
        }
        if (getNewInstanceUuid() != null) {
            _hashCode += getNewInstanceUuid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VmInstanceUuidChangedEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VmInstanceUuidChangedEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldInstanceUuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "oldInstanceUuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newInstanceUuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "newInstanceUuid"));
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
