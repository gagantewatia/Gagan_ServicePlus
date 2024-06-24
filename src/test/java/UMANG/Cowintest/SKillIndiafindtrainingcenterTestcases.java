package UMANG.Cowintest;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.ServiceDirectoryNavigation;
import PageObjects.ServiceNavigation;
import PageObjects.SkillIndiaFindatrainingcenter;
import PageObjects.departmentnavigationpage;
import Resources.Base2;
import Utilis.GSTNExcel;
import Utilis.SKillIndiaExcel;

public class SKillIndiafindtrainingcenterTestcases extends Base2
{

	//go to all services
		@Test(priority=1)
		public void allservicesnavigation() throws IOException, InterruptedException

		{
			 test.assignCategory(SkillIndia);
			departmentnavigationpage SD=new departmentnavigationpage(Driver);
			SD.allservicesredirect();
			
		}

	//go to department page	
		
		@Test(priority=2)
		public void SIdepartmentnavigation() throws IOException, InterruptedException

		{
			 test.assignCategory(SkillIndia);
			 departmentnavigationpage SD=new departmentnavigationpage(Driver);
			 String Servicename="Skill India";
		 	 SD.servicenavigationclick(Servicename);
		 	Assert.assertEquals(SD.SkillIndiatitleTitle().getText(),"Skill India","Not matched");
		}
		
		


	//ServiceNavigation
	@Test(priority=3)
	public void SITrainingCenterServiceNavigation() throws IOException, InterruptedException
	{
		 test.assignCategory(SkillIndia);
		System.out.println("Service Navigation");
		ServiceNavigation dp=new ServiceNavigation(Driver);
		Thread.sleep(2000);
 		dp.SIfindingtrainingcenter().click();
	
		 Thread.sleep(2000);
    	/*try {
		 if(dp.SIfindingtrainingcenterinside().getText().equals("Find a Training Centre"))
		 {
		  dp.SIfindingtrainingcenterinside().click();
		 }
	     }
	catch(Exception e)
	{
		System.out.println("Exception " + e);
	}
    	
		 Thread.sleep(2000);*/
		 Assert.assertEquals(dp.SIfindingtrainingcentertitle().getText(),"Find a Training Centre","Not matched");

		 Thread.sleep(2000);
		 
	}


	//Case: Verify details of service Center
	@Test(priority=4)
	public void SITrainingCenter() throws IOException, InterruptedException
	{
		 test.assignCategory(SkillIndia);
		System.out.println("Training Center Details");
		SkillIndiaFindatrainingcenter dp=new SkillIndiaFindatrainingcenter(Driver);
 		dp.trainingdetail().click();
 	
 		Assert.assertEquals(dp.trgcenterdetails().getText(),"Training Centre Details","Not Matched");
 		Thread.sleep(2000);
     	Driver.navigate().back();
       	Thread.sleep(1000);
		ServiceNavigation sp=new ServiceNavigation(Driver);
        Driver.switchTo().frame(sp.switchframe());
     	Thread.sleep(1000);
     	
		
	}
	
	//Case: Verify search is working fine
	
	@Test(priority=5)
	public void SITrainingseacrh() throws IOException, InterruptedException
	{
		 test.assignCategory(SkillIndia);
		System.out.println("Training Search");
		SkillIndiaFindatrainingcenter dp=new SkillIndiaFindatrainingcenter(Driver);
 		dp.searchimage().click();

 	    SKillIndiaExcel gs=new SKillIndiaExcel();
		
		ArrayList<String> data=gs.getData("TrainingCenter-Search");

		dp.search().sendKeys(data.get(1));


 		Assert.assertEquals(dp.trgsearchmatched().getText(),"Matches found","Not Matched");
 		dp.search().clear();
 		Thread.sleep(2000);
	}	
/*
	//Case: Verify filter is working fine in case no data 
	@Test(priority=6)
	public void SIfilternodata() throws IOException, InterruptedException
	{
		
		 test.assignCategory(SkillIndia);
		 
		    JavascriptExecutor js1 = (JavascriptExecutor) Driver;
		    js1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		    
		System.out.println("Training filter");
		SkillIndiaFindatrainingcenter dp=new SkillIndiaFindatrainingcenter(Driver);
 		dp.filterimage().click();



	//select filter drop down
		dp.state().click();
 		Thread.sleep(3000);
 	    SKillIndiaExcel gs=new SKillIndiaExcel();
		ArrayList<String> data=gs.getData("TrainingCenter-Filter with no data found");

		dp.searchenterfilter().sendKeys(data.get(1));
        dp.state().sendKeys(Keys.ENTER);
		

		 dp.district().click();
		 Thread.sleep(2000);
		 dp.searchenterfilter().sendKeys(data.get(2));
		 dp.district().sendKeys(Keys.ENTER);
		

	 	   dp.sector1().click();
	 	  Thread.sleep(2000);
	 	  dp.searchenterfilter().sendKeys(data.get(3));
		  dp.sector1().sendKeys(Keys.ENTER);
		
		     
	    dp.jobrole().click();
	    Thread.sleep(2000);
	    dp.searchenterfilter().sendKeys(data.get(4));
		dp.jobrole().sendKeys(Keys.ENTER);
	
		//apply
		
	dp.applyfilter().click();
	
	Thread.sleep(1000);

	Assert.assertEquals(dp.norecordfilter().getText(),"No results found!","No matched");

	dp.close().click();
	Thread.sleep(3000);
	
	}	
	
//Verify filter working fine in case of data
	
	@Test(priority=7)
	public void SIfilterdataavailable() throws IOException, InterruptedException
	{
	   	 test.assignCategory(SkillIndia);
		 JavascriptExecutor js1 = (JavascriptExecutor) Driver;
		    js1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println("Training filter");
		SkillIndiaFindatrainingcenter dp=new SkillIndiaFindatrainingcenter(Driver);
 		dp.filterimage().click();
 		Thread.sleep(3000);
 	  
		
	//select filter drop down
		dp.state().click();
		  SKillIndiaExcel gs=new SKillIndiaExcel();
			
		ArrayList<String> data=gs.getData("TrainingCenter-Filter with valid data");
		dp.searchenterfilter().sendKeys(data.get(1));
        dp.state().sendKeys(Keys.ENTER);
        
    	dp.applyfilter().click();
    	
    	Thread.sleep(1000);
 
    	Assert.assertEquals(dp.resultfound().getText(),"Results found","No matched");
    	Thread.sleep(3000);
	}
*/	
	
	//back service directory
	@Test(priority=8)
	
	public void SIbacktoservicedirectory()
	{	 
		test.assignCategory(SkillIndia);
		 ServiceDirectoryNavigation SN=new ServiceDirectoryNavigation(Driver);
		    SN.backtohome();
	}
	
	
	
	
	
}
