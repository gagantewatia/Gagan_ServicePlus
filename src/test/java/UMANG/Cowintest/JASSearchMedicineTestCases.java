package UMANG.Cowintest;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.JASMedicineList;
import PageObjects.ServiceDirectoryNavigation;
import PageObjects.ServiceNavigation;
import PageObjects.departmentnavigationpage;
import Resources.Base2;
import Utilis.GSTNExcel;
import Utilis.JASExcel;

public class JASSearchMedicineTestCases extends Base2
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
		public void JASServiceNavigation() throws IOException, InterruptedException
		{

			 test.assignCategory(JanAushaidhiSugam);
			ServiceNavigation dp=new ServiceNavigation(Driver);
	 		dp.JASMedicineList().click();
			 Thread.sleep(1000);
			
			 Assert.assertEquals(dp.JASMedicineListtitle().getText(),"Medicine List","Not matched");
		}
		
		
	//Case: Verify Records are present
		@Test(priority=4)
		public void JASverifyrecord() throws InterruptedException
		{
			System.out.println("Verify records are present");
			JASMedicineList js=new JASMedicineList(Driver);
			 test.assignCategory(JanAushaidhiSugam);
			Assert.assertEquals(js.generic().getText(),"Generic","Not matched");
			Thread.sleep(2000);
			
		}
		
		//search
		@Test(priority=5)
		public void searchrecord() throws IOException, InterruptedException 
		{
			 test.assignCategory(JanAushaidhiSugam);
			System.out.println(" Verify search record");
	        JASExcel gs=new JASExcel();
			
			JASMedicineList js=new JASMedicineList(Driver);
			js.searchicon().click();
			ArrayList<String> data=gs.getData("Medicinesearch-Searchbox");
			js.searchbox().sendKeys(data.get(1));
			
			Assert.assertEquals(js.searchboxtitle().getText(),"Medicine Name", "No search result");	
			Thread.sleep(2000);
			js.searchbox().clear();
			Thread.sleep(2000);
			
			
		}
		
	//Case : Verify user successfully navigates to other brands page
		
		@Test(priority=6)
		
		public void Medicineotherbrands() throws InterruptedException
		{
			 test.assignCategory(JanAushaidhiSugam);
			System.out.println("Verify user successfully navigates to other brands page");
			JASMedicineList js=new JASMedicineList(Driver);
			js.otherbrands().click();
		
			Assert.assertEquals(js.otherbrandsnextpage().getText(),"Other Brands","Not matched");
         Thread.sleep(2000);
			Driver.navigate().back();
		
			Thread.sleep(2000);
			
			
			//move back to frame
		ServiceNavigation dp=new ServiceNavigation(Driver);
			Driver.switchTo().frame(dp.switchframe());
			Thread.sleep(2000);
		
		}
		
		
		
		// case : Verify user naviagtes to nearest store
		
		@Test(priority=7)
		public void neareststore() throws InterruptedException
		{
			 test.assignCategory(JanAushaidhiSugam);
         System.out.println(" Verify user is navigate to nearest store");
			//JavascriptExecutor js1 = (JavascriptExecutor) Driver;
		   // js1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
         JASMedicineList js=new JASMedicineList(Driver);
         
			js.neareststore().click();
	
	     	Assert.assertEquals(js.neareststorepage().getText(), "Nearby Store");
	    	Thread.sleep(2000);
	    	Driver.navigate().back();
	        Thread.sleep(2000);
			
			
			//move back to frame
		ServiceNavigation dp=new ServiceNavigation(Driver);
			Driver.switchTo().frame(dp.switchframe());
			Thread.sleep(1000);
		
		
		}
	
		
	//Case: Verify user is able to add book mark
			@Test(priority=8)
			
			public void Medicineaddbookmark() throws InterruptedException
			{
				 test.assignCategory(JanAushaidhiSugam);
	         System.out.println(" Verify user is able to add book mark");
				//JavascriptExecutor js1 = (JavascriptExecutor) Driver;
			   // js1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
				JASMedicineList js=new JASMedicineList(Driver);
				js.bookmark().click();
				
				//go to book mark page
				js.clickbookmarklink().click();
		
		     	Assert.assertNotEquals(js.totalrecords().getText(), "Record Found:0");
				Thread.sleep(2000);	
			}	
		
	//Case 9: delete bookmark
@Test(dependsOnMethods= {"Medicineaddbookmark"})
			
			public void Medicinedeletebookmark() throws InterruptedException
			{
	 test.assignCategory(JanAushaidhiSugam);
	         System.out.println(" Verify user is able to delete book mark");
			
				JASMedicineList js=new JASMedicineList(Driver);
				JavascriptExecutor js1 = (JavascriptExecutor) Driver;
				   
				js1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
				Thread.sleep(2000);
				
				js.deletebookmark().click();
			
				//delete bookmark
				Thread.sleep(1000);
				
				js.deletebookmarkbutton().click();
				Thread.sleep(2000);
			
		     	Assert.assertEquals(js.totalrecords().getText(), "Records Found : 0");
		     	Thread.sleep(2000);
		    	Driver.navigate().back();
	   	        Thread.sleep(2000);
				
				
				//move back to frame
			ServiceNavigation dp=new ServiceNavigation(Driver);
				Driver.switchTo().frame(dp.switchframe());
				Thread.sleep(1000);
			
			}	


//back to service directory
@Test(priority=9)

public void GSTNbacktoservicedirectory()
{
	 test.assignCategory(JanAushaidhiSugam);
	 ServiceDirectoryNavigation SN=new ServiceDirectoryNavigation(Driver);
	    SN.backtohome();
}

}
