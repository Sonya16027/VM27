package com.intalio.vmware.httpfileaccess;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

import com.vmware.apputils.AppUtil;
import com.vmware.apputils.OptionSpec;
import com.vmware.vim.ManagedObjectReference;
import com.vmware.vim.VirtualDevice;
import com.vmware.vim.VirtualMachineConfigInfo;

/**
 *<pre>
 * his sample gets all the config files, snapshots files, logs files, virtual disk files
 * o the local system. 
 * 
 * b&gt;Parameters:&lt;/b&gt;
 * 
 * rl          [required]:       url of the web service.
 * sername     [required]:       username for the authentication
 * assword     [required]:       password for the authentication
 * mname       [required]:       Name of the virtual machine
 * ocalpath    [required]:       localpath to copy files
 * 
 * b&gt;Command: To get the virtual machine files on local disk.&lt;/b&gt;
 * un.bat com.intalio.vmware.httpfileaccess.GetVMFiles --url [webserviceurl] 
 * --username [username] --password [password] --vmname [vmname] --localpath[localpath]
 *</pre>
 */

public class GetVMFiles {
	public static class miTM implements javax.net.ssl.TrustManager,
			javax.net.ssl.X509TrustManager {
		public void checkClientTrusted(
				java.security.cert.X509Certificate[] certs, String authType)
				throws java.security.cert.CertificateException {
			return;
		}

		public void checkServerTrusted(
				java.security.cert.X509Certificate[] certs, String authType)
				throws java.security.cert.CertificateException {
			return;
		}

		public java.security.cert.X509Certificate[] getAcceptedIssuers() {
			return null;
		}

		public boolean isClientTrusted(
				java.security.cert.X509Certificate[] certs) {
			return true;
		}

		public boolean isServerTrusted(
				java.security.cert.X509Certificate[] certs) {
			return true;
		}
	}

	protected static AppUtil cb = null;

	protected static OptionSpec[] constructOptions() {
		OptionSpec[] useroptions = new OptionSpec[2];
		useroptions[0] = new OptionSpec("vmname", "String", 1,
				"Name of the virtual machine", null);
		useroptions[1] = new OptionSpec("localpath", "String", 1,
				"Local path to copy files", null);
		return useroptions;
	}

	public static void main(String[] args) throws Exception {
		GetVMFiles obj = new GetVMFiles();
		cb = AppUtil.initialize("GetVMFiles", GetVMFiles.constructOptions(),
				args);
		cb.connect();
		obj.getVM();
		cb.disConnect();
	}

	protected static void trustAllHttpsCertificates() throws Exception {
		javax.net.ssl.TrustManager[] trustAllCerts = new javax.net.ssl.TrustManager[1];
		javax.net.ssl.TrustManager tm = new miTM();
		trustAllCerts[0] = tm;
		javax.net.ssl.SSLContext sc = javax.net.ssl.SSLContext
				.getInstance("SSL");
		sc.init(null, trustAllCerts, null);
		javax.net.ssl.HttpsURLConnection.setDefaultSSLSocketFactory(sc
				.getSocketFactory());
	}

	HashMap downloadedDir = new HashMap();

	protected void downloadDirectory(String directoryName, String localDirectory,
			String dataStoreName, String dataCenter) throws Exception {
		String serviceUrl = cb.getServiceUrl();
		serviceUrl = serviceUrl.substring(0, serviceUrl.lastIndexOf("sdk") - 1);
		String httpUrl = serviceUrl + "/folder/" + directoryName + "?dcPath="
				+ dataCenter + "&dsName=" + dataStoreName;
		httpUrl = httpUrl.replaceAll("\\ ", "%20");
		String[] linkMap = getListFiles(httpUrl);
		for (String element : linkMap) {
			System.out.println("Downloading VM File " + element);
			String urlString = serviceUrl + element;
			String fileName = localDirectory
					+ "/"
					+ element.substring(element.lastIndexOf("/"), element
							.lastIndexOf("?"));
			urlString = urlString.replaceAll("\\ ", "%20");
			getData(urlString, fileName);
		}
	}

	protected String getCookie() throws Exception {
		com.vmware.vim.VimPortType test = cb.getConnection().getService();
		org.apache.axis.client.Stub st = (org.apache.axis.client.Stub) test;
		org.apache.axis.client.Call callObj = st._getCall();
		org.apache.axis.MessageContext msgContext = callObj.getMessageContext();
		String cookieString = (String) msgContext
				.getProperty(org.apache.axis.transport.http.HTTPConstants.HEADER_COOKIE);
		return cookieString;
	}

	protected void getData(String urlString, String fileName) throws Exception {
		HttpURLConnection conn = getHTTPConnection(urlString);
		String line = null;
		String xmlString = "";
		InputStream in = conn.getInputStream();
		int leng = fileName.lastIndexOf("/");
		String dir = fileName.substring(0, leng - 1);
		String fName = fileName.substring(leng + 1);
		dir = replaceSpecialChar(dir);
		boolean flag = (new File(cb.get_option("localpath") + "/" + dir))
				.mkdir();
		fileName = cb.get_option("localpath") + "/" + dir + "/" + fName;
		OutputStream out = new FileOutputStream(new File(fileName));
		byte[] buf = new byte[102400];
		int len = 0;
		while ((len = in.read(buf)) > 0) {
			out.write(buf, 0, len);
		}
		in.close();
		out.close();
	}

