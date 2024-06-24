package UMANG.Cowintest;

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjects.CRISTrainbetweenstations;
import PageObjects.CRIStrainschedule;
import PageObjects.ServiceDirectoryNavigation;
import PageObjects.ServiceNavigation;
import PageObjects.departmentnavigationpage;
import Resources.Base2;
import Utilis.CRISExcel;

public class CRISTrainbetweenStationsTestCases extends Base2
{

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
	public void CRISServiceNavigation() throws IOException, InterruptedException
	{

		 test.assignCategory(CRIS);
		ServiceNavigation dp=new ServiceNavigation(Driver);
 		dp.CRIStrainbteweenstation().click();
		 Thread.sleep(2000);
		 Assert.assertEquals(dp.CRIStrainbetweenstationtitle().getText(),"Train Between Stations","Not matched");
		 Thread.sleep(2000);
	}
	
	//Case 4: if train is not available for route than correct message should come
	
	@Test(priority=4)
	public void CRISumbitdetailsnoroute() throws IOException, InterruptedException
	{
		System.out.println("select stations with no route ");
		CRISTrainbetweenstations CS=new CRISTrainbetweenstations(Driver);
		CRISExcel gs=new CRISExcel();
		ArrayList<String> data=gs.getData("Trainbetweenstations-select stations for no route available");
		
	//Select from station

		CS.fromstation().sendKeys(data.get(1));
		CS.fromstationlist().click();
		
	//select to station
	
		CS.tostation().sendKeys(data.get(2));
		CS.tostationlist().click();
		
		CS.submit().click();
		Thread.sleep(1000);
		 test.assignCategory(CRIS);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(CS.noroutetext().getText(),"No direct trains available between the inputted stations. Would you like to search the in!", "Not matched");

		CS.closenoroute().click();
		// clear details
		CS.crossfromstation().click();
		CS.crossfromstation().click();
		softAssert.assertAll();
   }
	
	//Case: select details and submit if train is available
	@Test(priority=5)
	public void CRISumbitdetailsvalid() throws IOException
	{
		System.out.println("select stations");
		CRISTrainbetweenstations CS=new CRISTrainbetweenstations(Driver);
		CRISExcel gs=new CRISExcel();
		ArrayList<String> data=gs.getData("Trainbetweenstations-select stations");
		
	//Select from station

		CS.fromstation().sendKeys(data.get(1));
		CS.fromstationlist().click();
		
	//select to station
	
		CS.tostation().sendKeys(data.get(2));
		CS.tostationlist().click();
		
		CS.submit().click();
		
	// Assert to check valid data is coming
		
		 test.assignCategory(CRIS);

		Assert.assertEquals(CS.distance().getText(),"Distance:", "Not matched");
   }
	
	//Case: verify search is working if data is present
	@Test(dependsOnMethods= {"CRISumbitdetailsvalid"})
	
	public void CRISearch() throws IOException
	{
		CRISTrainbetweenstations CS=new CRISTrainbetweenstations(Driver);
		CRISExcel gs=new CRISExcel();
		ArrayList<String> data=gs.getData("Trainbetweenstations-Search");
		CS.searchtype().sendKeys(data.get(1));
		Assert.assertEquals(CS.searchcount1().getText(),"Record count : 1","Not matched" );
	}
	
	//Case : Verify navigate to train schedule is successful 
	@Test(dependsOnMethods= {"CRISumbitdetailsvalid"})
	public void CRISnavigatetoschedule() throws InterruptedException
	{
		CRISTrainbetweenstations CS=new CRISTrainbetweenstations(Driver);
	   CS.trainnavigateimage().click();
	   CRIStrainschedule TS=new CRIStrainschedule(Driver);
	   test.assignCategory(CRIS);

	  SoftAssert softAssert = new SoftAssert();
	softAssert.assertEquals(TS.trainvalidatecheck().getText(), "Day", "Not matched");	
	  //Navigate back to train between two stations 
	   Thread.sleep(1000);
	   Driver.navigate().back();
	   Thread.sleep(1000);
      softAssert.assertAll();
	}
	
	
	//back to service directory
	@Test(priority=6)
	
	public void Cbacktoservicedirectory()
	{
		 ServiceDirectoryNavigation SN=new ServiceDirectoryNavigation(Driver);
		    SN.backtohome();
	}
}
