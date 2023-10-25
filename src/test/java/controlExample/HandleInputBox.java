package controlExample;

import org.junit.Test;
import org.openqa.selenium.By;

public class HandleInputBox extends BaseTest{
	
	@Test
	public void inputboxtest() {
		
		
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("enter firstname");
		
		
		
	}

}
