package com.inetbanking.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.FundTransferPage;
import com.inetbanking.pageObjects.HomePage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_FundTransferTest_011 extends BaseClass{
	
	HomePage home;
	
	@BeforeMethod
	public void loginApp() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.login(userName, password);
		
		HomePage home =new HomePage(driver);
		home.clickFundTransfer();
		Thread.sleep(3000);
	}
	@Test
	public void fundTransfer() {
		
		FundTransferPage ftp=new FundTransferPage(driver);
		
		ftp.setPayer("12345");
		ftp.setPayee("98765");
		ftp.setAmount("9000");
		ftp.setDescription("Transfering money");
		ftp.submitBtn();
		
		driver.switchTo().alert().accept();
		ftp.clickHome();
	}
	
	@AfterMethod
	public void doLogOut()
	{
		home.logOut();
	}

}
