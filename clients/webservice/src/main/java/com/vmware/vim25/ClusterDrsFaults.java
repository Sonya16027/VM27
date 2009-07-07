/**
 * ClusterDrsFaults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ClusterDrsFaults  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.String reason;

    private com.vmware.vim25.ClusterDrsFaultsFaultsByVm[] faultsByVm;

    public ClusterDrsFaults() {
    }

    public ClusterDrsFaults(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String reason,
           com.vmware.vim25.ClusterDrsFaultsFaultsByVm[] faultsByVm) {
        super(
            dynamicType,
            dynamicProperty);
        this.reason = reason;
        this.faultsByVm = faultsByVm;
    }


    /**
     * Gets the reason value for this ClusterDrsFaults.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this ClusterDrsFaults.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }


    /**
     * Gets the faultsByVm value for this ClusterDrsFaults.
     * 
     * @return faultsByVm
     */
    public com.vmware.vim25.ClusterDrsFaultsFaultsByVm[] getFaultsByVm() {
        return faultsByVm;
    }


    /**
     * Sets the faultsByVm value for this ClusterDrsFaults.
     * 
     * @param faultsByVm
     */
    public void setFaultsByVm(com.vmware.vim25.ClusterDrsFaultsFaultsByVm[] faultsByVm) {
        this.faultsByVm = faultsByVm;
    }

    public com.vmware.vim25.ClusterDrsFaultsFaultsByVm getFaultsByVm(int i) {
        return this.faultsByVm[i];
    }

    public void setFaultsByVm(int i, com.vmware.vim25.ClusterDrsFaultsFaultsByVm _value) {
        this.faultsByVm[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClusterDrsFaults)) return false;
        ClusterDrsFaults other = (ClusterDrsFaults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.faultsByVm==null && other.getFaultsByVm()==null) || 
             (this.faultsByVm!=null &&
              java.util.Arrays.equals(this.faultsByVm, other.getFaultsByVm())));
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
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        if (getFaultsByVm() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFaultsByVm());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFaultsByVm(), i);
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
        new org.apache.axis.description.TypeDesc(ClusterDrsFaults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDrsFaults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faultsByVm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "faultsByVm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDrsFaultsFaultsByVm"));
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
