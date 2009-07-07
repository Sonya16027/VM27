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
*<li> Updates the connectivity information for the vCenter database using SMS API 
*<li> If the user does not specify jdbcUser and jdbcPassword then in dbConnectionSpec value of these fields is "". 
*<li> If the user does not specify jdbcUrl then dbconnectionSpec is null 
*</ul>
*
*<b>Command: To update the VC database connection information</b> 
*run.bat com.vmware.samples.sms.UpdateVcDbConnectionInfo --url <webserviceurl> 
*--username <username> --password <password>  --jdbcUrl <JDBC url> --jdbcUsername <JDBC username>  --jdbcPassword <JDBC password>

*Sample Command Line 
*run.bat com.vmware.samples.sms.UpdateVcDbConnectionInfo --url http://localhost/sdk --username administrator --password password 
*--ignorecert --jdbcUrl "jdbc:sqlserver://localhost\SQLEXP_VIM;databaseName=VIM_VCDB;integratedSecurity=true" 
*--jdbcUsername  "" --jdbcPassword "" 
*</pre>
*/

public class UpdateVcDbConnectionInfo {
   private static SmPortType service;
   private static com.vmware.vim.sms.ManagedObjectReference si;

   private static SmAppUtil cb = null;   
   Log log = new Log();   

   public void execute() throws Exception {
      SmServiceConnection conn = cb.getSmConnection();
      service = conn.getService();

      //Create a db Connection Spec
      DbConnectionSpec dbConnectionSpec = new DbConnectionSpec();

      String username = cb.get_option("jdbcUsername");
      if(username == null) {
         username = "";
      } 
      dbConnectionSpec.setUsername(username);
      
      String password = cb.get_option("jdbcPassword");
      if(password == null) {
         password = "";
      }
      dbConnectionSpec.setPassword(password);
      
      String url = cb.get_option("jdbcUrl");
      if(url == null) {
         dbConnectionSpec = null;
      } else {
         dbConnectionSpec.setUrl(url);
      }

      service.updateVcDbConnectionInfo(si,dbConnectionSpec);
      System.out.println("The connection information for the VC database has been updated.");
   }

   private static OptionSpec[] constructOptions() {
      OptionSpec [] useroptions = new OptionSpec[3];
      useroptions[0] = new OptionSpec("jdbcUsername","String",0
                                      ,"JDBC username"
                                      ,null);
      useroptions[1] = new OptionSpec("jdbcPassword","String",0
                                      ,"JDBC password"
                                      ,null);
      useroptions[2] = new OptionSpec("jdbcUrl","String",0
                                      ,"JDBC url"
                                      ,null);
      return useroptions;
   }  

   public static void main(String[] args) throws Exception {
      UpdateVcDbConnectionInfo obj = new UpdateVcDbConnectionInfo();
      cb = SmAppUtil.initialize("UpdateVcDbConnectionInfo"
                                ,UpdateVcDbConnectionInfo.constructOptions()
                                ,args);      

      cb.connect();
      obj.execute();
      cb.disConnect();         
   }
}
