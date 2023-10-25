package javascriptExecutorExample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptExample1 extends BaseTest {
	
	
	@Test
	public void verifyLoginFeature() throws Exception {
		
		
		
		
		WebElement btn_Submit = driver.findElement(By.cssSelector("button#submit"));
		
		
		
		//javascript example
		
		
		JavascriptExecutor JS = (JavascriptExecutor)driver;
		
		JS.executeScript("arguments[0].click();", btn_Submit);
		
		//JS.executeScript("alert('hello everyone, happy learning!!')");
		
		
		
	}

	
	
	
	
}
