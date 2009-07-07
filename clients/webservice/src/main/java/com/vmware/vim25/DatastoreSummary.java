/**
 * DatastoreSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class DatastoreSummary  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private com.vmware.vim25.ManagedObjectReference datastore;

    private java.lang.String name;

    private java.lang.String url;

    private long capacity;

    private long freeSpace;

    private java.lang.Long uncommitted;

    private boolean accessible;

    private java.lang.Boolean multipleHostAccess;

    private java.lang.String type;

    public DatastoreSummary() {
    }

    public DatastoreSummary(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.ManagedObjectReference datastore,
           java.lang.String name,
           java.lang.String url,
           long capacity,
           long freeSpace,
           java.lang.Long uncommitted,
           boolean accessible,
           java.lang.Boolean multipleHostAccess,
           java.lang.String type) {
        super(
            dynamicType,
            dynamicProperty);
        this.datastore = datastore;
        this.name = name;
        this.url = url;
        this.capacity = capacity;
        this.freeSpace = freeSpace;
        this.uncommitted = uncommitted;
        this.accessible = accessible;
        this.multipleHostAccess = multipleHostAccess;
        this.type = type;
    }


    /**
     * Gets the datastore value for this DatastoreSummary.
     * 
     * @return datastore
     */
    public com.vmware.vim25.ManagedObjectReference getDatastore() {
        return datastore;
    }


    /**
     * Sets the datastore value for this DatastoreSummary.
     * 
     * @param datastore
     */
    public void setDatastore(com.vmware.vim25.ManagedObjectReference datastore) {
        this.datastore = datastore;
    }


    /**
     * Gets the name value for this DatastoreSummary.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DatastoreSummary.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the url value for this DatastoreSummary.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this DatastoreSummary.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the capacity value for this DatastoreSummary.
     * 
     * @return capacity
     */
    public long getCapacity() {
        return capacity;
    }


    /**
     * Sets the capacity value for this DatastoreSummary.
     * 
     * @param capacity
     */
    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }


    /**
     * Gets the freeSpace value for this DatastoreSummary.
     * 
     * @return freeSpace
     */
    public long getFreeSpace() {
        return freeSpace;
    }


    /**
     * Sets the freeSpace value for this DatastoreSummary.
     * 
     * @param freeSpace
     */
    public void setFreeSpace(long freeSpace) {
        this.freeSpace = freeSpace;
    }


    /**
     * Gets the uncommitted value for this DatastoreSummary.
     * 
     * @return uncommitted
     */
    public java.lang.Long getUncommitted() {
        return uncommitted;
    }


    /**
     * Sets the uncommitted value for this DatastoreSummary.
     * 
     * @param uncommitted
     */
    public void setUncommitted(java.lang.Long uncommitted) {
        this.uncommitted = uncommitted;
    }


    /**
     * Gets the accessible value for this DatastoreSummary.
     * 
     * @return accessible
     */
    public boolean isAccessible() {
        return accessible;
    }


    /**
     * Sets the accessible value for this DatastoreSummary.
     * 
     * @param accessible
     */
    public void setAccessible(boolean accessible) {
        this.accessible = accessible;
    }


    /**
     * Gets the multipleHostAccess value for this DatastoreSummary.
     * 
     * @return multipleHostAccess
     */
    public java.lang.Boolean getMultipleHostAccess() {
        return multipleHostAccess;
    }


    /**
     * Sets the multipleHostAccess value for this DatastoreSummary.
     * 
     * @param multipleHostAccess
     */
    public void setMultipleHostAccess(java.lang.Boolean multipleHostAccess) {
        this.multipleHostAccess = multipleHostAccess;
    }


    /**
     * Gets the type value for this DatastoreSummary.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this DatastoreSummary.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatastoreSummary)) return false;
        DatastoreSummary other = (DatastoreSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.datastore==null && other.getDatastore()==null) || 
             (this.datastore!=null &&
              this.datastore.equals(other.getDatastore()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            this.capacity == other.getCapacity() &&
            this.freeSpace == other.getFreeSpace() &&
            ((this.uncommitted==null && other.getUncommitted()==null) || 
             (this.uncommitted!=null &&
              this.uncommitted.equals(other.getUncommitted()))) &&
            this.accessible == other.isAccessible() &&
            ((this.multipleHostAccess==null && other.getMultipleHostAccess()==null) || 
             (this.multipleHostAccess!=null &&
              this.multipleHostAccess.equals(other.getMultipleHostAccess()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getDatastore() != null) {
            _hashCode += getDatastore().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        _hashCode += new Long(getCapacity()).hashCode();
        _hashCode += new Long(getFreeSpace()).hashCode();
        if (getUncommitted() != null) {
            _hashCode += getUncommitted().hashCode();
        }
        _hashCode += (isAccessible() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMultipleHostAccess() != null) {
            _hashCode += getMultipleHostAccess().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DatastoreSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DatastoreSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datastore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "datastore"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capacity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "capacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeSpace");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "freeSpace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uncommitted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "uncommitted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessible");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "accessible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multipleHostAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "multipleHostAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "type"));
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
