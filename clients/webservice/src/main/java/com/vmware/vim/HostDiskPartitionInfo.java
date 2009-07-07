/**
 * HostDiskPartitionInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostDiskPartitionInfo  extends com.vmware.vim.DynamicData  implements java.io.Serializable {
    private java.lang.String deviceName;

    private com.vmware.vim.HostDiskPartitionSpec spec;

    private com.vmware.vim.HostDiskPartitionLayout layout;

    public HostDiskPartitionInfo() {
    }

    public HostDiskPartitionInfo(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           java.lang.String deviceName,
           com.vmware.vim.HostDiskPartitionSpec spec,
           com.vmware.vim.HostDiskPartitionLayout layout) {
        super(
            dynamicType,
            dynamicProperty);
        this.deviceName = deviceName;
        this.spec = spec;
        this.layout = layout;
    }


    /**
     * Gets the deviceName value for this HostDiskPartitionInfo.
     * 
     * @return deviceName
     */
    public java.lang.String getDeviceName() {
        return deviceName;
    }


    /**
     * Sets the deviceName value for this HostDiskPartitionInfo.
     * 
     * @param deviceName
     */
    public void setDeviceName(java.lang.String deviceName) {
        this.deviceName = deviceName;
    }


    /**
     * Gets the spec value for this HostDiskPartitionInfo.
     * 
     * @return spec
     */
    public com.vmware.vim.HostDiskPartitionSpec getSpec() {
        return spec;
    }


    /**
     * Sets the spec value for this HostDiskPartitionInfo.
     * 
     * @param spec
     */
    public void setSpec(com.vmware.vim.HostDiskPartitionSpec spec) {
        this.spec = spec;
    }


    /**
     * Gets the layout value for this HostDiskPartitionInfo.
     * 
     * @return layout
     */
    public com.vmware.vim.HostDiskPartitionLayout getLayout() {
        return layout;
    }


    /**
     * Sets the layout value for this HostDiskPartitionInfo.
     * 
     * @param layout
     */
    public void setLayout(com.vmware.vim.HostDiskPartitionLayout layout) {
        this.layout = layout;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostDiskPartitionInfo)) return false;
        HostDiskPartitionInfo other = (HostDiskPartitionInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.deviceName==null && other.getDeviceName()==null) || 
             (this.deviceName!=null &&
              this.deviceName.equals(other.getDeviceName()))) &&
            ((this.spec==null && other.getSpec()==null) || 
             (this.spec!=null &&
              this.spec.equals(other.getSpec()))) &&
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
        int _hashCode = super.hashCode();
        if (getDeviceName() != null) {
            _hashCode += getDeviceName().hashCode();
        }
        if (getSpec() != null) {
            _hashCode += getSpec().hashCode();
        }
        if (getLayout() != null) {
            _hashCode += getLayout().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostDiskPartitionInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostDiskPartitionInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "deviceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "spec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostDiskPartitionSpec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("layout");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "layout"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostDiskPartitionLayout"));
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
