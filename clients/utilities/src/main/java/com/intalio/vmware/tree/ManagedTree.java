package com.intalio.vmware.tree;

public class ManagedTree {
	protected ManagedNode root;

	public ManagedNode getRoot() {
		return root;
	}

	public void setRoot(ManagedNode root) {
		this.root = root;
	}
	
	@Override
	public String toString() {
		return "{ root : " + root + " }";
	}
}
