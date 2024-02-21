package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomizedStatementPage {
	
	 WebDriver ldriver;
		
		@FindBy(linkText="Customised Statement")
		WebElement clickOnCustomStatement;
		
		@FindBy(name="accountno")
		WebElement accountNo;
		
		@FindBy(name="fdate")
		WebElement fromDate;
		
		@FindBy(name="tdate")
		WebElement toDate;
		
		@FindBy(name="amountlowerlimit")
		WebElement minValue;
		
		@FindBy(name="numtransaction")
		WebElement numOfTransaction;
		
		@FindBy(name="AccSubmit")
		WebElement clickOnSubmit;
		
		
		public CustomizedStatementPage(WebDriver rdriver)
		{
			this.ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
		
		public void clickOnCustomStatement()
		{
			clickOnCustomStatement.click();
		}
		
		public void setAccountNo(String acctNo)
		{
			accountNo.sendKeys(acctNo);
		}
		
		
		public void fromDob(String mm,String dd,String yy)
		{
			fromDate.sendKeys(mm);
			fromDate.sendKeys(dd);
			fromDate.sendKeys(yy);
		}
		
		public void toDob(String mm,String dd,String yy)
		{
			toDate.sendKeys(mm);
			toDate.sendKeys(dd);
			toDate.sendKeys(yy);
		}
		public void setMinAmount(String minMoney)
		{
			minValue.sendKeys(minMoney);
		}
		
		public void noOfTransaction(String transac)
		{
			numOfTransaction.sendKeys(transac);
		}
		
		public void submitBtn()
		{
			clickOnSubmit.click();
		}
		


}
