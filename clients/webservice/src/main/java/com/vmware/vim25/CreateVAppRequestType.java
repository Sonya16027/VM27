/**
 * CreateVAppRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class CreateVAppRequestType  implements java.io.Serializable {
    private com.vmware.vim25.ManagedObjectReference _this;

    private java.lang.String name;

    private com.vmware.vim25.ResourceConfigSpec resSpec;

    private com.vmware.vim25.VAppConfigSpec configSpec;

    private com.vmware.vim25.ManagedObjectReference vmFolder;

    public CreateVAppRequestType() {
    }

    public CreateVAppRequestType(
           com.vmware.vim25.ManagedObjectReference _this,
           java.lang.String name,
           com.vmware.vim25.ResourceConfigSpec resSpec,
           com.vmware.vim25.VAppConfigSpec configSpec,
           com.vmware.vim25.ManagedObjectReference vmFolder) {
           this._this = _this;
           this.name = name;
           this.resSpec = resSpec;
           this.configSpec = configSpec;
           this.vmFolder = vmFolder;
    }


    /**
     * Gets the _this value for this CreateVAppRequestType.
     * 
     * @return _this
     */
    public com.vmware.vim25.ManagedObjectReference get_this() {
        return _this;
    }


    /**
     * Sets the _this value for this CreateVAppRequestType.
     * 
     * @param _this
     */
    public void set_this(com.vmware.vim25.ManagedObjectReference _this) {
        this._this = _this;
    }


    /**
     * Gets the name value for this CreateVAppRequestType.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CreateVAppRequestType.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the resSpec value for this CreateVAppRequestType.
     * 
     * @return resSpec
     */
    public com.vmware.vim25.ResourceConfigSpec getResSpec() {
        return resSpec;
    }


    /**
     * Sets the resSpec value for this CreateVAppRequestType.
     * 
     * @param resSpec
     */
    public void setResSpec(com.vmware.vim25.ResourceConfigSpec resSpec) {
        this.resSpec = resSpec;
    }


    /**
     * Gets the configSpec value for this CreateVAppRequestType.
     * 
     * @return configSpec
     */
    public com.vmware.vim25.VAppConfigSpec getConfigSpec() {
        return configSpec;
    }


    /**
     * Sets the configSpec value for this CreateVAppRequestType.
     * 
     * @param configSpec
     */
    public void setConfigSpec(com.vmware.vim25.VAppConfigSpec configSpec) {
        this.configSpec = configSpec;
    }


    /**
     * Gets the vmFolder value for this CreateVAppRequestType.
     * 
     * @return vmFolder
     */
    public com.vmware.vim25.ManagedObjectReference getVmFolder() {
        return vmFolder;
    }


    /**
     * Sets the vmFolder value for this CreateVAppRequestType.
     * 
     * @param vmFolder
     */
    public void setVmFolder(com.vmware.vim25.ManagedObjectReference vmFolder) {
        this.vmFolder = vmFolder;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateVAppRequestType)) return false;
        CreateVAppRequestType other = (CreateVAppRequestType) obj;
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.resSpec==null && other.getResSpec()==null) || 
             (this.resSpec!=null &&
              this.resSpec.equals(other.getResSpec()))) &&
            ((this.configSpec==null && other.getConfigSpec()==null) || 
             (this.configSpec!=null &&
              this.configSpec.equals(other.getConfigSpec()))) &&
            ((this.vmFolder==null && other.getVmFolder()==null) || 
             (this.vmFolder!=null &&
              this.vmFolder.equals(other.getVmFolder())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getResSpec() != null) {
            _hashCode += getResSpec().hashCode();
        }
        if (getConfigSpec() != null) {
            _hashCode += getConfigSpec().hashCode();
        }
        if (getVmFolder() != null) {
            _hashCode += getVmFolder().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateVAppRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "CreateVAppRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_this");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "_this"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "resSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ResourceConfigSpec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "configSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VAppConfigSpec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmFolder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmFolder"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
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
