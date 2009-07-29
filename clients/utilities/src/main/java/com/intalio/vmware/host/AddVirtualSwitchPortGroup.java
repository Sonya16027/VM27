package com.intalio.vmware.host;

import com.vmware.apputils.AppUtil;
import com.vmware.apputils.ArgumentHandlingException;
import com.vmware.apputils.OptionSpec;
import com.vmware.apputils.vim.VMUtils;
import com.vmware.vim.AlreadyExists;
import com.vmware.vim.HostConfigManager;
import com.vmware.vim.HostNetworkPolicy;
import com.vmware.vim.HostPortGroupSpec;
import com.vmware.vim.InvalidArgument;
import com.vmware.vim.ManagedObjectReference;
import com.vmware.vim.NotFound;
import com.vmware.vim.ServiceContent;

/**
 *<pre>
 * his sample is used to add a Virtual Switch PortGroup
 * 
 * b&gt;To run this samples following parameters are used:&gt;&lt;/b&gt;
 * 
 * siwtchid      [required]: Name of the switch in which portgroup is to be added
 * ortgroupname  [required]: Name of the port group
 * ost           [optional]: Name of the host
 * atacenter     [optional]: Name of the datacenter
 * 
 * b&gt;Command Line:to add a Virtual switch Port Group as: -&lt;/b&gt;
 * un.bat com.intalio.vmware.host.AddVirtualSwitchPortGroup --url [webserviceurl] --username [username] --password  [password] 
 * -vsiwtchid [mySwitch] --datacenter [mydatacenter] --portgroupname [myportgroup] --host[hostname]
 * 
 * b&gt;Command Line:to add a Virtual switch Port Group without specifying the host: &lt;/b&gt;
 * un.bat com.intalio.vmware.host.AddVirtualSwitchPortGroup --url [webserviceurl] --username [username] --password  [password] 
 * -vsiwtchid [mySwitch] --datacenter [mydatacenter] --portgroupname [myportgroup]
 * 
 * 
 * b&gt;Command Line:to add a Virtual switch Port Group without specifying the datacenter -&lt;/b&gt;
 * un.bat com.intalio.vmware.host.AddVirtualSwitchPortGroup --url [webserviceurl] --username [username] --password  [password] 
 * -vsiwtchid [mySwitch]  --portgroupname [myportgroup]
 *</pre>
 */

public class AddVirtualSwitchPortGroup {

	protected static AppUtil cb = null;
	protected static VMUtils vmUtils = null;

	protected static OptionSpec[] constructOptions() {
		OptionSpec[] useroptions = new OptionSpec[4];
		useroptions[0] = new OptionSpec("vswitchid", "String", 1,
				"Name of the switch on which portgroup is to be added", null);
		useroptions[1] = new OptionSpec("host", "String", 0,
				"Name of the host", null);
		useroptions[2] = new OptionSpec("portgroupname", "String", 1,
				"Name of the portgroup", null);
		useroptions[3] = new OptionSpec("datacenter", "String", 0,
				"Name of the datacenter", null);
		return useroptions;
	}

	public static void main(String[] args) throws Exception {
		AddVirtualSwitchPortGroup app = new AddVirtualSwitchPortGroup();
		cb = AppUtil.initialize("AddVirtualSwitchPortGroup",
				AddVirtualSwitchPortGroup.constructOptions(), args);
		cb.connect();
		vmUtils = new VMUtils(cb);
		app.validate();
		app.doAddVirtualSwitchPortGroup();
		cb.disConnect();
	}

	String datacenter = null;
	String host = null;

	String vswitchId = null;

	String portGroupName = null;

	protected void doAddVirtualSwitchPortGroup() throws Exception {
		ManagedObjectReference dcmor;
		ManagedObjectReference hostfoldermor;
		ManagedObjectReference hostmor = null;
		datacenter = cb.get_option("datacenter");
		host = cb.get_option("host");
		portGroupName = cb.get_option("portgroupname");
		vswitchId = cb.get_option("vswitchid");
		try {
			if (((datacenter != null) && (host != null))
					|| ((datacenter != null) && (host == null))) {
				dcmor = cb.getServiceUtil().getDecendentMoRef(null,
						"Datacenter", datacenter);
				if (dcmor == null) {
					System.out.println("Datacenter not found");
					return;
				}
				hostfoldermor = vmUtils.getHostFolder(dcmor);
				hostmor = vmUtils.getHost(hostfoldermor, host);
			} else if ((datacenter == null) && (host != null)) {
				hostmor = vmUtils.getHost(null, host);
			}
			if (hostmor != null) {
				Object cmobj = cb.getServiceUtil().getDynamicProperty(hostmor,
						"configManager");
				HostConfigManager configMgr = (HostConfigManager) cmobj;
				ManagedObjectReference nwSystem = configMgr.getNetworkSystem();

				HostPortGroupSpec portgrp = new HostPortGroupSpec();
				portgrp.setName(portGroupName);
				portgrp.setVswitchName(vswitchId);
				portgrp.setPolicy(new HostNetworkPolicy());

				cb.getConnection().getService().addPortGroup(nwSystem, portgrp);

				System.out.println(cb.getAppName()
						+ " : Successful creating : " + vswitchId + "/"
						+ portGroupName);
			} else {
				System.out.println("Host not found");
			}
		} catch (AlreadyExists e) {
			System.out.println(cb.getAppName() + " : Failed creating : "
					+ vswitchId + "/" + portGroupName);
			System.out.println("Portgroup name already exists");
		} catch (InvalidArgument e) {
			System.out.println(cb.getAppName() + " : Failed creating : "
					+ vswitchId + "/" + portGroupName);
			System.out
					.println("PortGroup vlanId or network policy may be invalid.");
		} catch (NotFound e) {
			System.out.println(cb.getAppName() + " : Failed creating : "
					+ vswitchId + "/" + portGroupName);
			System.out.println("Switch Not found.");
		} catch (NullPointerException e) {
			System.out.println(cb.getAppName() + " : Failed creating : "
					+ vswitchId + "/" + portGroupName);
			System.out.println("Datacenter or Host may be invalid");
			throw e;
		} catch (Exception e) {
			System.out.println(cb.getAppName() + " : Failed creating : "
					+ vswitchId + "/" + portGroupName);
			throw e;
		}
	}

	protected void validate() throws Exception {
		ManagedObjectReference sic = cb.getConnection().getServiceInstanceRef();
		ServiceContent serCont = (ServiceContent) cb.getServiceUtil()
				.getDynamicProperty(sic, "content");
		String apiType = serCont.getAbout().getApiType();
		datacenter = cb.get_option("datacenter");
		host = cb.get_option("host");
		portGroupName = cb.get_option("portgroupname");
		vswitchId = cb.get_option("vswitchid");
		try {
			if (apiType.equalsIgnoreCase("HostAgent")) {
				if (host != null) {
					System.out
							.println("Host should not be specified when running via Host");
					throw new ArgumentHandlingException(
							"Host should not be Specified");
				}
				if (datacenter == null) {
					System.out.println("Datacenter should be "
							+ "specified when running via Host");
					throw new ArgumentHandlingException(
							"Datacenter not Specified");
				}
			} else if (apiType.equalsIgnoreCase("VirtualCenter")) {
				if ((datacenter == null) && (host == null)) {
					System.out.println("Atleast one from datacenter"
							+ " or host should be specified");
					throw new ArgumentHandlingException(
							"Invalid Argument Specified");
				}
			}
		} catch (Exception e) {
			throw e;
		}
	}
}
