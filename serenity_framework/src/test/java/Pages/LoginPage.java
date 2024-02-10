package Pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.google.com/webhp?source=search_app")
public class LoginPage extends PageObject{
	
	
	
	public void doSmthing()
	{
		$("textarea#APjFqb").sendKeys("hello Java");
			
		System.out.println("Google page is opened");
	}
	

}
