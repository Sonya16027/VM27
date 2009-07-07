/**
 * HostNumaInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostNumaInfo  extends com.vmware.vim.DynamicData  implements java.io.Serializable {
    private java.lang.String type;

    private int numNodes;

    private com.vmware.vim.HostNumaNode[] numaNode;

    public HostNumaInfo() {
    }

    public HostNumaInfo(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           java.lang.String type,
           int numNodes,
           com.vmware.vim.HostNumaNode[] numaNode) {
        super(
            dynamicType,
            dynamicProperty);
        this.type = type;
        this.numNodes = numNodes;
        this.numaNode = numaNode;
    }


    /**
     * Gets the type value for this HostNumaInfo.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this HostNumaInfo.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the numNodes value for this HostNumaInfo.
     * 
     * @return numNodes
     */
    public int getNumNodes() {
        return numNodes;
    }


    /**
     * Sets the numNodes value for this HostNumaInfo.
     * 
     * @param numNodes
     */
    public void setNumNodes(int numNodes) {
        this.numNodes = numNodes;
    }


    /**
     * Gets the numaNode value for this HostNumaInfo.
     * 
     * @return numaNode
     */
    public com.vmware.vim.HostNumaNode[] getNumaNode() {
        return numaNode;
    }


    /**
     * Sets the numaNode value for this HostNumaInfo.
     * 
     * @param numaNode
     */
    public void setNumaNode(com.vmware.vim.HostNumaNode[] numaNode) {
        this.numaNode = numaNode;
    }

    public com.vmware.vim.HostNumaNode getNumaNode(int i) {
        return this.numaNode[i];
    }

    public void setNumaNode(int i, com.vmware.vim.HostNumaNode _value) {
        this.numaNode[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostNumaInfo)) return false;
        HostNumaInfo other = (HostNumaInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            this.numNodes == other.getNumNodes() &&
            ((this.numaNode==null && other.getNumaNode()==null) || 
             (this.numaNode!=null &&
              java.util.Arrays.equals(this.numaNode, other.getNumaNode())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        _hashCode += getNumNodes();
        if (getNumaNode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNumaNode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNumaNode(), i);
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
        new org.apache.axis.description.TypeDesc(HostNumaInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostNumaInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numNodes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "numNodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numaNode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "numaNode"));
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
