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
* Syncs the service cache from provider information (such as the vCenter database provider).
*</ul>
*
*<b>Command: To start a sync operation </b> 
*run.bat com.vmware.samples.sms.Sync --url <webserviceurl> 
*--username <username> --password <password>  --ignorecert
* 
*Sample Command Line
*run.bat com.vmware.samples.sms.ConfigureSyncInterval --url http://localhost/sdk --username administrator --password password* 
*--ignorecert 
* 
*</pre>
*/

public class Sync {
   private static SmPortType service;
   private static com.vmware.vim.sms.ManagedObjectReference si;

   private static SmAppUtil cb = null;   
   Log log = new Log();   

   public void execute() throws Exception {
      SmServiceConnection conn = cb.getSmConnection();
      service = conn.getService();
      service.sync(si);
      System.out.println("Sync operation completed successfully!");
   }

   public static void main(String[] args) throws Exception {
      Sync obj = new Sync();
      cb = SmAppUtil.initialize("Sync", args);      
      cb.connect();
      obj.execute();
      cb.disConnect();         
   }
}
