package com.intalio.vmware.tree;

import java.util.ArrayList;
import java.util.List;

import com.vmware.apputils.AppUtil;
import com.vmware.apputils.OptionSpec;
import com.vmware.apputils.vim.VMUtils;
import com.vmware.vim.DynamicProperty;
import com.vmware.vim.ManagedObjectReference;
import com.vmware.vim.ObjectContent;

/**
 *<pre>
 * This sample is used to build a virtual center hierarchy that's
 * specified by the given url.  
 * 
 * </pre>
 */

public class ManagedTreeBuilder {

	private static AppUtil cb = null;
	private static VMUtils vmUtils = null;
	private ManagedTree managedTree = null;
	
	public ManagedTreeBuilder() {
	}
	
	public ManagedTree getManagedTree() {
		return managedTree;
	}

	public void setManagedTree(ManagedTree managedTree) {
		this.managedTree = managedTree;
	}
	
	public void build(String url, String username, String password) throws Exception {
		build(new String[] { url, username, password });
	}

	public void build(String[] args) throws Exception {
		// This is to accept all SSL certificates by default.
		System.setProperty(
				"org.apache.axis.components.net.SecureSocketFactory",
				"org.apache.axis.components.net.SunFakeTrustSocketFactory");
		cb = AppUtil.initialize("ManagedTreeBuilder", new OptionSpec[] {}, args);
		cb.connect();
		vmUtils = new VMUtils(cb);
		ObjectContent[] ocList = vmUtils.browseMOR(cb.getConnection().getServiceContent().getRootFolder());
		managedTree = constructTree(ocList);
		System.out.println("Tree = " + managedTree);
		cb.disConnect();
	}

	private ManagedTree constructTree(ObjectContent[] ocList) {
		ManagedTree tree = new ManagedTree();
		
		List<ManagedNode> nodes = new ArrayList<ManagedNode>();
		
		for (ObjectContent oc : ocList) {
			ManagedNode node = new ManagedNode();
			node.setObjectContent(oc);
			ManagedObjectReference mor = oc.getObj();
			DynamicProperty[] pcary = oc.getPropSet();
			DynamicProperty pc = null;
			
			node.setName(mor.get_value());
			
			if (pcary != null) {
				for (DynamicProperty element2 : pcary) {
					pc = element2;
					if (pc.getName().equalsIgnoreCase("name")) {
//						node.setName(pc.getVal().toString());
					} else if (pc.getName().equalsIgnoreCase("parent")) {
						node.setParentName(pc.getVal().toString());
						System.out.println("[" + pc.getName() + ", " + pc.getVal() + "]");
					}
//					System.out.println("[" + pc.getName() + ", " + pc.getVal() + "]");
				}
			}
			System.out.println("Node = " + node);
			nodes.add(node);
		}

		ManagedNode root = null;
		for (ManagedNode child : nodes) {
			for (ManagedNode parent : nodes) {
				if (parent == child) {
					continue;
				}
				if (child.getParentName() != null && child.getParentName().equals(parent.getName())) {
					child.setParent(parent);
					parent.addChild(child);
				}
			}
			if  (child.getParent() == null) {
				root = child;
			}
			System.out.println("Child = " + child + "'s parent = " + child.getParent());
		}
		
		tree.setRoot(root);
		return tree;
	}
	
	public static void main(String[] args) throws Exception {
		ManagedTreeBuilder app = new ManagedTreeBuilder();
		app.build(args);
	}
}
