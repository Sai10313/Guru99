package com.inetbanking.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.EditCustomerPage;
import com.inetbanking.pageObjects.HomePage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_EditCustomerTest_004 extends BaseClass {
	
	HomePage home;
	
	@BeforeMethod
	public void doLogin() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.login(userName, password);

		Thread.sleep(3000);
		
		home=new HomePage(driver);
		home.clickEditAccout();
		
		Thread.sleep(3000);
	}
	
	@Test
	public void editUser() throws InterruptedException
	{
		
		EditCustomerPage ect=new EditCustomerPage(driver);
		
		Thread.sleep(3000);
		ect.enterCustId("15090");
		ect.submitId();
		Thread.sleep(3000);
		ect.changeAddr("INDIA");
		ect.changeCity("HYD");
		ect.changeState("TRS");
		ect.changePinCode("987654");
		ect.changePhNo("9988776655");
		ect.changeEmail("QbHmXV23@gmail.com");
		
		Thread.sleep(3000);
		
		ect.clickOnSubmit();
		
		driver.switchTo().alert().accept();
		
		ect.clickHome();
	}
	
	@AfterMethod
	public void doLogOut()
	{
		home.logOut();
	}
	
	
	

}
