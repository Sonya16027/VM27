package com.intalio.vmware;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Statistics {
	private Connection connection;

	public Statistics(Connection connection) {
		this.connection = connection;
	}

	public Calendar getCurrentTime() {
		Calendar ct = null;
		try {
			ct = connection.getVimPort().currentTime(Connection.SIMO_REF);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return ct;
	}

	public void printServerTime(Calendar ct) {
		try {
			if (ct != null) {
				SimpleDateFormat sdf = new SimpleDateFormat(
						"yyyy-MM-dd 'T' HH:mm:ss.SSSZ");
				System.out.println("Server current time: "
						+ sdf.format(ct.getTime()));
			} else {
				System.out
						.println("Error in retrieving the server current time");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