	protected String getDataCenter(com.vmware.vim.ManagedObjectReference vmmor)
			throws Exception {
		com.vmware.vim.ManagedObjectReference morParent = (com.vmware.vim.ManagedObjectReference) cb
				.getServiceUtil().getDynamicProperty(vmmor, "parent");
		morParent = (com.vmware.vim.ManagedObjectReference) cb.getServiceUtil()
				.getDynamicProperty(morParent, "parent");
		String dcName = (java.lang.String) cb.getServiceUtil()
				.getDynamicProperty(morParent, "name");
		return dcName;
	}

	protected ArrayList getFileLinks(String xmlString) throws Exception {
		ArrayList linkMap = new ArrayList();
		Pattern regex = Pattern.compile("<a href=\".*?\">");
		Matcher regexMatcher = regex.matcher(xmlString);
		while (regexMatcher.find()) {
			String data = regexMatcher.group();
			int ind = data.indexOf("\"") + 1;
			int lind = data.lastIndexOf("\"");
			data = data.substring(ind, lind);
			linkMap.add(data);
		}
		return linkMap;
	}

	protected HttpURLConnection getHTTPConnection(String urlString)
			throws Exception {
		String cookieString = getCookie();
		trustAllHttpsCertificates();
		HostnameVerifier hv = new HostnameVerifier() {
			public boolean verify(String urlHostName, SSLSession session) {
				return true;
			}
		};
		HttpsURLConnection.setDefaultHostnameVerifier(hv);
		URL url = new URL(urlString);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();

		conn.setDoInput(true);
		conn.setDoOutput(true);
		conn.setAllowUserInteraction(true);
		conn.setRequestProperty(
				org.apache.axis.transport.http.HTTPConstants.HEADER_COOKIE,
				cookieString);
		conn.connect();
		return conn;
	}

	protected String[] getListFiles(String urlString) throws Exception {
		HttpURLConnection conn = getHTTPConnection(urlString);
		String line = null;
		String xmlString = "";
		BufferedReader in = new BufferedReader(new InputStreamReader(conn
				.getInputStream()));
		while ((line = in.readLine()) != null) {
			xmlString = xmlString + line;
		}
		xmlString = xmlString.replaceAll("&amp;", "&");

		ArrayList list = getFileLinks(xmlString);
		;
		String[] linkMap = new String[list.size()];
		for (int i = 0; i < list.size(); i++) {
			linkMap[i] = (String) list.get(i);
		}
		return linkMap;
	}

	protected String[] getVDiskLocations(ManagedObjectReference vmmor)
			throws Exception {
		VirtualMachineConfigInfo vmConfigInfo = (VirtualMachineConfigInfo) cb
				.getServiceUtil().getDynamicProperty(vmmor, "config");
		if (vmConfigInfo != null) {
			VirtualDevice[] vDevice = vmConfigInfo.getHardware().getDevice();
			int count = 0;
			String[] virtualDisk = new String[vDevice.length];

			for (VirtualDevice element : vDevice) {
				if (element.getClass().getCanonicalName().equalsIgnoreCase(
						"com.vmware.vim.VirtualDisk")) {
					try {
						com.vmware.vim.VirtualDeviceFileBackingInfo backingInfo = (com.vmware.vim.VirtualDeviceFileBackingInfo) element
								.getBacking();
						virtualDisk[count] = backingInfo.getFileName();
						count++;
					} catch (java.lang.ClassCastException e) {
						// DO NOTHING
					}
				}
			}
			return virtualDisk;
		} else {
			System.out.println("Connot Restore VM. Not Able To"
					+ " Find The Virtual Machine Config Info");
			return null;
		}
	}

