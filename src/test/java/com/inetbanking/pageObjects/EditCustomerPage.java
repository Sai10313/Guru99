package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EditCustomerPage {
	
	WebDriver ldriver;
	
	@FindBy(how=How.LINK_TEXT,using="Edit Customer")
	WebElement clickOnEdit;
	
	@FindBy(how=How.XPATH,using="//input[@name='cusid']")
	WebElement eneterId;
	
	@FindBy(how=How.XPATH,using="//input[@name='AccSubmit']")
	WebElement submitId;
	
	@FindBy(how=How.XPATH,using="//textarea[@name='addr']")
	WebElement eneterAddress;
	
	@FindBy(how=How.XPATH,using="//input[@name='city']")
	WebElement eneterCity;
	
	@FindBy(how=How.XPATH,using="//input[@name='state']")
	WebElement eneterState;
	
	@FindBy(how=How.XPATH,using="//input[@name='pinno']")
	WebElement eneterPin;
	
	@FindBy(how=How.XPATH,using="//input[@name='telephoneno']")
	WebElement eneterPhNo;
	
	@FindBy(how=How.XPATH,using="//input[@name='emailid']")
	WebElement eneterEmail;
	
	@FindBy(how=How.XPATH,using="//input[@name='sub']")
	WebElement enterSubmit;
	
	public EditCustomerPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	public void editCustomer()
	{
		clickOnEdit.click();
	}
	
	public void enterCustId(String custId)
	{
		eneterId.clear();
		eneterId.sendKeys(custId);
	}
	
	public void submitId()
	{
		submitId.click();
	}
	
	public void changeAddr(String address)
	{
		eneterAddress.clear();
		eneterAddress.sendKeys(address);
		
	}
	
	public void changeCity(String city)
	{
		eneterCity.clear();
		eneterCity.sendKeys(city);
		
	}
	public void changeState(String state)
	{
		eneterState.clear();
		eneterState.sendKeys(state);
		
	}
	public void changePinCode(String pin)
	{
		eneterPin.clear();
		eneterPin.sendKeys(pin);
		
	}
	public void changePhNo(String phNo)
	{
		eneterPhNo.clear();
		eneterPhNo.sendKeys(phNo);
		
	}
	public void changeEmail(String email)
	{
		eneterEmail.clear();
		eneterEmail.sendKeys(email);
		
	}
	
	public void clickOnSubmit()
	{
		enterSubmit.click();
	}





}
