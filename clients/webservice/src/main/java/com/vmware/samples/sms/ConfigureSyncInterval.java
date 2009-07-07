package com.vmware.samples.sms;
import java.util.*;

import com.vmware.vim25.*;
import com.vmware.apputils.*;

import com.vmware.vim.sms.*;

/**
*<pre>
*This sample implements a function that
*
*<ul>
*<li> Sets the frequency with which the service cache is automatically synced with
provider information using SMS API - ConfigureSyncInterval 
*</ul>
*
*<b>Command: To update the sync interval </b> 
*run.bat com.vmware.samples.sms.ConfigureSyncInterval --url <webserviceurl> 
*--username <username> --password <password> --syncInterval <syncInterval> --ignorecert
* 
*Sample Command Line
*run.bat com.vmware.samples.sms.ConfigureSyncInterval --url http://localhost/sdk --username administrator --password password* 
*--ignorecert --syncInterval 300 
* 
*</pre>
*/

public class ConfigureSyncInterval {
   private static SmPortType service;
   private static com.vmware.vim.sms.ManagedObjectReference si;

   private static SmAppUtil cb = null;   
   Log log = new Log();   

   public void execute() throws Exception {
      SmServiceConnection conn = cb.getSmConnection();
      service = conn.getService();

      Integer syncInterval = Integer.parseInt(cb.get_option("syncInterval"));

      service.configureSyncInterval(si,syncInterval);
      System.out.println("Configured sync interval to " + syncInterval + " seconds.");
   }

   private static OptionSpec[] constructOptions() {
      OptionSpec [] useroptions = new OptionSpec[1];
      useroptions[0] = new OptionSpec("syncInterval","Integer",1
                                      ,"Sync interval"
                                      ,null);
      return useroptions;
   }   

   public static void main(String[] args) throws Exception {
      ConfigureSyncInterval obj = new ConfigureSyncInterval();
      cb = SmAppUtil.initialize("ConfigureSyncInterval"
                             ,ConfigureSyncInterval.constructOptions()
                             ,args);      
      cb.connect();
      obj.execute();
      cb.disConnect();         
   }
}
