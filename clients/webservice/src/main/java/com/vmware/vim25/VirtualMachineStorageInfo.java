/**
 * VirtualMachineStorageInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualMachineStorageInfo  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private com.vmware.vim25.VirtualMachineUsageOnDatastore[] perDatastoreUsage;

    private java.util.Calendar timestamp;

    public VirtualMachineStorageInfo() {
    }

    public VirtualMachineStorageInfo(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.VirtualMachineUsageOnDatastore[] perDatastoreUsage,
           java.util.Calendar timestamp) {
        super(
            dynamicType,
            dynamicProperty);
        this.perDatastoreUsage = perDatastoreUsage;
        this.timestamp = timestamp;
    }


    /**
     * Gets the perDatastoreUsage value for this VirtualMachineStorageInfo.
     * 
     * @return perDatastoreUsage
     */
    public com.vmware.vim25.VirtualMachineUsageOnDatastore[] getPerDatastoreUsage() {
        return perDatastoreUsage;
    }


    /**
     * Sets the perDatastoreUsage value for this VirtualMachineStorageInfo.
     * 
     * @param perDatastoreUsage
     */
    public void setPerDatastoreUsage(com.vmware.vim25.VirtualMachineUsageOnDatastore[] perDatastoreUsage) {
        this.perDatastoreUsage = perDatastoreUsage;
    }

    public com.vmware.vim25.VirtualMachineUsageOnDatastore getPerDatastoreUsage(int i) {
        return this.perDatastoreUsage[i];
    }

    public void setPerDatastoreUsage(int i, com.vmware.vim25.VirtualMachineUsageOnDatastore _value) {
        this.perDatastoreUsage[i] = _value;
    }


    /**
     * Gets the timestamp value for this VirtualMachineStorageInfo.
     * 
     * @return timestamp
     */
    public java.util.Calendar getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this VirtualMachineStorageInfo.
     * 
     * @param timestamp
     */
    public void setTimestamp(java.util.Calendar timestamp) {
        this.timestamp = timestamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualMachineStorageInfo)) return false;
        VirtualMachineStorageInfo other = (VirtualMachineStorageInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.perDatastoreUsage==null && other.getPerDatastoreUsage()==null) || 
             (this.perDatastoreUsage!=null &&
              java.util.Arrays.equals(this.perDatastoreUsage, other.getPerDatastoreUsage()))) &&
            ((this.timestamp==null && other.getTimestamp()==null) || 
             (this.timestamp!=null &&
              this.timestamp.equals(other.getTimestamp())));
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
        if (getPerDatastoreUsage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPerDatastoreUsage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPerDatastoreUsage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTimestamp() != null) {
            _hashCode += getTimestamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualMachineStorageInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineStorageInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("perDatastoreUsage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "perDatastoreUsage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineUsageOnDatastore"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "timestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
