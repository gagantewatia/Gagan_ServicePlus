package Pageobject.SPTourismMeghalaya;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TourismMeghalaya{
public WebDriver Driver;
WebDriverWait wait;
	
	

public TourismMeghalaya(WebDriver Driver){
	this.Driver= Driver;
	wait =new WebDriverWait(Driver, Duration.ofSeconds(20));
	
	
}
//License to Work as a Factory
By Provisional =By.xpath("//h4[normalize-space()='Application Form for Recognition as Provisional/ Approved Meghalaya State Tour Operator']");




//Seeinfo
//Development of Minor Irrigation
By  infoProvisional=By.xpath("//h4[normalize-space()='Application Form for Recognition as Provisional/ Approved Meghalaya State Tour Operator']//following::img[@src='./assets/images/infoIcon.png'][1]");


public WebElement infoProvisional()
{
	wait.until(ExpectedConditions.elementToBeClickable(infoProvisional));
	  return Driver.findElement(infoProvisional);
}
public WebElement Provisional()
{
	wait.until(ExpectedConditions.elementToBeClickable(Provisional));
	  return Driver.findElement(Provisional);
}



}
