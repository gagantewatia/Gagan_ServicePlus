package Pageobject.SPDepartmentofPower;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DepartmentofPower{
public WebDriver Driver;
WebDriverWait wait;
	
	

public DepartmentofPower(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Complaint management system
By Complaintmanagementsystem =By.xpath("//h4[normalize-space()='Complaint management system']");
By SPpageheading =By.xpath("//div[@class='table_cont header_new']");

//Complaint management system
By infoComplaintmanagementsystem =By.xpath("//h4[normalize-space()='Complaint management system']//following::img[@src='./assets/images/infoIcon.png'][1]");

public WebElement infoComplaintmanagementsystem()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoComplaintmanagementsystem));
	  return Driver.findElement(infoComplaintmanagementsystem);
}
public WebElement Complaintmanagementsystem()
{
	wait.until(ExpectedConditions.elementToBeClickable(Complaintmanagementsystem));
	  return Driver.findElement(Complaintmanagementsystem);
}
public WebElement SPpageheading()
{
	wait.until(ExpectedConditions.elementToBeClickable(SPpageheading));
	  return Driver.findElement(SPpageheading);
}
}
