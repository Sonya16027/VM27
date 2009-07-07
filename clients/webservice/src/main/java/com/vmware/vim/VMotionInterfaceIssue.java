/**
 * VMotionInterfaceIssue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class VMotionInterfaceIssue  extends com.vmware.vim.MigrationFault  implements java.io.Serializable {
    private boolean atSourceHost;

    private java.lang.String failedHost;

    public VMotionInterfaceIssue() {
    }

    public VMotionInterfaceIssue(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           boolean atSourceHost,
           java.lang.String failedHost) {
        super(
            dynamicType,
            dynamicProperty);
        this.atSourceHost = atSourceHost;
        this.failedHost = failedHost;
    }


    /**
     * Gets the atSourceHost value for this VMotionInterfaceIssue.
     * 
     * @return atSourceHost
     */
    public boolean isAtSourceHost() {
        return atSourceHost;
    }


    /**
     * Sets the atSourceHost value for this VMotionInterfaceIssue.
     * 
     * @param atSourceHost
     */
    public void setAtSourceHost(boolean atSourceHost) {
        this.atSourceHost = atSourceHost;
    }


    /**
     * Gets the failedHost value for this VMotionInterfaceIssue.
     * 
     * @return failedHost
     */
    public java.lang.String getFailedHost() {
        return failedHost;
    }


    /**
     * Sets the failedHost value for this VMotionInterfaceIssue.
     * 
     * @param failedHost
     */
    public void setFailedHost(java.lang.String failedHost) {
        this.failedHost = failedHost;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VMotionInterfaceIssue)) return false;
        VMotionInterfaceIssue other = (VMotionInterfaceIssue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.atSourceHost == other.isAtSourceHost() &&
            ((this.failedHost==null && other.getFailedHost()==null) || 
             (this.failedHost!=null &&
              this.failedHost.equals(other.getFailedHost())));
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
        _hashCode += (isAtSourceHost() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getFailedHost() != null) {
            _hashCode += getFailedHost().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VMotionInterfaceIssue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "VMotionInterfaceIssue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atSourceHost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "atSourceHost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedHost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "failedHost"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
