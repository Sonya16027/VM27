/**
 * DVSFailureCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class DVSFailureCriteria  extends com.vmware.vim25.InheritablePolicy  implements java.io.Serializable {
    private com.vmware.vim25.StringPolicy checkSpeed;

    private com.vmware.vim25.IntPolicy speed;

    private com.vmware.vim25.BoolPolicy checkDuplex;

    private com.vmware.vim25.BoolPolicy fullDuplex;

    private com.vmware.vim25.BoolPolicy checkErrorPercent;

    private com.vmware.vim25.IntPolicy percentage;

    private com.vmware.vim25.BoolPolicy checkBeacon;

    public DVSFailureCriteria() {
    }

    public DVSFailureCriteria(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           boolean inherited,
           com.vmware.vim25.StringPolicy checkSpeed,
           com.vmware.vim25.IntPolicy speed,
           com.vmware.vim25.BoolPolicy checkDuplex,
           com.vmware.vim25.BoolPolicy fullDuplex,
           com.vmware.vim25.BoolPolicy checkErrorPercent,
           com.vmware.vim25.IntPolicy percentage,
           com.vmware.vim25.BoolPolicy checkBeacon) {
        super(
            dynamicType,
            dynamicProperty,
            inherited);
        this.checkSpeed = checkSpeed;
        this.speed = speed;
        this.checkDuplex = checkDuplex;
        this.fullDuplex = fullDuplex;
        this.checkErrorPercent = checkErrorPercent;
        this.percentage = percentage;
        this.checkBeacon = checkBeacon;
    }


    /**
     * Gets the checkSpeed value for this DVSFailureCriteria.
     * 
     * @return checkSpeed
     */
    public com.vmware.vim25.StringPolicy getCheckSpeed() {
        return checkSpeed;
    }


    /**
     * Sets the checkSpeed value for this DVSFailureCriteria.
     * 
     * @param checkSpeed
     */
    public void setCheckSpeed(com.vmware.vim25.StringPolicy checkSpeed) {
        this.checkSpeed = checkSpeed;
    }


    /**
     * Gets the speed value for this DVSFailureCriteria.
     * 
     * @return speed
     */
    public com.vmware.vim25.IntPolicy getSpeed() {
        return speed;
    }


    /**
     * Sets the speed value for this DVSFailureCriteria.
     * 
     * @param speed
     */
    public void setSpeed(com.vmware.vim25.IntPolicy speed) {
        this.speed = speed;
    }


    /**
     * Gets the checkDuplex value for this DVSFailureCriteria.
     * 
     * @return checkDuplex
     */
    public com.vmware.vim25.BoolPolicy getCheckDuplex() {
        return checkDuplex;
    }


    /**
     * Sets the checkDuplex value for this DVSFailureCriteria.
     * 
     * @param checkDuplex
     */
    public void setCheckDuplex(com.vmware.vim25.BoolPolicy checkDuplex) {
        this.checkDuplex = checkDuplex;
    }


    /**
     * Gets the fullDuplex value for this DVSFailureCriteria.
     * 
     * @return fullDuplex
     */
    public com.vmware.vim25.BoolPolicy getFullDuplex() {
        return fullDuplex;
    }


    /**
     * Sets the fullDuplex value for this DVSFailureCriteria.
     * 
     * @param fullDuplex
     */
    public void setFullDuplex(com.vmware.vim25.BoolPolicy fullDuplex) {
        this.fullDuplex = fullDuplex;
    }


    /**
     * Gets the checkErrorPercent value for this DVSFailureCriteria.
     * 
     * @return checkErrorPercent
     */
    public com.vmware.vim25.BoolPolicy getCheckErrorPercent() {
        return checkErrorPercent;
    }


    /**
     * Sets the checkErrorPercent value for this DVSFailureCriteria.
     * 
     * @param checkErrorPercent
     */
    public void setCheckErrorPercent(com.vmware.vim25.BoolPolicy checkErrorPercent) {
        this.checkErrorPercent = checkErrorPercent;
    }


    /**
     * Gets the percentage value for this DVSFailureCriteria.
     * 
     * @return percentage
     */
    public com.vmware.vim25.IntPolicy getPercentage() {
        return percentage;
    }


    /**
     * Sets the percentage value for this DVSFailureCriteria.
     * 
     * @param percentage
     */
    public void setPercentage(com.vmware.vim25.IntPolicy percentage) {
        this.percentage = percentage;
    }


    /**
     * Gets the checkBeacon value for this DVSFailureCriteria.
     * 
     * @return checkBeacon
     */
    public com.vmware.vim25.BoolPolicy getCheckBeacon() {
        return checkBeacon;
    }


    /**
     * Sets the checkBeacon value for this DVSFailureCriteria.
     * 
     * @param checkBeacon
     */
    public void setCheckBeacon(com.vmware.vim25.BoolPolicy checkBeacon) {
        this.checkBeacon = checkBeacon;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DVSFailureCriteria)) return false;
        DVSFailureCriteria other = (DVSFailureCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.checkSpeed==null && other.getCheckSpeed()==null) || 
             (this.checkSpeed!=null &&
              this.checkSpeed.equals(other.getCheckSpeed()))) &&
            ((this.speed==null && other.getSpeed()==null) || 
             (this.speed!=null &&
              this.speed.equals(other.getSpeed()))) &&
            ((this.checkDuplex==null && other.getCheckDuplex()==null) || 
             (this.checkDuplex!=null &&
              this.checkDuplex.equals(other.getCheckDuplex()))) &&
            ((this.fullDuplex==null && other.getFullDuplex()==null) || 
             (this.fullDuplex!=null &&
              this.fullDuplex.equals(other.getFullDuplex()))) &&
            ((this.checkErrorPercent==null && other.getCheckErrorPercent()==null) || 
             (this.checkErrorPercent!=null &&
              this.checkErrorPercent.equals(other.getCheckErrorPercent()))) &&
            ((this.percentage==null && other.getPercentage()==null) || 
             (this.percentage!=null &&
              this.percentage.equals(other.getPercentage()))) &&
            ((this.checkBeacon==null && other.getCheckBeacon()==null) || 
             (this.checkBeacon!=null &&
              this.checkBeacon.equals(other.getCheckBeacon())));
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
        if (getCheckSpeed() != null) {
            _hashCode += getCheckSpeed().hashCode();
        }
        if (getSpeed() != null) {
            _hashCode += getSpeed().hashCode();
        }
        if (getCheckDuplex() != null) {
            _hashCode += getCheckDuplex().hashCode();
        }
        if (getFullDuplex() != null) {
            _hashCode += getFullDuplex().hashCode();
        }
        if (getCheckErrorPercent() != null) {
            _hashCode += getCheckErrorPercent().hashCode();
        }
        if (getPercentage() != null) {
            _hashCode += getPercentage().hashCode();
        }
        if (getCheckBeacon() != null) {
            _hashCode += getCheckBeacon().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DVSFailureCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVSFailureCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkSpeed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "checkSpeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "StringPolicy"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("speed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "speed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IntPolicy"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkDuplex");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "checkDuplex"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "BoolPolicy"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullDuplex");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "fullDuplex"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "BoolPolicy"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkErrorPercent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "checkErrorPercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "BoolPolicy"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "percentage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IntPolicy"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkBeacon");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "checkBeacon"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "BoolPolicy"));
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
