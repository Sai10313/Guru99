package com.inetbanking.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.DeleteCustomerPage;
import com.inetbanking.pageObjects.HomePage;
import com.inetbanking.pageObjects.LoginPage;



public class TC_DeleteCustomerTest_005 extends BaseClass {
	
	HomePage home;
	
	@BeforeMethod
	public void doLogin() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.login(userName, password);

		Thread.sleep(3000);
		home=new HomePage(driver);
		home.clickDeleteAccout();
		Thread.sleep(3000);
		
	}
	@Test
	public void deleteCustomer() throws InterruptedException
	{
		
		
		DeleteCustomerPage dcp=new DeleteCustomerPage(driver);
	
		dcp.enterId("15090");
		dcp.submitCustomer();
		
		driver.switchTo().alert().accept();
		dcp.clickHome();
		
	}
	
	@AfterMethod
	public void doLogOut()
	{
		home.logOut();
	}

}
