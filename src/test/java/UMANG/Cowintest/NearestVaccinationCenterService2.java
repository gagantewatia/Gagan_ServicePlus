package UMANG.Cowintest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.MobileandOTPsubmit;
import PageObjects.NearestVaccinationCenter;
import PageObjects.ServiceDirectoryNavigation;
import PageObjects.ServiceNavigation;
import PageObjects.SlotSchedule;
import PageObjects.departmentnavigationpage;
import Resources.Base;
import Resources.Base2;
import Utilis.Exceldataforascheduleappointmnets;
import Utilis.Exceldatatoselectschedules;
import Utilis.GSTNExcel;

public class NearestVaccinationCenterService2 extends Base2
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
	@Test(priority=2)
	
	public void departmentnavigation() throws InterruptedException
	{
		System.out.println("Department Navigation");
		departmentnavigationpage dp=new departmentnavigationpage(Driver);
		dp.deptcowin().click();
		System.out.println("Home page of Department Comes");
	    Thread.sleep(2000);
		test.assignCategory(COWIN);
	}
	//Open NEarest Center
	@Test(priority=3)
	public void NeareatVaccinationbutton() throws InterruptedException
	{
		System.out.println("Neareast center Open");
		ServiceNavigation NC=new ServiceNavigation(Driver);
	    NC.nearestcenteropen().click();
	    Thread.sleep(2000);
		test.assignCategory(COWIN);
	}
	//Search by pin
	@Test(priority=4, dataProvider ="excelData",dataProviderClass=Exceldataforascheduleappointmnets.class)
	public void nearestvaccinationcentrebypin(String pinnum) throws InterruptedException
	{
		 Driver.switchTo().frame(Driver.findElement(By.xpath("//iframe[@id='myIframe']")));
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
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) Driver;
	    js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	    Thread.sleep(2000);
		test.assignCategory(COWIN);
			
	}
	//Search by District
	
/*	@Test(priority=5, dataProvider ="excelDataDistrict", dataProviderClass=Exceldataforascheduleappointmnets.class)
	public void nearestvaccinationcentrebydistrict(String state,String District) throws InterruptedException
	{
		System.out.println("select Search by District");
		NearestVaccinationCenter NC1=new NearestVaccinationCenter(Driver);
		NC1.District().click();
		Thread.sleep(1000);
       NC1.stateclick().sendKeys(state);
   	Thread.sleep(1000);
       NC1.stateclick().sendKeys(Keys.TAB);
	Thread.sleep(1000);
	
	NC1.districtclick().sendKeys(District);
	Thread.sleep(1000);
	
    NC1.districtclick().sendKeys(Keys.TAB);
    
    WebDriverWait wait=new WebDriverWait(Driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Search ']")));
	NC1.searchbutton().click();
	Thread.sleep(1000);
	JavascriptExecutor js = (JavascriptExecutor) Driver;
    js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    Thread.sleep(1000);
	*/
	
	@Test(priority=5)
	public void nearestvaccinationcentrebydistrict() throws InterruptedException, IOException
	{
		System.out.println("select Search by District");
		NearestVaccinationCenter NC1=new NearestVaccinationCenter(Driver);
		NC1.District().click();
		Thread.sleep(1000);
		GSTNExcel gs=new GSTNExcel();
		ArrayList<String> data=gs.getData("District");
		
       NC1.stateclick().sendKeys(data.get(1));
   	Thread.sleep(1000);
       NC1.stateclick().sendKeys(Keys.TAB);
	Thread.sleep(1000);
	
	NC1.districtclick().sendKeys(data.get(2));
	Thread.sleep(1000);
	
    NC1.districtclick().sendKeys(Keys.TAB);
    
    WebDriverWait wait=new WebDriverWait(Driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Search ']")));
	NC1.searchbutton().click();
	Thread.sleep(1000);
	JavascriptExecutor js = (JavascriptExecutor) Driver;
    js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    Thread.sleep(1000);
	test.assignCategory(COWIN);
}
	
		
	//Search by map
	@Test(priority=6, dataProvider ="excelDatamap",dataProviderClass=Exceldataforascheduleappointmnets.class)
	public void Searchbymap(String locate) throws InterruptedException
	{
		System.out.println("select Search by map");

		NearestVaccinationCenter NC2=new NearestVaccinationCenter(Driver);
		NC2.map().click();
	Thread.sleep(4000);
	test.assignCategory(COWIN);
	
		}
	//search pin
	
	@Test(priority=7,dataProvider ="excelDatasearch",dataProviderClass=Exceldatatoselectschedules.class)

	public void nearestvaccinationcentrebypintogglesearchcheck(String Search) throws InterruptedException
		{
			NearestVaccinationCenter NC3=new NearestVaccinationCenter(Driver);
			NC3.PIN().click();
			System.out.println("Check toggle");
			WebDriverWait wait=new WebDriverWait(Driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Search ']")));
			NC3.searchbutton().click();
			JavascriptExecutor js = (JavascriptExecutor) Driver;
		    js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		    NC3.toggle().click();
		    SlotSchedule SS=new SlotSchedule(Driver);
		    SS.Search().sendKeys(Search);
		    Thread.sleep(500);
		    SS.Search().clear();
			test.assignCategory(COWIN);
		}

		

	//Check Filter 
		

	@Test(priority=8)

	public void nearestvaccinationcentrebypintoggleFiltercheck() throws InterruptedException
		{
		NearestVaccinationCenter NC3=new NearestVaccinationCenter(Driver);
	     NC3.filter().click();

	     NC3.listage().click();
	     NC3.listfee().click();
	     NC3.applyfilter().click();
	     Thread.sleep(1000);
	     JavascriptExecutor js = (JavascriptExecutor) Driver;
	     js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			test.assignCategory(COWIN);
		}      

	
	
	
	//Search map center
	@Test(priority=9, dataProvider ="excelDatamap",dataProviderClass=Exceldataforascheduleappointmnets.class)
	public void Searchbymapcenter(String locate) throws InterruptedException
	{
		System.out.println("select Search by map center");
		NearestVaccinationCenter NC2=new NearestVaccinationCenter(Driver);
         NC2.map().click();
         Thread.sleep(2000);
		 Actions actions = new Actions(Driver);
		 actions.moveToElement(NC2.maphover()).perform();
		 NC2.mapcheckavailability().click();
		 Thread.sleep(1000);
			JavascriptExecutor js = (JavascriptExecutor) Driver;
		    js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		    Thread.sleep(2000);
			test.assignCategory(COWIN);
		}
	
	//toggle and Search box




@AfterClass
public void Driverclose()

{
	Driver.switchTo().defaultContent();
	Driver.findElement(By.xpath("//div[@class='back-to-home']")).click();
	test.assignCategory(COWIN);
}
	
}