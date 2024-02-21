package com.inetbanking.testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.FundTransferPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_FundTransferTest_011 extends BaseClass{
	
	@BeforeMethod
	public void loginApp()
	{
		LoginPage lp=new LoginPage(driver);
		lp.login(userName, password);
	}
	@Test
	public void fundTransfer() {
		
		FundTransferPage ftp=new FundTransferPage(driver);
		ftp.clickFundTransfer();
		ftp.setPayer("12345");
		ftp.setPayee("98765");
		ftp.setAmount("9000");
		ftp.setDescription("Transfering money");
		ftp.submitBtn();
	}

}
