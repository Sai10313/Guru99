package com.inetbanking.testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;



public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void loginTest() throws InterruptedException, IOException {
		
		LoginPage loginPage=new LoginPage(driver);
		
		loginPage.setUserName(userName);
	
		loginPage.setPassword(password);
		
		loginPage.clickLogin();
		Thread.sleep(3000);
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage123"))
		{
			System.out.println("TestCase Pass");
			Assert.assertTrue(true);
		}else {
			
			System.out.println("TestCase Fail");
			Assert.assertTrue(false);
			//screenCapture(driver, "loginTest");
		}
	}
}
