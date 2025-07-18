package com.onlinestore.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.onlinestore.qa.base.TestBase;

public class LoginPage extends TestBase {
	@FindBy(xpath="//*[@id=\"login2\"]")
	WebElement login;
	@FindBy(xpath="//*[@id=\"loginusername\"]")
	WebElement UserNameTextField;
	@FindBy(xpath="//*[@id=\"loginpassword\"]")
	WebElement PasswordTextField;
	@FindBy(xpath="//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")
	WebElement LoginBtn;
	@FindBy(xpath="//*[@id=\"nameofuser\"]")
	WebElement NameOfUser;
	@FindBy(xpath="//*[@id=\"nava\"]/img")
	WebElement logo;
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	public void LoginClick()
	{
		login.click();
	}
	public HomePage Login(String usr, String pswd)
	{
		 UserNameTextField.sendKeys(usr);
		 PasswordTextField.sendKeys(pswd);
		 LoginBtn.click();
		 logger.info("clicked on login btn");
		 return new HomePage();
		 
	}
	public String verifyPageTitle()
	{
		return driver.getTitle();
	}
	public boolean verifyLogo()
	{
		return logo.isDisplayed();
	}
	public boolean verifyNameOfUser()
	{
		return NameOfUser.isDisplayed();
	}

   // PRODUCT STORE

}
