package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchDefinition {
	WebDriver driver;
	
	@Given("browser is open")
	public void browser_is_open() {
	   
	String projectPath= System.getProperty("user.dir");	
	System.setProperty("webdriver.chrome.driver",projectPath+"\\Driver\\chromedriver.exe");
	driver= new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	}

	@And("Google search page is opened")
	public void google_search_page_is_opened() {
		driver.get("https://www.google.com/");
	    
	}

	@When("^user enters (.*)$")
	public void user_enters_text(String text)
	{
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys(text);		
	}

	@And("hits enter")
	public void hits_enter() {
		
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys(Keys.ENTER);
	}

	@Then("user navigates to search results")
	public void user_navigates_to_search_results() {
		driver.close();
		
	    
	}

}
