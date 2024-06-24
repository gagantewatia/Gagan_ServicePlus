package SPDepOfEmpowerment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.ServiceDirectoryNavigation;
import PageObjects.commonlocators;
import PageObjects.departmentnavigationpage;
import Pageobject.SPDepOfEmpowerment.DepOfEmpowerment;
import Resources.Base2;

public class DisabledPersonTestCases extends Base2
{


	//go to all services
	@Test(priority=1)
	public void allservicesnavigation() throws IOException, InterruptedException

	{
		test.assignCategory(DepOfEmpowerment);
		departmentnavigationpage SD=new departmentnavigationpage(Driver);
		SD.allservicesredirect();
		
	}

//go to department page	
	
	@Test(priority=2)
	public void DeptNavigation() throws IOException, InterruptedException
	{
		test.assignCategory(DepOfEmpowerment);
		 departmentnavigationpage SD=new departmentnavigationpage(Driver);
		 String Servicename="Department Of Empowerment Of Persons With Disabilities";
	 	 SD.servicenavigationclick(Servicename);
		 Assert.assertEquals(SD.DepOfEmpowerment().getText(),"Department Of Empowerment Of Persons With Disabilities","Not matched");
		 
	}

	//go to service and check heading
	@Test(priority=3)
	public void ServiceNavigationTestCase() throws IOException, InterruptedException
	
	{
	test.assignCategory(DepOfEmpowerment);
	DepOfEmpowerment dp=new DepOfEmpowerment(Driver);
	dp.Disabled().click();
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
	test.assignCategory(DepOfEmpowerment);
	commonlocators cl=new commonlocators(Driver);
	
	String s = cl.Serviceheading().getText();
	Assert.assertTrue(s.contains("Scheme of Assistance to Disabled Persons for Purchase/Fitting of Aids/Appliances ADIP SCHEME"));

	//close and return to browser1
	List<String> browserTabs = new ArrayList<String> (Driver.getWindowHandles());
	cl.closebrowserback();
	Driver.switchTo().window(browserTabs.get(0));
    }
	
	@Test(priority=6)

	public void IMbacktodirectory() throws InterruptedException
	{

		test.assignCategory(DepOfEmpowerment);
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
