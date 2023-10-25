package WebTableExample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.junit.After;
//import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SmapleApp_WebTableExample_XPATH2_JS {

	WebDriver driver;

	@BeforeTest
	public void launchapp() throws Exception {
		System.out.println("===============launch application===============");
		driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.manage().window().maximize();
		
		Thread.sleep(7000);

	}

	
	@AfterTest
	public void closeApp() throws Exception {
		System.out.println("===============close application===============");
		Thread.sleep(7000);
//		driver.close();
		
		
		//driver.quit();
	}
	
	
	@Test
	public void validateWebTable() {
		
		WebElement checkbox_maria = driver.findElement(By.xpath("//td[text()='Helen Bennett']/preceding-sibling::td/input"));
		
		
		
		
		
		JavascriptExecutor JS = (JavascriptExecutor)driver;
		JS.executeScript("arguments[4].click()", checkbox_maria, "", "", "", checkbox_maria);
		
		
		
	}

}
