package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.inetbanking.testCases.BaseClass;

public class CreateAccountPage {
	
WebDriver ldriver;
	
	@FindBy(xpath="//input[@name='cusid']")
	WebElement custId;
	
	@FindBy(name="selaccount")
	WebElement accountType;
	
	@FindBy(name="inideposit")
	WebElement initAmount;
	
	@FindBy(name="button2")
	WebElement createAccount;
	
	@FindBy(how = How.LINK_TEXT, using = "Home")
	WebElement backToHome;
	
	
	
	public CreateAccountPage(WebDriver rdriver)
	{
		this.ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void setCustId(String customerId)
	{
		custId.sendKeys(customerId);
	}
	
	public void setAccountType(String accType){
		BaseClass.selectDropDown(accountType, accType);
	}
	
	public void setinitAmount(String amount)
	{
		initAmount.sendKeys(amount);
	}
	public void clickHome()
    {
    	backToHome.click();
    }

	public void clickCreateAccount() {
		createAccount.click();
	}
	
}
