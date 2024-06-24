package UMANG.Cowintest;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import PageObjects.MobileandOTPsubmit;
import PageObjects.ServiceDirectoryNavigation;
import PageObjects.ServiceNavigation;
import PageObjects.departmentnavigationpage;

import Resources.Base2;
import Utilis.Exceldataforascheduleappointmnets;
import Utilis.passportexcel;

public class Addpassportdetails2 extends Base2

{

	//Login in UMANG

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
		
		public void departmentnavigation() throws IOException
		{
		
			System.out.println("Department Navigation");
			departmentnavigationpage dp=new departmentnavigationpage(Driver);
			dp.deptcowin().click();
			System.out.println("Home page of Department Comes");
			test.assignCategory(COWIN);
		}
		
		//Add passport details page Navigation
		
		@Test (priority=3)
		public void passportdetails() throws InterruptedException
		
		{
			
	    System.out.println("aDD passport details page");	
		ServiceNavigation SN=new ServiceNavigation(Driver);
	    SN.addpassportdetails().click();
	   Thread.sleep(3000);
		test.assignCategory(COWIN);
		}
		

		
		//select beneficiary and details
		@Test(priority=4,dataProvider="excelData",dataProviderClass=passportexcel.class)
         public void Adduserandpasportdetails(String Benname,String Benpassport) throws InterruptedException
         {
			 Driver.switchTo().frame(Driver.findElement(By.xpath("//iframe[@id='myIframe']")));
			JavascriptExecutor js = (JavascriptExecutor) Driver;
		    js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		    System.out.println("select beneficary");
		    Thread.sleep(2000);
		    Driver.findElement(By.xpath("//div[@class='ng-input']")).click();
		    WebDriverWait wait1=new WebDriverWait(Driver,Duration.ofSeconds(30));
			wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='ng-option-label ng-star-inserted']")));
		    List<WebElement> options = Driver.findElements(By.xpath("//span[@class='ng-option-label ng-star-inserted']"));
		    
		    for(WebElement element : options)
		    {
		     if(element.getText().equalsIgnoreCase(Benname))
		     
		     {
		        element.click();	
		     
		     }
		    } 
		     
		    System.out.println("select passportnumber");
		    Thread.sleep(1000);
	    WebElement x=  Driver.findElement(By.xpath("/html/body/app-root/app-app-root/app-app-tile-view-container/div[2]/div/div[2]/app-add-passport/form/div[1]/div[2]/mat-form-field/div/div[1]/div/input"));
	    x.click();
	    x.sendKeys(Benpassport);
	    Thread.sleep(2000);
	    System.out.println("Select T&C");
	    Thread.sleep(2000);
		test.assignCategory(COWIN);
         }
		
		//submit details 
		@Test(priority=5)
		public void submitdetails() throws InterruptedException
		{
			//Select T&C
	    Driver.findElement(By.xpath("//div[@class='mat-checkbox-inner-container']")).click();
	    //submit
	    Driver.findElement(By.cssSelector("button[type='submit']")).click();
	    
	     Thread.sleep(2000);	
	    //close
	    Driver.findElement(By.xpath("//button[@class='btn btn-default-lg mat-button mat-button-base']")).click();
	    
		     Thread.sleep(3000);	
		 	test.assignCategory(COWIN);
         }
		
		@AfterClass()
		public void closedriver()
		{
			Driver.switchTo().defaultContent();
			Driver.findElement(By.xpath("//div[@class='back-to-home']")).click();
			test.assignCategory(COWIN);
		}
	

}
	

