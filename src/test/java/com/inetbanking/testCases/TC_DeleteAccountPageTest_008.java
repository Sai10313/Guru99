package com.inetbanking.testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.DeleteAccountPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_DeleteAccountPageTest_008 extends BaseClass {
	
	@BeforeMethod
	public void loginApp()
	{
		LoginPage lp=new LoginPage(driver);
		lp.login(userName, password);
	}
	@Test
	public void deleteAccount()
	{
		DeleteAccountPage dcp=new DeleteAccountPage(driver);
		dcp.clickDeleteAccout();
		dcp.setAccountNo("3424534");
		dcp.submitBtn();
	}

}
