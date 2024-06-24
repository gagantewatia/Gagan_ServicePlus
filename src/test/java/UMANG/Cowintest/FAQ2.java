package UMANG.Cowintest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.ServiceDirectoryNavigation;
import PageObjects.ServiceNavigation;
import PageObjects.departmentnavigationpage;
import Resources.Base;
import Resources.Base2;

public class FAQ2 extends Base2
{

	
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
	//Open FAQ
	@Test(priority=3)
	public void FAQbutton() throws InterruptedException
	{
		System.out.println("FAQ Open");
		ServiceNavigation FA=new ServiceNavigation(Driver);
		FA.FAQ1().click();
		Thread.sleep(1000);
		test.assignCategory(COWIN);
	}
	//Open topics and click Questionnaire
	@Test(priority=4)
	public void FAQcheck() throws InterruptedException
	{
		Thread.sleep(1000);
		 Driver.switchTo().frame(Driver.findElement(By.xpath("//iframe[@id='myIframe']")));
		 Thread.sleep(1000);
		Driver.findElement(By.xpath("//div[contains(text(),'Scheduling Appointment')]")).click();
		Thread.sleep(1000);
		Driver.findElement(By.xpath("//mat-panel-title[text()='  Can I download appointment slip? ']")).click();
		Thread.sleep(1000);
		Driver.findElement(By.xpath("//div[contains(text(),'Registration')]")).click();
		Thread.sleep(1000);
		Driver.findElement(By.xpath("/html/body/app-root/app-app-root/app-app-tile-view-container/div[2]/div/div[2]/app-faq/div/mat-tab-group/div/mat-tab-body[1]/div/mat-accordion/div[3]/mat-expansion-panel/mat-expansion-panel-header/span[1]/mat-panel-title")).click();
		test.assignCategory(COWIN);
		
	}
	//close browser
@AfterClass
	
	public void Driverclose()
	
	{
	Driver.switchTo().defaultContent();
	Driver.findElement(By.xpath("//div[@class='back-to-home']")).click();
	test.assignCategory(COWIN);
	}
	
}

