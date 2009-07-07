/**
 * ArrayOfHostDiskPartitionAttributes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ArrayOfHostDiskPartitionAttributes  implements java.io.Serializable {
    private com.vmware.vim.HostDiskPartitionAttributes[] hostDiskPartitionAttributes;

    public ArrayOfHostDiskPartitionAttributes() {
    }

    public ArrayOfHostDiskPartitionAttributes(
           com.vmware.vim.HostDiskPartitionAttributes[] hostDiskPartitionAttributes) {
           this.hostDiskPartitionAttributes = hostDiskPartitionAttributes;
    }


    /**
     * Gets the hostDiskPartitionAttributes value for this ArrayOfHostDiskPartitionAttributes.
     * 
     * @return hostDiskPartitionAttributes
     */
    public com.vmware.vim.HostDiskPartitionAttributes[] getHostDiskPartitionAttributes() {
        return hostDiskPartitionAttributes;
    }


    /**
     * Sets the hostDiskPartitionAttributes value for this ArrayOfHostDiskPartitionAttributes.
     * 
     * @param hostDiskPartitionAttributes
     */
    public void setHostDiskPartitionAttributes(com.vmware.vim.HostDiskPartitionAttributes[] hostDiskPartitionAttributes) {
        this.hostDiskPartitionAttributes = hostDiskPartitionAttributes;
    }

    public com.vmware.vim.HostDiskPartitionAttributes getHostDiskPartitionAttributes(int i) {
        return this.hostDiskPartitionAttributes[i];
    }

    public void setHostDiskPartitionAttributes(int i, com.vmware.vim.HostDiskPartitionAttributes _value) {
        this.hostDiskPartitionAttributes[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostDiskPartitionAttributes)) return false;
        ArrayOfHostDiskPartitionAttributes other = (ArrayOfHostDiskPartitionAttributes) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostDiskPartitionAttributes==null && other.getHostDiskPartitionAttributes()==null) || 
             (this.hostDiskPartitionAttributes!=null &&
              java.util.Arrays.equals(this.hostDiskPartitionAttributes, other.getHostDiskPartitionAttributes())));
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
        if (getHostDiskPartitionAttributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostDiskPartitionAttributes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostDiskPartitionAttributes(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostDiskPartitionAttributes.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ArrayOfHostDiskPartitionAttributes"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostDiskPartitionAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "HostDiskPartitionAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostDiskPartitionAttributes"));
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
