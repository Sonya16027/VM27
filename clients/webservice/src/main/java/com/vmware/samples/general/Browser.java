package com.vmware.samples.general;

import com.vmware.vim.*;
import com.vmware.apputils.*;
import com.vmware.apputils.vim.*;
import java.util.*;

 /**
 *<pre>
 *This sample prints all managed entity, its type, reference value,
 *property name, Property Value, Inner Object Type,
 *its Inner Reference Value and inner property value. 
 *This samples consists of one main function named printInventory
 *which basically prints all the above mentioned values.
 *
 *<b>Command:</b>
 *e.g. run.bat com.vmware.samples.general.Browser --url [webserviceurl] --username
 *[username] --password [password]
 *</pre>
 */
  
public class Browser {

   private static AppUtil cb = null;   
   private String[][] typeInfo;

   private void printInventory() throws Exception {
      try {         
         typeInfo = new String[][] { 
                    new String[] { "ManagedEntity",  "name" }, 
         };
         ObjectContent[] ocary = 
         cb.getServiceUtil().getContentsRecursively(null, null, typeInfo, true);
         
         ObjectContent oc = null;
         ManagedObjectReference mor = null;
         DynamicProperty[] pcary = null;
         DynamicProperty pc = null;
         
         if(ocary != null) {
            for (int oci = 0; oci < ocary.length; oci++) {
               oc = ocary[oci];
               mor = oc.getObj();
               pcary = oc.getPropSet();

               cb.log.logLine("Object Type : " + mor.getType());
               cb.log.logLine("Reference Value : " + mor.get_value());
               
               if (pcary != null) {
                  for (int pci = 0; pci < pcary.length; pci++) {
                     pc = pcary[pci];
                     cb.log.logLine("   Property Name : " + pc.getName());
                     if (pc != null) {
                        if (!pc.getVal().getClass().isArray()) {
                           cb.log.logLine("   Property Value : " + pc.getVal());
                        } else {
                           Object[] ipcary = (Object[])pc.getVal();
                           cb.log.logLine("Val : " + pc.getVal());
                           for (int ii = 0; ii < ipcary.length; ii++) {
                              Object oval = ipcary[ii];
                              if (oval.getClass().getName().indexOf(
                                    "ManagedObjectReference") >= 0) {
                                 ManagedObjectReference imor = (ManagedObjectReference)oval;
                                 cb.log.logLine("Inner Object Type : " + imor.getType());
                                 cb.log.logLine("Inner Reference Value : " 
                                              + imor.get_value());
                              } else {
                                 cb.log.logLine("Inner Property Value : " + oval);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         cb.log.logLine("Done Printing Inventory");
      } 
      catch (Exception e) {
         System.out.println("Main Exceptions Are Here");        
         cb.getUtil().logException(e);
         cb.log.logLine(cb.getAppName() + " : Failed Getting Contents");
         throw e;
      }
      cb.log.logLine(cb.getAppName() + " : Successful Getting Contents");
   }
     
   
   public static void main(String[] args) throws Exception {     
      Browser obj = new Browser();
      cb = AppUtil.initialize("Browser",args);      
      cb.connect();            
      obj.printInventory();                   
      cb.disConnect();
   }
}

