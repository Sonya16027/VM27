/**
 * DVSSecurityPolicy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class DVSSecurityPolicy  extends com.vmware.vim25.InheritablePolicy  implements java.io.Serializable {
    private com.vmware.vim25.BoolPolicy allowPromiscuous;

    private com.vmware.vim25.BoolPolicy macChanges;

    private com.vmware.vim25.BoolPolicy forgedTransmits;

    public DVSSecurityPolicy() {
    }

    public DVSSecurityPolicy(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           boolean inherited,
           com.vmware.vim25.BoolPolicy allowPromiscuous,
           com.vmware.vim25.BoolPolicy macChanges,
           com.vmware.vim25.BoolPolicy forgedTransmits) {
        super(
            dynamicType,
            dynamicProperty,
            inherited);
        this.allowPromiscuous = allowPromiscuous;
        this.macChanges = macChanges;
        this.forgedTransmits = forgedTransmits;
    }


    /**
     * Gets the allowPromiscuous value for this DVSSecurityPolicy.
     * 
     * @return allowPromiscuous
     */
    public com.vmware.vim25.BoolPolicy getAllowPromiscuous() {
        return allowPromiscuous;
    }


    /**
     * Sets the allowPromiscuous value for this DVSSecurityPolicy.
     * 
     * @param allowPromiscuous
     */
    public void setAllowPromiscuous(com.vmware.vim25.BoolPolicy allowPromiscuous) {
        this.allowPromiscuous = allowPromiscuous;
    }


    /**
     * Gets the macChanges value for this DVSSecurityPolicy.
     * 
     * @return macChanges
     */
    public com.vmware.vim25.BoolPolicy getMacChanges() {
        return macChanges;
    }


    /**
     * Sets the macChanges value for this DVSSecurityPolicy.
     * 
     * @param macChanges
     */
    public void setMacChanges(com.vmware.vim25.BoolPolicy macChanges) {
        this.macChanges = macChanges;
    }


    /**
     * Gets the forgedTransmits value for this DVSSecurityPolicy.
     * 
     * @return forgedTransmits
     */
    public com.vmware.vim25.BoolPolicy getForgedTransmits() {
        return forgedTransmits;
    }


    /**
     * Sets the forgedTransmits value for this DVSSecurityPolicy.
     * 
     * @param forgedTransmits
     */
    public void setForgedTransmits(com.vmware.vim25.BoolPolicy forgedTransmits) {
        this.forgedTransmits = forgedTransmits;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DVSSecurityPolicy)) return false;
        DVSSecurityPolicy other = (DVSSecurityPolicy) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.allowPromiscuous==null && other.getAllowPromiscuous()==null) || 
             (this.allowPromiscuous!=null &&
              this.allowPromiscuous.equals(other.getAllowPromiscuous()))) &&
            ((this.macChanges==null && other.getMacChanges()==null) || 
             (this.macChanges!=null &&
              this.macChanges.equals(other.getMacChanges()))) &&
            ((this.forgedTransmits==null && other.getForgedTransmits()==null) || 
             (this.forgedTransmits!=null &&
              this.forgedTransmits.equals(other.getForgedTransmits())));
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
        if (getAllowPromiscuous() != null) {
            _hashCode += getAllowPromiscuous().hashCode();
        }
        if (getMacChanges() != null) {
            _hashCode += getMacChanges().hashCode();
        }
        if (getForgedTransmits() != null) {
            _hashCode += getForgedTransmits().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DVSSecurityPolicy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVSSecurityPolicy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowPromiscuous");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "allowPromiscuous"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "BoolPolicy"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("macChanges");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "macChanges"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "BoolPolicy"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forgedTransmits");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "forgedTransmits"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "BoolPolicy"));
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
