package Pageobject.SPGeneralAdministrationDepartment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GeneralAdministrationDepartment{
public WebDriver Driver;
WebDriverWait wait;
	
	

public GeneralAdministrationDepartment(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Issuance of Senior Citizens Certificate
By SeniorCitizensCertificate =By.xpath("//h4[normalize-space()='Issuance of Senior Citizens Certificate']");

//Issuance of Next of Kin Certificate
By KinCertificate = By.xpath("//h4[normalize-space()='Issuance of Next of Kin Certificate']");



public WebElement SeniorCitizensCertificate()
{
	wait.until(ExpectedConditions.elementToBeClickable(SeniorCitizensCertificate));
	  return Driver.findElement(SeniorCitizensCertificate);
}
public WebElement KinCertificate()
{
	wait.until(ExpectedConditions.elementToBeClickable(KinCertificate));
	  return Driver.findElement(KinCertificate);
}
}
