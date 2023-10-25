package testNGExample;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTestPriorityExample {
	
	//Execution workflow
	//Priority 
	
	
	//priority ------- highest negative number --- having priority
	//by default ----- priority is 0
	//If priority is same ---- execution as per naming conv ---- ASCII value
	
	
	
	//naming conv ----- alphabetic order
	
	
	
	@Test(priority = -100)
	public void login() {
		System.out.println("login test case");
		
	}
	
	@Test(priority = 5)
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

	
	
	
	@Test(description = "adding an item to KART !!")
	public void addItem() {
		System.out.println("addItem test case");
		
	}
	
	
	@Test
	public void cancelOrder() {
		System.out.println("cancelOrder test case");
		
	}
	
	@Test(priority = 1)
	public void payment() {
		System.out.println("payment test case");
		
	}
}
