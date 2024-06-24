package Pageobject.SPHaryanaVeterinaryCouncil;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HaryanaVeterinaryCouncil{
public WebDriver Driver;
WebDriverWait wait;
	
	

public HaryanaVeterinaryCouncil(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Application for New Registration of Veterinary Practitioner
By Veterinary =By.xpath("//h4[normalize-space()='Application for New Registration of Veterinary Practitioner']");

//Application for New Registration of Veterinary Practitioner
By infoVeterinary =By.xpath("//h4[normalize-space()='Application for New Registration of Veterinary Practitioner']//following::img[@src='./assets/images/infoIcon.png'][1]");



public WebElement infoVeterinary()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoVeterinary));
	  return Driver.findElement(infoVeterinary);
}


public WebElement Veterinary()
{
	wait.until(ExpectedConditions.elementToBeClickable(Veterinary));
	  return Driver.findElement(Veterinary);
}

}
