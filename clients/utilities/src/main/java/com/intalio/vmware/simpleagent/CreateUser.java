package com.intalio.vmware.simpleagent;

import com.vmware.apputils.AppUtil;
import com.vmware.apputils.ArgumentHandlingException;
import com.vmware.security.credstore.CredentialStore;
import com.vmware.security.credstore.CredentialStoreFactory;
import com.vmware.vim.HostAccountSpec;
import com.vmware.vim.ManagedObjectReference;
import com.vmware.vim.Permission;

/*********************************************************************
 * The CreateUser class creates a user account and password stores them the
 * local credential store. CreateUser should be used in conjunction with the
 * {@link SimpleAgent} sample application only. CreateUser and SimpleAgent
 * demonstrate using the {@link CredentialStore} client API. CreateUser
 * generates an arbitrary user name (Usernnnn, where nnnn is a psuedo-randomly
 * generated number) and password and stores them in the credential store on the
 * local machine.
 * <p>
 * CreateUser works with ESX or ESXi only (not vCenter). It uses AppUtil and
 * other helper classes for handling command-line arguments and creating a
 * connection for the server.
 * </p>
 * 
 * <p>
 * <b>Usage Examples:</b>
 * </p>
 * 
 * <pre>
 * java com.intalio.vmware.simpleagent.CreateUser --server myServerNeme.com 
 * --url https://https://myVMwareServiceName.com/sdk
 * -username root --password &lt;pwd&gt; --ignorecert
 * </pre>
 * 
 *@see <a
 *      href="../../../../../ReferenceGuide/vim.AuthorizationManager.html">AuthorizationManager</a>
 *@see <a
 *      href="../../../../../ReferenceGuide/vim.host.LocalAccountManager.html">HostLocalAccountManager</a>
 */

public class CreateUser {
	protected static AppUtil cb = null;

	public static void main(String[] args) throws Exception {
		CreateUser obj = new CreateUser();
		cb = AppUtil.initialize("CreateUser", args);
		cb.connect();
		obj.customValidate();
		obj.createUser();
		cb.disConnect();
	}

	// @param userName String that specifies

	protected void createUser() throws Exception {
		ManagedObjectReference hostLocalAccountManager = cb.getConnection()
				.getServiceContent().getAccountManager();

		ManagedObjectReference hostAuthorizationManager = cb.getConnection()
				.getServiceContent().getAuthorizationManager();

		String userName = generateUserName();
		String password = generatePassword();

		HostAccountSpec hostAccountSpec = new HostAccountSpec();
		hostAccountSpec.setId(userName);
		hostAccountSpec.setPassword(password);
		hostAccountSpec.setDescription("User Description");
		cb.getConnection().getService().createUser(hostLocalAccountManager,
				hostAccountSpec);

		ManagedObjectReference rootFolder = cb.getConnection()
				.getServiceContent().getRootFolder();

		/*
		 * For demonstration purposes only, the account is granted the
		 * 'administrator' role (-1) on the rootFolder of the inventory. Never
		 * give users more privileges than absolutely necessary.
		 */

		Permission per = new Permission();
		per.setGroup(false);
		per.setPrincipal(userName);
		per.setRoleId(-1);
		per.setPropagate(true);
		per.setEntity(rootFolder);
		cb.getConnection().getService().setEntityPermissions(
				hostAuthorizationManager, rootFolder, new Permission[] { per });

		CredentialStore csObj = CredentialStoreFactory.getCredentialStore();
		csObj.addPassword(getServerName(), userName, password.toCharArray());
		System.out.println("Successfully created user and populated the "
				+ "credential store");
	}

	public void customValidate() throws Exception {

		String apiType = cb.getConnection().getServiceContent().getAbout()
				.getApiType();
		if (apiType.equalsIgnoreCase("VirtualCenter")) {
			System.out.println("CreateUser works with ESX and ESXi only.");
			throw new ArgumentHandlingException(
					"CreateUser does not run on vCenter Server");
		}
	}

	protected String generatePassword() {
		int rawRandomNumber = (int) (Math.random() * (256 - 32 + 1)) + 32;
		String passwd = "passwd" + Integer.toString(rawRandomNumber);
		return passwd;
	}

	protected String generateUserName() {
		int rawRandomNumber = (int) (Math.random() * (256 - 32 + 1)) + 32;
		String userName = "user" + Integer.toString(rawRandomNumber);
		return userName;
	}

	// @param server String that specifies the fully qualified server name.
	protected String getServerName() {
		if (cb.get_option("server") != null) {
			return cb.get_option("server");
		} else {
			String urlString = cb.get_option("url");
			if (urlString.indexOf("https://") != -1) {
				int sind = 8;
				int lind = urlString.indexOf("/sdk");
				return urlString.substring(sind, lind);
			} else if (urlString.indexOf("http://") != -1) {
				int sind = 7;
				int lind = urlString.indexOf("/sdk");
				return urlString.substring(sind, lind);
			} else {
				return urlString;
			}
		}
	}
}
