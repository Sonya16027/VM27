/**
 * QuerySpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim.sms;

public class QuerySpec  extends com.vmware.vim.sms.DynamicData  implements java.io.Serializable {
    private int maxCount;

    private int offset;

    private com.vmware.vim.sms.FilterSpec filterSpec;

    private com.vmware.vim.sms.SortSpec[] sortSpec;

    public QuerySpec() {
    }

    public QuerySpec(
           java.lang.String dynamicType,
           com.vmware.vim.sms.DynamicProperty[] dynamicProperty,
           int maxCount,
           int offset,
           com.vmware.vim.sms.FilterSpec filterSpec,
           com.vmware.vim.sms.SortSpec[] sortSpec) {
        super(
            dynamicType,
            dynamicProperty);
        this.maxCount = maxCount;
        this.offset = offset;
        this.filterSpec = filterSpec;
        this.sortSpec = sortSpec;
    }


    /**
     * Gets the maxCount value for this QuerySpec.
     * 
     * @return maxCount
     */
    public int getMaxCount() {
        return maxCount;
    }


    /**
     * Sets the maxCount value for this QuerySpec.
     * 
     * @param maxCount
     */
    public void setMaxCount(int maxCount) {
        this.maxCount = maxCount;
    }


    /**
     * Gets the offset value for this QuerySpec.
     * 
     * @return offset
     */
    public int getOffset() {
        return offset;
    }


    /**
     * Sets the offset value for this QuerySpec.
     * 
     * @param offset
     */
    public void setOffset(int offset) {
        this.offset = offset;
    }


    /**
     * Gets the filterSpec value for this QuerySpec.
     * 
     * @return filterSpec
     */
    public com.vmware.vim.sms.FilterSpec getFilterSpec() {
        return filterSpec;
    }


    /**
     * Sets the filterSpec value for this QuerySpec.
     * 
     * @param filterSpec
     */
    public void setFilterSpec(com.vmware.vim.sms.FilterSpec filterSpec) {
        this.filterSpec = filterSpec;
    }


    /**
     * Gets the sortSpec value for this QuerySpec.
     * 
     * @return sortSpec
     */
    public com.vmware.vim.sms.SortSpec[] getSortSpec() {
        return sortSpec;
    }


    /**
     * Sets the sortSpec value for this QuerySpec.
     * 
     * @param sortSpec
     */
    public void setSortSpec(com.vmware.vim.sms.SortSpec[] sortSpec) {
        this.sortSpec = sortSpec;
    }

    public com.vmware.vim.sms.SortSpec getSortSpec(int i) {
        return this.sortSpec[i];
    }

    public void setSortSpec(int i, com.vmware.vim.sms.SortSpec _value) {
        this.sortSpec[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuerySpec)) return false;
        QuerySpec other = (QuerySpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.maxCount == other.getMaxCount() &&
            this.offset == other.getOffset() &&
            ((this.filterSpec==null && other.getFilterSpec()==null) || 
             (this.filterSpec!=null &&
              this.filterSpec.equals(other.getFilterSpec()))) &&
            ((this.sortSpec==null && other.getSortSpec()==null) || 
             (this.sortSpec!=null &&
              java.util.Arrays.equals(this.sortSpec, other.getSortSpec())));
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
        _hashCode += getMaxCount();
        _hashCode += getOffset();
        if (getFilterSpec() != null) {
            _hashCode += getFilterSpec().hashCode();
        }
        if (getSortSpec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSortSpec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSortSpec(), i);
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
        new org.apache.axis.description.TypeDesc(QuerySpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sm1", "QuerySpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1", "maxCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offset");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1", "offset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1", "filterSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sm1", "FilterSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1", "sortSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sm1", "SortSpec"));
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
