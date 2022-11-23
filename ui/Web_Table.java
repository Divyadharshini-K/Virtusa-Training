package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Web_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
		//1.Switch frame of the table
		//2.Get number of rows
		//3.Get number of columns
		//4.Iterate to get text and print it
		
		WebElement frame1 = driver.findElement(By.xpath("//*[@id=\"div1_topgainlose\"]"));
	//	driver.switchTo().frame(frame1);
		
		List<WebElement> row = driver.findElements(By.xpath("//*[@id=\"topgain_bse\"]/div[1]/table/tbody/tr[1]"));
		System.out.println(row.size());
		int rowsize = row.size();
		
		List<WebElement> col = driver.findElements(By.xpath("//*[@id=\"topgain_bse\"]/div[1]/table/tbody/tr/td"));
		System.out.println(col.size());
		int colsize = col.size();
		
		for(int i=0;i<rowsize;i++)
		{
			for(int j=0;j<colsize;j++)
			{
				System.out.println(driver.findElement(By.xpath("//*[@id=\"topgain_bse\"]/div[1]/table/tbody/tr["+ i +"]/td["+ j +"]")).getText());
				
			}
		}
		}

}
