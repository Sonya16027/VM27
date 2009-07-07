/**
 * NoPermission.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class NoPermission  extends com.vmware.vim25.SecurityError  implements java.io.Serializable {
    private com.vmware.vim25.ManagedObjectReference object;

    private java.lang.String privilegeId;

    public NoPermission() {
    }

    public NoPermission(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.LocalizedMethodFault faultCause,
           com.vmware.vim25.LocalizableMessage[] faultMessage,
           com.vmware.vim25.ManagedObjectReference object,
           java.lang.String privilegeId) {
        super(
            dynamicType,
            dynamicProperty,
            faultCause,
            faultMessage);
        this.object = object;
        this.privilegeId = privilegeId;
    }


    /**
     * Gets the object value for this NoPermission.
     * 
     * @return object
     */
    public com.vmware.vim25.ManagedObjectReference getObject() {
        return object;
    }


    /**
     * Sets the object value for this NoPermission.
     * 
     * @param object
     */
    public void setObject(com.vmware.vim25.ManagedObjectReference object) {
        this.object = object;
    }


    /**
     * Gets the privilegeId value for this NoPermission.
     * 
     * @return privilegeId
     */
    public java.lang.String getPrivilegeId() {
        return privilegeId;
    }


    /**
     * Sets the privilegeId value for this NoPermission.
     * 
     * @param privilegeId
     */
    public void setPrivilegeId(java.lang.String privilegeId) {
        this.privilegeId = privilegeId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NoPermission)) return false;
        NoPermission other = (NoPermission) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.object==null && other.getObject()==null) || 
             (this.object!=null &&
              this.object.equals(other.getObject()))) &&
            ((this.privilegeId==null && other.getPrivilegeId()==null) || 
             (this.privilegeId!=null &&
              this.privilegeId.equals(other.getPrivilegeId())));
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
        if (getObject() != null) {
            _hashCode += getObject().hashCode();
        }
        if (getPrivilegeId() != null) {
            _hashCode += getPrivilegeId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NoPermission.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "NoPermission"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("object");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "object"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privilegeId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "privilegeId"));
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
