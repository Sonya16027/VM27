/**
 * OvfCreateDescriptorParams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class OvfCreateDescriptorParams  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private com.vmware.vim25.OvfFile[] ovfFiles;

    private java.lang.String name;

    private java.lang.String description;

    public OvfCreateDescriptorParams() {
    }

    public OvfCreateDescriptorParams(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.OvfFile[] ovfFiles,
           java.lang.String name,
           java.lang.String description) {
        super(
            dynamicType,
            dynamicProperty);
        this.ovfFiles = ovfFiles;
        this.name = name;
        this.description = description;
    }


    /**
     * Gets the ovfFiles value for this OvfCreateDescriptorParams.
     * 
     * @return ovfFiles
     */
    public com.vmware.vim25.OvfFile[] getOvfFiles() {
        return ovfFiles;
    }


    /**
     * Sets the ovfFiles value for this OvfCreateDescriptorParams.
     * 
     * @param ovfFiles
     */
    public void setOvfFiles(com.vmware.vim25.OvfFile[] ovfFiles) {
        this.ovfFiles = ovfFiles;
    }

    public com.vmware.vim25.OvfFile getOvfFiles(int i) {
        return this.ovfFiles[i];
    }

    public void setOvfFiles(int i, com.vmware.vim25.OvfFile _value) {
        this.ovfFiles[i] = _value;
    }


    /**
     * Gets the name value for this OvfCreateDescriptorParams.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this OvfCreateDescriptorParams.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this OvfCreateDescriptorParams.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this OvfCreateDescriptorParams.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OvfCreateDescriptorParams)) return false;
        OvfCreateDescriptorParams other = (OvfCreateDescriptorParams) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ovfFiles==null && other.getOvfFiles()==null) || 
             (this.ovfFiles!=null &&
              java.util.Arrays.equals(this.ovfFiles, other.getOvfFiles()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription())));
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
        if (getOvfFiles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOvfFiles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOvfFiles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OvfCreateDescriptorParams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OvfCreateDescriptorParams"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ovfFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ovfFiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OvfFile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
