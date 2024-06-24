package SPRevenueDep;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import PageObjects.Infopage;
import PageObjects.ServiceDirectoryNavigation;
import PageObjects.ServiceNavigation;
import PageObjects.commonlocators;
import PageObjects.departmentnavigationpage;
import Pageobject.SPRevenueDep.RevenueDep;
import Resources.Base2;

public class MarriageCertificateTestCases extends Base2
{


	//go to all services
	@Test(priority=1)
	public void allservicesnavigation() throws IOException, InterruptedException

	{
		test.assignCategory(RevenueDep);
		departmentnavigationpage SD=new departmentnavigationpage(Driver);
		SD.allservicesredirect();
		
	}

//go to department page	
	
	//go to department page	
	
		@Test(priority=2)
		public void DeptNavigation() throws IOException, InterruptedException
		{
			test.assignCategory(RevenueDep);
			 departmentnavigationpage SD=new departmentnavigationpage(Driver);
			 String Servicename="Revenue Department (Tripura)";
		 	 SD.SCservicenavigationclick(Servicename);
			 Assert.assertEquals(SD.RevenueDep().getText(),"Revenue Department (Tripura)","Not matched");
			 
		}


		//go to service and check heading
				@Test(priority = 3)
				public void Seeinfoclick() throws IOException, InterruptedException

				{
						test.assignCategory(RevenueDep);
						Infopage PQ=new Infopage(Driver);
						RevenueDep dp=new RevenueDep(Driver); 
						dp.infoMarriage().click();
						test.log(Status.INFO,"Clicked on i icon");
						Assert.assertEquals(PQ.infoservicename2().getText(),"Marriage Certificate","Not matched");
						PQ.desccheck();

				}
			@Test(priority = 4,dependsOnMethods = {"Seeinfoclick"})
			public void VisitServiceclick() throws IOException, InterruptedException

			{
				test.assignCategory(RevenueDep);
				commonlocators cl=new commonlocators(Driver);
				Infopage PQ=new Infopage(Driver);
				//System.out.println("Checking Visit" +PQ.visitservice());
				JavascriptExecutor js = (JavascriptExecutor) Driver;
				js.executeScript("arguments[0].click();",PQ.visitservice());
			     Thread.sleep(2000);

				test.log(Status.INFO,"Clicked on Visit Service Button");
				
				List<String> browserTabs = new ArrayList<String> (Driver.getWindowHandles());
				//switch to new tab
				Driver.switchTo().window(browserTabs.get(1));
			     Thread.sleep(2000);
				String getURL = Driver.getCurrentUrl();
				System.out.println(getURL);
				Assert.assertTrue(getURL.contains("tripura"));

				//close and return to browser1
			    cl.closebrowserback1();
				Driver.switchTo().window(browserTabs.get(0));
			}	

			@Test(priority = 5)
				public void refreshpage() throws IOException, InterruptedException

				{
					test.assignCategory(RevenueDep);
					ServiceNavigation SN=new ServiceNavigation(Driver);
					SN.refresh();
					test.log(Status.INFO,"Refresh the Page");
				}

			//go to service and check heading
			@Test(priority=6,dependsOnMethods = {"DeptNavigation"})
	public void ServiceNavigationTestCase() throws IOException, InterruptedException
	
	{
	test.assignCategory(RevenueDep);
	RevenueDep dp=new RevenueDep(Driver);
	dp.Marriage().click();
	Thread.sleep(2000);
	List<String> browserTabs = new ArrayList<String> (Driver.getWindowHandles());
	//switch to new tab
	
	
	Driver.switchTo().window(browserTabs.get(1));
	Thread.sleep(2000);
	String getURL = Driver.getCurrentUrl();
	System.out.println(getURL);
	Assert.assertTrue(getURL.contains("tripura"));
	}
	
	// Check the heading on service plus page 
	@Test(priority=7,dependsOnMethods = {"ServiceNavigationTestCase"})
	public void ServicePlusPageTestCase() throws IOException, InterruptedException
	
	{
	test.assignCategory(RevenueDep);
	commonlocators cl=new commonlocators(Driver);
	
	String s = cl.Serviceheading().getText();
	Assert.assertTrue(s.contains("Marriage Certificate"));

	//close and return to browser1
	List<String> browserTabs = new ArrayList<String> (Driver.getWindowHandles());
	cl.closebrowserback();
	Driver.switchTo().window(browserTabs.get(0));
    }
	
	@Test(priority=8)

	public void IMbacktodirectory() throws InterruptedException
	{

		test.assignCategory(RevenueDep);
		List<String> browserTabs1 = new ArrayList<String> (Driver.getWindowHandles());	
	     commonlocators cl=new commonlocators(Driver);
			  if(browserTabs1.size()>1)
			  {
				  
				  cl.closebrowserback1();
			  }

		  ServiceDirectoryNavigation SN=new ServiceDirectoryNavigation(Driver);
		    SN.Umangbackbutton();
	}		
}
