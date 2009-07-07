/**
 * HostLicenseSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostLicenseSpec  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private com.vmware.vim25.LicenseSource source;

    private java.lang.String editionKey;

    private java.lang.String[] disabledFeatureKey;

    private java.lang.String[] enabledFeatureKey;

    public HostLicenseSpec() {
    }

    public HostLicenseSpec(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.LicenseSource source,
           java.lang.String editionKey,
           java.lang.String[] disabledFeatureKey,
           java.lang.String[] enabledFeatureKey) {
        super(
            dynamicType,
            dynamicProperty);
        this.source = source;
        this.editionKey = editionKey;
        this.disabledFeatureKey = disabledFeatureKey;
        this.enabledFeatureKey = enabledFeatureKey;
    }


    /**
     * Gets the source value for this HostLicenseSpec.
     * 
     * @return source
     */
    public com.vmware.vim25.LicenseSource getSource() {
        return source;
    }


    /**
     * Sets the source value for this HostLicenseSpec.
     * 
     * @param source
     */
    public void setSource(com.vmware.vim25.LicenseSource source) {
        this.source = source;
    }


    /**
     * Gets the editionKey value for this HostLicenseSpec.
     * 
     * @return editionKey
     */
    public java.lang.String getEditionKey() {
        return editionKey;
    }


    /**
     * Sets the editionKey value for this HostLicenseSpec.
     * 
     * @param editionKey
     */
    public void setEditionKey(java.lang.String editionKey) {
        this.editionKey = editionKey;
    }


    /**
     * Gets the disabledFeatureKey value for this HostLicenseSpec.
     * 
     * @return disabledFeatureKey
     */
    public java.lang.String[] getDisabledFeatureKey() {
        return disabledFeatureKey;
    }


    /**
     * Sets the disabledFeatureKey value for this HostLicenseSpec.
     * 
     * @param disabledFeatureKey
     */
    public void setDisabledFeatureKey(java.lang.String[] disabledFeatureKey) {
        this.disabledFeatureKey = disabledFeatureKey;
    }

    public java.lang.String getDisabledFeatureKey(int i) {
        return this.disabledFeatureKey[i];
    }

    public void setDisabledFeatureKey(int i, java.lang.String _value) {
        this.disabledFeatureKey[i] = _value;
    }


    /**
     * Gets the enabledFeatureKey value for this HostLicenseSpec.
     * 
     * @return enabledFeatureKey
     */
    public java.lang.String[] getEnabledFeatureKey() {
        return enabledFeatureKey;
    }


    /**
     * Sets the enabledFeatureKey value for this HostLicenseSpec.
     * 
     * @param enabledFeatureKey
     */
    public void setEnabledFeatureKey(java.lang.String[] enabledFeatureKey) {
        this.enabledFeatureKey = enabledFeatureKey;
    }

    public java.lang.String getEnabledFeatureKey(int i) {
        return this.enabledFeatureKey[i];
    }

    public void setEnabledFeatureKey(int i, java.lang.String _value) {
        this.enabledFeatureKey[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostLicenseSpec)) return false;
        HostLicenseSpec other = (HostLicenseSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.editionKey==null && other.getEditionKey()==null) || 
             (this.editionKey!=null &&
              this.editionKey.equals(other.getEditionKey()))) &&
            ((this.disabledFeatureKey==null && other.getDisabledFeatureKey()==null) || 
             (this.disabledFeatureKey!=null &&
              java.util.Arrays.equals(this.disabledFeatureKey, other.getDisabledFeatureKey()))) &&
            ((this.enabledFeatureKey==null && other.getEnabledFeatureKey()==null) || 
             (this.enabledFeatureKey!=null &&
              java.util.Arrays.equals(this.enabledFeatureKey, other.getEnabledFeatureKey())));
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
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getEditionKey() != null) {
            _hashCode += getEditionKey().hashCode();
        }
        if (getDisabledFeatureKey() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDisabledFeatureKey());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDisabledFeatureKey(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEnabledFeatureKey() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEnabledFeatureKey());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEnabledFeatureKey(), i);
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
        new org.apache.axis.description.TypeDesc(HostLicenseSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostLicenseSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LicenseSource"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editionKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "editionKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disabledFeatureKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "disabledFeatureKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabledFeatureKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "enabledFeatureKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
