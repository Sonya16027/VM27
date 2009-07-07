/**
 * HostNicTeamingPolicy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostNicTeamingPolicy  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.String policy;

    private java.lang.Boolean reversePolicy;

    private java.lang.Boolean notifySwitches;

    private java.lang.Boolean rollingOrder;

    private com.vmware.vim25.HostNicFailureCriteria failureCriteria;

    private com.vmware.vim25.HostNicOrderPolicy nicOrder;

    public HostNicTeamingPolicy() {
    }

    public HostNicTeamingPolicy(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String policy,
           java.lang.Boolean reversePolicy,
           java.lang.Boolean notifySwitches,
           java.lang.Boolean rollingOrder,
           com.vmware.vim25.HostNicFailureCriteria failureCriteria,
           com.vmware.vim25.HostNicOrderPolicy nicOrder) {
        super(
            dynamicType,
            dynamicProperty);
        this.policy = policy;
        this.reversePolicy = reversePolicy;
        this.notifySwitches = notifySwitches;
        this.rollingOrder = rollingOrder;
        this.failureCriteria = failureCriteria;
        this.nicOrder = nicOrder;
    }


    /**
     * Gets the policy value for this HostNicTeamingPolicy.
     * 
     * @return policy
     */
    public java.lang.String getPolicy() {
        return policy;
    }


    /**
     * Sets the policy value for this HostNicTeamingPolicy.
     * 
     * @param policy
     */
    public void setPolicy(java.lang.String policy) {
        this.policy = policy;
    }


    /**
     * Gets the reversePolicy value for this HostNicTeamingPolicy.
     * 
     * @return reversePolicy
     */
    public java.lang.Boolean getReversePolicy() {
        return reversePolicy;
    }


    /**
     * Sets the reversePolicy value for this HostNicTeamingPolicy.
     * 
     * @param reversePolicy
     */
    public void setReversePolicy(java.lang.Boolean reversePolicy) {
        this.reversePolicy = reversePolicy;
    }


    /**
     * Gets the notifySwitches value for this HostNicTeamingPolicy.
     * 
     * @return notifySwitches
     */
    public java.lang.Boolean getNotifySwitches() {
        return notifySwitches;
    }


    /**
     * Sets the notifySwitches value for this HostNicTeamingPolicy.
     * 
     * @param notifySwitches
     */
    public void setNotifySwitches(java.lang.Boolean notifySwitches) {
        this.notifySwitches = notifySwitches;
    }


    /**
     * Gets the rollingOrder value for this HostNicTeamingPolicy.
     * 
     * @return rollingOrder
     */
    public java.lang.Boolean getRollingOrder() {
        return rollingOrder;
    }


    /**
     * Sets the rollingOrder value for this HostNicTeamingPolicy.
     * 
     * @param rollingOrder
     */
    public void setRollingOrder(java.lang.Boolean rollingOrder) {
        this.rollingOrder = rollingOrder;
    }


    /**
     * Gets the failureCriteria value for this HostNicTeamingPolicy.
     * 
     * @return failureCriteria
     */
    public com.vmware.vim25.HostNicFailureCriteria getFailureCriteria() {
        return failureCriteria;
    }


    /**
     * Sets the failureCriteria value for this HostNicTeamingPolicy.
     * 
     * @param failureCriteria
     */
    public void setFailureCriteria(com.vmware.vim25.HostNicFailureCriteria failureCriteria) {
        this.failureCriteria = failureCriteria;
    }


    /**
     * Gets the nicOrder value for this HostNicTeamingPolicy.
     * 
     * @return nicOrder
     */
    public com.vmware.vim25.HostNicOrderPolicy getNicOrder() {
        return nicOrder;
    }


    /**
     * Sets the nicOrder value for this HostNicTeamingPolicy.
     * 
     * @param nicOrder
     */
    public void setNicOrder(com.vmware.vim25.HostNicOrderPolicy nicOrder) {
        this.nicOrder = nicOrder;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostNicTeamingPolicy)) return false;
        HostNicTeamingPolicy other = (HostNicTeamingPolicy) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.policy==null && other.getPolicy()==null) || 
             (this.policy!=null &&
              this.policy.equals(other.getPolicy()))) &&
            ((this.reversePolicy==null && other.getReversePolicy()==null) || 
             (this.reversePolicy!=null &&
              this.reversePolicy.equals(other.getReversePolicy()))) &&
            ((this.notifySwitches==null && other.getNotifySwitches()==null) || 
             (this.notifySwitches!=null &&
              this.notifySwitches.equals(other.getNotifySwitches()))) &&
            ((this.rollingOrder==null && other.getRollingOrder()==null) || 
             (this.rollingOrder!=null &&
              this.rollingOrder.equals(other.getRollingOrder()))) &&
            ((this.failureCriteria==null && other.getFailureCriteria()==null) || 
             (this.failureCriteria!=null &&
              this.failureCriteria.equals(other.getFailureCriteria()))) &&
            ((this.nicOrder==null && other.getNicOrder()==null) || 
             (this.nicOrder!=null &&
              this.nicOrder.equals(other.getNicOrder())));
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
        if (getPolicy() != null) {
            _hashCode += getPolicy().hashCode();
        }
        if (getReversePolicy() != null) {
            _hashCode += getReversePolicy().hashCode();
        }
        if (getNotifySwitches() != null) {
            _hashCode += getNotifySwitches().hashCode();
        }
        if (getRollingOrder() != null) {
            _hashCode += getRollingOrder().hashCode();
        }
        if (getFailureCriteria() != null) {
            _hashCode += getFailureCriteria().hashCode();
        }
        if (getNicOrder() != null) {
            _hashCode += getNicOrder().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostNicTeamingPolicy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostNicTeamingPolicy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "policy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reversePolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "reversePolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifySwitches");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "notifySwitches"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rollingOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "rollingOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failureCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "failureCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostNicFailureCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nicOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "nicOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostNicOrderPolicy"));
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
