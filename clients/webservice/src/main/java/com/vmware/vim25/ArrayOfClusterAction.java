/**
 * ArrayOfClusterAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfClusterAction  implements java.io.Serializable {
    private com.vmware.vim25.ClusterAction[] clusterAction;

    public ArrayOfClusterAction() {
    }

    public ArrayOfClusterAction(
           com.vmware.vim25.ClusterAction[] clusterAction) {
           this.clusterAction = clusterAction;
    }


    /**
     * Gets the clusterAction value for this ArrayOfClusterAction.
     * 
     * @return clusterAction
     */
    public com.vmware.vim25.ClusterAction[] getClusterAction() {
        return clusterAction;
    }


    /**
     * Sets the clusterAction value for this ArrayOfClusterAction.
     * 
     * @param clusterAction
     */
    public void setClusterAction(com.vmware.vim25.ClusterAction[] clusterAction) {
        this.clusterAction = clusterAction;
    }

    public com.vmware.vim25.ClusterAction getClusterAction(int i) {
        return this.clusterAction[i];
    }

    public void setClusterAction(int i, com.vmware.vim25.ClusterAction _value) {
        this.clusterAction[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfClusterAction)) return false;
        ArrayOfClusterAction other = (ArrayOfClusterAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clusterAction==null && other.getClusterAction()==null) || 
             (this.clusterAction!=null &&
              java.util.Arrays.equals(this.clusterAction, other.getClusterAction())));
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
        if (getClusterAction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClusterAction());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClusterAction(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfClusterAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfClusterAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterAction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ClusterAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterAction"));
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
