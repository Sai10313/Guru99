package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.CreateAccountPage;
import com.inetbanking.pageObjects.HomePage;
import com.inetbanking.pageObjects.LoginPage;



public class TC_CreateAccountTest_006 extends BaseClass  {
	
    HomePage home;
	
	@BeforeMethod
	public void doLogin() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.login(userName, password);

		Thread.sleep(3000);
		
		home=new HomePage(driver);
		home.clickOnNewAccount();
		Thread.sleep(3000);
	}
	
	

	@Test
	public void createAccountTest() throws InterruptedException, IOException {
		
		CreateAccountPage cap=new CreateAccountPage(driver);
		
		cap.setCustId("75265");
		cap.setAccountType("Current");
		cap.setinitAmount("0000");
		cap.clickCreateAccount();
		
		driver.switchTo().alert().accept();
		cap.clickHome();
	}
	@AfterMethod
	public void doLogOut()
	{
		home.logOut();
	}

}
