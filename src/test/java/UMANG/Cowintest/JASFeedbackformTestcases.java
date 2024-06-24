

package UMANG.Cowintest;

import java.io.IOException;
import java.util.ArrayList;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.JASFeedback;
import PageObjects.ServiceDirectoryNavigation;
import PageObjects.ServiceNavigation;
import PageObjects.departmentnavigationpage;
import Resources.Base2;
import Utilis.JASExcel;


public class JASFeedbackformTestcases extends Base2
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
		public void JASFeedbackformServiceNavigation() throws IOException, InterruptedException
		{
			 test.assignCategory(JanAushaidhiSugam);
			System.out.println("Service Navigation");
			ServiceNavigation dp=new ServiceNavigation(Driver);
	 		dp.JASfeedback().click();
	
			 Thread.sleep(1000);
	
			 Assert.assertEquals(dp.JASFeedbacktitle().getText(),"Feedback","Not matched");
			 Thread.sleep(2000);
		}
 ////// Report bug
	
  //Navigate to report bug 
		@Test(priority=4)
		
		public void JASreportbugpage() throws InterruptedException
		
		{
			 test.assignCategory(JanAushaidhiSugam);
			System.out.println("Navigate to reportbug");
			JASFeedback js=new JASFeedback(Driver);
	
			js.reportbug().click();
	
			Thread.sleep(2000);
			JavascriptExecutor js11 = (JavascriptExecutor) Driver;
		    js11.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
			
		}
		
		//click on Add button to navigate to fill form of bug
	@Test(dependsOnMethods= {"JASreportbugpage"})
		
		public void JASaddbuttonforreportbug() throws InterruptedException
		
		{
		 test.assignCategory(JanAushaidhiSugam);
			System.out.println("click on add bug");
			JASFeedback js=new JASFeedback(Driver);
			
	
			try
			{
			if(js.moreadd().isDisplayed()==true) 
			{
				JavascriptExecutor executor = (JavascriptExecutor)Driver;
				executor.executeScript("arguments[0].click();",js.moreadd());
		}
		  }
       catch(Exception e)
			{
			System.out.println("Issue " + e);
				
			}
		

			try
			{if(js.addbtn().isDisplayed()==true)
			{
				JavascriptExecutor executor = (JavascriptExecutor)Driver;
				executor.executeScript("arguments[0].click();",js.addbtn());
			}
			}
			catch(Exception e)
			{
				System.out.println("Issue " +e);
			
	
			}
			
		//if + button is present	
			
			Thread.sleep(1000);
			Assert.assertEquals(js.reportbugtitle().getText(),"Report Bug", "Not matched");
			Thread.sleep(2000);
			
			
		}
		
		
		//Case : report bug and return to feedback page
		@Test(dependsOnMethods= {"JASaddbuttonforreportbug"})
		
		 public void JASreportbug() throws IOException, InterruptedException
		 
		 {
			 test.assignCategory(JanAushaidhiSugam);
		    
	        JASExcel gs=new JASExcel();
	        
	    	ArrayList<String> data=gs.getData("Feedback- Report bug");
	    	
	    	//fill form data
	  	
	    	JavascriptExecutor js1 = (JavascriptExecutor) Driver;
	    	
		    js1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		    
			JASFeedback js=new JASFeedback(Driver);
	    	
			js.firstname().sendKeys(data.get(1));
			
			js.lastname().sendKeys(data.get(2));
			
			js.state().sendKeys(data.get(3));
			
			js.categorybug().sendKeys(data.get(4));
			
			js.message().sendKeys(data.get(5));
			
			js.submit().click();
		   
			Thread.sleep(1000);
	
			
			Thread.sleep(500);
			Driver.navigate().back();
			Thread.sleep(500);
			Driver.navigate().back();
			Thread.sleep(500);
		    Driver.navigate().back();
			Thread.sleep(1000);
			ServiceNavigation dp=new ServiceNavigation(Driver);
	 	
		 Driver.switchTo().frame(dp.switchframe());

		 Assert.assertEquals(dp.JASFeedbacktitle().getText(),"Feedback","Not matched");
		 Thread.sleep(2000);
		 }
		
	
		
		////////// Feedback form
		 //Navigate to feedback page
		@Test(priority=5)
		
		public void JASfeedbackpage() throws InterruptedException
		
		{
			 test.assignCategory(JanAushaidhiSugam);
			System.out.println("Navigate to feedback");
			JASFeedback js=new JASFeedback(Driver);
	
			
		js.feedback().click();
	
			Thread.sleep(2000);
			JavascriptExecutor js11 = (JavascriptExecutor) Driver;
		    js11.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	
		   		
		}
		
		

		//click on Add button to navigate to fill form of bug
	@Test(dependsOnMethods= {"JASfeedbackpage"})
		
		public void JASaddbuttonforfeedback() throws InterruptedException
		
		{
		 test.assignCategory(JanAushaidhiSugam);
			System.out.println("click on add feedback");
			JASFeedback js=new JASFeedback(Driver);
			
	
			
			//if + button is present	
			
			try
			{
			if(js.moreadd().isDisplayed()==true) 
			{
				JavascriptExecutor executor = (JavascriptExecutor)Driver;
				executor.executeScript("arguments[0].click();",js.moreadd());
		}
		  }
     catch(Exception e)
			{
			System.out.println("Issue " + e);
				
			}
		
			

			try
			{if(js.addbtn().isDisplayed()==true)
			{
				JavascriptExecutor executor = (JavascriptExecutor)Driver;
				executor.executeScript("arguments[0].click();",js.addbtn());
			}
			}
			catch(Exception e)
			{
				System.out.println("Issue " +e);
			
	
			}


			Thread.sleep(1000);
			Assert.assertEquals(js.feedbackpagetitle().getText(),"Feedback", "Not matched");
			Thread.sleep(2000);
			
			
		}
		
		
	//Case : report feedback and return to main feedback page
	@Test(dependsOnMethods= {"JASaddbuttonforfeedback"})
	
	 public void JASaddfedbackform() throws IOException, InterruptedException
	 
	 {
		 test.assignCategory(JanAushaidhiSugam);
	    
        JASExcel gs=new JASExcel();
        
    	ArrayList<String> data=gs.getData("Feedback- Feedback");
    	
    	//fill form data
  	
    	JavascriptExecutor js1 = (JavascriptExecutor) Driver;
    	
	    js1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	    
		JASFeedback js=new JASFeedback(Driver);
    	
		js.firstname().sendKeys(data.get(1));
		
		js.lastname().sendKeys(data.get(2));
		
		js.state().sendKeys(data.get(3));
		Thread.sleep(2500);
		
		js.categorybugclick().click();
		Thread.sleep(3000);
		js.categorybuglist().sendKeys(data.get(4));
	    js.categorybuglist().sendKeys(Keys.ENTER);
	

	    Thread.sleep(3000);
	    
		js.message().sendKeys(data.get(5));
		
		js.submit().click();
	   
		Thread.sleep(1000);
		Thread.sleep(500);
		Driver.navigate().back();
		Thread.sleep(500);
		Driver.navigate().back();
		Thread.sleep(500);
	    Driver.navigate().back();
		Thread.sleep(1000);
		ServiceNavigation dp=new ServiceNavigation(Driver);
	 	
		 Driver.switchTo().frame(dp.switchframe());
		
		 Assert.assertEquals(dp.JASFeedbacktitle().getText(),"Feedback","Not matched");
		 Thread.sleep(2000);
	 }
	
