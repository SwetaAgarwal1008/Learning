package controlExample;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandleCheckbox extends BaseTest{
	
	@Test
	public void checkboxtest() {
		
		
		WebElement boat_chk = driver.findElement(By.xpath("//input[@value=\"Boat\"]"));
		
		System.out.println("before click on checkbox, validate checkbox selected or not: " + boat_chk.isSelected());			//false
		
		boat_chk.click();
		
			
		System.out.println("after click on checkbox, validate checkbox selected or not: "+ boat_chk.isSelected());
		
		
		
		
		
		
	}

}
