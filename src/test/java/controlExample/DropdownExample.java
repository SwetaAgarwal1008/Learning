package controlExample;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample extends BaseTest{
	
	
	
	//@Test
	public void listbox() throws Exception {
		
		
		WebElement list = driver.findElement(By.xpath("//select[@name=\"FromLB\"]"));
		
		
		
		
		Select li = new Select(list);
		
		
		System.out.println("is dropdown accept multiple selection or not: " + li.isMultiple());			//true
		
		li.selectByIndex(0);				//USA
		li.selectByIndex(1);				//India
		
		
		Thread.sleep(2000);
		
		
		
		li.selectByValue("India");			//India
		
		Thread.sleep(2000);
		li.selectByVisibleText("Greece");	//Greece
		
		Thread.sleep(4000);
		
		
		li.deselectByValue("USA");
		li.deselectByIndex(9);				//Greece
		li.deselectByVisibleText("Russia");
		
		
		
		
		
		
	}

	
	@Test
	public void listbox2() throws Exception {
		
		
		WebElement list = driver.findElement(By.xpath("//select"));			//by default --- perform action on first element
		Select li = new Select(list);
		
		
		System.out.println("is dropdown accept multiple selection or not: " + li.isMultiple());			//false
		
		Thread.sleep(2000);
		li.selectByIndex(1);					//Saab
		
		Thread.sleep(2000);
		li.selectByVisibleText("Toyota");		//Toyota
		Thread.sleep(2000);
		
		li.selectByValue("Singapore");			//Opel
		
		
		
		
	}
	
	
}
