package handleWindowExample;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WindowExample_IRCTCApp extends BaseTest {
	
	
	@Test
	public void verifyLoginFeature() throws Exception {
		
		
		
		
		String parentWindow = driver.getWindowHandle();				//unique window ID ---- single window ID , focus 
		
		
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("HOTELS")).click();
		Thread.sleep(3000);
		
		
		
		Set<String> allWin = driver.getWindowHandles();				//multiple window ID --- Set of String
		
		System.out.println("parent window: " + parentWindow);
		System.out.println("Window Count after clicking on Hotel button: " + allWin.size());
		
		
		String win1 = (String)allWin.toArray()[0];
		String win2 = (String)allWin.toArray()[1];
		
		
		
		System.out.println("win1: " + win1);
		System.out.println("win2: " + win2);
		
		
		
		System.out.println("application title before switch: " + driver.getTitle());
		
		//Alert/frame/window
		
		
		driver.switchTo().window(win2);
		
		System.out.println("application title : " + driver.getTitle());
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Login")).click();
		Thread.sleep(3000);
		
		
		
		
		driver.switchTo().window(parentWindow);
		
		System.out.println("application title : " + driver.getTitle());
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("CONTACT US")).click();
		Thread.sleep(3000);
		
		
		Thread.sleep(3000);
		driver.switchTo().window(win2);
		
		driver.findElement(By.cssSelector("[name=\"username\"]")).sendKeys("demo@testmail.com");
		
		
	}

	
	
	
	
}
