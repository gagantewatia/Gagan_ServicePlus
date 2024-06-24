package SPSainikArdhSainikWelfareDepartment;

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
			test.assignCategory(SainikArdhSainikWelfareDepartment);
			departmentnavigationpage SD=new departmentnavigationpage(Driver);
			SD.allservicesredirect();
			
		}

	//go to department page	
		
		//go to department page	
		
		@Test(priority=2)
		public void Deptnavigation() throws IOException, InterruptedException

		{
			{
				test.assignCategory(SainikArdhSainikWelfareDepartment);
				 departmentnavigationpage SD=new departmentnavigationpage(Driver);
				 String Servicename="Sainik & Ardh Sainik Welfare Department";
			 	 SD.servicenavigationclick(Servicename);
				 Assert.assertEquals(SD.SainikArdhSainikWelfareDepartment().getText(),"Sainik & Ardh Sainik Welfare Department","Not matched");
				 
			}
		}
		@Test(priority=3)
		public void ServicecountTestCases() throws IOException, InterruptedException
		
		{
			commonlocators cl=new commonlocators(Driver);
			
			if (cl.serviceCount() == 11 )
			{
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
			
		}
		
		@Test(priority=4)
	     public void duplicateTestCases() throws IOException, InterruptedException
		
		{
			commonlocators cl=new commonlocators(Driver);
			
			 if (cl.duplicateTestCases().isEmpty())
		     {
		         System.out.println("No duplicate names found in Sainik & Ardh Sainik Welfare Department Haryana");
		     } 
		     else 
		     {
		         System.out.println("Duplicate names found in Sainik & Ardh Sainik Welfare Department Haryana :  " + cl.duplicateTestCases());
		     }
		}
		
	
		@Test(priority=6,dependsOnMethods = {"Deptnavigation"})
		public void servicecountfromexcel() throws IOException, InterruptedException

		{
			test.assignCategory(SainikArdhSainikWelfareDepartment);
			commonlocators cl=new commonlocators(Driver);
		String x="Sainik & Ardh Sainik Welfare Department Haryana";
		//System.out.println("service count:"+cl.servicecount());
				//call service to check service count)
		    cl.servicecountfunction(cl.servicecount(),x);
			 
		}
		
		@Test(priority=7,dependsOnMethods = {"Deptnavigation"})
	     public void InformationTestCases() throws IOException, InterruptedException
		
		{
			test.assignCategory(SainikArdhSainikWelfareDepartment);
			commonlocators cl=new commonlocators(Driver);
			cl.threedots();
			cl.Infodiscription();
		}
		
		//Back to home page 
        @Test(priority=8)


		public void IMbacktodirectory() throws InterruptedException
		{

			test.assignCategory(SainikArdhSainikWelfareDepartment);
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
	
	
	
	
