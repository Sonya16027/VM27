/**
 * InvalidSortSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim.sms;

public class InvalidSortSpec  extends com.vmware.vim.sms.InvalidArgument  implements java.io.Serializable {
    private com.vmware.vim.sms.SortSpec sortSpec;

    public InvalidSortSpec() {
    }

    public InvalidSortSpec(
           java.lang.String dynamicType,
           com.vmware.vim.sms.DynamicProperty[] dynamicProperty,
           java.lang.String invalidProperty,
           com.vmware.vim.sms.SortSpec sortSpec) {
        super(
            dynamicType,
            dynamicProperty,
            invalidProperty);
        this.sortSpec = sortSpec;
    }


    /**
     * Gets the sortSpec value for this InvalidSortSpec.
     * 
     * @return sortSpec
     */
    public com.vmware.vim.sms.SortSpec getSortSpec() {
        return sortSpec;
    }


    /**
     * Sets the sortSpec value for this InvalidSortSpec.
     * 
     * @param sortSpec
     */
    public void setSortSpec(com.vmware.vim.sms.SortSpec sortSpec) {
        this.sortSpec = sortSpec;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvalidSortSpec)) return false;
        InvalidSortSpec other = (InvalidSortSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sortSpec==null && other.getSortSpec()==null) || 
             (this.sortSpec!=null &&
              this.sortSpec.equals(other.getSortSpec())));
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
        if (getSortSpec() != null) {
            _hashCode += getSortSpec().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InvalidSortSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sm1", "InvalidSortSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1", "sortSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sm1", "SortSpec"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
