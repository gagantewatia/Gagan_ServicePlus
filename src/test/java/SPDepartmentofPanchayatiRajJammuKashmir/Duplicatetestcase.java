package SPDepartmentofPanchayatiRajJammuKashmir;

	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.List;
    import java.util.Set;
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.testng.Assert;
	import org.testng.annotations.Test;
	import PageObjects.ServiceDirectoryNavigation;
	import PageObjects.commonlocators;
	import PageObjects.departmentnavigationpage;
	import Pageobject.SPUrbanDevelopmentDepartment.UrbanDevelopmentDepartment;
	import Resources.Base2;
	import java.util.HashSet;


	

	public class Duplicatetestcase extends Base2
	{


		//go to all services
		@Test(priority=1)
		public void allservicesnavigation() throws IOException, InterruptedException

		{
			test.assignCategory(DepartmentofPanchayatiRajJammuKashmir);
			departmentnavigationpage SD=new departmentnavigationpage(Driver);
			SD.allservicesredirect();
			
		}

	//go to department page	
		
		@Test(priority=2)
		public void Deptnavigation() throws IOException, InterruptedException

		{
			test.assignCategory(DepartmentofPanchayatiRajJammuKashmir);
			 departmentnavigationpage SD=new departmentnavigationpage(Driver);
			 String Servicename="Department of Panchayati Raj Jammu & Kashmir";
		 	 SD.servicenavigationclick(Servicename);
			 Assert.assertEquals(SD.DepartmentofPanchayatiRajJammuKashmir().getText(),"Department of Panchayati Raj Jammu & Kashmir","Not matched");
			 
		}
		//Check logo of the department 
		@Test(priority=3,dependsOnMethods = {"Deptnavigation"})
		public void LogocheckTestCases() throws IOException, InterruptedException
		
		{
			test.assignCategory(DepartmentofPanchayatiRajJammuKashmir);
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
		//Check service count present in dept 
		@Test(priority=4,dependsOnMethods = {"Deptnavigation"})
		public void ServicecountTestCases() throws IOException, InterruptedException
		
		{
			test.assignCategory(DepartmentofPanchayatiRajJammuKashmir);
			commonlocators cl=new commonlocators(Driver);
			
			if (cl.serviceCount() == 1 )
			{
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
			
		}
		//Check if there is any duplicate service present in dept
		@Test(priority=5,dependsOnMethods = {"Deptnavigation"})
	     public void duplicateTestCases() throws IOException, InterruptedException
		
		{
			test.assignCategory(DepartmentofPanchayatiRajJammuKashmir);
			commonlocators cl=new commonlocators(Driver);
			
			 if (cl.duplicateTestCases().isEmpty())
		     {
		         System.out.println("No duplicate names found in DepartmentofPanchayatiRajJammuKashmir.");
		     } 
		     else 
		     {
		         System.out.println("Duplicate names found in DepartmentofPanchayatiRajJammuKashmir " + cl.duplicateTestCases());
		     }
		}//check servcie count FROM EXCEL
		
		@Test(priority=6,dependsOnMethods = {"Deptnavigation"})
		public void servicecountfromexcel() throws IOException, InterruptedException

		{
			test.assignCategory(ChiefMinisterReliefFund);
			commonlocators cl=new commonlocators(Driver);
		String x="Department of Panchayati Raj Jammu & Kashmir";
		System.out.println("service count:"+cl.servicecount());
				//call service to check service count)
		    cl.servicecountfunction(cl.servicecount(),x);
			 
		}
		
		@Test(priority=7,dependsOnMethods = {"Deptnavigation"})
	     public void InformationTestCases() throws IOException, InterruptedException
		
		{
			test.assignCategory(ChiefMinisterReliefFund);
			commonlocators cl=new commonlocators(Driver);
			cl.threedots();
			cl.Infodiscription();
		}
		
		//Back to home page 
        @Test(priority=8)

		public void IMbacktodirectory() throws InterruptedException
		{

        	test.assignCategory(ChiefMinisterReliefFund);
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
	
	
	
	