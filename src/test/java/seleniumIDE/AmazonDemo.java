package seleniumIDE;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AmazonDemo {
	
	
	//pre-condition  ------ Before 
	//test case      ------ @Test
	//post-condition ------ After
	
	//execution workflow  -------- launchApp -----verifySearchFeature ------ closeApp
	

	@After
	public void closeApp() {
		
		System.out.println("==========closeApp===================");
		
	}
	
	
	
	@Test
	public void verifySearchFeature() {
		
		
		System.out.println("verifySearchFeature test case execution.....");
		
	}
	
	
	@Before
	public void launchApp() {
		
		System.out.println("==========launchApp=====on chrome browser===================");
		
	}
	
	
	

}
