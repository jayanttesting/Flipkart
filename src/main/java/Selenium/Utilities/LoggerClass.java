package Selenium.Utilities;
import org.apache.log4j.Logger;


public class LoggerClass
{
	private static Logger Log = Logger.getLogger(LoggerClass.class.getName());
	
	public static void starttestcase(String TestCaseName)
	{
		Log.info("****************************************************************************************");
		 
		Log.info("****************************************************************************************");
	 
		Log.info("$$$$$$$$$$$$$$$$$$$$$                 "+TestCaseName+ "       $$$$$$$$$$$$$$$$$$$$$$$$$");
	 
		Log.info("****************************************************************************************");
	 
		Log.info("****************************************************************************************");
	 
	}
	
	 public static void endTestCase(String sTestCaseName){
		 
			Log.info("XXXXXXXXXXXXXXXXXXXXXXX             "+"-E---N---D-"+"             XXXXXXXXXXXXXXXXXXXXXX");
		 
			Log.info("X");
		 
			Log.info("X");
		 
			Log.info("X");
		 
			Log.info("X");
		 
			}

	  //Info Level Logs
	    public static void info (String message) {
	        Log.info(message);
	    }
	 
	    //Warn Level Logs
	    public static void warn (String message) {
	        Log.warn(message);
	    }
	 
	    //Error Level Logs
	    public static void error (String message) {
	        Log.error(message);
	    }
	 
	    //Fatal Level Logs
	    public static void fatal (String message) {
	        Log.fatal(message);
	    }
	 
	    //Debug Level Logs
	    public static void debug (String message) {
	        Log.debug(message);
	    }
	}