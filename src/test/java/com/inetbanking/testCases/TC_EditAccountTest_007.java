package com.inetbanking.testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.EditAccountPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_EditAccountTest_007 extends BaseClass {
	@BeforeMethod
	public void loginApp()
	{
		LoginPage lp=new LoginPage(driver);
		lp.login(userName, password);
	}
	@Test
	public void editAccount()
	{
		EditAccountPage ecp=new EditAccountPage(driver);
		ecp.clickEditAccout();
		ecp.setAccountNo("123");
		ecp.submitBtn();
	}

}
