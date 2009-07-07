/**
 * ArrayOfHostDatastoreBrowserSearchResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ArrayOfHostDatastoreBrowserSearchResults  implements java.io.Serializable {
    private com.vmware.vim.HostDatastoreBrowserSearchResults[] hostDatastoreBrowserSearchResults;

    public ArrayOfHostDatastoreBrowserSearchResults() {
    }

    public ArrayOfHostDatastoreBrowserSearchResults(
           com.vmware.vim.HostDatastoreBrowserSearchResults[] hostDatastoreBrowserSearchResults) {
           this.hostDatastoreBrowserSearchResults = hostDatastoreBrowserSearchResults;
    }


    /**
     * Gets the hostDatastoreBrowserSearchResults value for this ArrayOfHostDatastoreBrowserSearchResults.
     * 
     * @return hostDatastoreBrowserSearchResults
     */
    public com.vmware.vim.HostDatastoreBrowserSearchResults[] getHostDatastoreBrowserSearchResults() {
        return hostDatastoreBrowserSearchResults;
    }


    /**
     * Sets the hostDatastoreBrowserSearchResults value for this ArrayOfHostDatastoreBrowserSearchResults.
     * 
     * @param hostDatastoreBrowserSearchResults
     */
    public void setHostDatastoreBrowserSearchResults(com.vmware.vim.HostDatastoreBrowserSearchResults[] hostDatastoreBrowserSearchResults) {
        this.hostDatastoreBrowserSearchResults = hostDatastoreBrowserSearchResults;
    }

    public com.vmware.vim.HostDatastoreBrowserSearchResults getHostDatastoreBrowserSearchResults(int i) {
        return this.hostDatastoreBrowserSearchResults[i];
    }

    public void setHostDatastoreBrowserSearchResults(int i, com.vmware.vim.HostDatastoreBrowserSearchResults _value) {
        this.hostDatastoreBrowserSearchResults[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostDatastoreBrowserSearchResults)) return false;
        ArrayOfHostDatastoreBrowserSearchResults other = (ArrayOfHostDatastoreBrowserSearchResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostDatastoreBrowserSearchResults==null && other.getHostDatastoreBrowserSearchResults()==null) || 
             (this.hostDatastoreBrowserSearchResults!=null &&
              java.util.Arrays.equals(this.hostDatastoreBrowserSearchResults, other.getHostDatastoreBrowserSearchResults())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getHostDatastoreBrowserSearchResults() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostDatastoreBrowserSearchResults());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostDatastoreBrowserSearchResults(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostDatastoreBrowserSearchResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ArrayOfHostDatastoreBrowserSearchResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostDatastoreBrowserSearchResults");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "HostDatastoreBrowserSearchResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostDatastoreBrowserSearchResults"));
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
