package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FundTransferPage {
	
    WebDriver ldriver;

	@FindBy(linkText="Fund Transfer")
	WebElement clickOnFundTransfer;
	
	@FindBy(name="payersaccount")
	WebElement payer;
	
	@FindBy(name="payeeaccount")
	WebElement payee;
	
	@FindBy(name="ammount")
	WebElement amount;
	
	@FindBy(name="desc")
	WebElement description;
	
	@FindBy(name="AccSubmit")
	WebElement submitBtn;
	
	
	public FundTransferPage(WebDriver rdriver)
	{
		this.ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void clickFundTransfer()
	{
		clickOnFundTransfer.click();
	}
	
	public void setPayer(String payerAcct)
	{
		payer.sendKeys(payerAcct);
	}
	
	public void setPayee(String payeeAcct)
	{
		payee.sendKeys(payeeAcct);
	}
	
	public void setAmount(String money)
	{
		amount.sendKeys(money);
	}
	
	public void setDescription(String desc)
	{
		description.sendKeys(desc);
	}
	
	public void submitBtn()
	{
		submitBtn.click();
	}

}
