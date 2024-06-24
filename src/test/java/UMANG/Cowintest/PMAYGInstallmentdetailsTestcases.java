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

public class PMAYGInstallmentdetailsTestcases extends Base2
{

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
	public void PMayginstallemtdetails() throws IOException, InterruptedException
	{
		 test.assignCategory(PMAYG);
		ServiceNavigation dp=new ServiceNavigation(Driver);
	    Thread.sleep(2000);
 		dp.PMAYgInstallment().click();
 		test.log(Status.INFO,"clicked on Installment details");
		 Thread.sleep(3000);
		 test.log(Status.INFO,"Switched to frame");
		
		 Assert.assertEquals(dp.PMAYGinstallmenttitle().getText(),"Installment Details","Not matched");
		 
	

		 
	}
	
	//Search the registration number entered during login
	@Test(priority=3)
	public void PMayginstallemtdetailssearch() throws IOException, InterruptedException
	{

		 test.assignCategory(PMAYG);
	    PMAYGInstallmentdetails pi=new PMAYGInstallmentdetails(Driver);
		
		 departmenttestdata td=new departmenttestdata();
		 ArrayList<String> data=td.getData("PMAYG-Installmentdetails-Registeration number");
		 Thread.sleep(1000);
		 pi.regno().sendKeys(data.get(1));
		 test.log(Status.INFO,"Registeration number entered");
		 Thread.sleep(1000);
	     pi.search().click();
	    test.log(Status.INFO,"Clicked on search button");
	    //check data come 
		
	    Assert.assertEquals(pi.financialyeralabel().getText(),"Financial Year", "Not matched");
	    Thread.sleep(2000);
	    
	}
	
	// check any one filter--FTO number
	
		@Test(priority=4,dependsOnMethods= {"PMayginstallemtdetailssearch"})
		public void PMaygfilterFTO() throws IOException, InterruptedException
		{
			 test.assignCategory(PMAYG);
		    PMAYGInstallmentdetails pi=new PMAYGInstallmentdetails(Driver);
		    JavascriptExecutor js = (JavascriptExecutor) Driver;
		    js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		    pi.filter().click();
		    test.log(Status.INFO,"clicked on filter");
		    pi.fil_FTOnumber().click();
		    test.log(Status.INFO,"clicked on FTO filter");
		    departmenttestdata td=new departmenttestdata();
		    ArrayList<String> data=td.getData("PMAYG-Installmentdetails -Select filter");
		    pi.filtersearch().sendKeys(data.get(1));
			test.log(Status.INFO, "Entered data in search box");
			
			 Assert.assertEquals(pi.financialyeralabel().getText(),"Financial Year", "Not matched");
			 pi.filtersearch().clear();
			test.log(Status.INFO, "Search box is cleared");
			Thread.sleep(2000);
		}
	
	
	//navigate to FTO Tracking Details
	@Test(priority=5,dependsOnMethods= {"PMayginstallemtdetailssearch"})
	public void PMayginstallemnttoFtotrackingdetails() throws IOException, InterruptedException
	{
		 test.assignCategory(PMAYG);
	    PMAYGInstallmentdetails pi=new PMAYGInstallmentdetails(Driver);
	    pi.FTOtrackingdetails().click();
	    Thread.sleep(3000);
	    test.log(Status.INFO,"clicked on FTO Tracking details");
	    ServiceNavigation dp=new ServiceNavigation(Driver);
		
	    Assert.assertEquals(dp.PMAYGFTOtitle().getText(),"FTO Tracking","Not matched");
	    Thread.sleep(2000);
	    Driver.navigate().back();
	    Thread.sleep(3000);
	    
	}

	
	
	

	//navigate back to service directory
	@Test(priority=6)
	
	public void PAMYGbacktoservicedirectory()
	{
		 test.assignCategory(PMAYG);
		 ServiceDirectoryNavigation SN=new ServiceDirectoryNavigation(Driver);
		    SN.backtohome();
	}
	
	    
	
}
