package com.inetbanking.testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.BalanceEnquiryPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_BalanceEnquiryTest_012 extends BaseClass{
	
	@BeforeMethod
	public void loginApp()
	{
		LoginPage lp=new LoginPage(driver);
		lp.login(userName, password);
	}
	@Test
	public void balanceEnquiry() {
		
		BalanceEnquiryPage bep=new BalanceEnquiryPage(driver);
		bep.clickBalanceEnquiry();
		bep.setAccountNo("12345");
		bep.submitBtn();
	}

}
