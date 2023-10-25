package conditionWaitExample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ElementVIsibleAfterSometime {
	
	
	WebDriver driver;
//	Actions act;

	@BeforeTest
	public void launchapp() throws Exception {
		System.out.println("===============launch application===============");

		System.out.println("executing test on chrome browser");
		driver = new ChromeDriver();

		driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  				// wait for all the element on page
		
//		Thread.sleep(7000);

	}

	
	@AfterTest
	public void closeApp() throws Exception {
		System.out.println("===============close application===============");
		Thread.sleep(7000);
		driver.close();
	}
	
	
	
	
	
	
	
	@Test
	public void dragDropExample() throws Exception {
		
		
		
		//concept missing  ---- condition wait
		
//		explicit wait ---- specific condition to happen
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));  				//max time before throw an exception
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#text3")));
		
		
		WebElement txt_3 =driver.findElement(By.cssSelector("#text3"));
		txt_3.sendKeys("enter value into hidden text box");
		
		
		
		
	}

}
