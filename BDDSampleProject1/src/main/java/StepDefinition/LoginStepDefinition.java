package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStepDefinition {
	
	WebDriver driver;
	
	@Given("^User is already on Login Page$")
	public void user_is_already_on_login_page()
	{				
		System.setProperty("webdriver.chrome.driver", "C:\\JavaT\\Software\\chromedriver_win32_102\\chromedriver.exe");		
		driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		driver.get("https://staging-unified.leena.ai/login");
				
	}
	
	
	@When("^title is Unified dashboard$")
	public void title_is_unified_dashboard()
	{
		String title= driver.getTitle();
		System.out.println("Title is: "+title);
	//	Assert.assertEquals(title, "");
		
	}
	
	@Then("^User enters username and password$")
	public void user_enters_username_and_password() {
	  
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shubham@chatteron.io");		
		driver.findElement(By.xpath("//button[@type='submit']")).click();		
		driver.findElement(By.xpath("//input[@id='password']")).clear();		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1234");	 

	}

	@Then("^User clicks on Submit button$")
	public void user_clicks_on_Submit_button()   {
		driver.findElement(By.xpath("//button[@type='submit']")).click();		

	    
	}

	@Then("^User is on HomePage$")
	public void user_is_on_HomePage()  {
	   
	}
	
	

}
