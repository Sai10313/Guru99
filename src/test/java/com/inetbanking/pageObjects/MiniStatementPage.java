package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MiniStatementPage {

WebDriver ldriver;
	
	@FindBy(linkText="Mini Statement")
	WebElement clickOnMiniStatement;
	
	@FindBy(name="accountno")
	WebElement accountNo;
	
	@FindBy(name="AccSubmit")
	WebElement submitBtn;
	
	public MiniStatementPage(WebDriver rdriver)
	{
		this.ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void clickMiniStatement()
	{
		clickOnMiniStatement.click();
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
