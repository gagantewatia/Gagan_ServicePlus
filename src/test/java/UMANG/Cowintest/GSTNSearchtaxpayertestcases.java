package UMANG.Cowintest;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;

import PageObjects.GSTNSearchTaxpayer;
import PageObjects.ServiceDirectoryNavigation;
import PageObjects.ServiceNavigation;
import PageObjects.departmentnavigationpage;
import Resources.Base2;
import Utilis.GSTNExcel;


public class GSTNSearchtaxpayertestcases extends Base2
	{
	
	//go to all services
			@Test(priority=1)
			public void allservicesnavigation() throws IOException, InterruptedException

			{
				test.assignCategory(GSTN);
				departmentnavigationpage SD=new departmentnavigationpage(Driver);
				SD.allservicesredirect();
				
			}

		//go to department page	
			
			@Test(priority=2)
			public void GSTNdepartmentnavigation() throws IOException, InterruptedException

			{
				 test.assignCategory(GSTN);
				 departmentnavigationpage SD=new departmentnavigationpage(Driver);
				 String Servicename="Goods & Service Tax Network";
			 	 SD.servicenavigationclick(Servicename);
				 Assert.assertEquals(SD.GSTNtitle().getText(),"Goods & Service Tax Network","Not matched");
			}
			
		//ServiceNavigation
		@Test(priority=3)
		public void GSTNSearchtaxpayerServiceNavigation() throws IOException, InterruptedException
		{
			 test.assignCategory(GSTN);
			 ServiceNavigation dp=new ServiceNavigation(Driver);
	 		 dp.GSTNSearchpayer().click();
	 		 test.log(Status.INFO,"clicked on Search tax payer Service");
			 Thread.sleep(1000);
			 Assert.assertEquals(dp.Searchpayertitle().getText(),"Search Taxpayer","Not matched");
		}
		
		//Check blank data
		@Test(priority=4)
		public void GSTNblankdata()
	
		{
			 test.assignCategory(GSTN);
			System.out.println("Check blank data");
			GSTNSearchTaxpayer dp=new GSTNSearchTaxpayer(Driver);
			dp.submitnumber().click();
			test.log(Status.INFO,"clicked on submit");
		   
			 Assert.assertEquals(dp.blankdatacheck().getText(),"Please enter valid GSTIN/UIN of the Taxpayer","Not matched");
	
		}
		
	//Enter invalid details
		@Test(priority=4)
		public void GSTNinvaliddata() throws IOException
		{
			test.assignCategory(GSTN);
			System.out.println("Enter invalid details data");
			GSTNSearchTaxpayer dp=new GSTNSearchTaxpayer(Driver);
		 //fetch test data from excel for required test case
			GSTNExcel gs=new GSTNExcel();
			
			ArrayList<String> data=gs.getData("GSTNinvaliddata");
		
			dp.searchbox().sendKeys(data.get(1));
			test.log(Status.INFO,"clicked on search");
			dp.submitnumber().click();
			test.log(Status.INFO,"clicked on submit");
			 
			SoftAssert softAssert = new SoftAssert();

			softAssert.assertEquals(dp.blankdatacheck().getText(), "Please enter valid GSTIN/UIN of the Taxpayer", "Not matched");
			dp.searchbox().clear();
			softAssert.assertAll();	
		}
		
		/*
	//enter valid data but no record found
		@Test(priority=5)
		public void GSTNnorecordfounddata() throws IOException, InterruptedException
		{
			 test.assignCategory(GSTN);
			System.out.println("Enter no record found");
			GSTNSearchTaxpayer dp=new GSTNSearchTaxpayer(Driver);
			GSTNExcel gs=new GSTNExcel();
			ArrayList<String> data=gs.getData("GSTNnorecordfounddata");
			test.log(Status.INFO,"clicked on search");
			dp.searchbox().sendKeys(data.get(1));
			dp.submitnumber().click();
			test.log(Status.INFO,"clicked on submit");
			System.out.println("Click popup");
			
		      Assert.assertEquals(dp.norecorddatacheck().getText(),"No records found","Not matched");
			Thread.sleep(1000);
			
			dp.popupok().click();
		
			dp.searchbox().clear();
			
		}
		*/
		
	//enter valid data
		@Test(priority=6)
		public void GSTNvaliddata() throws InterruptedException, IOException
		{
			 test.assignCategory(GSTN);
			System.out.println("Enter valid details data");
			GSTNSearchTaxpayer dp=new GSTNSearchTaxpayer(Driver);
			GSTNExcel gs=new GSTNExcel();
	
			ArrayList<String> data=gs.getData("GSTNvaliddata");
			
			dp.searchbox().sendKeys(data.get(1));
			test.log(Status.INFO,"clicked on search");
			dp.submitnumber().click();
			test.log(Status.INFO,"clicked on submit");
			
			Assert.assertEquals(dp.validatacheck().getText(),"Legal Name of Business","Not matched");
			Thread.sleep(1000);
		
		}
		
		
		@Test(priority=7)
		
		public void GSTNbacktoservicedirectory()
		{
		
			
			 test.assignCategory(GSTN);
			 ServiceDirectoryNavigation SN=new ServiceDirectoryNavigation(Driver);
			    SN.backtohome();
		}
		

		
}
