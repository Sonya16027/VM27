/**
 * ExtendedEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ExtendedEvent  extends com.vmware.vim25.GeneralEvent  implements java.io.Serializable {
    private java.lang.String eventTypeId;

    private com.vmware.vim25.ManagedObjectReference managedObject;

    private com.vmware.vim25.ExtendedEventPair[] data;

    public ExtendedEvent() {
    }

    public ExtendedEvent(
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
           java.lang.String message,
           java.lang.String eventTypeId,
           com.vmware.vim25.ManagedObjectReference managedObject,
           com.vmware.vim25.ExtendedEventPair[] data) {
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
            message);
        this.eventTypeId = eventTypeId;
        this.managedObject = managedObject;
        this.data = data;
    }


    /**
     * Gets the eventTypeId value for this ExtendedEvent.
     * 
     * @return eventTypeId
     */
    public java.lang.String getEventTypeId() {
        return eventTypeId;
    }


    /**
     * Sets the eventTypeId value for this ExtendedEvent.
     * 
     * @param eventTypeId
     */
    public void setEventTypeId(java.lang.String eventTypeId) {
        this.eventTypeId = eventTypeId;
    }


    /**
     * Gets the managedObject value for this ExtendedEvent.
     * 
     * @return managedObject
     */
    public com.vmware.vim25.ManagedObjectReference getManagedObject() {
        return managedObject;
    }


    /**
     * Sets the managedObject value for this ExtendedEvent.
     * 
     * @param managedObject
     */
    public void setManagedObject(com.vmware.vim25.ManagedObjectReference managedObject) {
        this.managedObject = managedObject;
    }


    /**
     * Gets the data value for this ExtendedEvent.
     * 
     * @return data
     */
    public com.vmware.vim25.ExtendedEventPair[] getData() {
        return data;
    }


    /**
     * Sets the data value for this ExtendedEvent.
     * 
     * @param data
     */
    public void setData(com.vmware.vim25.ExtendedEventPair[] data) {
        this.data = data;
    }

    public com.vmware.vim25.ExtendedEventPair getData(int i) {
        return this.data[i];
    }

    public void setData(int i, com.vmware.vim25.ExtendedEventPair _value) {
        this.data[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExtendedEvent)) return false;
        ExtendedEvent other = (ExtendedEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.eventTypeId==null && other.getEventTypeId()==null) || 
             (this.eventTypeId!=null &&
              this.eventTypeId.equals(other.getEventTypeId()))) &&
            ((this.managedObject==null && other.getManagedObject()==null) || 
             (this.managedObject!=null &&
              this.managedObject.equals(other.getManagedObject()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              java.util.Arrays.equals(this.data, other.getData())));
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
        if (getEventTypeId() != null) {
            _hashCode += getEventTypeId().hashCode();
        }
        if (getManagedObject() != null) {
            _hashCode += getManagedObject().hashCode();
        }
        if (getData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExtendedEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ExtendedEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "eventTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managedObject");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "managedObject"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ExtendedEventPair"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
