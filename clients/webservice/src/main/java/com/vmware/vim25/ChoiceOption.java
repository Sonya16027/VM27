/**
 * ChoiceOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ChoiceOption  extends com.vmware.vim25.OptionType  implements java.io.Serializable {
    private com.vmware.vim25.ElementDescription[] choiceInfo;

    private java.lang.Integer defaultIndex;

    public ChoiceOption() {
    }

    public ChoiceOption(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.Boolean valueIsReadonly,
           com.vmware.vim25.ElementDescription[] choiceInfo,
           java.lang.Integer defaultIndex) {
        super(
            dynamicType,
            dynamicProperty,
            valueIsReadonly);
        this.choiceInfo = choiceInfo;
        this.defaultIndex = defaultIndex;
    }


    /**
     * Gets the choiceInfo value for this ChoiceOption.
     * 
     * @return choiceInfo
     */
    public com.vmware.vim25.ElementDescription[] getChoiceInfo() {
        return choiceInfo;
    }


    /**
     * Sets the choiceInfo value for this ChoiceOption.
     * 
     * @param choiceInfo
     */
    public void setChoiceInfo(com.vmware.vim25.ElementDescription[] choiceInfo) {
        this.choiceInfo = choiceInfo;
    }

    public com.vmware.vim25.ElementDescription getChoiceInfo(int i) {
        return this.choiceInfo[i];
    }

    public void setChoiceInfo(int i, com.vmware.vim25.ElementDescription _value) {
        this.choiceInfo[i] = _value;
    }


    /**
     * Gets the defaultIndex value for this ChoiceOption.
     * 
     * @return defaultIndex
     */
    public java.lang.Integer getDefaultIndex() {
        return defaultIndex;
    }


    /**
     * Sets the defaultIndex value for this ChoiceOption.
     * 
     * @param defaultIndex
     */
    public void setDefaultIndex(java.lang.Integer defaultIndex) {
        this.defaultIndex = defaultIndex;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChoiceOption)) return false;
        ChoiceOption other = (ChoiceOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.choiceInfo==null && other.getChoiceInfo()==null) || 
             (this.choiceInfo!=null &&
              java.util.Arrays.equals(this.choiceInfo, other.getChoiceInfo()))) &&
            ((this.defaultIndex==null && other.getDefaultIndex()==null) || 
             (this.defaultIndex!=null &&
              this.defaultIndex.equals(other.getDefaultIndex())));
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
        if (getChoiceInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChoiceInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChoiceInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDefaultIndex() != null) {
            _hashCode += getDefaultIndex().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChoiceOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ChoiceOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("choiceInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "choiceInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ElementDescription"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "defaultIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
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
