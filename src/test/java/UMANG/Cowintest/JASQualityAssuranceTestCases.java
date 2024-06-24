package UMANG.Cowintest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.ServiceDirectoryNavigation;
import PageObjects.ServiceNavigation;
import PageObjects.departmentnavigationpage;
import Resources.Base2;

public class JASQualityAssuranceTestCases extends Base2
{

	//go to all services
			@Test(priority=1)
			public void allservicesnavigation() throws IOException, InterruptedException

			{
				 test.assignCategory(JanAushaidhiSugam);
				departmentnavigationpage SD=new departmentnavigationpage(Driver);
				SD.allservicesredirect();
				
			}

		//go to department page	
			
			@Test(priority=2)
			public void JASdepartmentnavigation() throws IOException, InterruptedException

			{
				 test.assignCategory(JanAushaidhiSugam);
				 departmentnavigationpage dp=new departmentnavigationpage(Driver);
				 String Servicename="Jan Aushadhi Sugam";
			 	 dp.servicenavigationclick(Servicename);
				Assert.assertEquals(dp.JASTitle().getText(),"Jan Aushadhi Sugam","Not matched");
			}
	


	//ServiceNavigation
	@Test(priority=3)
	public void JASQualityAssuranceServiceNavigation() throws IOException, InterruptedException
	{

		 test.assignCategory(JanAushaidhiSugam);
		 ServiceNavigation dp=new ServiceNavigation(Driver);
 	  	dp.JASQualityAssurance().click();
		 Thread.sleep(1000);
		 Assert.assertEquals(dp.JASQualityAssurancetitle().getText(),"Quality Assurance","Not matched");
		 Thread.sleep(2000);
	}

	//back to service directory
		@Test(priority=5)

		public void JASbacktoservicedirectory()
		{
			 test.assignCategory(JanAushaidhiSugam);
			 ServiceDirectoryNavigation SN=new ServiceDirectoryNavigation(Driver);
			    SN.backtohome();
		}
	
	
}
