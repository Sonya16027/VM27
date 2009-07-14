package com.vmware.samples.ciminfo;

import com.vmware.apputils.AppUtil;
import com.vmware.apputils.OptionSpec;
import com.vmware.vim.ServiceContent;

/**
 *<pre>
 * his sample shows how to write CIM client applications in Java,
 * o connect to and retrieve different CIM instances from the Service,
 * etrieve associated CIM instances and invoke operations
 * ike Clearing the RecordLog.
 * 
 * his can be run for a single ESX 3.5 or ESX 3.5i host.
 * 
 * b&gt;Parameters:&lt;/b&gt;
 * uery          [required]:type of data to retrieve
 *                          One of : [firmware,fansensors,frus,sensorfrus,log]
 * ogop           [required for &quot;log&quot;]:print log instance or clear the log
 *                                     One of : [print,clear]
 * s              [optional] namespace for all queries to be made.
 *                           defaults to &quot;root/cimv2&quot;
 * rintNulls      [optional] print properties having null or no values
 *                           defaults to false
 * rintOnlyKeys   [optional] print only properties that are keys
 *                           defaults to false
 * 
 * b&gt;Command line&lt;/b&gt;
 * un.bat com.vmware.samples.ciminfo.VIWrapper --url [webserviceurl]
 * -username [username] --password [password]
 * -query [firmware,fansensors,frus,sensorfrus,log]
 * -logop [print,clear]
 * -ns [namespace] --printNulls [true|false] --printOnlyKeys [true|false]
 * 
 * 
 * b&gt;Command line to get firmware instances or fansensors or frus or bad sensor frus.&lt;/b&gt;
 * un.bat com.vmware.samples.ciminfo.VIWrapper --url [webserviceurl]
 * -username [username] --password [password]
 * -query [firmware | fansensors | frus | sensorfrus]
 * 
 * b&gt;Command line to print Record log&lt;/b&gt;
 * un.bat com.vmware.samples.ciminfo.VIWrapper --url [webserviceurl]
 * -username [username] --password [password]
 * -query [log] --logop print
 * 
 * b&gt;Command line to clear Record log&lt;/b&gt;
 * un.bat com.vmware.samples.ciminfo.VIWrapper --url [webserviceurl]
 * -username [username] --password [password]
 * -query [log] --logop clear
 *</pre>
 */

public class VIWrapper {

	private static String OPT_QUERY = "query";
	private static String OPT_LOG_OPERATION = "logop";
	private static String OPT_NAMESPACE = "ns";
	private static String OPT_PRINTNULLS = "printNulls";
	private static String OPT_PRINTONLYKEYS = "printOnlyKeys";
	private static String OPT_IGNORECERT = "ignorecert";

	private static String OPT_VAL_FIRMWARE = "firmware";
	private static String OPT_VAL_FANSENSORS = "fansensors";
	private static String OPT_VAL_FRUS = "frus";
	private static String OPT_VAL_SENSORFRUS = "sensorfrus";
	private static String OPT_VAL_LOG = "log";

	private static String OPT_VAL_CIM_NAMESPACE = "root/cimv2";

	private static String ESX_API_VERSION = "3.5";

	private static AppUtil appUtil = null;

