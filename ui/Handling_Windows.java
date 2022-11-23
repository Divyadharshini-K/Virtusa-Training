package ui;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_Windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/au/");
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/div/div[2]/div/div[1]/div/div[1]/div/a")).click();
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		Iterator<String> iterate = windows.iterator();
		String parent = iterate.next();
		System.out.println(parent);
		String child = iterate.next();
		System.out.println(child);
		driver.switchTo().window(child);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("UserFirstName")).sendKeys("Divya");
		driver.findElement(By.name("UserLastName")).sendKeys("K");
		driver.switchTo().window(parent);

	}

}
