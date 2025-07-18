package com.onlinestore.qa.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.onlinestore.qa.base.TestBase;
import com.onlinestore.qa.pages.SignUp;

public class SignUpPageTest extends TestBase {
	SignUp signuppage;
	public SignUpPageTest()
	{
		super();
	}
	@BeforeMethod
	public void setUp()
	{
		initialization();
		signuppage = new SignUp();
	}
	@Test
	public void pageTitleTest()
	{
		String pageTitle=signuppage.verifyPageTitle();
		Assert.assertEquals(pageTitle, "STORE");
	}
	@Test
	public void pageLogoTest()
	{
		boolean flag=signuppage.verifyLogo();
		Assert.assertTrue(flag);
	}
	@Test
	public void signupTest()
	{
		signuppage.signUp(prop.getProperty("Username"), prop.getProperty("Password"));
	}
	//STORE
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}



}
