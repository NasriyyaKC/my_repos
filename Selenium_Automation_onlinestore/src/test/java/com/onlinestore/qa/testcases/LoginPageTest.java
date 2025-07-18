package com.onlinestore.qa.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.onlinestore.qa.base.TestBase;
import com.onlinestore.qa.pages.LoginPage;
import com.onlinestore.qa.pages.SignUp;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//@Listeners(com.onlinestore.qa.util.ListenerTest.class)
public class LoginPageTest extends TestBase {
	
	LoginPage loginpage;
	public LoginPageTest()
	{
		super();
	}
	@BeforeMethod
	public void setUp()
	{
		initialization();
		logger.info("Set Up for the test started");
		loginpage = new LoginPage();
	}
	@Test
	public void LoginTest()
	{
		logger.info("Test 1 Started");
		loginpage.LoginClick();
		loginpage.Login(prop.getProperty("Username"),prop.getProperty("Password"));
		logger.info("Login Successful");
	}
	@Test
	public void pageTitleTest()
	{
		logger.info("Test 2 Started");
		String title= loginpage.verifyPageTitle();
		Assert.assertEquals(title, "PRODUCT STORE");
		logger.info("Test 2 completed");
	}
	@Test
	public void logoTest()
	{
	   logger.info("Test 3 Started");
	   boolean flag=loginpage.verifyLogo();
	   Assert.assertTrue(flag);
	   logger.info("Test 3 completed");
	}
	@Test
	public void verifyNameOfUserDisplayedTest()
	{
		logger.info("Test 4 Started");
		boolean flag1=loginpage.verifyNameOfUser();
		Assert.assertTrue(flag1);
		logger.info("Test 4 completed");
	}
	@AfterMethod 
	public void tearDown()
	{
		driver.close();
		logger.info("Driver closed");
	}

}
