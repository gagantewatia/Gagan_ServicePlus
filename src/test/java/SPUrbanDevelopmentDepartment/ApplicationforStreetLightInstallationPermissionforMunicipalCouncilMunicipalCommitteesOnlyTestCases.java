package SPUrbanDevelopmentDepartment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.ServiceDirectoryNavigation;
import PageObjects.commonlocators;
import PageObjects.departmentnavigationpage;
import Pageobject.SPUrbanDevelopmentDepartment.UrbanDevelopmentDepartment;
import Resources.Base2;

public class ApplicationforStreetLightInstallationPermissionforMunicipalCouncilMunicipalCommitteesOnlyTestCases extends Base2
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

	//go to service and check heading
	@Test(priority=3,dependsOnMethods = {"DeptNavigation"})
	public void ServiceNavigationTestCase() throws IOException, InterruptedException
	
	{
	test.assignCategory(UrbanDevelopmentDepartment);
	UrbanDevelopmentDepartment dp=new UrbanDevelopmentDepartment(Driver);
	//click on the service 
	dp.RehriLicense().click();
	Thread.sleep(2000);
	List<String> browserTabs = new ArrayList<String> (Driver.getWindowHandles());
	//switch to new tab
	
	
	Driver.switchTo().window(browserTabs.get(1));
	Thread.sleep(2000);
	String getURL = Driver.getCurrentUrl();
	System.out.println(getURL);
	Assert.assertTrue(getURL.contains("serviceonline"));
	}
	
	// Check the heading on service plus page 
	@Test(priority=4,dependsOnMethods = {"ServiceNavigationTestCase"})
	public void ServicePlusPageTestCase() throws IOException, InterruptedException
	
	{
		test.assignCategory(UrbanDevelopmentDepartment);
	     commonlocators cl=new commonlocators(Driver);
		
		String s = cl.Serviceheading().getText();
		Assert.assertTrue(s.contains("Application for Street Light Installation Permission for Municipal Council / Municipal Committees Only"));
	    
		//close and return to browser1
		List<String> browserTabs = new ArrayList<String> (Driver.getWindowHandles());
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
