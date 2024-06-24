package Pageobject.SPDepartmentofMinesGeology;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DepartmentofMinesGeology{
public WebDriver Driver;
WebDriverWait wait;
	
	

public DepartmentofMinesGeology(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Mineral Transport Permit for carrying Minerals in the State of Haryana
By MineralTransport =By.xpath("//h4[normalize-space()='Mineral Transport Permit for carrying Minerals in the State of Haryana']");

public WebElement MineralTransport()
{
	wait.until(ExpectedConditions.elementToBeClickable(MineralTransport));
	  return Driver.findElement(MineralTransport);
}
}
