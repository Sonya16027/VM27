/**
 * HostDigestInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostDigestInfo  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.String digestMethod;

    private byte[] digestValue;

    private java.lang.String objectName;

    public HostDigestInfo() {
    }

    public HostDigestInfo(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String digestMethod,
           byte[] digestValue,
           java.lang.String objectName) {
        super(
            dynamicType,
            dynamicProperty);
        this.digestMethod = digestMethod;
        this.digestValue = digestValue;
        this.objectName = objectName;
    }


    /**
     * Gets the digestMethod value for this HostDigestInfo.
     * 
     * @return digestMethod
     */
    public java.lang.String getDigestMethod() {
        return digestMethod;
    }


    /**
     * Sets the digestMethod value for this HostDigestInfo.
     * 
     * @param digestMethod
     */
    public void setDigestMethod(java.lang.String digestMethod) {
        this.digestMethod = digestMethod;
    }


    /**
     * Gets the digestValue value for this HostDigestInfo.
     * 
     * @return digestValue
     */
    public byte[] getDigestValue() {
        return digestValue;
    }


    /**
     * Sets the digestValue value for this HostDigestInfo.
     * 
     * @param digestValue
     */
    public void setDigestValue(byte[] digestValue) {
        this.digestValue = digestValue;
    }

    public byte getDigestValue(int i) {
        return this.digestValue[i];
    }

    public void setDigestValue(int i, byte _value) {
        this.digestValue[i] = _value;
    }


    /**
     * Gets the objectName value for this HostDigestInfo.
     * 
     * @return objectName
     */
    public java.lang.String getObjectName() {
        return objectName;
    }


    /**
     * Sets the objectName value for this HostDigestInfo.
     * 
     * @param objectName
     */
    public void setObjectName(java.lang.String objectName) {
        this.objectName = objectName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostDigestInfo)) return false;
        HostDigestInfo other = (HostDigestInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.digestMethod==null && other.getDigestMethod()==null) || 
             (this.digestMethod!=null &&
              this.digestMethod.equals(other.getDigestMethod()))) &&
            ((this.digestValue==null && other.getDigestValue()==null) || 
             (this.digestValue!=null &&
              java.util.Arrays.equals(this.digestValue, other.getDigestValue()))) &&
            ((this.objectName==null && other.getObjectName()==null) || 
             (this.objectName!=null &&
              this.objectName.equals(other.getObjectName())));
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
        if (getDigestMethod() != null) {
            _hashCode += getDigestMethod().hashCode();
        }
        if (getDigestValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDigestValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDigestValue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getObjectName() != null) {
            _hashCode += getObjectName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostDigestInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostDigestInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("digestMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "digestMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("digestValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "digestValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "byte"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "objectName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
