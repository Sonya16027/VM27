/**
 * SmBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim.sms;

public class SmBindingStub extends org.apache.axis.client.Stub implements com.vmware.vim.sms.SmPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[11];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DestroyPropertyFilter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sm1", "_this"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sm1", "ManagedObjectReference"), com.vmware.vim.sms.ManagedObjectReference.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sm1", "RuntimeFaultFault"),
                      "com.vmware.vim.sms.RuntimeFault",
                      new javax.xml.namespace.QName("urn:sm1", "RuntimeFault"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateFilter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sm1", "_this"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sm1", "ManagedObjectReference"), com.vmware.vim.sms.ManagedObjectReference.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sm1", "spec"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sm1", "PropertyFilterSpec"), com.vmware.vim.sms.PropertyFilterSpec.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sm1", "partialUpdates"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:sm1", "ManagedObjectReference"));
        oper.setReturnClass(com.vmware.vim.sms.ManagedObjectReference.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sm1", "returnval"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sm1", "InvalidPropertyFault"),
                      "com.vmware.vim.sms.InvalidProperty",
                      new javax.xml.namespace.QName("urn:sm1", "InvalidProperty"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sm1", "RuntimeFaultFault"),
                      "com.vmware.vim.sms.RuntimeFault",
                      new javax.xml.namespace.QName("urn:sm1", "RuntimeFault"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RetrieveProperties");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sm1", "_this"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sm1", "ManagedObjectReference"), com.vmware.vim.sms.ManagedObjectReference.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sm1", "specSet"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sm1", "PropertyFilterSpec"), com.vmware.vim.sms.PropertyFilterSpec[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:sm1", "ObjectContent"));
        oper.setReturnClass(com.vmware.vim.sms.ObjectContent[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sm1", "returnval"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sm1", "InvalidPropertyFault"),
                      "com.vmware.vim.sms.InvalidProperty",
                      new javax.xml.namespace.QName("urn:sm1", "InvalidProperty"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sm1", "RuntimeFaultFault"),
                      "com.vmware.vim.sms.RuntimeFault",
                      new javax.xml.namespace.QName("urn:sm1", "RuntimeFault"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CheckForUpdates");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sm1", "_this"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sm1", "ManagedObjectReference"), com.vmware.vim.sms.ManagedObjectReference.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sm1", "version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:sm1", "UpdateSet"));
        oper.setReturnClass(com.vmware.vim.sms.UpdateSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sm1", "returnval"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sm1", "InvalidCollectorVersionFault"),
                      "com.vmware.vim.sms.InvalidCollectorVersion",
                      new javax.xml.namespace.QName("urn:sm1", "InvalidCollectorVersion"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sm1", "RuntimeFaultFault"),
                      "com.vmware.vim.sms.RuntimeFault",
                      new javax.xml.namespace.QName("urn:sm1", "RuntimeFault"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WaitForUpdates");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sm1", "_this"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sm1", "ManagedObjectReference"), com.vmware.vim.sms.ManagedObjectReference.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sm1", "version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:sm1", "UpdateSet"));
        oper.setReturnClass(com.vmware.vim.sms.UpdateSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sm1", "returnval"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sm1", "InvalidCollectorVersionFault"),
                      "com.vmware.vim.sms.InvalidCollectorVersion",
                      new javax.xml.namespace.QName("urn:sm1", "InvalidCollectorVersion"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sm1", "RuntimeFaultFault"),
                      "com.vmware.vim.sms.RuntimeFault",
                      new javax.xml.namespace.QName("urn:sm1", "RuntimeFault"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CancelWaitForUpdates");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sm1", "_this"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sm1", "ManagedObjectReference"), com.vmware.vim.sms.ManagedObjectReference.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sm1", "RuntimeFaultFault"),
                      "com.vmware.vim.sms.RuntimeFault",
                      new javax.xml.namespace.QName("urn:sm1", "RuntimeFault"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sm1", "_this"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sm1", "ManagedObjectReference"), com.vmware.vim.sms.ManagedObjectReference.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sm1", "contextEntity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sm1", "EntityReference"), com.vmware.vim.sms.EntityReference.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sm1", "queryEntityType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sm1", "EntityReferenceEntityType"), com.vmware.vim.sms.EntityReferenceEntityType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sm1", "querySpec"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sm1", "QuerySpec"), com.vmware.vim.sms.QuerySpec.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:sm1", "QueryResult"));
        oper.setReturnClass(com.vmware.vim.sms.QueryResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sm1", "returnval"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sm1", "AuthenticationFailedFault"),
                      "com.vmware.vim.sms.AuthenticationFailed",
                      new javax.xml.namespace.QName("urn:sm1", "AuthenticationFailed"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sm1", "ServiceNotInitializedFault"),
                      "com.vmware.vim.sms.ServiceNotInitialized",
                      new javax.xml.namespace.QName("urn:sm1", "ServiceNotInitialized"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sm1", "QueryExecutionFailedFault"),
                      "com.vmware.vim.sms.QueryExecutionFailed",
                      new javax.xml.namespace.QName("urn:sm1", "QueryExecutionFailed"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sm1", "EntityNotFoundFault"),
                      "com.vmware.vim.sms.EntityNotFound",
                      new javax.xml.namespace.QName("urn:sm1", "EntityNotFound"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sm1", "RuntimeFaultFault"),
                      "com.vmware.vim.sms.RuntimeFault",
                      new javax.xml.namespace.QName("urn:sm1", "RuntimeFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sm1", "InvalidArgumentFault"),
                      "com.vmware.vim.sms.InvalidArgument",
                      new javax.xml.namespace.QName("urn:sm1", "InvalidArgument"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryTopology");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sm1", "_this"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sm1", "ManagedObjectReference"), com.vmware.vim.sms.ManagedObjectReference.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sm1", "entity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sm1", "EntityReference"), com.vmware.vim.sms.EntityReference.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:sm1", "Map"));
        oper.setReturnClass(com.vmware.vim.sms.Map.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sm1", "returnval"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sm1", "AuthenticationFailedFault"),
                      "com.vmware.vim.sms.AuthenticationFailed",
                      new javax.xml.namespace.QName("urn:sm1", "AuthenticationFailed"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sm1", "ServiceNotInitializedFault"),
                      "com.vmware.vim.sms.ServiceNotInitialized",
                      new javax.xml.namespace.QName("urn:sm1", "ServiceNotInitialized"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sm1", "QueryExecutionFailedFault"),
                      "com.vmware.vim.sms.QueryExecutionFailed",
                      new javax.xml.namespace.QName("urn:sm1", "QueryExecutionFailed"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sm1", "EntityNotFoundFault"),
                      "com.vmware.vim.sms.EntityNotFound",
                      new javax.xml.namespace.QName("urn:sm1", "EntityNotFound"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sm1", "RuntimeFaultFault"),
                      "com.vmware.vim.sms.RuntimeFault",
                      new javax.xml.namespace.QName("urn:sm1", "RuntimeFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sm1", "InvalidArgumentFault"),
                      "com.vmware.vim.sms.InvalidArgument",
                      new javax.xml.namespace.QName("urn:sm1", "InvalidArgument"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Sync");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sm1", "_this"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sm1", "ManagedObjectReference"), com.vmware.vim.sms.ManagedObjectReference.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sm1", "AuthenticationFailedFault"),
                      "com.vmware.vim.sms.AuthenticationFailed",
                      new javax.xml.namespace.QName("urn:sm1", "AuthenticationFailed"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sm1", "ServiceNotInitializedFault"),
                      "com.vmware.vim.sms.ServiceNotInitialized",
                      new javax.xml.namespace.QName("urn:sm1", "ServiceNotInitialized"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sm1", "RuntimeFaultFault"),
                      "com.vmware.vim.sms.RuntimeFault",
                      new javax.xml.namespace.QName("urn:sm1", "RuntimeFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sm1", "ProviderSyncFailedFault"),
                      "com.vmware.vim.sms.ProviderSyncFailed",
                      new javax.xml.namespace.QName("urn:sm1", "ProviderSyncFailed"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ConfigureSyncInterval");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sm1", "_this"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sm1", "ManagedObjectReference"), com.vmware.vim.sms.ManagedObjectReference.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sm1", "interval"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sm1", "AuthenticationFailedFault"),
                      "com.vmware.vim.sms.AuthenticationFailed",
                      new javax.xml.namespace.QName("urn:sm1", "AuthenticationFailed"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sm1", "ServiceNotInitializedFault"),
                      "com.vmware.vim.sms.ServiceNotInitialized",
                      new javax.xml.namespace.QName("urn:sm1", "ServiceNotInitialized"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sm1", "RuntimeFaultFault"),
                      "com.vmware.vim.sms.RuntimeFault",
                      new javax.xml.namespace.QName("urn:sm1", "RuntimeFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sm1", "InvalidArgumentFault"),
                      "com.vmware.vim.sms.InvalidArgument",
                      new javax.xml.namespace.QName("urn:sm1", "InvalidArgument"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateVcDbConnectionInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sm1", "_this"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sm1", "ManagedObjectReference"), com.vmware.vim.sms.ManagedObjectReference.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sm1", "dbConnectionSpec"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sm1", "DbConnectionSpec"), com.vmware.vim.sms.DbConnectionSpec.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sm1", "ServiceInitializationFailedFault"),
                      "com.vmware.vim.sms.ServiceInitializationFailed",
                      new javax.xml.namespace.QName("urn:sm1", "ServiceInitializationFailed"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sm1", "AuthenticationFailedFault"),
                      "com.vmware.vim.sms.AuthenticationFailed",
                      new javax.xml.namespace.QName("urn:sm1", "AuthenticationFailed"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sm1", "RuntimeFaultFault"),
                      "com.vmware.vim.sms.RuntimeFault",
                      new javax.xml.namespace.QName("urn:sm1", "RuntimeFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:sm1", "InvalidArgumentFault"),
                      "com.vmware.vim.sms.InvalidArgument",
                      new javax.xml.namespace.QName("urn:sm1", "InvalidArgument"), 
                      true
                     ));
        _operations[10] = oper;

    }

    public SmBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public SmBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public SmBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:sm1", ">CancelWaitForUpdatesResponse");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.CancelWaitForUpdatesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", ">CheckForUpdatesResponse");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.CheckForUpdatesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", ">ConfigureSyncIntervalResponse");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.ConfigureSyncIntervalResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", ">CreateFilterResponse");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.CreateFilterResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", ">DestroyPropertyFilterResponse");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.DestroyPropertyFilterResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", ">QueryListResponse");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.QueryListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", ">QueryTopologyResponse");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.QueryTopologyResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", ">RetrievePropertiesResponse");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.RetrievePropertiesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", ">SyncResponse");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.SyncResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", ">UpdateVcDbConnectionInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.UpdateVcDbConnectionInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", ">WaitForUpdatesResponse");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.WaitForUpdatesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "ArrayOfAnyType");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.ArrayOfAnyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "ArrayOfDynamicProperty");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.ArrayOfDynamicProperty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "ArrayOfEdge");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.ArrayOfEdge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "ArrayOfFilterSpecConstraint");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.ArrayOfFilterSpecConstraint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "ArrayOfManagedObjectReference");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.ArrayOfManagedObjectReference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "ArrayOfMissingObject");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.ArrayOfMissingObject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "ArrayOfMissingProperty");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.ArrayOfMissingProperty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "ArrayOfNode");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.ArrayOfNode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "ArrayOfNodeProperty");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.ArrayOfNodeProperty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "ArrayOfObjectContent");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.ArrayOfObjectContent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "ArrayOfObjectSpec");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.ArrayOfObjectSpec.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "ArrayOfObjectUpdate");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.ArrayOfObjectUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "ArrayOfPropertyChange");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.ArrayOfPropertyChange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "ArrayOfPropertyFilterSpec");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.ArrayOfPropertyFilterSpec.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "ArrayOfPropertyFilterUpdate");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.ArrayOfPropertyFilterUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "ArrayOfPropertySpec");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.ArrayOfPropertySpec.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "ArrayOfRowData");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.ArrayOfRowData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "ArrayOfSelectionSpec");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.ArrayOfSelectionSpec.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "ArrayOfSortSpec");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.ArrayOfSortSpec.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.ArrayOfString.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "AuthConnectionFailed");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.AuthConnectionFailed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "AuthenticationFailed");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.AuthenticationFailed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "AuthHeader");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.AuthHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "CancelWaitForUpdatesRequestType");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.CancelWaitForUpdatesRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "CheckForUpdatesRequestType");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.CheckForUpdatesRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "ConfigureSyncIntervalRequestType");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.ConfigureSyncIntervalRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "CreateFilterRequestType");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.CreateFilterRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "DbConfigFailed");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.DbConfigFailed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "DbConnectionSpec");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.DbConnectionSpec.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "DestroyPropertyFilterRequestType");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.DestroyPropertyFilterRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "DynamicArray");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.DynamicArray.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "DynamicData");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.DynamicData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "DynamicProperty");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.DynamicProperty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "Edge");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.Edge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "EdgeStatus");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.EdgeStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:sm1", "EntityNotFound");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.EntityNotFound.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "EntityReference");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.EntityReference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "EntityReferenceEntityType");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.EntityReferenceEntityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:sm1", "FilterSpec");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.FilterSpec.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "FilterSpecComparisonOperator");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.FilterSpecComparisonOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:sm1", "FilterSpecConstraint");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.FilterSpecConstraint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "FilterSpecLogicalOperator");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.FilterSpecLogicalOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:sm1", "HostCommunication");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.HostCommunication.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "HostNotConnected");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.HostNotConnected.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "HostNotReachable");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.HostNotReachable.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "InvalidArgument");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.InvalidArgument.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "InvalidCollectorVersion");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.InvalidCollectorVersion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "InvalidEntity");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.InvalidEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "InvalidEntityType");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.InvalidEntityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "InvalidFilterSpec");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.InvalidFilterSpec.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "InvalidListQuery");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.InvalidListQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "InvalidProperty");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.InvalidProperty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "InvalidQuerySpec");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.InvalidQuerySpec.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "InvalidRequest");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.InvalidRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "InvalidSession");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.InvalidSession.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "InvalidSortSpec");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.InvalidSortSpec.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "InvalidSyncInterval");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.InvalidSyncInterval.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "InvalidTopologyQuery");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.InvalidTopologyQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "InvalidType");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.InvalidType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "LocalizedMethodFault");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.LocalizedMethodFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "ManagedObjectNotFound");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.ManagedObjectNotFound.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "ManagedObjectReference");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.ManagedObjectReference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:sm1", "Map");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.Map.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "Metadata");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.Metadata.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "MethodFault");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.MethodFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "MethodNotFound");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.MethodNotFound.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "MissingObject");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.MissingObject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "MissingProperty");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.MissingProperty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "MultipleSortSpecsNotSupported");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.MultipleSortSpecsNotSupported.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "Node");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.Node.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "NodeProperty");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.NodeProperty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "NodeStatus");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.NodeStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:sm1", "NoPermission");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.NoPermission.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "NotEnoughLicenses");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.NotEnoughLicenses.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "NotImplemented");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.NotImplemented.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "NotSupported");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.NotSupported.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "ObjectContent");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.ObjectContent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "ObjectSpec");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.ObjectSpec.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "ObjectUpdate");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.ObjectUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "ObjectUpdateKind");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.ObjectUpdateKind.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:sm1", "PropertyChange");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.PropertyChange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "PropertyChangeOp");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.PropertyChangeOp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:sm1", "PropertyFilterSpec");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.PropertyFilterSpec.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "PropertyFilterUpdate");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.PropertyFilterUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "PropertySpec");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.PropertySpec.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "ProviderSyncFailed");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.ProviderSyncFailed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "ProxyRegistrationFailed");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.ProxyRegistrationFailed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "QueryExecutionFailed");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.QueryExecutionFailed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "QueryListRequestType");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.QueryListRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:sm1", "QueryResult");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.QueryResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "QuerySpec");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.QuerySpec.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "QueryTopologyRequestType");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.QueryTopologyRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "RequestCanceled");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.RequestCanceled.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "RetrievePropertiesRequestType");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.RetrievePropertiesRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "RowData");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.RowData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "RuntimeFault");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.RuntimeFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "SecurityError");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.SecurityError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "SelectionSpec");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.SelectionSpec.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "ServiceInitializationFailed");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.ServiceInitializationFailed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "ServiceNotInitialized");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.ServiceNotInitialized.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "SessionCookieNotFound");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.SessionCookieNotFound.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "SoapHeaderNotFound");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.SoapHeaderNotFound.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "SortSpec");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.SortSpec.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "SyncInProgress");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.SyncInProgress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "SyncRequestType");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.SyncRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "SystemError");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.SystemError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "Task");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.Task.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "TraversalSpec");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.TraversalSpec.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "UnexpectedFault");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.UnexpectedFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "UnsupportedDbType");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.UnsupportedDbType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "UnsupportedDbUrl");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.UnsupportedDbUrl.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "UnsupportedOperation");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.UnsupportedOperation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "UpdateSet");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.UpdateSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "UpdateVcDbConnectionInfoRequestType");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.UpdateVcDbConnectionInfoRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sm1", "WaitForUpdatesRequestType");
            cachedSerQNames.add(qName);
            cls = com.vmware.vim.sms.WaitForUpdatesRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public void destroyPropertyFilter(com.vmware.vim.sms.ManagedObjectReference _this) throws java.rmi.RemoteException, com.vmware.vim.sms.RuntimeFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sm1", "DestroyPropertyFilter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {_this});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.vmware.vim.sms.RuntimeFault) {
              throw (com.vmware.vim.sms.RuntimeFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.vmware.vim.sms.ManagedObjectReference createFilter(com.vmware.vim.sms.ManagedObjectReference _this, com.vmware.vim.sms.PropertyFilterSpec spec, boolean partialUpdates) throws java.rmi.RemoteException, com.vmware.vim.sms.InvalidProperty, com.vmware.vim.sms.RuntimeFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sm1", "CreateFilter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {_this, spec, new java.lang.Boolean(partialUpdates)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.vmware.vim.sms.ManagedObjectReference) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.vmware.vim.sms.ManagedObjectReference) org.apache.axis.utils.JavaUtils.convert(_resp, com.vmware.vim.sms.ManagedObjectReference.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.vmware.vim.sms.InvalidProperty) {
              throw (com.vmware.vim.sms.InvalidProperty) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.vmware.vim.sms.RuntimeFault) {
              throw (com.vmware.vim.sms.RuntimeFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.vmware.vim.sms.ObjectContent[] retrieveProperties(com.vmware.vim.sms.ManagedObjectReference _this, com.vmware.vim.sms.PropertyFilterSpec[] specSet) throws java.rmi.RemoteException, com.vmware.vim.sms.InvalidProperty, com.vmware.vim.sms.RuntimeFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sm1", "RetrieveProperties"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {_this, specSet});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.vmware.vim.sms.ObjectContent[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.vmware.vim.sms.ObjectContent[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.vmware.vim.sms.ObjectContent[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.vmware.vim.sms.InvalidProperty) {
              throw (com.vmware.vim.sms.InvalidProperty) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.vmware.vim.sms.RuntimeFault) {
              throw (com.vmware.vim.sms.RuntimeFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.vmware.vim.sms.UpdateSet checkForUpdates(com.vmware.vim.sms.ManagedObjectReference _this, java.lang.String version) throws java.rmi.RemoteException, com.vmware.vim.sms.InvalidCollectorVersion, com.vmware.vim.sms.RuntimeFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sm1", "CheckForUpdates"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {_this, version});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.vmware.vim.sms.UpdateSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.vmware.vim.sms.UpdateSet) org.apache.axis.utils.JavaUtils.convert(_resp, com.vmware.vim.sms.UpdateSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.vmware.vim.sms.InvalidCollectorVersion) {
              throw (com.vmware.vim.sms.InvalidCollectorVersion) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.vmware.vim.sms.RuntimeFault) {
              throw (com.vmware.vim.sms.RuntimeFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.vmware.vim.sms.UpdateSet waitForUpdates(com.vmware.vim.sms.ManagedObjectReference _this, java.lang.String version) throws java.rmi.RemoteException, com.vmware.vim.sms.InvalidCollectorVersion, com.vmware.vim.sms.RuntimeFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sm1", "WaitForUpdates"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {_this, version});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.vmware.vim.sms.UpdateSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.vmware.vim.sms.UpdateSet) org.apache.axis.utils.JavaUtils.convert(_resp, com.vmware.vim.sms.UpdateSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.vmware.vim.sms.InvalidCollectorVersion) {
              throw (com.vmware.vim.sms.InvalidCollectorVersion) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.vmware.vim.sms.RuntimeFault) {
              throw (com.vmware.vim.sms.RuntimeFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void cancelWaitForUpdates(com.vmware.vim.sms.ManagedObjectReference _this) throws java.rmi.RemoteException, com.vmware.vim.sms.RuntimeFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sm1", "CancelWaitForUpdates"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {_this});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.vmware.vim.sms.RuntimeFault) {
              throw (com.vmware.vim.sms.RuntimeFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.vmware.vim.sms.QueryResult queryList(com.vmware.vim.sms.ManagedObjectReference _this, com.vmware.vim.sms.EntityReference contextEntity, com.vmware.vim.sms.EntityReferenceEntityType queryEntityType, com.vmware.vim.sms.QuerySpec querySpec) throws java.rmi.RemoteException, com.vmware.vim.sms.AuthenticationFailed, com.vmware.vim.sms.ServiceNotInitialized, com.vmware.vim.sms.QueryExecutionFailed, com.vmware.vim.sms.EntityNotFound, com.vmware.vim.sms.RuntimeFault, com.vmware.vim.sms.InvalidArgument {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sm1", "QueryList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {_this, contextEntity, queryEntityType, querySpec});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.vmware.vim.sms.QueryResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.vmware.vim.sms.QueryResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.vmware.vim.sms.QueryResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.vmware.vim.sms.AuthenticationFailed) {
              throw (com.vmware.vim.sms.AuthenticationFailed) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.vmware.vim.sms.ServiceNotInitialized) {
              throw (com.vmware.vim.sms.ServiceNotInitialized) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.vmware.vim.sms.QueryExecutionFailed) {
              throw (com.vmware.vim.sms.QueryExecutionFailed) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.vmware.vim.sms.EntityNotFound) {
              throw (com.vmware.vim.sms.EntityNotFound) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.vmware.vim.sms.RuntimeFault) {
              throw (com.vmware.vim.sms.RuntimeFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.vmware.vim.sms.InvalidArgument) {
              throw (com.vmware.vim.sms.InvalidArgument) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.vmware.vim.sms.Map queryTopology(com.vmware.vim.sms.ManagedObjectReference _this, com.vmware.vim.sms.EntityReference entity) throws java.rmi.RemoteException, com.vmware.vim.sms.AuthenticationFailed, com.vmware.vim.sms.ServiceNotInitialized, com.vmware.vim.sms.QueryExecutionFailed, com.vmware.vim.sms.EntityNotFound, com.vmware.vim.sms.RuntimeFault, com.vmware.vim.sms.InvalidArgument {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sm1", "QueryTopology"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {_this, entity});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.vmware.vim.sms.Map) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.vmware.vim.sms.Map) org.apache.axis.utils.JavaUtils.convert(_resp, com.vmware.vim.sms.Map.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.vmware.vim.sms.AuthenticationFailed) {
              throw (com.vmware.vim.sms.AuthenticationFailed) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.vmware.vim.sms.ServiceNotInitialized) {
              throw (com.vmware.vim.sms.ServiceNotInitialized) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.vmware.vim.sms.QueryExecutionFailed) {
              throw (com.vmware.vim.sms.QueryExecutionFailed) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.vmware.vim.sms.EntityNotFound) {
              throw (com.vmware.vim.sms.EntityNotFound) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.vmware.vim.sms.RuntimeFault) {
              throw (com.vmware.vim.sms.RuntimeFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.vmware.vim.sms.InvalidArgument) {
              throw (com.vmware.vim.sms.InvalidArgument) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void sync(com.vmware.vim.sms.ManagedObjectReference _this) throws java.rmi.RemoteException, com.vmware.vim.sms.AuthenticationFailed, com.vmware.vim.sms.ServiceNotInitialized, com.vmware.vim.sms.RuntimeFault, com.vmware.vim.sms.ProviderSyncFailed {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sm1", "Sync"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {_this});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.vmware.vim.sms.AuthenticationFailed) {
              throw (com.vmware.vim.sms.AuthenticationFailed) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.vmware.vim.sms.ServiceNotInitialized) {
              throw (com.vmware.vim.sms.ServiceNotInitialized) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.vmware.vim.sms.RuntimeFault) {
              throw (com.vmware.vim.sms.RuntimeFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.vmware.vim.sms.ProviderSyncFailed) {
              throw (com.vmware.vim.sms.ProviderSyncFailed) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void configureSyncInterval(com.vmware.vim.sms.ManagedObjectReference _this, int interval) throws java.rmi.RemoteException, com.vmware.vim.sms.AuthenticationFailed, com.vmware.vim.sms.ServiceNotInitialized, com.vmware.vim.sms.RuntimeFault, com.vmware.vim.sms.InvalidArgument {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sm1", "ConfigureSyncInterval"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {_this, new java.lang.Integer(interval)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.vmware.vim.sms.AuthenticationFailed) {
              throw (com.vmware.vim.sms.AuthenticationFailed) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.vmware.vim.sms.ServiceNotInitialized) {
              throw (com.vmware.vim.sms.ServiceNotInitialized) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.vmware.vim.sms.RuntimeFault) {
              throw (com.vmware.vim.sms.RuntimeFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.vmware.vim.sms.InvalidArgument) {
              throw (com.vmware.vim.sms.InvalidArgument) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void updateVcDbConnectionInfo(com.vmware.vim.sms.ManagedObjectReference _this, com.vmware.vim.sms.DbConnectionSpec dbConnectionSpec) throws java.rmi.RemoteException, com.vmware.vim.sms.ServiceInitializationFailed, com.vmware.vim.sms.AuthenticationFailed, com.vmware.vim.sms.RuntimeFault, com.vmware.vim.sms.InvalidArgument {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sm1", "UpdateVcDbConnectionInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {_this, dbConnectionSpec});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.vmware.vim.sms.ServiceInitializationFailed) {
              throw (com.vmware.vim.sms.ServiceInitializationFailed) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.vmware.vim.sms.AuthenticationFailed) {
              throw (com.vmware.vim.sms.AuthenticationFailed) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.vmware.vim.sms.RuntimeFault) {
              throw (com.vmware.vim.sms.RuntimeFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.vmware.vim.sms.InvalidArgument) {
              throw (com.vmware.vim.sms.InvalidArgument) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
