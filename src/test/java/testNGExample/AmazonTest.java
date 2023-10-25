package testNGExample;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTest {

	
	
	

	@Test(priority = -100, groups = "smokeTest")
	public void login() {
		System.out.println("login test case");
		
		Assert.assertTrue(false);
		
	}
	
	@Test(priority = 5, dependsOnMethods = "login")
	public void logout() {
		System.out.println("logout test case");
		
	}
	
	
	@BeforeTest
	public void launchApp() {
		System.out.println("============launching an application============");
		
	}
	
	
	@AfterTest
	public void closeApp() {
		System.out.println("============closing an application============");
		
	}

	
	
	
	@Test(description = "adding an item to KART !!", dependsOnGroups = "smokeTest")
	public void addItem() {
		System.out.println("addItem test case");
		
	}
	
	
}
