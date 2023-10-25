package rutoExample;

import org.openqa.selenium.By;
//import org.junit.After;
//import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NOPCommTest {

	WebDriver driver;

	
	@Parameters("platform")
	@BeforeTest
	public void launchapp(String plat) throws Exception {
		System.out.println("===============launch application===============");

		System.out.println("fetching value from XML file: " + plat);
		
		
		
		
		if(plat.equalsIgnoreCase("window")) {
			
			driver = new ChromeDriver();
			
		}
		else {
			driver = new ChromeDriver();
			
		}
		
		
		driver = new ChromeDriver();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
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
	public void verifyAppfeature() {
		
		
//		driver.findElement(By.xpath("")).sendKeys("admin");
		
		driver.findElement(By.cssSelector("input#Email")).clear();;
		driver.findElement(By.cssSelector("input#Email")).sendKeys("values to send");
		
		driver.findElement(By.id("Password")).clear();;
		driver.findElement(By.id("Password")).sendKeys("values to send");
		
		
		driver.findElement(By.cssSelector("input#RememberMe")).click();
		
		
		driver.findElement(By.tagName("button")).click();
		
		
	}
}
