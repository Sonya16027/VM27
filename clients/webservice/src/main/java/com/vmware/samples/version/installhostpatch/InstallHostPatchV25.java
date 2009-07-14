package com.vmware.samples.version.installhostpatch;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.vmware.apputils.version.ExtendedAppUtil;
import com.vmware.apputils.version.VersionUtil;
import com.vmware.vim25.HostConfigManager;
import com.vmware.vim25.HostPatchManagerLocator;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ProductComponentInfo;
import com.vmware.vim25.ServiceContent;
import com.vmware.vim25.VimPortType;

public class InstallHostPatchV25 {
	private static ExtendedAppUtil ecb = null;
	private final static String BUNDLE_METADATA = "metadata.xml";
	private final static String CONTENTS_METADATA = "contents.xml";
	private final static String ESXHW_PRODUCTLINE_ID = "embeddedEsx";
	private final static String PATCH_DIR = "rcli_patch";
	private static ManagedObjectReference hmor = null;

	public static void queryHostComponents(
			com.vmware.vim.ManagedObjectReference sic, String[] args,
			String cookieString) throws Exception {
		connectV25(args, cookieString);

		ManagedObjectReference sicv25 = VersionUtil
				.convertManagedObjectReference(sic);

		ProductComponentInfo[] pcis = ecb.getServiceConnection3().getService()
				.retrieveProductComponents(sicv25);

		if (pcis.length > 0) {
			System.out.println("\nProduct Components info \n");
		}
		for (ProductComponentInfo pci : pcis) {
			System.out.println("Product Components  -: " + pci.getName());
			System.out.println("Product Release     -: " + pci.getRelease());
			System.out.println("\n");
		}
	}

	public static void installHostComponents(String[] args, String cookieString)
			throws Exception {
		connectV25(args, cookieString);
		ArrayList hmorList = ecb.getServiceUtil3().getDecendentMoRefs(null,
				"HostSystem");
		if (hmorList.get(0) != null) {
			hmor = (ManagedObjectReference) hmorList.get(0);
			String fileName = ecb.getOption("bundle");
			ArrayList fileList = unzipFile(fileName);
			boolean valid = verifySignatures(fileList);
			installUpdate(hmor);
		} else {
			System.out.println("Host not found");
		}
	}

	private static void installUpdate(ManagedObjectReference hmor)
			throws Exception {
		HostConfigManager cm = (HostConfigManager) ecb.getServiceUtil3()
				.getDynamicProperty(hmor, "configManager");
		ManagedObjectReference pm = cm.getPatchManager();
		if (pm != null) {
			ManagedObjectReference sic = ecb.getServiceConnection3()
					.getServiceInstanceRef();
			ServiceContent sc = (ServiceContent) ecb.getServiceUtil3()
					.getDynamicProperty(sic, "content");

			String productLineId = sc.getAbout().getProductLineId();
			String version = sc.getAbout().getVersion();
			String localVersion = sc.getAbout().getLocaleVersion();
			String fullName = sc.getAbout().getFullName();
			String productStr = productLineId + " " + version + " "
					+ localVersion;

			String bundleProductStr = getbundleProductStr();
			System.out.println("Product Str " + productStr);
			System.out.println("Bundle Product Str " + bundleProductStr);

			if (bundleProductStr.equalsIgnoreCase(productStr)) {
				installComponents(pm);
			} else {
				System.out
						.println("$bundle_product_str does not apply to target host "
								+ productStr);
			}
		} else {
			System.out.println("Patch manager not found. Install failed");
		}
	}

