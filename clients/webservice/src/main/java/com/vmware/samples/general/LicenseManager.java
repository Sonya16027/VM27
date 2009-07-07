package com.vmware.samples.general;

import java.util.ArrayList;
import com.vmware.apputils.*;
import com.vmware.apputils.version.*;
import com.vmware.vim.*;
import com.vmware.apputils.vim.*;
import java.util.*;
import java.io.*;


/**
 *<pre>
 *Demonstrates uses of the Licensing API using License Managed Object
 *Reference.
 * 
 *<b>To run this samples following parameters are used :</b>
 *
 *action     [required]   : action to be performed [browse|setserver|setedition|featureinfo]
 *serverurl  [optional]   : url of license server
 *edition    [optional]   : Licensed edition 
 *feature    [optional]   : Licensed feature 
 *licensekey [optional]   : License key for KL servers
 *
 *<b>Command:</b>
 *<b>action as 'browse' and give the valid url , all the licence will be displayed </b>
 *run.bat com.vmware.samples.general.LicenseManager --url [webserviceurl]
 *--username [username] --password [password] --action[browse] 
 *
 *<b>Set the licence edition</b>
 *run.bat com.vmware.samples.general.LicenseManager --url [webserviceurl]
 *--username [username] --password [password] --action[setedition] --edition [esxFull]
 *
 *<b>To retrieve the feature information </b>
 *run.bat com.vmware.samples.general.LicenseManager --url [webserviceurl]
 *--username [username] --password [password] --action[featureinfo] --feature [drs]
 *
 *
 *<b>Set the licence source to the specified server</b>
 *run.bat com.vmware.samples.general.LicenseManager --url [webserviceurl]
 *--username [username] --password [password] --action[setserver] --serverurl [url]
 *
 **run.bat com.vmware.samples.general.LicenseManager --url [webserviceurl]
 *--username [username] --password [password] --action[setserver] --licensekey [key]
 *</pre>
 */



public class LicenseManager {
   private static AppUtil cb = null;
   private static ManagedObjectReference licMgr = null;

   private void getVersion(String args[], LicenseManager obj) throws Exception {
       ArrayList apiVersions = VersionUtil.getSupportedVersions(
                                              cb.get_option("url"));
       if(VersionUtil.isApiVersionSupported(apiVersions,"4.0")) {
           String cookieString = VersionUtil.getCookieString(cb);
            // go to the v25 sample
           LicenseManagerV25 licMngrV25obj  = new LicenseManagerV25(); 
           licMngrV25obj.useLicenseManager25(apiVersions,args,cookieString,obj); 
           
       }
       else {
       	useLicenseManager();
       	//use the existing sample
       }
    }
    
    private void useLicenseManager() throws Exception {
      String action = cb.get_option("action");
      if(action.equalsIgnoreCase("browse")) {
         System.out.println("Display the license usage. " 
                             + "The license usage is a list of supported features"
                             + " and the"                                        
                             + " number of licenses that have been reserved.");
         displayLicenseUsage();
      }
      else if(action.equalsIgnoreCase("setserver")) {
         System.out.println("Set the License server.");
         setLicenseServer();
      }
      else if(action.equalsIgnoreCase("setedition")) {
         System.out.println("Set the License Edition.");
         setEdition();
      }
      else if(action.equalsIgnoreCase("featureinfo")) {
         displayFeatureInfo();
      }
      else {
         System.out.println("Invalid Action ");
         System.out.println("Valid Actions [browse|setserver|setedition|featureinfo]");
      }
   }
   
    private void displayLicenseUsage() throws Exception {
      ObjectContent[] licContent = 
         cb.getServiceUtil().getObjectProperties(null,
                                                 licMgr,new String[] {"source", 
                                                                      "sourceAvailable",
                                                                      "featureInfo" });
      LicenseUsageInfo licUsage =
                  cb.getConnection().getService().queryLicenseUsage(licMgr, null);
      LicenseAvailabilityInfo[] avail =
                  cb.getConnection().getService().queryLicenseSourceAvailability(licMgr,
                  null);
      print(licUsage);
      print(avail);
   }
   
