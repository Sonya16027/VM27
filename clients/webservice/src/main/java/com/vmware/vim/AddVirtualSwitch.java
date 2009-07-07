/**
 * AddVirtualSwitch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class AddVirtualSwitch  implements java.io.Serializable {
    private com.vmware.vim.ManagedObjectReference _this;

    private java.lang.String vswitchName;

    private com.vmware.vim.HostVirtualSwitchSpec spec;

    public AddVirtualSwitch() {
    }

    public AddVirtualSwitch(
           com.vmware.vim.ManagedObjectReference _this,
           java.lang.String vswitchName,
           com.vmware.vim.HostVirtualSwitchSpec spec) {
           this._this = _this;
           this.vswitchName = vswitchName;
           this.spec = spec;
    }


    /**
     * Gets the _this value for this AddVirtualSwitch.
     * 
     * @return _this
     */
    public com.vmware.vim.ManagedObjectReference get_this() {
        return _this;
    }


    /**
     * Sets the _this value for this AddVirtualSwitch.
     * 
     * @param _this
     */
    public void set_this(com.vmware.vim.ManagedObjectReference _this) {
        this._this = _this;
    }


    /**
     * Gets the vswitchName value for this AddVirtualSwitch.
     * 
     * @return vswitchName
     */
    public java.lang.String getVswitchName() {
        return vswitchName;
    }


    /**
     * Sets the vswitchName value for this AddVirtualSwitch.
     * 
     * @param vswitchName
     */
    public void setVswitchName(java.lang.String vswitchName) {
        this.vswitchName = vswitchName;
    }


    /**
     * Gets the spec value for this AddVirtualSwitch.
     * 
     * @return spec
     */
    public com.vmware.vim.HostVirtualSwitchSpec getSpec() {
        return spec;
    }


    /**
     * Sets the spec value for this AddVirtualSwitch.
     * 
     * @param spec
     */
    public void setSpec(com.vmware.vim.HostVirtualSwitchSpec spec) {
        this.spec = spec;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddVirtualSwitch)) return false;
        AddVirtualSwitch other = (AddVirtualSwitch) obj;
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
            ((this.vswitchName==null && other.getVswitchName()==null) || 
             (this.vswitchName!=null &&
              this.vswitchName.equals(other.getVswitchName()))) &&
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
        int _hashCode = 1;
        if (get_this() != null) {
            _hashCode += get_this().hashCode();
        }
        if (getVswitchName() != null) {
            _hashCode += getVswitchName().hashCode();
        }
        if (getSpec() != null) {
            _hashCode += getSpec().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddVirtualSwitch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", ">AddVirtualSwitch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_this");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "_this"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vswitchName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "vswitchName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "spec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostVirtualSwitchSpec"));
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
