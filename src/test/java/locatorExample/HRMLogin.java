package locatorExample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMLogin {
	WebDriver driver;
	@Before
	public void launchApp() throws Exception {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
	}
	
	@After
	public void closeApp() throws Exception {
		
		Thread.sleep(7000);
		driver.close();
	}
	
	@Test
	public void verifyLoginLogoutTest() throws InterruptedException {
		
		
		//locator
//		id
//		name
//		className
//		tagName
//
//		linkText
//		partialLinktext
//
//
//		xpath
//		css selector
		
		
//		int x = 10;
//		name = "abhi";
		
		//name
		WebElement txt_username = driver.findElement(By.name("username"));
		txt_username.sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		
		//tagname
		driver.findElement(By.tagName("button")).click();
		
		
		Thread.sleep(5000);
		System.out.println("application URL: after login");
		System.out.println("application URL: " + driver.getCurrentUrl());
		
		
		//classname
		driver.findElement(By.className("oxd-userdropdown-name")).click();
		
		Thread.sleep(5000);
		
		//linkText
//		driver.findElement(By.linkText("Logout")).click();			// extact text ------ Logout
		
		
		//partialLinkText
		driver.findElement(By.partialLinkText("ogou")).click();    //partial text  ---- Logo      ------ ex: Welcome Amit/Abhishek/Himanshu
		
		Thread.sleep(5000);
		System.out.println("application URL: after logout");
		System.out.println("application URL: " + driver.getCurrentUrl());
		
		
		//xpath
//		driver.findElement(By.xpath("//*[@placeholder='Username']")).sendKeys("AdminDemo");
		
//		Thread.sleep(5000);
//		
//		//xpath
//		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(".......AdminDemo");
		
		
//		Css Selector 
		
		
		driver.findElement(By.cssSelector("[placeholder='Username']")).sendKeys("AdminDemoCSS");
		
	}
	

}
