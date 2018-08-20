package test;

import generic.Base_Test;

import org.testng.annotations.Test;

import pom.HomePage;
import pom.LoginPage;

public class TestHome extends Base_Test
{
	@Test
	public void action()
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUN("8105477408");
		lp.setPwd("9538602627");
		lp.click();
		
		HomePage hp=new HomePage(driver);
		hp.mouseHover();
		hp.click();
	}

}
