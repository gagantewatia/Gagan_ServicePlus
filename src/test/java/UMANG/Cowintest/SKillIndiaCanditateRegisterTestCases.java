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
import PageObjects.SkillIndiaCandidateRegister;
import PageObjects.departmentnavigationpage;
import Resources.Base2;
import Utilis.SKillIndiaExcel;

public class SKillIndiaCanditateRegisterTestCases extends Base2
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
	public void SICandidateRegisterNavigation() throws IOException, InterruptedException
	{
		 test.assignCategory(SkillIndia);
		System.out.println("Service Navigation");
		ServiceNavigation dp=new ServiceNavigation(Driver);
		 Thread.sleep(2000);
 		 dp.SIRegister().click();
 		 Thread.sleep(2000);
		/* try
		 {
		 if(dp.SIRegisterinside().getText().equals("Candidate Registration"))
		 {
		 dp.SIRegisterinside().click();
		 }
		 }
		 catch(Exception e)
		 {
			 System.out.println("Exception " + e);
		 }
		 Thread.sleep(1000);*/
		 Assert.assertEquals(dp.SIRegsitertitle().getText(),"Candidate Registration","Not matched");
	}

	//Case : fill basic details and click next
	
	@Test(priority=4)

		public void SIRegisterBasicDetails() throws IOException, InterruptedException
		{
		 test.assignCategory(SkillIndia);
		System.out.println("Enter Basic Details");	
		SkillIndiaCandidateRegister reg=new SkillIndiaCandidateRegister(Driver);
		//Select Salutation
		SKillIndiaExcel gs=new SKillIndiaExcel();
		ArrayList<String> data=gs.getData("TrainingRegister-Basic details");
		reg.salutation().sendKeys(data.get(1));
		reg.name().sendKeys(data.get(2));
		reg.guardianname().sendKeys(data.get(3));
	
		//date
		
	     ((JavascriptExecutor) Driver).executeScript("arguments[0].removeAttribute('readonly')", reg.calender());// Enables the date box
		
	     reg.calender().sendKeys(data.get(4));
		Thread.sleep(3000);
		
		reg.gender().sendKeys(data.get(5));
		reg.email().sendKeys(data.get(6));
		Thread.sleep(1000);
		reg.mobileno().clear();
		Thread.sleep(2000);
		reg.mobileno().sendKeys(data.get(7));
		reg.education().sendKeys(data.get(8));
		Thread.sleep(3000);
		
		//click next
		reg.nextbutton().click();
		
		 Assert.assertEquals(reg.location().getText(),"Location Details", "Not macthed");		
		 Thread.sleep(2000);
		}
	
	//Enter other details on second page
	@Test(dependsOnMethods= {"SIRegisterBasicDetails"})
	public void SIRegisterotherDetails() throws IOException, InterruptedException
		
	{
	 	 test.assignCategory(SkillIndia);
		System.out.println("Enter Other Details");	
		SkillIndiaCandidateRegister reg=new SkillIndiaCandidateRegister(Driver);
		SKillIndiaExcel gs=new SKillIndiaExcel();
		ArrayList<String> data=gs.getData("TrainingRegister-Other Details");
		
		reg.pincode().sendKeys(data.get(1));
	    Thread.sleep(2000);
       
        reg.state().click();
        Thread.sleep(2000);
        reg.searchenterpath().sendKeys(data.get(2));
        reg.searchenterpath().sendKeys(Keys.ENTER);
        
        
        Thread.sleep(2000);
        //district
         reg.district().click();
         Thread.sleep(2000);
	   reg.searchenterpath().sendKeys(data.get(3));

        reg.searchenterpath().sendKeys(Keys.ENTER);
        
        
        Thread.sleep(2000);
        //sector
        reg.sector().click();
        Thread.sleep(2000);
	     reg.searchenterpath().sendKeys(data.get(4));
        reg.searchenterpath().sendKeys(Keys.ENTER);
        
        //interested in using for loop
         reg.interestedin().click();


   	    List<WebElement> options = reg.interestedoption();
   	    for(WebElement element : options)
   	    {
   	     if(element.getText().equalsIgnoreCase(data.get(5)))
   	     
   	     {
   	    
   	        element.click();	
   	      	
   	 
   	         break;
   	     } 
   	    }
  
   	    Assert.assertEquals(reg.Preview().isEnabled(),true,"Not macthed");
	}
	
//to check preview and cancel

@Test(dependsOnMethods= {"SIRegisterotherDetails"})
public void PreviewRegisterotherDetails() throws IOException, InterruptedException

{
	 test.assignCategory(SkillIndia);
	System.out.println("check Preview");	
	SkillIndiaCandidateRegister reg=new SkillIndiaCandidateRegister(Driver);
	reg.Preview().click();
	Thread.sleep(2000);

	Assert.assertEquals(reg.Previewpage().getText(),"Preview","Not matched");
	//click cancel to go back
	reg.Previewcancel().click();
	Thread.sleep(3000);
	
	
}

//submit details
@Test(dependsOnMethods= {"PreviewRegisterotherDetails"})
public void SubmitRegisterotherDetails() throws IOException, InterruptedException

{
	 test.assignCategory(SkillIndia);
	System.out.println("Submit Register Details");	
	SkillIndiaCandidateRegister reg=new SkillIndiaCandidateRegister(Driver);
	reg.submit().click();	
	Thread.sleep(3000);

	//if user is already present
	try {
		
	if(reg.userexists()>0||reg.candidateregistered()>0)
		{
			System.out.println("Submit Register Details1");	
			reg.close().click();
			Assert.assertTrue(true);
			
		}
	}
	catch(Exception e)
	{
		System.out.println("User Exists" + e);
	}
	
	//if new user created
      try {
		
		if(reg.registersucessfull().getText().equals("Credentials will be shared via SMS & Email"))
		 {
			reg.Home().click();
			Assert.assertTrue(true);
			
		 }
	   }
	catch(Exception e)
	   {
		System.out.println("User Register" + e);
	   }
		
      Thread.sleep(2000);
      //if any other alert come than show it as false
      if(reg.closed()>0)
      {
    	  
    		Assert.assertTrue(false);
    	  
      }
			
	}

//navigate to service directory	

	
@Test(priority=5)

public void SKillIndiabacktoservicedirectory()
{
	 test.assignCategory(SkillIndia);
	 ServiceDirectoryNavigation SN=new ServiceDirectoryNavigation(Driver);
	    SN.backtohome();
}






}
