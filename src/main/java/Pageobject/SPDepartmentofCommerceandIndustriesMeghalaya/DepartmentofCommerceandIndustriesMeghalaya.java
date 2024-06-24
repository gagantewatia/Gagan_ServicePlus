package Pageobject.SPDepartmentofCommerceandIndustriesMeghalaya;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DepartmentofCommerceandIndustriesMeghalaya{
public WebDriver Driver;
WebDriverWait wait;
	
	

public DepartmentofCommerceandIndustriesMeghalaya(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Common Application Form (CAF) for Single Window Agency (SWA) Clearance
By CommonApplicationForm =By.xpath("//h4[normalize-space()='Common Application Form (CAF) for Single Window Agency (SWA) Clearance']");

//Common Application Form (CAF) for Single Window Agency (SWA) Clearance
By infoCommonApplicationForm =By.xpath("//h4[normalize-space()='Common Application Form (CAF) for Single Window Agency (SWA) Clearance']//following::img[@src='./assets/images/infoIcon.png'][1]");

public WebElement infoCommonApplicationForm()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoCommonApplicationForm));
	  return Driver.findElement(infoCommonApplicationForm);
}

public WebElement CommonApplicationForm()
{
	wait.until(ExpectedConditions.elementToBeClickable(CommonApplicationForm));
	  return Driver.findElement(CommonApplicationForm);
}
}
