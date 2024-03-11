package com.inetbanking.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.inetbanking.pageObjects.DepositePage;
import com.inetbanking.pageObjects.HomePage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_DepositePageTest_009 extends BaseClass {
	
	HomePage home;
	
	@BeforeMethod
	public void loginApp() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.login(userName, password);
		
		home =new HomePage(driver);
		home.clickOnDeposite();
		Thread.sleep(3000);
	}
	@Test
	public void depositeAmount()
	{
		DepositePage dp=new DepositePage(driver);
		
		dp.setAccountNo("34245");
		dp.setAmount("13456");
		dp.setDescription("Amount send to this Account..");
		dp.submitBtn();
		
		driver.switchTo().alert().accept();
		dp.clickHome();
	}
	
	@AfterMethod
	public void doLogOut()
	{
		home.logOut();
	}

}
