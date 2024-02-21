package com.inetbanking.testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.pageObjects.MiniStatementPage;

public class TC_MiniStatementTest_013 extends BaseClass{
	
	@BeforeMethod
	public void loginApp()
	{
		LoginPage lp=new LoginPage(driver);
		lp.login(userName, password);
	}
	@Test
	public void miniStatement() {
		
		MiniStatementPage msp=new MiniStatementPage(driver);
		msp.clickMiniStatement();
		msp.setAccountNo("12345");
		msp.submitBtn();
	}


}
