/**
 * HostStorageElementInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostStorageElementInfo  extends com.vmware.vim25.HostHardwareElementInfo  implements java.io.Serializable {
    private com.vmware.vim25.HostStorageOperationalInfo[] operationalInfo;

    public HostStorageElementInfo() {
    }

    public HostStorageElementInfo(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String name,
           com.vmware.vim25.ElementDescription status,
           com.vmware.vim25.HostStorageOperationalInfo[] operationalInfo) {
        super(
            dynamicType,
            dynamicProperty,
            name,
            status);
        this.operationalInfo = operationalInfo;
    }


    /**
     * Gets the operationalInfo value for this HostStorageElementInfo.
     * 
     * @return operationalInfo
     */
    public com.vmware.vim25.HostStorageOperationalInfo[] getOperationalInfo() {
        return operationalInfo;
    }


    /**
     * Sets the operationalInfo value for this HostStorageElementInfo.
     * 
     * @param operationalInfo
     */
    public void setOperationalInfo(com.vmware.vim25.HostStorageOperationalInfo[] operationalInfo) {
        this.operationalInfo = operationalInfo;
    }

    public com.vmware.vim25.HostStorageOperationalInfo getOperationalInfo(int i) {
        return this.operationalInfo[i];
    }

    public void setOperationalInfo(int i, com.vmware.vim25.HostStorageOperationalInfo _value) {
        this.operationalInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostStorageElementInfo)) return false;
        HostStorageElementInfo other = (HostStorageElementInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.operationalInfo==null && other.getOperationalInfo()==null) || 
             (this.operationalInfo!=null &&
              java.util.Arrays.equals(this.operationalInfo, other.getOperationalInfo())));
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
        if (getOperationalInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOperationalInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOperationalInfo(), i);
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
        new org.apache.axis.description.TypeDesc(HostStorageElementInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostStorageElementInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "operationalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostStorageOperationalInfo"));
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