   private void setLicenseServer() throws Exception {
     boolean flag = true;
     
     if(!cb.option_is_set("serverurl")) {
            System.out.println("For action setserver --serverurl" + 
                               " is mandatory argument");
             flag = false;
      }
      if(flag) {
         LicenseServerSource source = new LicenseServerSource();
          source.setLicenseServer(cb.get_option("serverurl"));
          try{
             cb.getConnection().getService().configureLicenseSource(licMgr, null, source);
          }
          catch(Exception e) {
             if(e instanceof org.apache.axis.AxisFault) {
                org.apache.axis.AxisFault fault = (org.apache.axis.AxisFault)e;
                org.w3c.dom.Element [] errors = fault.getFaultDetails();
                for(int i=0; i<errors.length; i++) {
                   if(errors[i].toString().indexOf("InvalidLicense") != -1) {
                      System.out.println("License file is not valid");	   
                   }
                   else if(errors[i].toString().indexOf("NotEnoughLicenses") != -1) {
                      System.out.println("New license source does not have " +
                                         "enough licenses.");
                   }
                   else if(errors[i].toString().indexOf("LicenseServerUnavailable") != -1) {
                      System.out.println("License server is unreachable.");
                   }
                   else {
                      System.out.println(errors[i].toString());
                   }
                } 
             }
             else {
                throw e;
             }
          }
      }
   }
 
   private void setEdition() throws Exception {
      boolean valid = validate(cb.get_option("edition"));
      if(valid) {
         try{      
            cb.getConnection().getService().setLicenseEdition(licMgr,
                                          null, cb.get_option("edition"));
         }
         catch(Exception e) {
            if(e instanceof org.apache.axis.AxisFault) {
               org.apache.axis.AxisFault fault = (org.apache.axis.AxisFault)e;
               org.w3c.dom.Element [] errors = fault.getFaultDetails();
               for(int i=0; i<errors.length; i++) {
                  if(errors[i].toString().indexOf("InvalidState") != -1) {
                     System.out.println("Feature cannot be supported on the platform");
                  }
                  else if(errors[i].toString().indexOf("InvalidArgument") != -1) {
                     System.out.println("Feature key is not an edition feature key.");
                  }               
                  else {
                     System.out.println(errors[i].toString());
                  }
               } 
            }
            else {
               throw e;
            }
         }
      }
   }
   
   public void displayFeatureInfo() throws Exception {
      boolean valid = validate(cb.get_option("feature"));
      com.vmware.vim.LicenseFeatureInfo [] feature = 
         (com.vmware.vim.LicenseFeatureInfo [])
         cb.getServiceUtil().getDynamicProperty(licMgr,"featureInfo");
      boolean flag = false;
       if(feature !=null) {
         for(int i=0 ;i < feature.length; i++) {
            if(feature[i].getKey().equalsIgnoreCase(cb.get_option("feature"))) {
               System.out.println("Name       " + feature[i].getFeatureName());
               System.out.println("Unique Key " + feature[i].getKey());
               System.out.println("State      " + feature[i].getState());
               System.out.println("Cost Unit  " + feature[i].getCostUnit());
               i = feature.length + 1;
               flag = true;
            }
         }
      }
      else if(feature == null) {
      System.out.println("Feature Not Available");
      }
   }     
   
   public boolean validate(String feature){
      String [] features = {"backup","das","drs","esxExpress","esxFull"
                           ,"esxHost","esxVmtn","gsxHost","iscsi","nas",
                            "san","vc","vmotion","vsmp"};
      boolean flag = false;
      for(int i=0; i<features.length; i++) {
         if(features[i].equals(feature)){
            flag = true;
            i = features.length + 1;
         }
      }
      if(!flag) {
         System.out.println("Invalid Edition / Feature : " +
                            "Specify the edition/feature from below list");
         System.out.println("backup     "+"Enable ESX Server consolidated" + 
                            "backup feature. This is a per CPU package license.");
         System.out.println("das        "+"Enable VirtualCenter HA. This is a per" + 
                            "ESX server CPU package license.");
         System.out.println("drs        "+"Enable VirtualCenter Distributed Resource" + 
                            "Scheduler. This is a per ESX server CPU package license.");
         System.out.println("esxExpress "+
                            "The edition license for the ESX server, Starter edition." + 
                            "This is a per CPU package license.");
         System.out.println("esxFull    "+
                            "The edition license for the ESX Server, Standard edition." + 
                            "This is a per CPU package license.");
         System.out.println("esxHost    "+
                            "Enable VirtualCenter ESX Server host management" + 
                            "functionality." + 
                            "This is a per ESX server CPU package license. ");
         System.out.println("esxVmtn    "+
                            "The edition license for the ESX server, VMTN edition." + 
                            "This is a per CPU package license. ");
         System.out.println("gsxHost    "+
                            "Enable VirtualCenter GSX Server host management" + 
                            "functionality. This is a per GSX server CPU " + 
                            "package license. ");
         System.out.println("iscsi      "+"Enable use of iSCSI. This is a per " +
                            "CPU package license.");
         System.out.println("nas        "+
                            "Enable use of NAS. This is a per CPU package license.");
         System.out.println("san        "+
                            "Enable use of SAN. This is a per CPU package license.");
         System.out.println("vc"+
                            "The edition license for a VirtualCenter server, full" + 
                            "edition. This license is independent of the number of" + 
                            "CPU packages for the VirtualCenter host.");
         System.out.println("vmotion "+"Enable VMotion. This is a per ESX server" + 
                            "CPU package license.");
         System.out.println("vsmp       "+
                            "Enable up to 4-way VSMP feature." + 
                            "This is a per CPU package license.");
      }
      return flag;
   }
   
