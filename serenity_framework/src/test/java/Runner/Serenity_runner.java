package Runner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Pages.LoginPage;
import Steps.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(SerenityRunner.class)
public class Serenity_runner {
	
	@Steps
	public LoginPage loginPage ;
	public LoginSteps loginSteps;
	
	@Managed(driver="chrome")
	WebDriver driver;
	
	@Test
	public void test1()
	{
		loginPage.open();
		// loginSteps.onLoginPage();
		// loginSteps.second();
	}

}
