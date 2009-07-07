/**
 * DiagnosticManagerLogHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class DiagnosticManagerLogHeader  extends com.vmware.vim.DynamicData  implements java.io.Serializable {
    private int lineStart;

    private int lineEnd;

    private java.lang.String[] lineText;

    public DiagnosticManagerLogHeader() {
    }

    public DiagnosticManagerLogHeader(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           int lineStart,
           int lineEnd,
           java.lang.String[] lineText) {
        super(
            dynamicType,
            dynamicProperty);
        this.lineStart = lineStart;
        this.lineEnd = lineEnd;
        this.lineText = lineText;
    }


    /**
     * Gets the lineStart value for this DiagnosticManagerLogHeader.
     * 
     * @return lineStart
     */
    public int getLineStart() {
        return lineStart;
    }


    /**
     * Sets the lineStart value for this DiagnosticManagerLogHeader.
     * 
     * @param lineStart
     */
    public void setLineStart(int lineStart) {
        this.lineStart = lineStart;
    }


    /**
     * Gets the lineEnd value for this DiagnosticManagerLogHeader.
     * 
     * @return lineEnd
     */
    public int getLineEnd() {
        return lineEnd;
    }


    /**
     * Sets the lineEnd value for this DiagnosticManagerLogHeader.
     * 
     * @param lineEnd
     */
    public void setLineEnd(int lineEnd) {
        this.lineEnd = lineEnd;
    }


    /**
     * Gets the lineText value for this DiagnosticManagerLogHeader.
     * 
     * @return lineText
     */
    public java.lang.String[] getLineText() {
        return lineText;
    }


    /**
     * Sets the lineText value for this DiagnosticManagerLogHeader.
     * 
     * @param lineText
     */
    public void setLineText(java.lang.String[] lineText) {
        this.lineText = lineText;
    }

    public java.lang.String getLineText(int i) {
        return this.lineText[i];
    }

    public void setLineText(int i, java.lang.String _value) {
        this.lineText[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DiagnosticManagerLogHeader)) return false;
        DiagnosticManagerLogHeader other = (DiagnosticManagerLogHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.lineStart == other.getLineStart() &&
            this.lineEnd == other.getLineEnd() &&
            ((this.lineText==null && other.getLineText()==null) || 
             (this.lineText!=null &&
              java.util.Arrays.equals(this.lineText, other.getLineText())));
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
        _hashCode += getLineStart();
        _hashCode += getLineEnd();
        if (getLineText() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLineText());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLineText(), i);
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
        new org.apache.axis.description.TypeDesc(DiagnosticManagerLogHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "DiagnosticManagerLogHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineStart");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "lineStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "lineEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineText");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "lineText"));
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
