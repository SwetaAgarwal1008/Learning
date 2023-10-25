package alertExample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleAlertExample extends BaseTest{
	
	
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
		driver.findElement(By.xpath("//*[contains(text(),'Prompt')]")).click();
		
		
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
		
		Assert.assertEquals(alertText, "Your Name Please");
		
		Thread.sleep(3000);
		System.out.println("=============enter some value into prompt==================");
		Thread.sleep(3000);
		//enter some value into prompt
		String name = "abhishek";
		
		promptAlert.sendKeys(name);
		
		
		
		Thread.sleep(3000);
		
		promptAlert.accept();			//=====ok button
		
//		promptAlert.dismiss();			//=====cancel button
		
		
		
		
		
	}

}
