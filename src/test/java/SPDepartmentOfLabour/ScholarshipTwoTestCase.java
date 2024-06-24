package SPDepartmentOfLabour;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.ServiceDirectoryNavigation;
import PageObjects.commonlocators;
import PageObjects.departmentnavigationpage;
import Pageobject.SPDepartmentOfLabour.DepartmentOfLabour;
import Resources.Base2;

public class ScholarshipTwoTestCase extends Base2
{


	//go to all services
	@Test(priority=1)
	public void allservicesnavigation() throws IOException, InterruptedException

	{
		test.assignCategory(DepartmentOfLabour);
		departmentnavigationpage SD=new departmentnavigationpage(Driver);
		SD.allservicesredirect();
		
	}

//go to department page	
	
	@Test(priority=2)
	public void ScholarshipTwonavigation() throws IOException, InterruptedException

	{
		test.assignCategory(DepartmentOfLabour);
		 departmentnavigationpage SD=new departmentnavigationpage(Driver);
		 String Servicename="Department of Labour, Employment and Training";
	 	 SD.servicenavigationclick(Servicename);
		 Assert.assertEquals(SD.DepartmentOfLabour().getText(),"Department of Labour, Employment and Training","Not matched");
		 
	}

	//go to service and check heading
	@Test(priority=3,dependsOnMethods = {"DeptNavigation"})
	public void ScholarshipTwo1TestCases() throws IOException, InterruptedException
	
	{
	test.assignCategory(DepartmentOfLabour);
	DepartmentOfLabour dp=new DepartmentOfLabour(Driver);
	dp.ScholarshipTwo().click();
	Thread.sleep(2000);
	List<String> browserTabs = new ArrayList<String> (Driver.getWindowHandles());
	//switch to new tab
	
	
	Driver.switchTo().window(browserTabs.get(1));
	Thread.sleep(2000);
	String getURL = Driver.getCurrentUrl();
	System.out.println(getURL);
	Assert.assertTrue(getURL.contains("serviceonline"));
	}
	
	
	@Test(priority=4,dependsOnMethods = {"ServiceNavigationTestCase"})
	public void ScholarshipTwo2TestCase() throws IOException, InterruptedException
	
	{
	test.assignCategory(DepartmentOfLabour);
	commonlocators cl=new commonlocators(Driver);
	
	String s = cl.Serviceheading().getText();
	Assert.assertTrue(s.contains("Scholarship to Eligible Hostel inmates- ITI"));

	//close and return to browser1
	List<String> browserTabs = new ArrayList<String> (Driver.getWindowHandles());
	cl.closebrowserback();
	Driver.switchTo().window(browserTabs.get(0));
    }
	
	@Test(priority=6)

	public void IMbacktodirectory() throws InterruptedException
	{

		test.assignCategory(DepartmentOfLabour);
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

 