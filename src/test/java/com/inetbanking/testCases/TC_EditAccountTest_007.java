package com.inetbanking.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.EditAccountPage;
import com.inetbanking.pageObjects.HomePage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_EditAccountTest_007 extends BaseClass {
	
	HomePage home;
	@BeforeMethod
	public void doLogin() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.login(userName, password);
		
		home=new HomePage(driver);
		home.clickEditAccout();
		Thread.sleep(3000);
		
	}
	@Test
	public void editAccount()
	{
		
		EditAccountPage ecp=new EditAccountPage(driver);
		ecp.setAccountNo("123");
		ecp.submitBtn();
		
		driver.switchTo().alert().accept();
		ecp.clickHome();
	}
	
	@AfterMethod
	public void doLogOut()
	{
		home.logOut();
	}

}
