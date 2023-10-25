package crosssBrowserTest;

//import org.junit.After;
//import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import utility.Constants;

public class BaseTestCrossBrowser {

	WebDriver driver;

	
	
	@Parameters("ibm_br")
	@BeforeTest
	public void launchapp(String browser) throws Exception {
		System.out.println("fetch value form textNG XML file===============" + browser);

		System.out.println("executing test on chrome browser");
		
		
		

		//String browser = br;
		
		
		
		
		
		if (browser.equalsIgnoreCase("CHROME")) {

			System.out.println("executing test on chrome browser");

			driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("edge")) {

			System.out.println("executing test on edge browser");
			//launching a edge browser
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
		
		
		
		
		
		
		
		
		
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
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
