package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.CreateAccountPage;
import com.inetbanking.pageObjects.LoginPage;



public class TC_CreateAccountTest_006 extends BaseClass  {
	
	@BeforeMethod
	public void loginApp()
	{
		LoginPage lp=new LoginPage(driver);
		lp.login(userName, password);
	}

	@Test
	public void createAccountTest() throws InterruptedException, IOException {
		
		CreateAccountPage cap=new CreateAccountPage(driver);
		cap.clickOnNewAccount();
		cap.setCustId("75265");
		cap.setAccountType("Current");
		cap.setinitAmount("0000");
		cap.clickCreateAccount();
	}
}
