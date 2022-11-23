package StepDefinitions;

import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenGoogle {
	
	ChromeDriver driver = null;
	
	
	@Given("user is entering google.co.in")
	public void user_is_entering_google_co_in() {
	    // Write code here that turns the phrase above into concrete actions
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abbaas\\Downloads\\chromedriver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    driver.get("http://www.google.co.in");
	}
	@When("user is typing the search term {string}")
	public void user_is_typing_the_search_term(String string) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement str = driver.findElement(By.xpath("//html//body//div[1]//div[3]//form//div[1]//div[1]//div[1]//div//div[2]//input"));//id("input"));
		str.sendKeys(string);
	}
	@And("enters the return key")
	public void enters_the_return_key() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement str = driver.findElement(By.xpath("//html//body//div[1]//div[3]//form//div[1]//div[1]//div[1]//div//div[2]//input"));//id("input"));
	    str.sendKeys(Keys.RETURN);
	}
	@Then("the user should see the search results")
	public void the_user_should_see_the_search_results() {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    boolean status = driver.findElement(By.partialLinkText("automation")).isDisplayed();
	    if(status)
	    	System.out.println("Results displayed");
	}

}
