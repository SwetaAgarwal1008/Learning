package crosssBrowserTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NOPCmmAPP extends BaseTestCrossBrowser{
	
	
	@Test
	public void verifyLogin() throws Exception {
		
		
		
		
		driver.findElement(By.cssSelector("input#Email")).clear();;
		driver.findElement(By.cssSelector("input#Email")).sendKeys("admin@yourstore.com");
		
		driver.findElement(By.id("Password")).clear();;
		driver.findElement(By.id("Password")).sendKeys("admin");
		
		
		driver.findElement(By.cssSelector("input#RememberMe")).click();
		
		
		driver.findElement(By.tagName("button")).click();
		
		
//		validation step
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Dashboard"), "validation of applicaiton title get failed after login");
		
		
		
		driver.findElement(By.partialLinkText("Logo")).click();
		
		
//		validation step
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Login"), "validation of applicaiton title get failed after logout");
		
	}

}
