/**
 * HostVMotionManagerReparentSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostVMotionManagerReparentSpec  extends com.vmware.vim.DynamicData  implements java.io.Serializable {
    private int busNumber;

    private int unitNumber;

    private java.lang.String filename;

    public HostVMotionManagerReparentSpec() {
    }

    public HostVMotionManagerReparentSpec(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           int busNumber,
           int unitNumber,
           java.lang.String filename) {
        super(
            dynamicType,
            dynamicProperty);
        this.busNumber = busNumber;
        this.unitNumber = unitNumber;
        this.filename = filename;
    }


    /**
     * Gets the busNumber value for this HostVMotionManagerReparentSpec.
     * 
     * @return busNumber
     */
    public int getBusNumber() {
        return busNumber;
    }


    /**
     * Sets the busNumber value for this HostVMotionManagerReparentSpec.
     * 
     * @param busNumber
     */
    public void setBusNumber(int busNumber) {
        this.busNumber = busNumber;
    }


    /**
     * Gets the unitNumber value for this HostVMotionManagerReparentSpec.
     * 
     * @return unitNumber
     */
    public int getUnitNumber() {
        return unitNumber;
    }


    /**
     * Sets the unitNumber value for this HostVMotionManagerReparentSpec.
     * 
     * @param unitNumber
     */
    public void setUnitNumber(int unitNumber) {
        this.unitNumber = unitNumber;
    }


    /**
     * Gets the filename value for this HostVMotionManagerReparentSpec.
     * 
     * @return filename
     */
    public java.lang.String getFilename() {
        return filename;
    }


    /**
     * Sets the filename value for this HostVMotionManagerReparentSpec.
     * 
     * @param filename
     */
    public void setFilename(java.lang.String filename) {
        this.filename = filename;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostVMotionManagerReparentSpec)) return false;
        HostVMotionManagerReparentSpec other = (HostVMotionManagerReparentSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.busNumber == other.getBusNumber() &&
            this.unitNumber == other.getUnitNumber() &&
            ((this.filename==null && other.getFilename()==null) || 
             (this.filename!=null &&
              this.filename.equals(other.getFilename())));
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
        _hashCode += getBusNumber();
        _hashCode += getUnitNumber();
        if (getFilename() != null) {
            _hashCode += getFilename().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostVMotionManagerReparentSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostVMotionManagerReparentSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("busNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "busNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "unitNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filename");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "filename"));
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
