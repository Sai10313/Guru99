package com.inetbanking.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.HomePage;
import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.pageObjects.WithdrawalPage;

public class TC_WithdrawalTest_010 extends BaseClass {

	HomePage home ;
	
	@BeforeMethod
	public void loginApp() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.login(userName, password);
		
		home =new HomePage(driver);
		home.clickOnWithdrawal();
		Thread.sleep(3000);
	}
	@Test
	public void withdrawlAmount()
	{
		WithdrawalPage wp=new WithdrawalPage(driver);
		
		wp.setAccountNo("34245");
		wp.setAmount("13456");
		wp.setDescription("Amount withdrawn from this Account..");
		wp.submitBtn();
		
		driver.switchTo().alert().accept();
		wp.clickHome();
	}
	
	@AfterMethod
	public void doLogOut()
	{
		home.logOut();
	}

}
