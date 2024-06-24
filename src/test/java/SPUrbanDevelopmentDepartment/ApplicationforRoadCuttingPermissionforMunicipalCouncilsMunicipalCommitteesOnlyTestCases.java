package SPUrbanDevelopmentDepartment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import PageObjects.Infopage;
import PageObjects.ServiceDirectoryNavigation;
import PageObjects.ServiceNavigation;
import PageObjects.commonlocators;
import PageObjects.departmentnavigationpage;
import Pageobject.SPTourismMeghalaya.TourismMeghalaya;
import Pageobject.SPUrbanDevelopmentDepartment.UrbanDevelopmentDepartment;
import Resources.Base2;

public class ApplicationforRoadCuttingPermissionforMunicipalCouncilsMunicipalCommitteesOnlyTestCases extends Base2
{

	//go to all services
	@Test(priority=1)
	public void allservicesnavigation() throws IOException, InterruptedException

	{
		test.assignCategory(UrbanDevelopmentDepartment);
		departmentnavigationpage SD=new departmentnavigationpage(Driver);
		SD.allservicesredirect();
		
	}

//go to department page	
	
	@Test(priority=2)
	public void DeptNavigation() throws IOException, InterruptedException
	{
		test.assignCategory(UrbanDevelopmentDepartment);
		 departmentnavigationpage SD=new departmentnavigationpage(Driver);
		 String Servicename="Urban Development Department (Jammu & Kashmir)";
	 	 SD.servicenavigationclick(Servicename);
		 Assert.assertEquals(SD.UrbanDevelopmentDepartment().getText(),"Urban Development Department (Jammu & Kashmir)","Not matched");
		 
	}

	@Test(priority = 3)
	public void Seeinfoclick() throws IOException, InterruptedException

		{
				test.assignCategory(UrbanDevelopmentDepartment);
				Infopage PQ=new Infopage(Driver);
				TourismMeghalaya dp=new TourismMeghalaya(Driver);
				dp.infoProvisional().click();
				test.log(Status.INFO,"Clicked on i icon"); 
				Assert.assertEquals(PQ.infoservicename2().getText(),"Application Form for Recognition as Provisional/ Approved Meghalaya State Tour Operator","Not matched");
				PQ.desccheck();

		}
	@Test(priority = 4,dependsOnMethods = {"Seeinfoclick"})
	public void VisitServiceclick() throws IOException, InterruptedException

	{
		test.assignCategory(UrbanDevelopmentDepartment);
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
		Assert.assertTrue(getURL.contains("investmeghalaya"));

		//close and return to browser1
	    cl.closebrowserback1();
		Driver.switchTo().window(browserTabs.get(0));
	}	
	
	@Test(priority = 5)
		public void refreshpage() throws IOException, InterruptedException

		{
			test.assignCategory(UrbanDevelopmentDepartment);
			ServiceNavigation SN=new ServiceNavigation(Driver);
			SN.refresh();
			test.log(Status.INFO,"Refresh the Page");
		}

	//go to service and check heading
	@Test(priority=6,dependsOnMethods = {"DeptNavigation"})
	public void ServiceNavigationTestCase() throws IOException, InterruptedException
	
	{
	test.assignCategory(UrbanDevelopmentDepartment);
	UrbanDevelopmentDepartment dp=new UrbanDevelopmentDepartment(Driver);
	dp.RoadCuttingMunicipalCouncils().click();
	Thread.sleep(2000);
	List<String> browserTabs = new ArrayList<String> (Driver.getWindowHandles());
	//switch to new tab
	
	
	Driver.switchTo().window(browserTabs.get(1));
	Thread.sleep(2000);
	String getURL = Driver.getCurrentUrl();
	System.out.println(getURL);
	Assert.assertTrue(getURL.contains("janparichay"));
	}
	
 // Check the heading on service plus page 
 	@Test(priority=4,dependsOnMethods = {"ServiceNavigationTestCase"})
	public void ServicePlusPageTestCase() throws IOException, InterruptedException
	
	{
	test.assignCategory(UrbanDevelopmentDepartment);
	UrbanDevelopmentDepartment dp=new UrbanDevelopmentDepartment(Driver);
	String s = dp.ServiceHeading().getText();
	Assert.assertTrue(s.contains("Sign In to your account via JanParichay"));

	//close and return to browser1
	List<String> browserTabs = new ArrayList<String> (Driver.getWindowHandles());
	commonlocators cl=new commonlocators(Driver);
	cl.closebrowserback();
	
	Driver.switchTo().window(browserTabs.get(0));
	
    }
	
	@Test(priority=6)

	public void IMbacktodirectory() throws InterruptedException
	{

		test.assignCategory(UrbanDevelopmentDepartment);
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
