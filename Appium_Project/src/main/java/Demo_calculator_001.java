import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Demo_calculator_001 {

	public static AppiumDriver driver;
	
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		openCalculator();

	}
	
	public static void openCalculator() throws MalformedURLException, InterruptedException
	{
		Thread th= new Thread();
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "S21");
		cap.setCapability("udid", "RZCW10GV4RW");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "13");
		cap.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		cap.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
		
		URL url= new URL("http://127.0.0.1:4723/wd/hub");
		 driver = new AndroidDriver(url , cap);
	System.out.println("All fine");
	
	driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_07")).click();
	driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"8\"]")).click();
	
	
	
	driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Plus\"]")).click();
	driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"5\"]")).click();
	driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"5\"]")).click();
	driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Equal\"]")).click();
	
	
	
	
		
	}

}
