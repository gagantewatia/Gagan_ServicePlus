package UMANG.Cowintest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import PageObjects.JASMedicineList;
import PageObjects.ServiceDirectoryNavigation;
import PageObjects.ServiceNavigation;
import PageObjects.departmentnavigationpage;
import Resources.Base2;

public class JASAboutUSTestcases extends Base2
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
		public void JASaboutusServiceNavigation() throws IOException, InterruptedException
		{

			 test.assignCategory(JanAushaidhiSugam);
			 ServiceNavigation dp=new ServiceNavigation(Driver);
	 		 dp.JASaboutus().click();
	 		 test.log(Status.INFO,"Clicked Service");
			 Thread.sleep(1000);
			 Assert.assertEquals(dp.JASaboutustitle().getText(),"About Us","Not matched");
			 Thread.sleep(2000);
		}
		
		//check PMBJB page
		@Test(priority=4)
		public void JASAboutPMBJP() throws IOException, InterruptedException
		{

			 test.assignCategory(JanAushaidhiSugam);
		     JASMedicineList JS=new JASMedicineList(Driver);
	 		 JS.PMBJB().click();
			 Assert.assertEquals(JS.PMBJBdata().getText(),"Salient features of scheme :","Not matched");
			 Thread.sleep(2000);
		}
		
		//Check PMBI page
		@Test(priority=5)
		public void JASAboutPMBI() throws IOException, InterruptedException
		{

			 test.assignCategory(JanAushaidhiSugam);
		     JASMedicineList JS=new JASMedicineList(Driver);
	 		 JS.PMBI().click();
			 Assert.assertEquals(JS.PMBIdata().getText(),"Coordinate with Hospitals in preparation of formulary.","Not matched");
			 Thread.sleep(2000);
		}
		
		//back to home page
		@Test(priority=6)

		public void JASbacktoservicedirectory()
		{
			test.assignCategory(JanAushaidhiSugam);
			 ServiceDirectoryNavigation SN=new ServiceDirectoryNavigation(Driver);
			    SN.backtohome();
		}
	
		
		
}
