package pom;

import generic.Base_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Base_Page
{
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@class='_2zrpKA']")
	private WebElement untbox;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pwdtbox;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginbtn;
	
	public void setUN(String un)
	{
		untbox.sendKeys(un);
	}
	
	public void setPwd(String pwd)
	{
		pwdtbox.sendKeys(pwd);
	}
	
	public void click()
	{
		loginbtn.click();
	}

}
