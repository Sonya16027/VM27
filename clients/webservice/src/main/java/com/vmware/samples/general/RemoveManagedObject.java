package com.vmware.samples.general;

import com.vmware.vim.*;
import com.vmware.apputils.*;
import com.vmware.apputils.vim.*;


/**
*This sample is used to Destroy or Unregister Managed Inventory Object like a Host, VM, Folder, etc 
*<pre>
*
*<b>To run this samples following parameters are used :</b>
*
*objtype       [required]   : type of object on which operation is to be performed 
*                   e.g. HostSystem , VirtualSystem, Datacenter, ResourcePool, Folder
*objname       [required]   : Name of the objtype
*operation     [optional]   : Name of the operation remove|unregister
*
*<b>Command :
Remove a folder named Fold </b>
*run.bat com.vmware.samples.general.RemoveManagedObject --url [webserviceurl]
*--username [username] --password  [password]
*--objtype [Folder] --objname  [Fold] 
*
*<b>Unregister a virtual machine named VM1 </b>
*run.bat com.vmware.samples.general.RemoveManagedObject --url [webserviceurl]
*--username [username] --password  [password]
*--objtype [VirtualMachine] --objname  [VM1] --operation [unregister]
*</pre>
*/



public class RemoveManagedObject {

   private static final String STR_REMOVE = "remove";
   private static final String STR_UNREGISTER = "unregisterVM";

   private static AppUtil cb = null;
   private static VMUtils vmUtils = null;
   
   
   private void validate()throws Exception{
      String objType = cb.get_option("objtype");
      try{
         if(cb.option_is_set("operation")){
            String operation = cb.get_option("operation");   
            if(!(operation.equalsIgnoreCase("remove")) 
                  && (!(operation.equalsIgnoreCase("unregister"))) ){
               System.out.println("Invalid Operation type");
               cb.displayUsage();
               throw new ArgumentHandlingException("Invalid Operation type");
            }   
         }
         if(objType.equalsIgnoreCase("HostSystem") 
               ||objType.equalsIgnoreCase("VirtualMachine") 
               || objType.equalsIgnoreCase("Folder") 
               || objType.equalsIgnoreCase("ResourcePool")
               || objType.equalsIgnoreCase("Datacenter") ){                     
         }
         else{
            System.out.println("Invalid Obj Type type " +objType);
            cb.displayUsage();
            throw new ArgumentHandlingException("Invalid obj type type");  
         }
      }    
      catch(Exception e){
         throw e;
      }   
   }
   
   private String getRemoveOp() throws Exception  {
      String operation = cb.get_option("operation");
      String objType = cb.get_option("objtype");
      if ((operation == null || operation.length() == 0) 
            && (objType.equalsIgnoreCase("VirtualMachine")) ) {
         operation = STR_UNREGISTER;
      }
      else if((operation == null || operation.length() == 0) 
             && !(objType.equalsIgnoreCase("VirtualMachine"))) {
          operation = STR_REMOVE;
      }
      else {
         if (!(STR_REMOVE.equals(operation)) 
               && !(STR_UNREGISTER.equals(operation))) {
            operation = STR_UNREGISTER;
         }
      }
      return operation;
   }

   private void runOperation() throws Exception {
      doRemove();
   }

   private void doRemove() throws Exception {
     String objType = cb.get_option("objtype");
     String objName = cb.get_option("objname");
     String remOpStr = getRemoveOp();
      try {
         ManagedObjectReference objmor = 
            cb.getServiceUtil().getDecendentMoRef(null, objType, objName);

         if (objmor != null) {
            if (STR_REMOVE.equals(remOpStr)) {
               ManagedObjectReference taskmor 
                  = cb.getConnection().getService().destroy_Task(objmor);
               String status = cb.getServiceUtil().waitForTask(taskmor);
               if(status.equalsIgnoreCase("failure")) {
                  System.out.println("Failure -: Managed Entity Cannot Be Removed");
               }
            } 
            else if ("VirtualMachine".equalsIgnoreCase(objType)) {
               try{
                  cb.getConnection().getService().unregisterVM(objmor);
               }
               catch (InvalidPowerState e) {
                  System.out.println("Invalid power state");
                  return;
               }
               catch(Exception e){
                  System.out.println("Error");
                  e.printStackTrace();
                  return;
               }
            } 
            else {
               throw new Exception("Invalid Operation specified.");
            }
            System.out.println("Successful " + remOpStr + " of " 
                              + objType + " : " + objName);
         } else {
            System.out.println("Unable to find object of type  " + objType 
                             + " with name  " + objName);
            System.out.println(cb.getAppName() + " : Failed " + remOpStr 
                             + " of " + objType + " : " + objName);
         }
      } 
      catch (Exception e) {
         System.out.println("Error");
         throw e;
      }
      
   }
   private static OptionSpec[] constructOptions() {
      OptionSpec [] useroptions = new OptionSpec[3];
      useroptions[0] 
         = new OptionSpec("objtype","String",1
                         ,"type of object on which operation is to be performed " +
                        "e.g. HostSystem , VirtualMachine, Datacenter, ResourcePool, " +
                         "Folder"
                                     ,null);
      useroptions[1] = new OptionSpec("objname","String",1,
                                      "Name of the object",
                                      null);
      useroptions[2] = new OptionSpec("operation","String",0,
                                      "operation name remove/unregister",
                                      null);
      return useroptions;
   }
   public static void main(String[] args) throws Exception {
      RemoveManagedObject remmor = new RemoveManagedObject();
      cb = AppUtil.initialize("RemoveManagedObject",
                              RemoveManagedObject.constructOptions(),
                              args);
      cb.connect();
      remmor.validate();
      remmor.runOperation();
      cb.disConnect();
   }
}
