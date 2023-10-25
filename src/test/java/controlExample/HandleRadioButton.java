package controlExample;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandleRadioButton extends BaseTest{
	
	@Test
	public void checkboxtest() {
		
		
		WebElement radioButton1 = driver.findElement(By.xpath("//input[@value='female']"));
		radioButton1.click();
		
		
		
		
		
	}

}
