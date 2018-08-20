package pom;

import generic.Base_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Base_Page
{
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//span[.='Men']")
	private WebElement men; 
	
	@FindBy(xpath="//a[.='Bottom wear']")
	private WebElement bottmwear;
	
	public void mouseHover()
	{
		mHA(men);
	}
	
	public void click()
	{
		bottmwear.click();
	}
	
}
	
	