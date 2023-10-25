package exerciseExample;

import org.openqa.selenium.By;
//import org.junit.After;
//import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FlipkartExample_ModalExample {

	WebDriver driver;

	@BeforeTest
	public void launchapp() throws Exception {
		System.out.println("===============launch application===============");

		System.out.println("executing test on chrome browser");
		driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
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
	public void verifytest() {
		
		
		driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("abhi@testmail.com");
		
	}

}
