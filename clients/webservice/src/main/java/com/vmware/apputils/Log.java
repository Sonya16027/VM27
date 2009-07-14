package com.vmware.apputils;

import java.io.FileWriter;
import java.util.Date;

/**
 * Logger to file if possible or console.
 */
public class Log {

	private FileWriter _logger;
	private boolean _toConsole;

	private String _lineSep;

	public Log() {
	}

	public void init(String logfilepath, boolean appendlog, boolean toConsole) {
		try {
			String finlog = logfilepath;
			if (logfilepath.lastIndexOf(".") < 0) {
				finlog = logfilepath + ".txt";
			}
			_lineSep = System.getProperty("line.separator");

			_logger = new FileWriter(finlog, appendlog);

			if (_lineSep == null || _lineSep.length() == 0) {
				_lineSep = "\n";
			}

			_toConsole = toConsole;
		} catch (Exception e) {
			System.out.println("Exception initializing log to : " + logfilepath
					+ ". Using console. ");

			_logger = null;
			_toConsole = true;
		}
	}

	public synchronized void close() {
		if (_logger != null) {
			Date dt = new Date();
			internalLogLine(dt, "End Log.");
			internalLogLine(null, "");
			try {
				_logger.flush();
				_logger.close();
				_logger = null;
			} catch (Exception e) {
				System.out.println("Exception closing Log");
			}
		}
	}

	public synchronized void logLine(String strmsg) {
		if (_logger != null) {
			try {
				_logger.write(strmsg);
				_logger.write(_lineSep);
			} catch (Exception e) {
				System.out.println("Exception writing log message");
			}
		}
		if (_toConsole || _logger == null) {
			System.out.println(strmsg);
		}
	}

	public void internalLogLine(Date dt, String msg) {
		synchronized (this) {
			String strmsg = msg;
			if (dt != null) {
				strmsg = "[ " + dt.toString() + " ] " + msg;
			}
			if (_logger != null) {
				try {
					_logger.write(strmsg);
					_logger.write(_lineSep);
				} catch (Exception e) {
					System.out.println("Exception writing log message");
				}
			}
			if (_toConsole || _logger == null) {
				System.out.println(strmsg);
			}
		}
	}
}
