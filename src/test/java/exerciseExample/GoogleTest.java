package exerciseExample;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
	
	
//	@Before
//	public void launchapp() {
//		System.out.println("verifySearchFeature executing test case");
//	}
	
	
	
	
	@Test
	public void verifySearchFeature() {
		
		
		System.out.println("verifySearchFeature executing test case");
		
//		launch google app on chrome browser
		
		ChromeDriver ibm = new ChromeDriver();
		
		ibm.get("https://www.google.com/");
		
		
		
	}

}
