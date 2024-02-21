package com.inetbanking.testCases;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.EditCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_EditCustomerTest_004 extends BaseClass {
	
	
	
	@Test
	public void editUser() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(userName);
		lp.setPassword(password);
		lp.clickLogin();
		
		Thread.sleep(3000);
		
		EditCustomerPage ect=new EditCustomerPage(driver);
		ect.editCustomer();
		Thread.sleep(3000);
		ect.enterCustId("33577");
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
		
		
	}
	
	
	

}
