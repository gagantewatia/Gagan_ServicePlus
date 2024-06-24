package Pageobject.SPPunjabEngineeringCollege;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PunjabEngineeringCollege{
public WebDriver Driver;
WebDriverWait wait;
	
	

public PunjabEngineeringCollege(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//UT Chandigarh Institute Fellowship Scheme for PhD
By ChandigarhInstitute =By.xpath("//h4[normalize-space()='UT Chandigarh Institute Fellowship Scheme for PhD']");

//UT Chandigarh Institute Fellowship Scheme for PhD
By infoChandigarhInstitute =By.xpath("//h4[normalize-space()='UT Chandigarh Institute Fellowship Scheme for PhD']//following::img[@src='./assets/images/infoIcon.png'][1]");

public WebElement infoChandigarhInstitute()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoChandigarhInstitute));
	  return Driver.findElement(infoChandigarhInstitute);
}
public WebElement ChandigarhInstitute()
{
	wait.until(ExpectedConditions.elementToBeClickable(ChandigarhInstitute));
	  return Driver.findElement(ChandigarhInstitute);
}
}