//////////suggestions form
	 //Navigate to feedback page
	@Test(priority=6)
	
	public void JASsuggestionpage() throws InterruptedException
	
	{

		 test.assignCategory(JanAushaidhiSugam);
		JASFeedback js=new JASFeedback(Driver);

		
	js.suggestion().click();

		Thread.sleep(2000);
		JavascriptExecutor js11 = (JavascriptExecutor) Driver;
	    js11.executeScript("window.scrollBy(0,document.body.scrollHeight)");

	}
	
	

	//click on Add button to navigate to fill form of bug
@Test(dependsOnMethods= {"JASsuggestionpage"})
	
	public void JASaddbuttonforsuggestion() throws InterruptedException
	
	{
		

	 test.assignCategory(JanAushaidhiSugam);
		JASFeedback js=new JASFeedback(Driver);
		

		
		
		//if + button is present
		try
		{
		if(js.moreadd().isDisplayed()==true) 
		{
			JavascriptExecutor executor = (JavascriptExecutor)Driver;
			executor.executeScript("arguments[0].click();",js.moreadd());
     	}
	  }
   catch(Exception e)
		{
		System.out.println("Issue " + e);
			
		}

	//	if add button is present
		try
		{if(js.addbtn().isDisplayed()==true)
		{
			JavascriptExecutor executor = (JavascriptExecutor)Driver;
			executor.executeScript("arguments[0].click();",js.addbtn());
		}
		}
		catch(Exception e)
		{
			System.out.println("Issue " +e);
		

		}
		
		Thread.sleep(1000);
		Assert.assertEquals(js.suggestionpagetitle().getText(),"Suggestion", "Not matched");
		Thread.sleep(2000);
		
		
	}
	
	
//Case : report suggestion
@Test(dependsOnMethods= {"JASaddbuttonforsuggestion"})

public void JASsuggestionform() throws IOException, InterruptedException

{
	 test.assignCategory(JanAushaidhiSugam);
 
 JASExcel gs=new JASExcel();
 
	ArrayList<String> data=gs.getData("Feedback-Suggestion");
	
	//fill form data

	JavascriptExecutor js1 = (JavascriptExecutor) Driver;
	
    js1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
 
	JASFeedback js=new JASFeedback(Driver);
	
	js.firstname().sendKeys(data.get(1));
	
	js.lastname().sendKeys(data.get(2));
	
	js.state().sendKeys(data.get(3));
	Thread.sleep(2000);

	js.categorybugclick().click();
	Thread.sleep(3000);
	js.categorybuglist().sendKeys(data.get(4));
    js.categorybuglist().sendKeys(Keys.ENTER);
	
     Thread.sleep(3000);
	
     js.message().sendKeys(data.get(5));
	
	js.submit().click();

	Thread.sleep(1000);
	
	Thread.sleep(500);
	Driver.navigate().back();
	Thread.sleep(500);
	Driver.navigate().back();
	Thread.sleep(500);
    Driver.navigate().back();
	Thread.sleep(1000);
	
	ServiceNavigation dp=new ServiceNavigation(Driver);
	
	 Driver.switchTo().frame(dp.switchframe());
	 Assert.assertEquals(dp.JASFeedbacktitle().getText(),"Feedback","Not matched");
	 Thread.sleep(2000);
}


	
@Test(priority=7)

			public void JASbacktoservicedirectory()
			{
	          test.assignCategory(JanAushaidhiSugam);
	     	 ServiceDirectoryNavigation SN=new ServiceDirectoryNavigation(Driver);
			    SN.backtohome();
			}
		
	
		
		
		
		
		
	}

