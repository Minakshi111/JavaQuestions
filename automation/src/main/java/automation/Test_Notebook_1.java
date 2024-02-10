package automation;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.windows.WindowsDriver;

public class Test_Notebook_1 {
	
	public static WindowsDriver driver= null;
	
	
	public static void main(String[] str) throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability("app", "C:\\Windows\\System32\\notepad.exe");
		cap.setCapability("plateform", "Windows");
		
		driver= new WindowsDriver(new URL("http://127.0.0.1:4723/"), cap);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	//	driver.findElementByName("Text editor").click();
	//	driver.findElementByName("Text editor").sendKeys("Hello Minakshi");
	//	Thread.sleep(2000);
		driver.findElementByName("File").click();
		Thread.sleep(2000);
		driver.findElementByName("Save").click();
		Thread.sleep(2000);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}