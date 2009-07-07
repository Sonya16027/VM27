/**
 * HostVMotionNetConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostVMotionNetConfig  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private com.vmware.vim25.HostVirtualNic[] candidateVnic;

    private java.lang.String selectedVnic;

    public HostVMotionNetConfig() {
    }

    public HostVMotionNetConfig(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.HostVirtualNic[] candidateVnic,
           java.lang.String selectedVnic) {
        super(
            dynamicType,
            dynamicProperty);
        this.candidateVnic = candidateVnic;
        this.selectedVnic = selectedVnic;
    }


    /**
     * Gets the candidateVnic value for this HostVMotionNetConfig.
     * 
     * @return candidateVnic
     */
    public com.vmware.vim25.HostVirtualNic[] getCandidateVnic() {
        return candidateVnic;
    }


    /**
     * Sets the candidateVnic value for this HostVMotionNetConfig.
     * 
     * @param candidateVnic
     */
    public void setCandidateVnic(com.vmware.vim25.HostVirtualNic[] candidateVnic) {
        this.candidateVnic = candidateVnic;
    }

    public com.vmware.vim25.HostVirtualNic getCandidateVnic(int i) {
        return this.candidateVnic[i];
    }

    public void setCandidateVnic(int i, com.vmware.vim25.HostVirtualNic _value) {
        this.candidateVnic[i] = _value;
    }


    /**
     * Gets the selectedVnic value for this HostVMotionNetConfig.
     * 
     * @return selectedVnic
     */
    public java.lang.String getSelectedVnic() {
        return selectedVnic;
    }


    /**
     * Sets the selectedVnic value for this HostVMotionNetConfig.
     * 
     * @param selectedVnic
     */
    public void setSelectedVnic(java.lang.String selectedVnic) {
        this.selectedVnic = selectedVnic;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostVMotionNetConfig)) return false;
        HostVMotionNetConfig other = (HostVMotionNetConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.candidateVnic==null && other.getCandidateVnic()==null) || 
             (this.candidateVnic!=null &&
              java.util.Arrays.equals(this.candidateVnic, other.getCandidateVnic()))) &&
            ((this.selectedVnic==null && other.getSelectedVnic()==null) || 
             (this.selectedVnic!=null &&
              this.selectedVnic.equals(other.getSelectedVnic())));
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
        if (getCandidateVnic() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCandidateVnic());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCandidateVnic(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSelectedVnic() != null) {
            _hashCode += getSelectedVnic().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostVMotionNetConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVMotionNetConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("candidateVnic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "candidateVnic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVirtualNic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectedVnic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "selectedVnic"));
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
