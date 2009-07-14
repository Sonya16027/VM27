package com.vmware.samples.general;

import com.vmware.apputils.AppUtil;

/**
 *<pre>
 * his sample simply connects to the ESX server or to a Virtual Center .
 * 
 * b&gt;Command:&lt;/b&gt;
 * un.bat com.vmware.samples.general.Connect --url [webserviceurl]
 *--username [username] --password [password]
 * 
 *<pre>
 */

public class Connect {
	private static AppUtil cb = null;

	public static void main(String[] args) throws Exception {
		try {
			Connect obj = new Connect();
			cb = AppUtil.initialize("Connect", args);
			cb.connect();
			System.out.println("Connection Succesful.");
			cb.disConnect();
		} catch (Exception e) {
			System.out.println("Connection UnSuccesful.");
			throw e;
		}
	}
}