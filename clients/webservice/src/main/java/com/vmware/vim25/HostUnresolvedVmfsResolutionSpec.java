/**
 * HostUnresolvedVmfsResolutionSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostUnresolvedVmfsResolutionSpec  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.String[] extentDevicePath;

    private java.lang.String uuidResolution;

    public HostUnresolvedVmfsResolutionSpec() {
    }

    public HostUnresolvedVmfsResolutionSpec(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String[] extentDevicePath,
           java.lang.String uuidResolution) {
        super(
            dynamicType,
            dynamicProperty);
        this.extentDevicePath = extentDevicePath;
        this.uuidResolution = uuidResolution;
    }


    /**
     * Gets the extentDevicePath value for this HostUnresolvedVmfsResolutionSpec.
     * 
     * @return extentDevicePath
     */
    public java.lang.String[] getExtentDevicePath() {
        return extentDevicePath;
    }


    /**
     * Sets the extentDevicePath value for this HostUnresolvedVmfsResolutionSpec.
     * 
     * @param extentDevicePath
     */
    public void setExtentDevicePath(java.lang.String[] extentDevicePath) {
        this.extentDevicePath = extentDevicePath;
    }

    public java.lang.String getExtentDevicePath(int i) {
        return this.extentDevicePath[i];
    }

    public void setExtentDevicePath(int i, java.lang.String _value) {
        this.extentDevicePath[i] = _value;
    }


    /**
     * Gets the uuidResolution value for this HostUnresolvedVmfsResolutionSpec.
     * 
     * @return uuidResolution
     */
    public java.lang.String getUuidResolution() {
        return uuidResolution;
    }


    /**
     * Sets the uuidResolution value for this HostUnresolvedVmfsResolutionSpec.
     * 
     * @param uuidResolution
     */
    public void setUuidResolution(java.lang.String uuidResolution) {
        this.uuidResolution = uuidResolution;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostUnresolvedVmfsResolutionSpec)) return false;
        HostUnresolvedVmfsResolutionSpec other = (HostUnresolvedVmfsResolutionSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.extentDevicePath==null && other.getExtentDevicePath()==null) || 
             (this.extentDevicePath!=null &&
              java.util.Arrays.equals(this.extentDevicePath, other.getExtentDevicePath()))) &&
            ((this.uuidResolution==null && other.getUuidResolution()==null) || 
             (this.uuidResolution!=null &&
              this.uuidResolution.equals(other.getUuidResolution())));
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
        if (getExtentDevicePath() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExtentDevicePath());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExtentDevicePath(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUuidResolution() != null) {
            _hashCode += getUuidResolution().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostUnresolvedVmfsResolutionSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostUnresolvedVmfsResolutionSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extentDevicePath");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "extentDevicePath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uuidResolution");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "uuidResolution"));
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
