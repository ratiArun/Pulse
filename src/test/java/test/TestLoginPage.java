package test;

import generic.Base_Test;

import org.testng.annotations.Test;

import pom.LoginPage;

public class TestLoginPage extends Base_Test
{
	@Test
	public void testLogin()
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUN("8105477408");
		lp.setPwd("9538602627");
		lp.click();
	}
}
