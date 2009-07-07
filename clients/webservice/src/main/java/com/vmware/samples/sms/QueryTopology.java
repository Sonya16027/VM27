package com.vmware.samples.sms;
import java.util.*;
import com.vmware.apputils.*;
import com.vmware.vim.sms.*;

/**
*<pre>
*This sample implements a function that
*
*<ul>
*Displays each and every node and all the edges containing that node in the topology graph. 
*</ul>
*
*<b>Command line: </b> 
*run.bat com.vmware.samples.sms.QueryTopology --url <webserviceurl> 
*--username <username> --password <password> --dcName <Name of the datacenter> --ignorecert

*Sample Command line 
*run.bat com.vmware.samples.sms.QueryTopology --url http://localhost/sdk username administrator 
*--password password --dcName datacenter --ignorecert 
*</pre>
*/

public class QueryTopology {
   private static SmPortType service;
   private static com.vmware.vim.sms.ManagedObjectReference si;

   private static SmAppUtil cb = null;   
   Log log = new Log();   

   public void execute() throws Exception {
      SmServiceConnection conn = cb.getSmConnection();
      service = conn.getService();

      // Get the EntityReferene corresponding to the datacenter
      EntityReference dcRef = getDcEntityReference();

      com.vmware.vim.sms.Map smsTopologyMap = service.queryTopology(si,dcRef);

      // Construct a HashMap containing all nodes for efficient retrieval
      HashMap<EntityReference,Node> nodeMap = new HashMap<EntityReference,Node>();
      List <Node> nodeList = Arrays.asList(smsTopologyMap.getNode());
      ListIterator<Node> nodeListIterator = nodeList.listIterator();
      while (nodeListIterator.hasNext()) {
         Node node = nodeListIterator.next();
         nodeMap.put(node.getEntity(),node);
      }

      //Display each and every node and all the edges containing that node in the topology graph. 
      Iterator nodeIterator = nodeMap.keySet().iterator();
      while (nodeIterator.hasNext()) {

         Node node = nodeMap.get(nodeIterator.next());

         System.out.println("--------------------------------------------------------------------");
         System.out.println("Node Type - " + node.getEntity().getType());
         System.out.println("Node name - " + node.getName());
         System.out.println("Edges containing this node \nOutput Format : <Source Node> <Destination Node> <Edge Status>");

         List <Edge> edgeList = Arrays.asList(smsTopologyMap.getEdge());
         ListIterator<Edge> edgeListIterator = edgeList.listIterator();
         while (edgeListIterator.hasNext()) {
            Edge edge = edgeListIterator.next();
            if ( edge.getSourceEntity().getId().equals(node.getEntity().getId()) || 
                 edge.getDestEntity().getId().equals(node.getEntity().getId()))
               System.out.println(nodeMap.get(edge.getSourceEntity()).getName()+ " " +
                                  nodeMap.get(edge.getDestEntity()).getName()+ " " +
                                  edge.getStatus());
         }
      }
   }

   private EntityReference getDcEntityReference() throws Exception {

      String dcName = cb.get_option("dcName");

      com.vmware.vim.ManagedObjectReference dcMoRef 
         = cb.getServiceUtil().getDecendentMoRef(null, "Datacenter", dcName);
      if (dcMoRef == null) {
         System.out.println("Datacenter not found");
         System.exit(1);
      }
      return EntityHelper.parseEntityReference(dcMoRef);
   }

   private static OptionSpec[] constructOptions() {
      OptionSpec [] useroptions = new OptionSpec[1];
      useroptions[0] = new OptionSpec("dcName","String",1
                                      ,"Name of the datacenter"
                                      ,null);
      return useroptions;
   } 

   public static void main(String[] args) throws Exception {
      QueryTopology obj = new QueryTopology();
      cb = SmAppUtil.initialize("QueryTopology"
                                ,QueryTopology.constructOptions()
                                ,args);      
      cb.connect();
      obj.execute();
      cb.disConnect();         
   }
}


