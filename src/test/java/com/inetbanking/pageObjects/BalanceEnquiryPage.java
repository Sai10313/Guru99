package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BalanceEnquiryPage {
	WebDriver ldriver;
	
	@FindBy(linkText="Balance Enquiry")
	WebElement clickOnEnquiry;
	
	@FindBy(name="accountno")
	WebElement accountNo;
	
	@FindBy(name="AccSubmit")
	WebElement submitBtn;
	
	public BalanceEnquiryPage(WebDriver rdriver)
	{
		this.ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void clickBalanceEnquiry()
	{
		clickOnEnquiry.click();
	}
	public void setAccountNo(String acctNo)
	{
		accountNo.sendKeys(acctNo);
	}
	public void submitBtn()
	{
		submitBtn.click();
	}

}
