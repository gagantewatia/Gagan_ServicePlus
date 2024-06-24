package UMANG.Cowintest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;

import PageObjects.PMAYGCitizendetails;
import PageObjects.PMAYGInstallmentdetails;
import PageObjects.ServiceDirectoryNavigation;
import PageObjects.ServiceNavigation;
import PageObjects.commonlocators;
import PageObjects.departmentnavigationpage;
import Resources.Base2;
import Utilis.departmenttestdata;

public class PMAYGCitizenDetailsTestcases extends Base2
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
	public void PMaygcitizendetails() throws IOException, InterruptedException
	{

		 test.assignCategory(PMAYG);
		ServiceNavigation dp=new ServiceNavigation(Driver);
 		 dp.PMAYGCitizendetails().click();
 		 test.log(Status.INFO,"clicked on Citizen details");
    	
		 Thread.sleep(3000);
		 Assert.assertEquals(dp.PMAYGcitizentitle().getText(),"Beneficiary Details","Not matched");
		 
	}
	
	//Search the registration number 
	@Test(priority=4)
	public void PMaygcitizendetailssearch() throws IOException, InterruptedException
	{
		test.assignCategory(PMAYG);
		System.out.println("Search Registeration");
	    PMAYGInstallmentdetails pi=new PMAYGInstallmentdetails(Driver);
		
		 departmenttestdata td=new departmenttestdata();
		 ArrayList<String> data=td.getData("PMAYG-Installmentdetails-Registeration number");
		 pi.regno().sendKeys(data.get(1));
		 test.log(Status.INFO,"Registeration number entered");
		 Thread.sleep(2000);
	     pi.search().click();
	     test.log(Status.INFO,"Clicked on search button");
		 Thread.sleep(3000);
	   
         PMAYGCitizendetails pc=new PMAYGCitizendetails(Driver);
    	 
	    Assert.assertEquals(pc.registerlabel().getText(),"Registration Number", "Not matched");
	     test.log(Status.INFO,"Personal details is visible");	 
	}
	
	//check convergence details
	@Test(priority=5)
	
	public void PMaygcitizenconvergencedetailssearch() throws IOException, InterruptedException
	{
		 test.assignCategory(PMAYG);
	    PMAYGCitizendetails pc=new PMAYGCitizendetails(Driver);
		pc.convergencetab().click();
		test.log(Status.INFO,"Convergence details tab is clicked");
		
		Assert.assertEquals(pc.convergencedetailsassert().getText(),"Ujjwala Connection");
	}
	
	//check sanction and completion details
	@Test(priority=6)
	public void  PMAYGSanctionandcompletiondetails() throws IOException, InterruptedException
	{
		 test.assignCategory(PMAYG);
		   PMAYGCitizendetails pc=new PMAYGCitizendetails(Driver);
		   pc.sanctioncompalindetails().click();
		   test.log(Status.INFO,"Sanction and completion tab is clicked");
			
		   Assert.assertEquals(pc.registerlabel().getText(),"Registration Number", "Not matched");
 
	}
	
	
	//	check order sheet details
	@Test(priority=7)
	public void  PMAYGordersheetdetails() throws IOException, InterruptedException
	{
		 test.assignCategory(PMAYG);
		   PMAYGCitizendetails pc=new PMAYGCitizendetails(Driver);
		   pc.ordersheetdetails().click();
		   test.log(Status.INFO,"Order sheet detail tab is clicked");
			
		   Assert.assertEquals(pc.financialyear().getText(),"Financial Year", "Not matched");
 
	}
	
//	check physical process
	
	@Test(priority=8)
	public void  PMAYGphysicalprocess() throws IOException, InterruptedException
	{
		
		 test.assignCategory(PMAYG);
		   PMAYGCitizendetails pc=new PMAYGCitizendetails(Driver);
		   pc.physicalprocess().click();
		   test.log(Status.INFO,"Physical process tab is clicked");
	
		  Assert.assertEquals(pc.physicalprocesstext().getText(),"Get Direction", "Not matched");
 
	}
	
	// physical process tab , map navigation
	
	@Test(priority=9,dependsOnMethods= {"PMAYGphysicalprocess"})
	public void  PMAYGphysicalprocessmap() throws IOException, InterruptedException
	{	 
		  test.assignCategory(PMAYG);
		   PMAYGCitizendetails pc=new PMAYGCitizendetails(Driver);
		   pc.mapclick().click();
		   test.log(Status.INFO, "GEt Direction button is clicked");
		   List<String> browserTabs = new ArrayList<String> (Driver.getWindowHandles());
			//switch to new tab
			Driver.switchTo().window(browserTabs .get(1));
			test.log(Status.INFO,"Google maps opened");
			Thread.sleep(3000);
		
			Assert.assertEquals(pc.map().getText(),"Add destination", "Not Matched");
			//then close tab and get back
			Driver.close();
			Driver.switchTo().window(browserTabs.get(0));
			test.log(Status.INFO,"BAck on previous page");
		   
	}
	

	//back to service directory
	@Test(priority=10)
	public void PMAYGbacktoservicedirectory() throws InterruptedException
	{
		   
			
		 test.assignCategory(PMAYG);
		 
			List<String> browserTabs1 = new ArrayList<String> (Driver.getWindowHandles());	
		    commonlocators cl=new commonlocators(Driver);
				  if(browserTabs1.size()>1)
				  {
					  
					  cl.closebrowserback1();
				  }

		 ServiceDirectoryNavigation SN=new ServiceDirectoryNavigation(Driver);
		    SN.backtohome();
	}
	
	
}
