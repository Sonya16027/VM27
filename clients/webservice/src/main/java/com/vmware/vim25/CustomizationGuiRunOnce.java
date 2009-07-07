/**
 * CustomizationGuiRunOnce.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class CustomizationGuiRunOnce  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.String[] commandList;

    public CustomizationGuiRunOnce() {
    }

    public CustomizationGuiRunOnce(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String[] commandList) {
        super(
            dynamicType,
            dynamicProperty);
        this.commandList = commandList;
    }


    /**
     * Gets the commandList value for this CustomizationGuiRunOnce.
     * 
     * @return commandList
     */
    public java.lang.String[] getCommandList() {
        return commandList;
    }


    /**
     * Sets the commandList value for this CustomizationGuiRunOnce.
     * 
     * @param commandList
     */
    public void setCommandList(java.lang.String[] commandList) {
        this.commandList = commandList;
    }

    public java.lang.String getCommandList(int i) {
        return this.commandList[i];
    }

    public void setCommandList(int i, java.lang.String _value) {
        this.commandList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomizationGuiRunOnce)) return false;
        CustomizationGuiRunOnce other = (CustomizationGuiRunOnce) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.commandList==null && other.getCommandList()==null) || 
             (this.commandList!=null &&
              java.util.Arrays.equals(this.commandList, other.getCommandList())));
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
        if (getCommandList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCommandList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCommandList(), i);
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
        new org.apache.axis.description.TypeDesc(CustomizationGuiRunOnce.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "CustomizationGuiRunOnce"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commandList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "commandList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
