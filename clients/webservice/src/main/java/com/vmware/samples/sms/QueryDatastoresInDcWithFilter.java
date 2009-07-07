package com.vmware.samples.sms;

import java.text.*;
import java.util.*;

import com.vmware.apputils.*;
import com.vmware.vim.sms.*;
import com.vmware.vim25.*;

/**
*<pre>
*This sample implements a function that
*
*<ul>
*<li> Gets the list of all instances of datacenter in the vCenter inventory. 
*<li> Iterates over each instance of datacenter and lists instances of datastore associated with it 
*<li> after applying a QuerySpec (i.e. SortSpec and FilterSpec) 
*</ul>
*
*<b>Command line:</b> 
*run.bat com.vmware.samples.sms.QueryDatastoresInDcWithFilter --url <webserviceurl> 
*--username <username> --password <password> --sortPropertyName <sortPropertyName> 
* 
* Sample command line to get all datastores on all datacenters in the inventory along with sample SortSpec and FilterSpec options
* 
*run.bat com.vmware.samples.sms.QueryDatastoresInDcWithFilter --url http://localhost/sdk --username administrator --password password --ignorecert 
*--sortPropertyName NAME 
* 
*</pre>
*/

public class QueryDatastoresInDcWithFilter {
   private static SmPortType service;
   private static com.vmware.vim.sms.ManagedObjectReference si;
   private static SmAppUtil cb = null;   
   Log log = new Log();   

   // Hardcoded entityType and relEntityType values
   private EntityReferenceEntityType entityType = EntityReferenceEntityType.datacenter;
   private EntityReferenceEntityType relEntityType = EntityReferenceEntityType.datastore;

   // User defined value of sortPropertyName
   String sortPropertyName = null;

   public void execute() throws Exception {
      SmServiceConnection conn = cb.getSmConnection();
      service = conn.getService();

      boolean relEntityTypeSpecified = false;

      sortPropertyName = cb.get_option("sortPropertyName");
      SortSpec[] sortSpec = getSortSpec();
      FilterSpec filterSpec = getFilterSpec();

      QuerySpec querySpec = new QuerySpec();
      querySpec.setMaxCount(0);
      querySpec.setOffset(0);
      querySpec.setFilterSpec(filterSpec);
      querySpec.setSortSpec(sortSpec);

      // Get all instances of entityType without using any QuerySpec
      QueryResult entityResult =                                                            
         service.queryList(si,                                                       
                           null,                                                   
                           entityType,
                           null);                                              

      Metadata metadata = entityResult.getMetadata();
      System.out.println("Retrieved " + metadata.getNumRows() + " datacenter(s)");
      printFormattedQueryListResult(entityResult,relEntityTypeSpecified);

      RowData[] rowData = entityResult.getRow();

      int entityIdIdx = 0;
      String[] propertyNames = metadata.getPropertyName();
      for (int i=0; i < propertyNames.length; ++i) {
         if (propertyNames[i].equalsIgnoreCase("entityid")) {
            entityIdIdx = i;
         }
      }
      //Iterates over each instance of entityType and lists instances of relEntity associated with it after applying QuerySpec. 
      for (int j=0; j < metadata.getNumRows(); ++j ) {
         String entityId = rowData[j].getColumn()[entityIdIdx];
         EntityReference entityRef = new EntityReference();
         entityRef.setId(entityId);
         entityRef.setType(entityType);
         relEntityTypeSpecified = true;

         QueryResult relEntityResult =                                                               
            service.queryList(si,                                                       
                              entityRef,
                              relEntityType,
                              querySpec);                                              

         System.out.println("For datacenter - " + (j+1) + 
                            " Retrieved " + relEntityResult.getMetadata().getNumRows() + " datastore(s)");

         printFormattedQueryListResult(relEntityResult,relEntityTypeSpecified);
      }
   }

   public SortSpec[] getSortSpec() throws Exception {
      if (sortPropertyName != null) {
         // Defining the sort Spec with user defined options
         SortSpec[] sortSpec = new SortSpec[1];
         sortSpec[0] = new SortSpec();
         sortSpec[0].setPropertyName(sortPropertyName);
         sortSpec[0].setAscending(true);
         return sortSpec;
      }
      return null;
   }

