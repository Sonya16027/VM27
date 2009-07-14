package com.vmware.samples.general;

import com.vmware.apputils.AppUtil;
import com.vmware.vim.DynamicProperty;
import com.vmware.vim.ManagedObjectReference;
import com.vmware.vim.ObjectContent;

/**
 *<pre>
 * his sample prints all managed entity, its type, reference value,
 * roperty name, Property Value, Inner Object Type,
 * ts Inner Reference Value and inner property value. 
 * his samples consists of one main function named printInventory
 * hich basically prints all the above mentioned values.
 * 
 * b&gt;Command:&lt;/b&gt;
 * .g. run.bat com.vmware.samples.general.Browser --url [webserviceurl] --username
 * username] --password [password]
 *</pre>
 */

public class Browser {

	private static AppUtil cb = null;
	private String[][] typeInfo;

	private void printInventory() throws Exception {
		try {
			typeInfo = new String[][] { new String[] { "ManagedEntity", "name" }, };
			ObjectContent[] ocary = cb.getServiceUtil().getContentsRecursively(
					null, null, typeInfo, true);

			ObjectContent oc = null;
			ManagedObjectReference mor = null;
			DynamicProperty[] pcary = null;
			DynamicProperty pc = null;

			if (ocary != null) {
				for (ObjectContent element : ocary) {
					oc = element;
					mor = oc.getObj();
					pcary = oc.getPropSet();

					cb.log.logLine("Object Type : " + mor.getType());
					cb.log.logLine("Reference Value : " + mor.get_value());

					if (pcary != null) {
						for (DynamicProperty element2 : pcary) {
							pc = element2;
							cb.log
									.logLine("   Property Name : "
											+ pc.getName());
							if (pc != null) {
								if (!pc.getVal().getClass().isArray()) {
									cb.log.logLine("   Property Value : "
											+ pc.getVal());
								} else {
									Object[] ipcary = (Object[]) pc.getVal();
									cb.log.logLine("Val : " + pc.getVal());
									for (Object oval : ipcary) {
										if (oval.getClass().getName().indexOf(
												"ManagedObjectReference") >= 0) {
											ManagedObjectReference imor = (ManagedObjectReference) oval;
											cb.log
													.logLine("Inner Object Type : "
															+ imor.getType());
											cb.log
													.logLine("Inner Reference Value : "
															+ imor.get_value());
										} else {
											cb.log
													.logLine("Inner Property Value : "
															+ oval);
										}
									}
								}
							}
						}
					}
				}
			}
			cb.log.logLine("Done Printing Inventory");
		} catch (Exception e) {
			System.out.println("Main Exceptions Are Here");
			cb.getUtil().logException(e);
			cb.log.logLine(cb.getAppName() + " : Failed Getting Contents");
			throw e;
		}
		cb.log.logLine(cb.getAppName() + " : Successful Getting Contents");
	}

	public static void main(String[] args) throws Exception {
		Browser obj = new Browser();
		cb = AppUtil.initialize("Browser", args);
		cb.connect();
		obj.printInventory();
		cb.disConnect();
	}
}
