package Pageobject.SPDepOfUrbanDevelopment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DepOfUrbanDevelopment
{
public WebDriver Driver;
WebDriverWait wait;
	
	

public DepOfUrbanDevelopment(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Water Tank Booking
By WaterTankBooking =By.xpath("//h4[normalize-space()='Water Tank Booking']");

//Online Sewer Connection
By OnlineSewerConnection = By.xpath("//h4[normalize-space()='Online Sewer Connection']");

//info service 

//Water Tank Booking
By infoWaterTankBooking =By.xpath("//h4[normalize-space()='Water Tank Booking']");

//Online Sewer Connection
By infoOnlineSewerConnection = By.xpath("//h4[normalize-space()='Online Sewer Connection']");


public WebElement infoWaterTankBooking()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoWaterTankBooking));
	  return Driver.findElement(infoWaterTankBooking);
}
public WebElement infoOnlineSewerConnection()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoOnlineSewerConnection));
	  return Driver.findElement(infoOnlineSewerConnection);
}

public WebElement WaterTankBooking()
{
	wait.until(ExpectedConditions.elementToBeClickable(WaterTankBooking));
	  return Driver.findElement(WaterTankBooking);
}
public WebElement OnlineSewerConnection()
{
	wait.until(ExpectedConditions.elementToBeClickable(OnlineSewerConnection));
	  return Driver.findElement(OnlineSewerConnection);
}

}
