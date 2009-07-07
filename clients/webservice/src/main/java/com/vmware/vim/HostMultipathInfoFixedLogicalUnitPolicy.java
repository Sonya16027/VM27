/**
 * HostMultipathInfoFixedLogicalUnitPolicy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostMultipathInfoFixedLogicalUnitPolicy  extends com.vmware.vim.HostMultipathInfoLogicalUnitPolicy  implements java.io.Serializable {
    private java.lang.String prefer;

    public HostMultipathInfoFixedLogicalUnitPolicy() {
    }

    public HostMultipathInfoFixedLogicalUnitPolicy(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           java.lang.String policy,
           java.lang.String prefer) {
        super(
            dynamicType,
            dynamicProperty,
            policy);
        this.prefer = prefer;
    }


    /**
     * Gets the prefer value for this HostMultipathInfoFixedLogicalUnitPolicy.
     * 
     * @return prefer
     */
    public java.lang.String getPrefer() {
        return prefer;
    }


    /**
     * Sets the prefer value for this HostMultipathInfoFixedLogicalUnitPolicy.
     * 
     * @param prefer
     */
    public void setPrefer(java.lang.String prefer) {
        this.prefer = prefer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostMultipathInfoFixedLogicalUnitPolicy)) return false;
        HostMultipathInfoFixedLogicalUnitPolicy other = (HostMultipathInfoFixedLogicalUnitPolicy) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.prefer==null && other.getPrefer()==null) || 
             (this.prefer!=null &&
              this.prefer.equals(other.getPrefer())));
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
        if (getPrefer() != null) {
            _hashCode += getPrefer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostMultipathInfoFixedLogicalUnitPolicy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostMultipathInfoFixedLogicalUnitPolicy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "prefer"));
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
