package com.vmware.samples.vm;

import java.util.*;
import com.vmware.apputils.version.*;
import com.vmware.vim25.*;
import com.vmware.apputils.version.VersionUtil;
import java.util.ArrayList;
import java.util.Iterator;
import com.vmware.apputils.*;

/**
 *<pre>
 *This sample is used to relocate a linked clone using disk move type. .
 *
 *<b>To run this samples following parameters are used :</b>
 *
 *vmname            [required]   : Name of the virtual machine
 *diskmovetype      [required]   : Either of moveChildMostDiskBacking|moveAllDiskBackingsAndAllowSharing
 *datastorename     [required]   : Name of the datastore
 *
 *<b>Command:</b>
 *run.bat com.vmware.samples.vm.VMRelocate
 *--username [username] --password [password]
 *--vmname [myVM]
 *--diskmovetype [moveChildMostDiskBacking|moveAllDiskBackingsAndAllowSharing]
 *--datastorename [datastorename]
 *</pre>
 */

public class VMRelocate {
   private ExtendedAppUtil ecb = null;
   private static AppUtil cb = null;

   private static ManagedObjectReference provisionChkr = null;
   private static VersionUtil versionUtil = null;

   private void relocate(String [] args, String cookieString)
                                throws Exception {
      ArrayList apiVersions = VersionUtil.getSupportedVersions(
                                              cb.get_option("url"));
      if(!VersionUtil.isApiVersionSupported(apiVersions,"4.0")) {
         System.out.println("Feature for relocating linked clone is for K/L only and not "
                            + "supported by the old VI SDK 2.0 API");
         return;
      }
       ecb = ExtendedAppUtil.initialize("VMRelocate"
                                       ,VMRelocate.constructOptions()
                                       ,args);
      ecb.connect(cookieString);
      ManagedObjectReference vmMOR = getMOR(ecb.get_option("vmname"),
                                              "VirtualMachine", null);

      ManagedObjectReference dsMOR = null;
      ArrayList dcmors
         = ecb.getServiceUtil3().getDecendentMoRefs(null,
                                                    "Datacenter");
      Iterator it = dcmors.iterator();
      while(it.hasNext()) {
         ManagedObjectReference [] dsArr =
            (ManagedObjectReference [])ecb.getServiceUtil3().getDynamicProperty(
                                                 (ManagedObjectReference)it.next(),
                                                 "datastore");
         boolean found = false;
         if(dsArr != null) {
            for(int j=0; j<dsArr.length;j++) {
               String name =
               (String)ecb.getServiceUtil3().getDynamicProperty(dsArr[j],"summary.name");
               if(name.equalsIgnoreCase(ecb.get_option("datastorename"))) {
                  dsMOR = dsArr[j];
                  found = true;
                  j = dsArr.length + 1;
               }
            }
         }
         if(found) {
            break;
         }
      }

      if(dsMOR == null) {
         System.out.println("Datastore " + ecb.get_option("datastorename") + " Not Found");
         return;
      }
      VirtualDisk [] vDiskArr = null;
      if(vmMOR != null) {
         VirtualMachineRelocateSpec rSpec = new VirtualMachineRelocateSpec();
         String moveType = ecb.get_option("diskmovetype");
         if(moveType.equalsIgnoreCase("moveChildMostDiskBacking")) {
            rSpec.setDiskMoveType
               (VirtualMachineRelocateDiskMoveOptions._createNewChildDiskBacking);
         }
         else if(moveType.equalsIgnoreCase("moveAllDiskBackingsAndAllowSharing")) {
            rSpec.setDiskMoveType
               (VirtualMachineRelocateDiskMoveOptions._moveAllDiskBackingsAndAllowSharing);
         }
         rSpec.setDatastore(dsMOR);
         try {
            ManagedObjectReference taskMOR =
               ecb.getServiceConnection3().getService().relocateVM_Task(vmMOR,rSpec,null);
            String status = ecb.getServiceUtil3().waitForTask(taskMOR);
            if(status.equalsIgnoreCase("failure")) {
               System.out.println("Failure -: Linked clone " +
                                  "cannot be relocated");
            }
            if(status.equalsIgnoreCase("sucess")) {
               System.out.println("Linked Clone relocated successfully.");
            }
         }
         catch(Exception e) {
            if(e instanceof org.apache.axis.AxisFault) {
               org.apache.axis.AxisFault fault = (org.apache.axis.AxisFault)e;
               org.w3c.dom.Element [] errors = fault.getFaultDetails();
               for(int i=0; i<errors.length; i++) {
                  System.out.println(errors[i].toString());
               }
            }
            else {
               throw e;
            }
         }
      }
      else {
         System.out.println("Virtual Machine " + ecb.get_option("vmname") +
                            " doesn't exist");
      }
   }

   private ManagedObjectReference getMOR(String name,
                                         String type,
                                         ManagedObjectReference root)
                                         throws Exception{
       ManagedObjectReference nameMOR
          = (ManagedObjectReference)
            ecb.getServiceUtil3().getDecendentMoRef(root,type,name);

       if(nameMOR ==null) {
          return null;
       }
       else {
         return nameMOR;
       }
   }

   private boolean customValidation() throws Exception{
      boolean flag = true;
      String val = cb.get_option("diskmovetype");
      if((!val.equalsIgnoreCase("moveChildMostDiskBacking"))
           && (!val.equalsIgnoreCase("moveAllDiskBackingsAndAllowSharing"))) {
         System.out.println("diskmovetype option must be either moveChildMostDiskBacking or "
                            +"moveAllDiskBackingsAndAllowSharing");
         flag = false;
      }
      return flag;
   }

   public static OptionSpec[] constructOptions() {
      OptionSpec [] useroptions = new OptionSpec[3];
      useroptions[0] = new OptionSpec("vmname","String",1,
                                      "Name of the virtual machine"
                                      ,null);
      useroptions[1] = new OptionSpec("diskmovetype","String",1,
                                      "[moveChildMostDiskBacking|moveAllDiskBackingsAndAllowSharing]",
                                      null);
      useroptions[2] = new OptionSpec("datastorename","String",1,
                                      "Name of the datastore",
                                      null);
      return useroptions;
   }

   public static void main(String[] args) throws Exception {
      VMRelocate app = new VMRelocate();
      cb = AppUtil.initialize("VMRelocate",
                              VMRelocate.constructOptions(),args);
      boolean valid = app.customValidation();
      if(valid) {
         cb.connect();
         String cookieString = VersionUtil.getCookieString(cb);
         app.relocate(args,cookieString);
         cb.disConnect();
      }
   }
}