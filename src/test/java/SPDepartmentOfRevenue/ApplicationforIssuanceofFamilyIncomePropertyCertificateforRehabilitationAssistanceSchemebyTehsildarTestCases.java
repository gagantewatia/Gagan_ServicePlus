package SPDepartmentOfRevenue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.ServiceDirectoryNavigation;
import PageObjects.commonlocators;
import PageObjects.departmentnavigationpage;
import Pageobject.SPDepartmentOfRevenue.DepartmentOfRevenue;
import Resources.Base2;

public class ApplicationforIssuanceofFamilyIncomePropertyCertificateforRehabilitationAssistanceSchemebyTehsildarTestCases extends Base2
{


	//go to all services
	@Test(priority=1)
	public void allservicesnavigation() throws IOException, InterruptedException

	{
		test.assignCategory(DepartmentOfRevenue);
		departmentnavigationpage SD=new departmentnavigationpage(Driver);
		SD.allservicesredirect();
		
	}

//go to department page	
	
	@Test(priority=2)
	public void DeptNavigation() throws IOException, InterruptedException
	{
		test.assignCategory(DepartmentOfRevenue);
		 departmentnavigationpage SD=new departmentnavigationpage(Driver);
		 String Servicename="Department of Revenue";
	 	 SD.SCservicenavigationclick(Servicename);
		 Assert.assertEquals(SD.DepartmentOfRevenue().getText(),"Department of Revenue (Jammu & Kashmir)","Not matched");
		 
	}

	//go to service and check heading
	@Test(priority=3)
	public void ServiceNavigationTestCase() throws IOException, InterruptedException
	
	{
	test.assignCategory(DepartmentOfRevenue);
	DepartmentOfRevenue dp=new DepartmentOfRevenue(Driver);
	dp.FamilyIncome().click();
	Thread.sleep(2000);
	List<String> browserTabs = new ArrayList<String> (Driver.getWindowHandles());
	//switch to new tab
	
	
	Driver.switchTo().window(browserTabs.get(1));
	Thread.sleep(2000);
	String getURL = Driver.getCurrentUrl();
	System.out.println(getURL);
	Assert.assertTrue(getURL.contains("serviceonline.gov.in"));
	}
	
	@Test(priority=4)
	public void ServicePlusPageTestCase() throws IOException, InterruptedException
	
	{
	test.assignCategory(DepartmentOfRevenue);
	commonlocators cl=new commonlocators(Driver);
	
	String s = cl.Serviceheading().getText();
	Assert.assertTrue(s.contains("Application for Issuance of Family Income / Property Certificate for Rehabilitation Assistance Scheme by Tehsildar"));

	//close and return to browser1
	List<String> browserTabs = new ArrayList<String> (Driver.getWindowHandles());
	cl.closebrowserback();
	Driver.switchTo().window(browserTabs.get(0));
    }
	
	@Test(priority=6)

	public void IMbacktodirectory() throws InterruptedException
	{

		test.assignCategory(DepartmentOfRevenue);
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
