package SPAgricultureDep;

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
import Pageobject.SPAgricultureDep.AgricultureDept;
import Resources.Base2;

public class SoilConversationTestcases extends Base2
{


	//go to all services
	@Test(priority=1)
	public void allservicesnavigation() throws IOException, InterruptedException

	{
		test.assignCategory(AgricultureDep);
		departmentnavigationpage SD=new departmentnavigationpage(Driver);
		SD.allservicesredirect();
		
	}

//go to department page	
	
	@Test(priority=2)
	public void Deptnavigation() throws IOException, InterruptedException

	{
		test.assignCategory(AgricultureDep);
		 departmentnavigationpage SD=new departmentnavigationpage(Driver);
		 String Servicename="Agriculture Department - Andaman and Nicobar";
	 	 SD.servicenavigationclick(Servicename);
		 Assert.assertEquals(SD.AgricultureDepAD().getText(),"Agriculture Department - Andaman and Nicobar","Not matched");
		 
	}
	@Test(priority = 3)
	public void Seeinfoclick() throws IOException, InterruptedException

		{
				test.assignCategory(AgricultureDep);
				Infopage PQ=new Infopage(Driver);
				AgricultureDept dp=new AgricultureDept(Driver);
				dp.infoSoilConservation().click();
				test.log(Status.INFO,"Clicked on i icon"); 
				Assert.assertEquals(PQ.infoservicename2().getText(),"Soil Conservation Work and Strenghthening of Soil test Laboratory","Not matched");
				PQ.desccheck();

		}
	@Test(priority = 4,dependsOnMethods = {"Seeinfoclick"})
	public void VisitServiceclick() throws IOException, InterruptedException

	{
		test.assignCategory(AgricultureDep);
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
		Assert.assertTrue(getURL.contains("serviceonline"));

		//close and return to browser1
	    cl.closebrowserback1();
		Driver.switchTo().window(browserTabs.get(0));
	}	
	
	@Test(priority = 5)
		public void refreshpage() throws IOException, InterruptedException

		{
			test.assignCategory(AgricultureDep);
			ServiceNavigation SN=new ServiceNavigation(Driver);
			SN.refresh();
			test.log(Status.INFO,"Refresh the Page");
		}

	//go to service and check heading
	@Test(priority=6,dependsOnMethods = {"Deptnavigation"})
	public void ServiceNavigationTestCase() throws IOException, InterruptedException
	
	{
	test.assignCategory(AgricultureDep);
	AgricultureDept dp=new AgricultureDept(Driver);
	dp.SoilConservation().click();
	Thread.sleep(2000);
	List<String> browserTabs = new ArrayList<String> (Driver.getWindowHandles());
	//switch to new tab
	
	
	Driver.switchTo().window(browserTabs.get(1));
	Thread.sleep(2000);
	String getURL = Driver.getCurrentUrl();
	System.out.println(getURL);
	Assert.assertTrue(getURL.contains("serviceonline.gov.in"));
	}
	
	@Test(priority=7,dependsOnMethods = {"ServiceNavigationTestCase"})
	public void ServicePlusPageTestCase() throws IOException, InterruptedException
	
	{
	test.assignCategory(AgricultureDep);
	commonlocators cl=new commonlocators(Driver);
	
	String s = cl.Serviceheading().getText();
	Assert.assertTrue(s.contains("Soil Conservation Work and Strenghthening of Soil test Laboratory"));

	//close and return to browser1
	List<String> browserTabs = new ArrayList<String> (Driver.getWindowHandles());
	cl.closebrowserback();
	Driver.switchTo().window(browserTabs.get(0));
    }
	
	@Test(priority=8)

	public void IMbacktodirectory() throws InterruptedException
	{

		test.assignCategory(AgricultureDep);
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
 