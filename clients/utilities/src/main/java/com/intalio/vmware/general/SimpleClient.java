package com.intalio.vmware.general;

import com.vmware.apputils.AppUtil;
import com.vmware.vim.DynamicProperty;
import com.vmware.vim.ManagedObjectReference;
import com.vmware.vim.ObjectContent;
import com.vmware.vim.ObjectSpec;
import com.vmware.vim.PropertyFilterSpec;
import com.vmware.vim.PropertySpec;
import com.vmware.vim.SelectionSpec;
import com.vmware.vim.TraversalSpec;

/**
 * SimpleClient connects to the server, logs in, lists the inventory contents
 * (managed entities) at the console, and logs out. This sample uses the helper
 * classes {@link AppUtil} to perform the initial connection tasks. It also uses
 * the basic command-line arguments --url, --userName, and --password. </p>
 * <p>
 * To display the inventory list, SimpleClient obtains managed object references
 * for inventory objects by creating and using several traversal specifications,
 * to navigate the inventory and print the output. Traversal specifications are
 * data objects associated with the PropertyCollector managed object type. Using
 * these is considered an advanced topic.
 * </p>
 * 
 * <p>
 * <b>Usage Examples:</b>
 * </p>
 * 
 * <pre>
 * run.bat com.intalio.vmware.general.SimpleClient --url https://myVMwareServiceName.com/sdk
 * [webserviceurl]
 * --username [username] --password [password]
 *</pre>
 * 
 */

public class SimpleClient {
	private static AppUtil cb = null;

	public static void main(String[] args) throws Exception {
		SimpleClient obj = new SimpleClient();
		cb = AppUtil.initialize("SimpleClient", args);
		cb.connect();
		obj.getAndPrintInventoryContents();
		cb.disConnect();
	}

	private void getAndPrintInventoryContents() throws Exception {
		TraversalSpec resourcePoolTraversalSpec = new TraversalSpec();
		resourcePoolTraversalSpec.setName("resourcePoolTraversalSpec");
		resourcePoolTraversalSpec.setType("ResourcePool");
		resourcePoolTraversalSpec.setPath("resourcePool");
		resourcePoolTraversalSpec.setSkip(new Boolean(false));
		resourcePoolTraversalSpec
				.setSelectSet(new SelectionSpec[] { new SelectionSpec(null,
						null, "resourcePoolTraversalSpec") });

		TraversalSpec computeResourceRpTraversalSpec = new TraversalSpec();
		computeResourceRpTraversalSpec
				.setName("computeResourceRpTraversalSpec");
		computeResourceRpTraversalSpec.setType("ComputeResource");
		computeResourceRpTraversalSpec.setPath("resourcePool");
		computeResourceRpTraversalSpec.setSkip(new Boolean(false));
		computeResourceRpTraversalSpec
				.setSelectSet(new SelectionSpec[] { new SelectionSpec(null,
						null, "resourcePoolTraversalSpec") });

		TraversalSpec computeResourceHostTraversalSpec = new TraversalSpec();
		computeResourceHostTraversalSpec
				.setName("computeResourceHostTraversalSpec");
		computeResourceHostTraversalSpec.setType("ComputeResource");
		computeResourceHostTraversalSpec.setPath("host");
		computeResourceHostTraversalSpec.setSkip(new Boolean(false));

		TraversalSpec datacenterHostTraversalSpec = new TraversalSpec();
		datacenterHostTraversalSpec.setName("datacenterHostTraversalSpec");
		datacenterHostTraversalSpec.setType("Datacenter");
		datacenterHostTraversalSpec.setPath("hostFolder");
		datacenterHostTraversalSpec.setSkip(new Boolean(false));
		datacenterHostTraversalSpec
				.setSelectSet(new SelectionSpec[] { new SelectionSpec(null,
						null, "folderTraversalSpec") });

		TraversalSpec datacenterVmTraversalSpec = new TraversalSpec();
		datacenterVmTraversalSpec.setName("datacenterVmTraversalSpec");
		datacenterVmTraversalSpec.setType("Datacenter");
		datacenterVmTraversalSpec.setPath("vmFolder");
		datacenterVmTraversalSpec.setSkip(new Boolean(false));
		datacenterVmTraversalSpec
				.setSelectSet(new SelectionSpec[] { new SelectionSpec(null,
						null, "folderTraversalSpec") });

		TraversalSpec folderTraversalSpec = new TraversalSpec();
		folderTraversalSpec.setName("folderTraversalSpec");
		folderTraversalSpec.setType("Folder");
		folderTraversalSpec.setPath("childEntity");
		folderTraversalSpec.setSkip(new Boolean(false));
		folderTraversalSpec.setSelectSet(new SelectionSpec[] {
				new SelectionSpec(null, null, "folderTraversalSpec"),
				datacenterHostTraversalSpec, datacenterVmTraversalSpec,
				computeResourceRpTraversalSpec,
				computeResourceHostTraversalSpec, resourcePoolTraversalSpec });

		PropertySpec[] propspecary = new PropertySpec[] { new PropertySpec() };
		propspecary[0].setAll(new Boolean(false));
		propspecary[0].setPathSet(new String[] { "name" });
		propspecary[0].setType("ManagedEntity");

		PropertyFilterSpec spec = new PropertyFilterSpec();
		spec.setPropSet(propspecary);
		spec.setObjectSet(new ObjectSpec[] { new ObjectSpec() });
		spec.getObjectSet(0).setObj(cb.getConnection().getRootFolder());
		spec.getObjectSet(0).setSkip(new Boolean(false));
		spec.getObjectSet(0).setSelectSet(
				new SelectionSpec[] { folderTraversalSpec });

		// Recursively get all ManagedEntity ManagedObjectReferences
		// and the "name" property for all ManagedEntities retrieved
		ObjectContent[] ocary = cb.getConnection().getService()
				.retrieveProperties(
						cb.getConnection().getServiceContent()
								.getPropertyCollector(),
						new PropertyFilterSpec[] { spec });

		// If we get contents back. print them out.
		if (ocary != null) {
			ObjectContent oc = null;
			ManagedObjectReference mor = null;
			DynamicProperty[] pcary = null;
			DynamicProperty pc = null;
			for (ObjectContent element : ocary) {
				oc = element;
				mor = oc.getObj();
				pcary = oc.getPropSet();

				System.out.println("Object Type : " + mor.getType());
				System.out.println("Reference Value : " + mor.get_value());

				if (pcary != null) {
					for (DynamicProperty element2 : pcary) {
						pc = element2;
						System.out
								.println("   Property Name : " + pc.getName());
						if (pc != null) {
							if (!pc.getVal().getClass().isArray()) {
								System.out.println("   Property Value : "
										+ pc.getVal());
							} else {
								Object[] ipcary = (Object[]) pc.getVal();
								System.out.println("Val : " + pc.getVal());
								for (Object oval : ipcary) {
									if (oval.getClass().getName().indexOf(
											"ManagedObjectReference") >= 0) {
										ManagedObjectReference imor = (ManagedObjectReference) oval;

										System.out
												.println("Inner Object Type : "
														+ imor.getType());
										System.out
												.println("Inner Reference Value : "
														+ imor.get_value());
									} else {
										System.out
												.println("Inner Property Value : "
														+ oval);
									}
								}
							}
						}
					}
				}
			}
		} else {
			System.out.println("No Managed Entities retrieved!");
		}
	}
}