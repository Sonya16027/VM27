package com.vmware.samples.version.querymemoryoverhead;

import java.util.*;
import com.vmware.apputils.version.*;
import com.vmware.vim25.*;

public class QueryMemoryOverheadV25 {
    public static void queryMemoryOverhead(
       com.vmware.vim.ManagedObjectReference hmor
       ,String [] args, String cookieString) throws Exception {
       ExtendedAppUtil ecb = null;                  
       ecb = ExtendedAppUtil.initialize("QueryMemoryOverhead"
                                        ,QueryMemoryOverhead.constructOptions()
                                        ,args);           
       ecb.connect(cookieString);            
       ManagedObjectReference sic = 
          ecb.getServiceConnection3().getServiceInstanceRef();

       // Convert the vim managed object to vim25 managed object
       ManagedObjectReference hmor1  = 
          VersionUtil.convertManagedObjectReference(hmor);
                
       VirtualMachineConfigInfo vmConfigInfo = 
          new VirtualMachineConfigInfo();
            
       vmConfigInfo.setChangeVersion("1");           
            
       Calendar cal = ecb.getServiceConnection3().getService().currentTime(sic);            
       vmConfigInfo.setModified(cal);
           
       VirtualMachineDefaultPowerOpInfo defaultInfo 
          = new VirtualMachineDefaultPowerOpInfo();
       vmConfigInfo.setDefaultPowerOps(defaultInfo);
           
       VirtualMachineFileInfo fileInfo 
          = new VirtualMachineFileInfo();
       vmConfigInfo.setFiles(fileInfo);
            
       VirtualMachineFlagInfo flagInfo 
          = new VirtualMachineFlagInfo();
       vmConfigInfo.setFlags(flagInfo);
            
       vmConfigInfo.setGuestFullName("Full Name");
       vmConfigInfo.setGuestId("Id");
            
       VirtualHardware vhardware 
          = new VirtualHardware();
       vhardware.setMemoryMB(Integer.parseInt(ecb.get_option("memorysize")));
       vhardware.setNumCPU(Integer.parseInt(ecb.get_option("cpucount")));
       vmConfigInfo.setHardware(vhardware);
            
       // Not Required For Computing The Overhead
       vmConfigInfo.setName("OnlyFoeInfo");
       vmConfigInfo.setUuid("12345678-abcd-1234-cdef-123456789abc");
       vmConfigInfo.setVersion("First");
       vmConfigInfo.setTemplate(false);
       vmConfigInfo.setAlternateGuestName("Alternate");
            
       Long overhead 
           = ecb.getServiceConnection3().getService().queryMemoryOverheadEx(
             hmor1,vmConfigInfo);      
       System.out.println("Using queryMemoryOverheadEx API using vmReconfigInfo");
       System.out.println("Memory overhead necessary to "
                          +"poweron a virtual machine with memory " 
                          + ecb.get_option("memorysize") 
                          + " MB and cpu count " 
                          + ecb.get_option("cpucount") 
                          + " -: " + overhead + " bytes");
    }
}