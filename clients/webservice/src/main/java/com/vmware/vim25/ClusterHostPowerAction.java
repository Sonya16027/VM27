/**
 * ClusterHostPowerAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ClusterHostPowerAction  extends com.vmware.vim25.ClusterAction  implements java.io.Serializable {
    private com.vmware.vim25.HostPowerOperationType operationType;

    private java.lang.Integer powerConsumptionWatt;

    private java.lang.Integer cpuCapacityMHz;

    private java.lang.Integer memCapacityMB;

    public ClusterHostPowerAction() {
    }

    public ClusterHostPowerAction(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String type,
           com.vmware.vim25.ManagedObjectReference target,
           com.vmware.vim25.HostPowerOperationType operationType,
           java.lang.Integer powerConsumptionWatt,
           java.lang.Integer cpuCapacityMHz,
           java.lang.Integer memCapacityMB) {
        super(
            dynamicType,
            dynamicProperty,
            type,
            target);
        this.operationType = operationType;
        this.powerConsumptionWatt = powerConsumptionWatt;
        this.cpuCapacityMHz = cpuCapacityMHz;
        this.memCapacityMB = memCapacityMB;
    }


    /**
     * Gets the operationType value for this ClusterHostPowerAction.
     * 
     * @return operationType
     */
    public com.vmware.vim25.HostPowerOperationType getOperationType() {
        return operationType;
    }


    /**
     * Sets the operationType value for this ClusterHostPowerAction.
     * 
     * @param operationType
     */
    public void setOperationType(com.vmware.vim25.HostPowerOperationType operationType) {
        this.operationType = operationType;
    }


    /**
     * Gets the powerConsumptionWatt value for this ClusterHostPowerAction.
     * 
     * @return powerConsumptionWatt
     */
    public java.lang.Integer getPowerConsumptionWatt() {
        return powerConsumptionWatt;
    }


    /**
     * Sets the powerConsumptionWatt value for this ClusterHostPowerAction.
     * 
     * @param powerConsumptionWatt
     */
    public void setPowerConsumptionWatt(java.lang.Integer powerConsumptionWatt) {
        this.powerConsumptionWatt = powerConsumptionWatt;
    }


    /**
     * Gets the cpuCapacityMHz value for this ClusterHostPowerAction.
     * 
     * @return cpuCapacityMHz
     */
    public java.lang.Integer getCpuCapacityMHz() {
        return cpuCapacityMHz;
    }


    /**
     * Sets the cpuCapacityMHz value for this ClusterHostPowerAction.
     * 
     * @param cpuCapacityMHz
     */
    public void setCpuCapacityMHz(java.lang.Integer cpuCapacityMHz) {
        this.cpuCapacityMHz = cpuCapacityMHz;
    }


    /**
     * Gets the memCapacityMB value for this ClusterHostPowerAction.
     * 
     * @return memCapacityMB
     */
    public java.lang.Integer getMemCapacityMB() {
        return memCapacityMB;
    }


    /**
     * Sets the memCapacityMB value for this ClusterHostPowerAction.
     * 
     * @param memCapacityMB
     */
    public void setMemCapacityMB(java.lang.Integer memCapacityMB) {
        this.memCapacityMB = memCapacityMB;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClusterHostPowerAction)) return false;
        ClusterHostPowerAction other = (ClusterHostPowerAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.operationType==null && other.getOperationType()==null) || 
             (this.operationType!=null &&
              this.operationType.equals(other.getOperationType()))) &&
            ((this.powerConsumptionWatt==null && other.getPowerConsumptionWatt()==null) || 
             (this.powerConsumptionWatt!=null &&
              this.powerConsumptionWatt.equals(other.getPowerConsumptionWatt()))) &&
            ((this.cpuCapacityMHz==null && other.getCpuCapacityMHz()==null) || 
             (this.cpuCapacityMHz!=null &&
              this.cpuCapacityMHz.equals(other.getCpuCapacityMHz()))) &&
            ((this.memCapacityMB==null && other.getMemCapacityMB()==null) || 
             (this.memCapacityMB!=null &&
              this.memCapacityMB.equals(other.getMemCapacityMB())));
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
        if (getOperationType() != null) {
            _hashCode += getOperationType().hashCode();
        }
        if (getPowerConsumptionWatt() != null) {
            _hashCode += getPowerConsumptionWatt().hashCode();
        }
        if (getCpuCapacityMHz() != null) {
            _hashCode += getCpuCapacityMHz().hashCode();
        }
        if (getMemCapacityMB() != null) {
            _hashCode += getMemCapacityMB().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClusterHostPowerAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterHostPowerAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "operationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostPowerOperationType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("powerConsumptionWatt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "powerConsumptionWatt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpuCapacityMHz");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cpuCapacityMHz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memCapacityMB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "memCapacityMB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