	protected void getVM() throws Exception {
		File file = new File(cb.get_option("localpath"));
		if (!file.exists()) {
			System.out
					.println("Not able to find " + cb.get_option("localpath"));
			return;
		}
		ManagedObjectReference vmmor = getVmMor(cb.get_option("vmname"));
		if (vmmor != null) {
			String dataCenterName = getDataCenter(vmmor);
			String[] vmDirectory = getVmDirectory(vmmor);
			if (vmDirectory[0] != null) {
				System.out
						.println("Downloading Virtual Machine Configuration Directory");
				String dataStoreName = vmDirectory[0].substring(vmDirectory[0]
						.indexOf("[") + 1, vmDirectory[0].lastIndexOf("]"));
				String configurationDir = vmDirectory[0].substring(
						vmDirectory[0].indexOf("]") + 2, vmDirectory[0]
								.lastIndexOf("/"));
				boolean success = new File(cb.get_option("localpath") + "/"
						+ configurationDir + "#vm#" + dataStoreName).mkdir();
				downloadDirectory(configurationDir, configurationDir + "#vm#"
						+ dataStoreName, dataStoreName, dataCenterName);
				downloadedDir.put(configurationDir + "#vm#" + dataStoreName,
						"Directory");
				System.out.println("Downloading Virtual Machine"
						+ " Configuration Directory Complete");
			}

			if (vmDirectory[1] != null) {
				System.out.println("Downloading Virtual Machine "
						+ "Snapshot / Suspend / Log Directory");
				for (int i = 1; i < vmDirectory.length; i++) {
					String dataStoreName = vmDirectory[i].substring(
							vmDirectory[i].indexOf("[") + 1, vmDirectory[i]
									.lastIndexOf("]"));
					String configurationDir = "";
					com.vmware.vim.ManagedObjectReference sic = cb
							.getConnection().getServiceInstanceRef();

					com.vmware.vim.ServiceContent sc = (com.vmware.vim.ServiceContent) cb
							.getServiceUtil()
							.getDynamicProperty(sic, "content");

					String apiType = sc.getAbout().getApiType();
					if (apiType.equalsIgnoreCase("VirtualCenter")) {
						configurationDir = vmDirectory[i].substring(
								vmDirectory[i].indexOf("]") + 2, vmDirectory[i]
										.length() - 1);
					} else {
						configurationDir = vmDirectory[i]
								.substring(vmDirectory[i].indexOf("]") + 2);
					}
					if (!downloadedDir.containsKey(configurationDir + "#vm#"
							+ dataStoreName)) {
						boolean success = new File(cb.get_option("localpath")
								+ "/" + configurationDir + "#vm#"
								+ dataStoreName).mkdir();
						downloadDirectory(configurationDir, configurationDir
								+ "#vm#" + dataStoreName, dataStoreName,
								dataCenterName);
						downloadedDir.put(configurationDir + "#vm#"
								+ dataStoreName, "Directory");
					} else {
						System.out.println("Already Downloaded");
					}
				}
				System.out.println("Downloading Virtual Machine Snapshot"
						+ " / Suspend / Log Directory Complete");
			}

			String[] virtualDiskLocations = getVDiskLocations(vmmor);
			if (virtualDiskLocations != null) {
				System.out.println("Downloading Virtual Disks");
				for (String virtualDiskLocation : virtualDiskLocations) {
					if (virtualDiskLocation != null) {
						String dataStoreName = virtualDiskLocation.substring(
								virtualDiskLocation.indexOf("[") + 1,
								virtualDiskLocation.lastIndexOf("]"));
						String configurationDir = virtualDiskLocation
								.substring(
										virtualDiskLocation.indexOf("]") + 2,
										virtualDiskLocation.lastIndexOf("/"));
						if (!downloadedDir.containsKey(configurationDir
								+ "#vm#" + dataStoreName)) {
							boolean success = new File(cb
									.get_option("localpath")
									+ "/"
									+ configurationDir
									+ "#vdisk#"
									+ dataStoreName).mkdir();
							downloadDirectory(configurationDir,
									configurationDir + "#vdisk#"
											+ dataStoreName, dataStoreName,
									dataCenterName);
							downloadedDir.put(configurationDir + "#vdisk#"
									+ dataStoreName, "Directory");
						} else {
							System.out.println("Already Downloaded");
						}
					} else {
						// Do Nothing
					}
				}
				System.out.println("Downloading Virtual Disks Complete");
			} else {
				// Do Nothing
			}
		} else {
			System.out.println("Virtual Machine " + cb.get_option("vmname")
					+ " Not Found.");
		}
	}

	protected String[] getVmDirectory(ManagedObjectReference vmmor)
			throws Exception {
		String[] vmDir = new String[4];
		VirtualMachineConfigInfo vmConfigInfo = (VirtualMachineConfigInfo) cb
				.getServiceUtil().getDynamicProperty(vmmor, "config");
		if (vmConfigInfo != null) {
			vmDir[0] = vmConfigInfo.getFiles().getVmPathName();
			vmDir[1] = vmConfigInfo.getFiles().getSnapshotDirectory();
			vmDir[2] = vmConfigInfo.getFiles().getSuspendDirectory();
			vmDir[3] = vmConfigInfo.getFiles().getLogDirectory();
		} else {
			System.out.println("Connot Restore VM. Not Able "
					+ "To Finf The Virtual Machine Config Info");
		}
		return vmDir;
	}

	protected ManagedObjectReference getVmMor(String vmName) throws Exception {
		ManagedObjectReference vmmor = cb.getServiceUtil().getDecendentMoRef(
				null, "VirtualMachine", vmName);
		return vmmor;
	}

	protected String replaceSpecialChar(String fileName) {
		fileName = fileName.replace(':', '_');
		fileName = fileName.replace('*', '_');
		fileName = fileName.replace('<', '_');
		fileName = fileName.replace('>', '_');
		fileName = fileName.replace('|', '_');
		return fileName;
	}
}
