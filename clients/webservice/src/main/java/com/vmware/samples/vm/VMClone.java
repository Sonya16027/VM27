package com.vmware.samples.vm;

import java.net.*;
import java.rmi.RemoteException;
import java.util.*;
import java.io.*;
import com.vmware.vim.*;
import com.vmware.apputils.*;
import com.vmware.apputils.vim.*;


/**
*<pre>
*This sample implements a function that
*
*<ul>
*<li> Locates a pre-existing virtual machine on the VirtualCenter server.
*<li> Makes a template from this virtual machine for future use.
*<li> Deploys n instances of this template onto a datacenter.
*</ul>
*<b>Parameters:</b>
*DatacenterName  [required] : DatacenterName
*vmPath          [required] : A path to the VM inventory
*CloneName       [required] : Name of the Clone
*
*
*<b>Command: To clone a virtual machine</b>
*run.bat com.vmware.samples.vm.VMClone --url <webserviceurl> 
*--username <username> --password <password> --DatacenterName <DatacenterName> 
*--vmPath <vmPath>  --CloneName <CloneName>
*</pre>
*/


public class VMClone {
   static VimPortType service;   // All Methods
   private static  ServiceContent content;    
   private static AppUtil cb = null;   
   private String[][] typeInfo;
   Log log = new Log();   
   ServiceUtil svc = new ServiceUtil();

   private static OptionSpec[] constructOptions() {
      OptionSpec [] useroptions = new OptionSpec[3];
      useroptions[0] = new OptionSpec("DatacenterName","String",1
                                   ,"Name of the Datacenter"
                                   ,null);
      useroptions[1] = new OptionSpec("vmPath","String",1,
                                   "Path to the VM inventory",
                                   null);
      useroptions[2] = new OptionSpec("CloneName","String",1,
                                   "Name of the Clone",
                                   null);
      return useroptions;
   }

   private void cloneVM() throws Exception{    
      String cloneName = cb.get_option("CloneName");
      String vmPath = cb.get_option("vmPath");
      String datacenterName= cb.get_option("DatacenterName");
      com.vmware.apputils.vim.ServiceConnection  S1 = cb.getConnection();
      content = S1.getServiceContent();
      service = S1.getService();
      // Find the Datacenter reference by using findByInventoryPath().
      ManagedObjectReference datacenterRef 
         = S1.getService().findByInventoryPath(content.getSearchIndex(), datacenterName);
      if (datacenterRef == null) {
         System.out.println("The specified datacenter is not found");
         return;
      }
      // Find the virtual machine folder for this datacenter.
      ManagedObjectReference vmFolderRef 
         = (ManagedObjectReference) getObjectProperty(datacenterRef, "vmFolder");
      if (vmFolderRef == null) {
         System.out.println("The virtual machine is not found");
         return;
      }
      ManagedObjectReference vmRef
         = S1.getService().findByInventoryPath(content.getSearchIndex(), vmPath);
      if (vmRef == null) {
         System.out.println("The virtual machine is not found");
         return;
      }
      VirtualMachineCloneSpec cloneSpec = new VirtualMachineCloneSpec();
      VirtualMachineRelocateSpec relocSpec = new VirtualMachineRelocateSpec();
      cloneSpec.setLocation(relocSpec);
      cloneSpec.setPowerOn(false);
      cloneSpec.setTemplate(false);
      
      String clonedName = cloneName;
      System.out.println("Launching clone task to create a clone: " 
                         + clonedName);
      try {
         ManagedObjectReference cloneTask 
            = service.cloneVM_Task(vmRef, vmFolderRef, clonedName, cloneSpec);
         String status = cb.getServiceUtil().waitForTask(cloneTask);
         if(status.equalsIgnoreCase("failure")) {
            System.out.println("Failure -: Virtual Machine cannot be cloned");
         }
                  
         if(status.equalsIgnoreCase("sucess")) {
            System.out.println("Virtual Machine Cloned  successfully.");
         }
      }
      catch(Exception e) {
         if(e instanceof org.apache.axis.AxisFault) {
            org.apache.axis.AxisFault fault = (org.apache.axis.AxisFault)e;
            org.w3c.dom.Element [] errors = fault.getFaultDetails();
            for(int i=0; i<errors.length; i++) {
               if(errors[i].toString().indexOf("DuplicateName") != -1) {
                  System.out.println("Virtual Machine with the same name already exists");
               }
               else if(errors[i].toString().indexOf("InvalidArgument") != -1) {
                  System.out.println("Specification is invalid");
               }
               else if(errors[i].toString().indexOf("InvalidName") != -1) {
                  System.out.println("Virtual Machine name is empty or too long");
               }
               else if(errors[i].toString().indexOf("RuntimeFault") != -1) {
                  System.out.println(errors[i].toString());
               }
               else {
                  System.out.println(errors[i].toString());
               }
            }
         }
         else {
            throw e;
         }
      }   
   }
  
   public static void main(String[] args) throws Exception {
      VMClone obj = new VMClone(); 
      cb = AppUtil.initialize("VMClone"
                              ,VMClone.constructOptions()
                              ,args);
      cb.connect();
      obj.cloneVM();
      cb.disConnect();         
   }

   /*
    * getStringProperty --
    * 
    * Retrieve the specified string property.
    * see getProperties.
    */
   static String getStringProperty(ManagedObjectReference moRef, String propertyName)
   throws RuntimeFault, RemoteException {
      return (String) (getProperties(moRef, new String[] { propertyName })[0]);
   }
   
   /*
    * getObjectProperty --
    * 
    * Retrieves the specified object property.
    * see getProperties.
    */
   static Object getObjectProperty(ManagedObjectReference moRef, String propertyName)
   throws RuntimeFault, RemoteException {
      return getProperties(moRef,  new String[] { propertyName })[0];
   }
   static Object[] getProperties(ManagedObjectReference moRef, String[] properties)
   throws RuntimeFault, RemoteException {
      // PropertySpec specifies what properties to
      // retrieve and from type of Managed Object
      PropertySpec pSpec = new PropertySpec();
      pSpec.setType(moRef.getType());
      pSpec.setPathSet(properties);
      
      // ObjectSpec specifies the starting object and
      // any TraversalSpecs used to specify other objects 
      // for consideration
      ObjectSpec oSpec = new ObjectSpec();
      oSpec.setObj(moRef);

      // PropertyFilterSpec is used to hold the ObjectSpec and 
      // PropertySpec for the call
      PropertyFilterSpec pfSpec = new PropertyFilterSpec();
      pfSpec.setPropSet(new PropertySpec[] {pSpec});
      pfSpec.setObjectSet(new ObjectSpec[] {oSpec});
      
      // retrieveProperties() returns the properties
      // selected from the PropertyFilterSpec
      ObjectContent[] ocs = service.retrieveProperties(
            content.getPropertyCollector(),
            new PropertyFilterSpec[] {pfSpec});

      // Return value, one object for each property specified
      Object[] ret = new Object[properties.length];
      
      if(ocs != null) {
         for(int i=0; i<ocs.length; ++i)   {
            ObjectContent oc = ocs[i];
            DynamicProperty[] dps = oc.getPropSet();
            if(dps != null) {
               for(int j=0; j<dps.length; ++j) {
                  DynamicProperty dp = dps[j];
                  // find property path index
                  for(int p=0; p<ret.length; ++p) {
                     if(properties[p].equals(dp.getName())) {
                        ret[p] = dp.getVal();
                     }
                  }
               }
            }
         }
      }
      return ret;
   }
}