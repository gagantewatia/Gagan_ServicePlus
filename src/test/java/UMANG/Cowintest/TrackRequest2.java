package UMANG.Cowintest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import PageObjects.MobileandOTPsubmit;
import PageObjects.ServiceDirectoryNavigation;
import PageObjects.ServiceNavigation;
import PageObjects.departmentnavigationpage;
import Resources.Base;
import Resources.Base2;

public class TrackRequest2 extends Base2{
	
	
	//Login in UMANG

	
		//Navigate to Service Directory  	
	@Test(priority=1)
	public void ServiceDirectoryDeptnavigation() throws IOException
	
	{
	
		ServiceDirectoryNavigation SD=new ServiceDirectoryNavigation(Driver);
		SD.Service().click();
		System.out.println("Service Directory Navigation done");
		test.assignCategory(COWIN);
	}
	
	
	@Test(priority=2)
	
	public void departmentnavigation()
	{
		System.out.println("Department Navigation");
		departmentnavigationpage dp=new departmentnavigationpage(Driver);
		dp.deptcowin().click();
		System.out.println("Home page of Department Comes");
		test.assignCategory(COWIN);
	}

	
	@Test (priority=3)
	public void trackrequestpage()
	
	{
		
    System.out.println("Track and Request Page");	
	ServiceNavigation SN=new ServiceNavigation(Driver);
    SN.trackrequest().click();
	test.assignCategory(COWIN);
 
	}
	
//dowmload data
	@Test(priority=4)
	
	public void downloaddata() throws InterruptedException
	{
		 Driver.switchTo().frame(Driver.findElement(By.xpath("//iframe[@id='myIframe']")));
	Driver.findElement(By.xpath("//span[contains(text(),'Download Certificate')]")).click();
	Thread.sleep(3000);
	test.assignCategory(COWIN);
	}
	

	   @AfterClass
		 public void closedriver()
		 {
	    	Driver.switchTo().defaultContent();
			Driver.findElement(By.xpath("//div[@class='back-to-home']")).click();
			test.assignCategory(COWIN);
		 }
}
	
	
