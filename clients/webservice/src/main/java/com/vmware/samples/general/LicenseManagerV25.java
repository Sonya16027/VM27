package com.vmware.samples.general;

import java.util.*;
import com.vmware.apputils.version.*;
import com.vmware.vim25.*;


public class LicenseManagerV25 {
    ExtendedAppUtil ecb = null; 
    private static ManagedObjectReference licMgr = null;
    public LicenseManager licMngrObj=null;

   public void useLicenseManager25(ArrayList apiVersions, String [] args, 
                        String cookieString, LicenseManager obj ) throws Exception {

      ecb = ExtendedAppUtil.initialize("LicenseManagerV25"
                                       ,LicenseManager.constructOptions()
                                       ,args);
      
      licMngrObj = obj;
      ecb.connect(cookieString);
      licMgr = ecb.getServiceConnection3().getServiceContent().getLicenseManager();
      
      String action =  ecb.get_option("action");
      if(action.equalsIgnoreCase("browse")) {
         System.out.println("Display the license usage. " 
                             + "It gives details of license features "
                             + "like license key "
                             + " edition key and entity id.");
         displayLicenseUsage();
      }
      else if(action.equalsIgnoreCase("setserver")) {
         System.out.println("Adding the license key.");
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
      try {
          ManagedObjectReference licMgrMOR 
            = (ManagedObjectReference)ecb.getServiceUtil3().getDynamicProperty(licMgr,"licenseAssignmentManager");
          LicenseAssignmentManagerLicenseAssignment[] avail    
              = ecb.getServiceConnection3().getService().queryAssignedLicenses(licMgrMOR, null);
         print(avail);
     }
     catch(Exception e) {
         if(e instanceof org.apache.axis.AxisFault) {
            org.apache.axis.AxisFault fault = (org.apache.axis.AxisFault)e;
            org.w3c.dom.Element [] errors = fault.getFaultDetails();
            for(int i=0; i<errors.length; i++) {
               if(errors[i].toString().indexOf("InvalidRequestFault") != -1) {
                  System.out.println("Error:: Reference to an unknown managed object type or method.");
               }
               else if(errors[i].toString().indexOf("RuntimeFault") != -1) {
                  System.out.println(errors[i].toString());
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


   private void setLicenseServer() throws Exception {
      boolean flag = true;
      if(!ecb.option_is_set("licensekey")) {
       System.out.println("Error:: For KL servers licensekey is a mandatory option");
       flag = false;
      }
      if(flag) {
       String licKey = ecb.get_option("licensekey");
         try{
            String apitype = ecb.getServiceConnection3().getServiceContent().getAbout().getApiType();
            if(apitype.equalsIgnoreCase("VirtualCenter")) {
               String entity = ecb.getServiceConnection3().getServiceContent().getAbout().getInstanceUuid();
               ManagedObjectReference licMgrMOR 
                  = (ManagedObjectReference)ecb.getServiceUtil3().getDynamicProperty(licMgr,"licenseAssignmentManager");
               LicenseManagerLicenseInfo infoVC 
               = ecb.getServiceConnection3().getService().updateAssignedLicense(licMgrMOR,entity,licKey,null);
               System.out.println("License key set for VC server");
            }
            else if(apitype.equalsIgnoreCase("HostAgent")) {
               LicenseManagerLicenseInfo info1 
                  = ecb.getServiceConnection3().getService().decodeLicense(licMgr,licKey);
               LicenseManagerLicenseInfo info 
               = ecb.getServiceConnection3().getService().updateLicense(licMgr,licKey,null);	
               System.out.println("License key set for ESX server");
             }
          }
         catch(Exception e){
           if(e instanceof org.apache.axis.AxisFault) {
              org.apache.axis.AxisFault fault = (org.apache.axis.AxisFault)e;
              org.w3c.dom.Element [] errors = fault.getFaultDetails();
              for(int i=0; i<errors.length; i++) {
                 if(errors[i].toString().indexOf("InvalidLicense") != -1) {
                  System.out.println("License key is not valid");   
                 }
                 else if(errors[i].toString().indexOf("RuntimeFault") != -1) {
                  System.out.println(errors[i].toString());
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
   
   private void setEdition() {
      System.out.println("This feature is not supported in ESX 4.0 servers");
   } 

    private void displayFeatureInfo() throws Exception {
       licMngrObj.displayFeatureInfo();
   }


   private void print(LicenseAssignmentManagerLicenseAssignment[] licAssignment) {
        if(licAssignment != null) {
           for(int i = 0 ; i<licAssignment.length; i++ ) {
              String entityId = licAssignment[i].getEntityId();
              String editionKey = licAssignment[i].getAssignedLicense().getEditionKey();
              String licenseKey = licAssignment[i].getAssignedLicense().getLicenseKey();
              String name = licAssignment[i].getAssignedLicense().getName();
              int total = licAssignment[i].getAssignedLicense().getTotal();
              System.out.println("\nName of the license: "+name+ "\n License Key:  " +licenseKey+ 
               "\n Edition Key: "+editionKey+ "\n EntityID: "+entityId+ "\n\n" );
            }
        }
    }
   

}