/**
 * PhysicalNic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class PhysicalNic  extends com.vmware.vim.DynamicData  implements java.io.Serializable {
    private java.lang.String key;

    private java.lang.String device;

    private java.lang.String pci;

    private java.lang.String driver;

    private com.vmware.vim.PhysicalNicLinkInfo linkSpeed;

    private com.vmware.vim.PhysicalNicLinkInfo[] validLinkSpecification;

    private com.vmware.vim.PhysicalNicSpec spec;

    public PhysicalNic() {
    }

    public PhysicalNic(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           java.lang.String key,
           java.lang.String device,
           java.lang.String pci,
           java.lang.String driver,
           com.vmware.vim.PhysicalNicLinkInfo linkSpeed,
           com.vmware.vim.PhysicalNicLinkInfo[] validLinkSpecification,
           com.vmware.vim.PhysicalNicSpec spec) {
        super(
            dynamicType,
            dynamicProperty);
        this.key = key;
        this.device = device;
        this.pci = pci;
        this.driver = driver;
        this.linkSpeed = linkSpeed;
        this.validLinkSpecification = validLinkSpecification;
        this.spec = spec;
    }


    /**
     * Gets the key value for this PhysicalNic.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this PhysicalNic.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the device value for this PhysicalNic.
     * 
     * @return device
     */
    public java.lang.String getDevice() {
        return device;
    }


    /**
     * Sets the device value for this PhysicalNic.
     * 
     * @param device
     */
    public void setDevice(java.lang.String device) {
        this.device = device;
    }


    /**
     * Gets the pci value for this PhysicalNic.
     * 
     * @return pci
     */
    public java.lang.String getPci() {
        return pci;
    }


    /**
     * Sets the pci value for this PhysicalNic.
     * 
     * @param pci
     */
    public void setPci(java.lang.String pci) {
        this.pci = pci;
    }


    /**
     * Gets the driver value for this PhysicalNic.
     * 
     * @return driver
     */
    public java.lang.String getDriver() {
        return driver;
    }


    /**
     * Sets the driver value for this PhysicalNic.
     * 
     * @param driver
     */
    public void setDriver(java.lang.String driver) {
        this.driver = driver;
    }


    /**
     * Gets the linkSpeed value for this PhysicalNic.
     * 
     * @return linkSpeed
     */
    public com.vmware.vim.PhysicalNicLinkInfo getLinkSpeed() {
        return linkSpeed;
    }


    /**
     * Sets the linkSpeed value for this PhysicalNic.
     * 
     * @param linkSpeed
     */
    public void setLinkSpeed(com.vmware.vim.PhysicalNicLinkInfo linkSpeed) {
        this.linkSpeed = linkSpeed;
    }


    /**
     * Gets the validLinkSpecification value for this PhysicalNic.
     * 
     * @return validLinkSpecification
     */
    public com.vmware.vim.PhysicalNicLinkInfo[] getValidLinkSpecification() {
        return validLinkSpecification;
    }


    /**
     * Sets the validLinkSpecification value for this PhysicalNic.
     * 
     * @param validLinkSpecification
     */
    public void setValidLinkSpecification(com.vmware.vim.PhysicalNicLinkInfo[] validLinkSpecification) {
        this.validLinkSpecification = validLinkSpecification;
    }

    public com.vmware.vim.PhysicalNicLinkInfo getValidLinkSpecification(int i) {
        return this.validLinkSpecification[i];
    }

    public void setValidLinkSpecification(int i, com.vmware.vim.PhysicalNicLinkInfo _value) {
        this.validLinkSpecification[i] = _value;
    }


    /**
     * Gets the spec value for this PhysicalNic.
     * 
     * @return spec
     */
    public com.vmware.vim.PhysicalNicSpec getSpec() {
        return spec;
    }


    /**
     * Sets the spec value for this PhysicalNic.
     * 
     * @param spec
     */
    public void setSpec(com.vmware.vim.PhysicalNicSpec spec) {
        this.spec = spec;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PhysicalNic)) return false;
        PhysicalNic other = (PhysicalNic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.device==null && other.getDevice()==null) || 
             (this.device!=null &&
              this.device.equals(other.getDevice()))) &&
            ((this.pci==null && other.getPci()==null) || 
             (this.pci!=null &&
              this.pci.equals(other.getPci()))) &&
            ((this.driver==null && other.getDriver()==null) || 
             (this.driver!=null &&
              this.driver.equals(other.getDriver()))) &&
            ((this.linkSpeed==null && other.getLinkSpeed()==null) || 
             (this.linkSpeed!=null &&
              this.linkSpeed.equals(other.getLinkSpeed()))) &&
            ((this.validLinkSpecification==null && other.getValidLinkSpecification()==null) || 
             (this.validLinkSpecification!=null &&
              java.util.Arrays.equals(this.validLinkSpecification, other.getValidLinkSpecification()))) &&
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
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getDevice() != null) {
            _hashCode += getDevice().hashCode();
        }
        if (getPci() != null) {
            _hashCode += getPci().hashCode();
        }
        if (getDriver() != null) {
            _hashCode += getDriver().hashCode();
        }
        if (getLinkSpeed() != null) {
            _hashCode += getLinkSpeed().hashCode();
        }
        if (getValidLinkSpecification() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValidLinkSpecification());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValidLinkSpecification(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSpec() != null) {
            _hashCode += getSpec().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PhysicalNic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "PhysicalNic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("device");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "device"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pci");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "pci"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("driver");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "driver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkSpeed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "linkSpeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "PhysicalNicLinkInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validLinkSpecification");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "validLinkSpecification"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "PhysicalNicLinkInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "spec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "PhysicalNicSpec"));
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
