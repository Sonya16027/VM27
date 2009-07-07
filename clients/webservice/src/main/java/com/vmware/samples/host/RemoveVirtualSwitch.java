
package com.vmware.samples.host;

import com.vmware.vim.*;
import com.vmware.apputils.*;
import com.vmware.apputils.vim.*;
import com.vmware.apputils.vim.VMUtils;

/**
*<pre>
*This sample is used to remove a virtual switch  
*
*To run this samples following parameters are used:
*
*vsiwtchid   [required]: Name of the switch to be removed
*host        [optional]: Name of the host
*datacenter  [optional]: Name of the datacenter
*
*<b>Command Line: to remove the Virtual Switch from a virtual center</b>
*run.bat com.vmware.samples.host.RemoveVirtualSwitch --url [webserviceurl] --username [username] --password  *[password]  --vsiwtchid [mySwitch] --datacenter [mydatacenter]  --host[hostname]
*
*<b>Command Line:to remove a Virtual Switch from a virtual center without specifying the host</b>
*run.bat com.vmware.samples.host.RemoveVirtualSwitch --url [webserviceurl] --username [username] --password  *[password]  --vsiwtchid [mySwitch] --datacenter [mydatacenter] 
*
*<b> Command Line:to remove a Virtual Switch from a virtual center without specifying the datacenter</b>
*run.bat com.vmware.samples.host.RemoveVirtualSwitch --url [webserviceurl] --username [username] --password  [password]  --vsiwtchid [mySwitch] --host [host]
*
*</pre>
*/




public class RemoveVirtualSwitch  {

   private static AppUtil cb = null;
   private static VMUtils vmUtils = null;   
   String datacenter = null;
   String host = null;
   String vswitchId = null;
   
   private void validate()throws Exception{
      ManagedObjectReference sic = cb.getConnection().getServiceInstanceRef();
      ServiceContent serCont 
         = (ServiceContent)cb.getServiceUtil().getDynamicProperty(sic,"content");
      String apiType = serCont.getAbout().getApiType();
      datacenter = cb.get_option("datacenter");
      host = cb.get_option("host");
      vswitchId = cb.get_option("vswitchid");
      try{
         if(apiType.equalsIgnoreCase("HostAgent")){
            if(host!=null){
               System.out.println("Host should not be specified"
                                 +" when running via Host");
               throw new ArgumentHandlingException("Host Specified");
            }
            if(datacenter ==null){
               System.out.println("Datacenter should be specified"
                                 +" when running via Host");
               throw new ArgumentHandlingException("Host Specified");
            }
         }
         else if(apiType.equalsIgnoreCase("VirtualCenter")){
            if((datacenter == null) && (host ==null)){
               System.out.println("Atleast one from datacenter"
                                 +" or host should be specified");
               throw new ArgumentHandlingException("Invalid Argument Specified");
            }
         }
      }
      catch(Exception e){
         throw e;
      }   
   }
  
   private void doRemoveVirtualSwitch() throws Exception {
      ManagedObjectReference dcmor ;
      ManagedObjectReference hostfoldermor ;
      ManagedObjectReference hostmor = null; 
      datacenter = cb.get_option("datacenter");
      host = cb.get_option("host");
      vswitchId = cb.get_option("vswitchid");
      try {
         if(((datacenter !=null) && (host !=null)) 
               ||((datacenter !=null) && (host ==null))) {
            dcmor 
               = cb.getServiceUtil().getDecendentMoRef(null, "Datacenter", datacenter);
            if(dcmor == null) {
               System.out.println("Datacenter not found");
               return;
            }
            hostfoldermor = vmUtils.getHostFolder(dcmor);
            hostmor = vmUtils.getHost(hostfoldermor, host);
         }
         else if ((datacenter ==null) && (host !=null)) {
            hostmor = vmUtils.getHost(null, host); 
         }
         if(hostmor != null) {
            Object cmobj 
               = cb.getServiceUtil().getDynamicProperty(hostmor, "configManager");
            HostConfigManager configMgr = (HostConfigManager)cmobj;
            ManagedObjectReference nwSystem = configMgr.getNetworkSystem();
            cb.getConnection().getService().removeVirtualSwitch(nwSystem, vswitchId);
            System.out.println(cb.getAppName() + " : Successful removing : " 
                             + vswitchId);
         }
         else {
            System.out.println("Host not found");
         }     
      }
      catch (NotFound e) {
         System.out.println(cb.getAppName() 
                         + " : Failed : virtual switch cannot be found. ");
      }
      catch (HostConfigFault e) {
         System.out.println(cb.getAppName() + " : Failed : Configuration falilures. ");
      }
      catch (ResourceInUse e) {
         System.out.println(cb.getAppName() + " : Failed removing switch "+ vswitchId);
         System.out.println("There are virtual network adapters "
                           +"associated with the virtual switch.");
      }
      catch (Exception e) {
         System.out.println(cb.getAppName() + " : Failed removing switch: "+ vswitchId);
         throw e;
      }
   }

   private static OptionSpec[] constructOptions() {
      OptionSpec [] useroptions = new OptionSpec[3];
      useroptions[0] = new OptionSpec("vswitchid","String",1
                                     ,"Name of the virtual switch"
                                     ,null);
      useroptions[1] = new OptionSpec("host","String",0,
                                      "Name of the host",
                                      null);
      useroptions[2] = new OptionSpec("datacenter","String",0,
                                      "Name of the datacenter",
                                      null);
      return useroptions;
   }     
   public static void main(String[] args) throws Exception {
      RemoveVirtualSwitch app = new RemoveVirtualSwitch();
      cb = AppUtil.initialize("RemoveVirtualSwitch"
                              ,RemoveVirtualSwitch.constructOptions()
                              ,args);
      cb.connect();
      vmUtils = new VMUtils(cb);
      app.validate();
      app.doRemoveVirtualSwitch();
      cb.disConnect();
   }
}

