package Pageobject.SPGuwahatiDevelopmentDepartment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GuwahatiDevelopmentDepartment{
public WebDriver Driver;
WebDriverWait wait;
	
	

public GuwahatiDevelopmentDepartment(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Trade License related to Veterinary
By TradeLicense =By.xpath("//h4[normalize-space()='Trade License related to Veterinary']");

//Animal Tax Payment under GMC Act 1971
By AnimalTax = By.xpath("//h4[normalize-space()='Animal Tax Payment under GMC Act 1971']");

//Registration of Dogs
By Dogs=By.xpath("//h4[normalize-space()='Registration of Dogs']");

//Permission to display advertisement on vehicle
By advertisement=By.xpath("//h4[normalize-space()='Permission to display advertisement on vehicle']");

//info service 
//Trade License related to Veterinary
By infoTradeLicense =By.xpath("//h4[normalize-space()='Trade License related to Veterinary']//following::img[@src='./assets/images/infoIcon.png'][1]");


//Registration of Dogs
By infoDogs=By.xpath("//h4[normalize-space()='Registration of Dogs']//following::img[@src='./assets/images/infoIcon.png'][1]");

//Permission to display advertisement on vehicle
By infoadvertisement=By.xpath("//h4[normalize-space()='Permission to display advertisement on vehicle']//following::img[@src='./assets/images/infoIcon.png'][1]");



public WebElement infoadvertisement()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoadvertisement));
	  return Driver.findElement(infoadvertisement);
}
public WebElement infoDogs()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoDogs));
	  return Driver.findElement(infoDogs);
}

public WebElement infoTradeLicense()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoTradeLicense));
	  return Driver.findElement(infoTradeLicense);
}

public WebElement advertisement()
{
	wait.until(ExpectedConditions.elementToBeClickable(advertisement));
	  return Driver.findElement(advertisement);
}
public WebElement Dogs()
{
	wait.until(ExpectedConditions.elementToBeClickable(Dogs));
	  return Driver.findElement(Dogs);
}
public WebElement AnimalTax()
{
	wait.until(ExpectedConditions.elementToBeClickable(AnimalTax));
	  return Driver.findElement(AnimalTax);
}
public WebElement TradeLicense()
{
	wait.until(ExpectedConditions.elementToBeClickable(TradeLicense));
	  return Driver.findElement(TradeLicense);
}


}
