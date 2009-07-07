/**
 * DatastoreCapacityIncreasedEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class DatastoreCapacityIncreasedEvent  extends com.vmware.vim25.DatastoreEvent  implements java.io.Serializable {
    private long oldCapacity;

    private long newCapacity;

    public DatastoreCapacityIncreasedEvent() {
    }

    public DatastoreCapacityIncreasedEvent(
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
           com.vmware.vim25.DatastoreEventArgument datastore,
           long oldCapacity,
           long newCapacity) {
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
            datastore);
        this.oldCapacity = oldCapacity;
        this.newCapacity = newCapacity;
    }


    /**
     * Gets the oldCapacity value for this DatastoreCapacityIncreasedEvent.
     * 
     * @return oldCapacity
     */
    public long getOldCapacity() {
        return oldCapacity;
    }


    /**
     * Sets the oldCapacity value for this DatastoreCapacityIncreasedEvent.
     * 
     * @param oldCapacity
     */
    public void setOldCapacity(long oldCapacity) {
        this.oldCapacity = oldCapacity;
    }


    /**
     * Gets the newCapacity value for this DatastoreCapacityIncreasedEvent.
     * 
     * @return newCapacity
     */
    public long getNewCapacity() {
        return newCapacity;
    }


    /**
     * Sets the newCapacity value for this DatastoreCapacityIncreasedEvent.
     * 
     * @param newCapacity
     */
    public void setNewCapacity(long newCapacity) {
        this.newCapacity = newCapacity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatastoreCapacityIncreasedEvent)) return false;
        DatastoreCapacityIncreasedEvent other = (DatastoreCapacityIncreasedEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.oldCapacity == other.getOldCapacity() &&
            this.newCapacity == other.getNewCapacity();
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
        _hashCode += new Long(getOldCapacity()).hashCode();
        _hashCode += new Long(getNewCapacity()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DatastoreCapacityIncreasedEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DatastoreCapacityIncreasedEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldCapacity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "oldCapacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newCapacity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "newCapacity"));
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
