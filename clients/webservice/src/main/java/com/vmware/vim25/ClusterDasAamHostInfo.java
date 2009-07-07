/**
 * ClusterDasAamHostInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ClusterDasAamHostInfo  extends com.vmware.vim25.ClusterDasHostInfo  implements java.io.Serializable {
    private com.vmware.vim25.ClusterDasAamNodeState[] hostDasState;

    private java.lang.String[] primaryHosts;

    public ClusterDasAamHostInfo() {
    }

    public ClusterDasAamHostInfo(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.ClusterDasAamNodeState[] hostDasState,
           java.lang.String[] primaryHosts) {
        super(
            dynamicType,
            dynamicProperty);
        this.hostDasState = hostDasState;
        this.primaryHosts = primaryHosts;
    }


    /**
     * Gets the hostDasState value for this ClusterDasAamHostInfo.
     * 
     * @return hostDasState
     */
    public com.vmware.vim25.ClusterDasAamNodeState[] getHostDasState() {
        return hostDasState;
    }


    /**
     * Sets the hostDasState value for this ClusterDasAamHostInfo.
     * 
     * @param hostDasState
     */
    public void setHostDasState(com.vmware.vim25.ClusterDasAamNodeState[] hostDasState) {
        this.hostDasState = hostDasState;
    }

    public com.vmware.vim25.ClusterDasAamNodeState getHostDasState(int i) {
        return this.hostDasState[i];
    }

    public void setHostDasState(int i, com.vmware.vim25.ClusterDasAamNodeState _value) {
        this.hostDasState[i] = _value;
    }


    /**
     * Gets the primaryHosts value for this ClusterDasAamHostInfo.
     * 
     * @return primaryHosts
     */
    public java.lang.String[] getPrimaryHosts() {
        return primaryHosts;
    }


    /**
     * Sets the primaryHosts value for this ClusterDasAamHostInfo.
     * 
     * @param primaryHosts
     */
    public void setPrimaryHosts(java.lang.String[] primaryHosts) {
        this.primaryHosts = primaryHosts;
    }

    public java.lang.String getPrimaryHosts(int i) {
        return this.primaryHosts[i];
    }

    public void setPrimaryHosts(int i, java.lang.String _value) {
        this.primaryHosts[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClusterDasAamHostInfo)) return false;
        ClusterDasAamHostInfo other = (ClusterDasAamHostInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.hostDasState==null && other.getHostDasState()==null) || 
             (this.hostDasState!=null &&
              java.util.Arrays.equals(this.hostDasState, other.getHostDasState()))) &&
            ((this.primaryHosts==null && other.getPrimaryHosts()==null) || 
             (this.primaryHosts!=null &&
              java.util.Arrays.equals(this.primaryHosts, other.getPrimaryHosts())));
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
        if (getHostDasState() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostDasState());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostDasState(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPrimaryHosts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrimaryHosts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrimaryHosts(), i);
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
        new org.apache.axis.description.TypeDesc(ClusterDasAamHostInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDasAamHostInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostDasState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostDasState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDasAamNodeState"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryHosts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "primaryHosts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
