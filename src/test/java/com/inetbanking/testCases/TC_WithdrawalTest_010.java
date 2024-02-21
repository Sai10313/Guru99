package com.inetbanking.testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.pageObjects.WithdrawalPage;

public class TC_WithdrawalTest_010 extends BaseClass {

	
	@BeforeMethod
	public void loginApp()
	{
		LoginPage lp=new LoginPage(driver);
		lp.login(userName, password);
	}
	@Test
	public void withdrawlAmount()
	{
		WithdrawalPage wp=new WithdrawalPage(driver);
		wp.clickOnWithdrawal();;
		wp.setAccountNo("34245");
		wp.setAmount("13456");
		wp.setDescription("Amount withdrawn from this Account..");
		wp.submitBtn();
	}

}
