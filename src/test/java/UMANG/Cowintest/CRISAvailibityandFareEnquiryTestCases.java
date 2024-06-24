package UMANG.Cowintest;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjects.CRISavailibityandfareenquiry;
import PageObjects.ServiceDirectoryNavigation;
import PageObjects.ServiceNavigation;
import PageObjects.departmentnavigationpage;
import Resources.Base2;
import Utilis.CRISExcel;

public class CRISAvailibityandFareEnquiryTestCases extends Base2{
	//go to all services
	@Test(priority=1)
	public void allservicesnavigation() throws IOException, InterruptedException

	{
		 test.assignCategory(CRIS);
		departmentnavigationpage SD=new departmentnavigationpage(Driver);
		SD.allservicesredirect();
		
	}

//go to department page	
	
	@Test(priority=2)
	public void CRISdepartmentnavigation() throws IOException, InterruptedException

	{
		 test.assignCategory(CRIS);
		 departmentnavigationpage SD=new departmentnavigationpage(Driver);
		 String Servicename="CRIS";
	 	 SD.servicenavigationclick(Servicename);
	 	Assert.assertEquals(SD.CRISNGETTitle().getText(),"CRIS NGET","Not matched");
	}
		
	
	
	//ServiceNavigation
	@Test(priority=3)
	public void CRISServiceNavigation() throws IOException
	{
		 test.assignCategory(CRIS);
		System.out.println("Service Navigation");
		ServiceNavigation dp=new ServiceNavigation(Driver);
 		dp.CRISavailbiltyandfare().click();
	
		 Assert.assertEquals(dp.CRISavailbiltyandfaretitle().getText(),"Availability and Fare Enquiry","Not matched");
	}

	//Case: no class available
	@Test(priority=4)
	public void CRISafnoclassavailable() throws IOException, InterruptedException
	{
	  	  test.assignCategory(CRIS);
		CRISavailibityandfareenquiry dp=new CRISavailibityandfareenquiry(Driver);
	 //Enter train number
		CRISExcel gs=new CRISExcel();
		ArrayList<String> data=gs.getData("Trainavailibityfareinquiry-No class available");
		 //Enter train number
		dp.trainnumber().sendKeys(data.get(1));
		dp.trainnumberlist().click();
		
		//Enter from station
		dp.fromstation().sendKeys(data.get(2));
		dp.fromstationlist().click();
		// Enter to station
		
		dp.tostation().sendKeys(data.get(3));
		dp.tostationlist().click();
		Thread.sleep(1000);
		
		//select date of next day in calendar
	dp.calenderclick().click();
				
		dp.selectfirstactivedate().click();
		
		
		
		
		//enter class
		dp.classoftrain().sendKeys(data.get(4));
		dp.classlist().click();
		//enter quota
		
		dp.quota().sendKeys(data.get(5));
		dp.quotalist().click();
		
		
        dp.submit().click();
      
 
         SoftAssert softAssert = new SoftAssert();
         softAssert.assertEquals(dp.classnotexist().getText(), "Class does not exist in this train for this Train route!");
		
		dp.close().click();
	
		dp.trainnumber().clear();
        dp.fromstation().clear();
		dp.tostation().clear();
		
		dp.classoftrain().clear();
		dp.quota().clear();
		softAssert.assertAll();
	}
	

	//Case VAlid Details
	@Test(priority=5)
	public void CRISafvaliddetails() throws IOException
	{
		 test.assignCategory(CRIS);
		CRISavailibityandfareenquiry dp=new CRISavailibityandfareenquiry(Driver);
	 //Enter train number
		CRISExcel gs=new CRISExcel();
		ArrayList<String> data=gs.getData("Trainavailibityfareinquiry-Valid Data");
		 //Enter train number
		dp.trainnumber().sendKeys(data.get(1));
		dp.trainnumberlist().click();
		
		//Enter from station
		dp.fromstation().sendKeys(data.get(2));
		dp.fromstationlist().click();
		// Enter to station
		
		dp.tostation().sendKeys(data.get(3));
		dp.tostationlist().click();
		
	
		
		//enter class
		dp.classoftrain().sendKeys(data.get(4));
		dp.classlist().click();
		//enter quota
		
		dp.quota().sendKeys(data.get(5));
		dp.quotalist().click();
		
		dp.submit().click();
		
		//Assert to check data is displayed
		Assert.assertEquals(true, dp.openbox().isDisplayed(),"Not matched");
	}
	
	//verify availability list open
	@Test(dependsOnMethods= {"CRISafvaliddetails"})
	public void CRISticketsavail() throws IOException, InterruptedException
	{
		 test.assignCategory(CRIS);
		CRISavailibityandfareenquiry dp=new CRISavailibityandfareenquiry(Driver);
		JavascriptExecutor js = (JavascriptExecutor) Driver;
	    js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	    Thread.sleep(1000);
		dp.openbox().click();
	
		Assert.assertEquals(true, dp.openboxdetails().isDisplayed(),"Not matched");
	}
	
	
@Test(priority=6)
	
	public void CRISbacktoservicedirectory()
	{
	 test.assignCategory(CRIS);
	 ServiceDirectoryNavigation SN=new ServiceDirectoryNavigation(Driver);
	    SN.backtohome();
	}


}



