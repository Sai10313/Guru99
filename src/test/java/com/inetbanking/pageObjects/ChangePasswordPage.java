package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ChangePasswordPage {

	WebDriver ldriver;



	@FindBy(name="oldpassword")
	WebElement oldPwd;

	@FindBy(name="newpassword")
	WebElement newPwd;

	@FindBy(name="confirmpassword")
	WebElement conNewPwd;

	@FindBy(name="sub")
	WebElement submitBtn;
	
	@FindBy(how = How.LINK_TEXT, using = "Home")
	WebElement backToHome;
	
	public ChangePasswordPage(WebDriver rdriver)
	{
		this.ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}


	public void setOldPwd(String oldPassword)
	{
		oldPwd.sendKeys(oldPassword);
	}

	public void setNewPwd(String newPassword)
	{
		newPwd.sendKeys(newPassword);
	}

	public void setConPwd(String conNewPassword)
	{
		conNewPwd.sendKeys(conNewPassword);
	}
	
	public void clickHome()
    {
    	backToHome.click();
    }

	public void submitBtn()
	{
		submitBtn.click();
	}


}
