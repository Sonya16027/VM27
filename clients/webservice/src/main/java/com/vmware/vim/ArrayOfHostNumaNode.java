/**
 * ArrayOfHostNumaNode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ArrayOfHostNumaNode  implements java.io.Serializable {
    private com.vmware.vim.HostNumaNode[] hostNumaNode;

    public ArrayOfHostNumaNode() {
    }

    public ArrayOfHostNumaNode(
           com.vmware.vim.HostNumaNode[] hostNumaNode) {
           this.hostNumaNode = hostNumaNode;
    }


    /**
     * Gets the hostNumaNode value for this ArrayOfHostNumaNode.
     * 
     * @return hostNumaNode
     */
    public com.vmware.vim.HostNumaNode[] getHostNumaNode() {
        return hostNumaNode;
    }


    /**
     * Sets the hostNumaNode value for this ArrayOfHostNumaNode.
     * 
     * @param hostNumaNode
     */
    public void setHostNumaNode(com.vmware.vim.HostNumaNode[] hostNumaNode) {
        this.hostNumaNode = hostNumaNode;
    }

    public com.vmware.vim.HostNumaNode getHostNumaNode(int i) {
        return this.hostNumaNode[i];
    }

    public void setHostNumaNode(int i, com.vmware.vim.HostNumaNode _value) {
        this.hostNumaNode[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostNumaNode)) return false;
        ArrayOfHostNumaNode other = (ArrayOfHostNumaNode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostNumaNode==null && other.getHostNumaNode()==null) || 
             (this.hostNumaNode!=null &&
              java.util.Arrays.equals(this.hostNumaNode, other.getHostNumaNode())));
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
        if (getHostNumaNode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostNumaNode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostNumaNode(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostNumaNode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ArrayOfHostNumaNode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostNumaNode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "HostNumaNode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostNumaNode"));
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
