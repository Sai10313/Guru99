package com.inetbanking.testCases;

import java.io.File;

import java.io.IOException;
import java.sql.DriverManager;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetbanking.utilities.ReadConfig;



public class BaseClass {
	
	ReadConfig readConfig=new ReadConfig();
	public static WebDriver driver;
	
	  public String url=readConfig.getApplicationUrl();
	  public String userName=readConfig.getUsername(); 
	  public String password=readConfig.getPassword();
	public String browser=readConfig.getBrowserName();
	public static Logger logger;
	
	
	@BeforeClass
	@Parameters("browser")
	public void setup(String browser)
	{
		
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", 
					readConfig.getChromePath());
			System.out.println(readConfig.getChromePath());
			
			driver=new ChromeDriver();	
		}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", 
					readConfig.getChromePath());
			 driver = new FirefoxDriver();
		}
		else if (browser.equals("ie")){
			System.setProperty("webdriver.edge.driver", 
					readConfig.getEdgePath());
			System.out.println(readConfig.getEdgePath());
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url); 
		
		
		
	}
	public static String randomString()
	{
		String generatedString=RandomStringUtils.randomAlphabetic(8);
		return generatedString;
		
	}
	public static String randomNum()
	{
		String generatedPin=RandomStringUtils.randomNumeric(4);
		return generatedPin;
	}
	public static void screenCapture(String tname) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target =new File(System.getProperty("user.dir")+"\\Screenshots\\"+tname+".png");
		System.out.println(target);
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
		
	}
	
	public static void selectDropDown(WebElement element,String text)
	{
		Select dropDown=new Select(element);
		dropDown.selectByVisibleText(text);
	}
	//@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
