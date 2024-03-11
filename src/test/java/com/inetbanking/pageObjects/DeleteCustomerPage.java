package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DeleteCustomerPage {
	
	WebDriver ldriver;
	
	public DeleteCustomerPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	
	
	@FindBy(how=How.XPATH,using="//input[@name='cusid']")
	WebElement enterUserId;
	
	@FindBy(how=How.XPATH,using="//input[@name='AccSubmit']")
	WebElement submitUserId;
	
	@FindBy(how = How.LINK_TEXT, using = "Home")
	WebElement backToHome;
	
	
	public void enterId(String custId)
	{
		enterUserId.clear();
		enterUserId.sendKeys(custId);
	}
	
	public void clickHome()
    {
    	backToHome.click();
    }
	
	public void submitCustomer()
	{
		submitUserId.click();
	}
}
