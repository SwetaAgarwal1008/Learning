package javascriptExecutorExample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyntraApp extends BaseTest {
	WebDriver driver;

	@BeforeTest
	public void launchapp() throws Exception {
		System.out.println("===============launch application===============");

		System.out.println("executing test on chrome browser");
		driver = new ChromeDriver();

		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(7000);

	}

	
	@AfterTest
	public void closeApp() throws Exception {
		System.out.println("===============close application===============");
		Thread.sleep(7000);
//		driver.close();
		
		
		driver.quit();
	}
	
	@Test
	public void verifyLoginFeature() throws Exception {
		
		
		
		
		WebElement lbl_returnPolicy = driver.findElement(By.xpath("//strong[contains(text(),'within 14day')]"));
		
		
		
		//javascript example
		
		
		JavascriptExecutor JS = (JavascriptExecutor)driver;
		
		JS.executeScript("arguments[0].scrollIntoView();", lbl_returnPolicy);
		
		//JS.executeScript("alert('hello everyone, happy learning!!')");
		
		
		
	}

	
	
	
	
}
