package Pageobject.SPHaryanaShahariVikasPradhikaran;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HaryanaShahariVikasPradhikaran {
public WebDriver Driver;
WebDriverWait wait;
	
	

public HaryanaShahariVikasPradhikaran(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//HSVP - Non Encumbrances Certificate
By NonEncumbrances =By.xpath("//h4[normalize-space()='HSVP - Non Encumbrances Certificate']");

//HSVP Water application
By Waterapplication=By.xpath("//h4[normalize-space()='HSVP Water application']");

//HSVP - No Dues Certificate
By DuesCertificate=By.xpath("//h4[normalize-space()='HSVP - No Dues Certificate']");

//HSVP - Non Encumbrances Certificate
By infoNonEncumbrances =By.xpath("//h4[normalize-space()='HSVP - Non Encumbrances Certificate']//following::img[@src='./assets/images/infoIcon.png'][1]");

//HSVP Water application
By infoWaterapplication=By.xpath("//h4[normalize-space()='HSVP Water application']//following::img[@src='./assets/images/infoIcon.png'][1]");

//HSVP - No Dues Certificate
By infoDuesCertificate=By.xpath("//h4[normalize-space()='HSVP - No Dues Certificate']//following::img[@src='./assets/images/infoIcon.png'][1]");

public WebElement infoDuesCertificate()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoDuesCertificate));
	  return Driver.findElement(infoDuesCertificate);
}
public WebElement infoNonEncumbrances()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoNonEncumbrances));
	  return Driver.findElement(infoNonEncumbrances);
}
public WebElement infoWaterapplication()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoWaterapplication));
	  return Driver.findElement(Waterapplication);
}

public WebElement DuesCertificate()
{
	wait.until(ExpectedConditions.elementToBeClickable(DuesCertificate));
	  return Driver.findElement(DuesCertificate);
}
public WebElement NonEncumbrances()
{
	wait.until(ExpectedConditions.elementToBeClickable(NonEncumbrances));
	  return Driver.findElement(NonEncumbrances);
}
public WebElement Waterapplication()
{
	wait.until(ExpectedConditions.elementToBeClickable(Waterapplication));
	  return Driver.findElement(Waterapplication);
}

}
