package com.vmware.samples.vm;

import java.util.ArrayList;
import com.vmware.apputils.*;
import com.vmware.apputils.version.*;
import com.vmware.vim.*;
import com.vmware.apputils.vim.*;
import java.util.*;
import java.io.*;
import com.vmware.apputils.vim.VMUtils;

/**
 *<pre>
 *This sample is used to validate if VMotion is feasible between two hosts or not,
 *It is also used to perform migrate/relocate task depending on the data given
 *
 * 
 *<b>To run this samples following parameters are used :</b>
 *
 *vmname          [required]   : Name of the virtual machine
 *targethost      [required]   : Name of the target host
 *sourcehost      [required]   : Name of the host containg the virtual machine 
 *targetpool      [required]   : Name of the target resource pool
 *targetdatastore [required]   : Name of the target datastore
 *priority        [optional]   : The priority of the migration task: defaultPriority, highPriority, lowPriority
 *state           [optional]   :
 *
 *<b>Command:</b>
 *<b>Relocate or migrate a VM </b>
 *run.bat com.vmware.samples.version.VMotion --url [webserviceurl]
 *--username [username] --password [password]  --targetpool [tpool]
 *--sourcehost [shost] --targethost [thost] --vmname [myVM] --targetdatastore [tDS]
 *<b>Validate the vmotion capability</b>
 *run.bat com.vmware.samples.version.VMotion --url [webserviceurl]
 *--username [username] --password [password]  --targetpool [tpool]
 *--sourcehost [shost] --targethost [thost] --vmname [myVM] --targetdatastore [tDS]
 * --validate
 *</pre>
 */


public class VMotion {
   private static AppUtil cb = null;
   private static ManagedObjectReference licMgr = null;
   private static VMUtils vmUtils = null;

   private void getVersion(String args[], VMotion vmotionObj) throws Exception {
       ArrayList apiVersions = VersionUtil.getSupportedVersions(
                                              cb.get_option("url"));
       if(VersionUtil.isApiVersionSupported(apiVersions,"4.0")) {
           String cookieString = VersionUtil.getCookieString(cb);
            // go to the v25 sample
           VMotionV25 vmotionV25obj  = new VMotionV25(); 
           vmotionV25obj.useVMotion25(args,cookieString,vmotionObj); 
           
       }
       else {
          if(cb.option_is_set("validate")) {
             System.out.println("Investing the VMotion capability of VM in a Host"+
              " is supported in only 4.0 servers ");
           }
           else {
             migrate_or_relocate_VM();
           }
       }
    }
    
