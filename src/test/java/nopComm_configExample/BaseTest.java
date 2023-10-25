package nopComm_configExample;

//import org.junit.After;
//import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utility.Constants;
import utility.ReadConfig;

public class BaseTest {

	WebDriver driver;
	ReadConfig conf ;

	@BeforeTest
	public void launchapp() throws Exception {
		System.out.println("===============launch application===============");

		System.out.println("executing test on chrome browser");
		driver = new ChromeDriver();

		
		
		
//		fetch the data form config file
		
		conf = new ReadConfig();
		
		System.out.println("==================="+ conf.get_AppURL());
		
		
		
		
		
		
		driver.get(conf.get_AppURL());
		driver.manage().window().maximize();
		
		Thread.sleep(7000);

	}

	
	@AfterTest
	public void closeApp() throws Exception {
		System.out.println("===============close application===============");
		Thread.sleep(7000);
		driver.close();
	}

}
