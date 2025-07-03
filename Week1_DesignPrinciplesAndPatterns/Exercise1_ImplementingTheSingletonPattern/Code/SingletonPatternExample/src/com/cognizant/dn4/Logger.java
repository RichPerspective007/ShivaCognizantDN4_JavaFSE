package com.cognizant.dn4;

public class Logger {
	private static Logger loggerInst = new Logger();
	private Logger() {
		
	}
	public static Logger getLogger() {
		return loggerInst;
	}
}
