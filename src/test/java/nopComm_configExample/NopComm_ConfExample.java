package nopComm_configExample;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.ReadConfig;

public class NopComm_ConfExample extends BaseTest {
	
	
	@Test
	public void verifyLoginFeature() throws Exception {
		
		
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#Email")).clear();;
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#Email")).sendKeys(ReadConfig.get_email());
		
		
		
		
		System.out.println("fecth password: " +ReadConfig.prop.getProperty("admin_pass"));
		
		System.out.println("fecth password: " +ReadConfig.get_pass());
		
	}

	
	
	
}
