package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditAccountPage {
	
WebDriver ldriver;
	
	@FindBy(linkText="Edit Account")
	WebElement clickonEditAccount;
	
	@FindBy(name="accountno")
	WebElement accountNo;
	
	@FindBy(name="AccSubmit")
	WebElement clickOnSubmit;
	
	
	
	
	public EditAccountPage(WebDriver rdriver)
	{
		this.ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void clickEditAccout()
	{
		clickonEditAccount.click();;
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
