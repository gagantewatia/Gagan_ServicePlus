package UMANG.Cowintest;

import java.io.IOException;
import java.util.ArrayList;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import PageObjects.ServiceDirectoryNavigation;
import PageObjects.ServiceNavigation;
import PageObjects.SkillIndiaCandidateRegister;
import PageObjects.departmentnavigationpage;
import Resources.Base2;
import Utilis.SKillIndiaExcel;

public class SkillIndiaTrainingStatusTestCases extends Base2 
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
		public void SITrainingStatusServiceNavigation() throws IOException, InterruptedException
		{
			 test.assignCategory(SkillIndia);
			 System.out.println("Service Navigation");
			 ServiceNavigation dp=new ServiceNavigation(Driver);
				Thread.sleep(2000);
	 		 dp.SITrainingstatus().click();
	 		 test.log(Status.INFO,"Clicked on Training Status Service");

			 Thread.sleep(2000);
		
		/*try
		{
			 if(dp.SITrainingstatusinside().getText().equals("Training Status"))
			{
			 dp.SITrainingstatusinside().click();
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception " + e);
		}*/
		
			 test.log(Status.INFO,"Clicked on Training status menu option ");

			 Assert.assertEquals(dp.SItrainingloginpopup().getText(),"Login","Not matched");
			 Thread.sleep(2000);
			 
		}
		
	// Enter Login details which are invalid
		@Test(priority=4,dependsOnMethods= {"SITrainingStatusServiceNavigation"})
		
		public void SITrainingStatusinvalidLogindetails() throws IOException, InterruptedException
		{
		     test.assignCategory(SkillIndia);
		    SkillIndiaCandidateRegister dp=new SkillIndiaCandidateRegister (Driver);
		    SKillIndiaExcel gs=new SKillIndiaExcel();
		    ArrayList<String> data=gs.getData("TrainingRegister-Invalid User");
	 		 dp.username().sendKeys(data.get(1));
	 		 test.log(Status.INFO,"Entered wrong username");
	 		 dp.password().sendKeys(data.get(2));
	 		 test.log(Status.INFO,"Entered wrong password");
			 dp.login().click();
			 test.log(Status.INFO,"clicked on Login option ");
		     Thread.sleep(2000);
	
			 Assert.assertEquals(dp.invalidlogin().getText(),"Invalid UserName or Password!","Not matched");
			 Thread.sleep(1000);
			
			 dp.close().click();
			 Thread.sleep(1000);
			 //clear text
			 dp.username().clear();
			 dp.password().clear();
			 test.log(Status.INFO,"closed Invalid login popup");
			 Thread.sleep(2000);
			 
		}
		
		//enter details which are valid
	@Test(priority=5,dependsOnMethods= {"SITrainingStatusServiceNavigation"})
		
		public void SITrainingStatusvalidLogindetails() throws IOException, InterruptedException
		{
		 test.assignCategory(SkillIndia);
		    SkillIndiaCandidateRegister dp=new SkillIndiaCandidateRegister (Driver);
		    SKillIndiaExcel gs=new SKillIndiaExcel();
		    ArrayList<String> data=gs.getData("TrainingRegister-Valid User");
	 		 dp.username().sendKeys(data.get(1));
	 		 test.log(Status.INFO,"Entered valid username");
	 		 dp.password().sendKeys(data.get(2));
	 		 test.log(Status.INFO,"Entered valid password");
		      Thread.sleep(3000);
			 dp.login().click();
			 test.log(Status.INFO,"clicked on Login option ");
			 //if no user details found than close the popup
		
		      Thread.sleep(3000);
			 try {
				 if(dp.loginnoresultfound().getText().equals("No results found!"))
				 {
				
					 dp.close().click();
					 test.log(Status.INFO,"Clicked on close button if no data found");
				 }
					 
			 }
			 catch(Exception e)
			 {
				 System.out.println("No data" + e);
			 }
			 
			 Assert.assertEquals(dp.trainingstatuspage().getText(),"Training Status","Not matched");
			
			 
		}
		
		//logout details
	
	@Test(priority=6,dependsOnMethods= {"SITrainingStatusvalidLogindetails"})
	public void SITrainingStatuslogout() throws IOException, InterruptedException
	{
		 test.assignCategory(SkillIndia);
		SkillIndiaCandidateRegister dp=new SkillIndiaCandidateRegister (Driver);
		dp.logout().click();
		Thread.sleep(2000);
		test.log(Status.INFO, "Clicked on logout button");
		ServiceNavigation sn=new ServiceNavigation(Driver);
		
		Assert.assertEquals(sn.SIRegister().getText(), "Candidate Registration");
		
	}
	
	//back service directory
		@Test(priority=7)
		
		public void SIbacktoservicedirectory()
		{		
			test.assignCategory(SkillIndia);
		 ServiceDirectoryNavigation SN=new ServiceDirectoryNavigation(Driver);
		    SN.backtohome();
		}
		
}