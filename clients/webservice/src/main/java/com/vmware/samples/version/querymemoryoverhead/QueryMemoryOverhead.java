package com.vmware.samples.version.querymemoryoverhead;

import java.util.Calendar;
import java.util.ArrayList;
import com.vmware.apputils.*;
import com.vmware.apputils.version.*;
import com.vmware.vim.*;

/**
*<pre>
*
*This sample Determines the amount of memory overhead necessary to
*power on a virtual machine with the specified characteristics.
*
*<b>Parameters:</b>
*hostname        [required]:Name of the host
*memorysize      [required]:Size of the memory
*cpucount        [required]:Number of the CPU count
*
*<b>Command:</b>
*run.bat com.vmware.samples.version.querymemoryoverhead.QueryMemoryOverhead --url [webserviceurl] 
* --username [username] --password [password] --hostname [hostname] 
*--memorysize [memorysize] --cpucount [cpucount]
*
*</pre>
*/


public class QueryMemoryOverhead {
   private static AppUtil cb = null;   

   private void queryMemoryOverhead(String [] args) throws Exception{
      String hostname = cb.get_option("hostname");
      ManagedObjectReference hmor  = 
         cb.getServiceUtil().getDecendentMoRef(null,"HostSystem",hostname);            
         
      if(hmor != null) {
         ArrayList apiVersions = VersionUtil.getSupportedVersions(
                                             cb.get_option("url"));         
         if(VersionUtil.isApiVersionSupported(apiVersions, "2.5")) {
            String cookieString = VersionUtil.getCookieString(cb);
            //QueryMemoryOverheadV25.queryMemoryOverhead(hmor,args,cookieString);                      
         }
         else {
            Long overhead 
               = cb.getConnection().getService().queryMemoryOverhead(
                    hmor, 
                    Integer.parseInt(cb.get_option("memorysize")), 
                    null, 
                    Integer.parseInt(cb.get_option("cpucount"))
                 );      
                                                            
            System.out.println("Using queryMemoryOverhead API "
                              +"using CPU count and Memory Size");
            System.out.println("Memory overhead necessary to "
                               +"poweron a virtual machine with memory " 
                               + cb.get_option("memorysize") 
                               + " MB and cpu count " 
                               +  cb.get_option("cpucount") 
                               + " -: " + overhead + " bytes");            
         }         
      }
      else {
         System.out.println("Host "+ cb.get_option("hostname")+" not found");
      }
   }
   
   private boolean customValidation() throws Exception{
      boolean flag = true;
      if(Integer.parseInt(cb.get_option("memorysize")) <= 0) {
         System.out.println("Memory size must be greater than zero");
         flag = false;
      }
      if(Integer.parseInt(cb.get_option("cpucount")) <= 0) {
         System.out.println("cpucount must be greater than zero");
         flag = false;
      }
      return flag;             
   }

   public static OptionSpec[] constructOptions() {
      OptionSpec [] useroptions = new OptionSpec[3];
      useroptions[0] = new OptionSpec("hostname","String",1
                                      ,"Name of the host"
                                      ,null);
      useroptions[1] = new OptionSpec("memorysize","Integer",1,
                                      "Size of the memory",
                                      null);
      useroptions[2] = new OptionSpec("cpucount","Integer",1,
                                      "Number of the CPU count",
                                      null);
      return useroptions;
   }  

   public static void main(String args[]) throws Exception{
      QueryMemoryOverhead obj = new QueryMemoryOverhead();      
      cb = AppUtil.initialize("QueryMemoryOverhead"
                              ,QueryMemoryOverhead.constructOptions()
                              ,args);
      boolean valid = obj.customValidation();
      if(valid) {
         cb.connect();
         obj.queryMemoryOverhead(args);
         cb.disConnect();  
      }
   }
}