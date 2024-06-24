package SPLabourDepartment;

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
import Pageobject.SPLabourDepartment.LabourDepartment;
import Resources.Base2;

public class Duplicatetestcase extends Base2
{


	//go to all services
	@Test(priority=1)
	public void allservicesnavigation() throws IOException, InterruptedException

	{
		test.assignCategory(LabourDepartment);
		departmentnavigationpage SD=new departmentnavigationpage(Driver);
		SD.allservicesredirect();
		
	}

//go to department page	
	
	@Test(priority=2)
	public void Deptnavigation() throws IOException, InterruptedException
	{
		test.assignCategory(LabourDepartment);
		 departmentnavigationpage SD=new departmentnavigationpage(Driver);
		 String Servicename="Labour Department Haryana";
	 	 SD.servicenavigationclick(Servicename);
		 Assert.assertEquals(SD.LabourDepartment().getText(), "Labour Department Haryana","Not matched");
		 
	}
		//Check logo of the department 
		@Test(priority=3,dependsOnMethods = {"Deptnavigation"})
		public void LogocheckTestCases() throws IOException, InterruptedException
		
		{
			test.assignCategory(CCET);
			commonlocators cl=new commonlocators(Driver);	
		
		// Perform the assertion
		
		if (cl.actualSrc().equals(cl.expectedSrc()))
		{
		    System.out.println("Assertion Passed: Actual src matches the expected src.");
		    Assert.assertTrue(true);
		}
		else 
		{
		    System.out.println("Assertion Failed: Actual src (" + cl.actualSrc() + ") does not match the expected src (" + cl.expectedSrc() + ")");
		    Assert.assertTrue(false);
		}
	}
		
		//Check service count present in department 
		@Test(priority=4,dependsOnMethods = {"Deptnavigation"})
		public void ServicecountTestCases() throws IOException, InterruptedException
		
		{
			test.assignCategory(CCET);
			commonlocators cl=new commonlocators(Driver);
			
			if (cl.serviceCount() == 23 )
			{
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
			
		}
		//Check if there is any duplicate service present in department 
		@Test(priority=5,dependsOnMethods = {"Deptnavigation"})
	     public void duplicateTestCases() throws IOException, InterruptedException
		
		{
			test.assignCategory(CCET);
			commonlocators cl=new commonlocators(Driver);
			
			 if (cl.duplicateTestCases().isEmpty())
		     {
		         System.out.println("No duplicate names found in Labour Department");
		     } 
		     else 
		     {
		         System.out.println("Duplicate names found in Labour Department " + cl.duplicateTestCases());
		     }
		}
		
		@Test(priority=6,dependsOnMethods = {"Deptnavigation"})
		public void servicecountfromexcel() throws IOException, InterruptedException

		{
			commonlocators cl=new commonlocators(Driver);
		String x="Labour Department Haryana";
		System.out.println("service count:"+cl.servicecount());
				//call service to check service count)
		    cl.servicecountfunction(cl.servicecount(),x);
			 
		}
		
		@Test(priority=7,dependsOnMethods = {"Deptnavigation"})
	     public void InformationTestCases() throws IOException, InterruptedException
		
		{
			commonlocators cl=new commonlocators(Driver);
			cl.threedots();
			cl.Infodiscription();
		}
		
		//Back to home page 
        @Test(priority=8)

		public void IMbacktodirectory() throws InterruptedException
		{

			test.assignCategory(CCET);
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
	
	
	
	