	private static void installComponents(ManagedObjectReference pm)
			throws Exception {
		Document doc = getDocument(ecb.getOption("targetDirectory") + "/"
				+ BUNDLE_METADATA);
		NodeList listOfPackage = doc.getElementsByTagName("package");
		for (int i = 0; i < listOfPackage.getLength(); i++) {
			Node packageNode = listOfPackage.item(i);
			if (packageNode.getNodeType() == Node.ELEMENT_NODE) {
				Element packageElement = (Element) packageNode;
				Element nameElement = (Element) packageElement
						.getElementsByTagName("name").item(0);
				NodeList nameList = nameElement.getChildNodes();
				String pName = (nameList.item(0)).getNodeValue();

				NodeList scanData = packageElement
						.getElementsByTagName("scanData");
				Element scanElement = (Element) scanData.item(0);

				Element scanNameElement = (Element) scanElement
						.getElementsByTagName("name").item(0);
				NodeList scanNameList = scanNameElement.getChildNodes();
				String scanName = (scanNameList.item(0)).getNodeValue();

				Element scanRelElement = (Element) scanElement
						.getElementsByTagName("rel").item(0);
				NodeList scanRelList = scanRelElement.getChildNodes();
				Integer scanRel = Integer.parseInt((scanRelList.item(0))
						.getNodeValue());

				ProductComponentInfo[] pcis = ecb.getServiceConnection3()
						.getService().retrieveProductComponents(
								ecb.getServiceConnection3()
										.getServiceInstanceRef());
				boolean toInstall = true;
				for (ProductComponentInfo pci : pcis) {
					if (pci.getName().equalsIgnoreCase(scanName)
							&& pci.getRelease() >= scanRel) {
						toInstall = false;
					}
				}
				if (toInstall) {
					System.out.println(pName + "neeeds to be installed");
					Document contentDoc = getDocument(ecb
							.getOption("targetDirectory")
							+ "/" + pName + "/" + CONTENTS_METADATA);
					NodeList fileList = contentDoc.getElementsByTagName("file");
					for (int j = 0; j < fileList.getLength(); j++) {
						Element file = (Element) fileList.item(j);
						String fileName = file.getAttribute("name");
						putFiles(ecb.getOption("targetDirectory") + "/" + pName
								+ "/" + fileName, pName);
					}
					HostPatchManagerLocator hpml = new HostPatchManagerLocator();
					hpml.setUrl("file:///tmp/" + PATCH_DIR + "/" + pName);
					ManagedObjectReference task = ecb.getServiceConnection3()
							.getService().installHostPatch_Task(pm, hpml,
									"update", true);
					String res = ecb.getServiceUtil3().waitForTask(task);
					System.out.println(pName + " updated -: " + res);
				}
			}
		}
	}

	private static String getbundleProductStr() throws Exception {
		Document doc = getDocument(ecb.getOption("targetDirectory") + "/"
				+ BUNDLE_METADATA);
		Element nameElement = (Element) doc.getDocumentElement()
				.getElementsByTagName("name").item(0);
		NodeList nameList = nameElement.getChildNodes();
		String name = (nameList.item(0)).getNodeValue();

		Element versionElement = (Element) doc.getDocumentElement()
				.getElementsByTagName("version").item(0);
		NodeList versionList = versionElement.getChildNodes();
		String version = (versionList.item(0)).getNodeValue();

		Element localeElement = (Element) doc.getDocumentElement()
				.getElementsByTagName("locale").item(0);
		NodeList localeList = localeElement.getChildNodes();
		String locale = (localeList.item(0)).getNodeValue();

		String str = name + " " + version + " " + locale;
		// System.out.println("String123 " + str);
		return str;
	}

	private static boolean verifySignatures(ArrayList fileList)
			throws Exception {
		System.out.println("Veification .....");
		Document doc = getDocument(ecb.getOption("targetDirectory") + "/"
				+ BUNDLE_METADATA);
		NodeList listOfPackage = doc.getElementsByTagName("package");
		for (int i = 0; i < listOfPackage.getLength(); i++) {
			Node packageNode = listOfPackage.item(i);
			if (packageNode.getNodeType() == Node.ELEMENT_NODE) {
				Element packageElement = (Element) packageNode;
				NodeList packageName = packageElement
						.getElementsByTagName("packageContentsUrl");
				if (packageName.getLength() > 0) {
					Element packageNameElement = (Element) packageName.item(0);
					NodeList packageNameList = packageNameElement
							.getChildNodes();
					String oName = (packageNameList.item(0)).getNodeValue();
					boolean found = foundFile(fileList, oName.substring(oName
							.lastIndexOf("/")));
					if (found) {
						System.out.println("Package    "
								+ oName.substring(oName.lastIndexOf("/") + 1)
								+ " found");
						unzipMember(ecb.getOption("targetDirectory") + "/"
								+ oName.substring(oName.lastIndexOf("/") + 1));
					} else {
						System.out.println("Package not found "
								+ oName.substring(oName.lastIndexOf("/"))
								+ " found");
						return false;
					}
				}
				packageName = packageElement.getElementsByTagName("signature");
				if (packageName.getLength() > 0) {
					Element packageNameElement = (Element) packageName.item(1);
					NodeList packageNameList = packageNameElement
							.getChildNodes();
					String oName = (packageNameList.item(0)).getNodeValue();
					boolean found = foundFile(fileList, oName.substring(oName
							.lastIndexOf("/")));
					if (found) {
						System.out.println("Signature  "
								+ oName.substring(oName.lastIndexOf("/") + 1)
								+ " found");
					} else {
						System.out.println("Signature not found "
								+ oName.substring(oName.lastIndexOf("/"))
								+ " found");
						return false;
					}
				}
			}
		}
		return true;
	}

