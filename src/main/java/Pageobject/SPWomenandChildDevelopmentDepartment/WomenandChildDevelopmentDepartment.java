package Pageobject.SPWomenandChildDevelopmentDepartment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WomenandChildDevelopmentDepartment{
public WebDriver Driver;
WebDriverWait wait;
	
	

public WomenandChildDevelopmentDepartment(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//Mukhya Mantri Matritva Sahayata Yojana
By SahayataYojana =By.xpath("//h4[normalize-space()='Mukhya Mantri Matritva Sahayata Yojana']");

//Mukhya Mantri Matritva Sahayata Yojana
By infoSahayataYojana =By.xpath("//h4[normalize-space()='Mukhya Mantri Matritva Sahayata Yojana']//following::img[@src='./assets/images/infoIcon.png'][1]");

public WebElement infoSahayataYojana()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoSahayataYojana));
	  return Driver.findElement(infoSahayataYojana);
}
public WebElement SahayataYojana()
{
	wait.until(ExpectedConditions.elementToBeClickable(SahayataYojana));
	  return Driver.findElement(SahayataYojana);
}
}
