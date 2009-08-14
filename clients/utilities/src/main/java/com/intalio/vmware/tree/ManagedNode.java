package com.intalio.vmware.tree;

import java.util.ArrayList;
import java.util.List;

import com.vmware.vim.DynamicProperty;
import com.vmware.vim.ManagedObjectReference;
import com.vmware.vim.ObjectContent;

public class ManagedNode {
	public static final String MANAGED_OBJECT_TYPE_FOLDER = "Folder";
	public static final String MANAGED_OBJECT_TYPE_VIRTUAL_MACHINE = "VirtualMachine";
	public static final String MANAGED_OBJECT_CLUSTER = "ClusterComputeResource";
	public static final String MANAGED_OBJECT_COMPUTE_RESOURCE = "ComputeResource";
	public static final String MANAGED_OBJECT_TYPE_DATACENTER = "Datacenter";
	public static final String MANAGED_OBJECT_TYPE_RESOURCE_POOL = "ResourcePool";
	public static final String MANAGED_OBJECT_TYPE_RESOURCE_HOST = "HostSystem";
	
	protected List<ManagedNode> children = new ArrayList<ManagedNode>();
	protected ObjectContent objectContent;
	protected ManagedNode parent;
	protected String parentName;
	protected String name;	

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ManagedNode getParent() {
		return parent;
	}

	public void setParent(ManagedNode parent) {
		this.parent = parent;
	}

	public List<ManagedNode> getChildren() {
		return children;
	}

	public void setChildren(List<ManagedNode> children) {
		this.children = children;
	}
	
	public List<ManagedNode> getChildren(String type) {
		ArrayList<ManagedNode> children = new ArrayList<ManagedNode>();
		if (type != null) {
			for (ManagedNode child : this.children) {
				if (type.equals(child.getType())) {
					children.add(child);
				}
			}
		}
		return children;
	}
	
	public void addChild(ManagedNode node) {
		children.add(node);
	}
	
	public void removeChild(ManagedNode node) {
		children.remove(node);
	}

	public ObjectContent getObjectContent() {
		return objectContent;
	}

	public void setObjectContent(ObjectContent objectContent) {
		this.objectContent = objectContent;
	}
	
	public ManagedObjectReference getMOR() {
		return objectContent != null ? objectContent.getObj() : null;
	}
	
	public String getType() {
		return getMOR() != null ? getMOR().getType() : null;
	}
	
	public String getAttribute(String name) {
		if (objectContent != null) {
			for (DynamicProperty dp : objectContent.getPropSet()) {
				if (dp.getName().equalsIgnoreCase(name)) {
					Object value = dp.getVal();
					if (value != null && value.getClass().isPrimitive()) {
						return value.toString();
					}
				}
			}
		}
		return null;
	}
	
	protected int getDepth() {
		int depth = 0;
		for (ManagedNode parent = this; parent != null; parent = parent.getParent()) {
			depth++;
		}
		return depth;
	}
	
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("\n");
		for (int i = 0; i < getDepth(); i++) {
			buffer.append("\t");
		}
		buffer.append("{ type :  " + getType() + ", name : " + getName() + ", children : [");
		if (children != null && children.size() > 0) {
			buffer.append("\n");
			for (int i = 0; i < getDepth(); i++) {
				buffer.append("\t");
			}
			buffer.append("\t");
			for (ManagedNode node : children) {
				buffer.append(node);
				buffer.append(", ");
			}
			buffer.deleteCharAt(buffer.length() - 1);
			buffer.deleteCharAt(buffer.length() - 1);
			buffer.append("\n");
			for (int i = 0; i < getDepth(); i++) {
				buffer.append("\t");
			}
		}
		buffer.append("] }");
		return buffer.toString();
	}

}
