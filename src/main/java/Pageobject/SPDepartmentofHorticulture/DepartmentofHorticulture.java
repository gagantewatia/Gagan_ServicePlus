package Pageobject.SPDepartmentofHorticulture;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DepartmentofHorticulture{
public WebDriver Driver;
WebDriverWait wait;
	
	

public DepartmentofHorticulture(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Application for Assistance on construction of Handling units, Bore wells, tube wells, water storage tanks, and Purchase of Horti
By  PurchaseofHorti =By.xpath("//h4[normalize-space()='Application for Assistance on construction of Handling units, Bore wells, tube wells, water storage tanks, and Purchase of Horti']");

//Application for Purchase of Plant Material from Departmental Nursery
By  DepartmentalNursery = By.xpath("//h4[normalize-space()='Application for Purchase of Plant Material from Departmental Nursery']");

//Application for assistance on establishment of CA stores FPUs refer vans canning units etc
By  canningunits =By.xpath("//h4[normalize-space()='Application for assistance on establishment of CA stores FPUs refer vans canning units etc']");

//Booking for development of high density orchard
By highdensityorchard=By.xpath("//h4[normalize-space()='Booking for development of high density orchard']");

// Info service 

//Application for Assistance on construction of Handling units, Bore wells, tube wells, water storage tanks, and Purchase of Horti
By  infoPurchaseofHorti =By.xpath("//h4[normalize-space()='Application for Assistance on construction of Handling units, Bore wells, tube wells, water storage tanks, and Purchase of Horti']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Application for Purchase of Plant Material from Departmental Nursery
By  infoDepartmentalNursery = By.xpath("//h4[normalize-space()='Application for Purchase of Plant Material from Departmental Nursery']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Application for assistance on establishment of CA stores FPUs refer vans canning units etc
By  infocanningunits =By.xpath("//h4[normalize-space()='Application for assistance on establishment of CA stores FPUs refer vans canning units etc']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Booking for development of high density orchard
By infohighdensityorchard=By.xpath("//h4[normalize-space()='Booking for development of high density orchard']//following::img[@src='./assets/images/infoIcon.png'][1]");


public WebElement infohighdensityorchard()
{
	wait.until(ExpectedConditions.elementToBeClickable(infohighdensityorchard));
	  return Driver.findElement(infohighdensityorchard);
}
public WebElement infocanningunits()
{
	wait.until(ExpectedConditions.elementToBeClickable(infocanningunits));
	  return Driver.findElement(infocanningunits);
}

public WebElement infoDepartmentalNursery()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoDepartmentalNursery));
	  return Driver.findElement(infoDepartmentalNursery);
}

public WebElement infoPurchaseofHorti()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoPurchaseofHorti));
	  return Driver.findElement(infoPurchaseofHorti);
}





public WebElement highdensityorchard()
{
	wait.until(ExpectedConditions.elementToBeClickable(highdensityorchard));
	  return Driver.findElement(highdensityorchard);
}
public WebElement canningunits()
{
	wait.until(ExpectedConditions.elementToBeClickable(canningunits));
	  return Driver.findElement(canningunits);
}

public WebElement DepartmentalNursery()
{
	wait.until(ExpectedConditions.elementToBeClickable(DepartmentalNursery));
	  return Driver.findElement(DepartmentalNursery);
}

public WebElement PurchaseofHorti()
{
	wait.until(ExpectedConditions.elementToBeClickable(PurchaseofHorti));
	  return Driver.findElement(PurchaseofHorti);
}

}
