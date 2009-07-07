/**
 * ComplianceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ComplianceLocator  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.String expressionName;

    private com.vmware.vim25.ProfilePropertyPath applyPath;

    public ComplianceLocator() {
    }

    public ComplianceLocator(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String expressionName,
           com.vmware.vim25.ProfilePropertyPath applyPath) {
        super(
            dynamicType,
            dynamicProperty);
        this.expressionName = expressionName;
        this.applyPath = applyPath;
    }


    /**
     * Gets the expressionName value for this ComplianceLocator.
     * 
     * @return expressionName
     */
    public java.lang.String getExpressionName() {
        return expressionName;
    }


    /**
     * Sets the expressionName value for this ComplianceLocator.
     * 
     * @param expressionName
     */
    public void setExpressionName(java.lang.String expressionName) {
        this.expressionName = expressionName;
    }


    /**
     * Gets the applyPath value for this ComplianceLocator.
     * 
     * @return applyPath
     */
    public com.vmware.vim25.ProfilePropertyPath getApplyPath() {
        return applyPath;
    }


    /**
     * Sets the applyPath value for this ComplianceLocator.
     * 
     * @param applyPath
     */
    public void setApplyPath(com.vmware.vim25.ProfilePropertyPath applyPath) {
        this.applyPath = applyPath;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ComplianceLocator)) return false;
        ComplianceLocator other = (ComplianceLocator) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.expressionName==null && other.getExpressionName()==null) || 
             (this.expressionName!=null &&
              this.expressionName.equals(other.getExpressionName()))) &&
            ((this.applyPath==null && other.getApplyPath()==null) || 
             (this.applyPath!=null &&
              this.applyPath.equals(other.getApplyPath())));
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
        if (getExpressionName() != null) {
            _hashCode += getExpressionName().hashCode();
        }
        if (getApplyPath() != null) {
            _hashCode += getApplyPath().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ComplianceLocator.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ComplianceLocator"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expressionName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "expressionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyPath");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "applyPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ProfilePropertyPath"));
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
