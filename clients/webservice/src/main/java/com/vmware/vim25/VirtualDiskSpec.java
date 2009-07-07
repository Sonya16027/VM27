/**
 * VirtualDiskSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualDiskSpec  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.String diskType;

    private java.lang.String adapterType;

    public VirtualDiskSpec() {
    }

    public VirtualDiskSpec(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String diskType,
           java.lang.String adapterType) {
        super(
            dynamicType,
            dynamicProperty);
        this.diskType = diskType;
        this.adapterType = adapterType;
    }


    /**
     * Gets the diskType value for this VirtualDiskSpec.
     * 
     * @return diskType
     */
    public java.lang.String getDiskType() {
        return diskType;
    }


    /**
     * Sets the diskType value for this VirtualDiskSpec.
     * 
     * @param diskType
     */
    public void setDiskType(java.lang.String diskType) {
        this.diskType = diskType;
    }


    /**
     * Gets the adapterType value for this VirtualDiskSpec.
     * 
     * @return adapterType
     */
    public java.lang.String getAdapterType() {
        return adapterType;
    }


    /**
     * Sets the adapterType value for this VirtualDiskSpec.
     * 
     * @param adapterType
     */
    public void setAdapterType(java.lang.String adapterType) {
        this.adapterType = adapterType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualDiskSpec)) return false;
        VirtualDiskSpec other = (VirtualDiskSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.diskType==null && other.getDiskType()==null) || 
             (this.diskType!=null &&
              this.diskType.equals(other.getDiskType()))) &&
            ((this.adapterType==null && other.getAdapterType()==null) || 
             (this.adapterType!=null &&
              this.adapterType.equals(other.getAdapterType())));
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
        if (getDiskType() != null) {
            _hashCode += getDiskType().hashCode();
        }
        if (getAdapterType() != null) {
            _hashCode += getAdapterType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualDiskSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDiskSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "diskType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adapterType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "adapterType"));
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
