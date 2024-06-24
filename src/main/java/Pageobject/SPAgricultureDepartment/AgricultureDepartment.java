package Pageobject.SPAgricultureDepartment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AgricultureDepartment{
public WebDriver Driver;
WebDriverWait wait;
	
	

public AgricultureDepartment(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Online submission of Aadhaar Card to the District Agriculture Office for PM Kisan Beneficiary ONLY
By OnlineSubmission =By.xpath("//h4[normalize-space()='Online submission of Aadhaar Card to the District Agriculture Office for PM Kisan Beneficiary ONLY']");
By SPpageheading =By.xpath("//div[@class='table_cont header_new']");
By infoOnlineSubmission =By.xpath("//h4[normalize-space()='Online submission of Aadhaar Card to the District Agriculture Office for PM Kisan Beneficiary ONLY']//following::img[@src='./assets/images/infoIcon.png'][1]");

public WebElement infoOnlineSubmission()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoOnlineSubmission));
	  return Driver.findElement(infoOnlineSubmission);
}

public WebElement OnlineSubmission()
{
	wait.until(ExpectedConditions.elementToBeClickable(OnlineSubmission));
	  return Driver.findElement(OnlineSubmission);
}
public WebElement SPpageheading()
{
	wait.until(ExpectedConditions.elementToBeClickable(SPpageheading));
	  return Driver.findElement(SPpageheading);
}
}