	private static ArrayList unzipFile(String fileName) throws Exception {
		System.out.println("Unpacking bundle .....");
		ArrayList fileList = new ArrayList();
		ZipFile zipFile = new ZipFile(fileName);
		Enumeration entries = zipFile.entries();
		while (entries.hasMoreElements()) {
			ZipEntry entry = (ZipEntry) entries.nextElement();
			if (!entry.isDirectory()) {
				fileList.add(entry.getName().substring(
						entry.getName().lastIndexOf("/")));

				copyInputStream(zipFile.getInputStream(entry),
						new BufferedOutputStream(new FileOutputStream(ecb
								.getOption("targetDirectory")
								+ "/"
								+ entry.getName().substring(
										entry.getName().lastIndexOf("/")))));

			}
		}
		zipFile.close();
		return fileList;
	}

	private static void unzipMember(String fileName) throws Exception {
		ZipFile zipFile = new ZipFile(fileName);
		Enumeration entries = zipFile.entries();
		while (entries.hasMoreElements()) {
			ZipEntry entry = (ZipEntry) entries.nextElement();
			if (!entry.isDirectory()) {
				boolean success = (new File(ecb.getOption("targetDirectory")
						+ "/"
						+ entry.getName().substring(0,
								entry.getName().indexOf("/")))).mkdirs();
				copyInputStream(zipFile.getInputStream(entry),
						new BufferedOutputStream(new FileOutputStream(ecb
								.getOption("targetDirectory")
								+ "/" + entry.getName())));
			}
		}
		zipFile.close();
	}

	private static boolean foundFile(ArrayList fileList, String fileName)
			throws Exception {
		if (fileList.contains(fileName)) {
			return true;
		} else {
			return false;
		}
	}

	private static void copyInputStream(InputStream in, OutputStream out)
			throws IOException {
		byte[] buffer = new byte[1024];
		int len;

		while ((len = in.read(buffer)) >= 0) {
			out.write(buffer, 0, len);
		}
		in.close();
		out.close();
	}

	private static Document getDocument(String fileName) throws Exception {
		File metadata = new File(fileName);
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory
				.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();

		Document doc = docBuilder.parse(metadata);
		doc.normalize();
		return doc;
	}

	private static void connectV25(String[] args, String cookieString)
			throws Exception {
		ecb = ExtendedAppUtil.initialize("InstallHostPatch", InstallHostPatch
				.constructOptions(), args);
		ecb.connect(cookieString);
	}

	private static void putFiles(String localFilePath, String pName)
			throws Exception {
		String serviceUrl = ecb.getServiceUrl();
		serviceUrl = serviceUrl.substring(0, serviceUrl.lastIndexOf("sdk") - 1);
		String httpUrl = serviceUrl + "/tmp/" + PATCH_DIR + "/" + pName + "/"
				+ localFilePath.substring(localFilePath.lastIndexOf("/") + 1);
		httpUrl = httpUrl.replaceAll("\\ ", "%20");
		System.out.println("Putting VM File " + httpUrl);
		HttpURLConnection conn = getHTTPConnection(httpUrl);
		conn
				.setRequestProperty(
						org.apache.axis.transport.http.HTTPConstants.HEADER_CONTENT_LENGTH,
						"1024");
		OutputStream out = conn.getOutputStream();
		FileInputStream in = new FileInputStream(new File(localFilePath));

		byte[] buf = new byte[1024];
		int len = 0;
		while ((len = in.read(buf)) > 0) {
			out.write(buf, 0, len);
		}
		conn.getResponseMessage();
		conn.disconnect();
		out.close();
	}

	private static String getCookie() throws Exception {
		VimPortType test = ecb.getServiceConnection3().getService();
		org.apache.axis.client.Stub st = (org.apache.axis.client.Stub) test;
		org.apache.axis.client.Call callObj = st._getCall();
		org.apache.axis.MessageContext msgContext = callObj.getMessageContext();
		String cookieString = (String) msgContext
				.getProperty(org.apache.axis.transport.http.HTTPConstants.HEADER_COOKIE);
		return cookieString;
	}

	private static HttpURLConnection getHTTPConnection(String urlString)
			throws Exception {
		String cookieString = getCookie();
		HostnameVerifier hv = new HostnameVerifier() {
			public boolean verify(String urlHostName, SSLSession session) {
				return true;
			}
		};

		HttpsURLConnection.setDefaultHostnameVerifier(hv);
		URL url = new URL(urlString);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setDoOutput(true);

		conn.setRequestProperty(
				org.apache.axis.transport.http.HTTPConstants.HEADER_COOKIE,
				cookieString);

		conn
				.setRequestProperty(
						org.apache.axis.transport.http.HTTPConstants.HEADER_CONTENT_TYPE,
						"application/octet-stream");

		conn.setRequestProperty(
				org.apache.axis.transport.http.HTTPConstants.HEADER_EXPECT,
				"100-continue");
		conn.setRequestMethod("PUT");
		return conn;
	}
}