/**
 * ComputeDiskPartitionInfoRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ComputeDiskPartitionInfoRequestType  implements java.io.Serializable {
    private com.vmware.vim25.ManagedObjectReference _this;

    private java.lang.String devicePath;

    private com.vmware.vim25.HostDiskPartitionLayout layout;

    public ComputeDiskPartitionInfoRequestType() {
    }

    public ComputeDiskPartitionInfoRequestType(
           com.vmware.vim25.ManagedObjectReference _this,
           java.lang.String devicePath,
           com.vmware.vim25.HostDiskPartitionLayout layout) {
           this._this = _this;
           this.devicePath = devicePath;
           this.layout = layout;
    }


    /**
     * Gets the _this value for this ComputeDiskPartitionInfoRequestType.
     * 
     * @return _this
     */
    public com.vmware.vim25.ManagedObjectReference get_this() {
        return _this;
    }


    /**
     * Sets the _this value for this ComputeDiskPartitionInfoRequestType.
     * 
     * @param _this
     */
    public void set_this(com.vmware.vim25.ManagedObjectReference _this) {
        this._this = _this;
    }


    /**
     * Gets the devicePath value for this ComputeDiskPartitionInfoRequestType.
     * 
     * @return devicePath
     */
    public java.lang.String getDevicePath() {
        return devicePath;
    }


    /**
     * Sets the devicePath value for this ComputeDiskPartitionInfoRequestType.
     * 
     * @param devicePath
     */
    public void setDevicePath(java.lang.String devicePath) {
        this.devicePath = devicePath;
    }


    /**
     * Gets the layout value for this ComputeDiskPartitionInfoRequestType.
     * 
     * @return layout
     */
    public com.vmware.vim25.HostDiskPartitionLayout getLayout() {
        return layout;
    }


    /**
     * Sets the layout value for this ComputeDiskPartitionInfoRequestType.
     * 
     * @param layout
     */
    public void setLayout(com.vmware.vim25.HostDiskPartitionLayout layout) {
        this.layout = layout;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ComputeDiskPartitionInfoRequestType)) return false;
        ComputeDiskPartitionInfoRequestType other = (ComputeDiskPartitionInfoRequestType) obj;
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
            ((this.devicePath==null && other.getDevicePath()==null) || 
             (this.devicePath!=null &&
              this.devicePath.equals(other.getDevicePath()))) &&
            ((this.layout==null && other.getLayout()==null) || 
             (this.layout!=null &&
              this.layout.equals(other.getLayout())));
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
        if (getDevicePath() != null) {
            _hashCode += getDevicePath().hashCode();
        }
        if (getLayout() != null) {
            _hashCode += getLayout().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ComputeDiskPartitionInfoRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ComputeDiskPartitionInfoRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_this");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "_this"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("devicePath");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "devicePath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("layout");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "layout"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostDiskPartitionLayout"));
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
