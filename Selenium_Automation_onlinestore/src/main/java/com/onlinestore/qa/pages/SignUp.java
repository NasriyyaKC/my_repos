package com.onlinestore.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.onlinestore.qa.base.TestBase;

public class SignUp extends TestBase{
	@FindBy(xpath="/html/body/nav/a/img")
	WebElement logo;
	@FindBy(xpath="//*[@id=\"signin2\"]")
	WebElement SignUp;
	@FindBy(xpath="//*[@id=\"sign-username\"]")
	WebElement UserNameTextField;
	@FindBy(xpath="//*[@id=\"sign-password\"]")
	WebElement PasswordTextField;
	@FindBy(xpath="/html/body/div[2]/div/div/div[3]/button[2]")
	WebElement SignUpBtn;
	public SignUp()
	{
		PageFactory.initElements(driver, this);
	}
	public String verifyPageTitle()
	{
		return driver.getTitle();
	}
	public boolean verifyLogo()
	{
		return logo.isDisplayed();
	}
	public void clickOnSignUp()
	{
		SignUp.click();
	}
	public void signUp(String Username, String Password) {
		 UserNameTextField.sendKeys(Username);
		 PasswordTextField.sendKeys(Password);
		 SignUpBtn.click();
	}
	public HomePage alertAccept()
	{
		driver.switchTo().alert().accept();
		return new HomePage();
	}

}
