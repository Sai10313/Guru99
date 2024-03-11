package com.inetbanking.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.DeleteAccountPage;
import com.inetbanking.pageObjects.HomePage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_DeleteAccountPageTest_008 extends BaseClass {
	
	HomePage home;
	
	@BeforeMethod
	public void loginApp() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.login(userName, password);
		
		
		
		home=new HomePage(driver);
		home.clickDeleteAccout();
		Thread.sleep(3000);
	}
	@Test
	public void deleteAccount()
	{
		
		DeleteAccountPage dcp=new DeleteAccountPage(driver);
		dcp.setAccountNo("3424534");
		dcp.submitBtn();
		
		driver.switchTo().alert().accept();
		dcp.clickHome();
	}
	
	@AfterMethod
	public void doLogOut()
	{
		home.logOut();
	}

}
