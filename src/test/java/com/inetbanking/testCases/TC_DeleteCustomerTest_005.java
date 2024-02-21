package com.inetbanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.DeleteCustomerPage;
import com.inetbanking.pageObjects.LoginPage;



public class TC_DeleteCustomerTest_005 extends BaseClass {
	
	
	@Test
	public void deleteCustomer() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserName(userName);
		lp.setPassword(password);
		lp.clickLogin();
		
		
		
		DeleteCustomerPage dcp=new DeleteCustomerPage(driver);
		Thread.sleep(3000);
		
		dcp.clickOnDeleteCustomer();
		Thread.sleep(3000);
		String actTitle=driver.getTitle();
		System.out.println(actTitle);
		 Assert.assertEquals(actTitle, "Guru99 Bank Delete Customer Page"); 
	     
		dcp.enterId("33577");
		dcp.submitCustomer();
		
		driver.switchTo().alert().accept();
		
	}

}
