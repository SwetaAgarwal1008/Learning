package handleframe;

import org.openqa.selenium.By;
//import org.junit.After;
//import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoApp_Frame {

	WebDriver driver;

	@BeforeTest
	public void launchapp() throws Exception {
		System.out.println("===============launch application===============");

		System.out.println("executing test on chrome browser");
		driver = new ChromeDriver();

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		
		Thread.sleep(7000);

	}

	
	@AfterTest
	public void closeApp() throws Exception {
		System.out.println("===============close application===============");
		Thread.sleep(7000);
		driver.close();
	}
	
	
	
	@Test
	public void verifyImage() {
		
		
		//handle a frame
		
//		index
//		id or name
//		webelement
//		
		
		WebElement myFrame = driver.findElement(By.xpath("//iframe[contains(@data-src,\"photo\")]"));
		
		
		
		//switch to frame
		
		driver.switchTo().frame(myFrame);
		
		
		
		
		WebElement img_3 = driver.findElement(By.xpath("//img[contains(@src,\"tatras3_min\")]"));
		
		System.out.println("*****************: " + img_3.getAttribute("alt"));
		
		
		
	}

}
