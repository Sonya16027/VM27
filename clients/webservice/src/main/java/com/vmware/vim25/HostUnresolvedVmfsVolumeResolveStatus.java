/**
 * HostUnresolvedVmfsVolumeResolveStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostUnresolvedVmfsVolumeResolveStatus  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private boolean resolvable;

    private java.lang.Boolean incompleteExtents;

    private java.lang.Boolean multipleCopies;

    public HostUnresolvedVmfsVolumeResolveStatus() {
    }

    public HostUnresolvedVmfsVolumeResolveStatus(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           boolean resolvable,
           java.lang.Boolean incompleteExtents,
           java.lang.Boolean multipleCopies) {
        super(
            dynamicType,
            dynamicProperty);
        this.resolvable = resolvable;
        this.incompleteExtents = incompleteExtents;
        this.multipleCopies = multipleCopies;
    }


    /**
     * Gets the resolvable value for this HostUnresolvedVmfsVolumeResolveStatus.
     * 
     * @return resolvable
     */
    public boolean isResolvable() {
        return resolvable;
    }


    /**
     * Sets the resolvable value for this HostUnresolvedVmfsVolumeResolveStatus.
     * 
     * @param resolvable
     */
    public void setResolvable(boolean resolvable) {
        this.resolvable = resolvable;
    }


    /**
     * Gets the incompleteExtents value for this HostUnresolvedVmfsVolumeResolveStatus.
     * 
     * @return incompleteExtents
     */
    public java.lang.Boolean getIncompleteExtents() {
        return incompleteExtents;
    }


    /**
     * Sets the incompleteExtents value for this HostUnresolvedVmfsVolumeResolveStatus.
     * 
     * @param incompleteExtents
     */
    public void setIncompleteExtents(java.lang.Boolean incompleteExtents) {
        this.incompleteExtents = incompleteExtents;
    }


    /**
     * Gets the multipleCopies value for this HostUnresolvedVmfsVolumeResolveStatus.
     * 
     * @return multipleCopies
     */
    public java.lang.Boolean getMultipleCopies() {
        return multipleCopies;
    }


    /**
     * Sets the multipleCopies value for this HostUnresolvedVmfsVolumeResolveStatus.
     * 
     * @param multipleCopies
     */
    public void setMultipleCopies(java.lang.Boolean multipleCopies) {
        this.multipleCopies = multipleCopies;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostUnresolvedVmfsVolumeResolveStatus)) return false;
        HostUnresolvedVmfsVolumeResolveStatus other = (HostUnresolvedVmfsVolumeResolveStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.resolvable == other.isResolvable() &&
            ((this.incompleteExtents==null && other.getIncompleteExtents()==null) || 
             (this.incompleteExtents!=null &&
              this.incompleteExtents.equals(other.getIncompleteExtents()))) &&
            ((this.multipleCopies==null && other.getMultipleCopies()==null) || 
             (this.multipleCopies!=null &&
              this.multipleCopies.equals(other.getMultipleCopies())));
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
        _hashCode += (isResolvable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getIncompleteExtents() != null) {
            _hashCode += getIncompleteExtents().hashCode();
        }
        if (getMultipleCopies() != null) {
            _hashCode += getMultipleCopies().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostUnresolvedVmfsVolumeResolveStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostUnresolvedVmfsVolumeResolveStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resolvable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "resolvable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incompleteExtents");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "incompleteExtents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multipleCopies");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "multipleCopies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
