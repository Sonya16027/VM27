/**
 * OvfCreateImportSpecParams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class OvfCreateImportSpecParams  extends com.vmware.vim25.OvfManagerCommonParams  implements java.io.Serializable {
    private java.lang.String entityName;

    private com.vmware.vim25.ManagedObjectReference hostSystem;

    private com.vmware.vim25.OvfNetworkMapping[] networkMapping;

    private java.lang.String ipAllocationPolicy;

    private java.lang.String ipProtocol;

    private com.vmware.vim25.KeyValue[] propertyMapping;

    public OvfCreateImportSpecParams() {
    }

    public OvfCreateImportSpecParams(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String locale,
           java.lang.String deploymentOption,
           com.vmware.vim25.KeyValue[] msgBundle,
           java.lang.String entityName,
           com.vmware.vim25.ManagedObjectReference hostSystem,
           com.vmware.vim25.OvfNetworkMapping[] networkMapping,
           java.lang.String ipAllocationPolicy,
           java.lang.String ipProtocol,
           com.vmware.vim25.KeyValue[] propertyMapping) {
        super(
            dynamicType,
            dynamicProperty,
            locale,
            deploymentOption,
            msgBundle);
        this.entityName = entityName;
        this.hostSystem = hostSystem;
        this.networkMapping = networkMapping;
        this.ipAllocationPolicy = ipAllocationPolicy;
        this.ipProtocol = ipProtocol;
        this.propertyMapping = propertyMapping;
    }


    /**
     * Gets the entityName value for this OvfCreateImportSpecParams.
     * 
     * @return entityName
     */
    public java.lang.String getEntityName() {
        return entityName;
    }


    /**
     * Sets the entityName value for this OvfCreateImportSpecParams.
     * 
     * @param entityName
     */
    public void setEntityName(java.lang.String entityName) {
        this.entityName = entityName;
    }


    /**
     * Gets the hostSystem value for this OvfCreateImportSpecParams.
     * 
     * @return hostSystem
     */
    public com.vmware.vim25.ManagedObjectReference getHostSystem() {
        return hostSystem;
    }


    /**
     * Sets the hostSystem value for this OvfCreateImportSpecParams.
     * 
     * @param hostSystem
     */
    public void setHostSystem(com.vmware.vim25.ManagedObjectReference hostSystem) {
        this.hostSystem = hostSystem;
    }


    /**
     * Gets the networkMapping value for this OvfCreateImportSpecParams.
     * 
     * @return networkMapping
     */
    public com.vmware.vim25.OvfNetworkMapping[] getNetworkMapping() {
        return networkMapping;
    }


    /**
     * Sets the networkMapping value for this OvfCreateImportSpecParams.
     * 
     * @param networkMapping
     */
    public void setNetworkMapping(com.vmware.vim25.OvfNetworkMapping[] networkMapping) {
        this.networkMapping = networkMapping;
    }

    public com.vmware.vim25.OvfNetworkMapping getNetworkMapping(int i) {
        return this.networkMapping[i];
    }

    public void setNetworkMapping(int i, com.vmware.vim25.OvfNetworkMapping _value) {
        this.networkMapping[i] = _value;
    }


    /**
     * Gets the ipAllocationPolicy value for this OvfCreateImportSpecParams.
     * 
     * @return ipAllocationPolicy
     */
    public java.lang.String getIpAllocationPolicy() {
        return ipAllocationPolicy;
    }


    /**
     * Sets the ipAllocationPolicy value for this OvfCreateImportSpecParams.
     * 
     * @param ipAllocationPolicy
     */
    public void setIpAllocationPolicy(java.lang.String ipAllocationPolicy) {
        this.ipAllocationPolicy = ipAllocationPolicy;
    }


    /**
     * Gets the ipProtocol value for this OvfCreateImportSpecParams.
     * 
     * @return ipProtocol
     */
    public java.lang.String getIpProtocol() {
        return ipProtocol;
    }


    /**
     * Sets the ipProtocol value for this OvfCreateImportSpecParams.
     * 
     * @param ipProtocol
     */
    public void setIpProtocol(java.lang.String ipProtocol) {
        this.ipProtocol = ipProtocol;
    }


    /**
     * Gets the propertyMapping value for this OvfCreateImportSpecParams.
     * 
     * @return propertyMapping
     */
    public com.vmware.vim25.KeyValue[] getPropertyMapping() {
        return propertyMapping;
    }


    /**
     * Sets the propertyMapping value for this OvfCreateImportSpecParams.
     * 
     * @param propertyMapping
     */
    public void setPropertyMapping(com.vmware.vim25.KeyValue[] propertyMapping) {
        this.propertyMapping = propertyMapping;
    }

    public com.vmware.vim25.KeyValue getPropertyMapping(int i) {
        return this.propertyMapping[i];
    }

    public void setPropertyMapping(int i, com.vmware.vim25.KeyValue _value) {
        this.propertyMapping[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OvfCreateImportSpecParams)) return false;
        OvfCreateImportSpecParams other = (OvfCreateImportSpecParams) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.entityName==null && other.getEntityName()==null) || 
             (this.entityName!=null &&
              this.entityName.equals(other.getEntityName()))) &&
            ((this.hostSystem==null && other.getHostSystem()==null) || 
             (this.hostSystem!=null &&
              this.hostSystem.equals(other.getHostSystem()))) &&
            ((this.networkMapping==null && other.getNetworkMapping()==null) || 
             (this.networkMapping!=null &&
              java.util.Arrays.equals(this.networkMapping, other.getNetworkMapping()))) &&
            ((this.ipAllocationPolicy==null && other.getIpAllocationPolicy()==null) || 
             (this.ipAllocationPolicy!=null &&
              this.ipAllocationPolicy.equals(other.getIpAllocationPolicy()))) &&
            ((this.ipProtocol==null && other.getIpProtocol()==null) || 
             (this.ipProtocol!=null &&
              this.ipProtocol.equals(other.getIpProtocol()))) &&
            ((this.propertyMapping==null && other.getPropertyMapping()==null) || 
             (this.propertyMapping!=null &&
              java.util.Arrays.equals(this.propertyMapping, other.getPropertyMapping())));
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
        if (getEntityName() != null) {
            _hashCode += getEntityName().hashCode();
        }
        if (getHostSystem() != null) {
            _hashCode += getHostSystem().hashCode();
        }
        if (getNetworkMapping() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNetworkMapping());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNetworkMapping(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIpAllocationPolicy() != null) {
            _hashCode += getIpAllocationPolicy().hashCode();
        }
        if (getIpProtocol() != null) {
            _hashCode += getIpProtocol().hashCode();
        }
        if (getPropertyMapping() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPropertyMapping());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPropertyMapping(), i);
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
        new org.apache.axis.description.TypeDesc(OvfCreateImportSpecParams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OvfCreateImportSpecParams"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "entityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkMapping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "networkMapping"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OvfNetworkMapping"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipAllocationPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipAllocationPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipProtocol");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipProtocol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyMapping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "propertyMapping"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "KeyValue"));
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
