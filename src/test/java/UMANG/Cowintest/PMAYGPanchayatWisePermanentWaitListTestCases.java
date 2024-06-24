package UMANG.Cowintest;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import PageObjects.PMAYGPanchayatwisePermamenentlist;
import PageObjects.ServiceDirectoryNavigation;
import PageObjects.ServiceNavigation;
import PageObjects.departmentnavigationpage;
import Resources.Base2;
import Utilis.departmenttestdata;

public class PMAYGPanchayatWisePermanentWaitListTestCases extends Base2 {

	//go to all services
			@Test(priority=1)
			public void allservicesnavigation() throws IOException, InterruptedException

			{
				 test.assignCategory(PMAYG);
				departmentnavigationpage SD=new departmentnavigationpage(Driver);
				SD.allservicesredirect();
				
			}

		//go to department page	
			
			@Test(priority=2)
			public void PMAYGdepartmentnavigation() throws IOException, InterruptedException

			{
				 test.assignCategory(PMAYG);
				 departmentnavigationpage dp=new departmentnavigationpage(Driver);
				 String Servicename="PMAYG";
			 	 dp.servicenavigationclick(Servicename);
				Assert.assertEquals(dp.PMAYGtitle().getText(),"Pradhan Mantri Awaas Yojana - Gramin","Not matched");
				
			}
	
	//ServiceNavigation
	@Test(priority=3)
	public void PMaygwaitlist() throws IOException, InterruptedException
	{

		 test.assignCategory(PMAYG);
		ServiceNavigation dp=new ServiceNavigation(Driver);

 		dp.PMAYgwaitlist().click();
		test.log(Status.INFO,"clicked on Panchayat Wise PWL List");
		 Thread.sleep(1000);

		 Assert.assertEquals(dp.PMAYgwaitlisttitle().getText(),"Panchayat Wise Permanent Wait List","Not matched");
	}
	
	
	//enter data in dropdown boxes and search
	
	@Test(priority=4)
	public void PMAYGwaitlistenterdata() throws IOException, InterruptedException
	{
		 test.assignCategory(PMAYG);
		PMAYGPanchayatwisePermamenentlist pp=new PMAYGPanchayatwisePermamenentlist(Driver);
		departmenttestdata td=new departmenttestdata();
		ArrayList<String> data=td.getData("PMAYG-Panchayatwaitlist-Enter data for searching waitlist");
		Thread.sleep(2000);
		//state
		pp.state().click();
		Thread.sleep(1000);
		pp.state().sendKeys(data.get(1));
		Thread.sleep(2000);
		pp.state().sendKeys(Keys.ENTER);
		test.log(Status.INFO,"Entered state");
		
		//district
		Thread.sleep(1000);
		pp.district().click();
		Thread.sleep(2000);
		pp.district().sendKeys(data.get(2));
		Thread.sleep(2000);
		pp.district().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		test.log(Status.INFO,"Entered district");
		
		//block name
		Thread.sleep(1000);
		pp.blockname().click();
		Thread.sleep(2000);
		pp.blockname().sendKeys(data.get(3));
		Thread.sleep(2000);
		pp.blockname().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		test.log(Status.INFO,"Entered block");
		//panchayat
		
		Thread.sleep(1000);
		pp.panchayat().click();
		Thread.sleep(2000);
		pp.panchayat().sendKeys(data.get(4));
		Thread.sleep(2000);
		pp.panchayat().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		test.log(Status.INFO,"Entered panchayat");
		
		//click Search
		
		pp.searchbutton().click();
		test.log(Status.INFO,"Clicked Search");
		//scroll down
	  	JavascriptExecutor js1 = (JavascriptExecutor) Driver;	
	    js1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		Assert.assertEquals(pp.panchayatname().getText(),"Panchayat Name","Not matched");
		Thread.sleep(2000);
	}

//check  any two filters --Registration no
	@Test(priority=5,dependsOnMethods= {"PMAYGwaitlistenterdata"})
	public void PMAYGwaitlistregfilter() throws IOException, InterruptedException
	{
		 test.assignCategory(PMAYG);
		PMAYGPanchayatwisePermamenentlist pp=new PMAYGPanchayatwisePermamenentlist(Driver);
	  	JavascriptExecutor js1 = (JavascriptExecutor) Driver;	
	    js1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		pp.filter().click();
		test.log(Status.INFO, "clicked on filter");
		pp.fil_reg().click();
		Thread.sleep(2000);
		test.log(Status.INFO, "selected  Regsiter filter");
		departmenttestdata td=new departmenttestdata();
		ArrayList<String> data=td.getData("PMAYG-Panchayatwaitlist-select filter");
		pp.search().sendKeys(data.get(1));
		test.log(Status.INFO, "enter data in search field");
		
		Assert.assertEquals(pp.panchayatname().getText(),"Panchayat Name","Not matched");
		Thread.sleep(3000);
		pp.search().clear();
		test.log(Status.INFO, "Cleared search box");
	}
	
	
	//check priority filter
	
	@Test(priority=6,dependsOnMethods= {"PMAYGwaitlistregfilter"})
	public void PMAYGwaitlistpriorityfilter() throws IOException, InterruptedException
	{
		 test.assignCategory(PMAYG);
		PMAYGPanchayatwisePermamenentlist pp=new PMAYGPanchayatwisePermamenentlist(Driver);
	  
		pp.filter().click();
		test.log(Status.INFO, "clicked on filter");
		pp.fil_priority().click();
		test.log(Status.INFO, "selected  priority filter");
		departmenttestdata td=new departmenttestdata();
		Thread.sleep(2000);
		ArrayList<String> data=td.getData("PMAYG-Panchayatwaitlist-select filter");
		pp.search().sendKeys(data.get(2));
	
		Assert.assertEquals(pp.panchayatname().getText(),"Panchayat Name","Not matched");
		
		pp.search().clear();
		test.log(Status.INFO, "Cleared search box");
		Thread.sleep(3000);
	}
	
	
	//back to service directory
	
	@Test(priority=7)

	public void PMAYGbacktoservicedirectory()
	{
		 test.assignCategory(PMAYG);
		 ServiceDirectoryNavigation SN=new ServiceDirectoryNavigation(Driver);
		    SN.backtohome();
	}
}

