package controlExample;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElement_findElementsExample extends BaseTest{
	
	@Test
	public void checkboxtest() {
		
		
		
		//perform an action --- click on checkbox or radiobutton ---- click();
		
		
		//multiple match ---- by default perform an action on first element
//		driver.findElement(By.xpath("//input[@name='vehicle']")).click();
		
		
		
		
		//diff b/w findElement and findElements
		
//		WebElement checkbox = driver.findElement(By.xpath("//input[@name='vehicle']"));
		
		
		List<WebElement>  all_checkbox = driver.findElements(By.xpath("//input[@name='vehicle']"));  /// match - 3
		System.out.println("count checkbox: " + all_checkbox.size());
		
		
		
//		all_checkbox.get(2).click();
		
		
		
		for (int i = 0; i < all_checkbox.size(); i++) {
			
//			all_checkbox.get(i).click();
			
			String att_chk_value = all_checkbox.get(i).getAttribute("value");
			
			System.out.println("checkbox value are: " + att_chk_value);
			
			
			
			if(att_chk_value.equalsIgnoreCase("boat")) {
				
				all_checkbox.get(i).click();
			}
			
			
		}
		
		
		
		
		
	}

}
