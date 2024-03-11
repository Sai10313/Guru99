package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DepositePage {
	
WebDriver ldriver;
	
	
	@FindBy(name="accountno")
	WebElement accountNo;
	
	@FindBy(name="ammount")
	WebElement amount;
	
	@FindBy(name="desc")
	WebElement description;
	
	@FindBy(name="AccSubmit")
	WebElement clickOnSubmit;
	
	@FindBy(how = How.LINK_TEXT, using = "Home")
	WebElement backToHome;
	
	
	
	
	public DepositePage(WebDriver rdriver)
	{
		this.ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void setAccountNo(String acctNo)
	{
		accountNo.sendKeys(acctNo);
	}
	
	public void setAmount(String money)
	{
		amount.sendKeys(money);
	}
	
	public void setDescription(String desc)
	{
		description.sendKeys(desc);
	}
	
	public void clickHome()
    {
    	backToHome.click();
    }
	public void submitBtn()
	{
		clickOnSubmit.click();
	}
	

}
