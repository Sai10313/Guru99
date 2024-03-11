package com.inetbanking.testCases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddCustomerPage;
import com.inetbanking.pageObjects.HomePage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass {

	HomePage home;
	
	@BeforeMethod
	public void doLogin() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.login(userName, password);

		Thread.sleep(3000);
	}

	@Test
	public void addNewCustomer() throws InterruptedException, IOException
	{


		home=new HomePage(driver);
		home.addCustomer();

		AddCustomerPage acp=new AddCustomerPage(driver);

		Thread.sleep(3000);
		acp.custName("Vihas");
		acp.selectGender("male");
		acp.custDob("24", "july", "2016");
		Thread.sleep(3000);
		acp.custAddress("INDIA");
		acp.custCity("HYD");
		acp.custState("TRS");
		acp.custPin("518395");
		acp.custPhone("12345678901");
		String email=randomString()+"@gmail.com";
		System.out.println(email);
		acp.custMail(email);

		acp.custPwd("abcdef");
		acp.clickSubmit();
		Thread.sleep(3000);

		boolean result=driver.getPageSource().contains("Customer Registered Successfully!!!");

		if(result==true)
		{
			Assert.assertTrue(result);
			Thread.sleep(3000);
		}
		else
		{
			//screenCapture(driver, "addNewCustomer");
			Assert.assertTrue(result);
		}

		acp.clickHome();
	}
	
	@AfterMethod
	public void doLogOut()
	{
		home.logOut();
	}


}
