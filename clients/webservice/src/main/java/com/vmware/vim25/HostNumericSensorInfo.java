/**
 * HostNumericSensorInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostNumericSensorInfo  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.String name;

    private com.vmware.vim25.ElementDescription healthState;

    private long currentReading;

    private int unitModifier;

    private java.lang.String baseUnits;

    private java.lang.String rateUnits;

    private java.lang.String sensorType;

    public HostNumericSensorInfo() {
    }

    public HostNumericSensorInfo(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String name,
           com.vmware.vim25.ElementDescription healthState,
           long currentReading,
           int unitModifier,
           java.lang.String baseUnits,
           java.lang.String rateUnits,
           java.lang.String sensorType) {
        super(
            dynamicType,
            dynamicProperty);
        this.name = name;
        this.healthState = healthState;
        this.currentReading = currentReading;
        this.unitModifier = unitModifier;
        this.baseUnits = baseUnits;
        this.rateUnits = rateUnits;
        this.sensorType = sensorType;
    }


    /**
     * Gets the name value for this HostNumericSensorInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this HostNumericSensorInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the healthState value for this HostNumericSensorInfo.
     * 
     * @return healthState
     */
    public com.vmware.vim25.ElementDescription getHealthState() {
        return healthState;
    }


    /**
     * Sets the healthState value for this HostNumericSensorInfo.
     * 
     * @param healthState
     */
    public void setHealthState(com.vmware.vim25.ElementDescription healthState) {
        this.healthState = healthState;
    }


    /**
     * Gets the currentReading value for this HostNumericSensorInfo.
     * 
     * @return currentReading
     */
    public long getCurrentReading() {
        return currentReading;
    }


    /**
     * Sets the currentReading value for this HostNumericSensorInfo.
     * 
     * @param currentReading
     */
    public void setCurrentReading(long currentReading) {
        this.currentReading = currentReading;
    }


    /**
     * Gets the unitModifier value for this HostNumericSensorInfo.
     * 
     * @return unitModifier
     */
    public int getUnitModifier() {
        return unitModifier;
    }


    /**
     * Sets the unitModifier value for this HostNumericSensorInfo.
     * 
     * @param unitModifier
     */
    public void setUnitModifier(int unitModifier) {
        this.unitModifier = unitModifier;
    }


    /**
     * Gets the baseUnits value for this HostNumericSensorInfo.
     * 
     * @return baseUnits
     */
    public java.lang.String getBaseUnits() {
        return baseUnits;
    }


    /**
     * Sets the baseUnits value for this HostNumericSensorInfo.
     * 
     * @param baseUnits
     */
    public void setBaseUnits(java.lang.String baseUnits) {
        this.baseUnits = baseUnits;
    }


    /**
     * Gets the rateUnits value for this HostNumericSensorInfo.
     * 
     * @return rateUnits
     */
    public java.lang.String getRateUnits() {
        return rateUnits;
    }


    /**
     * Sets the rateUnits value for this HostNumericSensorInfo.
     * 
     * @param rateUnits
     */
    public void setRateUnits(java.lang.String rateUnits) {
        this.rateUnits = rateUnits;
    }


    /**
     * Gets the sensorType value for this HostNumericSensorInfo.
     * 
     * @return sensorType
     */
    public java.lang.String getSensorType() {
        return sensorType;
    }


    /**
     * Sets the sensorType value for this HostNumericSensorInfo.
     * 
     * @param sensorType
     */
    public void setSensorType(java.lang.String sensorType) {
        this.sensorType = sensorType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostNumericSensorInfo)) return false;
        HostNumericSensorInfo other = (HostNumericSensorInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.healthState==null && other.getHealthState()==null) || 
             (this.healthState!=null &&
              this.healthState.equals(other.getHealthState()))) &&
            this.currentReading == other.getCurrentReading() &&
            this.unitModifier == other.getUnitModifier() &&
            ((this.baseUnits==null && other.getBaseUnits()==null) || 
             (this.baseUnits!=null &&
              this.baseUnits.equals(other.getBaseUnits()))) &&
            ((this.rateUnits==null && other.getRateUnits()==null) || 
             (this.rateUnits!=null &&
              this.rateUnits.equals(other.getRateUnits()))) &&
            ((this.sensorType==null && other.getSensorType()==null) || 
             (this.sensorType!=null &&
              this.sensorType.equals(other.getSensorType())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getHealthState() != null) {
            _hashCode += getHealthState().hashCode();
        }
        _hashCode += new Long(getCurrentReading()).hashCode();
        _hashCode += getUnitModifier();
        if (getBaseUnits() != null) {
            _hashCode += getBaseUnits().hashCode();
        }
        if (getRateUnits() != null) {
            _hashCode += getRateUnits().hashCode();
        }
        if (getSensorType() != null) {
            _hashCode += getSensorType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostNumericSensorInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostNumericSensorInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("healthState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "healthState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ElementDescription"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentReading");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "currentReading"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitModifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "unitModifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "baseUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "rateUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sensorType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sensorType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
