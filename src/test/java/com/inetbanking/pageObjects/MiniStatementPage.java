package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MiniStatementPage {

WebDriver ldriver;
	

	@FindBy(name="accountno")
	WebElement accountNo;
	
	@FindBy(name="AccSubmit")
	WebElement submitBtn;
	
	@FindBy(how = How.LINK_TEXT, using = "Home")
	WebElement backToHome;
	
	
	
	public MiniStatementPage(WebDriver rdriver)
	{
		this.ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void setAccountNo(String acctNo)
	{
		accountNo.sendKeys(acctNo);
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
