/**
 * ProfileExpressionMetadata.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ProfileExpressionMetadata  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private com.vmware.vim25.ExtendedElementDescription expressionId;

    private com.vmware.vim25.ProfileParameterMetadata[] parameter;

    public ProfileExpressionMetadata() {
    }

    public ProfileExpressionMetadata(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.ExtendedElementDescription expressionId,
           com.vmware.vim25.ProfileParameterMetadata[] parameter) {
        super(
            dynamicType,
            dynamicProperty);
        this.expressionId = expressionId;
        this.parameter = parameter;
    }


    /**
     * Gets the expressionId value for this ProfileExpressionMetadata.
     * 
     * @return expressionId
     */
    public com.vmware.vim25.ExtendedElementDescription getExpressionId() {
        return expressionId;
    }


    /**
     * Sets the expressionId value for this ProfileExpressionMetadata.
     * 
     * @param expressionId
     */
    public void setExpressionId(com.vmware.vim25.ExtendedElementDescription expressionId) {
        this.expressionId = expressionId;
    }


    /**
     * Gets the parameter value for this ProfileExpressionMetadata.
     * 
     * @return parameter
     */
    public com.vmware.vim25.ProfileParameterMetadata[] getParameter() {
        return parameter;
    }


    /**
     * Sets the parameter value for this ProfileExpressionMetadata.
     * 
     * @param parameter
     */
    public void setParameter(com.vmware.vim25.ProfileParameterMetadata[] parameter) {
        this.parameter = parameter;
    }

    public com.vmware.vim25.ProfileParameterMetadata getParameter(int i) {
        return this.parameter[i];
    }

    public void setParameter(int i, com.vmware.vim25.ProfileParameterMetadata _value) {
        this.parameter[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProfileExpressionMetadata)) return false;
        ProfileExpressionMetadata other = (ProfileExpressionMetadata) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.expressionId==null && other.getExpressionId()==null) || 
             (this.expressionId!=null &&
              this.expressionId.equals(other.getExpressionId()))) &&
            ((this.parameter==null && other.getParameter()==null) || 
             (this.parameter!=null &&
              java.util.Arrays.equals(this.parameter, other.getParameter())));
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
        if (getExpressionId() != null) {
            _hashCode += getExpressionId().hashCode();
        }
        if (getParameter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParameter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParameter(), i);
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
        new org.apache.axis.description.TypeDesc(ProfileExpressionMetadata.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ProfileExpressionMetadata"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expressionId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "expressionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ExtendedElementDescription"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "parameter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ProfileParameterMetadata"));
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
