package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//username =mngr513466
//password =vEsabUv
//url =https://demo.guru99.com/v4/

public class LoginPage {
	
	WebDriver ldriver;
	
	@FindBy(name="uid")
	WebElement uname;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="btnLogin")
	WebElement submit;
	
	@FindBy(linkText="Log out")
	WebElement logOut;
	
	public LoginPage(WebDriver rdriver)
	{
		this.ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void setUserName(String user)
	{
		uname.sendKeys(user);
	}
	
	public void setPassword(String pwd){
		password.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		submit.click();
	}
	

	public void clickLogOut() {
		logOut.click();
	}
	public void login(String user, String pwd)
	{
		uname.sendKeys(user);
		password.sendKeys(pwd);
		submit.click();
	}
	
	

}
