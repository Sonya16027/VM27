package com.intalio.vmware.general;

import com.vmware.apputils.AppUtil;
import com.vmware.apputils.OptionSpec;
import com.vmware.vim.ManagedObjectReference;

/**
 * This sample moves a managed entity from its current location in the inventory
 * to a new location, in a specified folder. This sample finds both the managed
 * entity and the target folder in the inventory tree before attempting the
 * move. If either of these is not found, an error message displays.</p> In
 * addition to built-in command-line arguments --url, --userName, and
 * --password, the sample uses two custom parameters to specify the inventory
 * object by name (the managed entity, such as a datacenter or virtual machine)
 * and the target folder. The custom parameters are:</p>
 * <ul>
 * <li><strong>entityname</strong> Required. Name of the inventory object to be
 * moved.</li>
 * <li><strong>foldername</strong> Required. Name of the target folder into
 * which the inventory object should be moved.</li>
 * </ul>
 * 
 * <p>
 * <strong>Usage Examples:</strong>
 * </p>
 * <br/>
 * Move a folder named "Production" into the "Global_Operations" folder:<br/>
 * 
 * <pre>
 * run.bat com.intalio.vmware.general.Move --url http://myVMwareServiceName.com/sdk
 * --username sdkUser --password ****** --entityname Production
 * --foldername Global_Operations
 * </pre>
 * 
 * <p>
 * Move a datacenter named "Production_Datacenter" into the "Production" folder:
 * </p>
 * 
 * <pre>
 * run.bat com.intalio.vmware.general.Move --url http://myVMwareServiceName.com/sdk
 * --username sdkUser --password ****** --entityname Production_Datacenter
 * --foldername Production
 * </pre>
 * 
 * <p>
 * Move a datacenter named "Production_Datacenter" into the "Production" folder:
 * </p>
 * 
 * <pre>
 * run.bat com.intalio.vmware.general.Move --url https://myVMwareServiceName.com/sdk
 * --username sdkUser --password ****** --entityname Production_Datacenter
 * --foldername Production --ignorecert
 * </pre>
 */

public class Move {
	protected static AppUtil cb = null;

	protected static OptionSpec[] constructOptions() {
		OptionSpec[] useroptions = new OptionSpec[2];
		useroptions[0] = new OptionSpec("entityname", "String", 1,
				"Name of the virtual entity", null);
		useroptions[1] = new OptionSpec("foldername", "String", 1,
				"Name of the folder", null);
		return useroptions;
	}

	public static void main(String[] args) throws Exception {
		Move obj = new Move();
		cb = AppUtil.initialize("Move", Move.constructOptions(), args);
		cb.validate();
		cb.connect();
		obj.runOperation();
		cb.disConnect();
	}

	protected void doMove() throws Exception {
		String entityname = cb.get_option("entityname");
		String foldername = cb.get_option("foldername");
		ManagedObjectReference memor = cb.getServiceUtil().getDecendentMoRef(
				null, "ManagedEntity", entityname);
		if (memor == null) {
			System.out.println("Unable to find a managed entity named '"
					+ entityname + "' in the Inventory");
			return;
		}
		ManagedObjectReference foldermor = cb.getServiceUtil()
				.getDecendentMoRef(null, "Folder", foldername);
		if (foldermor == null) {
			System.out.println("Unable to find folder '" + foldername
					+ "' in the Inventory");
			return;
		} else {
			try {
				ManagedObjectReference taskmor = cb.getConnection()
						.getService().moveIntoFolder_Task(foldermor,
								new ManagedObjectReference[] { memor });
				String status = cb.getServiceUtil().waitForTask(taskmor);
				if (status.equalsIgnoreCase("failure")) {
					System.out
							.println("Failure -: Managed Entity cannot be moved");
				}

				if (status.equalsIgnoreCase("sucess")) {
					System.out.println("ManagedEntity '" + entityname
							+ "' moved to folder '" + foldername
							+ "' successfully.");
				}

			} catch (Exception e) {
				System.out.println("Error: " + e.toString());
				e.printStackTrace();
			}
		}
	}

	protected void runOperation() throws Exception {
		doMove();
	}
}
