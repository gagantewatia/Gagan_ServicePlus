package SPDepartmentofPower;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.ServiceDirectoryNavigation;
import PageObjects.commonlocators;
import PageObjects.departmentnavigationpage;
import Pageobject.SPAgricultureDepartment.AgricultureDepartment;
import Resources.Base2;

public class OnlineSubmissionTestCases extends Base2
{


	//go to all services
	@Test(priority=1)
	public void allservicesnavigation() throws IOException, InterruptedException

	{
		test.assignCategory(AgricultureDepartment);
		departmentnavigationpage SD=new departmentnavigationpage(Driver);
		SD.allservicesredirect();
		
	}

//go to department page	
	
	@Test(priority=2)
	public void DeptNavigation() throws IOException, InterruptedException

	{
		test.assignCategory(AgricultureDepartment);
		 departmentnavigationpage SD=new departmentnavigationpage(Driver);
		 String Servicename="Agriculture Department";
	 	 SD.servicenavigationclick(Servicename);
		 Assert.assertEquals(SD.AgricultureDep().getText(),"Agriculture Department","Not matched");
		 
	}

	//go to service and check heading
	@Test(priority=3,dependsOnMethods = {"DeptNavigation"})
	public void ServiceNavigationTestCase() throws IOException, InterruptedException
	
	{
	test.assignCategory(AgricultureDepartment);
	AgricultureDepartment dp=new AgricultureDepartment(Driver);
	//click on the service 
	dp.OnlineSubmission().click();
	Thread.sleep(2000);
	List<String> browserTabs = new ArrayList<String> (Driver.getWindowHandles());
	//switch to new tab
	
	
	Driver.switchTo().window(browserTabs.get(1));
	Thread.sleep(2000);
	String getURL = Driver.getCurrentUrl();
	System.out.println(getURL);
	//check the URL of the open browser
	Assert.assertTrue(getURL.contains("investmeghalaya.gov.in"));
	}
	// Check the heading on service plus page 
	@Test(priority=4,dependsOnMethods = {"ServiceNavigationTestCase"})
	public void ServicePlusPageTestCase() throws IOException, InterruptedException
	
	{
	test.assignCategory(AgricultureDepartment);
	
	AgricultureDepartment dp=new AgricultureDepartment(Driver);
	String s = dp.SPpageheading().getText();
	Assert.assertTrue(s.contains("Online Submission of Aadhaar Card to the District Agriculture Office for PM Kisan Beneficiary ONLY"));

	//close and return to browser1
	List<String> browserTabs = new ArrayList<String> (Driver.getWindowHandles());
	commonlocators cl=new commonlocators(Driver);
	cl.closebrowserback();
	Driver.switchTo().window(browserTabs.get(0));
    }
	
	@Test(priority=6)

	public void IMbacktodirectory() throws InterruptedException
	{

		test.assignCategory(AgricultureDepartment);
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
 
