package com.intalio.vmware.general;

import com.vmware.apputils.AppUtil;
import com.vmware.apputils.Log;
import com.vmware.apputils.OptionSpec;
import com.vmware.vim.ManagedObjectReference;
import com.vmware.vim.MethodFault;
import com.vmware.vim.TaskInfoState;

/**
 *<pre>
 * his sample deletes the specified managed entity from the inventory tree.
 * he managed entity can be a virtual machine, ClusterComputeResource 
 * r a folder.
 *  
 * b&gt;To run this samples following parameters are used :&lt;/b&gt;
 * 
 * eName     [required]   : Virtual Machine|ClusterComputeResource|folder
 * 
 * b&gt;Command:
 * o delte a folder named 'testFolder'&lt;/b&gt;
 * un.bat com.intalio.vmware.general.Delete --url [webserviceurl]
 * -username [username] --password [password] --meName [testFolder]
 * 
 * b&gt;To delte a datacenter named myData&lt;/b&gt;
 * un.bat com.intalio.vmware.general.Delete --url [webserviceurl]
 * -username [username] --password [password] --meName [myData]
 *</pre>
 */

public class Delete {
	protected static AppUtil cb = null;

	protected static OptionSpec[] constructOptions() {
		OptionSpec[] useroptions = new OptionSpec[1];
		useroptions[0] = new OptionSpec("meName", "String", 1,
				"Virtual Machine|ClusterComputeResource|folder", null);
		return useroptions;
	}

	public static void main(String[] args) throws Exception {
		Delete app = new Delete();
		cb = AppUtil.initialize("Delete", Delete.constructOptions(), args);
		cb.connect();
		boolean status = app.doDelete();
		cb.disConnect();
	}

	Log log = new Log();

	protected boolean doDelete() throws Exception {
		try {
			String errmsg = "";

			ManagedObjectReference memor = cb.getServiceUtil()
					.getDecendentMoRef(null, "ManagedEntity", getMeName());
			if (memor == null) {
				errmsg = "Unable to find a Managed Entity named : "
						+ getMeName() + " in Inventory";
				System.out.println(errmsg);
				return false;
			}

			if (memor == null) {
				log.logLine(errmsg);
				// throw new Exception(errmsg);
			}

			ManagedObjectReference taskmor = cb.getConnection().getService()
					.destroy_Task(memor);

			// If we get a valid task reference, monitor the task for success or
			// failure
			// and report task completion or failure.
			if (taskmor != null) {
				Object[] result = cb.getServiceUtil().waitForValues(taskmor,
						new String[] { "info.state", "info.error" },
						new String[] { "state" }, // info has a property -
						// state for state of the task
						new Object[][] { new Object[] { TaskInfoState.success,
								TaskInfoState.error } });

				// Wait till the task completes.
				if (result[0].equals(TaskInfoState.success)) {
					log.logLine(cb.getAppName()
							+ " : Successful delete of Managed Entity : "
							+ getMeName());
				} else {
					log.logLine(cb.getAppName()
							+ " : Failed delete of Managed Entity : "
							+ getMeName());
					if (result.length == 2 && result[1] != null) {
						if (result[1] instanceof MethodFault) {
							cb.getUtil().logFault((MethodFault) result[1]);
						}
					}
				}
			}
		} catch (Exception e) {
			cb.getUtil().logException(e);
			log.logLine(cb.getAppName()
					+ " : Failed delete of Managed Entity : " + getMeName());
			throw e;
		}
		return true;
	}

	protected String getMeName() throws Exception {
		return cb.get_option("meName");
	}
}
