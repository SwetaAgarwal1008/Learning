package actionExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RightClickTest {
	
	
	WebDriver driver;
//	Actions act;

	@BeforeTest
	public void launchapp() throws Exception {
		System.out.println("===============launch application===============");

		System.out.println("executing test on chrome browser");
		driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
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
	public void rightClickTest() throws Exception {
		
		
		
		WebElement btn_right =driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		
		
		Actions act = new Actions(driver);
		
		act.contextClick(btn_right).perform();;
		
		
		
		
	}
	
	
	@Test
	public void doubleClickTest() throws Exception {
		
		
		
		WebElement btn_doubclick =driver.findElement(By.xpath("//button[contains(text(),'Dou')]"));
		
		Actions act = new Actions(driver);
		act.doubleClick(btn_doubclick).perform();;
		
		
		
		Thread.sleep(3000);
		
		//handle alert
		System.out.println("==============: "+driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		
		
		
		
	}

}
