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

import PageObjects.Addbeneficiary;
import PageObjects.MobileandOTPsubmit;
import PageObjects.NearestVaccinationCenter;
import PageObjects.Registerationpage;
import PageObjects.ServiceDirectoryNavigation;
import PageObjects.ServiceNavigation;
import PageObjects.SlotSchedule;
import PageObjects.departmentnavigationpage;
import Resources.Base;
import Resources.Base2;
import Utilis.Exceldataforaddbeneficiary;
import Utilis.Exceldataforascheduleappointmnets;
import Utilis.Exceldatatoselectschedules;
import io.netty.channel.ChannelOption;

public class Registerpage2 extends Base2
{
	
//Service Directory Navigation
	@Test(priority=1)
public void ServiceDirectoryDeptnavigation() throws IOException, InterruptedException
	
	{
	
		ServiceDirectoryNavigation SD=new ServiceDirectoryNavigation(Driver);
		SD.Service().click();
		System.out.println("Service Directory Navigation done");
		Thread.sleep(2000);
		test.assignCategory(COWIN);
			}
	
	// Department Navigation
	@Test(priority=3)
	
	public void departmentnavigation() throws InterruptedException
	{
		System.out.println("Department Navigation");
		departmentnavigationpage dp=new departmentnavigationpage(Driver);
		dp.deptcowin().click();
		System.out.println("Home page of Department Comes");
		Thread.sleep(2000);
		test.assignCategory(COWIN);
	}
	
	//Registration page Navigation
	
	@Test (priority=4)
	public void Registerpage() throws InterruptedException
	
	{
		
    System.out.println("Registeration Page");	
	ServiceNavigation SN=new ServiceNavigation(Driver);
    SN.RegNAVcowin1().click();
    Thread.sleep(3000);
	 Driver.switchTo().frame(Driver.findElement(By.xpath("//iframe[@id='myIframe']")));
		test.assignCategory(COWIN);
	}

	

	// Navigate to add more beneficiary
	@Test (priority=5)
	public void newpagetoaddbeneficiary() throws InterruptedException
	{
	
		   JavascriptExecutor js = (JavascriptExecutor) Driver;
		    js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Registerationpage rp=new Registerationpage(Driver);
		rp.addbutton().click();
		System.out.println("Add more beneficiary");
		Thread.sleep(3000);
		test.assignCategory(COWIN);
	}
	
	//Fill data in registration 

	@SuppressWarnings("unused")
	@Test (priority=6,  enabled=true ,dataProvider ="excelData", dataProviderClass=Exceldataforaddbeneficiary.class)
	
