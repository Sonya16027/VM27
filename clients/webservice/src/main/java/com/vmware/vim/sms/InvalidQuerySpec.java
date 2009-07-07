/**
 * InvalidQuerySpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim.sms;

public class InvalidQuerySpec  extends com.vmware.vim.sms.InvalidArgument  implements java.io.Serializable {
    private com.vmware.vim.sms.QuerySpec querySpec;

    public InvalidQuerySpec() {
    }

    public InvalidQuerySpec(
           java.lang.String dynamicType,
           com.vmware.vim.sms.DynamicProperty[] dynamicProperty,
           java.lang.String invalidProperty,
           com.vmware.vim.sms.QuerySpec querySpec) {
        super(
            dynamicType,
            dynamicProperty,
            invalidProperty);
        this.querySpec = querySpec;
    }


    /**
     * Gets the querySpec value for this InvalidQuerySpec.
     * 
     * @return querySpec
     */
    public com.vmware.vim.sms.QuerySpec getQuerySpec() {
        return querySpec;
    }


    /**
     * Sets the querySpec value for this InvalidQuerySpec.
     * 
     * @param querySpec
     */
    public void setQuerySpec(com.vmware.vim.sms.QuerySpec querySpec) {
        this.querySpec = querySpec;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvalidQuerySpec)) return false;
        InvalidQuerySpec other = (InvalidQuerySpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.querySpec==null && other.getQuerySpec()==null) || 
             (this.querySpec!=null &&
              this.querySpec.equals(other.getQuerySpec())));
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
        if (getQuerySpec() != null) {
            _hashCode += getQuerySpec().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InvalidQuerySpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sm1", "InvalidQuerySpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("querySpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1", "querySpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sm1", "QuerySpec"));
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
