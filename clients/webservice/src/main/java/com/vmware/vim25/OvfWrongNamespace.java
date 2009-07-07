/**
 * OvfWrongNamespace.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class OvfWrongNamespace  extends com.vmware.vim25.OvfInvalidPackage  implements java.io.Serializable {
    private java.lang.String namespaceName;

    public OvfWrongNamespace() {
    }

    public OvfWrongNamespace(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.LocalizedMethodFault faultCause,
           com.vmware.vim25.LocalizableMessage[] faultMessage,
           int lineNumber,
           java.lang.String namespaceName) {
        super(
            dynamicType,
            dynamicProperty,
            faultCause,
            faultMessage,
            lineNumber);
        this.namespaceName = namespaceName;
    }


    /**
     * Gets the namespaceName value for this OvfWrongNamespace.
     * 
     * @return namespaceName
     */
    public java.lang.String getNamespaceName() {
        return namespaceName;
    }


    /**
     * Sets the namespaceName value for this OvfWrongNamespace.
     * 
     * @param namespaceName
     */
    public void setNamespaceName(java.lang.String namespaceName) {
        this.namespaceName = namespaceName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OvfWrongNamespace)) return false;
        OvfWrongNamespace other = (OvfWrongNamespace) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.namespaceName==null && other.getNamespaceName()==null) || 
             (this.namespaceName!=null &&
              this.namespaceName.equals(other.getNamespaceName())));
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
        if (getNamespaceName() != null) {
            _hashCode += getNamespaceName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OvfWrongNamespace.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OvfWrongNamespace"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("namespaceName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "namespaceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
