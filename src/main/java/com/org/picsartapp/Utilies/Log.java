package com.org.picsartapp.Utilies;

import org.apache.log4j.Logger;

public class Log {
	
	
		private static Logger Log = Logger.getLogger(Log.class.getName());
		
		public static void startLogger(String testcasename)
		{
			Log.info("---"+testcasename+" execution started --------");
		}
	
		
		public static void endLogger(String testcasename)
		{
			Log.info("---"+testcasename+" execution completed --------");
		}
		public static void info(String message) {

			Log.info(message);

			}

	 public static void warn(String message) {

	    Log.warn(message);

		}

	 public static void error(String message) {

	    Log.error(message);

		}

	 public static void fatal(String message) {

	    Log.fatal(message);

		}
}
