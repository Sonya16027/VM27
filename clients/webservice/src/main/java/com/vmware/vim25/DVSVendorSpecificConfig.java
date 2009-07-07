/**
 * DVSVendorSpecificConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class DVSVendorSpecificConfig  extends com.vmware.vim25.InheritablePolicy  implements java.io.Serializable {
    private com.vmware.vim25.DistributedVirtualSwitchKeyedOpaqueBlob[] keyValue;

    public DVSVendorSpecificConfig() {
    }

    public DVSVendorSpecificConfig(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           boolean inherited,
           com.vmware.vim25.DistributedVirtualSwitchKeyedOpaqueBlob[] keyValue) {
        super(
            dynamicType,
            dynamicProperty,
            inherited);
        this.keyValue = keyValue;
    }


    /**
     * Gets the keyValue value for this DVSVendorSpecificConfig.
     * 
     * @return keyValue
     */
    public com.vmware.vim25.DistributedVirtualSwitchKeyedOpaqueBlob[] getKeyValue() {
        return keyValue;
    }


    /**
     * Sets the keyValue value for this DVSVendorSpecificConfig.
     * 
     * @param keyValue
     */
    public void setKeyValue(com.vmware.vim25.DistributedVirtualSwitchKeyedOpaqueBlob[] keyValue) {
        this.keyValue = keyValue;
    }

    public com.vmware.vim25.DistributedVirtualSwitchKeyedOpaqueBlob getKeyValue(int i) {
        return this.keyValue[i];
    }

    public void setKeyValue(int i, com.vmware.vim25.DistributedVirtualSwitchKeyedOpaqueBlob _value) {
        this.keyValue[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DVSVendorSpecificConfig)) return false;
        DVSVendorSpecificConfig other = (DVSVendorSpecificConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.keyValue==null && other.getKeyValue()==null) || 
             (this.keyValue!=null &&
              java.util.Arrays.equals(this.keyValue, other.getKeyValue())));
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
        if (getKeyValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeyValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeyValue(), i);
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
        new org.apache.axis.description.TypeDesc(DVSVendorSpecificConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVSVendorSpecificConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "keyValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchKeyedOpaqueBlob"));
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
