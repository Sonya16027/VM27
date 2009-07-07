/**
 * VAppCloneSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VAppCloneSpec  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private com.vmware.vim25.ManagedObjectReference location;

    private com.vmware.vim25.ManagedObjectReference host;

    private com.vmware.vim25.ResourceConfigSpec resourceSpec;

    private com.vmware.vim25.ManagedObjectReference vmFolder;

    private com.vmware.vim25.VAppCloneSpecNetworkMappingPair[] networkMapping;

    private com.vmware.vim25.KeyValue[] property;

    public VAppCloneSpec() {
    }

    public VAppCloneSpec(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.ManagedObjectReference location,
           com.vmware.vim25.ManagedObjectReference host,
           com.vmware.vim25.ResourceConfigSpec resourceSpec,
           com.vmware.vim25.ManagedObjectReference vmFolder,
           com.vmware.vim25.VAppCloneSpecNetworkMappingPair[] networkMapping,
           com.vmware.vim25.KeyValue[] property) {
        super(
            dynamicType,
            dynamicProperty);
        this.location = location;
        this.host = host;
        this.resourceSpec = resourceSpec;
        this.vmFolder = vmFolder;
        this.networkMapping = networkMapping;
        this.property = property;
    }


    /**
     * Gets the location value for this VAppCloneSpec.
     * 
     * @return location
     */
    public com.vmware.vim25.ManagedObjectReference getLocation() {
        return location;
    }


    /**
     * Sets the location value for this VAppCloneSpec.
     * 
     * @param location
     */
    public void setLocation(com.vmware.vim25.ManagedObjectReference location) {
        this.location = location;
    }


    /**
     * Gets the host value for this VAppCloneSpec.
     * 
     * @return host
     */
    public com.vmware.vim25.ManagedObjectReference getHost() {
        return host;
    }


    /**
     * Sets the host value for this VAppCloneSpec.
     * 
     * @param host
     */
    public void setHost(com.vmware.vim25.ManagedObjectReference host) {
        this.host = host;
    }


    /**
     * Gets the resourceSpec value for this VAppCloneSpec.
     * 
     * @return resourceSpec
     */
    public com.vmware.vim25.ResourceConfigSpec getResourceSpec() {
        return resourceSpec;
    }


    /**
     * Sets the resourceSpec value for this VAppCloneSpec.
     * 
     * @param resourceSpec
     */
    public void setResourceSpec(com.vmware.vim25.ResourceConfigSpec resourceSpec) {
        this.resourceSpec = resourceSpec;
    }


    /**
     * Gets the vmFolder value for this VAppCloneSpec.
     * 
     * @return vmFolder
     */
    public com.vmware.vim25.ManagedObjectReference getVmFolder() {
        return vmFolder;
    }


    /**
     * Sets the vmFolder value for this VAppCloneSpec.
     * 
     * @param vmFolder
     */
    public void setVmFolder(com.vmware.vim25.ManagedObjectReference vmFolder) {
        this.vmFolder = vmFolder;
    }


    /**
     * Gets the networkMapping value for this VAppCloneSpec.
     * 
     * @return networkMapping
     */
    public com.vmware.vim25.VAppCloneSpecNetworkMappingPair[] getNetworkMapping() {
        return networkMapping;
    }


    /**
     * Sets the networkMapping value for this VAppCloneSpec.
     * 
     * @param networkMapping
     */
    public void setNetworkMapping(com.vmware.vim25.VAppCloneSpecNetworkMappingPair[] networkMapping) {
        this.networkMapping = networkMapping;
    }

    public com.vmware.vim25.VAppCloneSpecNetworkMappingPair getNetworkMapping(int i) {
        return this.networkMapping[i];
    }

    public void setNetworkMapping(int i, com.vmware.vim25.VAppCloneSpecNetworkMappingPair _value) {
        this.networkMapping[i] = _value;
    }


    /**
     * Gets the property value for this VAppCloneSpec.
     * 
     * @return property
     */
    public com.vmware.vim25.KeyValue[] getProperty() {
        return property;
    }


    /**
     * Sets the property value for this VAppCloneSpec.
     * 
     * @param property
     */
    public void setProperty(com.vmware.vim25.KeyValue[] property) {
        this.property = property;
    }

    public com.vmware.vim25.KeyValue getProperty(int i) {
        return this.property[i];
    }

    public void setProperty(int i, com.vmware.vim25.KeyValue _value) {
        this.property[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VAppCloneSpec)) return false;
        VAppCloneSpec other = (VAppCloneSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.host==null && other.getHost()==null) || 
             (this.host!=null &&
              this.host.equals(other.getHost()))) &&
            ((this.resourceSpec==null && other.getResourceSpec()==null) || 
             (this.resourceSpec!=null &&
              this.resourceSpec.equals(other.getResourceSpec()))) &&
            ((this.vmFolder==null && other.getVmFolder()==null) || 
             (this.vmFolder!=null &&
              this.vmFolder.equals(other.getVmFolder()))) &&
            ((this.networkMapping==null && other.getNetworkMapping()==null) || 
             (this.networkMapping!=null &&
              java.util.Arrays.equals(this.networkMapping, other.getNetworkMapping()))) &&
            ((this.property==null && other.getProperty()==null) || 
             (this.property!=null &&
              java.util.Arrays.equals(this.property, other.getProperty())));
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
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getHost() != null) {
            _hashCode += getHost().hashCode();
        }
        if (getResourceSpec() != null) {
            _hashCode += getResourceSpec().hashCode();
        }
        if (getVmFolder() != null) {
            _hashCode += getVmFolder().hashCode();
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
        if (getProperty() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProperty());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProperty(), i);
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
        new org.apache.axis.description.TypeDesc(VAppCloneSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VAppCloneSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "host"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "resourceSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ResourceConfigSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmFolder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmFolder"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkMapping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "networkMapping"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VAppCloneSpecNetworkMappingPair"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("property");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "property"));
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
