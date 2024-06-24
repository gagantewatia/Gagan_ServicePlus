package Pageobject.SPUrbanDevHousingDepartmentSikkim;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UrbanDevHousingDepartmentSikkim{
public WebDriver Driver;
WebDriverWait wait;
	

public UrbanDevHousingDepartmentSikkim(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Issuance of Permission for Banner Placement
By BannerPlacement =By.xpath("//h4[normalize-space()='Issuance of Permission for Banner Placement']");
//NOC for Registration of Lands which are Adjacent to UDD owned lands
By UDDownedlands =By.xpath("//h4[normalize-space()='NOC for Registration of Lands which are Adjacent to UDD owned lands']");
//Issuance of MgMarg Permissions for Non-Profitable Events
By NonProfitableEvents =By.xpath("//h4[normalize-space()='Issuance of MgMarg Permissions for Non-Profitable Events']");
//Issuance of MgMarg Permission for Profitable Events
By ProfitableEvents =By.xpath("//h4[normalize-space()='Issuance of MgMarg Permission for Profitable Events']");
//NOC for Availing Housing Loan on Mortgage of Lease Deed from UDD
By LeaseDeed =By.xpath("//h4[normalize-space()='NOC for Availing Housing Loan on Mortgage of Lease Deed from UDD']");
//Gangtok Municipal Corporation - Grievance Redressal
By GrievanceRedressal =By.xpath("//h4[normalize-space()='Gangtok Municipal Corporation - Grievance Redressal']");
//Allotment of Shop Rooms/Public Space/Housing Unit for Business Purposes from UDD
By BusinessPurposes =By.xpath("//h4[normalize-space()='Allotment of Shop Rooms/Public Space/Housing Unit for Business Purposes from UDD']");
//Allotment of Temporary Permission for Mega Events from UDD
By TemporaryPermission =By.xpath("//h4[normalize-space()='Allotment of Temporary Permission for Mega Events from UDD']");

//Issuance of Permission for Banner Placement
By infoBannerPlacement =By.xpath("//h4[normalize-space()='Issuance of Permission for Banner Placement']//following::img[@src='./assets/images/infoIcon.png'][1]");
//NOC for Registration of Lands which are Adjacent to UDD owned lands
By infoUDDownedlands =By.xpath("//h4[normalize-space()='NOC for Registration of Lands which are Adjacent to UDD owned lands']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Issuance of MgMarg Permissions for Non-Profitable Events
By infoNonProfitableEvents =By.xpath("//h4[normalize-space()='Issuance of MgMarg Permissions for Non-Profitable Events']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Issuance of MgMarg Permission for Profitable Events
By infoProfitableEvents =By.xpath("//h4[normalize-space()='Issuance of MgMarg Permission for Profitable Events']//following::img[@src='./assets/images/infoIcon.png'][1]");
//NOC for Availing Housing Loan on Mortgage of Lease Deed from UDD
By infoLeaseDeed =By.xpath("//h4[normalize-space()='NOC for Availing Housing Loan on Mortgage of Lease Deed from UDD']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Gangtok Municipal Corporation - Grievance Redressal
By infoGrievanceRedressal =By.xpath("//h4[normalize-space()='Gangtok Municipal Corporation - Grievance Redressal']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Allotment of Shop Rooms/Public Space/Housing Unit for Business Purposes from UDD
By infoBusinessPurposes =By.xpath("//h4[normalize-space()='Allotment of Shop Rooms/Public Space/Housing Unit for Business Purposes from UDD']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Allotment of Temporary Permission for Mega Events from UDD
By infoTemporaryPermission =By.xpath("//h4[normalize-space()='Allotment of Temporary Permission for Mega Events from UDD']//following::img[@src='./assets/images/infoIcon.png'][1]");

public WebElement infoTemporaryPermission()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoTemporaryPermission));
	  return Driver.findElement(infoTemporaryPermission);
}
public WebElement infoBusinessPurposes()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoBusinessPurposes));
	  return Driver.findElement(infoBusinessPurposes);
}

public WebElement infoGrievanceRedressal()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoGrievanceRedressal));
	  return Driver.findElement(infoGrievanceRedressal);
}
public WebElement infoLeaseDeed()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoLeaseDeed));
	  return Driver.findElement(infoLeaseDeed);
}
public WebElement infoProfitableEvents()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoProfitableEvents));
	  return Driver.findElement(infoProfitableEvents);
}
public WebElement infoNonProfitableEvents()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoNonProfitableEvents));
	  return Driver.findElement(infoNonProfitableEvents);
}
public WebElement infoUDDownedlands()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoUDDownedlands));
	  return Driver.findElement(infoUDDownedlands);
}
public WebElement infoBannerPlacement()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoBannerPlacement));
	  return Driver.findElement(infoBannerPlacement);
}

public WebElement TemporaryPermission()
{
	wait.until(ExpectedConditions.elementToBeClickable(TemporaryPermission));
	  return Driver.findElement(TemporaryPermission);
}
public WebElement BusinessPurposes()
{
	wait.until(ExpectedConditions.elementToBeClickable(BusinessPurposes));
	  return Driver.findElement(BusinessPurposes);
}

public WebElement GrievanceRedressal()
{
	wait.until(ExpectedConditions.elementToBeClickable(GrievanceRedressal));
	  return Driver.findElement(GrievanceRedressal);
}
public WebElement LeaseDeed()
{
	wait.until(ExpectedConditions.elementToBeClickable(LeaseDeed));
	  return Driver.findElement(LeaseDeed);
}
public WebElement ProfitableEvents()
{
	wait.until(ExpectedConditions.elementToBeClickable(ProfitableEvents));
	  return Driver.findElement(ProfitableEvents);
}
public WebElement NonProfitableEvents()
{
	wait.until(ExpectedConditions.elementToBeClickable(NonProfitableEvents));
	  return Driver.findElement(NonProfitableEvents);
}
public WebElement UDDownedlands()
{
	wait.until(ExpectedConditions.elementToBeClickable(UDDownedlands));
	  return Driver.findElement(UDDownedlands);
}
public WebElement BannerPlacement()
{
	wait.until(ExpectedConditions.elementToBeClickable(BannerPlacement));
	  return Driver.findElement(BannerPlacement);
}
}
