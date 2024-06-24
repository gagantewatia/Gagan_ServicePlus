package Pageobject.SPDepartmentofPanchayatiRajJammuKashmir;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DepartmentofPanchayatiRajJammuKashmir{
public WebDriver Driver;
WebDriverWait wait;
	
	

public DepartmentofPanchayatiRajJammuKashmir(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Application for Issuance of Job Card under MGNREGA
By MGNREGA =By.xpath("//h4[normalize-space()='Application for Issuance of Job Card under MGNREGA']");

public WebElement MGNREGA()
{
	wait.until(ExpectedConditions.elementToBeClickable(MGNREGA));
	  return Driver.findElement(MGNREGA);
}
}
