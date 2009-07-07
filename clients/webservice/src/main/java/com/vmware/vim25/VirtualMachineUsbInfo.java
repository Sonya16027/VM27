/**
 * VirtualMachineUsbInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualMachineUsbInfo  extends com.vmware.vim25.VirtualMachineTargetInfo  implements java.io.Serializable {
    private java.lang.String description;

    private int vendor;

    private int product;

    private java.lang.String physicalPath;

    private java.lang.String[] family;

    private java.lang.String[] speed;

    private com.vmware.vim25.VirtualMachineSummary summary;

    public VirtualMachineUsbInfo() {
    }

    public VirtualMachineUsbInfo(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String name,
           java.lang.String[] configurationTag,
           java.lang.String description,
           int vendor,
           int product,
           java.lang.String physicalPath,
           java.lang.String[] family,
           java.lang.String[] speed,
           com.vmware.vim25.VirtualMachineSummary summary) {
        super(
            dynamicType,
            dynamicProperty,
            name,
            configurationTag);
        this.description = description;
        this.vendor = vendor;
        this.product = product;
        this.physicalPath = physicalPath;
        this.family = family;
        this.speed = speed;
        this.summary = summary;
    }


    /**
     * Gets the description value for this VirtualMachineUsbInfo.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this VirtualMachineUsbInfo.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the vendor value for this VirtualMachineUsbInfo.
     * 
     * @return vendor
     */
    public int getVendor() {
        return vendor;
    }


    /**
     * Sets the vendor value for this VirtualMachineUsbInfo.
     * 
     * @param vendor
     */
    public void setVendor(int vendor) {
        this.vendor = vendor;
    }


    /**
     * Gets the product value for this VirtualMachineUsbInfo.
     * 
     * @return product
     */
    public int getProduct() {
        return product;
    }


    /**
     * Sets the product value for this VirtualMachineUsbInfo.
     * 
     * @param product
     */
    public void setProduct(int product) {
        this.product = product;
    }


    /**
     * Gets the physicalPath value for this VirtualMachineUsbInfo.
     * 
     * @return physicalPath
     */
    public java.lang.String getPhysicalPath() {
        return physicalPath;
    }


    /**
     * Sets the physicalPath value for this VirtualMachineUsbInfo.
     * 
     * @param physicalPath
     */
    public void setPhysicalPath(java.lang.String physicalPath) {
        this.physicalPath = physicalPath;
    }


    /**
     * Gets the family value for this VirtualMachineUsbInfo.
     * 
     * @return family
     */
    public java.lang.String[] getFamily() {
        return family;
    }


    /**
     * Sets the family value for this VirtualMachineUsbInfo.
     * 
     * @param family
     */
    public void setFamily(java.lang.String[] family) {
        this.family = family;
    }

    public java.lang.String getFamily(int i) {
        return this.family[i];
    }

    public void setFamily(int i, java.lang.String _value) {
        this.family[i] = _value;
    }


    /**
     * Gets the speed value for this VirtualMachineUsbInfo.
     * 
     * @return speed
     */
    public java.lang.String[] getSpeed() {
        return speed;
    }


    /**
     * Sets the speed value for this VirtualMachineUsbInfo.
     * 
     * @param speed
     */
    public void setSpeed(java.lang.String[] speed) {
        this.speed = speed;
    }

    public java.lang.String getSpeed(int i) {
        return this.speed[i];
    }

    public void setSpeed(int i, java.lang.String _value) {
        this.speed[i] = _value;
    }


    /**
     * Gets the summary value for this VirtualMachineUsbInfo.
     * 
     * @return summary
     */
    public com.vmware.vim25.VirtualMachineSummary getSummary() {
        return summary;
    }


    /**
     * Sets the summary value for this VirtualMachineUsbInfo.
     * 
     * @param summary
     */
    public void setSummary(com.vmware.vim25.VirtualMachineSummary summary) {
        this.summary = summary;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualMachineUsbInfo)) return false;
        VirtualMachineUsbInfo other = (VirtualMachineUsbInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.vendor == other.getVendor() &&
            this.product == other.getProduct() &&
            ((this.physicalPath==null && other.getPhysicalPath()==null) || 
             (this.physicalPath!=null &&
              this.physicalPath.equals(other.getPhysicalPath()))) &&
            ((this.family==null && other.getFamily()==null) || 
             (this.family!=null &&
              java.util.Arrays.equals(this.family, other.getFamily()))) &&
            ((this.speed==null && other.getSpeed()==null) || 
             (this.speed!=null &&
              java.util.Arrays.equals(this.speed, other.getSpeed()))) &&
            ((this.summary==null && other.getSummary()==null) || 
             (this.summary!=null &&
              this.summary.equals(other.getSummary())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += getVendor();
        _hashCode += getProduct();
        if (getPhysicalPath() != null) {
            _hashCode += getPhysicalPath().hashCode();
        }
        if (getFamily() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFamily());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFamily(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSpeed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSpeed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSpeed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSummary() != null) {
            _hashCode += getSummary().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualMachineUsbInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineUsbInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vendor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("physicalPath");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "physicalPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("family");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "family"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("speed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "speed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "summary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineSummary"));
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
