/**
 * ArrayOfLicenseFeatureInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfLicenseFeatureInfo  implements java.io.Serializable {
    private com.vmware.vim25.LicenseFeatureInfo[] licenseFeatureInfo;

    public ArrayOfLicenseFeatureInfo() {
    }

    public ArrayOfLicenseFeatureInfo(
           com.vmware.vim25.LicenseFeatureInfo[] licenseFeatureInfo) {
           this.licenseFeatureInfo = licenseFeatureInfo;
    }


    /**
     * Gets the licenseFeatureInfo value for this ArrayOfLicenseFeatureInfo.
     * 
     * @return licenseFeatureInfo
     */
    public com.vmware.vim25.LicenseFeatureInfo[] getLicenseFeatureInfo() {
        return licenseFeatureInfo;
    }


    /**
     * Sets the licenseFeatureInfo value for this ArrayOfLicenseFeatureInfo.
     * 
     * @param licenseFeatureInfo
     */
    public void setLicenseFeatureInfo(com.vmware.vim25.LicenseFeatureInfo[] licenseFeatureInfo) {
        this.licenseFeatureInfo = licenseFeatureInfo;
    }

    public com.vmware.vim25.LicenseFeatureInfo getLicenseFeatureInfo(int i) {
        return this.licenseFeatureInfo[i];
    }

    public void setLicenseFeatureInfo(int i, com.vmware.vim25.LicenseFeatureInfo _value) {
        this.licenseFeatureInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfLicenseFeatureInfo)) return false;
        ArrayOfLicenseFeatureInfo other = (ArrayOfLicenseFeatureInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.licenseFeatureInfo==null && other.getLicenseFeatureInfo()==null) || 
             (this.licenseFeatureInfo!=null &&
              java.util.Arrays.equals(this.licenseFeatureInfo, other.getLicenseFeatureInfo())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getLicenseFeatureInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLicenseFeatureInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLicenseFeatureInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfLicenseFeatureInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfLicenseFeatureInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseFeatureInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "LicenseFeatureInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LicenseFeatureInfo"));
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