	/**
	 * doOperation
	 * 
	 * Run the requested queries and related operations
	 * 
	 * @throws Exception
	 */
	private void doOperation() throws Exception {
		ServiceContent sc = appUtil.getConnection().getServiceContent();
		String apiType = sc.getAbout().getApiType();
		String apiVersion = sc.getAbout().getApiVersion();
		if (apiType.equalsIgnoreCase("HostAgent")
				&& apiVersion.indexOf(ESX_API_VERSION) >= 0) {

			// Strip VI specific suffixes for CIM URLs purposes
			String serverUrl = appUtil.getServiceUrl();
			serverUrl = serverUrl.substring(0, serverUrl.lastIndexOf("/sdk"));

			String nsStr = appUtil.getOption(OPT_NAMESPACE);
			if (nsStr == null || nsStr.length() == 0) {
				nsStr = OPT_VAL_CIM_NAMESPACE;
			}
			boolean printNulls = appUtil.getOption(OPT_PRINTNULLS)
					.equalsIgnoreCase("true");
			boolean printKeys = appUtil.getOption(OPT_PRINTONLYKEYS)
					.equalsIgnoreCase("true");
			boolean ignoreCert = appUtil.getOption(OPT_IGNORECERT)
					.equalsIgnoreCase("true");

			CIMInfo cimInfo = new CIMInfo(printNulls, printKeys, ignoreCert);
			cimInfo.init(nsStr, serverUrl, appUtil.getUsername(), appUtil
					.getPassword());

			String query = appUtil.getOption(OPT_QUERY);

			if (query.equalsIgnoreCase(OPT_VAL_FIRMWARE)) {
				// retrieve VMware Firmware information
				cimInfo.retrieveCIMInstance("CIM_SoftwareIdentity");
			} else if (query.equalsIgnoreCase(OPT_VAL_FANSENSORS)) {
				// retrieve all Sensors for all the fans present
				CIMInfo.AssociationFilter assocFan = CIMInfo.createAssocFilter(
						"CIM_Fan", "CIM_AssociatedSensor", null, null, null);

				cimInfo.getAssociatedCIMInstance(assocFan);
			} else if (query.equalsIgnoreCase(OPT_VAL_FRUS)) {
				// retrieve all the FRUs for the ComputerSystem
				String rsltClassFilt = "OMC_Processor,OMC_PowerSupply";
				CIMInfo.AssociationFilter assocFru = CIMInfo.createAssocFilter(
						"CIM_ComputerSystem", "CIM_SystemDevice", null,
						rsltClassFilt, null);

				cimInfo.getAssociatedCIMInstance(assocFru);
			} else if (query.equalsIgnoreCase(OPT_VAL_SENSORFRUS)) {
				// retrieve Sensors in a "bad" state and devices with these
				// sensors
				// Sensor health filter is as specified below with partial
				// value matches for the Sensor.CurrentState property
				String srcPropFilt = "!CurrentState*Normal,Unknown,Deassert,deasserted,redundant";
				String rsltClassFilt = "OMC_Processor,OMC_PowerSupply";
				CIMInfo.AssociationFilter assocSysDev = CIMInfo
						.createAssocFilter("CIM_Sensor",
								"CIM_AssociatedSensor", null, rsltClassFilt,
								srcPropFilt);

				cimInfo.getAssociatedCIMInstance(assocSysDev);
			} else if (query.equalsIgnoreCase(OPT_VAL_LOG)) {
				// retrieve and print the System Log and then if required, clear
				// the Log
				String logOp = appUtil.getOption(OPT_LOG_OPERATION);
				if (logOp.equalsIgnoreCase("print")) {
					cimInfo.retrieveCIMInstance("CIM_RecordLog");
				}
				if (logOp.equalsIgnoreCase("clear")) {
					cimInfo.execOperation("CIM_RecordLog", "ClearLog");
				}
			}
		} else if (apiType.equalsIgnoreCase("VirtualCenter")) {
			// To be Implemented
			System.out.println("Support for VC Server not implemented.");
		}

	}

	private static OptionSpec[] initOptions() {
		OptionSpec[] appOpts = new OptionSpec[5];
		appOpts[0] = new OptionSpec(OPT_QUERY, "String", 1,
				"Query to be made.\n       "
						+ "One of : firmware,fansensors,frus,sensorfrus,log",
				null);
		appOpts[1] = new OptionSpec(OPT_LOG_OPERATION, "String", 0,
				"Name of System Log operation\n       "
						+ "One of : print,clear", "print");
		appOpts[2] = new OptionSpec(OPT_NAMESPACE, "String", 0,
				"Namespace for all queries. Default is :" + "root/cimv2",
				OPT_VAL_CIM_NAMESPACE);
		appOpts[3] = new OptionSpec(OPT_PRINTNULLS, "Boolean", 0,
				"Print null valued properties", "true");
		appOpts[4] = new OptionSpec(OPT_PRINTONLYKEYS, "Boolean", 0,
				"Print only key properties", "false");
		return appOpts;
	}

	public static void main(String args[]) throws Exception {
		VIWrapper appInst = new VIWrapper();
		try {
			appUtil = AppUtil.initialize("VIWrapper", VIWrapper.initOptions(),
					args);

			appUtil.connect();
			appInst.doOperation();
			appUtil.disConnect();

		} catch (Exception e) {
			System.out.println("Exception " + e.getMessage()
					+ " initializing. Exiting.");
		}
	}
}