   private void print(LicenseUsageInfo usage) {
      if(usage != null && usage.getFeatureInfo() != null) {
         String fState = "";
         for(int i=0; i<usage.getFeatureInfo().length; ++i) {
            print(usage.getFeatureInfo(i));
         }
         if(usage.getReservationInfo() != null) {
            for(int i=0; i<usage.getReservationInfo().length; ++i) {
               print(usage.getReservationInfo(i));
            }
         }
      } else {
         System.out.println(" : No usage returned.");
      }
   }
   
   private void print(LicenseFeatureInfo feature) {
      LicenseFeatureInfoState state = feature.getState();
      String fState;
      if(state == null) {
         fState = "Edition";
      } else if(LicenseFeatureInfoState.enabled == state) {
         fState = "Included";
      } else if(LicenseFeatureInfoState.disabled == state) {
         fState = "Disabled";
      } else {
         fState = "Optional";
      }
      System.out.println(" : F: " + feature.getKey() +
            ", Cost: " + feature.getCostUnit() +
            ", State: " + fState);
   }

   private void print(LicenseReservationInfo reservation) {
      System.out.println(" : R: " + reservation.getKey() +
            ", Required: " + reservation.getRequired() +
            ", State: " + reservation.getState());
   }
   
   private void print(LicenseAvailabilityInfo[] avail) {
      System.out.println(" : License Available Info:");
      if(avail != null) {
         for(int i=0; i<avail.length; ++i) {
            LicenseAvailabilityInfo info = avail[i];
            print(info.getFeature());
            System.out.println(" : Total: " + info.getTotal()+
                  ", Avaliable: " + info.getAvailable());
         }
      } else {
         System.out.println(" : No usage returned.");
      }
   }
    
    private boolean customValidation() throws Exception{
      boolean flag = true;
      String action = cb.get_option("action");
      if(action.equalsIgnoreCase("setedition")) {
         if(!cb.option_is_set("edition")) {
            System.out.println("For action setedition --edition is "+
                               "mandatory argument");
            flag = false;
         }
      }
      else if(action.equalsIgnoreCase("featureinfo")) {
         if(!cb.option_is_set("feature")) {
           System.out.println("For action featureinfo --feature is " + 
                              "mandatory argument");
           flag = false;
         }
      }
      return flag;
    }
       
       
       
      public static OptionSpec[] constructOptions() {
      OptionSpec [] useroptions = new OptionSpec[5];
      useroptions[0] = new OptionSpec("action","String",1,
                                      "[browse|setserver|setedition|featureinfo]"
                                      ,null);
      useroptions[1] = new OptionSpec("serverurl","String",0,
                                      "License Server URL",
                                      null);
      useroptions[2] = new OptionSpec("edition","String",0,
                                      "License Edition",
                                      null);
      useroptions[3] = new OptionSpec("feature","String",0,
                                      "Key of the feature",
                                      null);
      useroptions[4] = new OptionSpec("licensekey","String",0,
                                      "License Key for KL servers for setserver option",
                                      null);
      return useroptions;
   }
   
   
   public static void main(String[] args) throws Exception {
      LicenseManager app = new LicenseManager();
      cb = AppUtil.initialize("LicenseManager",LicenseManager.constructOptions(),args);
      boolean valid = app.customValidation();
      if(valid) {
        try {
         cb.connect();
         licMgr = cb.getConnection().getServiceContent().getLicenseManager();
         app.getVersion(args,app);
         cb.disConnect();
        }
      catch(Exception e) {
         System.out.println("Error:: "+e);
      }
     }
   }

} 