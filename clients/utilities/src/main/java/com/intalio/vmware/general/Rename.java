package com.intalio.vmware.general;

import com.vmware.apputils.AppUtil;
import com.vmware.apputils.OptionSpec;
import com.vmware.vim.ManagedObjectReference;

/**
 *<pre>
 * his sample renames a manged entity object. If the managed
 * ntity provided name is not found then it prints a message.
 * 
 * b&gt;To run this samples following parameters are used : &lt;/b&gt;
 * 
 * ntiryname [required]   : Name of the virtual entity
 * ewname   [required]   : New name of the virtual machine entity
 * 
 * b&gt;Command:
 * ename a virtual machine VM to new name VM2 &lt;/b&gt;
 * un.bat com.intalio.vmware.general.Rename --url [webserviceurl]
 * -username [username] --password [password] --entityname [VM]
 * - newname [VM2]
 * 
 * b&gt;Rename a resource pool named Rp to new name pool &lt;/b&gt;
 * un.bat com.intalio.vmware.general.Rename --url [webserviceurl]
 * -username [username] --password [password] --entityname [Rp]
 * - newname [pool]
 *</pre>
 */

public class Rename {
	protected static AppUtil cb = null;

	protected static OptionSpec[] constructOptions() {
		OptionSpec[] useroptions = new OptionSpec[2];
		useroptions[0] = new OptionSpec("entityname", "String", 1,
				"Name of the virtual entity", null);
		useroptions[1] = new OptionSpec("newname", "String", 1,
				"New name of the virtual entity", null);
		return useroptions;
	}

	public static void main(String[] args) throws Exception {
		Rename obj = new Rename();
		cb = AppUtil.initialize("Rename", Rename.constructOptions(), args);
		cb.validate();
		cb.connect();
		obj.runOperation();
		cb.disConnect();
	}

	protected void doRename() throws Exception {
		String entityname = cb.get_option("entityname");
		String newname = cb.get_option("newname");
		ManagedObjectReference memor = cb.getServiceUtil().getDecendentMoRef(
				null, "ManagedEntity", entityname);
		if (memor == null) {
			System.out.println("Unable to find a Managed Entity '" + entityname
					+ "' in the Inventory");
			return;
		} else {
			try {
				ManagedObjectReference taskmor = cb.getConnection()
						.getService().rename_Task(memor, newname);
				String status = cb.getServiceUtil().waitForTask(taskmor);
				if (status.equalsIgnoreCase("failure")) {
					System.out
							.println("Failure -: Managed Entity Cannot Be Renamed");
				}

				if (status.equalsIgnoreCase("sucess")) {
					System.out.println("ManagedEntity '" + entityname
							+ "' renamed successfully.");
				}

			} catch (Exception e) {
				System.out.println("Error: " + e.toString());
				e.printStackTrace();
			}
		}
	}

	protected void runOperation() throws Exception {
		doRename();
	}
}
