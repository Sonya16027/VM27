package com.vmware.apputils.version;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.vmware.apputils.AppUtil;

public class VersionUtil {
	public static ArrayList getSupportedVersions(String urlString) {
		String targetNameSpace = "";
		ArrayList apiVersions = new ArrayList();
		try {
			String wsdlUrlString = "";
			String vimServiceXmlUrlString = "";

			if ((urlString.indexOf("https://") != -1)
					|| (urlString.indexOf("http://") != -1)) {
				wsdlUrlString = urlString.substring(0, urlString
						.indexOf("/sdk") + 4)
						+ "/vimService?wsdl";
				vimServiceXmlUrlString = urlString.substring(0, urlString
						.indexOf("/sdk") + 4)
						+ "/vimServiceVersions.xml";
			} else {
				wsdlUrlString = "https://" + urlString + "/sdk/vimService?wsdl";
				vimServiceXmlUrlString = "https://" + urlString
						+ "/sdk/vimServiceVersions.xml";
			}
			trustAllHttpsCertificates();
			HostnameVerifier hv = new HostnameVerifier() {
				public boolean verify(String urlHostName, SSLSession session) {
					return true;
				}
			};
			boolean isServiceXmlExists = true;
			try {
				HttpsURLConnection.setDefaultHostnameVerifier(hv);
				URL url = new URL(vimServiceXmlUrlString);
				HttpURLConnection conn = (HttpURLConnection) url
						.openConnection();
				conn.connect();
				BufferedReader in = new BufferedReader(new InputStreamReader(
						conn.getInputStream()));
				String data = "";
				String line = "";
				while ((line = in.readLine()) != null) {
					data = data + line;
				}
				targetNameSpace = "urn:vim25Service";
				apiVersions = getAPIVersions(data);
			} catch (FileNotFoundException e) {
				isServiceXmlExists = false;
			}
			if (!isServiceXmlExists) {
				HttpsURLConnection.setDefaultHostnameVerifier(hv);
				URL url = new URL(wsdlUrlString);
				HttpURLConnection conn = (HttpURLConnection) url
						.openConnection();
				conn.connect();
				BufferedReader in = new BufferedReader(new InputStreamReader(
						conn.getInputStream()));
				String data = "";
				String line = "";
				while ((line = in.readLine()) != null) {
					data = data + line;
				}
				targetNameSpace = getTargetNamespace(data).trim();
				if (targetNameSpace.equalsIgnoreCase("urn:vim25Service")) {
					apiVersions.add("2.5");
				} else {
					apiVersions.add("2.0");
				}
			}
		} catch (MalformedURLException e) {
			System.out.println("Error in SSL Connetion");
		} catch (SSLException e) {
			System.out.println("SSL-error: unable to find"
					+ " valid certification path to requested target");
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (Exception e) {
			System.out.println("error" + e);
			e.printStackTrace();
		}
		return apiVersions;
	}

	public static boolean isApiVersionSupported(ArrayList apiVersions,
			String version) {
		boolean flag = false;
		for (int i = 0; i < apiVersions.size(); i++) {
			String ver = (String) apiVersions.get(i);
			if (ver.equalsIgnoreCase(version)) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	private static ArrayList getAPIVersions(String data) {
		ArrayList priorVersions = new ArrayList();
		try {
			DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
			byte[] xmlData = data.getBytes();
			ByteArrayInputStream byteArray = new ByteArrayInputStream(xmlData);
			Document doc = docBuilder.parse(byteArray);
			XPath xpath = XPathFactory.newInstance().newXPath();
			String expression = "/namespaces/namespace";
			NodeList nsNodes = (NodeList) xpath.evaluate(expression, doc,
					XPathConstants.NODESET);
			for (int i = 0; i < nsNodes.getLength(); i++) {
				Node nsNode = nsNodes.item(i);
				xpath = XPathFactory.newInstance().newXPath();
				expression = "name";
				Node nameNode = (Node) xpath.evaluate(expression, nsNode,
						XPathConstants.NODE);
				if (nameNode.getTextContent().equalsIgnoreCase("urn:vim25")) {
					expression = "priorVersions";
					Node priorVersionsNode = (Node) xpath.evaluate(expression,
							nsNode, XPathConstants.NODE);
					expression = "version";
					NodeList priorVersionsNodeList = (NodeList) xpath.evaluate(
							expression, priorVersionsNode,
							XPathConstants.NODESET);
					for (int j = 0; j < priorVersionsNodeList.getLength(); j++) {
						Node versionNode = priorVersionsNodeList.item(j);
						priorVersions.add(versionNode.getTextContent());
					}
					expression = "version";
					Node versionNode = (Node) xpath.evaluate(expression,
							nsNode, XPathConstants.NODE);
					priorVersions.add(versionNode.getTextContent());
				}
			}
			return priorVersions;
		} catch (Exception e) {
			return null;
		}
	}

	private static String getTargetNamespace(String data) {
		try {
			DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
			byte[] xmlData = data.getBytes();
			ByteArrayInputStream byteArray = new ByteArrayInputStream(xmlData);
			Document doc = docBuilder.parse(byteArray);
			Element test = doc.getDocumentElement();
			String version = test.getAttribute("targetNamespace");
			return version;
		} catch (Exception e) {
			return null;
		}
	}

	private static void trustAllHttpsCertificates() throws Exception {
		javax.net.ssl.TrustManager[] trustAllCerts = new javax.net.ssl.TrustManager[1];
		javax.net.ssl.TrustManager tm = new miTM();
		trustAllCerts[0] = tm;
		javax.net.ssl.SSLContext sc = javax.net.ssl.SSLContext
				.getInstance("SSL");
		sc.init(null, trustAllCerts, null);
		javax.net.ssl.HttpsURLConnection.setDefaultSSLSocketFactory(sc
				.getSocketFactory());
	}

	public static String getCookieString(AppUtil cb) {
		com.vmware.vim.VimPortType test = cb.getConnection().getService();
		org.apache.axis.client.Stub st = (org.apache.axis.client.Stub) test;
		org.apache.axis.client.Call callObj = st._getCall();
		org.apache.axis.MessageContext msgContext = callObj.getMessageContext();
		String cookieString = (String) msgContext
				.getProperty(org.apache.axis.transport.http.HTTPConstants.HEADER_COOKIE);
		return cookieString;
	}

	public static com.vmware.vim25.ManagedObjectReference convertManagedObjectReference(
			com.vmware.vim.ManagedObjectReference mor) {
		com.vmware.vim25.ManagedObjectReference morr1 = new com.vmware.vim25.ManagedObjectReference();
		morr1.setType(mor.getType());
		morr1.set_value(mor.get_value());
		return morr1;
	}

	private static class miTM implements javax.net.ssl.TrustManager,
			javax.net.ssl.X509TrustManager {
		public java.security.cert.X509Certificate[] getAcceptedIssuers() {
			return null;
		}

		public boolean isServerTrusted(
				java.security.cert.X509Certificate[] certs) {
			return true;
		}

		public boolean isClientTrusted(
				java.security.cert.X509Certificate[] certs) {
			return true;
		}

		public void checkServerTrusted(
				java.security.cert.X509Certificate[] certs, String authType)
				throws java.security.cert.CertificateException {
			return;
		}

		public void checkClientTrusted(
				java.security.cert.X509Certificate[] certs, String authType)
				throws java.security.cert.CertificateException {
			return;
		}
	}
}