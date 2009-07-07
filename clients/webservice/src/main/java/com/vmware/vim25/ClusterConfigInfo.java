/**
 * ClusterConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ClusterConfigInfo  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private com.vmware.vim25.ClusterDasConfigInfo dasConfig;

    private com.vmware.vim25.ClusterDasVmConfigInfo[] dasVmConfig;

    private com.vmware.vim25.ClusterDrsConfigInfo drsConfig;

    private com.vmware.vim25.ClusterDrsVmConfigInfo[] drsVmConfig;

    private com.vmware.vim25.ClusterRuleInfo[] rule;

    public ClusterConfigInfo() {
    }

    public ClusterConfigInfo(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.ClusterDasConfigInfo dasConfig,
           com.vmware.vim25.ClusterDasVmConfigInfo[] dasVmConfig,
           com.vmware.vim25.ClusterDrsConfigInfo drsConfig,
           com.vmware.vim25.ClusterDrsVmConfigInfo[] drsVmConfig,
           com.vmware.vim25.ClusterRuleInfo[] rule) {
        super(
            dynamicType,
            dynamicProperty);
        this.dasConfig = dasConfig;
        this.dasVmConfig = dasVmConfig;
        this.drsConfig = drsConfig;
        this.drsVmConfig = drsVmConfig;
        this.rule = rule;
    }


    /**
     * Gets the dasConfig value for this ClusterConfigInfo.
     * 
     * @return dasConfig
     */
    public com.vmware.vim25.ClusterDasConfigInfo getDasConfig() {
        return dasConfig;
    }


    /**
     * Sets the dasConfig value for this ClusterConfigInfo.
     * 
     * @param dasConfig
     */
    public void setDasConfig(com.vmware.vim25.ClusterDasConfigInfo dasConfig) {
        this.dasConfig = dasConfig;
    }


    /**
     * Gets the dasVmConfig value for this ClusterConfigInfo.
     * 
     * @return dasVmConfig
     */
    public com.vmware.vim25.ClusterDasVmConfigInfo[] getDasVmConfig() {
        return dasVmConfig;
    }


    /**
     * Sets the dasVmConfig value for this ClusterConfigInfo.
     * 
     * @param dasVmConfig
     */
    public void setDasVmConfig(com.vmware.vim25.ClusterDasVmConfigInfo[] dasVmConfig) {
        this.dasVmConfig = dasVmConfig;
    }

    public com.vmware.vim25.ClusterDasVmConfigInfo getDasVmConfig(int i) {
        return this.dasVmConfig[i];
    }

    public void setDasVmConfig(int i, com.vmware.vim25.ClusterDasVmConfigInfo _value) {
        this.dasVmConfig[i] = _value;
    }


    /**
     * Gets the drsConfig value for this ClusterConfigInfo.
     * 
     * @return drsConfig
     */
    public com.vmware.vim25.ClusterDrsConfigInfo getDrsConfig() {
        return drsConfig;
    }


    /**
     * Sets the drsConfig value for this ClusterConfigInfo.
     * 
     * @param drsConfig
     */
    public void setDrsConfig(com.vmware.vim25.ClusterDrsConfigInfo drsConfig) {
        this.drsConfig = drsConfig;
    }


    /**
     * Gets the drsVmConfig value for this ClusterConfigInfo.
     * 
     * @return drsVmConfig
     */
    public com.vmware.vim25.ClusterDrsVmConfigInfo[] getDrsVmConfig() {
        return drsVmConfig;
    }


    /**
     * Sets the drsVmConfig value for this ClusterConfigInfo.
     * 
     * @param drsVmConfig
     */
    public void setDrsVmConfig(com.vmware.vim25.ClusterDrsVmConfigInfo[] drsVmConfig) {
        this.drsVmConfig = drsVmConfig;
    }

    public com.vmware.vim25.ClusterDrsVmConfigInfo getDrsVmConfig(int i) {
        return this.drsVmConfig[i];
    }

    public void setDrsVmConfig(int i, com.vmware.vim25.ClusterDrsVmConfigInfo _value) {
        this.drsVmConfig[i] = _value;
    }


    /**
     * Gets the rule value for this ClusterConfigInfo.
     * 
     * @return rule
     */
    public com.vmware.vim25.ClusterRuleInfo[] getRule() {
        return rule;
    }


    /**
     * Sets the rule value for this ClusterConfigInfo.
     * 
     * @param rule
     */
    public void setRule(com.vmware.vim25.ClusterRuleInfo[] rule) {
        this.rule = rule;
    }

    public com.vmware.vim25.ClusterRuleInfo getRule(int i) {
        return this.rule[i];
    }

    public void setRule(int i, com.vmware.vim25.ClusterRuleInfo _value) {
        this.rule[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClusterConfigInfo)) return false;
        ClusterConfigInfo other = (ClusterConfigInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dasConfig==null && other.getDasConfig()==null) || 
             (this.dasConfig!=null &&
              this.dasConfig.equals(other.getDasConfig()))) &&
            ((this.dasVmConfig==null && other.getDasVmConfig()==null) || 
             (this.dasVmConfig!=null &&
              java.util.Arrays.equals(this.dasVmConfig, other.getDasVmConfig()))) &&
            ((this.drsConfig==null && other.getDrsConfig()==null) || 
             (this.drsConfig!=null &&
              this.drsConfig.equals(other.getDrsConfig()))) &&
            ((this.drsVmConfig==null && other.getDrsVmConfig()==null) || 
             (this.drsVmConfig!=null &&
              java.util.Arrays.equals(this.drsVmConfig, other.getDrsVmConfig()))) &&
            ((this.rule==null && other.getRule()==null) || 
             (this.rule!=null &&
              java.util.Arrays.equals(this.rule, other.getRule())));
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
        if (getDasConfig() != null) {
            _hashCode += getDasConfig().hashCode();
        }
        if (getDasVmConfig() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDasVmConfig());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDasVmConfig(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDrsConfig() != null) {
            _hashCode += getDrsConfig().hashCode();
        }
        if (getDrsVmConfig() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDrsVmConfig());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDrsVmConfig(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRule(), i);
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
        new org.apache.axis.description.TypeDesc(ClusterConfigInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterConfigInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dasConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dasConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDasConfigInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dasVmConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dasVmConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDasVmConfigInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("drsConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "drsConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDrsConfigInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("drsVmConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "drsVmConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDrsVmConfigInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "rule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterRuleInfo"));
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
