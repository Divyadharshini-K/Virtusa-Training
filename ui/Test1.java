package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static void main(String[] args) {

		//1.Setup Webdriver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//2.Launch website
		driver.get("https://www.saucedemo.com/");
		
		//3.Login
		driver.findElement(By.id("user-name")).sendKeys("standard-user");
		driver.findElement(By.id("password")).sendKeys("secret-sauce");
		driver.findElement(By.id("login-button")).click();
		driver.close();
		
		
	}

}
