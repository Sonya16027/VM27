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
 *This sample is used to consolidate a linked clone by using promote API.
 *
 *
 *<b>To run this samples following parameters are used :</b>
 *
 *vmname            [required]   : Name of the virtual machine
 *unlink            [required]   : [True|False]
 *disknames         [optional]   : Disk name
 *
 *<b>Command:</b>
 *run.bat com.vmware.samples.vm.vmpromotedisks
 *--username [username] --password [password]  --vmname [myVM]
 *--unlink [ulink]  -- disknames [dname1:dname2.]
 *</pre>
 */

public class VMPromoteDisks {
   private ExtendedAppUtil ecb = null;
   private static AppUtil cb = null;

   private static ManagedObjectReference provisionChkr = null;
   private static VersionUtil versionUtil = null;

   private void promoteDeltaDisk(String [] args, String cookieString)
                                throws Exception {
      ArrayList apiVersions = VersionUtil.getSupportedVersions(
                                              cb.get_option("url"));
      if(!VersionUtil.isApiVersionSupported(apiVersions,"4.0")) {
         System.out.println("Feature for consolidating the linked clone is for K/L only and not "
                            + "supported by the old VI SDK 2.0 API");
         return;
      }
      ecb = ExtendedAppUtil.initialize("VMPromoteDisks"
                                       ,VMPromoteDisks.constructOptions()
                                       ,args);
      ecb.connect(cookieString);
      ManagedObjectReference vmMOR = getMOR(ecb.get_option("vmname"),
                                              "VirtualMachine", null);

      boolean unlink = Boolean.valueOf(ecb.get_option("unlink"));
      VirtualDisk [] vDiskArr = null;
      if(vmMOR != null) {
         if(ecb.get_option("disknames") != null) {
            String disknames = ecb.get_option("disknames");
            String [] arr = disknames.split(":");
            vDiskArr = new VirtualDisk[arr.length];
            for(int i=0; i<arr.length; i++) {
               VirtualDisk vDisk = findVirtualDisk(vmMOR,arr[i]);
               if(vDisk != null) {
                  vDiskArr[i] = vDisk;
               }
               else {
                  System.out.println("Virtual Disk " + arr[i] + " not found");
                  return;
               }
            }
         }
         try {
            ManagedObjectReference taskMOR =
               ecb.getServiceConnection3().getService().promoteDisks_Task(vmMOR,
                                                                          unlink,
                                                                          vDiskArr);
            String status = ecb.getServiceUtil3().waitForTask(taskMOR);
            if(status.equalsIgnoreCase("failure")) {
               System.out.println("Failure -: Virtual Disks " +
                                  "cannot be promoted");
            }
            if(status.equalsIgnoreCase("sucess")) {
               System.out.println("Virtual Disks Promoted  successfully.");
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

   private VirtualDisk findVirtualDisk(ManagedObjectReference vmMOR,
                                       String diskName) throws Exception {
      VirtualDisk ret = null;
      VirtualHardware hw =
      (VirtualHardware)ecb.getServiceUtil3().getDynamicProperty(vmMOR,
                                                               "config.hardware");
      VirtualDevice [] deviceArray = hw.getDevice();
      for(int i=0; i<deviceArray.length; i++) {
         if(deviceArray[i].getClass().getCanonicalName().indexOf("VirtualDisk") != -1) {
            VirtualDisk vDisk = (VirtualDisk)deviceArray[i];
            if(diskName.equalsIgnoreCase(vDisk.getDeviceInfo().getLabel())) {
               ret = vDisk;
               break;
            }
         }
      }
      return ret;
   }

   private ManagedObjectReference getMOR(String name,
                                         String type,
                                         ManagedObjectReference root)
                                         throws Exception{
       ManagedObjectReference nameMOR
          = (ManagedObjectReference)
            ecb.getServiceUtil3().getDecendentMoRef(root,type, name);

       if(nameMOR ==null) {
          System.out.println("Error:: "+ name+ " not found");
          return null;
       }
       else {
         return nameMOR;
       }
   }

   private boolean customValidation() throws Exception{
      boolean flag = true;
      String val = cb.get_option("unlink");
      if((!val.equalsIgnoreCase("true")) && (!val.equalsIgnoreCase("false"))) {
         System.out.println("unlink option must be either true or false");
         flag = false;
      }
      return flag;
   }

   public static OptionSpec[] constructOptions() {
      OptionSpec [] useroptions = new OptionSpec[3];
      useroptions[0] = new OptionSpec("vmname","String",1,
                                      "Name of the virtual machine"
                                      ,null);
      useroptions[1] = new OptionSpec("unlink","String",1,
                                      "[true|false]",
                                      null);
      useroptions[2] = new OptionSpec("disknames","String",0,
                                      "Name of the disks",
                                      null);
      return useroptions;
   }

   public static void main(String[] args) throws Exception {
      VMPromoteDisks app = new VMPromoteDisks();
      cb = AppUtil.initialize("VMPromoteDisks",
                              VMPromoteDisks.constructOptions(),args);
      boolean valid = app.customValidation();
      if(valid) {
         cb.connect();
         String cookieString = VersionUtil.getCookieString(cb);
         app.promoteDeltaDisk(args,cookieString);
         cb.disConnect();
      }
   }
}