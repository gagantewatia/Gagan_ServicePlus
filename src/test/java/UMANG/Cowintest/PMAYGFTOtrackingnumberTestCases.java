package UMANG.Cowintest;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import PageObjects.PMAYGFTO;
import PageObjects.ServiceDirectoryNavigation;
import PageObjects.ServiceNavigation;
import PageObjects.departmentnavigationpage;
import Resources.Base2;
import Utilis.departmenttestdata;

public class PMAYGFTOtrackingnumberTestCases extends Base2
{
	
	
	///go to all services
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
	public void PMAYGFTOServiceNavigation() throws IOException, InterruptedException
	{

		test.assignCategory(PMAYG);
		ServiceNavigation dp=new ServiceNavigation(Driver);
 		dp.PMAYGFTO().click();
		test.log(Status.INFO,"clicked on FTO tracking service");
		 Thread.sleep(1000);
		 Assert.assertEquals(dp.PMAYGFTOtitle().getText(),"FTO Tracking","Not matched");
	}
	
//Enter FTO number
	@Test(priority=4)
	public void FTOtrackingnumber() throws IOException, InterruptedException
	{

		 test.assignCategory(PMAYG);
		PMAYGFTO fto=new PMAYGFTO(Driver);
		departmenttestdata td=new departmenttestdata();
		ArrayList<String> data=td.getData("PMAYG-FTO Tracking -Search FTO number");
		fto.ftonumber().sendKeys(data.get(1));
		test.log(Status.INFO,"entered fto number");
		fto.searchbutton().click();
		test.log(Status.INFO,"clicked on search button");
		 Thread.sleep(1000);
		 Assert.assertEquals(fto.ftonumberresult().getText(),"FTO Number","Not matched");
	}
	

	//Navigate to PFMSpayment
	
	@Test(priority=5)
	public void FTOtoPFMSnavigation() throws InterruptedException
	{
		test.assignCategory(PMAYG);
		PMAYGFTO fto=new PMAYGFTO(Driver);
        fto.FTOtppfms().click();
    	test.log(Status.INFO,"Clicked on PFMS link");
    	Assert.assertEquals(fto.PFMSnavigation().getText(),"Public Financial Management System","Not matched");
    	Thread.sleep(1000);
    	Driver.navigate().back();
    	test.log(Status.INFO,"Navigate back to FTO tracking page");
	}
        
	@Test(priority=6)
	
	public void PMAYGFTObacktoservicedirectory()
	{
	
		 test.assignCategory(PMAYG);
		 ServiceDirectoryNavigation SN=new ServiceDirectoryNavigation(Driver);
		    SN.backtohome();
	}
	

        
	}
	

