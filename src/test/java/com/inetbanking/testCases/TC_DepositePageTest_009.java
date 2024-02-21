package com.inetbanking.testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.inetbanking.pageObjects.DepositePage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_DepositePageTest_009 extends BaseClass {
	
	@BeforeMethod
	public void loginApp()
	{
		LoginPage lp=new LoginPage(driver);
		lp.login(userName, password);
	}
	@Test
	public void depositeAmount()
	{
		DepositePage dp=new DepositePage(driver);
		dp.clickOnDeposite();
		dp.setAccountNo("34245");
		dp.setAmount("13456");
		dp.setDescription("Amount send to this Account..");
		dp.submitBtn();
	}

}
