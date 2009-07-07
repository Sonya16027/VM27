/**
 * LicenseAssignmentManagerLicenseAssignment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class LicenseAssignmentManagerLicenseAssignment  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.String entityId;

    private java.lang.String scope;

    private java.lang.String entityDisplayName;

    private com.vmware.vim25.LicenseManagerLicenseInfo assignedLicense;

    private com.vmware.vim25.KeyAnyValue[] properties;

    public LicenseAssignmentManagerLicenseAssignment() {
    }

    public LicenseAssignmentManagerLicenseAssignment(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String entityId,
           java.lang.String scope,
           java.lang.String entityDisplayName,
           com.vmware.vim25.LicenseManagerLicenseInfo assignedLicense,
           com.vmware.vim25.KeyAnyValue[] properties) {
        super(
            dynamicType,
            dynamicProperty);
        this.entityId = entityId;
        this.scope = scope;
        this.entityDisplayName = entityDisplayName;
        this.assignedLicense = assignedLicense;
        this.properties = properties;
    }


    /**
     * Gets the entityId value for this LicenseAssignmentManagerLicenseAssignment.
     * 
     * @return entityId
     */
    public java.lang.String getEntityId() {
        return entityId;
    }


    /**
     * Sets the entityId value for this LicenseAssignmentManagerLicenseAssignment.
     * 
     * @param entityId
     */
    public void setEntityId(java.lang.String entityId) {
        this.entityId = entityId;
    }


    /**
     * Gets the scope value for this LicenseAssignmentManagerLicenseAssignment.
     * 
     * @return scope
     */
    public java.lang.String getScope() {
        return scope;
    }


    /**
     * Sets the scope value for this LicenseAssignmentManagerLicenseAssignment.
     * 
     * @param scope
     */
    public void setScope(java.lang.String scope) {
        this.scope = scope;
    }


    /**
     * Gets the entityDisplayName value for this LicenseAssignmentManagerLicenseAssignment.
     * 
     * @return entityDisplayName
     */
    public java.lang.String getEntityDisplayName() {
        return entityDisplayName;
    }


    /**
     * Sets the entityDisplayName value for this LicenseAssignmentManagerLicenseAssignment.
     * 
     * @param entityDisplayName
     */
    public void setEntityDisplayName(java.lang.String entityDisplayName) {
        this.entityDisplayName = entityDisplayName;
    }


    /**
     * Gets the assignedLicense value for this LicenseAssignmentManagerLicenseAssignment.
     * 
     * @return assignedLicense
     */
    public com.vmware.vim25.LicenseManagerLicenseInfo getAssignedLicense() {
        return assignedLicense;
    }


    /**
     * Sets the assignedLicense value for this LicenseAssignmentManagerLicenseAssignment.
     * 
     * @param assignedLicense
     */
    public void setAssignedLicense(com.vmware.vim25.LicenseManagerLicenseInfo assignedLicense) {
        this.assignedLicense = assignedLicense;
    }


    /**
     * Gets the properties value for this LicenseAssignmentManagerLicenseAssignment.
     * 
     * @return properties
     */
    public com.vmware.vim25.KeyAnyValue[] getProperties() {
        return properties;
    }


    /**
     * Sets the properties value for this LicenseAssignmentManagerLicenseAssignment.
     * 
     * @param properties
     */
    public void setProperties(com.vmware.vim25.KeyAnyValue[] properties) {
        this.properties = properties;
    }

    public com.vmware.vim25.KeyAnyValue getProperties(int i) {
        return this.properties[i];
    }

    public void setProperties(int i, com.vmware.vim25.KeyAnyValue _value) {
        this.properties[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LicenseAssignmentManagerLicenseAssignment)) return false;
        LicenseAssignmentManagerLicenseAssignment other = (LicenseAssignmentManagerLicenseAssignment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.entityId==null && other.getEntityId()==null) || 
             (this.entityId!=null &&
              this.entityId.equals(other.getEntityId()))) &&
            ((this.scope==null && other.getScope()==null) || 
             (this.scope!=null &&
              this.scope.equals(other.getScope()))) &&
            ((this.entityDisplayName==null && other.getEntityDisplayName()==null) || 
             (this.entityDisplayName!=null &&
              this.entityDisplayName.equals(other.getEntityDisplayName()))) &&
            ((this.assignedLicense==null && other.getAssignedLicense()==null) || 
             (this.assignedLicense!=null &&
              this.assignedLicense.equals(other.getAssignedLicense()))) &&
            ((this.properties==null && other.getProperties()==null) || 
             (this.properties!=null &&
              java.util.Arrays.equals(this.properties, other.getProperties())));
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
        if (getEntityId() != null) {
            _hashCode += getEntityId().hashCode();
        }
        if (getScope() != null) {
            _hashCode += getScope().hashCode();
        }
        if (getEntityDisplayName() != null) {
            _hashCode += getEntityDisplayName().hashCode();
        }
        if (getAssignedLicense() != null) {
            _hashCode += getAssignedLicense().hashCode();
        }
        if (getProperties() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProperties());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProperties(), i);
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
        new org.apache.axis.description.TypeDesc(LicenseAssignmentManagerLicenseAssignment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LicenseAssignmentManagerLicenseAssignment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "entityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scope");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "scope"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityDisplayName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "entityDisplayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignedLicense");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "assignedLicense"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LicenseManagerLicenseInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("properties");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "properties"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "KeyAnyValue"));
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
