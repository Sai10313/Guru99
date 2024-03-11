package com.inetbanking.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.ChangePasswordPage;
import com.inetbanking.pageObjects.HomePage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_ChangePasswordTest_015 extends BaseClass{

	HomePage home;
	
	@BeforeMethod
	public void login() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.login(userName, password);
		
		home =new HomePage(driver);
		home.changePassword();
		Thread.sleep(3000);
	}
	@Test
	public void changePwdTest()
	{
		ChangePasswordPage cp=new ChangePasswordPage(driver);
		cp.setOldPwd("abc@123");
		cp.setNewPwd("xyz@123");
		cp.setConPwd("xyz@123");
		cp.submitBtn();
		
		driver.switchTo().alert().accept();
		cp.clickHome();
	}
	
	@AfterMethod
	public void doLogOut()
	{
		home.logOut();
	}
}
