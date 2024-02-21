package com.inetbanking.testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.CustomizedStatementPage;
import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.pageObjects.WithdrawalPage;

public class TC_CustomStatementTest_014 extends BaseClass {
	
	@BeforeMethod
	public void loginApp()
	{
		LoginPage lp=new LoginPage(driver);
		lp.login(userName, password);
	}
	@Test
	public void customizedStatement()
	{
		CustomizedStatementPage csp=new CustomizedStatementPage(driver);
		csp.clickOnCustomStatement();
		csp.setAccountNo("34245");
		csp.fromDob("13", "10", "1999");
		csp.toDob("14", "11", "1998");
		csp.setMinAmount("12345");
		csp.noOfTransaction("10");
		csp.submitBtn();
	}
	

}
