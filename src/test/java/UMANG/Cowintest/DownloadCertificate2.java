package UMANG.Cowintest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.MobileandOTPsubmit;
import PageObjects.ServiceDirectoryNavigation;
import PageObjects.ServiceNavigation;
import PageObjects.departmentnavigationpage;
import Resources.Base;
import Resources.Base2;
import Utilis.Excelfilefordownloadcert;
import Utilis.InternationalCertExceldata;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;


public class DownloadCertificate2 extends Base2{
	
	

	@Test(priority=2)
	public void ServiceDirectoryDeptnavigation() throws IOException, InterruptedException
	
	{
	
		ServiceDirectoryNavigation SD=new ServiceDirectoryNavigation(Driver);
		SD.Service().click();
		Thread.sleep(1000);
		System.out.println("Service Directory Navigation done");
		test.assignCategory(COWIN);
		}
		
	//Department Navigation 
@Test (priority=3)
public void departmentnavigation()
{
	System.out.println("Department Navigation");
	departmentnavigationpage dp=new departmentnavigationpage(Driver);
	dp.deptcowin().click();
	System.out.println("Home page of Department Comes");
	test.assignCategory(COWIN);
}


@Test (priority=4)
public void downloadcert()

{
	
System.out.println("DownloadCertificate Page");	
ServiceNavigation SN=new ServiceNavigation(Driver);
SN.downloadcert().click();
test.assignCategory(COWIN);
}


	//open Download certificATE
@Test (priority=5)
public void SubmitmobileandOTP() throws InterruptedException
{
	 Driver.switchTo().frame(Driver.findElement(By.xpath("//iframe[@id='myIframe']")));
	 MobileandOTPsubmit MOP=new MobileandOTPsubmit(Driver);
	 MOP.numbercowin().click(); 
	 System.out.println("Mobile submitted");
	 Thread.sleep(25000);
	 System.out.println("Disbled Verify button");
	 MOP.OTPcowin().click(); 
	 System.out.println("OTP submitted");
	 Thread.sleep(1000);
		test.assignCategory(COWIN);
}


	
//Download User
@Test(priority= 6, dataProvider ="excelData", dataProviderClass=Excelfilefordownloadcert.class)
public void DownloadCert(String benname) throws InterruptedException 
{ 
	Driver.findElement(By.xpath("//div[@class='ng-input']")).click();
	 List<WebElement> options = Driver.findElements(By.xpath("//span[@class='ng-option-label ng-star-inserted']"));
	    for(WebElement element : options)
	    {
	     if(element.getText().equalsIgnoreCase(benname))
	     
	     {
	    	 System.out.println(benname);
	        element.click();	
	      	Driver.findElement(By.xpath("//button[text()=' Download ']")).click();
	      	System.out.println("Complete download");
	         break;
	     } 
	    }
		test.assignCategory(COWIN);
Thread.sleep(3000);
}


@AfterClass()
public void closedriver()
{
	Driver.switchTo().defaultContent();
	Driver.findElement(By.xpath("//div[@class='back-to-home']")).click();
	test.assignCategory(COWIN);
}
}

