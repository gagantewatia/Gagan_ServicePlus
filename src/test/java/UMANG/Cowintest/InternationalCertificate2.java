package UMANG.Cowintest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjects.InternationalCertificate1;
import PageObjects.MergeDoseBen;
import PageObjects.MobileandOTPsubmit;
import PageObjects.ServiceDirectoryNavigation;
import PageObjects.ServiceNavigation;
import PageObjects.departmentnavigationpage;
import Resources.Base;
import Resources.Base2;
import Utilis.Exceldataforaddbeneficiary;
import Utilis.InternationalCertExceldata;

public class InternationalCertificate2 extends Base2
{
	
		//Login in UMANG
	
	//Service Directory Navigation
		@Test(priority=2)
	public void ServiceDirectoryDeptnavigation() throws IOException
		
		{
		
			ServiceDirectoryNavigation SD=new ServiceDirectoryNavigation(Driver);
			SD.Service().click();
			System.out.println("Service Directory Navigation done");
			test.assignCategory(COWIN);
				}
		
		// Department Navigation
		@Test(priority=3)
		
		public void departmentnavigation()
		{
			System.out.println("Department Navigation");
			departmentnavigationpage dp=new departmentnavigationpage(Driver);
			dp.deptcowin().click();
			System.out.println("Home page of Department Comes");
			test.assignCategory(COWIN);
		}
		
		//InternationalCertificate page Navigation
		
		@Test (priority=4)
		public void intercertpage()
		
		{
			
	    System.out.println("International Certificate Page");	
		ServiceNavigation SN=new ServiceNavigation(Driver);
	    SN.intercert().click();
		test.assignCategory(COWIN);
	 
		}
	

		
		@SuppressWarnings("unused")
		@Test (priority=6,dataProvider ="excelData", dataProviderClass=InternationalCertExceldata.class)
		// Select beneficiary details
		
		public  void addben(String benname, String dob, String passport) throws InterruptedException
		
		{
			 Driver.switchTo().frame(Driver.findElement(By.xpath("//iframe[@id='myIframe']")));
			  System.out.println("select beneficary");
			   InternationalCertificate1 MD=new InternationalCertificate1(Driver);
			   Thread.sleep(1000);
			     MD.bennamenav().click();
			    List<WebElement> options = MD.bendropdown();
			    
			    
			    for(WebElement element : options)
			    {
			     if(element.getText().equalsIgnoreCase(benname))
			     
			     {
			        element.click();	
			         break;
			     } 
			    }
			    
			    JavascriptExecutor js = (JavascriptExecutor) Driver;
			    js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			    
			
			    System.out.println("select date");
			   MD.calenderclick().click();
			       

String dateArray[]= dob.split("-");
			    String date,month;
				String year;
			  year=dateArray[0];
			    month=dateArray[1];
			 date=dateArray[2];
			    Thread.sleep(1000);
			
  MD.yearmonth().click();
		//	   MD.previous20year().click();
	
	 
//	  WebElement options1 = MD.yearmonth();
	//  String x=options1.getText();
	      
	
		           

		  List<WebElement> options1 = Driver.findElements(By.xpath("//table[@class='mat-calendar-table']//td"));
	                for(WebElement element2 : options1)
				        {
				           if(element2.getText().equalsIgnoreCase("1988"))
				            {   
				    	     element2.click();
				    	      break;
				              }
				        }
				
	 
			      
			      //for month
			      List<WebElement> options2 = MD.yearmonthsel();
			      for(WebElement element1 : options2)
				        {
				    	
				           if(element1.getText().equalsIgnoreCase(month))
				          {   
				    	 element1.click();
				    	    break;
				         }
			            }
		       
			      
				    	 List<WebElement> options3 = MD.yearmonthsel();
					      for(WebElement element3 : options3)
					      {
					    	  if(element3.getText().equals(date))
								     
							     {   
					    		  	 
							    	 element3.click();
				                      break;
				                  }
				             }
					      
		     MD.passportdetails().sendKeys(passport);
		     
				test.assignCategory(COWIN);   
		}
		
//update details 
		@Test (priority=7)
		public void updatdetails() throws InterruptedException
		{
			  InternationalCertificate1 MD=new InternationalCertificate1(Driver);
		     MD.checkbox().click();
		     MD.update().click();
		     Thread.sleep(1000);
				test.assignCategory(COWIN);
		     
		}
		
		@Test (priority=8)
		public void downloaddetails() throws InterruptedException
		{
			  InternationalCertificate1 MD=new InternationalCertificate1(Driver);
				MD.download().click();
				Thread.sleep(2000);
		     
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

	
		
	   
		        
			     

			    
		
			    
			    
    
