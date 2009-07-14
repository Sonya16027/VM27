package com.intalio.vmware.sms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.vmware.apputils.EntityHelper;
import com.vmware.apputils.Log;
import com.vmware.apputils.OptionSpec;
import com.vmware.apputils.SmAppUtil;
import com.vmware.apputils.SmServiceConnection;
import com.vmware.vim.sms.Edge;
import com.vmware.vim.sms.EntityReference;
import com.vmware.vim.sms.Node;
import com.vmware.vim.sms.SmPortType;

/**
 *<pre>
 * his sample implements a function that
 * 
 * ul&gt;
 * isplays each and every node and all the edges containing that node in the topology graph. 
 * /ul&gt;
 * 
 * b&gt;Command line: &lt;/b&gt; 
 * un.bat com.intalio.vmware.sms.QueryTopology --url &lt;webserviceurl&gt; 
 * -username &lt;username&gt; --password &lt;password&gt; --dcName &lt;Name of the datacenter&gt; --ignorecert
 * 
 * ample Command line 
 * un.bat com.intalio.vmware.sms.QueryTopology --url http://localhost/sdk username administrator 
 * -password password --dcName datacenter --ignorecert
 *</pre>
 */

public class QueryTopology {
	private static SmPortType service;
	private static com.vmware.vim.sms.ManagedObjectReference si;

	private static SmAppUtil cb = null;

	private static OptionSpec[] constructOptions() {
		OptionSpec[] useroptions = new OptionSpec[1];
		useroptions[0] = new OptionSpec("dcName", "String", 1,
				"Name of the datacenter", null);
		return useroptions;
	}

	public static void main(String[] args) throws Exception {
		QueryTopology obj = new QueryTopology();
		cb = SmAppUtil.initialize("QueryTopology", QueryTopology
				.constructOptions(), args);
		cb.connect();
		obj.execute();
		cb.disConnect();
	}

	Log log = new Log();

	public void execute() throws Exception {
		SmServiceConnection conn = cb.getSmConnection();
		service = conn.getService();

		// Get the EntityReferene corresponding to the datacenter
		EntityReference dcRef = getDcEntityReference();

		com.vmware.vim.sms.Map smsTopologyMap = service
				.queryTopology(si, dcRef);

		// Construct a HashMap containing all nodes for efficient retrieval
		HashMap<EntityReference, Node> nodeMap = new HashMap<EntityReference, Node>();
		List<Node> nodeList = Arrays.asList(smsTopologyMap.getNode());
		ListIterator<Node> nodeListIterator = nodeList.listIterator();
		while (nodeListIterator.hasNext()) {
			Node node = nodeListIterator.next();
			nodeMap.put(node.getEntity(), node);
		}

		// Display each and every node and all the edges containing that node in
		// the topology graph.
		Iterator nodeIterator = nodeMap.keySet().iterator();
		while (nodeIterator.hasNext()) {

			Node node = nodeMap.get(nodeIterator.next());

			System.out
					.println("--------------------------------------------------------------------");
			System.out.println("Node Type - " + node.getEntity().getType());
			System.out.println("Node name - " + node.getName());
			System.out
					.println("Edges containing this node \nOutput Format : <Source Node> <Destination Node> <Edge Status>");

			List<Edge> edgeList = Arrays.asList(smsTopologyMap.getEdge());
			ListIterator<Edge> edgeListIterator = edgeList.listIterator();
			while (edgeListIterator.hasNext()) {
				Edge edge = edgeListIterator.next();
				if (edge.getSourceEntity().getId().equals(
						node.getEntity().getId())
						|| edge.getDestEntity().getId().equals(
								node.getEntity().getId())) {
					System.out.println(nodeMap.get(edge.getSourceEntity())
							.getName()
							+ " "
							+ nodeMap.get(edge.getDestEntity()).getName()
							+ " " + edge.getStatus());
				}
			}
		}
	}

	private EntityReference getDcEntityReference() throws Exception {

		String dcName = cb.get_option("dcName");

		com.vmware.vim.ManagedObjectReference dcMoRef = cb.getServiceUtil()
				.getDecendentMoRef(null, "Datacenter", dcName);
		if (dcMoRef == null) {
			System.out.println("Datacenter not found");
			System.exit(1);
		}
		return EntityHelper.parseEntityReference(dcMoRef);
	}
}
