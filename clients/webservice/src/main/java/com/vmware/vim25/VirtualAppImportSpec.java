/**
 * VirtualAppImportSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualAppImportSpec  extends com.vmware.vim25.ImportSpec  implements java.io.Serializable {
    private java.lang.String name;

    private com.vmware.vim25.VAppConfigSpec vAppConfigSpec;

    private com.vmware.vim25.ResourceConfigSpec resourcePoolSpec;

    private com.vmware.vim25.ImportSpec[] child;

    public VirtualAppImportSpec() {
    }

    public VirtualAppImportSpec(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.VAppEntityConfigInfo entityConfig,
           java.lang.String name,
           com.vmware.vim25.VAppConfigSpec vAppConfigSpec,
           com.vmware.vim25.ResourceConfigSpec resourcePoolSpec,
           com.vmware.vim25.ImportSpec[] child) {
        super(
            dynamicType,
            dynamicProperty,
            entityConfig);
        this.name = name;
        this.vAppConfigSpec = vAppConfigSpec;
        this.resourcePoolSpec = resourcePoolSpec;
        this.child = child;
    }


    /**
     * Gets the name value for this VirtualAppImportSpec.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this VirtualAppImportSpec.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the vAppConfigSpec value for this VirtualAppImportSpec.
     * 
     * @return vAppConfigSpec
     */
    public com.vmware.vim25.VAppConfigSpec getVAppConfigSpec() {
        return vAppConfigSpec;
    }


    /**
     * Sets the vAppConfigSpec value for this VirtualAppImportSpec.
     * 
     * @param vAppConfigSpec
     */
    public void setVAppConfigSpec(com.vmware.vim25.VAppConfigSpec vAppConfigSpec) {
        this.vAppConfigSpec = vAppConfigSpec;
    }


    /**
     * Gets the resourcePoolSpec value for this VirtualAppImportSpec.
     * 
     * @return resourcePoolSpec
     */
    public com.vmware.vim25.ResourceConfigSpec getResourcePoolSpec() {
        return resourcePoolSpec;
    }


    /**
     * Sets the resourcePoolSpec value for this VirtualAppImportSpec.
     * 
     * @param resourcePoolSpec
     */
    public void setResourcePoolSpec(com.vmware.vim25.ResourceConfigSpec resourcePoolSpec) {
        this.resourcePoolSpec = resourcePoolSpec;
    }


    /**
     * Gets the child value for this VirtualAppImportSpec.
     * 
     * @return child
     */
    public com.vmware.vim25.ImportSpec[] getChild() {
        return child;
    }


    /**
     * Sets the child value for this VirtualAppImportSpec.
     * 
     * @param child
     */
    public void setChild(com.vmware.vim25.ImportSpec[] child) {
        this.child = child;
    }

    public com.vmware.vim25.ImportSpec getChild(int i) {
        return this.child[i];
    }

    public void setChild(int i, com.vmware.vim25.ImportSpec _value) {
        this.child[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualAppImportSpec)) return false;
        VirtualAppImportSpec other = (VirtualAppImportSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.vAppConfigSpec==null && other.getVAppConfigSpec()==null) || 
             (this.vAppConfigSpec!=null &&
              this.vAppConfigSpec.equals(other.getVAppConfigSpec()))) &&
            ((this.resourcePoolSpec==null && other.getResourcePoolSpec()==null) || 
             (this.resourcePoolSpec!=null &&
              this.resourcePoolSpec.equals(other.getResourcePoolSpec()))) &&
            ((this.child==null && other.getChild()==null) || 
             (this.child!=null &&
              java.util.Arrays.equals(this.child, other.getChild())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getVAppConfigSpec() != null) {
            _hashCode += getVAppConfigSpec().hashCode();
        }
        if (getResourcePoolSpec() != null) {
            _hashCode += getResourcePoolSpec().hashCode();
        }
        if (getChild() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChild());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChild(), i);
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
        new org.apache.axis.description.TypeDesc(VirtualAppImportSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualAppImportSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VAppConfigSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vAppConfigSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VAppConfigSpec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourcePoolSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "resourcePoolSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ResourceConfigSpec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("child");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "child"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ImportSpec"));
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