   public FilterSpec getFilterSpec() throws Exception {

      FilterSpec filterSpec = new FilterSpec();

      FilterSpecConstraint[] constraint1 = new FilterSpecConstraint[2];
      constraint1[0] = new FilterSpecConstraint();
      constraint1[0].setPropertyName("MULTIPATHINGSTATUS");
      constraint1[0].setPropertyValue("up"); 
      constraint1[0].setComparisonOperator(FilterSpecComparisonOperator.equal);
      constraint1[0].setChildConstraint(null);

      constraint1[1] = new FilterSpecConstraint();
      constraint1[1].setPropertyName("PERCENTFREE");
      constraint1[1].setPropertyValue("50"); 
      constraint1[1].setComparisonOperator(FilterSpecComparisonOperator.greaterThanOrEqual);
      constraint1[1].setChildConstraint(null);

      FilterSpecConstraint[] constraint2 = new FilterSpecConstraint[2];
      constraint2[0] = new FilterSpecConstraint();
      constraint2[0].setPropertyName("NAME");
      constraint2[0].setPropertyValue("LUN"); 
      constraint2[0].setComparisonOperator(FilterSpecComparisonOperator.beginsWith);
      constraint2[0].setChildConstraint(null);

      constraint2[1] = new FilterSpecConstraint();
      constraint2[1].setPropertyName("NUMVM");
      constraint2[1].setPropertyValue("1"); 
      constraint2[1].setComparisonOperator(FilterSpecComparisonOperator.greaterThanOrEqual);
      constraint2[1].setChildConstraint(null);

      FilterSpecConstraint[] parentConstraint = new FilterSpecConstraint[2];
      parentConstraint[0] = new FilterSpecConstraint();
      parentConstraint[0].setChildConstraint(constraint1);
      parentConstraint[0].setChildConstraintLogicalOperator(FilterSpecLogicalOperator.or);

      parentConstraint[1] = new FilterSpecConstraint();
      parentConstraint[1].setChildConstraint(constraint2);
      parentConstraint[1].setChildConstraintLogicalOperator(FilterSpecLogicalOperator.and);

      FilterSpecConstraint[] rootConstraint = new FilterSpecConstraint[1];
      rootConstraint[0] = new FilterSpecConstraint();
      rootConstraint[0].setChildConstraint(parentConstraint);
      rootConstraint[0].setChildConstraintLogicalOperator(FilterSpecLogicalOperator.and);

      filterSpec.setConstraint(rootConstraint[0]);
      return filterSpec;
   }

   public void printFormattedQueryListResult(QueryResult result,boolean relEntityTypeSpecified) throws Exception {

      int numRows = result.getMetadata().getTotalRows();
      RowData[] rows = result.getRow();
      String[] columnNames = result.getMetadata().getPropertyName();

      for (int rowCounter = 0; rowCounter < numRows; rowCounter++) {
         System.out.println("--------------------------------------------------------------------");
         int columnCounter=0;
         String[] columnValues = rows[rowCounter].getColumn();
         while (columnCounter < result.getMetadata().getPropertyName().length) {

            // In order to do special formatting of the output depending on the property type, 
            // get the type of each property.

            PropertyType propertyType = null;
            if (relEntityTypeSpecified) {
               propertyType = Catalog.getPropertyType(
                                                     entityType.getValue(), relEntityType.getValue(), 
                                                     columnNames[columnCounter]); 
            } else {
               propertyType = Catalog.getPropertyType(
                                                     entityType.getValue(),columnNames[columnCounter]); 
            }
            if (propertyType.equals(PropertyType.DoublePropertyType)) {
               if (columnValues[columnCounter] == null) {
                  System.out.println(columnNames[columnCounter] + " : 0 %");
               } else {
                  String pattern = "###.##";
                  DecimalFormat decimalFormatter = new DecimalFormat(pattern);
                  String formattedOutput = decimalFormatter.format(Double.parseDouble(columnValues[columnCounter]));
                  System.out.println(columnNames[columnCounter] + " : " +formattedOutput + " %");
               }
            } else if (propertyType.equals(PropertyType.LongPropertyType)) {
               if (columnValues[columnCounter] == null) {
                  System.out.println(columnNames[columnCounter] + " : 0 bytes");
               } else {
                  if (columnNames[columnCounter].contains("NUM")) {
                     System.out.println(columnNames[columnCounter] + " : " +columnValues[columnCounter]);
                  } else {
                     System.out.println(columnNames[columnCounter] + " : " +columnValues[columnCounter] + " bytes");
                  }
               }
            } else {
               System.out.println(columnNames[columnCounter] + " : " +columnValues[columnCounter]);
            }
            columnCounter++;
         }
         columnCounter = 0;
      }
   }

   private static OptionSpec[] constructOptions() {
      OptionSpec [] useroptions = new OptionSpec[1];
      useroptions[0] = new OptionSpec("sortPropertyName","String",1
                                      ,"Name of the property on which the obtained results are to be sorted"
                                      ,null);
      return useroptions;
   } 

   public static void main(String[] args) throws Exception {
      QueryDatastoresInDcWithFilter obj = new QueryDatastoresInDcWithFilter();
      cb = SmAppUtil.initialize("QueryDatastoresInDcWithFilter"
                                ,QueryDatastoresInDcWithFilter.constructOptions()
                                ,args);   
      cb.connect();
      obj.execute();
      cb.disConnect();         
   }
}
