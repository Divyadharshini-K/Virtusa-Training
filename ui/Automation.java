package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("19eca12@karpagamtech.ac.in");
		driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
		Thread.sleep(5000);
		WebElement radio = driver.findElement(By.id("id_gender2"));
		radio.click();
		driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]")).sendKeys("Divya");
		driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]")).sendKeys("K");
		driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("Divya");
		driver.findElement(By.xpath("//*[@id=\"days\"]")).sendKeys("12");
		driver.findElement(By.xpath("//*[@id=\"months\"]")).sendKeys("April");
		driver.findElement(By.xpath("//*[@id=\"years\"]")).sendKeys("2002");
		WebElement check1 = driver.findElement(By.id("newsletter"));
		check1.click();
		WebElement check2 = driver.findElement(By.id("optin"));
		check2.click();
		driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("Karpagam Institute of Technology");
		driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("7/7c,Periyamariyamman kovil street");
		driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys("Devanankurichi");
		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Tiruchengode");
		driver.findElement(By.xpath("//*[@id=\"id_state\"]")).sendKeys("Indiana");
		driver.findElement(By.xpath("//*[@id=\"postcode\"]")).sendKeys("63209");
		driver.findElement(By.xpath("//*[@id=\"id_country\"]")).sendKeys("United States");
		driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]")).sendKeys("6382185481");
		driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();
			
	}

}

