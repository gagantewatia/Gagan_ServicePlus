package SPGuwahatiDevelopmentDepartment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.ServiceDirectoryNavigation;
import PageObjects.commonlocators;
import PageObjects.departmentnavigationpage;
import Pageobject.SPGuwahatiDevelopmentDepartment.GuwahatiDevelopmentDepartment;
import Resources.Base2;

public class AnimalTaxPaymentunderGMCAct1971TestCase extends Base2
{


	//go to all services
	@Test(priority=1)
	public void allservicesnavigation() throws IOException, InterruptedException

	{
		test.assignCategory(GuwahatiDevelopmentDepartment);
		departmentnavigationpage SD=new departmentnavigationpage(Driver);
		SD.allservicesredirect();
		
	}

//go to department page	
	
	@Test(priority=2)
	public void DeptNavigation() throws IOException, InterruptedException

	{
		test.assignCategory(GuwahatiDevelopmentDepartment);
		 departmentnavigationpage SD=new departmentnavigationpage(Driver);
		 String Servicename="Guwahati Development Department (Assam)";
	 	 SD.servicenavigationclick(Servicename);
		 Assert.assertEquals(SD.GuwahatiDevelopmentDepartment().getText(),"Guwahati Development Department (Assam)","Not matched");
		 
	}

	//go to service and check heading
	@Test(priority=3,dependsOnMethods = {"DeptNavigation"})
	public void ServiceNavigationTestCase() throws IOException, InterruptedException
	
	{
	test.assignCategory(GuwahatiDevelopmentDepartment);
	GuwahatiDevelopmentDepartment dp=new GuwahatiDevelopmentDepartment(Driver);
	dp.AnimalTax().click();
	Thread.sleep(2000);
	List<String> browserTabs = new ArrayList<String> (Driver.getWindowHandles());
	//switch to new tab
	
	
	Driver.switchTo().window(browserTabs.get(1));
	Thread.sleep(2000);
	String getURL = Driver.getCurrentUrl();
	System.out.println(getURL);
	Assert.assertTrue(getURL.contains("assam"));
	}
	
	// Check the heading on service plus page 
	@Test(priority=4,dependsOnMethods = {"ServiceNavigationTestCase"})
	public void ServicePlusPageTestCase() throws IOException, InterruptedException
	
	{
	test.assignCategory(GuwahatiDevelopmentDepartment);
	commonlocators cl=new commonlocators(Driver);
	
	String s = cl.Serviceheading().getText();
	Assert.assertTrue(s.contains("Animal Tax Payment under GMC Act 1971"));

	//close and return to browser1
	List<String> browserTabs = new ArrayList<String> (Driver.getWindowHandles());
	cl.closebrowserback();
	Driver.switchTo().window(browserTabs.get(0));
    }
	
	@Test(priority=6)

	public void IMbacktodirectory() throws InterruptedException
	{

		test.assignCategory(GuwahatiDevelopmentDepartment);
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
