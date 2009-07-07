/**
 * VmfsDatastoreMultipleExtentOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VmfsDatastoreMultipleExtentOption  extends com.vmware.vim25.VmfsDatastoreBaseOption  implements java.io.Serializable {
    private com.vmware.vim25.HostDiskPartitionBlockRange[] vmfsExtent;

    public VmfsDatastoreMultipleExtentOption() {
    }

    public VmfsDatastoreMultipleExtentOption(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.HostDiskPartitionLayout layout,
           com.vmware.vim25.HostDiskPartitionBlockRange[] vmfsExtent) {
        super(
            dynamicType,
            dynamicProperty,
            layout);
        this.vmfsExtent = vmfsExtent;
    }


    /**
     * Gets the vmfsExtent value for this VmfsDatastoreMultipleExtentOption.
     * 
     * @return vmfsExtent
     */
    public com.vmware.vim25.HostDiskPartitionBlockRange[] getVmfsExtent() {
        return vmfsExtent;
    }


    /**
     * Sets the vmfsExtent value for this VmfsDatastoreMultipleExtentOption.
     * 
     * @param vmfsExtent
     */
    public void setVmfsExtent(com.vmware.vim25.HostDiskPartitionBlockRange[] vmfsExtent) {
        this.vmfsExtent = vmfsExtent;
    }

    public com.vmware.vim25.HostDiskPartitionBlockRange getVmfsExtent(int i) {
        return this.vmfsExtent[i];
    }

    public void setVmfsExtent(int i, com.vmware.vim25.HostDiskPartitionBlockRange _value) {
        this.vmfsExtent[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VmfsDatastoreMultipleExtentOption)) return false;
        VmfsDatastoreMultipleExtentOption other = (VmfsDatastoreMultipleExtentOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vmfsExtent==null && other.getVmfsExtent()==null) || 
             (this.vmfsExtent!=null &&
              java.util.Arrays.equals(this.vmfsExtent, other.getVmfsExtent())));
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
        if (getVmfsExtent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVmfsExtent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVmfsExtent(), i);
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
        new org.apache.axis.description.TypeDesc(VmfsDatastoreMultipleExtentOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VmfsDatastoreMultipleExtentOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmfsExtent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmfsExtent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostDiskPartitionBlockRange"));
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
