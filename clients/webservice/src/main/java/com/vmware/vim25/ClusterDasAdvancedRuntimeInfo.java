/**
 * ClusterDasAdvancedRuntimeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ClusterDasAdvancedRuntimeInfo  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private com.vmware.vim25.ClusterDasHostInfo dasHostInfo;

    public ClusterDasAdvancedRuntimeInfo() {
    }

    public ClusterDasAdvancedRuntimeInfo(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.ClusterDasHostInfo dasHostInfo) {
        super(
            dynamicType,
            dynamicProperty);
        this.dasHostInfo = dasHostInfo;
    }


    /**
     * Gets the dasHostInfo value for this ClusterDasAdvancedRuntimeInfo.
     * 
     * @return dasHostInfo
     */
    public com.vmware.vim25.ClusterDasHostInfo getDasHostInfo() {
        return dasHostInfo;
    }


    /**
     * Sets the dasHostInfo value for this ClusterDasAdvancedRuntimeInfo.
     * 
     * @param dasHostInfo
     */
    public void setDasHostInfo(com.vmware.vim25.ClusterDasHostInfo dasHostInfo) {
        this.dasHostInfo = dasHostInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClusterDasAdvancedRuntimeInfo)) return false;
        ClusterDasAdvancedRuntimeInfo other = (ClusterDasAdvancedRuntimeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dasHostInfo==null && other.getDasHostInfo()==null) || 
             (this.dasHostInfo!=null &&
              this.dasHostInfo.equals(other.getDasHostInfo())));
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
        if (getDasHostInfo() != null) {
            _hashCode += getDasHostInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClusterDasAdvancedRuntimeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDasAdvancedRuntimeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dasHostInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dasHostInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDasHostInfo"));
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
