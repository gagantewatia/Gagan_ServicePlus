package UMANG.Cowintest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import PageObjects.MergeDoseBen;
import PageObjects.MobileandOTPsubmit;
import PageObjects.ServiceDirectoryNavigation;
import PageObjects.ServiceNavigation;
import PageObjects.departmentnavigationpage;
import Resources.Base;
import Resources.Base2;
import Utilis.MergeDoseExcel;

public class Mergedose2 extends Base2 {
	
	
	//Service Directory Navigation
		@Test(priority=1)
	public void ServiceDirectoryDeptnavigation() throws IOException
		
		{
		
			ServiceDirectoryNavigation SD=new ServiceDirectoryNavigation(Driver);
			SD.Service().click();
			System.out.println("Service Directory Navigation done");
			test.assignCategory(COWIN);
				}
		
		// Department Navigation
		@Test(priority=2)
		
		public void departmentnavigation()
		{
			System.out.println("Department Navigation");
			departmentnavigationpage dp=new departmentnavigationpage(Driver);
			dp.deptcowin().click();
			System.out.println("Home page of Department Comes");
			test.assignCategory(COWIN);
		}
		
		//Registration page Navigation
		
		@Test (priority=3)
		public void Mergedose1()
		
		{
			
	    System.out.println("MergeDose");	
		ServiceNavigation SN=new ServiceNavigation(Driver);
	    SN.mergedose().click();
		test.assignCategory(COWIN);
		}
		
		
		@Test (priority=4, dataProvider="excelData", dataProviderClass=MergeDoseExcel.class)
		//Add beneficary
		public void addbeneficary(String Benname, String Benid, String Mobilenum) throws InterruptedException
		
		{
			 Driver.switchTo().frame(Driver.findElement(By.xpath("//iframe[@id='myIframe']")));
			JavascriptExecutor js = (JavascriptExecutor) Driver;
		    js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		    System.out.println("select beneficary");
		    MergeDoseBen MD=new MergeDoseBen(Driver);
		     MD.bennamenav().click();
		    List<WebElement> options = MD.bendropdown();
		    
		    
		    for(WebElement element : options)
		    {
		     if(element.getText().equalsIgnoreCase(Benname))
		     
		     {
		        element.click();	
		         break;
		     } 
		    }
		    Thread.sleep(4000);

		 	JavascriptExecutor js1 = (JavascriptExecutor) Driver;
		    js1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		    System.out.println("enter2nd dose details");
		    

		  //  MD.benfeciaryid().click();
		    Thread.sleep(4000);
		    MD.benfeciaryid().sendKeys(Benid);
		    Thread.sleep(4000);
		    MD.benfeciarynum().click();
		    Thread.sleep(4000);
		    MD.benfeciarynum().sendKeys(Mobilenum);
			test.assignCategory(COWIN);
		}
		 
  
		    //submit Details
		    @Test(priority=5)
		    public void submitdata() throws InterruptedException  
		    
		    {
		    	   MergeDoseBen MD1=new MergeDoseBen(Driver);
		    	   System.out.println("submit data");
		    	   MD1.submit().click();
		    	   Thread.sleep(1000);
		    	   MD1.close().click();
		    	   Thread.sleep(3000);
		   		test.assignCategory(COWIN);
		    }
			 
		    @AfterClass
			 public void closedriver()
			 {
		    	Driver.switchTo().defaultContent();
				Driver.findElement(By.xpath("//div[@class='back-to-home']")).click();
				test.assignCategory(COWIN);
			 }
          }
