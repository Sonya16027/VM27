/**
 * DatastoreOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class DatastoreOption  extends com.vmware.vim.DynamicData  implements java.io.Serializable {
    private com.vmware.vim.VirtualMachineDatastoreVolumeOption[] unsupportedVolumes;

    public DatastoreOption() {
    }

    public DatastoreOption(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           com.vmware.vim.VirtualMachineDatastoreVolumeOption[] unsupportedVolumes) {
        super(
            dynamicType,
            dynamicProperty);
        this.unsupportedVolumes = unsupportedVolumes;
    }


    /**
     * Gets the unsupportedVolumes value for this DatastoreOption.
     * 
     * @return unsupportedVolumes
     */
    public com.vmware.vim.VirtualMachineDatastoreVolumeOption[] getUnsupportedVolumes() {
        return unsupportedVolumes;
    }


    /**
     * Sets the unsupportedVolumes value for this DatastoreOption.
     * 
     * @param unsupportedVolumes
     */
    public void setUnsupportedVolumes(com.vmware.vim.VirtualMachineDatastoreVolumeOption[] unsupportedVolumes) {
        this.unsupportedVolumes = unsupportedVolumes;
    }

    public com.vmware.vim.VirtualMachineDatastoreVolumeOption getUnsupportedVolumes(int i) {
        return this.unsupportedVolumes[i];
    }

    public void setUnsupportedVolumes(int i, com.vmware.vim.VirtualMachineDatastoreVolumeOption _value) {
        this.unsupportedVolumes[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatastoreOption)) return false;
        DatastoreOption other = (DatastoreOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.unsupportedVolumes==null && other.getUnsupportedVolumes()==null) || 
             (this.unsupportedVolumes!=null &&
              java.util.Arrays.equals(this.unsupportedVolumes, other.getUnsupportedVolumes())));
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
        if (getUnsupportedVolumes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnsupportedVolumes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnsupportedVolumes(), i);
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
        new org.apache.axis.description.TypeDesc(DatastoreOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "DatastoreOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unsupportedVolumes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "unsupportedVolumes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "VirtualMachineDatastoreVolumeOption"));
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
