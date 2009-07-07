/**
 * HostVirtualNicConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostVirtualNicConfig  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.String changeOperation;

    private java.lang.String device;

    private java.lang.String portgroup;

    private com.vmware.vim25.HostVirtualNicSpec spec;

    public HostVirtualNicConfig() {
    }

    public HostVirtualNicConfig(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String changeOperation,
           java.lang.String device,
           java.lang.String portgroup,
           com.vmware.vim25.HostVirtualNicSpec spec) {
        super(
            dynamicType,
            dynamicProperty);
        this.changeOperation = changeOperation;
        this.device = device;
        this.portgroup = portgroup;
        this.spec = spec;
    }


    /**
     * Gets the changeOperation value for this HostVirtualNicConfig.
     * 
     * @return changeOperation
     */
    public java.lang.String getChangeOperation() {
        return changeOperation;
    }


    /**
     * Sets the changeOperation value for this HostVirtualNicConfig.
     * 
     * @param changeOperation
     */
    public void setChangeOperation(java.lang.String changeOperation) {
        this.changeOperation = changeOperation;
    }


    /**
     * Gets the device value for this HostVirtualNicConfig.
     * 
     * @return device
     */
    public java.lang.String getDevice() {
        return device;
    }


    /**
     * Sets the device value for this HostVirtualNicConfig.
     * 
     * @param device
     */
    public void setDevice(java.lang.String device) {
        this.device = device;
    }


    /**
     * Gets the portgroup value for this HostVirtualNicConfig.
     * 
     * @return portgroup
     */
    public java.lang.String getPortgroup() {
        return portgroup;
    }


    /**
     * Sets the portgroup value for this HostVirtualNicConfig.
     * 
     * @param portgroup
     */
    public void setPortgroup(java.lang.String portgroup) {
        this.portgroup = portgroup;
    }


    /**
     * Gets the spec value for this HostVirtualNicConfig.
     * 
     * @return spec
     */
    public com.vmware.vim25.HostVirtualNicSpec getSpec() {
        return spec;
    }


    /**
     * Sets the spec value for this HostVirtualNicConfig.
     * 
     * @param spec
     */
    public void setSpec(com.vmware.vim25.HostVirtualNicSpec spec) {
        this.spec = spec;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostVirtualNicConfig)) return false;
        HostVirtualNicConfig other = (HostVirtualNicConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.changeOperation==null && other.getChangeOperation()==null) || 
             (this.changeOperation!=null &&
              this.changeOperation.equals(other.getChangeOperation()))) &&
            ((this.device==null && other.getDevice()==null) || 
             (this.device!=null &&
              this.device.equals(other.getDevice()))) &&
            ((this.portgroup==null && other.getPortgroup()==null) || 
             (this.portgroup!=null &&
              this.portgroup.equals(other.getPortgroup()))) &&
            ((this.spec==null && other.getSpec()==null) || 
             (this.spec!=null &&
              this.spec.equals(other.getSpec())));
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
        if (getChangeOperation() != null) {
            _hashCode += getChangeOperation().hashCode();
        }
        if (getDevice() != null) {
            _hashCode += getDevice().hashCode();
        }
        if (getPortgroup() != null) {
            _hashCode += getPortgroup().hashCode();
        }
        if (getSpec() != null) {
            _hashCode += getSpec().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostVirtualNicConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVirtualNicConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeOperation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "changeOperation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("device");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "device"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portgroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "portgroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "spec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVirtualNicSpec"));
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
