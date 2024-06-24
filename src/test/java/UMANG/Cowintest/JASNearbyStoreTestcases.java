package UMANG.Cowintest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;
import com.google.gson.JsonObject;

import PageObjects.JASMedicineList;
import PageObjects.ServiceDirectoryNavigation;
import PageObjects.ServiceNavigation;
import PageObjects.commonlocators;
import PageObjects.departmentnavigationpage;
import Resources.Base2;
import Utilis.JASExcel;

import lombok.var;

public class JASNearbyStoreTestcases extends Base2
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
	@Test(priority=4)
	public void JASServiceNavigation() throws IOException, InterruptedException
	{

		 test.assignCategory(JanAushaidhiSugam);
		ServiceNavigation dp=new ServiceNavigation(Driver);
 		dp.JASNearbystore().click();
 		 test.log(Status.INFO,"Clicked Service");
		 Thread.sleep(1000);
		 Assert.assertEquals(dp.JASNearbystorelist().getText(),"Nearby Store","Not matched");
	}
	
  //Search Store
	@Test(priority=5)
	public void JASSearchstore() throws IOException, InterruptedException
	{

		 test.assignCategory(JanAushaidhiSugam);

        JASExcel gs=new JASExcel();
		
		JASMedicineList js=new JASMedicineList(Driver);
		js.nearbystoresearchbox().click();
		
		ArrayList<String> data=gs.getData("Nearby Store-Search");
		js.searchbox().sendKeys(data.get(1));
	
		Assert.assertEquals(js.nearbybuttontext().getText(),"Email", "No search result");	
		Thread.sleep(2000);
		js.searchbox().clear();
		Thread.sleep(2000);
	}
	
	
	//Case:check new tab is opened for email
	@Test(priority=6)
	public void JASnewtabcheckforemail() throws IOException, InterruptedException
	{
	
		 test.assignCategory(JanAushaidhiSugam);
		//scroll window
		JavascriptExecutor js1 = (JavascriptExecutor) Driver;
	    js1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		Thread.sleep(2000);
		JASMedicineList js=new JASMedicineList(Driver);
		js.nearbybuttontext().click();
		
		
		List<String> browserTabs = new ArrayList<String> (Driver.getWindowHandles());
		//switch to new tab
		Driver.switchTo().window(browserTabs .get(1));
		Thread.sleep(3000);
		//check is it correct page opened or not (e.g. check page's title)
		System.out.println(Driver.getTitle());
	
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertEquals(Driver.getTitle(),"Gmail: Private and secure email at no cost | Google Workspace", "title not Matched");
		//then close tab and get back
		Driver.close();
		Driver.switchTo().window(browserTabs.get(0));
		// switch to frame
		ServiceNavigation dp=new ServiceNavigation(Driver);
		Driver.switchTo().frame(dp.switchframe());
		Thread.sleep(1000);
		
		
	}
	
	//Case : Check new tab is open for map
	@Test(priority=7)
	public void JASnewtabcheckformap() throws IOException, InterruptedException
	{
		 test.assignCategory(JanAushaidhiSugam);
			List<String> browserTabs1 = new ArrayList<String> (Driver.getWindowHandles());	
		    commonlocators cl=new commonlocators(Driver);
				  if(browserTabs1.size()>1)
				  {
					  
					  cl.closebrowserback1();
				  }

		//scroll window
		JavascriptExecutor js1 = (JavascriptExecutor) Driver;
	    js1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
	    //for map
		Thread.sleep(2000);
		JASMedicineList js=new JASMedicineList(Driver);
		js.nearbymap().click();
		
		
		List<String> browserTabs = new ArrayList<String> (Driver.getWindowHandles());
		//switch to new tab
		Driver.switchTo().window(browserTabs .get(1));
		Thread.sleep(3000);
		//check is it correct page opened or not (e.g. check page's title)
	
		SoftAssert softAssert=new SoftAssert();
	softAssert.assertEquals(js.mappagedestination(),"Add Destination", "Not matched");
		//then close tab and get back
		Driver.close();
		Driver.switchTo().window(browserTabs.get(0));
		// switch to frame
		ServiceNavigation dp=new ServiceNavigation(Driver);
		Driver.switchTo().frame(dp.switchframe());
		Thread.sleep(1000);
		
			    
				
		
		
	}
	

	
	//back to service directory
	@Test(priority=8)

	public void JASbacktoservicedirectory() throws InterruptedException
	
	{	
		
	
		test.assignCategory(JanAushaidhiSugam);
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
