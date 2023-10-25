package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {
	
	public static Properties prop;

	public ReadConfig() throws Exception {
		
		
//		FileInputStream fis = new FileInputStream(".\\testData\\config.properties");
		FileInputStream fis = new FileInputStream("./testData/config.properties");
		
		
		prop = new Properties();
		
		prop.load(fis);
		
		
		
	}
	
	
	
	public static String get_AppURL() {
		
		return prop.getProperty("nopcomm_app_qa");
		
	}
	
	public static String get_email() {
		
		return prop.getProperty("admin_user");
		
	}
	
	public static String get_pass() {
		
		return prop.getProperty("admin_pass");
		
	}

}
