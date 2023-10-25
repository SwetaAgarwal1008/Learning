package alertExample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandleAlertExample2 extends BaseTest{
	
	
	WebDriver driver;

	@BeforeTest
	public void launchapp() throws Exception {
		System.out.println("===============launch application===============");

		System.out.println("executing test on chrome browser");
		driver = new ChromeDriver();

		driver.get("file:///C:/Users/91995/Downloads/Test%20(2).html");
		driver.manage().window().maximize();
		
		Thread.sleep(7000);

	}

	
	@AfterTest
	public void closeApp() throws Exception {
		System.out.println("===============close application===============");
		Thread.sleep(7000);
		driver.close();
	}
	
	//@Test
	public void simpleAlert() throws Exception {
		
		System.out.println("===========Simple alert example===============");
		
		//click on button -
		driver.findElement(By.xpath("//input[contains(@value,'Alert')]")).click();
		
		
		Thread.sleep(3000);
		
		//Alert/Window/frame    ----- driver.switchTo()
		
		
		
		//handle an alert
		
		Alert simpleAlert = driver.switchTo().alert();
		
		
		
		//perform action on alert
//		
//		getText
//		accept	---------   ok
//		dismiss ---------   cancel
//		sendKeys 
		
		
		
		String alertText = simpleAlert.getText();
		
		System.out.println("Alert Text: " + alertText);
		//validate alert text   ---- Hi.. This is alert message!
		
		Assert.assertEquals(alertText, "Hi.. This is alert message!");
		
		
		simpleAlert.dismiss();
		
	}
	
	
	

	//@Test
	public void confirmAlert() throws Exception {
		
		System.out.println("===========Confirm alert example===============");
		
		//click on button -
		driver.findElement(By.xpath("//*[contains(text(),'Confirm')]")).click();
		
		
		Thread.sleep(3000);
		
		//Alert/Window/frame    ----- driver.switchTo()
		
		
		
		//handle an alert
		
		Alert confirmAlert = driver.switchTo().alert();
		
		
		
		//perform action on alert
//		
//		getText
//		accept	---------   ok
//		dismiss ---------   cancel
//		sendKeys 
		
		
		
		String alertText = confirmAlert.getText();
		
		System.out.println("Alert Text: " + alertText);
		//validate alert text   ---- Hi.. This is alert message!
		
		Assert.assertEquals(alertText, "Press 'OK' or 'Cancel' button!");
		
		
//		confirmAlert.accept();			//=====ok button
		
		confirmAlert.dismiss();			//=====cancel button
		
		
		String ok_cancel = driver.findElement(By.xpath("//div[contains(@id,'demo')]")).getText();
		
		System.out.println("**************"+ ok_cancel);				//You pressed Cancel!
		
		Assert.assertEquals(ok_cancel, "You pressed OK!");				//You pressed Cancel!
//		Assert.assertTrue(ok_cancel.contains("OK"));
		
		
	}
	
	
	
	@Test
	public void promptAlert() throws Exception {
		
		System.out.println("===========Prompt alert example===============");
		
		//click on button -
		driver.findElement(By.xpath("//button[contains(text(),'Prompt')]")).click();
		
		
		Thread.sleep(3000);
		
		//Alert/Window/frame    ----- driver.switchTo()
		
		
		
		//handle an alert
		
		Alert promptAlert = driver.switchTo().alert();
		
		
		
		//perform action on alert
//		
//		getText
//		accept	---------   ok
//		dismiss ---------   cancel
//		sendKeys 
		
		
		
		String alertText = promptAlert.getText();
		
		System.out.println("Alert Text: " + alertText);
		//validate alert text   ---- Your Name Please
		
		Assert.assertEquals(alertText, "Please enter your name:");
		
		Thread.sleep(3000);
		System.out.println("=============enter some value into prompt==================");
		Thread.sleep(3000);
		//enter some value into prompt
		String name = "priyanka mundra";
		
		promptAlert.sendKeys(name);					//enter value
		
		
		
		Thread.sleep(3000);
		
		promptAlert.accept();			//=====ok button
		
//		promptAlert.dismiss();			//=====cancel button
		
		
		String textValue = driver.findElement(By.xpath("//p[@id='demoPrompt']")).getText();
		System.out.println("text value are: " + textValue);
		
		Assert.assertTrue(textValue.contains(name));
		
	}

}
