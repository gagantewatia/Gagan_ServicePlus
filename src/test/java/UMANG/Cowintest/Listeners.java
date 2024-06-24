package UMANG.Cowintest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.Status;


import Resources.Base2;

import Resources.ExtentReporterNG;

public class Listeners<Static> extends Base2 implements ITestListener
{

 //  ExtentTest test;
	ExtentReports extent=ExtentReporterNG.getReportObject();
ThreadLocal<ExtentTest> extentTest =new ThreadLocal<ExtentTest>();
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		test= extent.createTest(result.getMethod().getMethodName());
		extentTest.set(test);
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		extentTest.get().fail(result.getThrowable());
//test.fail(result.getThrowable());
	
		String testMethodName =result.getMethod().getMethodName();
	
		try {
	   Driver= (WebDriver)result.getTestClass().getRealClass().getField("Driver").get(result.getInstance());
	   
		} 
		catch(Exception e)
		{
			
		}
		
		try
		{
	//	getscreenshotpath(testMethodName, Driver);
	//	extentTest.get().addScreenCaptureFromPath(getscreenshotpath(testMethodName,Driver), result.getMethod().getMethodName());
		//extentTest.get().addScreenCaptureFromPath(getscreenshotpath(testMethodName,Driver), result.getMethod().getRealClass().getName() + ":"+ result.getMethod().getMethodName());
//	test.assignCategory(result.getMethod().getRealClass().getName());
		extentTest.get().addScreenCaptureFromPath(capture(), result.getMethod().getRealClass().getName() + ":"+ result.getMethod().getMethodName());
		
		
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSuccess(ITestResult result) {
      //test.log(Status.PASS, "Test Passed");
		extentTest.get().log(Status.PASS, "Test Passed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
	}



}
