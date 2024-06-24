package UMANG.Cowintest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.ServiceDirectoryNavigation;
import PageObjects.ServiceNavigation;
import PageObjects.departmentnavigationpage;
import PageObjects.CRIStrainschedule;
import Resources.Base2;
import Utilis.CRISExcel;
import Utilis.GSTNExcel;

public class CRISTrainScheduleTestcases extends Base2
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
	public void crisServiceNavigation() throws IOException
	{
		 test.assignCategory(CRIS);

		System.out.println("Service Navigation");
		ServiceNavigation dp=new ServiceNavigation(Driver);
 		dp.CRIStrainschedule().click();
		
		 Assert.assertEquals(dp.CRIStrainscheduletitle().getText(),"Train Schedule","Not matched");
	}
	

	//select and submit the train
	@Test(priority=4)
	public void CRIStrainschedule() throws IOException, InterruptedException
	
	{
		 test.assignCategory(CRIS);
		System.out.println("select train");
        CRIStrainschedule TS=new CRIStrainschedule(Driver);
		TS.traindropdown().click();

		CRISExcel gs=new CRISExcel();
		ArrayList<String> data=gs.getData("Trainschedule-Select train");
	
		TS.traininputdata().sendKeys(data.get(1));
		TS.traininputdata().sendKeys(Keys.ENTER);
		TS.trainsubmit().click();
		

		Assert.assertEquals(TS.trainvalidatecheck().getText(),"Day","Not matched");	
	}
	
	//search
	@Test(dependsOnMethods= {"CRIStrainschedule"})
	public void search() throws IOException, InterruptedException
	
	{
		 test.assignCategory(CRIS);
		System.out.println("search");
	    CRIStrainschedule TS=new CRIStrainschedule(Driver);
	    CRISExcel gs=new CRISExcel();
		ArrayList<String> data=gs.getData("Trainschedule-Search");
		TS.serach().sendKeys(data.get(1));
	

		Assert.assertEquals(TS.trainvalidatecheck().getText(),"Day","Not matched");	

	}
	
	//back to service directory
			@Test(priority=5)
			
			public void CRISbacktoservicedirectory()
			{

				 test.assignCategory(CRIS);
				 ServiceDirectoryNavigation SN=new ServiceDirectoryNavigation(Driver);
				    SN.backtohome();
			}
}	
	
	
	
