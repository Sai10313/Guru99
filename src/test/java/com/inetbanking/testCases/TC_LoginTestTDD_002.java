package com.inetbanking.testCases;

import java.io.IOException;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.utilities.XLUtils;

public class TC_LoginTestTDD_002 extends BaseClass {
	@Test(dataProvider = "LoginData")
	public void loginTDD(String uname,String upwd) throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(uname);
		lp.setPassword(upwd);
		lp.clickLogin();
		
		if(isAlertPresent()==true)
		{
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			org.testng.Assert.assertFalse(false);
		}
		else {
			org.testng.Assert.assertTrue(true);
			lp.clickLogOut();
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Thread.sleep(3000);
		}
		
	}
	public boolean isAlertPresent()
	{
		try
		{
			driver.switchTo().alert();
			return true;
		}catch(NoAlertPresentException e)
		{
			return false;
		}
	}
	@DataProvider(name="LoginData")
	public String[][] getData() throws IOException
	{
		String path="C:\\Users\\Manoj Kumar\\eclipse-workspace\\inetBankingV1\\Configuration\\TestData.xlsx";
		int rowCount= XLUtils.rowCount(path,"Sheet1");
		int colCount=XLUtils.colCount(path, "Sheet1", rowCount);
		String[][] loginData=new String[rowCount][colCount];
		for(int i=1;i<=rowCount;i++)
		{
			for(int j=0;j<colCount;j++)
			{
				loginData[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);
				System.out.print(loginData[i-1][j]);
			}
			
		}
		return loginData;
	}

}
