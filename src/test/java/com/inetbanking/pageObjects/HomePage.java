package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver ldriver;
	
	@FindBy(linkText="Manager")
    WebElement managerPage;
	
	@FindBy(linkText ="New Customer")
	WebElement clickNewCustomer;
	
	@FindBy(linkText ="Edit Customer")
	WebElement clickOnEdit;
	
	@FindBy(linkText ="Delete Customer")
	WebElement clickOnDelete;
	
	@FindBy(linkText ="New Account")
	WebElement clickOnNewAccount;
	
	@FindBy(linkText="Edit Account")
	WebElement clickonEditAccount;
	
	@FindBy(linkText="Delete Account")
	WebElement clickonDeleteAccount;
	

	@FindBy(linkText="Deposit")
	WebElement clickonDepositeAccount;
	
	
	@FindBy(linkText="Withdrawal")
	WebElement clickonWithdrawal;
	
	@FindBy(linkText="Fund Transfer")
	WebElement clickOnFundTransfer;
	
	@FindBy(linkText="Change Password")
	WebElement clickOnChangePassword;
	
	@FindBy(linkText="Balance Enquiry")
	WebElement clickOnEnquiry;
	
	@FindBy(linkText="Mini Statement")
	WebElement clickOnMiniStatement;
	
	@FindBy(linkText="Customised Statement")
	WebElement clickOnCustomStatement;
	
	@FindBy(linkText="Log out")
	WebElement clickOnLogout;
	
	public HomePage(WebDriver rdriver)
	{
		this.ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void clickManagerPage()
	{
		managerPage.click();
	}
	public void addCustomer()
	{
		clickNewCustomer.click();
	}
	public void editCustomer()
	{
		clickOnEdit.click();
	}
	public void clickOnDeleteCustomer() {
		clickOnDelete.click();
	}
	
	public void clickOnNewAccount()
	{
		clickOnNewAccount.click();
	}
	
	public void clickEditAccout()
	{
		clickonEditAccount.click();;
	}
	
	public void clickDeleteAccout()
	{
		clickonDeleteAccount.click();;
	}
	public void clickOnDeposite()
	{
		clickonDepositeAccount.click();
	}
	public void clickOnWithdrawal()
	{
		clickonWithdrawal.click();
	}
	public void clickFundTransfer()
	{
		clickOnFundTransfer.click();
	}
	public void changePassword()
	{
		clickOnChangePassword.click();
	}
	public void clickBalanceEnquiry()
	{
		clickOnEnquiry.click();
	}
	public void clickMiniStatement()
	{
		clickOnMiniStatement.click();
	}
	
	public void clickOnCustomStatement()
	{
		clickOnCustomStatement.click();
	}
	public void logOut()
	{
		clickOnLogout.click();
	}
}
