package ui;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatafromExcel {

		public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://online.roboform.com/site/signup");
		FileInputStream fis = new FileInputStream("C:\\Users\\Abbaas\\eclipse-workspace\\SeleniumTraining\\Excel\\Eg form.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(1).getLastCellNum();
		System.out.println("Row count : "+rows+" Col count : "+cols);
		
		//driver.findElement(By.id("email")).sendKeys(mail);
		for(int i=1;i<=rows;i++)
		{
			XSSFRow cell = sheet.getRow(i);
			String mail = cell.getCell(0).getStringCellValue();
			String pwd = cell.getCell(1).getStringCellValue();
			String cpwd = cell.getCell(2).getStringCellValue();
			String name = cell.getCell(3).getStringCellValue();
			
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("email")).sendKeys(mail);
			driver.findElement(By.id("signup_password")).clear();
			driver.findElement(By.id("signup_password")).sendKeys(pwd);
			driver.findElement(By.id("password_retype")).clear();
			driver.findElement(By.id("password_retype")).sendKeys(cpwd);
			driver.findElement(By.id("name")).clear();
			driver.findElement(By.id("name")).sendKeys(name);
			
			System.out.println(i+" . "+mail+ " || "+pwd+" || "+cpwd+" || "+name);
		}
		
	}

}
