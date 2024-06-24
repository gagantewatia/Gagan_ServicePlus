package Pageobject.SPPrintingandStationeryDepartmentHaryana;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PrintingandStationeryDepartmentHaryana{
public WebDriver Driver;
WebDriverWait wait;
	
	

public PrintingandStationeryDepartmentHaryana(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Change of Name
By Name =By.xpath("//h4[normalize-space()='Change of Name");

By infoName=By.xpath("//h4[normalize-space()='Change of Name']//following::img[@src='./assets/images/infoIcon.png'][1]");


public WebElement infoName()
{

	 wait.until(ExpectedConditions.elementToBeClickable(infoName));
	  return Driver.findElement(infoName);
}
public WebElement Name()
{

	 wait.until(ExpectedConditions.elementToBeClickable(Name));
	  return Driver.findElement(Name);
}

}
