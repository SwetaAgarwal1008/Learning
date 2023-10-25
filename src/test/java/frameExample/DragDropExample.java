package frameExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragDropExample {
	
	
	WebDriver driver;
//	Actions act;

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
	public void dragDropExample() throws Exception {
		
		
		
		//concept missing  ---- handle frame
		WebElement myFrame =driver.findElement(By.cssSelector("iframe[data-src*='photo']"));
		
		driver.switchTo().frame(myFrame);
		
		
		WebElement img_3 =driver.findElement(By.cssSelector("img[src*='tatras3']"));
		WebElement img_4 =driver.findElement(By.cssSelector("img[src*='tatras4']"));
		WebElement trash =driver.findElement(By.cssSelector("div#trash"));
		
		
		
//		System.out.println("get the element property: " + img_3.getAttribute("alt"));
		
		//app1
		Actions act = new Actions(driver);
		act.dragAndDrop(img_3, trash).perform();
//		act.dragAndDrop(img_4, trash).perform();
		
		
		
		//app2
		//A convenience method that performs click-and-hold at the location of the source element, 
		//moves to the location of the target element, then releases the mouse.
		
		act.clickAndHold(img_4).moveToElement(trash).release().perform();
		
		
	}

}
