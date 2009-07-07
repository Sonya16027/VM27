/**
 * VirtualMachineConfigOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class VirtualMachineConfigOption  extends com.vmware.vim.DynamicData  implements java.io.Serializable {
    private java.lang.String version;

    private java.lang.String description;

    private com.vmware.vim.GuestOsDescriptor[] guestOSDescriptor;

    private int guestOSDefaultIndex;

    private com.vmware.vim.VirtualHardwareOption hardwareOptions;

    private com.vmware.vim.VirtualMachineCapability capabilities;

    private com.vmware.vim.DatastoreOption datastore;

    private com.vmware.vim.VirtualDevice[] defaultDevice;

    public VirtualMachineConfigOption() {
    }

    public VirtualMachineConfigOption(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           java.lang.String version,
           java.lang.String description,
           com.vmware.vim.GuestOsDescriptor[] guestOSDescriptor,
           int guestOSDefaultIndex,
           com.vmware.vim.VirtualHardwareOption hardwareOptions,
           com.vmware.vim.VirtualMachineCapability capabilities,
           com.vmware.vim.DatastoreOption datastore,
           com.vmware.vim.VirtualDevice[] defaultDevice) {
        super(
            dynamicType,
            dynamicProperty);
        this.version = version;
        this.description = description;
        this.guestOSDescriptor = guestOSDescriptor;
        this.guestOSDefaultIndex = guestOSDefaultIndex;
        this.hardwareOptions = hardwareOptions;
        this.capabilities = capabilities;
        this.datastore = datastore;
        this.defaultDevice = defaultDevice;
    }


    /**
     * Gets the version value for this VirtualMachineConfigOption.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this VirtualMachineConfigOption.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the description value for this VirtualMachineConfigOption.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this VirtualMachineConfigOption.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the guestOSDescriptor value for this VirtualMachineConfigOption.
     * 
     * @return guestOSDescriptor
     */
    public com.vmware.vim.GuestOsDescriptor[] getGuestOSDescriptor() {
        return guestOSDescriptor;
    }


    /**
     * Sets the guestOSDescriptor value for this VirtualMachineConfigOption.
     * 
     * @param guestOSDescriptor
     */
    public void setGuestOSDescriptor(com.vmware.vim.GuestOsDescriptor[] guestOSDescriptor) {
        this.guestOSDescriptor = guestOSDescriptor;
    }

    public com.vmware.vim.GuestOsDescriptor getGuestOSDescriptor(int i) {
        return this.guestOSDescriptor[i];
    }

    public void setGuestOSDescriptor(int i, com.vmware.vim.GuestOsDescriptor _value) {
        this.guestOSDescriptor[i] = _value;
    }


    /**
     * Gets the guestOSDefaultIndex value for this VirtualMachineConfigOption.
     * 
     * @return guestOSDefaultIndex
     */
    public int getGuestOSDefaultIndex() {
        return guestOSDefaultIndex;
    }


    /**
     * Sets the guestOSDefaultIndex value for this VirtualMachineConfigOption.
     * 
     * @param guestOSDefaultIndex
     */
    public void setGuestOSDefaultIndex(int guestOSDefaultIndex) {
        this.guestOSDefaultIndex = guestOSDefaultIndex;
    }


    /**
     * Gets the hardwareOptions value for this VirtualMachineConfigOption.
     * 
     * @return hardwareOptions
     */
    public com.vmware.vim.VirtualHardwareOption getHardwareOptions() {
        return hardwareOptions;
    }


    /**
     * Sets the hardwareOptions value for this VirtualMachineConfigOption.
     * 
     * @param hardwareOptions
     */
    public void setHardwareOptions(com.vmware.vim.VirtualHardwareOption hardwareOptions) {
        this.hardwareOptions = hardwareOptions;
    }


    /**
     * Gets the capabilities value for this VirtualMachineConfigOption.
     * 
     * @return capabilities
     */
    public com.vmware.vim.VirtualMachineCapability getCapabilities() {
        return capabilities;
    }


    /**
     * Sets the capabilities value for this VirtualMachineConfigOption.
     * 
     * @param capabilities
     */
    public void setCapabilities(com.vmware.vim.VirtualMachineCapability capabilities) {
        this.capabilities = capabilities;
    }


    /**
     * Gets the datastore value for this VirtualMachineConfigOption.
     * 
     * @return datastore
     */
    public com.vmware.vim.DatastoreOption getDatastore() {
        return datastore;
    }


    /**
     * Sets the datastore value for this VirtualMachineConfigOption.
     * 
     * @param datastore
     */
    public void setDatastore(com.vmware.vim.DatastoreOption datastore) {
        this.datastore = datastore;
    }


    /**
     * Gets the defaultDevice value for this VirtualMachineConfigOption.
     * 
     * @return defaultDevice
     */
    public com.vmware.vim.VirtualDevice[] getDefaultDevice() {
        return defaultDevice;
    }


    /**
     * Sets the defaultDevice value for this VirtualMachineConfigOption.
     * 
     * @param defaultDevice
     */
    public void setDefaultDevice(com.vmware.vim.VirtualDevice[] defaultDevice) {
        this.defaultDevice = defaultDevice;
    }

    public com.vmware.vim.VirtualDevice getDefaultDevice(int i) {
        return this.defaultDevice[i];
    }

    public void setDefaultDevice(int i, com.vmware.vim.VirtualDevice _value) {
        this.defaultDevice[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualMachineConfigOption)) return false;
        VirtualMachineConfigOption other = (VirtualMachineConfigOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.guestOSDescriptor==null && other.getGuestOSDescriptor()==null) || 
             (this.guestOSDescriptor!=null &&
              java.util.Arrays.equals(this.guestOSDescriptor, other.getGuestOSDescriptor()))) &&
            this.guestOSDefaultIndex == other.getGuestOSDefaultIndex() &&
            ((this.hardwareOptions==null && other.getHardwareOptions()==null) || 
             (this.hardwareOptions!=null &&
              this.hardwareOptions.equals(other.getHardwareOptions()))) &&
            ((this.capabilities==null && other.getCapabilities()==null) || 
             (this.capabilities!=null &&
              this.capabilities.equals(other.getCapabilities()))) &&
            ((this.datastore==null && other.getDatastore()==null) || 
             (this.datastore!=null &&
              this.datastore.equals(other.getDatastore()))) &&
            ((this.defaultDevice==null && other.getDefaultDevice()==null) || 
             (this.defaultDevice!=null &&
              java.util.Arrays.equals(this.defaultDevice, other.getDefaultDevice())));
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
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getGuestOSDescriptor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGuestOSDescriptor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGuestOSDescriptor(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getGuestOSDefaultIndex();
        if (getHardwareOptions() != null) {
            _hashCode += getHardwareOptions().hashCode();
        }
        if (getCapabilities() != null) {
            _hashCode += getCapabilities().hashCode();
        }
        if (getDatastore() != null) {
            _hashCode += getDatastore().hashCode();
        }
        if (getDefaultDevice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDefaultDevice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDefaultDevice(), i);
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
        new org.apache.axis.description.TypeDesc(VirtualMachineConfigOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "VirtualMachineConfigOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guestOSDescriptor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "guestOSDescriptor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "GuestOsDescriptor"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guestOSDefaultIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "guestOSDefaultIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hardwareOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "hardwareOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "VirtualHardwareOption"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capabilities");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "capabilities"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "VirtualMachineCapability"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datastore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "datastore"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "DatastoreOption"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultDevice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "defaultDevice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "VirtualDevice"));
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
