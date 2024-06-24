package Pageobject.SPPublicHealthEngineeringDepartmentHaryana;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PublicHealthEngineeringDepartmentHaryana{
public WebDriver Driver;
WebDriverWait wait;
	
	

public PublicHealthEngineeringDepartmentHaryana(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Lodge Complaint for Water/Sewer on Shikayat Nivaran Kendra of Public Health Engineering Department(PHED)
By ShikayatNivaran =By.xpath("//h4[normalize-space()='Lodge Complaint for Water/Sewer on Shikayat Nivaran Kendra of Public Health Engineering Department(PHED)']");


//Apply New Water/Sewer Connection in Public Health Engineering Department (PHED)
By PublicHealth=By.xpath("//h4[normalize-space()='Apply New Water/Sewer Connection in Public Health Engineering Department (PHED)']");


//Seeinfo
By  infoShikayatNivaran=By.xpath("//h4[normalize-space()='Lodge Complaint for Water/Sewer on Shikayat Nivaran Kendra of Public Health Engineering Department(PHED)']//following::img[@src='./assets/images/infoIcon.png'][1]");

By infoPublicHealth=By.xpath("//h4[normalize-space()='Apply New Water/Sewer Connection in Public Health Engineering Department (PHED)']//following::img[@src='./assets/images/infoIcon.png'][1]");

public WebElement infoShikayatNivaran()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoShikayatNivaran));
	  return Driver.findElement(infoShikayatNivaran);
}
public WebElement PublicHealth()
{
	wait.until(ExpectedConditions.elementToBeClickable(PublicHealth));
	  return Driver.findElement(PublicHealth);
}

public WebElement ShikayatNivaran()
{
	wait.until(ExpectedConditions.elementToBeClickable(ShikayatNivaran));
	  return Driver.findElement(ShikayatNivaran);
}

public WebElement infoPublicHealth()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoPublicHealth));
	  return Driver.findElement(infoPublicHealth);
}

}
