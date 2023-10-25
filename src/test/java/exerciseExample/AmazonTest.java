package exerciseExample;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {
	
	
//	@Before
//	public void launchapp() {
//		System.out.println("verifySearchFeature executing test case");
//	}
	
	
	
	
	@Test
	public void verifySearchFeature() {
		
		
		System.out.println("verifySearchFeature executing test case");
		
//		launch google app on chrome browser
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15 pro");
		
		
		
	}

}
