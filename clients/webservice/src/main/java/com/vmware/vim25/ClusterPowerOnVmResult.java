/**
 * ClusterPowerOnVmResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ClusterPowerOnVmResult  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private com.vmware.vim25.ClusterAttemptedVmInfo[] attempted;

    private com.vmware.vim25.ClusterNotAttemptedVmInfo[] notAttempted;

    private com.vmware.vim25.ClusterRecommendation[] recommendations;

    public ClusterPowerOnVmResult() {
    }

    public ClusterPowerOnVmResult(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.ClusterAttemptedVmInfo[] attempted,
           com.vmware.vim25.ClusterNotAttemptedVmInfo[] notAttempted,
           com.vmware.vim25.ClusterRecommendation[] recommendations) {
        super(
            dynamicType,
            dynamicProperty);
        this.attempted = attempted;
        this.notAttempted = notAttempted;
        this.recommendations = recommendations;
    }


    /**
     * Gets the attempted value for this ClusterPowerOnVmResult.
     * 
     * @return attempted
     */
    public com.vmware.vim25.ClusterAttemptedVmInfo[] getAttempted() {
        return attempted;
    }


    /**
     * Sets the attempted value for this ClusterPowerOnVmResult.
     * 
     * @param attempted
     */
    public void setAttempted(com.vmware.vim25.ClusterAttemptedVmInfo[] attempted) {
        this.attempted = attempted;
    }

    public com.vmware.vim25.ClusterAttemptedVmInfo getAttempted(int i) {
        return this.attempted[i];
    }

    public void setAttempted(int i, com.vmware.vim25.ClusterAttemptedVmInfo _value) {
        this.attempted[i] = _value;
    }


    /**
     * Gets the notAttempted value for this ClusterPowerOnVmResult.
     * 
     * @return notAttempted
     */
    public com.vmware.vim25.ClusterNotAttemptedVmInfo[] getNotAttempted() {
        return notAttempted;
    }


    /**
     * Sets the notAttempted value for this ClusterPowerOnVmResult.
     * 
     * @param notAttempted
     */
    public void setNotAttempted(com.vmware.vim25.ClusterNotAttemptedVmInfo[] notAttempted) {
        this.notAttempted = notAttempted;
    }

    public com.vmware.vim25.ClusterNotAttemptedVmInfo getNotAttempted(int i) {
        return this.notAttempted[i];
    }

    public void setNotAttempted(int i, com.vmware.vim25.ClusterNotAttemptedVmInfo _value) {
        this.notAttempted[i] = _value;
    }


    /**
     * Gets the recommendations value for this ClusterPowerOnVmResult.
     * 
     * @return recommendations
     */
    public com.vmware.vim25.ClusterRecommendation[] getRecommendations() {
        return recommendations;
    }


    /**
     * Sets the recommendations value for this ClusterPowerOnVmResult.
     * 
     * @param recommendations
     */
    public void setRecommendations(com.vmware.vim25.ClusterRecommendation[] recommendations) {
        this.recommendations = recommendations;
    }

    public com.vmware.vim25.ClusterRecommendation getRecommendations(int i) {
        return this.recommendations[i];
    }

    public void setRecommendations(int i, com.vmware.vim25.ClusterRecommendation _value) {
        this.recommendations[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClusterPowerOnVmResult)) return false;
        ClusterPowerOnVmResult other = (ClusterPowerOnVmResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.attempted==null && other.getAttempted()==null) || 
             (this.attempted!=null &&
              java.util.Arrays.equals(this.attempted, other.getAttempted()))) &&
            ((this.notAttempted==null && other.getNotAttempted()==null) || 
             (this.notAttempted!=null &&
              java.util.Arrays.equals(this.notAttempted, other.getNotAttempted()))) &&
            ((this.recommendations==null && other.getRecommendations()==null) || 
             (this.recommendations!=null &&
              java.util.Arrays.equals(this.recommendations, other.getRecommendations())));
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
        if (getAttempted() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttempted());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttempted(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNotAttempted() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotAttempted());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNotAttempted(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecommendations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecommendations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecommendations(), i);
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
        new org.apache.axis.description.TypeDesc(ClusterPowerOnVmResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterPowerOnVmResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attempted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "attempted"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterAttemptedVmInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notAttempted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "notAttempted"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterNotAttemptedVmInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recommendations");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "recommendations"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterRecommendation"));
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