    public void migrate_or_relocate_VM() throws Exception {
    
    // first we need to check if the VM should be migrated of relocated
    // If target host and source host both contains
    //the datastore, virtual machine needs to be migrated
    // If only target host contains the datastore, machine needs to be relocated
    
    
    String vmname = cb.get_option("vmname");
    String targetHost = cb.get_option("targethost");
    String targetPool = cb.get_option("targetpool");
    String sourceHost = cb.get_option("sourcehost");
    String targetDS = cb.get_option("targetdatastore");
    
    String operationName = check_operation_type(targetHost, sourceHost, targetDS );
       if(operationName.equalsIgnoreCase("migrate")) {
          migrateVM(vmname,targetPool,targetHost,sourceHost);
       }
       else if(operationName.equalsIgnoreCase("relocate")) {
         relocateVM(vmname,targetPool,targetHost,targetDS, sourceHost);
       }

    }
    
    
    public void migrateVM 
    (String vmname ,String pool, String tHost, String srcHost) throws Exception {
         String state;
         String priority;
         VirtualMachinePowerState st =null;
         VirtualMachineMovePriority pri = null;
         if(cb.option_is_set("state")) {
           state =cb.get_option("state");
           st= VirtualMachinePowerState.fromString(cb.get_option("state"));
         }
         if(!cb.option_is_set("priority")) {
            pri = VirtualMachineMovePriority.defaultPriority;
         }
         else {
          pri = VirtualMachineMovePriority.fromString(cb.get_option("priority"));
         }
        try {
          ManagedObjectReference srcMOR = getMOR(srcHost, "HostSystem", null);
          ManagedObjectReference vmMOR = getMOR(vmname, "VirtualMachine", srcMOR);
          ManagedObjectReference poolMOR = getMOR(pool, "ResourcePool", null);
          ManagedObjectReference hMOR = getMOR(tHost, "HostSystem", null);
          if(vmMOR==null || srcMOR == null ||  poolMOR==null || hMOR==null ) {
            return;
          }
          System.out.println("Migrating the Virtual Machine "+vmname);
          ManagedObjectReference taskMOR 
             = cb.getConnection().getService().migrateVM_Task(vmMOR,poolMOR,hMOR,pri,st);
          String res = cb.getServiceUtil().waitForTask(taskMOR); 
          if(res.equalsIgnoreCase("sucess")) {
          System.out.println("Migration of Virtual Machine " +vmname + " done successfully to "+tHost);
          }
          else {
            System.out.println("Error::  Migration failed");
          }
          
          
        }
        catch(Exception e){
           if(e instanceof org.apache.axis.AxisFault) {
             org.apache.axis.AxisFault fault = (org.apache.axis.AxisFault)e;
             org.w3c.dom.Element [] errors = fault.getFaultDetails();
             for(int i=0; i<errors.length; i++) {
                if(errors[i].toString().indexOf("InvalidPowerState") != -1) {
                  System.out.println("The attempted operation cannot be performed"+
                   "in the current state" );
                }
                else if(errors[i].toString().indexOf("SnapshotCopyNotSupported") != -1) {
                  System.out.println("Migration of virtual machines with snapshots is not"+
                   "supported between the source and destination" );
                }
                else if(errors[i].toString().indexOf("InvalidState") != -1) {
                  System.out.println("Operation cannot be performed because of the"+
                   "virtual machine's current state" );
                }
                else if(errors[i].toString().indexOf("VmConfigFault") != -1) {
                  System.out.println("virtual machine is not compatible with the"+
                   "destination host" );
                }
                else if(errors[i].toString().indexOf("InvalidArgument") != -1) {
                  System.out.println("target host and target pool are not associated with"+
                   "the same compute resource " );
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
    
    
    
   /*
    *This function is used for doing the relocation VM task
    *@param String vmname
    *@param String resourcepool name
    *@param String name of the target host
    *@param String name of the target datastore
    */
    
    public void relocateVM(String vmname,String pool ,String tHost,String tDS, String srcHost) throws Exception {
    VirtualMachineMovePriority pri = null;
    if(!cb.option_is_set("priority")) {
           pri = VirtualMachineMovePriority.defaultPriority;
     }
     else {
        pri = VirtualMachineMovePriority.fromString(cb.get_option("priority"));
        //System.out.println("pri entered is "+pri);
     }
     try {
          ManagedObjectReference srcMOR = getMOR(srcHost, "HostSystem", null);
          ManagedObjectReference vmMOR = getMOR(vmname, "VirtualMachine", srcMOR);
          ManagedObjectReference poolMOR = getMOR(pool, "ResourcePool", null);
          ManagedObjectReference hMOR = getMOR(tHost, "HostSystem", null);
          ManagedObjectReference[] dsTarget
          = (ManagedObjectReference[])cb.getServiceUtil().getDynamicProperty(hMOR, "datastore");
          ManagedObjectReference dsMOR = browseDSMOR(dsTarget, tDS);
          if(dsMOR == null) {
            System.out.println("Datastore "+tDS+ " not found" );
          }
          if(vmMOR==null || dsMOR == null ||  poolMOR==null || hMOR==null || dsMOR==null ) {
            return;
          }
          VirtualMachineRelocateSpec relSpec = new VirtualMachineRelocateSpec();
          relSpec.setDatastore(dsMOR);
          relSpec.setHost(hMOR);
          relSpec.setPool(poolMOR);
          System.out.println("Relocating the Virtual Machine "+vmname);
          ManagedObjectReference taskMOR =
             cb.getConnection().getService().relocateVM_Task(vmMOR,relSpec);
          String res = cb.getServiceUtil().waitForTask(taskMOR); 
          if(res.equalsIgnoreCase("sucess")) {
          System.out.println("Relocation done successfully of "+vmname+ "to host "+tHost);
          }
          else {
            System.out.println("Error::  Relocation failed");
          }
          
       }
       catch(Exception e){
           if(e instanceof org.apache.axis.AxisFault) {
             org.apache.axis.AxisFault fault = (org.apache.axis.AxisFault)e;
             org.w3c.dom.Element [] errors = fault.getFaultDetails();
             for(int i=0; i<errors.length; i++) {
                if(errors[i].toString().indexOf("InvalidPowerState") != -1) {
                  System.out.println("The attempted operation cannot be performed"+
                   "in the current state" );
                }
                else if(errors[i].toString().indexOf("SnapshotCopyNotSupported") != -1) {
                  System.out.println("Migration of virtual machines with snapshots is not"+
                   "supported between the source and destination" );
                }
                else if(errors[i].toString().indexOf("InvalidState") != -1) {
                  System.out.println("Operation cannot be performed because of the"+
                   "virtual machine's current state" );
                }
                else if(errors[i].toString().indexOf("VmConfigFault") != -1) {
                  System.out.println("virtual machine is not compatible with the"+
                   "destination host" );
                }
                else if(errors[i].toString().indexOf("NotSupported") != -1) {
                  System.out.println("The operation is not supported on the Virtual Machine"+
                   "the same compute resource " );
                }
                else if(errors[i].toString().indexOf("InvalidArgument") != -1) {
                  System.out.println("target host and target pool are not associated with"+
                   "the same compute resource " );
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
    
    
    /*
    *This function is used to check whether relocation is to be done or 
    *migration is to be done. If two hosts have a shared datastore then 
    *migration will be done and if there is no shared datastore relocation 
    *will be done.
    *@param String name of the source host
    *@param String name of the target host
    *@param String name of the target datastore
    *@return String mentioning migration or relocation
    */
    
    // check which operation is to be performed migration or relocation
    
    private String check_operation_type(String targetHost, String sourceHost, String targetDS) {
        String operation="";
      try {
        ManagedObjectReference targetHostMOR =getMOR(targetHost, "HostSystem", null);
        ManagedObjectReference sourceHostMOR= getMOR(sourceHost, "HostSystem", null);
        if((targetHostMOR == null) || (sourceHostMOR ==null )) {
          return "";
         }
        ManagedObjectReference[] dsTarget
          = (ManagedObjectReference[])cb.getServiceUtil().getDynamicProperty(targetHostMOR, "datastore");
         ManagedObjectReference tarHostDS = browseDSMOR(dsTarget,targetDS);

        ManagedObjectReference[] dsSource
          = (ManagedObjectReference[])cb.getServiceUtil().getDynamicProperty(sourceHostMOR, "datastore");
        ManagedObjectReference srcHostDS = browseDSMOR(dsSource,targetDS); 
         
         if((tarHostDS !=null) && (srcHostDS!=null)) {
           // we have a shared datastore we can do migration 
           operation = "migrate";
         }
         else {
           operation = "relocate";
         }
        }
        catch(Exception e) {
          e.printStackTrace();
        }
          return operation;

    }
    
    private ManagedObjectReference getMOR(String name, String type, ManagedObjectReference root) throws Exception{
    
       ManagedObjectReference nameMOR 
       = (ManagedObjectReference)cb.getServiceUtil().getDecendentMoRef(root,type, name);
       if(nameMOR ==null) {   
          System.out.println("Error:: "+ name+ " not found");
          return null;
       }
       else {
         return nameMOR;
       }
    }
   
    
    private ManagedObjectReference browseDSMOR(ManagedObjectReference[] dsMOR, String dsName) {
        ManagedObjectReference dataMOR=null;
       try{
         if(dsMOR != null && dsMOR.length>0) {
            for (int i = 0; i < dsMOR.length; i++ ) {
               String dsname  = (String)cb.getServiceUtil().getDynamicProperty(dsMOR[i], "summary.name");
               if(dsname.equalsIgnoreCase(dsName)) {
                  dataMOR = dsMOR[i];
               }
            }
         }
      }
      catch(Exception e) {
       e.printStackTrace();
      }
       return dataMOR;
    }
  
    private boolean customValidation() throws Exception{
      boolean flag = true;
      if(cb.option_is_set("state")) {
        String state =cb.get_option("state");
        
        if(cb.get_option("state") == null) {
           System.out.println("Value for state cannot be null\n");
           flag = false;
        }
        else {
            if(!state.equalsIgnoreCase("poweredOn") 
                 && !state.equalsIgnoreCase("poweredOff")
                     && !state.equalsIgnoreCase("suspended")) {
               System.out.println("Must specify 'poweredOn', 'poweredOff' or"+
                  " 'suspended' for 'state' option\n");
               flag = false;
           }
        }
      }
       if(cb.option_is_set("priority")) {
        String prior =cb.get_option("priority");
        if(cb.get_option("priority") == null) {
           System.out.println("Value for priority cannot be null\n");
           flag = false;
        }
        else {
           if(!prior.equals("defaultPriority") 
               && !prior.equals("highPriority")
                    && !prior.equals("lowPriority")) {
             System.out.println("Must specify 'defaultPriority', 'highPriority "+
                      " 'or 'lowPriority' for 'priority' option\n");
             flag = false;
          }
        }
      }

      return flag;
    }
    
    
      public static OptionSpec[] constructOptions() {
      OptionSpec [] useroptions = new OptionSpec[8];
      useroptions[0] = new OptionSpec("vmname","String",1,
                                      "Name of the virtual machine"
                                      ,null);
      useroptions[1] = new OptionSpec("targethost","String",1,
                                      "Target host on which VM is to be migrated",
                                      null);
      useroptions[2] = new OptionSpec("targetpool","String",1,
                                      "Name of the target resource pool",
                                      null);
      useroptions[3] = new OptionSpec("priority","String",0,
                                      "The priority of the migration task: defaultPriority, highPriority, lowPriority",
                                      null);
      useroptions[4] = new OptionSpec("validate","String",0,
                                      "Check whether the vmotion feature is legal for 4.0 servers",
                                      null);
      useroptions[5] = new OptionSpec("sourcehost","String",1,
                                      "Name of the host containg the virtual machine.",
                                      null);        
      useroptions[6] = new OptionSpec("targetdatastore","String",1,
                                      "Name of the target datastore",
                                      null);        
      useroptions[7] = new OptionSpec("state","String",0,
                                      "State of the VM poweredon,poweredoff, suspended",
                                      null);
      return useroptions;
   }

   public static void main(String[] args) throws Exception {
      VMotion app = new VMotion();
      cb = AppUtil.initialize("VMotion",VMotion.constructOptions(),args);
      boolean valid = app.customValidation();
      if(valid) {
         cb.connect();
         app.getVersion(args,app);
         cb.disConnect();
      }
   }
   
}