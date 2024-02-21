package com.inetbanking.utilities;

import java.io.File;


import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.reporter.configuration.ViewName;
import com.inetbanking.testCases.BaseClass;

public class Reporting extends BaseClass implements ITestListener {
	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	public ExtentTest test;
	

	@Override
	public void onTestSuccess(ITestResult tr) {
		
		test=extent.createTest(tr.getName());
		test.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));
	}

	@Override
	public void onTestFailure(ITestResult tr) {
		test=extent.createTest(tr.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));
		String screenShotPath=System.getProperty("user.dir")+"\\Screenshots\\"+tr.getName()+".png";
		try {
			screenCapture(tr.getMethod().getMethodName());
			System.out.println("Hello Screenshot Taken");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * System.out.println(screenShotPath); File file=new File(screenShotPath);
		 * if(file.exists()) {
		 * test.fail("Screenshot below is :"+test.addScreenCaptureFromPath(
		 * screenShotPath)); }
		 */
	}

	@Override
	public void onTestSkipped(ITestResult tr) {
		test=extent.createTest(tr.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), ExtentColor.ORANGE));
	}

	@Override
	public void onStart(ITestContext testContext) {
		
		String timeStamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String repoName="Test-Report-"+timeStamp+".html";
		
		sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/test-output/"+repoName);
		
		final File CONF=new File("extentconfig.xml");
		try {
			sparkReporter.loadXMLConfig(CONF);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        extent =new ExtentReports();
		
		extent.attachReporter(sparkReporter);
		
		extent.setSystemInfo("HostName", "LocalHost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("UserName", "Sai Kumar");
		
		System.out.println("Hello");
		
		/*
		 * sparkReporter.config().setDocumentTitle("INetBanking Test Project");
		 * sparkReporter.config().setReportName("Functional Testing");
		 * sparkReporter.config().setTheme(Theme.STANDARD);
		 */
	}

	@Override
	public void onFinish(ITestContext testContext) {
		extent.flush();
	}

}
