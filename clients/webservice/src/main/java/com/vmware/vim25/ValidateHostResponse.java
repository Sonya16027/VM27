/**
 * ValidateHostResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ValidateHostResponse  implements java.io.Serializable {
    private com.vmware.vim25.OvfValidateHostResult returnval;

    public ValidateHostResponse() {
    }

    public ValidateHostResponse(
           com.vmware.vim25.OvfValidateHostResult returnval) {
           this.returnval = returnval;
    }


    /**
     * Gets the returnval value for this ValidateHostResponse.
     * 
     * @return returnval
     */
    public com.vmware.vim25.OvfValidateHostResult getReturnval() {
        return returnval;
    }


    /**
     * Sets the returnval value for this ValidateHostResponse.
     * 
     * @param returnval
     */
    public void setReturnval(com.vmware.vim25.OvfValidateHostResult returnval) {
        this.returnval = returnval;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidateHostResponse)) return false;
        ValidateHostResponse other = (ValidateHostResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.returnval==null && other.getReturnval()==null) || 
             (this.returnval!=null &&
              this.returnval.equals(other.getReturnval())));
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
        if (getReturnval() != null) {
            _hashCode += getReturnval().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidateHostResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", ">ValidateHostResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnval");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "returnval"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OvfValidateHostResult"));
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
