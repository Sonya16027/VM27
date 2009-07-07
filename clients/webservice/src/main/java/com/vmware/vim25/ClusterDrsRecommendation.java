/**
 * ClusterDrsRecommendation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ClusterDrsRecommendation  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.String key;

    private int rating;

    private java.lang.String reason;

    private java.lang.String reasonText;

    private com.vmware.vim25.ClusterDrsMigration[] migrationList;

    public ClusterDrsRecommendation() {
    }

    public ClusterDrsRecommendation(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String key,
           int rating,
           java.lang.String reason,
           java.lang.String reasonText,
           com.vmware.vim25.ClusterDrsMigration[] migrationList) {
        super(
            dynamicType,
            dynamicProperty);
        this.key = key;
        this.rating = rating;
        this.reason = reason;
        this.reasonText = reasonText;
        this.migrationList = migrationList;
    }


    /**
     * Gets the key value for this ClusterDrsRecommendation.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this ClusterDrsRecommendation.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the rating value for this ClusterDrsRecommendation.
     * 
     * @return rating
     */
    public int getRating() {
        return rating;
    }


    /**
     * Sets the rating value for this ClusterDrsRecommendation.
     * 
     * @param rating
     */
    public void setRating(int rating) {
        this.rating = rating;
    }


    /**
     * Gets the reason value for this ClusterDrsRecommendation.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this ClusterDrsRecommendation.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }


    /**
     * Gets the reasonText value for this ClusterDrsRecommendation.
     * 
     * @return reasonText
     */
    public java.lang.String getReasonText() {
        return reasonText;
    }


    /**
     * Sets the reasonText value for this ClusterDrsRecommendation.
     * 
     * @param reasonText
     */
    public void setReasonText(java.lang.String reasonText) {
        this.reasonText = reasonText;
    }


    /**
     * Gets the migrationList value for this ClusterDrsRecommendation.
     * 
     * @return migrationList
     */
    public com.vmware.vim25.ClusterDrsMigration[] getMigrationList() {
        return migrationList;
    }


    /**
     * Sets the migrationList value for this ClusterDrsRecommendation.
     * 
     * @param migrationList
     */
    public void setMigrationList(com.vmware.vim25.ClusterDrsMigration[] migrationList) {
        this.migrationList = migrationList;
    }

    public com.vmware.vim25.ClusterDrsMigration getMigrationList(int i) {
        return this.migrationList[i];
    }

    public void setMigrationList(int i, com.vmware.vim25.ClusterDrsMigration _value) {
        this.migrationList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClusterDrsRecommendation)) return false;
        ClusterDrsRecommendation other = (ClusterDrsRecommendation) obj;
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
            this.rating == other.getRating() &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.reasonText==null && other.getReasonText()==null) || 
             (this.reasonText!=null &&
              this.reasonText.equals(other.getReasonText()))) &&
            ((this.migrationList==null && other.getMigrationList()==null) || 
             (this.migrationList!=null &&
              java.util.Arrays.equals(this.migrationList, other.getMigrationList())));
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
        _hashCode += getRating();
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        if (getReasonText() != null) {
            _hashCode += getReasonText().hashCode();
        }
        if (getMigrationList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMigrationList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMigrationList(), i);
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
        new org.apache.axis.description.TypeDesc(ClusterDrsRecommendation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDrsRecommendation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rating");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "rating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonText");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "reasonText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("migrationList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "migrationList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDrsMigration"));
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
