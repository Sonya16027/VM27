/**
 * AlarmDescription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class AlarmDescription  extends com.vmware.vim.DynamicData  implements java.io.Serializable {
    private com.vmware.vim.TypeDescription[] expr;

    private com.vmware.vim.ElementDescription[] stateOperator;

    private com.vmware.vim.ElementDescription[] metricOperator;

    private com.vmware.vim.ElementDescription[] hostSystemConnectionState;

    private com.vmware.vim.ElementDescription[] virtualMachinePowerState;

    private com.vmware.vim.ElementDescription[] entityStatus;

    private com.vmware.vim.TypeDescription[] action;

    public AlarmDescription() {
    }

    public AlarmDescription(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           com.vmware.vim.TypeDescription[] expr,
           com.vmware.vim.ElementDescription[] stateOperator,
           com.vmware.vim.ElementDescription[] metricOperator,
           com.vmware.vim.ElementDescription[] hostSystemConnectionState,
           com.vmware.vim.ElementDescription[] virtualMachinePowerState,
           com.vmware.vim.ElementDescription[] entityStatus,
           com.vmware.vim.TypeDescription[] action) {
        super(
            dynamicType,
            dynamicProperty);
        this.expr = expr;
        this.stateOperator = stateOperator;
        this.metricOperator = metricOperator;
        this.hostSystemConnectionState = hostSystemConnectionState;
        this.virtualMachinePowerState = virtualMachinePowerState;
        this.entityStatus = entityStatus;
        this.action = action;
    }


    /**
     * Gets the expr value for this AlarmDescription.
     * 
     * @return expr
     */
    public com.vmware.vim.TypeDescription[] getExpr() {
        return expr;
    }


    /**
     * Sets the expr value for this AlarmDescription.
     * 
     * @param expr
     */
    public void setExpr(com.vmware.vim.TypeDescription[] expr) {
        this.expr = expr;
    }

    public com.vmware.vim.TypeDescription getExpr(int i) {
        return this.expr[i];
    }

    public void setExpr(int i, com.vmware.vim.TypeDescription _value) {
        this.expr[i] = _value;
    }


    /**
     * Gets the stateOperator value for this AlarmDescription.
     * 
     * @return stateOperator
     */
    public com.vmware.vim.ElementDescription[] getStateOperator() {
        return stateOperator;
    }


    /**
     * Sets the stateOperator value for this AlarmDescription.
     * 
     * @param stateOperator
     */
    public void setStateOperator(com.vmware.vim.ElementDescription[] stateOperator) {
        this.stateOperator = stateOperator;
    }

    public com.vmware.vim.ElementDescription getStateOperator(int i) {
        return this.stateOperator[i];
    }

    public void setStateOperator(int i, com.vmware.vim.ElementDescription _value) {
        this.stateOperator[i] = _value;
    }


    /**
     * Gets the metricOperator value for this AlarmDescription.
     * 
     * @return metricOperator
     */
    public com.vmware.vim.ElementDescription[] getMetricOperator() {
        return metricOperator;
    }


    /**
     * Sets the metricOperator value for this AlarmDescription.
     * 
     * @param metricOperator
     */
    public void setMetricOperator(com.vmware.vim.ElementDescription[] metricOperator) {
        this.metricOperator = metricOperator;
    }

    public com.vmware.vim.ElementDescription getMetricOperator(int i) {
        return this.metricOperator[i];
    }

    public void setMetricOperator(int i, com.vmware.vim.ElementDescription _value) {
        this.metricOperator[i] = _value;
    }


    /**
     * Gets the hostSystemConnectionState value for this AlarmDescription.
     * 
     * @return hostSystemConnectionState
     */
    public com.vmware.vim.ElementDescription[] getHostSystemConnectionState() {
        return hostSystemConnectionState;
    }


    /**
     * Sets the hostSystemConnectionState value for this AlarmDescription.
     * 
     * @param hostSystemConnectionState
     */
    public void setHostSystemConnectionState(com.vmware.vim.ElementDescription[] hostSystemConnectionState) {
        this.hostSystemConnectionState = hostSystemConnectionState;
    }

    public com.vmware.vim.ElementDescription getHostSystemConnectionState(int i) {
        return this.hostSystemConnectionState[i];
    }

    public void setHostSystemConnectionState(int i, com.vmware.vim.ElementDescription _value) {
        this.hostSystemConnectionState[i] = _value;
    }


    /**
     * Gets the virtualMachinePowerState value for this AlarmDescription.
     * 
     * @return virtualMachinePowerState
     */
    public com.vmware.vim.ElementDescription[] getVirtualMachinePowerState() {
        return virtualMachinePowerState;
    }


    /**
     * Sets the virtualMachinePowerState value for this AlarmDescription.
     * 
     * @param virtualMachinePowerState
     */
    public void setVirtualMachinePowerState(com.vmware.vim.ElementDescription[] virtualMachinePowerState) {
        this.virtualMachinePowerState = virtualMachinePowerState;
    }

    public com.vmware.vim.ElementDescription getVirtualMachinePowerState(int i) {
        return this.virtualMachinePowerState[i];
    }

    public void setVirtualMachinePowerState(int i, com.vmware.vim.ElementDescription _value) {
        this.virtualMachinePowerState[i] = _value;
    }


    /**
     * Gets the entityStatus value for this AlarmDescription.
     * 
     * @return entityStatus
     */
    public com.vmware.vim.ElementDescription[] getEntityStatus() {
        return entityStatus;
    }


    /**
     * Sets the entityStatus value for this AlarmDescription.
     * 
     * @param entityStatus
     */
    public void setEntityStatus(com.vmware.vim.ElementDescription[] entityStatus) {
        this.entityStatus = entityStatus;
    }

    public com.vmware.vim.ElementDescription getEntityStatus(int i) {
        return this.entityStatus[i];
    }

    public void setEntityStatus(int i, com.vmware.vim.ElementDescription _value) {
        this.entityStatus[i] = _value;
    }


    /**
     * Gets the action value for this AlarmDescription.
     * 
     * @return action
     */
    public com.vmware.vim.TypeDescription[] getAction() {
        return action;
    }


    /**
     * Sets the action value for this AlarmDescription.
     * 
     * @param action
     */
    public void setAction(com.vmware.vim.TypeDescription[] action) {
        this.action = action;
    }

    public com.vmware.vim.TypeDescription getAction(int i) {
        return this.action[i];
    }

    public void setAction(int i, com.vmware.vim.TypeDescription _value) {
        this.action[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlarmDescription)) return false;
        AlarmDescription other = (AlarmDescription) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.expr==null && other.getExpr()==null) || 
             (this.expr!=null &&
              java.util.Arrays.equals(this.expr, other.getExpr()))) &&
            ((this.stateOperator==null && other.getStateOperator()==null) || 
             (this.stateOperator!=null &&
              java.util.Arrays.equals(this.stateOperator, other.getStateOperator()))) &&
            ((this.metricOperator==null && other.getMetricOperator()==null) || 
             (this.metricOperator!=null &&
              java.util.Arrays.equals(this.metricOperator, other.getMetricOperator()))) &&
            ((this.hostSystemConnectionState==null && other.getHostSystemConnectionState()==null) || 
             (this.hostSystemConnectionState!=null &&
              java.util.Arrays.equals(this.hostSystemConnectionState, other.getHostSystemConnectionState()))) &&
            ((this.virtualMachinePowerState==null && other.getVirtualMachinePowerState()==null) || 
             (this.virtualMachinePowerState!=null &&
              java.util.Arrays.equals(this.virtualMachinePowerState, other.getVirtualMachinePowerState()))) &&
            ((this.entityStatus==null && other.getEntityStatus()==null) || 
             (this.entityStatus!=null &&
              java.util.Arrays.equals(this.entityStatus, other.getEntityStatus()))) &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              java.util.Arrays.equals(this.action, other.getAction())));
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
        if (getExpr() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExpr());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExpr(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStateOperator() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStateOperator());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStateOperator(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMetricOperator() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMetricOperator());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMetricOperator(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHostSystemConnectionState() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostSystemConnectionState());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostSystemConnectionState(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVirtualMachinePowerState() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVirtualMachinePowerState());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVirtualMachinePowerState(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEntityStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntityStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntityStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAction());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAction(), i);
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
        new org.apache.axis.description.TypeDesc(AlarmDescription.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "AlarmDescription"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expr");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "expr"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "TypeDescription"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateOperator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "stateOperator"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ElementDescription"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metricOperator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "metricOperator"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ElementDescription"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostSystemConnectionState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "hostSystemConnectionState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ElementDescription"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualMachinePowerState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "virtualMachinePowerState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ElementDescription"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "entityStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ElementDescription"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "TypeDescription"));
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
