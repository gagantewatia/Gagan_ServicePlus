package SPGeneralAdministrationDepartment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.ServiceDirectoryNavigation;
import PageObjects.commonlocators;
import PageObjects.departmentnavigationpage;
import Pageobject.SPGeneralAdministrationDepartment.GeneralAdministrationDepartment;
import Resources.Base2;

public class SeniorCitizensCertificateTestCase extends Base2
{


	//go to all services
	@Test(priority=1)
	public void allservicesnavigation() throws IOException, InterruptedException

	{
		test.assignCategory(GeneralAdministrationDepartment);
		departmentnavigationpage SD=new departmentnavigationpage(Driver);
		SD.allservicesredirect();
		
	}

//go to department page	
	
	@Test(priority=2)
	public void AyushmanBharatnavigation() throws IOException, InterruptedException

	{
		test.assignCategory(GeneralAdministrationDepartment);
		 departmentnavigationpage SD=new departmentnavigationpage(Driver);
		 String Servicename="General Administration Department";
	 	 SD.servicenavigationclick(Servicename);
		 Assert.assertEquals(SD.GeneralAdministrationDepartment().getText(),"General Administration Department","Not matched");
		 
	}

	//go to service and check heading
	@Test(priority=3)
	public void SeniorCitizensCertificate1TestCases() throws IOException, InterruptedException
	
	{
	test.assignCategory(GeneralAdministrationDepartment);
	GeneralAdministrationDepartment dp=new GeneralAdministrationDepartment(Driver);
	dp.SeniorCitizensCertificate().click();
	Thread.sleep(2000);
	List<String> browserTabs = new ArrayList<String> (Driver.getWindowHandles());
	//switch to new tab
	
	
	Driver.switchTo().window(browserTabs.get(1));
	Thread.sleep(2000);
	String getURL = Driver.getCurrentUrl();
	System.out.println(getURL);
	Assert.assertTrue(getURL.contains("assam"));
	}
	
	@Test(priority=4)
	public void SeniorCitizensCertificate2TestCase() throws IOException, InterruptedException
	
	{
	test.assignCategory(GeneralAdministrationDepartment);
	commonlocators cl=new commonlocators(Driver);
	
	String s = cl.Serviceheading().getText();
	Assert.assertTrue(s.contains("Issuance of Senior Citizens Certificate"));

	//close and return to browser1
	List<String> browserTabs = new ArrayList<String> (Driver.getWindowHandles());
	cl.closebrowserback();
	Driver.switchTo().window(browserTabs.get(0));
    }
	
	@Test(priority=6)

	public void IMbacktodirectory() throws InterruptedException
	{

		test.assignCategory(GeneralAdministrationDepartment);
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
