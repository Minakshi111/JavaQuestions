package Steps;

import Pages.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginSteps {
	
	private LoginPage loginPage;


	@Step
	public void onLoginPage()
	{
		loginPage.open();// launch the URL

	}

	@Step
	public void second()
	{
		loginPage.doSmthing();// launch the URL
	}

	
}
