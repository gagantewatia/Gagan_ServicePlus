package UMANG.Cowintest;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import PageObjects.PMAYGInstallmentdetails;
import PageObjects.ServiceDirectoryNavigation;
import PageObjects.ServiceNavigation;
import PageObjects.departmentnavigationpage;
import Resources.Base2;
import Utilis.departmenttestdata;

public class PMAYGConvervegencedetailsTestcases extends Base2
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
		public void PMaygconvergencedetails() throws IOException, InterruptedException
		{

			 test.assignCategory(PMAYG);
			 ServiceNavigation dp=new ServiceNavigation(Driver);
	
	 		 dp.PMAYGconvergencedetails().click();
	 		 test.log(Status.INFO,"clicked on Convergence details");
	    	
			 Thread.sleep(3000);

		
			 Assert.assertEquals(dp.PMAYGconvergencetitle().getText(),"Convergence Details","Not matched");
			 
		}
		
		//Search the registration number 
		@Test(priority=3)
		public void PMaygconvergencedetailssearch() throws IOException, InterruptedException
		{
 
			 test.assignCategory(PMAYG);
		    PMAYGInstallmentdetails pi=new PMAYGInstallmentdetails(Driver);
			
			 departmenttestdata td=new departmenttestdata();
			 ArrayList<String> data=td.getData("PMAYG-Installmentdetails-Registeration number");
			 pi.regno().sendKeys(data.get(1));
			 test.log(Status.INFO,"Registeration number entered");
			 Thread.sleep(2000);
		     pi.search().click();
			 Thread.sleep(3000);
		    test.log(Status.INFO,"Clicked on search button");
		    //check data come 
			
		    Assert.assertEquals(pi.convergenceMnrega().getText(),"MGNREGA Details", "Not matched");
		    	 
		}
		
		//navigate back to service directory
		@Test(priority=5)
		
		public void PAMYGbacktoservicedirectory()
		{
			 test.assignCategory(PMAYG);
			 ServiceDirectoryNavigation SN=new ServiceDirectoryNavigation(Driver);
			    SN.backtohome();
		}
		
		
		
}
