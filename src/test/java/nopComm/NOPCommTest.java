package nopComm;

import org.junit.Test;
import org.openqa.selenium.By;

public class NOPCommTest extends BaseTest{
	
		
	@Test
	public void verifySearchFeature() throws InterruptedException {
		
		
		System.out.println("verifySearchFeature executing test case");
		
		System.out.println("App URL: " + driver.getCurrentUrl());
		System.out.println("App Title: " + driver.getTitle());
		
		
		
		driver.findElement(By.xpath("//input[@name='Email']")).clear();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name=\"Email\"]")).sendKeys("admin@yourstore.com");
		
		
		
	}

}
