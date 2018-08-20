package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements Constants
{
	public WebDriver driver;
	
	@BeforeMethod
	public void openApp()
	{
		System.setProperty(KEY_GECKO,VALUE_GECKO);
		
		driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeApp()
	{
		driver.quit();
	}

}
