package Pageobject.SPKarbiAnglong;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KarbiAnglong{
public WebDriver Driver;
WebDriverWait wait;
	
	

public KarbiAnglong(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Certified Copy of Mutation
By Mutation =By.xpath("//h4[normalize-space()='Certified Copy of Mutation']");

//Certified Copies of Jamabandi
By Jamabandi = By.xpath("//h4[normalize-space()='Certified Copies of Jamabandi']");

//Certified Copies of Chitha
By Chitha=By.xpath("//h4[normalize-space()='Certified Copies of Chitha']");

//Duplicate Copies of Land Patta
By LandPatta=By.xpath("//h4[normalize-space()='Duplicate Copies of Land Patta']");

//Issuance of Farmer's Certificate
By Farmers = By.xpath("(//div[@class=\"tile-heading\"])[8]");

//Issuance of Renewal of Business Registration Certificate
By BusinessRegistration =By.xpath("//h4[normalize-space()='Issuance of Renewal of Business Registration Certificate']");

//Land Revenue Clearance Certificate
By LandRevenue=By.xpath("//h4[normalize-space()='Land Revenue Clearance Certificate']");

//Issuance of Business Registration Certificate
By BusinessRegistrationCertificate =By.xpath("//h4[normalize-space()='Issuance of Business Registration Certificate']");
//info services 
//Certified Copy of Mutation
By infoMutation =By.xpath("//h4[normalize-space()='Certified Copy of Mutation']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Certified Copies of Jamabandi
By infoJamabandi = By.xpath("//h4[normalize-space()='Certified Copies of Jamabandi']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Certified Copies of Chitha
By infoChitha=By.xpath("//h4[normalize-space()='Certified Copies of Chitha']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Duplicate Copies of Land Patta
By infoLandPatta=By.xpath("(//div[@class=\"tile-heading\"])[8]//following::img[@src='./assets/images/infoIcon.png'][1]");

//Issuance of Farmer's Certificate
By infoFarmers = By.xpath("//h4[normalize-space()='Issuance of Farmer's Certificate']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Issuance of Renewal of Business Registration Certificate
By infoBusinessRegistration =By.xpath("//h4[normalize-space()='Issuance of Renewal of Business Registration Certificate']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Land Revenue Clearance Certificate
By infoLandRevenue=By.xpath("//h4[normalize-space()='Land Revenue Clearance Certificate']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Issuance of Business Registration Certificate
By infoBusinessRegistrationCertificate =By.xpath("//h4[normalize-space()='Issuance of Business Registration Certificate']//following::img[@src='./assets/images/infoIcon.png'][1]");

public WebElement infoBusinessRegistrationCertificate()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoBusinessRegistrationCertificate));
	  return Driver.findElement(infoBusinessRegistrationCertificate);
}
public WebElement infoFarmers()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoFarmers));
	  return Driver.findElement(infoFarmers);
}
public WebElement infoBusinessRegistration()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoBusinessRegistration));
	  return Driver.findElement(infoBusinessRegistration);
}
public WebElement infoLandRevenue()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoLandRevenue));
	  return Driver.findElement(infoLandRevenue);
}
public WebElement infoLandPatta()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoLandPatta));
	  return Driver.findElement(infoLandPatta);
}
public WebElement infoChitha()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoChitha));
	  return Driver.findElement(infoChitha);
}
public WebElement infoJamabandi()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoJamabandi));
	  return Driver.findElement(infoJamabandi);
}
public WebElement infoMutation()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoMutation));
	  return Driver.findElement(infoMutation);
}


public WebElement BusinessRegistrationCertificate()
{
	wait.until(ExpectedConditions.elementToBeClickable(BusinessRegistrationCertificate));
	  return Driver.findElement(BusinessRegistrationCertificate);
}
public WebElement Farmers()
{
	wait.until(ExpectedConditions.elementToBeClickable(Farmers));
	  return Driver.findElement(Farmers);
}
public WebElement BusinessRegistration()
{
	wait.until(ExpectedConditions.elementToBeClickable(BusinessRegistration));
	  return Driver.findElement(BusinessRegistration);
}
public WebElement LandRevenue()
{
	wait.until(ExpectedConditions.elementToBeClickable(LandRevenue));
	  return Driver.findElement(LandRevenue);
}
public WebElement LandPatta()
{
	wait.until(ExpectedConditions.elementToBeClickable(LandPatta));
	  return Driver.findElement(LandPatta);
}
public WebElement Chitha()
{
	wait.until(ExpectedConditions.elementToBeClickable(Chitha));
	  return Driver.findElement(Chitha);
}
public WebElement Jamabandi()
{
	wait.until(ExpectedConditions.elementToBeClickable(Jamabandi));
	  return Driver.findElement(Jamabandi);
}
public WebElement Mutation()
{
	wait.until(ExpectedConditions.elementToBeClickable(Mutation));
	  return Driver.findElement(Mutation);
}

}