	public void addbeneficairy(String Name,String Yearofbirth, String Gender,String PhotoIdProof, String Idnumber)
 throws InterruptedException
	{
		
	
		Addbeneficiary add=new Addbeneficiary(Driver);
	
		add.name().sendKeys(Name);
		System.out.println("Add2 Details");
		Thread.sleep(1000);
		add.calender().click();
	//select year of birth
		List<WebElement> dates=Driver.findElements(By.className("mat-calendar-body-cell-content"));
		
		int count=Driver.findElements(By.className("mat-calendar-body-cell-content")).size();
		
		for (int i=0;i<= count; i++)
		{
			String text=dates.get(i).getText();
			if(text.equalsIgnoreCase(Yearofbirth));
			{
			dates.get(i).click();
			break;
			
		}
		}
		//Select gender 
		
        add.Gender().click();
        
        System.out.println("Select Gender");
        String text1 = "Male";
		if(text1.equalsIgnoreCase(Gender));
        add.SelectGender().click();

		
		System.out.println("Select Photoidproof");
		add.photoidproof().click();
		WebElement photo=Driver.findElement(By.xpath("/html/body/ng-dropdown-panel/div/div[2]/div[1]/span"));
		String test2 = "Aadhaar Card";
		if (test2.equalsIgnoreCase(PhotoIdProof))
		{
			photo.click();
		}
		
		add.idnumber().sendKeys(Idnumber);
		Driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebDriverWait wait=new WebDriverWait(Driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-default-lg mat-button mat-button-base']")));
		Driver.findElement(By.xpath("//button[@class='btn btn-default-lg mat-button mat-button-base']")).click();
	
		test.assignCategory(COWIN);
		
	}
		//Click on Schedule
	@Test(priority=7,enabled=false)
	public void schedule()
	{
		System.out.println("Select schedule");
		Registerationpage Sh=new Registerationpage(Driver);
		WebDriverWait wait=new WebDriverWait(Driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=' Schedule Appointment ']")));
		Sh.schedule().click();
		test.assignCategory(COWIN);
		
	}
	
	//select nearby center
	
	@Test(priority=7, dataProvider ="excelData",dataProviderClass=Exceldataforascheduleappointmnets.class,enabled=false)
	public void nearestvaccinationcentrebypin(String pinnum)
	{
		System.out.println("select Pincode");
		NearestVaccinationCenter NC=new NearestVaccinationCenter(Driver);
		NC.PIN().click();
		NC.pincode().sendKeys(pinnum);
		System.out.println("select Search");
		WebDriverWait wait=new WebDriverWait(Driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Search ']")));
		NC.searchbutton().click();
		WebDriverWait wait1=new WebDriverWait(Driver,Duration.ofSeconds(30));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']")));
		NC.continued().click();
		test.assignCategory(COWIN);
	}
	//Select slot
	
	
	@Test(dependsOnMethods = { "nearestvaccinationcentrebypin" },enabled=false)
	public void Selelctslot() throws InterruptedException
	{
		SlotSchedule SS=new SlotSchedule(Driver);
		
	
		
	
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) Driver;
		    js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
	List<WebElement> quantity=Driver.findElements(By.xpath("//div[@class='chips success ng-star-inserted']"));
		
		int count=quantity.size();
		
		for (int i=0;i<= count; i++)
		{
		
			String text=quantity.get(i).getText(); 
			
		  if(text!="NA")
		  {
			  SS.dosequant().click();
			  Thread.sleep(2000);
			        {  
			    	try
			    	{
			            if(SS.slotsavail().isDisplayed()==true)
			               {
			    		SS.slotsavail().click();
						 Thread.sleep(2000);
						SS.selects().click();
						break;	
			               }
			    	}
			    	catch (Exception e)
			    	{
			        //    else 
			            { 
			            	System.out.println("No" + e);
				          SS.back().click();
				
			            }			         
			       }
	      }
	   }
			
	  SS.backafterslotconfirm();
		}
		test.assignCategory(COWIN);	
}
	

	
	
//option to download slip, certificate and address
	@Test (priority=9)
	public void checkoptionviewcenter() throws InterruptedException
	{
		
		 Registerationpage CO=new Registerationpage(Driver);
		 Thread.sleep(5000);
		 
		 CO.option().click(); 
		// to download certificate 
		 try
        {
		 if ( CO.downloadcert().isDisplayed()==true)
		 {
		 CO.downloadcert().click();
         Thread.sleep(3000);
		 CO.option().click(); 
		 }
		}
		 catch(Exception e)
		 {
			 System.out.println("No download certificate" + e);
		 }
		 
	 //to center address
	
		 try 
		 {
		
		 if (CO.CentreAddress().isDisplayed()==true)
		 {
		   CO.CentreAddress().click();
		   Thread.sleep(1000);
	       CO.CentreAddressback().click();
	       CO.option().click(); 
		   }
		 }
		 catch(Exception e)
		 {
			 System.out.println("No center adddress" + e );
		 }

		//to download slip
		 try 
		 { 
		 
		 if(CO.Downloadslip().isDisplayed()==true)
		{
			 Thread.sleep(2000);
		   CO.Downloadslip().click();
	     	if(CO.downloadslipneg().isDisplayed()==true)
	       	{
			
	     		CO.downloadslipneg().click();
	     	
		     }
	     	 CO.option().click();
	 		Thread.sleep(1000);
		}
		 }
		 catch(Exception e)
		 {
			 System.out.println("No download slip" + e);
		 } 
//to delete 
		
		try { 
        if(CO.Delete().isDisplayed()==true)
        {
		 Thread.sleep(1000);
		 CO.Delete().click();
		 Thread.sleep(1000); 
	     CO.option().click();
         }
		}
		
		catch(Exception e)
		{
			System.out.println("No delete" + e);
		}
        
		//to cancel appointment
        try
        {
		 if(CO.cancelappoint().isDisplayed()==true)
		 {
			 CO.cancelappoint().click();
			 CO.cancelconfirm().click();
			 Thread.sleep(1000); 
		     CO.option().click();
	     }
        }
        catch(Exception e)
        {
			System.out.println("No cancel apointment" + e );
		}
        
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
	

	
	
	

	
		
		
		
	



