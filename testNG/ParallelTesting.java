package testNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTesting {

	//For independent tests it can be tested parallel
	//xml file is responsible for the parallel testing
	
	@Test
	public void google()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abbaas\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.quit();
	}
	
	@Test
	public void bing()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abbaas\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.bing.com");
		driver.quit();
	}
}
