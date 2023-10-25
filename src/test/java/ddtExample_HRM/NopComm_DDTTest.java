package ddtExample_HRM;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NopComm_DDTTest extends BaseTest {
	
	
	@Test(dataProvider = "regressionTestData")
	public void verifyLoginFeature(String email, String pwd) throws Exception {
		
		System.out.println("user credenatils: " + email + " : " + pwd);
		
		driver.navigate().refresh();
		
		
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys(email);
		
		
		
		
		
	}

	
	
	
	@DataProvider
	public Object[][] smokeTestData() {
		
		
		Object [][] data = { {"himanshu@gmail.com", "welcome"}, {"harshal@google.com", "welcome"}, {"lavanya@yahoo.com", "demo@123"}};
		
		return data;
		
	}
	
	

	@DataProvider
	public Object[][] regressionTestData() {
		
		
		Object [][] data = { {"himanshuRegression@gmail.com", "welcome"}, {"harshalRegression@google.com", "welcome"}, {"lavanyaRegression@yahoo.com", "demo@123"}, {"DhruvRegression@yahoo.com", "demo@123"}};
		
		return data;
		
	}
}
