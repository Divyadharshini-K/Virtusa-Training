package testNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {

	//Open chrome
	//To minimize the time browser is launched once and closed and closed at the end
	
	ChromeDriver driver;
	long start;
	long end;
	
	@BeforeSuite
	public void launchBrowser()
	{
		start = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abbaas\\Downloads\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void google()
	{
		driver.get("http://www.google.com");
	}
	
	@Test
	public void bing()
	{ 
		driver.get("http://www.bing.com");
	}
	
	@Test
	public void yahoo()
	{
		driver.get("http://www.yahoo.com");
	}
	
	@AfterSuite
	public void quit()
	{
		driver.quit();
		end = System.currentTimeMillis();
		long total = end-start;
		System.out.println("Total time taken : "+total);
		
	}
}
