package nopComm;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import utility.Constants;

public class BaseTest {
	
	
WebDriver driver;
	
	@Before
	public void launchapp() {
		System.out.println("===============launch application===============");
		
		String browser = "edge";
		
		if (browser.equalsIgnoreCase("CHROME")) {

			System.out.println("executing test on chrome browser");
			driver = new ChromeDriver();

		}

		else if (browser.equalsIgnoreCase("edge")) {

			System.out.println("executing test on edge browser");
			driver = new EdgeDriver();
		}

		else if (browser.equalsIgnoreCase("firefox")) {

			System.out.println("executing test on firefox browser");
			driver = new FirefoxDriver();
		}

		else if (browser.equalsIgnoreCase("safari")) {

			System.out.println("executing test on safari browser");
			driver = new SafariDriver();
		}

		else {

			System.out.println("executing test on default browser: chrome browser");
			driver = new ChromeDriver();

		}
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		driver = new EdgeDriver();
//		
		
		
		
		
		
		driver.get(Constants.nop_app);
		driver.manage().window().maximize();
		
		
		
	}
	
	public void closeApp() throws Exception {
		System.out.println("===============close application===============");
		Thread.sleep(7000);
		driver.close();
	}

}
