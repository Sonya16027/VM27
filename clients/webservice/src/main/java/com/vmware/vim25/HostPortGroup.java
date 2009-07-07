/**
 * HostPortGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostPortGroup  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.String key;

    private com.vmware.vim25.HostPortGroupPort[] port;

    private java.lang.String vswitch;

    private com.vmware.vim25.HostNetworkPolicy computedPolicy;

    private com.vmware.vim25.HostPortGroupSpec spec;

    public HostPortGroup() {
    }

    public HostPortGroup(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String key,
           com.vmware.vim25.HostPortGroupPort[] port,
           java.lang.String vswitch,
           com.vmware.vim25.HostNetworkPolicy computedPolicy,
           com.vmware.vim25.HostPortGroupSpec spec) {
        super(
            dynamicType,
            dynamicProperty);
        this.key = key;
        this.port = port;
        this.vswitch = vswitch;
        this.computedPolicy = computedPolicy;
        this.spec = spec;
    }


    /**
     * Gets the key value for this HostPortGroup.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this HostPortGroup.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the port value for this HostPortGroup.
     * 
     * @return port
     */
    public com.vmware.vim25.HostPortGroupPort[] getPort() {
        return port;
    }


    /**
     * Sets the port value for this HostPortGroup.
     * 
     * @param port
     */
    public void setPort(com.vmware.vim25.HostPortGroupPort[] port) {
        this.port = port;
    }

    public com.vmware.vim25.HostPortGroupPort getPort(int i) {
        return this.port[i];
    }

    public void setPort(int i, com.vmware.vim25.HostPortGroupPort _value) {
        this.port[i] = _value;
    }


    /**
     * Gets the vswitch value for this HostPortGroup.
     * 
     * @return vswitch
     */
    public java.lang.String getVswitch() {
        return vswitch;
    }


    /**
     * Sets the vswitch value for this HostPortGroup.
     * 
     * @param vswitch
     */
    public void setVswitch(java.lang.String vswitch) {
        this.vswitch = vswitch;
    }


    /**
     * Gets the computedPolicy value for this HostPortGroup.
     * 
     * @return computedPolicy
     */
    public com.vmware.vim25.HostNetworkPolicy getComputedPolicy() {
        return computedPolicy;
    }


    /**
     * Sets the computedPolicy value for this HostPortGroup.
     * 
     * @param computedPolicy
     */
    public void setComputedPolicy(com.vmware.vim25.HostNetworkPolicy computedPolicy) {
        this.computedPolicy = computedPolicy;
    }


    /**
     * Gets the spec value for this HostPortGroup.
     * 
     * @return spec
     */
    public com.vmware.vim25.HostPortGroupSpec getSpec() {
        return spec;
    }


    /**
     * Sets the spec value for this HostPortGroup.
     * 
     * @param spec
     */
    public void setSpec(com.vmware.vim25.HostPortGroupSpec spec) {
        this.spec = spec;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostPortGroup)) return false;
        HostPortGroup other = (HostPortGroup) obj;
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
            ((this.port==null && other.getPort()==null) || 
             (this.port!=null &&
              java.util.Arrays.equals(this.port, other.getPort()))) &&
            ((this.vswitch==null && other.getVswitch()==null) || 
             (this.vswitch!=null &&
              this.vswitch.equals(other.getVswitch()))) &&
            ((this.computedPolicy==null && other.getComputedPolicy()==null) || 
             (this.computedPolicy!=null &&
              this.computedPolicy.equals(other.getComputedPolicy()))) &&
            ((this.spec==null && other.getSpec()==null) || 
             (this.spec!=null &&
              this.spec.equals(other.getSpec())));
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
        if (getPort() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPort());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPort(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVswitch() != null) {
            _hashCode += getVswitch().hashCode();
        }
        if (getComputedPolicy() != null) {
            _hashCode += getComputedPolicy().hashCode();
        }
        if (getSpec() != null) {
            _hashCode += getSpec().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostPortGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostPortGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("port");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "port"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostPortGroupPort"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vswitch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vswitch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("computedPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "computedPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostNetworkPolicy"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "spec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostPortGroupSpec"));
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
