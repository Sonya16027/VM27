package com.intalio.vmware.simpleagent;

import java.net.URL;
import java.util.Set;

import com.vmware.security.credstore.CredentialStore;
import com.vmware.security.credstore.CredentialStoreAdmin;
import com.vmware.security.credstore.CredentialStoreFactory;
import com.vmware.vim.ManagedObjectReference;
import com.vmware.vim.ServiceContent;
import com.vmware.vim.VimPortType;
import com.vmware.vim.VimServiceLocator;

/*********************************************************************
 * The SimpleAgent class uses the local credential store to obtain user account
 * and password information, for automated logon to the target host system.
 * SimpleAgent can be used with {@link CreateUser}, to demonstrate using the
 * {@link CredentialStore} client API.</p>
 * <p>
 * SimpleAgent accesses the local credential store to obtain a single user
 * account to login to the specified server (--hostName is the only command-line
 * argument). If more than one user account exists in the credential store, an
 * error message displays.
 * </p>
 * <p>
 * To create user accounts and store them in the local credential store, use the
 * {@link CredentialStoreAdmin} client utility.
 * </p>
 * <p>
 * Note that this sample does not use the apputils helper classes to create the
 * connection to the server.
 * </p>
 * 
 * <p>
 * <b>Parameters</b>
 * </p>
 * <ul>
 * <li><b>--hostName</b> &nbsp;The fully-qualified domain name of the server.</li>
 * </ul>
 * 
 * <p>
 * <b>Usage Example:</b>
 * </p>
 * <code> 
 * java com.intalio.vmware.simpleagent.SimpleAgent --hostName &lt;target-server&gt; 
 * </code>
 */

public class SimpleAgent {
	public static void main(String[] args) throws Exception {
		SimpleAgent obj = new SimpleAgent();
		String serverName = args[0];
		obj.connectAndLogin(serverName);
	}

	protected ManagedObjectReference _svcRef;
	protected VimServiceLocator _locator;
	protected VimPortType _service;

	protected ServiceContent _sic;

	protected void connectAndLogin(String hostName) throws Exception {
		System.setProperty("axis.socketSecureFactory",
				"org.apache.axis.components.net.SunFakeTrustSocketFactory");

		CredentialStore csObj = CredentialStoreFactory.getCredentialStore();

		String userName = "";
		Set userNames = csObj.getUsernames(hostName);
		if (userNames.size() == 0) {
			System.out.println("No user found in this host");
			return;
		} else if (userNames.size() > 1) {
			System.out.println("Found two users for this host");
			return;
		} else {
			Object[] names = userNames.toArray();
			userName = (String) names[0];
		}

		String url = "https://" + hostName + "/sdk/vimService";
		char[] arr = csObj.getPassword(hostName, userName);
		String password = new String(arr);
		createServiceRef();
		_locator = new VimServiceLocator();
		_locator.setMaintainSession(true);
		_service = _locator.getVimPort(new URL(url));
		_sic = _service.retrieveServiceContent(_svcRef);
		if (_sic.getSessionManager() != null) {
			_service.login(_sic.getSessionManager(), userName, password, null);
		}
		System.out.println("Connected Successfully "
				+ _sic.getAbout().getFullName());
	}

	protected void createServiceRef() throws Exception {
		_svcRef = new ManagedObjectReference();
		_svcRef.setType("ServiceInstance");
		_svcRef.set_value("ServiceInstance");
	}
}