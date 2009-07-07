package com.vmware.samples.host;

import com.vmware.vim.*;
import com.vmware.apputils.*;
import com.vmware.apputils.vim.*;
import com.vmware.apputils.vim.VMUtils;


/**
*<pre>
*This sample is used to remove a Virtual Switch PortGroup  
*
*To run this samples following parameters are used:
*
*<b>Parameters:</b>
*portgroupname  [required]: Name of the port group to be removed
*host           [optional]: Name of the host
*datacenter     [optional]: Name of the datacenter
*
*<b>Command Line: To remove a Virtual Switch Port Group</b>
*run.bat com.vmware.samples.host.RemoveVirtualSwitchPortGroup --url [webserviceurl] 
*--username [username] --password  <password> 
*--datacenter [mydatacenter] --portgroupname[<myportgroup] --host <hostname>
*
*<b>Command Line: To remove a Virtual Switch Port Group without specifying the host name</b>
*run.bat com.vmware.samples.host.RemoveVirtualSwitchPortGroup --url [webserviceurl] 
*--username [username] --password  <password> 
*--datacenter [mydatacenter] --portgroupname[<myportgroup]
*
*<b>Command Line: To remove a Virtual Switch Port Group without specifying the datacenter name</b>
*run.bat com.vmware.samples.host.RemoveVirtualSwitchPortGroup --url [webserviceurl] --username [username] --password  <password> 
*--portgroupname[<myportgroup] --host<hostname>
*</pre>
*/

public class RemoveVirtualSwitchPortGroup {
   private static AppUtil cb = null;   
   private static VMUtils vmUtils = null;
   String datacenter = null;
   String host = null;
   String vswitchId = null;
   String portGroupName = null;
   
   private void validate()throws Exception{
      ManagedObjectReference sic = cb.getConnection().getServiceInstanceRef();
      ServiceContent serCont 
         = (ServiceContent)cb.getServiceUtil().getDynamicProperty(sic,"content");
      String apiType = serCont.getAbout().getApiType();
      datacenter = cb.get_option("datacenter");
      host = cb.get_option("host");
      portGroupName = cb.get_option("portgroupname");     
      try{
         if(apiType.equalsIgnoreCase("HostAgent")){
            if(host!=null){
               System.out.println("Host should not be specified"
                                +" when running via Host");
               throw new ArgumentHandlingException("Host should not be Specified");
            }
            if(datacenter ==null){
               System.out.println("Datacenter should be specified"
                                +" when running via Host");
               throw new ArgumentHandlingException("Datacenter not Specified");
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
   
   private void doRemoveVirtualSwitchPortGroup() throws Exception {
      ManagedObjectReference dcmor ;
      ManagedObjectReference hostfoldermor ;
      ManagedObjectReference hostmor = null; 
      datacenter = cb.get_option("datacenter");
      host = cb.get_option("host");
      portGroupName = cb.get_option("portgroupname");
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
            HostNetworkInfo netInfo 
               = (HostNetworkInfo)cb.getServiceUtil().getDynamicProperty(nwSystem,
                                                                        "networkInfo");
            cb.getConnection().getService().removePortGroup(nwSystem, portGroupName);
            System.out.println(cb.getAppName() + " : Successful removing portgroup "
                             + portGroupName);
         }
         else {
            System.out.println("Host not found");
         }      
      }
      catch (ResourceInUse e) {
         System.out.println(cb.getAppName() + " : Failed removing portgroup "
                          + portGroupName);
         System.out.println("port group can not be removed because "
                           +"there are virtual network adapters associated with it.");
      }
      catch (InvalidArgument e) {
         System.out.println(cb.getAppName() + " : Failed removing  " + portGroupName);
         System.out.println("PortGroup vlanId or network policy may be invalid .\n");
      }   
      catch (NotFound e) {
         System.out.println(cb.getAppName() + " : Failed removing "+ portGroupName);
         System.out.println(" Switch or portgroup not found.\n");
      }
      catch (NullPointerException e) {
         System.out.println(cb.getAppName() + " : Failed removing "+ portGroupName);
         System.out.println("Datacenter or Host may be invalid \n");
         throw e;
      }   
      catch (Exception e) {
         System.out.println(cb.getAppName() + " : Failed removing "+ portGroupName);
         throw e;
      } 
   }
   
   private static OptionSpec[] constructOptions() {
      OptionSpec [] useroptions = new OptionSpec[3];
      useroptions[0] = new OptionSpec("host","String",0
                                     ,"Name of the host"
                                     ,null);
      useroptions[1] = new OptionSpec("portgroupname","String",1,
                                      "Name of the portgroup",
                                      null);
      useroptions[2] = new OptionSpec("datacenter","String",0,
                                      "Name of the datacenter",
                                      null);
      return useroptions;
   }

   public static void main(String[] args) throws Exception {
      RemoveVirtualSwitchPortGroup app 
         = new RemoveVirtualSwitchPortGroup();
      cb = AppUtil.initialize("RemoveVirtualSwitchPortGroup"
                              ,RemoveVirtualSwitchPortGroup.constructOptions()
                              ,args);
      cb.connect();
      vmUtils = new VMUtils(cb);
      app.validate();
      app.doRemoveVirtualSwitchPortGroup();
      cb.disConnect();
   }
}

