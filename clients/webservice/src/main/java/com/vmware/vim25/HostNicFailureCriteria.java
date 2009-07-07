/**
 * HostNicFailureCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostNicFailureCriteria  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.String checkSpeed;

    private java.lang.Integer speed;

    private java.lang.Boolean checkDuplex;

    private java.lang.Boolean fullDuplex;

    private java.lang.Boolean checkErrorPercent;

    private java.lang.Integer percentage;

    private java.lang.Boolean checkBeacon;

    public HostNicFailureCriteria() {
    }

    public HostNicFailureCriteria(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String checkSpeed,
           java.lang.Integer speed,
           java.lang.Boolean checkDuplex,
           java.lang.Boolean fullDuplex,
           java.lang.Boolean checkErrorPercent,
           java.lang.Integer percentage,
           java.lang.Boolean checkBeacon) {
        super(
            dynamicType,
            dynamicProperty);
        this.checkSpeed = checkSpeed;
        this.speed = speed;
        this.checkDuplex = checkDuplex;
        this.fullDuplex = fullDuplex;
        this.checkErrorPercent = checkErrorPercent;
        this.percentage = percentage;
        this.checkBeacon = checkBeacon;
    }


    /**
     * Gets the checkSpeed value for this HostNicFailureCriteria.
     * 
     * @return checkSpeed
     */
    public java.lang.String getCheckSpeed() {
        return checkSpeed;
    }


    /**
     * Sets the checkSpeed value for this HostNicFailureCriteria.
     * 
     * @param checkSpeed
     */
    public void setCheckSpeed(java.lang.String checkSpeed) {
        this.checkSpeed = checkSpeed;
    }


    /**
     * Gets the speed value for this HostNicFailureCriteria.
     * 
     * @return speed
     */
    public java.lang.Integer getSpeed() {
        return speed;
    }


    /**
     * Sets the speed value for this HostNicFailureCriteria.
     * 
     * @param speed
     */
    public void setSpeed(java.lang.Integer speed) {
        this.speed = speed;
    }


    /**
     * Gets the checkDuplex value for this HostNicFailureCriteria.
     * 
     * @return checkDuplex
     */
    public java.lang.Boolean getCheckDuplex() {
        return checkDuplex;
    }


    /**
     * Sets the checkDuplex value for this HostNicFailureCriteria.
     * 
     * @param checkDuplex
     */
    public void setCheckDuplex(java.lang.Boolean checkDuplex) {
        this.checkDuplex = checkDuplex;
    }


    /**
     * Gets the fullDuplex value for this HostNicFailureCriteria.
     * 
     * @return fullDuplex
     */
    public java.lang.Boolean getFullDuplex() {
        return fullDuplex;
    }


    /**
     * Sets the fullDuplex value for this HostNicFailureCriteria.
     * 
     * @param fullDuplex
     */
    public void setFullDuplex(java.lang.Boolean fullDuplex) {
        this.fullDuplex = fullDuplex;
    }


    /**
     * Gets the checkErrorPercent value for this HostNicFailureCriteria.
     * 
     * @return checkErrorPercent
     */
    public java.lang.Boolean getCheckErrorPercent() {
        return checkErrorPercent;
    }


    /**
     * Sets the checkErrorPercent value for this HostNicFailureCriteria.
     * 
     * @param checkErrorPercent
     */
    public void setCheckErrorPercent(java.lang.Boolean checkErrorPercent) {
        this.checkErrorPercent = checkErrorPercent;
    }


    /**
     * Gets the percentage value for this HostNicFailureCriteria.
     * 
     * @return percentage
     */
    public java.lang.Integer getPercentage() {
        return percentage;
    }


    /**
     * Sets the percentage value for this HostNicFailureCriteria.
     * 
     * @param percentage
     */
    public void setPercentage(java.lang.Integer percentage) {
        this.percentage = percentage;
    }


    /**
     * Gets the checkBeacon value for this HostNicFailureCriteria.
     * 
     * @return checkBeacon
     */
    public java.lang.Boolean getCheckBeacon() {
        return checkBeacon;
    }


    /**
     * Sets the checkBeacon value for this HostNicFailureCriteria.
     * 
     * @param checkBeacon
     */
    public void setCheckBeacon(java.lang.Boolean checkBeacon) {
        this.checkBeacon = checkBeacon;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostNicFailureCriteria)) return false;
        HostNicFailureCriteria other = (HostNicFailureCriteria) obj;
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
        new org.apache.axis.description.TypeDesc(HostNicFailureCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostNicFailureCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkSpeed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "checkSpeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("speed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "speed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkDuplex");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "checkDuplex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullDuplex");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "fullDuplex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkErrorPercent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "checkErrorPercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "percentage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkBeacon");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "checkBeacon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
