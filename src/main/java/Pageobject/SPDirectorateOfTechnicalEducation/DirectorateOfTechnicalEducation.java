package Pageobject.SPDirectorateOfTechnicalEducation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DirectorateOfTechnicalEducation{
public WebDriver Driver;
WebDriverWait wait;
	
	

public DirectorateOfTechnicalEducation(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//UT Chandigarh Stipend Scheme of Govt. ITI
By UTChandigarh  =By.xpath("//h4[normalize-space()='UT Chandigarh Stipend Scheme of Govt. ITI']");


//UT Chandigarh Stipend Scheme of Govt. ITI
By infoUTChandigarh  =By.xpath("//h4[normalize-space()='UT Chandigarh Stipend Scheme of Govt. ITI']//following::img[@src='./assets/images/infoIcon.png'][1]");


public WebElement infoUTChandigarh()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoUTChandigarh));
	  return Driver.findElement(infoUTChandigarh);
}

public WebElement UTChandigarh()
{
	wait.until(ExpectedConditions.elementToBeClickable(UTChandigarh));
	  return Driver.findElement(UTChandigarh);
}

}
