package com.vmware.samples.host;

import com.vmware.vim.*;
import com.vmware.apputils.*;
import com.vmware.apputils.vim.*;
import com.vmware.apputils.vim.VMUtils;



/**
*<pre>
*This sample is used to remove a Virtual Nic  
*
*To run this samples following parameters are used:
*
*portgroupname  [required]: Name of the port group from which the nic is to be removed
*host           [optional]: Name of the host
*datacenter     [optional]: Name of the datacenter
*
*<b>Parameters:</b>
*<b>Command Line:to remove a Host VirtualNic from a PortGroup</b>
*run.bat com.vmware.samples.host.RemoveVirtualNic --url [webserviceurl] --username [username] --password  [password] 
*--datacenter [mydatacenter] --portgroupname [myportgroup]>  --host [hostname]
*
*<b>Command Line:to remove a Host VirtualNic from a PortGroup without specifying the host</b>
*run.bat com.vmware.samples.host.RemoveVirtualNic --url [webserviceurl] --username [username] --password  [password] 
*--datacenter [mydatacenter] --portgroupname [myportgroup]
*
*<b>Command Line:to remove a Host VirtualNic from a PortGroup without specifying the datacenter</b>
*run.bat com.vmware.samples.host.RemoveVirtualNic --url [webserviceurl] --username [username] --password  [password] 
*--portgroupname [myportgroup] --host [name of the host]
*</pre>
*/



public class RemoveVirtualNic {

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
               throw new ArgumentHandlingException("Host Specified");
            }
            if(datacenter ==null){
               System.out.println("Datacenter should be specified "
                                +" when running via Host");
               throw new ArgumentHandlingException("Host Specified");
            }
         }
         else if(apiType.equalsIgnoreCase("VirtualCenter")){
            if((datacenter == null) && (host ==null)){
               System.out.println("Atleast one from datacenter "
                                 +" or host should be specified");
                  throw new ArgumentHandlingException("Invalid Argument Specified");
            }
         }
      }
      catch(Exception e){
         throw e;
      }   
   }

   private void doRemoveVirtualNic() throws Exception {
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
   
            Object obj 
               = cb.getServiceUtil().getDynamicProperty(nwSystem, "networkInfo.vnic");
            HostVirtualNic[] hvns = (HostVirtualNic[])obj;
            boolean found_one = false;
            if (hvns != null) {
               for (int i=0; i<hvns.length; i++) {
                  HostVirtualNic nic = hvns[i];
                  String portGroup = nic.getPortgroup();
                  if (portGroup.equals(portGroupName)) {
                     found_one = true;
                     cb.getConnection().getService().removeVirtualNic(nwSystem, 
                                                                      nic.getDevice());
                  }
               }
            }
            if (found_one) {
               System.out.println(cb.getAppName() 
                               + " : Successful removing : " +portGroupName );
            } else {
               System.out.println(cb.getAppName() 
                               + " : PortGroupName not found failed removing : " 
                               + portGroupName );
            }
         }
         else {
            System.out.println("Host not found");
         }     
      }
      catch (NotFound e) {
         System.out.println(cb.getAppName() 
                      + " : Failed : virtual network adapter cannot be found. ");
      }
      catch (HostConfigFault e) {
         System.out.println(cb.getAppName() 
                         + " : Failed : Configuration falilures. ");
      }
      catch (Exception e) {
         System.out.println(cb.getAppName() + " : Failed removing nic: "
                          + portGroupName);
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
      RemoveVirtualNic app = new RemoveVirtualNic();
      cb = AppUtil.initialize("RemoveVirtualNic",
                              RemoveVirtualNic.constructOptions(),
                              args);
      cb.connect();
      vmUtils = new VMUtils(cb);
      app.validate();
      app.doRemoveVirtualNic();
      cb.disConnect();
   }
}

