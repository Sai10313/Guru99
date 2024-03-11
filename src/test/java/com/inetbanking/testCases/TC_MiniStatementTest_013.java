package com.inetbanking.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.HomePage;
import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.pageObjects.MiniStatementPage;

public class TC_MiniStatementTest_013 extends BaseClass{
	
	HomePage  home;
	
	@BeforeMethod
	public void loginApp() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.login(userName, password);
		
		home =new HomePage(driver);
		home.clickMiniStatement();
		Thread.sleep(3000);
	}
	@Test
	public void miniStatement() {
		
		MiniStatementPage msp=new MiniStatementPage(driver);
		
		msp.setAccountNo("12345");
		msp.submitBtn();
		
		driver.switchTo().alert().accept();
		msp.clickHome();
	}
	
	@AfterMethod
	public void doLogOut()
	{
		home.logOut();
	}


}
