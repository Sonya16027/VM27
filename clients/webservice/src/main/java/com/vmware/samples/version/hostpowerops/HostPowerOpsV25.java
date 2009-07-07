package com.vmware.samples.version.hostpowerops;

import java.util.*;
import com.vmware.apputils.version.*;
import com.vmware.vim25.*;

public class HostPowerOpsV25 {
   public static void powerDownHost(
      com.vmware.vim.ManagedObjectReference hmor
      , String [] args, String cookieString) throws Exception {
      ExtendedAppUtil ecb = null;                  
      ecb = ExtendedAppUtil.initialize("PowerDownHostToStandBy"
                                       ,HostPowerOps.constructOptions()
                                       ,args);
      ecb.connect(cookieString);            
      // Convert the vim managed object to vim25 managed object
      ManagedObjectReference hmor1  = 
         VersionUtil.convertManagedObjectReference(hmor);
                
      ManagedObjectReference taskmor 
         = ecb.getServiceConnection3().getService().powerDownHostToStandBy_Task(
           hmor1,120,false);
      String result = ecb.getServiceUtil3().waitForTask(taskmor);
      if(result.equalsIgnoreCase("sucess")) {
         System.out.println("Operation powerDownHostToStandBy"
                            +" completed sucessfully");
      }
   }
}