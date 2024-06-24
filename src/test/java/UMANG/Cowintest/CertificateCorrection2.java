package UMANG.Cowintest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import PageObjects.MobileandOTPsubmit;
import PageObjects.ServiceDirectoryNavigation;
import PageObjects.ServiceNavigation;
import PageObjects.certificatecorrectionpom;
import PageObjects.departmentnavigationpage;
import Resources.Base;
import Resources.Base2;
import Utilis.excelfileforcorrectiondetails;

public class CertificateCorrection2  extends Base2
{
	

//Service Directory Navigation
	@Test(priority=1)
public void ServiceDirectoryDeptnavigation() throws IOException, InterruptedException
	
	{
	
		ServiceDirectoryNavigation SD=new ServiceDirectoryNavigation(Driver);
		SD.Service().click();
		System.out.println("Service Directory Navigation done");
		Thread.sleep(1000);
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
	public void Correctioncertificate()
	
	{
		
    System.out.println("certificatecorrection");	
	ServiceNavigation SN=new ServiceNavigation(Driver);
    SN.certificatecorrection().click();
	test.assignCategory(COWIN);
 
	}

	// submit beneficiary details
	
	@Test(priority=6,dataProvider="excelData",dataProviderClass=excelfileforcorrectiondetails.class)
	public void correctiondetails(String Label, String Benname, String Bendetail)
	
	{
		 Driver.switchTo().frame(Driver.findElement(By.xpath("//iframe[@id='myIframe']")));
		JavascriptExecutor js = (JavascriptExecutor) Driver;
	    js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	    System.out.println("select beneficary");
	    WebDriverWait wait1=new WebDriverWait(Driver,Duration.ofSeconds(30));
	    certificatecorrectionpom cn=new certificatecorrectionpom(Driver);
	    cn.benname().click();
	    //for drop down
	   	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='ng-option-label ng-star-inserted']")));
	    List<WebElement> options = cn.benlist();
	    
	    for(WebElement element : options)
	    {
	     if(element.getText().equalsIgnoreCase(Benname))
	     
	     {
	        element.click();	
	         break;
	     } 
	    
	     
	     JavascriptExecutor js1 = (JavascriptExecutor) Driver;
		    js1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			test.assignCategory(COWIN);
	    } 
	     

  

   if(Label.equals("Name"))
    {
      
      cn.editname().click();
      cn.changename().clear();
     cn.changename().sendKeys(Bendetail);
     
     
    }

   JavascriptExecutor js1 = (JavascriptExecutor) Driver;
   js1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
   
    if(Label.equals("Year Of Birth "))	
    {   
    	WebElement edit=Driver.findElement(By.xpath("(//img[@alt='edit'])[2]"));
        edit.click();
        
List<WebElement> dates=Driver.findElements(By.xpath("/html/body/div[2]/div[1]"));
		
		int count=Driver.findElements(By.className("/html/body/div[2]/div[1]")).size();
		
		for (int i=0;i<= count; i++)
		{   
			String text=dates.get(i).getText();
			if(text.equalsIgnoreCase(Bendetail));
			{
			dates.get(i).click();
			break;
			
		}
		}
    }
	
    if (Label.equals("Gender"))
    {
    	cn.editgender().click();
        cn.genname().click();
     
 
	    List<WebElement> options2 = cn.selectgender();
	    
	    for(WebElement element : options2)
	    {
	     if(element.getText().equalsIgnoreCase(Bendetail))
	     
	     {
	        element.click();	
	        break;
	     
         }
	    } 
    }
	     if(Label.equals("Photo Id"))
	     
	     {
	    	 

	    	 cn.photoid().click();
	         cn.changephotoid().clear();
	         cn.changephotoid().sendKeys(Bendetail);
	         
	     }
	 	test.assignCategory(COWIN);
    }
	
	//submit details
	@Test(priority=7)	
	public void submitdetails() throws InterruptedException
	{
		certificatecorrectionpom cn=new certificatecorrectionpom(Driver);
		cn.submit().click();
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
	
	
	    
