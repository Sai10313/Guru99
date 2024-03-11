package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

	WebDriver ldriver;

	public AddCustomerPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	

	@FindBy(how = How.XPATH, using = "//input[@name='name']")
	WebElement name;

	@FindBy(how = How.NAME, using = "rad1")
	WebElement gender;

	@FindBy(how = How.NAME, using = "dob")
	WebElement date;

	@FindBy(how = How.NAME, using = "addr")
	WebElement address;

	@FindBy(how = How.NAME, using = "city")
	WebElement city;

	@FindBy(how = How.NAME, using = "state")
	WebElement state;

	@FindBy(how = How.NAME, using = "pinno")
	WebElement pin;

	@FindBy(how = How.NAME, using = "telephoneno")
	WebElement phone;

	@FindBy(how = How.NAME, using = "emailid")
	WebElement mail;

	@FindBy(how = How.NAME, using = "password")
	WebElement password;

	@FindBy(how = How.XPATH, using = "//input[@name='sub']")
	WebElement submit;
	
	@FindBy(how = How.LINK_TEXT, using = "Home")
	WebElement backToHome;
	
	@FindBy(how = How.LINK_TEXT, using = "Continue")
	WebElement clickOnContinue;

	
	public void custName(String cname)
	{
		name.sendKeys(cname);
	}
	public void selectGender(String cgender)
	{
		gender.sendKeys(cgender);;
	}

	public void custDob(String mm,String dd,String yy)
	{
		date.sendKeys(mm);
		date.sendKeys(dd);
		date.sendKeys(yy);
	}
	 public void custAddress(String caddress)
	 {
		 address.sendKeys(caddress);
	 }
	 public void custCity(String cCity)
	 {
		 city.sendKeys(cCity);
	 }
	public void custState(String cState)
	{
		state.sendKeys(cState);
	}
	public void custPin(String cPin) {
	pin.sendKeys(String.valueOf(cPin));
	}

    public void custPhone(String cphone)
    {
    	phone.sendKeys(cphone);
    }
    
    public void custMail(String cmail)
    {
    	mail.sendKeys(cmail);
    }
    public void custPwd(String cpwd)
    {
    	password.sendKeys(cpwd);
    }
    public void clickSubmit()
    {
    	submit.click();
    }
    public void clickHome()
    {
    	backToHome.click();
    }
    
    public void clickContinue()
    {
    	clickOnContinue.click();
    }
}
