package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteAccountPage {
	
	WebDriver ldriver;
	
	@FindBy(linkText="Delete Account")
	WebElement clickonDeleteAccount;
	
	@FindBy(name="accountno")
	WebElement accountNo;
	
	@FindBy(name="AccSubmit")
	WebElement clickOnSubmit;
	
	
	
	
	public DeleteAccountPage(WebDriver rdriver)
	{
		this.ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void clickDeleteAccout()
	{
		clickonDeleteAccount.click();;
	}
	
	public void setAccountNo(String acctNo)
	{
		accountNo.sendKeys(acctNo);
	}
	
	public void submitBtn()
	{
		clickOnSubmit.click();
	}

}
