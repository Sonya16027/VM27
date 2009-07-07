/**
 * LicenseFeatureInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class LicenseFeatureInfo  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.String key;

    private java.lang.String featureName;

    private java.lang.String featureDescription;

    private com.vmware.vim25.LicenseFeatureInfoState state;

    private java.lang.String costUnit;

    private java.lang.String sourceRestriction;

    private java.lang.String[] dependentKey;

    private java.lang.Boolean edition;

    private java.util.Calendar expiresOn;

    public LicenseFeatureInfo() {
    }

    public LicenseFeatureInfo(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String key,
           java.lang.String featureName,
           java.lang.String featureDescription,
           com.vmware.vim25.LicenseFeatureInfoState state,
           java.lang.String costUnit,
           java.lang.String sourceRestriction,
           java.lang.String[] dependentKey,
           java.lang.Boolean edition,
           java.util.Calendar expiresOn) {
        super(
            dynamicType,
            dynamicProperty);
        this.key = key;
        this.featureName = featureName;
        this.featureDescription = featureDescription;
        this.state = state;
        this.costUnit = costUnit;
        this.sourceRestriction = sourceRestriction;
        this.dependentKey = dependentKey;
        this.edition = edition;
        this.expiresOn = expiresOn;
    }


    /**
     * Gets the key value for this LicenseFeatureInfo.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this LicenseFeatureInfo.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the featureName value for this LicenseFeatureInfo.
     * 
     * @return featureName
     */
    public java.lang.String getFeatureName() {
        return featureName;
    }


    /**
     * Sets the featureName value for this LicenseFeatureInfo.
     * 
     * @param featureName
     */
    public void setFeatureName(java.lang.String featureName) {
        this.featureName = featureName;
    }


    /**
     * Gets the featureDescription value for this LicenseFeatureInfo.
     * 
     * @return featureDescription
     */
    public java.lang.String getFeatureDescription() {
        return featureDescription;
    }


    /**
     * Sets the featureDescription value for this LicenseFeatureInfo.
     * 
     * @param featureDescription
     */
    public void setFeatureDescription(java.lang.String featureDescription) {
        this.featureDescription = featureDescription;
    }


    /**
     * Gets the state value for this LicenseFeatureInfo.
     * 
     * @return state
     */
    public com.vmware.vim25.LicenseFeatureInfoState getState() {
        return state;
    }


    /**
     * Sets the state value for this LicenseFeatureInfo.
     * 
     * @param state
     */
    public void setState(com.vmware.vim25.LicenseFeatureInfoState state) {
        this.state = state;
    }


    /**
     * Gets the costUnit value for this LicenseFeatureInfo.
     * 
     * @return costUnit
     */
    public java.lang.String getCostUnit() {
        return costUnit;
    }


    /**
     * Sets the costUnit value for this LicenseFeatureInfo.
     * 
     * @param costUnit
     */
    public void setCostUnit(java.lang.String costUnit) {
        this.costUnit = costUnit;
    }


    /**
     * Gets the sourceRestriction value for this LicenseFeatureInfo.
     * 
     * @return sourceRestriction
     */
    public java.lang.String getSourceRestriction() {
        return sourceRestriction;
    }


    /**
     * Sets the sourceRestriction value for this LicenseFeatureInfo.
     * 
     * @param sourceRestriction
     */
    public void setSourceRestriction(java.lang.String sourceRestriction) {
        this.sourceRestriction = sourceRestriction;
    }


    /**
     * Gets the dependentKey value for this LicenseFeatureInfo.
     * 
     * @return dependentKey
     */
    public java.lang.String[] getDependentKey() {
        return dependentKey;
    }


    /**
     * Sets the dependentKey value for this LicenseFeatureInfo.
     * 
     * @param dependentKey
     */
    public void setDependentKey(java.lang.String[] dependentKey) {
        this.dependentKey = dependentKey;
    }

    public java.lang.String getDependentKey(int i) {
        return this.dependentKey[i];
    }

    public void setDependentKey(int i, java.lang.String _value) {
        this.dependentKey[i] = _value;
    }


    /**
     * Gets the edition value for this LicenseFeatureInfo.
     * 
     * @return edition
     */
    public java.lang.Boolean getEdition() {
        return edition;
    }


    /**
     * Sets the edition value for this LicenseFeatureInfo.
     * 
     * @param edition
     */
    public void setEdition(java.lang.Boolean edition) {
        this.edition = edition;
    }


    /**
     * Gets the expiresOn value for this LicenseFeatureInfo.
     * 
     * @return expiresOn
     */
    public java.util.Calendar getExpiresOn() {
        return expiresOn;
    }


    /**
     * Sets the expiresOn value for this LicenseFeatureInfo.
     * 
     * @param expiresOn
     */
    public void setExpiresOn(java.util.Calendar expiresOn) {
        this.expiresOn = expiresOn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LicenseFeatureInfo)) return false;
        LicenseFeatureInfo other = (LicenseFeatureInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.featureName==null && other.getFeatureName()==null) || 
             (this.featureName!=null &&
              this.featureName.equals(other.getFeatureName()))) &&
            ((this.featureDescription==null && other.getFeatureDescription()==null) || 
             (this.featureDescription!=null &&
              this.featureDescription.equals(other.getFeatureDescription()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.costUnit==null && other.getCostUnit()==null) || 
             (this.costUnit!=null &&
              this.costUnit.equals(other.getCostUnit()))) &&
            ((this.sourceRestriction==null && other.getSourceRestriction()==null) || 
             (this.sourceRestriction!=null &&
              this.sourceRestriction.equals(other.getSourceRestriction()))) &&
            ((this.dependentKey==null && other.getDependentKey()==null) || 
             (this.dependentKey!=null &&
              java.util.Arrays.equals(this.dependentKey, other.getDependentKey()))) &&
            ((this.edition==null && other.getEdition()==null) || 
             (this.edition!=null &&
              this.edition.equals(other.getEdition()))) &&
            ((this.expiresOn==null && other.getExpiresOn()==null) || 
             (this.expiresOn!=null &&
              this.expiresOn.equals(other.getExpiresOn())));
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
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getFeatureName() != null) {
            _hashCode += getFeatureName().hashCode();
        }
        if (getFeatureDescription() != null) {
            _hashCode += getFeatureDescription().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getCostUnit() != null) {
            _hashCode += getCostUnit().hashCode();
        }
        if (getSourceRestriction() != null) {
            _hashCode += getSourceRestriction().hashCode();
        }
        if (getDependentKey() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDependentKey());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDependentKey(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEdition() != null) {
            _hashCode += getEdition().hashCode();
        }
        if (getExpiresOn() != null) {
            _hashCode += getExpiresOn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LicenseFeatureInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LicenseFeatureInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "featureName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "featureDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LicenseFeatureInfoState"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "costUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceRestriction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sourceRestriction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dependentKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dependentKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("edition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "edition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiresOn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "expiresOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
