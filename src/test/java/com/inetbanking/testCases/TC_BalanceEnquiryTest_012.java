package com.inetbanking.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.BalanceEnquiryPage;
import com.inetbanking.pageObjects.HomePage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_BalanceEnquiryTest_012 extends BaseClass{
	
	HomePage home;
	
	@BeforeMethod
	public void loginApp()
	{
		LoginPage lp=new LoginPage(driver);
		lp.login(userName, password);
		
		home =new HomePage(driver);
		home.clickBalanceEnquiry();
	}
	@Test
	public void balanceEnquiry() {
		
		BalanceEnquiryPage bep=new BalanceEnquiryPage(driver);
		
		bep.setAccountNo("12345");
		bep.submitBtn();
	}
	
	@AfterMethod
	public void doLogOut()
	{
		home.logOut();
	}

}
