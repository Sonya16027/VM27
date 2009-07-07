/**
 * ScsiLun.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ScsiLun  extends com.vmware.vim.HostDevice  implements java.io.Serializable {
    private java.lang.String key;

    private java.lang.String uuid;

    private java.lang.String canonicalName;

    private java.lang.String lunType;

    private java.lang.String vendor;

    private java.lang.String model;

    private java.lang.String revision;

    private java.lang.Integer scsiLevel;

    private java.lang.String serialNumber;

    private com.vmware.vim.ScsiLunDurableName durableName;

    private java.lang.Integer queueDepth;

    private java.lang.String[] operationalState;

    public ScsiLun() {
    }

    public ScsiLun(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           java.lang.String deviceName,
           java.lang.String deviceType,
           java.lang.String key,
           java.lang.String uuid,
           java.lang.String canonicalName,
           java.lang.String lunType,
           java.lang.String vendor,
           java.lang.String model,
           java.lang.String revision,
           java.lang.Integer scsiLevel,
           java.lang.String serialNumber,
           com.vmware.vim.ScsiLunDurableName durableName,
           java.lang.Integer queueDepth,
           java.lang.String[] operationalState) {
        super(
            dynamicType,
            dynamicProperty,
            deviceName,
            deviceType);
        this.key = key;
        this.uuid = uuid;
        this.canonicalName = canonicalName;
        this.lunType = lunType;
        this.vendor = vendor;
        this.model = model;
        this.revision = revision;
        this.scsiLevel = scsiLevel;
        this.serialNumber = serialNumber;
        this.durableName = durableName;
        this.queueDepth = queueDepth;
        this.operationalState = operationalState;
    }


    /**
     * Gets the key value for this ScsiLun.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this ScsiLun.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the uuid value for this ScsiLun.
     * 
     * @return uuid
     */
    public java.lang.String getUuid() {
        return uuid;
    }


    /**
     * Sets the uuid value for this ScsiLun.
     * 
     * @param uuid
     */
    public void setUuid(java.lang.String uuid) {
        this.uuid = uuid;
    }


    /**
     * Gets the canonicalName value for this ScsiLun.
     * 
     * @return canonicalName
     */
    public java.lang.String getCanonicalName() {
        return canonicalName;
    }


    /**
     * Sets the canonicalName value for this ScsiLun.
     * 
     * @param canonicalName
     */
    public void setCanonicalName(java.lang.String canonicalName) {
        this.canonicalName = canonicalName;
    }


    /**
     * Gets the lunType value for this ScsiLun.
     * 
     * @return lunType
     */
    public java.lang.String getLunType() {
        return lunType;
    }


    /**
     * Sets the lunType value for this ScsiLun.
     * 
     * @param lunType
     */
    public void setLunType(java.lang.String lunType) {
        this.lunType = lunType;
    }


    /**
     * Gets the vendor value for this ScsiLun.
     * 
     * @return vendor
     */
    public java.lang.String getVendor() {
        return vendor;
    }


    /**
     * Sets the vendor value for this ScsiLun.
     * 
     * @param vendor
     */
    public void setVendor(java.lang.String vendor) {
        this.vendor = vendor;
    }


    /**
     * Gets the model value for this ScsiLun.
     * 
     * @return model
     */
    public java.lang.String getModel() {
        return model;
    }


    /**
     * Sets the model value for this ScsiLun.
     * 
     * @param model
     */
    public void setModel(java.lang.String model) {
        this.model = model;
    }


    /**
     * Gets the revision value for this ScsiLun.
     * 
     * @return revision
     */
    public java.lang.String getRevision() {
        return revision;
    }


    /**
     * Sets the revision value for this ScsiLun.
     * 
     * @param revision
     */
    public void setRevision(java.lang.String revision) {
        this.revision = revision;
    }


    /**
     * Gets the scsiLevel value for this ScsiLun.
     * 
     * @return scsiLevel
     */
    public java.lang.Integer getScsiLevel() {
        return scsiLevel;
    }


    /**
     * Sets the scsiLevel value for this ScsiLun.
     * 
     * @param scsiLevel
     */
    public void setScsiLevel(java.lang.Integer scsiLevel) {
        this.scsiLevel = scsiLevel;
    }


    /**
     * Gets the serialNumber value for this ScsiLun.
     * 
     * @return serialNumber
     */
    public java.lang.String getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this ScsiLun.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(java.lang.String serialNumber) {
        this.serialNumber = serialNumber;
    }


    /**
     * Gets the durableName value for this ScsiLun.
     * 
     * @return durableName
     */
    public com.vmware.vim.ScsiLunDurableName getDurableName() {
        return durableName;
    }


    /**
     * Sets the durableName value for this ScsiLun.
     * 
     * @param durableName
     */
    public void setDurableName(com.vmware.vim.ScsiLunDurableName durableName) {
        this.durableName = durableName;
    }


    /**
     * Gets the queueDepth value for this ScsiLun.
     * 
     * @return queueDepth
     */
    public java.lang.Integer getQueueDepth() {
        return queueDepth;
    }


    /**
     * Sets the queueDepth value for this ScsiLun.
     * 
     * @param queueDepth
     */
    public void setQueueDepth(java.lang.Integer queueDepth) {
        this.queueDepth = queueDepth;
    }


    /**
     * Gets the operationalState value for this ScsiLun.
     * 
     * @return operationalState
     */
    public java.lang.String[] getOperationalState() {
        return operationalState;
    }


    /**
     * Sets the operationalState value for this ScsiLun.
     * 
     * @param operationalState
     */
    public void setOperationalState(java.lang.String[] operationalState) {
        this.operationalState = operationalState;
    }

    public java.lang.String getOperationalState(int i) {
        return this.operationalState[i];
    }

    public void setOperationalState(int i, java.lang.String _value) {
        this.operationalState[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScsiLun)) return false;
        ScsiLun other = (ScsiLun) obj;
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
            ((this.uuid==null && other.getUuid()==null) || 
             (this.uuid!=null &&
              this.uuid.equals(other.getUuid()))) &&
            ((this.canonicalName==null && other.getCanonicalName()==null) || 
             (this.canonicalName!=null &&
              this.canonicalName.equals(other.getCanonicalName()))) &&
            ((this.lunType==null && other.getLunType()==null) || 
             (this.lunType!=null &&
              this.lunType.equals(other.getLunType()))) &&
            ((this.vendor==null && other.getVendor()==null) || 
             (this.vendor!=null &&
              this.vendor.equals(other.getVendor()))) &&
            ((this.model==null && other.getModel()==null) || 
             (this.model!=null &&
              this.model.equals(other.getModel()))) &&
            ((this.revision==null && other.getRevision()==null) || 
             (this.revision!=null &&
              this.revision.equals(other.getRevision()))) &&
            ((this.scsiLevel==null && other.getScsiLevel()==null) || 
             (this.scsiLevel!=null &&
              this.scsiLevel.equals(other.getScsiLevel()))) &&
            ((this.serialNumber==null && other.getSerialNumber()==null) || 
             (this.serialNumber!=null &&
              this.serialNumber.equals(other.getSerialNumber()))) &&
            ((this.durableName==null && other.getDurableName()==null) || 
             (this.durableName!=null &&
              this.durableName.equals(other.getDurableName()))) &&
            ((this.queueDepth==null && other.getQueueDepth()==null) || 
             (this.queueDepth!=null &&
              this.queueDepth.equals(other.getQueueDepth()))) &&
            ((this.operationalState==null && other.getOperationalState()==null) || 
             (this.operationalState!=null &&
              java.util.Arrays.equals(this.operationalState, other.getOperationalState())));
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
        if (getUuid() != null) {
            _hashCode += getUuid().hashCode();
        }
        if (getCanonicalName() != null) {
            _hashCode += getCanonicalName().hashCode();
        }
        if (getLunType() != null) {
            _hashCode += getLunType().hashCode();
        }
        if (getVendor() != null) {
            _hashCode += getVendor().hashCode();
        }
        if (getModel() != null) {
            _hashCode += getModel().hashCode();
        }
        if (getRevision() != null) {
            _hashCode += getRevision().hashCode();
        }
        if (getScsiLevel() != null) {
            _hashCode += getScsiLevel().hashCode();
        }
        if (getSerialNumber() != null) {
            _hashCode += getSerialNumber().hashCode();
        }
        if (getDurableName() != null) {
            _hashCode += getDurableName().hashCode();
        }
        if (getQueueDepth() != null) {
            _hashCode += getQueueDepth().hashCode();
        }
        if (getOperationalState() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOperationalState());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOperationalState(), i);
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
        new org.apache.axis.description.TypeDesc(ScsiLun.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ScsiLun"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "uuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canonicalName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "canonicalName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lunType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "lunType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "vendor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("model");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "model"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revision");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "revision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scsiLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "scsiLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "serialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("durableName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "durableName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ScsiLunDurableName"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queueDepth");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "queueDepth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationalState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "operationalState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
