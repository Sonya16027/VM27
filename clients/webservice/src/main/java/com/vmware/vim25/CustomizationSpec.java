/**
 * CustomizationSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class CustomizationSpec  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private com.vmware.vim25.CustomizationOptions options;

    private com.vmware.vim25.CustomizationIdentitySettings identity;

    private com.vmware.vim25.CustomizationGlobalIPSettings globalIPSettings;

    private com.vmware.vim25.CustomizationAdapterMapping[] nicSettingMap;

    private byte[] encryptionKey;

    public CustomizationSpec() {
    }

    public CustomizationSpec(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.CustomizationOptions options,
           com.vmware.vim25.CustomizationIdentitySettings identity,
           com.vmware.vim25.CustomizationGlobalIPSettings globalIPSettings,
           com.vmware.vim25.CustomizationAdapterMapping[] nicSettingMap,
           byte[] encryptionKey) {
        super(
            dynamicType,
            dynamicProperty);
        this.options = options;
        this.identity = identity;
        this.globalIPSettings = globalIPSettings;
        this.nicSettingMap = nicSettingMap;
        this.encryptionKey = encryptionKey;
    }


    /**
     * Gets the options value for this CustomizationSpec.
     * 
     * @return options
     */
    public com.vmware.vim25.CustomizationOptions getOptions() {
        return options;
    }


    /**
     * Sets the options value for this CustomizationSpec.
     * 
     * @param options
     */
    public void setOptions(com.vmware.vim25.CustomizationOptions options) {
        this.options = options;
    }


    /**
     * Gets the identity value for this CustomizationSpec.
     * 
     * @return identity
     */
    public com.vmware.vim25.CustomizationIdentitySettings getIdentity() {
        return identity;
    }


    /**
     * Sets the identity value for this CustomizationSpec.
     * 
     * @param identity
     */
    public void setIdentity(com.vmware.vim25.CustomizationIdentitySettings identity) {
        this.identity = identity;
    }


    /**
     * Gets the globalIPSettings value for this CustomizationSpec.
     * 
     * @return globalIPSettings
     */
    public com.vmware.vim25.CustomizationGlobalIPSettings getGlobalIPSettings() {
        return globalIPSettings;
    }


    /**
     * Sets the globalIPSettings value for this CustomizationSpec.
     * 
     * @param globalIPSettings
     */
    public void setGlobalIPSettings(com.vmware.vim25.CustomizationGlobalIPSettings globalIPSettings) {
        this.globalIPSettings = globalIPSettings;
    }


    /**
     * Gets the nicSettingMap value for this CustomizationSpec.
     * 
     * @return nicSettingMap
     */
    public com.vmware.vim25.CustomizationAdapterMapping[] getNicSettingMap() {
        return nicSettingMap;
    }


    /**
     * Sets the nicSettingMap value for this CustomizationSpec.
     * 
     * @param nicSettingMap
     */
    public void setNicSettingMap(com.vmware.vim25.CustomizationAdapterMapping[] nicSettingMap) {
        this.nicSettingMap = nicSettingMap;
    }

    public com.vmware.vim25.CustomizationAdapterMapping getNicSettingMap(int i) {
        return this.nicSettingMap[i];
    }

    public void setNicSettingMap(int i, com.vmware.vim25.CustomizationAdapterMapping _value) {
        this.nicSettingMap[i] = _value;
    }


    /**
     * Gets the encryptionKey value for this CustomizationSpec.
     * 
     * @return encryptionKey
     */
    public byte[] getEncryptionKey() {
        return encryptionKey;
    }


    /**
     * Sets the encryptionKey value for this CustomizationSpec.
     * 
     * @param encryptionKey
     */
    public void setEncryptionKey(byte[] encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    public byte getEncryptionKey(int i) {
        return this.encryptionKey[i];
    }

    public void setEncryptionKey(int i, byte _value) {
        this.encryptionKey[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomizationSpec)) return false;
        CustomizationSpec other = (CustomizationSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.options==null && other.getOptions()==null) || 
             (this.options!=null &&
              this.options.equals(other.getOptions()))) &&
            ((this.identity==null && other.getIdentity()==null) || 
             (this.identity!=null &&
              this.identity.equals(other.getIdentity()))) &&
            ((this.globalIPSettings==null && other.getGlobalIPSettings()==null) || 
             (this.globalIPSettings!=null &&
              this.globalIPSettings.equals(other.getGlobalIPSettings()))) &&
            ((this.nicSettingMap==null && other.getNicSettingMap()==null) || 
             (this.nicSettingMap!=null &&
              java.util.Arrays.equals(this.nicSettingMap, other.getNicSettingMap()))) &&
            ((this.encryptionKey==null && other.getEncryptionKey()==null) || 
             (this.encryptionKey!=null &&
              java.util.Arrays.equals(this.encryptionKey, other.getEncryptionKey())));
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
        if (getOptions() != null) {
            _hashCode += getOptions().hashCode();
        }
        if (getIdentity() != null) {
            _hashCode += getIdentity().hashCode();
        }
        if (getGlobalIPSettings() != null) {
            _hashCode += getGlobalIPSettings().hashCode();
        }
        if (getNicSettingMap() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNicSettingMap());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNicSettingMap(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEncryptionKey() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEncryptionKey());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEncryptionKey(), i);
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
        new org.apache.axis.description.TypeDesc(CustomizationSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "CustomizationSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "options"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "CustomizationOptions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "identity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "CustomizationIdentitySettings"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalIPSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "globalIPSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "CustomizationGlobalIPSettings"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nicSettingMap");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "nicSettingMap"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "CustomizationAdapterMapping"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encryptionKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "encryptionKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "byte"));
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
