package Pageobject.SPDepartmentofHealthJammuKashmir;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DepartmentofHealthJammuKashmir{
public WebDriver Driver;
WebDriverWait wait;
	
	

public DepartmentofHealthJammuKashmir(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Application form for Physically Challenged Certificate
By PhysicallyChallengedCertificate =By.xpath("//h4[normalize-space()='Application form for Physically Challenged Certificate']");
//Application Form for Age Certificate
By AgeCertificate =By.xpath("//h4[normalize-space()='Application Form for Age Certificate']");

//Application form for Physically Challenged Certificate
By infoPhysicallyChallengedCertificate =By.xpath("//h4[normalize-space()='Application form for Physically Challenged Certificate']//following::img[@src='./assets/images/infoIcon.png'][1]");
//Application Form for Age Certificate
By infoAgeCertificate =By.xpath("//h4[normalize-space()='Application Form for Age Certificate']//following::img[@src='./assets/images/infoIcon.png'][1]");

public WebElement infoPhysicallyChallengedCertificate()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoPhysicallyChallengedCertificate));
	  return Driver.findElement(infoPhysicallyChallengedCertificate);
}

public WebElement infoAgeCertificate()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoAgeCertificate));
	  return Driver.findElement(infoAgeCertificate);
}

public WebElement PhysicallyChallengedCertificate()
{
	wait.until(ExpectedConditions.elementToBeClickable(PhysicallyChallengedCertificate));
	  return Driver.findElement(PhysicallyChallengedCertificate);
}

public WebElement AgeCertificate()
{
	wait.until(ExpectedConditions.elementToBeClickable(AgeCertificate));
	  return Driver.findElement(AgeCertificate);
}
}
